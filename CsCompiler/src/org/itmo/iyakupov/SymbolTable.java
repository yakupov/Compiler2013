package org.itmo.iyakupov;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.itmo.iyakupov.components.Variable;


public class SymbolTable {

    private final ErrorProcessor errors;
    //private final SystemCalls systemCalls = SystemCalls.getInstance();
    private final List<Map<String, Symbol>> symbolTable;
    private final List<Map<String, Integer>> name2StackId;
    private final List<Loop> loops;
    private final SymbolTable parentSymbolTable;

    private boolean isMainDeclared;
    private int nextId;

    public final static String MAIN = "main";
    public final static String STDIN = "stdin";
    public final static String STDOUT = "stdout";

    public SymbolTable(ErrorProcessor errors) {
        this.name2StackId = null;
        this.symbolTable = new ArrayList<Map<String, Symbol>>();
        this.errors = errors;
        this.loops = new ArrayList<Loop>();
        this.parentSymbolTable = null;
    }

    public SymbolTable(SymbolTable parentSymbolTable) {
        this.name2StackId = new ArrayList<Map<String, Integer>>();
        this.symbolTable = new ArrayList<Map<String, Symbol>>();
        this.errors = parentSymbolTable.errors;
        this.loops = new ArrayList<Loop>();
        this.parentSymbolTable = parentSymbolTable;
    }

    public int getNextId() {
        return nextId++;
    }

    public void newBlock() {
        symbolTable.add(new HashMap<String, Symbol>());
        if (name2StackId != null) {
            name2StackId.add(new HashMap<String, Integer>());
        }
    }

    public void endBlock(int line) {
        int index = blockIndex();
        errors.assertTrue(index >= 0, line, "Number of blocks");
        symbolTable.remove(index);
        if (name2StackId != null) {
            name2StackId.remove(index);
        }
    }

    public void addVariable(Variable Variable) {
        String name = Variable.getName();
        Map<String, Symbol> block = symbolTable.get(blockIndex());
        if (block.containsKey(name)  ){ //|| systemCalls.isSystemCall(name)) { //TODO
            errors.fail(Variable.getLine(), String.format("Duplicated variable: %s", name));
        }
        block.put(name, new VariableSymbol(Variable));
        if (name2StackId != null) {
            Map<String, Integer> table = name2StackId.get(blockIndex());
            table.put(name, table.size());
        }
    }

    public int getVariableId(Variable Variable, int line) {
        return getVariableId(Variable.getName(), line);
    }

    public int getVariableId(String name, int line) {
        errors.assertTrue(!isGlobalVar(name, line), line, String.format("%s cannot be global", name));
        for (int i = blockIndex(); i >= 0; --i) {
            Integer id = name2StackId.get(i).get(name);
            if (id != null) {
                return id;
            }
        }
        //errors.fail(line, String.format("Cannot find %s variable", name));
        return -1;
    }

    public boolean isGlobalVar(Variable Variable, int line) {
        return isGlobalVar(Variable.getName(), line);
    }

    @Deprecated
    public boolean isGlobalVar(String name, int line) {
		return isMainDeclared;
    	/*
        if (isGlobalSymbolTable()) {
            errors.assertEquals(0, blockIndex(), line, "Global has only one level");
            return symbolTable.get(0).containsKey(name);
        }
        for (int i = blockIndex(); i >= 0; --i) {
            if (symbolTable.get(i).containsKey(name)) {
                return false;
            }
        }
        errors.assertTrue(parentSymbolTable != null, line, "Not global symbol table has parent table");
        SymbolTable current = getGlobalSymbolTable();
        return current.isGlobalVar(name, line);
        */
    }

    private SymbolTable getGlobalSymbolTable() {
        SymbolTable current = this;
        while (current.parentSymbolTable != null) {
            current = current.parentSymbolTable;
        }
        return current;
    }

    private boolean isGlobalSymbolTable() {
        return name2StackId == null;
    }

    public void addStub() {
    	
        symbolTable.get(blockIndex()).put("args", null);
        name2StackId.get(blockIndex()).put("args", 0);
        
    }

    public Variable getVariable(String name, int line) {
        for (int i = blockIndex(); i >= 0; --i) {
        	for (Entry<String, Symbol> e : symbolTable.get(i).entrySet()) {
        		if (e.getKey().equals(name) && e.getValue() instanceof VariableSymbol)
                    return (Variable) e.getValue().getCode();
        	}
        }
        SymbolTable globalSymbolTable = getGlobalSymbolTable();
        if (globalSymbolTable != this) {
            return globalSymbolTable.getVariable(name, line);
        }
        errors.fail(line, String.format("Can not find variable: %s", name));
        return null;
    }

    private int blockIndex() {
        return symbolTable.size() - 1;
    }

/*    
    public Function getFunction(String name, int line) {
        Optional<Symbol> optional = getGlobalSymbolTable().symbolTable.get(0).entrySet().stream()
                .filter(entry -> entry.getKey().equals(name))
                .filter(entry -> entry.getValue() instanceof FunctionSymbol)
                .map(entry -> entry.getValue())
                .findFirst();
        if (optional.isPresent()) {
            return (Function) optional.get().getCode();
        } else {
            errors.fail(line, String.format("Can not find function: %s", name));
            return null;
        }
    }


    public boolean isMainDeclared() {
        return isMainDeclared;
    }

    public Variable addVariable(Tree tree, ErrorProcessor ErrorProcessor, SymbolTable table) {
        Variable Variable = new Variable(tree, ErrorProcessor, table);

        Map<String, Symbol> block = symbolTable.get(blockIndex());
        String name = Variable.getName();
        if (block.containsKey(name) || systemCalls.isSystemCall(name)) {
            errors.fail(tree.getLine(), String.format("Duplicated variable: %s", name));
        }
        block.put(name, new VariableSymbol(Variable));
        if (name2StackId != null) {
            Map<String, Integer> map = name2StackId.get(blockIndex());
            map.put(name, map.size());
        }
        return Variable;
    }
    
    public Function addFunction(Tree tree, ErrorProcessor ErrorProcessor, SymbolTable table) {
        Function function = new Function(tree, ErrorProcessor, table);

        String name = function.getFunctionName();
        Type type = function.getReturnType();
        errors.assertTrue(blockIndex() == 0, tree.getLine(), String.format("Invalid function declaration: %s", name));
        Map<String, Symbol> block = symbolTable.get(0);
        if (block.containsKey(name) || systemCalls.isSystemCall(name)) {
            errors.fail(tree.getLine(), String.format("Duplicated function: %s", name));
        }
        block.put(name, new FunctionSymbol(type, function));
        if (name.equals(MAIN)) {
            isMainDeclared = true;
            errors.assertTrue(type == Type.INT, tree.getLine(), String.format("main returns not int value"));
        }
        return function;
    }

    public GlobalVariable addGlobalVariable(Tree tree, ErrorProcessor ErrorProcessor, SymbolTable table) {
        errors.assertTrue(isGlobalSymbolTable(), tree.getLine(), "Invalid global variable declaration");
        GlobalVariable Variable = new GlobalVariable(tree, ErrorProcessor, table);

        Map<String, Symbol> block = symbolTable.get(blockIndex());
        String name = Variable.getName();
        if (block.containsKey(name) || STDIN.equals(name) || STDOUT.equals(name)) {
            errors.fail(tree.getLine(), String.format("Duplicated variable: %s", name));
        }
        block.put(name, new VariableSymbol(Variable));
        return Variable;
    }
*/
    public Loop beginLoop(String label) {
        Loop loop = new Loop(label);
        loops.add(loop);
        return loop;
    }

    public Loop getClosestLoop() {
        return loops.isEmpty() ? null : loops.get(loops.size() - 1);
    }

    public void endLoop() {
        loops.remove(loops.size() - 1);
    }

    public class Loop {

        private final String loopBegin;
        private final String loopAction;
        private final String loopEnd;

        private Loop(String label) {
            int loopId = getNextId();
            loopBegin = String.format("%s_begin_%d", label, loopId);
            loopAction = String.format("%s_action_%d", label, loopId);
            loopEnd = String.format("%s_end_%d", label, loopId);
        }

        public String getBegin() {
            return loopBegin;
        }

        public String getAction() {
            return loopAction;
        }

        public String getEnd() {
            return loopEnd;
        }
    }
}
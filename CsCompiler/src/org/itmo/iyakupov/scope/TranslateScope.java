package org.itmo.iyakupov.scope;

import org.itmo.iyakupov.CompileException;
import org.objectweb.asm.Label;
import org.objectweb.asm.Type;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class TranslateScope implements Scope {
	private class Namespace {
	    private final Map<FunctionSignature, Type> functions = new HashMap<FunctionSignature, Type>();
	    private final Map<String, LocalVariableDescriptor> local = new HashMap<String, LocalVariableDescriptor>();
	}
	
    private String className;
    private String methodName;
    private Type methodType;
    private byte[] byteCode;
    //private Map<String, Type> global = new HashMap<String, Type>();
    private Map<String, Namespace> classes = new HashMap<String, Namespace>();

    private Stack<LoopDescriptor> loop = new Stack<LoopDescriptor>();
    private List<Map<String, LocalVariableDescriptor>> localVars = new ArrayList<Map<String, LocalVariableDescriptor>>(); 

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public byte[] getByteCode() {
        return byteCode;
    }

    public void setByteCode(byte[] byteCode) {
        this.byteCode = byteCode;
    }
    
    public Namespace addClass(String className) {
    	if (classes.containsKey(className)) {
    		throw new CompileException("Trying to redefine class " + className);
    	}
    	this.className = className;
    	Namespace ns = new Namespace();
    	//localVars.add(ns.local);
    	classes.put(className, ns);
    	return ns;
    }

    public Namespace getClass(String className) {
    	if (!classes.containsKey(className)) {
    		throw new CompileException("Trying to access non-existing class " + className);
    	}
    	return classes.get(className);
    }
    
    public void endBlock() {
    	localVars.remove(localVars.size() - 1);
    }
    
    public void newBlock() {
    	localVars.add(new HashMap<String, LocalVariableDescriptor>());
    }
    
/*
    public void addGlobalVariable(String name, Type type) {
        global.put(name, type);
    }

    public Map<String, Type> getGlobalVariables() {
        return Collections.unmodifiableMap(global);
    }

    public boolean isGlobalVariable(String name) {
        return global.containsKey(name);
    }

    public Type getGlobalVariableType(String name) {
        return global.get(name);
    }
*/
    public void refreshLocalVariables() {
    	localVars.get(localVars.size() - 1).clear();
    }

    private LocalVariableDescriptor getVariable(String name) {
    	for (int i = localVars.size() - 1; i >= 0; i--) {
    		if (localVars.get(i).containsKey(name)) {
    			return localVars.get(i).get(name);
    		}
    	}
    	if (className != null) {
    		if (classes.get(className).local.containsKey(name))
    			return classes.get(className).local.get(name);
    	}
    	throw new CompileException("No visible variable " + name);
    }
    
    public boolean isLocalVariable(String name) {
    	for (int i = localVars.size() - 1; i >= 0; i--) {
    		if (localVars.get(i).containsKey(name)) {
    			return true;
    		}
    	}
        return false;
    }
    
    public boolean isField(String name) {
    	if (className != null) {
    		if (classes.get(className).local.containsKey(name))
    			return true;
    	}
    	return false;
    }

    public int getLocalVariableIndex(String name) {
    	return getVariable(name).getIndex();
    }

    public Type getLocalVariableType(String name) {
    	return getVariable(name).getType();
    }

    public int addLocalVariable(String name, Type type) {
    	if (localVars.size() == 0) {
   			throw new CompileException("No local variable pool when creating: " + name);
    	}
		if (localVars.get(localVars.size() - 1).containsKey(name)) {
			throw new CompileException("Duplicate variable " + name);				
		}
		int index = localVars.get(localVars.size() - 1).size() + calcLocalVarIndexOffset();
    	localVars.get(localVars.size() - 1).put(name, new LocalVariableDescriptor(index, type));
        return index;
    }
    
    public int addField(String name, Type type) {
    	if (className == null) {
    		throw new CompileException("Null class name when creating a field");
    	}
    	Map<String, LocalVariableDescriptor> currLocal = classes.get(className).local;
    	if (currLocal.containsKey(name)) {
			throw new CompileException("Duplicate field " + name);				
		}
		int index = currLocal.size();
    	currLocal.put(name, new LocalVariableDescriptor(index, type));
        return index;
    }
    
    private int calcLocalVarIndexOffset() {
    	int res = 0;
    	for (int i = localVars.size() - 2; i >= 0; i--) {
    		res += localVars.get(i).size();
    	}
    	return res;
    }

    public boolean isFunctionDeclared(String name, Type[] argumentType) {
        return getClass(className).functions.containsKey(new FunctionSignature(name, argumentType));
    }

    public Type getFunctionReturnType(String name, Type[] argumentType) {
        return getClass(className).functions.get(new FunctionSignature(name, argumentType));
    }

    public void declareFunction(String name, Type resType, Type[] argumentType) {
    	getClass(className).functions.put(new FunctionSignature(name, argumentType), resType);
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }


    public Type getMethodType() {
        return methodType;
    }

    public void setMethodType(Type methodType) {
        this.methodType = methodType;
    }

    public boolean inLoop() {
        return !loop.isEmpty();
    }

    public Label getContinueLabel() {
        return loop.peek().getContinueLabel();
    }

    public Label getBreakLabel() {
        return loop.peek().getBreakLabel();
    }

    public void enterLoop(Label continueLabel, Label breakLabel) {
        loop.push(new LoopDescriptor(continueLabel, breakLabel));
    }

    public void exitLoop() {
        loop.pop();
    }
}

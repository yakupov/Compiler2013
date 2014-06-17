package org.itmo.iyakupov.scope;

import org.objectweb.asm.Label;
import org.objectweb.asm.Type;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class TranslateScope implements Scope {
    private String className;
    private String methodName;
    private Type methodType;
    private byte[] byteCode;
    //private Map<String, Type> global = new HashMap<String, Type>();
    private Map<FunctionSignature, Type> functions = new HashMap<FunctionSignature, Type>();
    private Map<String, LocalVariableDescriptor> local = new HashMap<String, LocalVariableDescriptor>();
    private Stack<LoopDescriptor> loop = new Stack<LoopDescriptor>();

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
        local.clear();
    }

    public boolean isLocalVariable(String name) {
        return local.containsKey(name);
    }

    public int getLocalVariableIndex(String name) {
        return local.get(name).getIndex();
    }

    public Type getLocalVariableType(String name) {
        return local.get(name).getType();
    }

    public int addLocalVariable(String name, Type type) {
        local.put(name, new LocalVariableDescriptor(local.size(), type));
        return local.size() - 1;
    }

    public boolean isFunctionDeclared(String name, Type[] argumentType) {
        return functions.containsKey(new FunctionSignature(name, argumentType));
    }

    public Type getFunctionReturnType(String name, Type[] argumentType) {
        return functions.get(new FunctionSignature(name, argumentType));
    }

    public void declareFunction(String name, Type resType, Type[] argumentType) {
        functions.put(new FunctionSignature(name, argumentType), resType);
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

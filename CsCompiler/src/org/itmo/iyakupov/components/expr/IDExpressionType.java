package org.itmo.iyakupov.components.expr;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.itmo.iyakupov.CompileException;
import org.itmo.iyakupov.components.Variable;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Type;

class IDExpressionType extends ExpressionType {
	private final Log log = LogFactory.getLog(getClass());

	private String varName;
	private Variable varDef;

	IDExpressionType(int lexemType, Expression parent) {
		super(lexemType, parent);
	}

/*
	@Override
	public void writeCode(CodeWriter writer) {
		if (scope.isGlobalVar(varName, parent.tree.getStart().getLine())) {
			writer.println("getstatic Main/%s %s", varName,
					getVariable().getType().getDescriptor());
		} else {
			writer.println("%s %s", getType().load(), scope.getVariableId(varName, parent.tree.getStart().getLine()));
		}
	}
*/
	@Override
	public Type getType() {
		if (getVariableName() == null) {
			throw new IllegalStateException("process() was not called : " + parent.tree.getStart().getLine());
		}
		return parent.scope.getLocalVariableType(parent.tree.getText());
	}

	@Override
	public boolean isLValue() {
		return true;
	}

	public String getVariableName() {
		return parent.tree.getText();
	}

	@Override
	public void compile(MethodVisitor mv) {
		String var = getVariableName();
        Type type;
        //FIXME
        /*
        if (parent.className != null) {
	        mv.visitVarInsn(ALOAD, 0);
	        //log.trace(var + ' ' + parent.className + ' ' + getType().getDescriptor());
			mv.visitFieldInsn(GETFIELD, parent.className, var, getType().getDescriptor());
        } else */if (parent.scope.isLocalVariable(var)) {
            type = parent.scope.getLocalVariableType(var);
            mv.visitVarInsn(ExpressionType.isPrimitiveType(type) ? ILOAD : ALOAD, parent.scope.getLocalVariableIndex(var));
        } else if (parent.scope.isField(var)) {
	        mv.visitVarInsn(ALOAD, 0);
	        log.trace(var + ' ' + parent.scope.getClassName() + ' ' + getType().getDescriptor());
	        mv.visitFieldInsn(GETFIELD, parent.scope.getClassName(), var, getType().getDescriptor());
        } else {
            throw new CompileException(String.format("Variable %s not found in context", var));
        }
		
	}
}
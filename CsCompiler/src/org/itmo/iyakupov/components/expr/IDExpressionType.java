package org.itmo.iyakupov.components.expr;

import org.antlr.v4.runtime.ParserRuleContext;
import org.itmo.iyakupov.CompileException;
import org.itmo.iyakupov.ErrorProcessor;
import org.itmo.iyakupov.components.Variable;
import org.itmo.iyakupov.scope.TranslateScope;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Type;

final class IDExpressionType extends ExpressionType {
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
		String var = parent.tree.getText();
        Type type;
        //FIXME
        if (parent.className != null) {
	        mv.visitVarInsn(ALOAD, 0);
			mv.visitFieldInsn(GETFIELD, parent.className, getVariableName(), getType().getDescriptor());
        } else 
        if (parent.scope.isLocalVariable(var)) {
            type = parent.scope.getLocalVariableType(var);
            mv.visitVarInsn(ExpressionType.isPrimitiveType(type) ? ILOAD : ALOAD, parent.scope.getLocalVariableIndex(var));
        } else {
            throw new CompileException(String.format("Variable %s not found in context %s.", var, parent.tree.getText()));
        }
		
	}
}
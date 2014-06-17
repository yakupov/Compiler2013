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
	private ErrorProcessor errors;
	private TranslateScope scope;
	private ParserRuleContext tree;

	IDExpressionType(int lexemType, ErrorProcessor errors, TranslateScope scope, ParserRuleContext tree) {
		super(lexemType);
        this.errors = errors;
        this.scope = scope;
        this.tree = tree;
	}

/*
	@Override
	public void writeCode(CodeWriter writer) {
		if (scope.isGlobalVar(varName, tree.getStart().getLine())) {
			writer.println("getstatic Main/%s %s", varName,
					getVariable().getType().getDescriptor());
		} else {
			writer.println("%s %s", getType().load(), scope.getVariableId(varName, tree.getStart().getLine()));
		}
	}
*/
	@Override
	public Type getType() {
		if (getVariableName() == null) {
			throw new IllegalStateException("process() was not called : " + tree.getStart().getLine());
		}
		return scope.getLocalVariableType(tree.getText());
	}

	@Override
	public boolean isLValue() {
		return true;
	}

	public String getVariableName() {
		return tree.getText();
	}

	@Override
	public void compile(MethodVisitor mv) {
		String var = tree.getText();
        Type type;
        if (scope.isLocalVariable(var)) {
            type = scope.getLocalVariableType(var);
            mv.visitVarInsn(ExpressionType.isPrimitiveType(type) ? ILOAD : ALOAD, scope.getLocalVariableIndex(var));
        } else {
            throw new CompileException(String.format("Variable %s not found in context %s.", var, tree.getText()));
        }
		
	}
}
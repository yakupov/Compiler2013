package org.itmo.iyakupov.components;

import org.antlr.v4.runtime.ParserRuleContext;
import org.itmo.iyakupov.ErrorProcessor;
import org.itmo.iyakupov.MethodResident;
import org.itmo.iyakupov.components.expr.Expression;
import org.itmo.iyakupov.components.expr.ExpressionType;
import org.itmo.iyakupov.scope.TranslateScope;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;

public class ReturnStatement implements Opcodes, MethodResident {
	protected Expression initExpression;
	private Type returnType;
	
	public ReturnStatement(ParserRuleContext tree, ErrorProcessor errors, TranslateScope scope, Type returnType) {
		if (tree.getChildCount() > 0) {
			initExpression = new Expression(tree.getRuleContext(ParserRuleContext.class, 0), errors, scope, null);
		}
		this.returnType = returnType;
	}
	
	@Override
	public void compile(MethodVisitor mv) {
		if (initExpression != null) {
			initExpression.compile(mv);
			System.err.println(Type.BOOLEAN_TYPE.toString());
			ExpressionType.typeCheck(initExpression.getType(), returnType);
		}
		mv.visitInsn(IRETURN);
	}
/*
	public Expression getExpression() {
		return initExpression;
	}

*/
}

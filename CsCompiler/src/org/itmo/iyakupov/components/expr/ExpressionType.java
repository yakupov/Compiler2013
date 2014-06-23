package org.itmo.iyakupov.components.expr;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.itmo.iyakupov.CompileException;
import org.itmo.iyakupov.MethodResident;
import org.itmo.iyakupov.a4autogen.CsLexer;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;

public abstract class ExpressionType implements Opcodes, MethodResident {
	protected final int lexemType;
	protected final Expression parent;

	public ExpressionType(int lexemType, Expression parent) {
		this.lexemType = lexemType;
		this.parent = parent;
	}

	public abstract Type getType();

	public boolean isLValue() {
		return
				lexemType == CsLexer.ASSIGN ||
				lexemType == CsLexer.ADD_ASS ||
				lexemType == CsLexer.SUB_ASS ||
				lexemType == CsLexer.MUL_ASS ||
				lexemType == CsLexer.DIV_ASS ||
				lexemType == CsLexer.XOR_ASS ||
				lexemType == CsLexer.OR_ASS ||
				lexemType == CsLexer.AND_ASS ||
				lexemType == CsLexer.REM_ASS ||
				lexemType == CsLexer.LSHIFT_ASS ||
				lexemType == CsLexer.RSHIFT_ASS ||
				lexemType == CsLexer.INCREMENT ||
				lexemType == CsLexer.DECREMENT;
	}
	
	public static boolean isPrimitiveType(Type type) {
		return type.getSort() < 10;
	}
	
	public static void typeCheck(Expression expression1, Expression expression2) {
		/*
		Log log = LogFactory.getLog(ExpressionType.class);
		log.trace(expression1.getExpressionType().getClass().getName());
		log.trace(expression1.getExpressionType().getType());
		log.trace(expression2.getExpressionType().getClass().getName());
		log.trace(expression2.getExpressionType().getType());
		*/
		typeCheck(expression1.getType(), expression2.getType());
	}
	
	public static void typeCheck(Type t1, Type t2) {
		if (t1 != t2) {
        	throw new CompileException(String.format("Type mismatch: %s %s", t1, t2));
        }
	}
}
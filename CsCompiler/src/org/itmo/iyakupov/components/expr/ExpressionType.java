package org.itmo.iyakupov.components.expr;

import org.itmo.iyakupov.MethodResident;
import org.itmo.iyakupov.a4autogen.CsLexer;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;

public abstract class ExpressionType implements Opcodes, MethodResident {
	protected final int lexemType;

	public ExpressionType(int lexemType) {
		this.lexemType = lexemType;
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
}
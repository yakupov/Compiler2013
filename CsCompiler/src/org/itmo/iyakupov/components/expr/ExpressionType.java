package org.itmo.iyakupov.components.expr;

import org.itmo.iyakupov.a4autogen.CsLexer;
import org.itmo.iyakupov.components.GenerableCode;
import org.itmo.iyakupov.components.Type;

public abstract class ExpressionType implements GenerableCode{
	protected final int lexemType;

	public ExpressionType(int lexemType) {
		this.lexemType = lexemType;
	}

	public abstract void process();
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
}
package org.itmo.iyakupov.components.expr;

import org.itmo.iyakupov.a4autogen.CsLexer;
import org.itmo.iyakupov.components.GenerableCode;
import org.itmo.iyakupov.components.Type;

public abstract class ExpressionType implements GenerableCode{
    final int lexemType;

    public ExpressionType(int lexemType) {
        this.lexemType = lexemType;
    }

    public abstract void process();
    public abstract Type getType();

    public boolean isLValue() {
        return
                lexemType == CsLexer.ASSIGN ||
                lexemType == CsLexer.ASSIGN_AND_MODIFY_OPERATOR ||
                lexemType == CsLexer.INCREMENT ||
                lexemType == CsLexer.DECREMENT;
    }
}
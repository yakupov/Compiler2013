package org.itmo.iyakupov.components.expr;

import org.antlr.v4.runtime.ParserRuleContext;
import org.itmo.iyakupov.ErrorProcessor;
import org.itmo.iyakupov.a4autogen.CsLexer;
import org.itmo.iyakupov.a4autogen.CsParser;
import org.itmo.iyakupov.scope.TranslateScope;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Type;

public abstract class BinaryOperationExpressionType extends ExpressionType {
	protected Expression expression1;
	protected Expression expression2;

    public BinaryOperationExpressionType(int lexemType, Expression parent) {
        super(lexemType, parent);
    }

    public abstract String operation();
    public abstract int opCode();


    @Override
    public void compile(MethodVisitor mv) {
        parent.errors.assertEquals(3, parent.tree.getChildCount(), parent.tree.getStart().getLine(), "BinOp " + parent.tree.getText());
        expression1 = new Expression(parent.tree.getRuleContext(ParserRuleContext.class, 0), parent.errors, parent.scope, parent.className);
        expression2 = new Expression(parent.tree.getRuleContext(ParserRuleContext.class, 1), parent.errors, parent.scope, parent.className);

    	expression1.compile(mv);
    	expression2.compile(mv);
    	mv.visitInsn(opCode());
    }
    
    @Override
    public Type getType() {
        return expression1.getType();
    }
}

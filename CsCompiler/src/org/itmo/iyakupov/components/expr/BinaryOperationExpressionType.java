package org.itmo.iyakupov.components.expr;

import org.antlr.v4.runtime.ParserRuleContext;
import org.itmo.iyakupov.ErrorProcessor;
import org.itmo.iyakupov.scope.TranslateScope;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Type;

public abstract class BinaryOperationExpressionType extends ExpressionType {
	protected Expression expression1;
	protected Expression expression2;
    protected ErrorProcessor errors;
	protected TranslateScope scope;
	protected ParserRuleContext tree;

    public BinaryOperationExpressionType(int lexemType, ErrorProcessor errors, TranslateScope scope, ParserRuleContext tree) {
        super(lexemType);
        this.errors = errors;
        this.scope = scope;
        this.tree = tree;
    }

    public abstract String operation();
    public abstract int opCode();


    @Override
    public void compile(MethodVisitor mv) {
        errors.assertEquals(3, tree.getChildCount(), tree.getStart().getLine(), "BinOp");
        expression1 = new Expression(tree.getRuleContext(ParserRuleContext.class, 0), errors, scope);
        expression2 = new Expression(tree.getRuleContext(ParserRuleContext.class, 2), errors, scope);

    	expression1.compile(mv);
    	expression2.compile(mv);
    	mv.visitInsn(opCode());
    }
    
    @Override
    public Type getType() {
        return expression1.getType();
    }
}

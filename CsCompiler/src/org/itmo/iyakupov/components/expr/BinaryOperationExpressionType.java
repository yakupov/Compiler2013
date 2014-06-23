package org.itmo.iyakupov.components.expr;

import org.antlr.v4.runtime.ParserRuleContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.itmo.iyakupov.CompileException;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Type;

public abstract class BinaryOperationExpressionType extends ExpressionType {
	private final Log log = LogFactory.getLog(getClass());
	
	protected Expression expression1;
	protected Expression expression2;

    public BinaryOperationExpressionType(int lexemType, Expression parent) {
        super(lexemType, parent);
        //expression1 = new Expression(parent.tree.getRuleContext(ParserRuleContext.class, 0), parent.errors, parent.scope, parent.className);
        //expression2 = new Expression(parent.tree.getRuleContext(ParserRuleContext.class, 1), parent.errors, parent.scope, parent.className);
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
    	
        typeCheck(expression1, expression2);
    	
    	mv.visitInsn(opCode());
    }
    
    @Override
    public Type getType() {
    	/*
    	log.trace(expression1 + "");
    	log.trace(expression2 + "");
    	log.trace(expression1.getExpressionType().getClass().getName());
		log.trace(expression1.getExpressionType().getType());
		log.trace(expression2.getExpressionType().getClass().getName());
		log.trace(expression2.getExpressionType().getType());
    	*/
        return expression1.getType();
    }
}

package org.itmo.iyakupov.components.expr;

import org.antlr.v4.runtime.ParserRuleContext;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Type;

public abstract class ComparasionOperationExpressionType extends BinaryOperationExpressionType {
    public ComparasionOperationExpressionType(int lexemType, Expression parent) {
        super(lexemType, parent);
    }

    @Override
    public void compile(MethodVisitor mv) {
    	expression1 = new Expression(parent.tree.getRuleContext(ParserRuleContext.class, 0), parent.errors, parent.scope, parent.className);
        expression2 = new Expression(parent.tree.getRuleContext(ParserRuleContext.class, 2), parent.errors, parent.scope, parent.className);
        // compiles e1, e2, and adds the instructions to compare the two values
    	expression1.compile(mv);
    	expression2.compile(mv);   	
        Label iftrue = new Label();
        Label end = new Label();
        mv.visitJumpInsn(opCode(), iftrue);
        // case where e1 <= e2 : pushes false and jump to "end"
        mv.visitLdcInsn(new Integer(0));
        mv.visitJumpInsn(GOTO, end);
        // case where e1 > e2 : pushes true
        mv.visitLabel(iftrue);
        mv.visitLdcInsn(new Integer(1));
        mv.visitLabel(end);
    }

    @Override
    public Type getType() {
        return Type.BOOLEAN_TYPE;
    	//return Type.getType("BOOLEAN");
    }
}

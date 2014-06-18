package org.itmo.iyakupov.components.expr;

import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;

public abstract class ComparasionOperationExpressionType extends BinaryOperationExpressionType {
    public ComparasionOperationExpressionType(int lexemType, Expression parent) {
        super(lexemType, parent);
    }

    @Override
    public void compile(MethodVisitor mv) {
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

}

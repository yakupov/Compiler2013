package org.itmo.iyakupov.components.expr;

import org.antlr.v4.runtime.ParserRuleContext;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Type;

public abstract class LValueAssignExpressionType extends ExpressionType {
    Expression expression1;
    Expression expression2;

    public LValueAssignExpressionType(int lexemType, Expression parent) {
        super(lexemType, parent);
    }

    public abstract String operation();
    public abstract int opCode();

    @Override
    public boolean isLValue() {
        return true;
    }

    @Override
    public void compile(MethodVisitor mv) {
        parent.errors.assertEquals(3, parent.tree.getChildCount(), parent.tree.getStart().getLine(), "LValueAssign");
        expression1 = new Expression(parent.tree.getRuleContext(ParserRuleContext.class, 0), parent.errors, parent.scope, parent.className);
        expression2 = new Expression(parent.tree.getRuleContext(ParserRuleContext.class, 2), parent.errors, parent.scope, parent.className);
        
    	expression1.compile(mv);
    	expression2.compile(mv);
    	
        typeCheck(expression1, expression2);
    	
    	mv.visitInsn(opCode());
    	mv.visitInsn(DUP);
        String varName = expression1.getLValueVariable();
    	assignToVariable(mv, varName);
    }
    
    @Override
    public Type getType() {
        return expression1.getType();
    }
    
	private void assignToVariable(MethodVisitor mv, String varName) {
		if (parent.className != null) {
			mv.visitFieldInsn(PUTFIELD, parent.className, varName, getType().getDescriptor());
		} else {
			if (ExpressionType.isPrimitiveType(getType())) {
				mv.visitVarInsn(ISTORE, parent.scope.getLocalVariableIndex(varName));
			} else {
				mv.visitVarInsn(ASTORE, parent.scope.getLocalVariableIndex(varName));
			}
		}
	}
}

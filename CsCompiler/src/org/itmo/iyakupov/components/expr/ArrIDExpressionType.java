package org.itmo.iyakupov.components.expr;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.ParserRuleContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.itmo.iyakupov.a4autogen.CsParser;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Type;

public class ArrIDExpressionType extends IDExpressionType {
	private final Log log = LogFactory.getLog(getClass());

	private List<Expression> arrArgs = new ArrayList<Expression>();
	
	public ArrIDExpressionType(int lexemType, Expression parent) {
		super(lexemType, parent);
		
		for (ParserRuleContext child: parent.tree.getRuleContexts(ParserRuleContext.class)) {
			log.trace("Constr rule: " + CsParser.ruleNames[child.getRuleIndex()]);
			if (child.getRuleIndex() == CsParser.RULE_arr_arg_suffix) {
				for (ParserRuleContext details : child.getRuleContexts(ParserRuleContext.class)) {
					if (details.getRuleIndex() == CsParser.RULE_argument_expression_list) {
						for (ParserRuleContext arg : details.getRuleContexts(ParserRuleContext.class)) {
							if (arg.getRuleIndex() == CsParser.RULE_assignment_expression) {
								arrArgs.add(new Expression(arg, parent.errors, parent.scope, null));
							}
						}
					}
				}
			} 
		}
	}
	
	@Override
	public void compile(MethodVisitor mv) {
		mv.visitVarInsn(ALOAD, parent.scope.getLocalVariableIndex(getVariableName()));
		for (int i = 0; i < arrArgs.size() - 1; ++i) {
			Expression e = arrArgs.get(i);
			e.compile(mv);
			mv.visitInsn(AALOAD);
		}
		arrArgs.get(arrArgs.size() - 1).compile(mv);
		if (isPrimitiveType(arrArgs.get(arrArgs.size() - 1).getType())) {
			mv.visitInsn(IALOAD);	
		} else {
			mv.visitInsn(AALOAD);
		}
	}
	
	public void compileGetIndex(MethodVisitor mv) {
		mv.visitVarInsn(ALOAD, parent.scope.getLocalVariableIndex(getVariableName()));
		for (int i = 0; i < arrArgs.size() - 1; ++i) {
			Expression e = arrArgs.get(i);
			e.compile(mv);
			mv.visitInsn(AALOAD);
		}
		arrArgs.get(arrArgs.size() - 1).compile(mv);
	}
	

	
	@Override
	public Type getType() {
		if (getVariableName() == null) {
			throw new IllegalStateException("process() was not called : " + parent.tree.getStart().getLine());
		}
		return parent.scope.getLocalVariableType(getVariableName());
	}

	@Override
	public boolean isLValue() {
		return true;
	}

	public String getVariableName() {
		return parent.tree.getToken(CsParser.IDENTIFIER, 0).getText();
	}
}

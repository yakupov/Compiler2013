package org.itmo.iyakupov.components.expr;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.ParserRuleContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.itmo.iyakupov.ErrorProcessor;
import org.itmo.iyakupov.a4autogen.CsLexer;
import org.itmo.iyakupov.a4autogen.CsParser;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Type;

public class PostfixExpression extends ExpressionType {
	private final Log log = LogFactory.getLog(getClass());

	protected Expression primaryExpression;
	protected Expression nextPostfixExpression;
	protected List<Expression> methodArgs = new ArrayList<Expression>();
	protected boolean callMethod = false;
	
	public PostfixExpression(Expression parent) {
		super(CsLexer.DOT, parent);
		
            primaryExpression = new Expression(parent.tree.getRuleContext(ParserRuleContext.class, 0), parent.errors, parent.scope, parent.className);
        if (parent.tree.getTokens(CsLexer.DOT).size() > 0) { //access field
        	for (ParserRuleContext child : parent.tree.getRuleContexts(ParserRuleContext.class)) {
        		if (child.getRuleIndex() == CsParser.RULE_postfix_expression) {
        			nextPostfixExpression = new Expression(child, parent.errors, parent.scope, parent.className);
        		}
        	}
        }
        
        if (parent.tree.getTokens(CsLexer.OPB_RND).size() > 0) { //call method
        	callMethod = true;
        	for (ParserRuleContext child : parent.tree.getRuleContexts(ParserRuleContext.class)) {
        		if (child.getRuleIndex() == CsParser.RULE_argument_expression_list) {
        			for (ParserRuleContext grandChild : child.getRuleContexts(ParserRuleContext.class)) {
                		if (grandChild.getRuleIndex() == CsParser.RULE_assignment_expression) {
                			methodArgs.add(new Expression(grandChild, parent.errors, parent.scope, parent.className));
                		}
                	}
        		}
        	}
        }
    	

        
		log.trace("Constructor call added: " + parent.tree.getText());
	}

	@Override
	public void compile(MethodVisitor mv) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Type getType() {
		// TODO Auto-generated method stub
		return null;
	}


}

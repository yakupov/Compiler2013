package org.itmo.iyakupov.components.expr;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.ParserRuleContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.itmo.iyakupov.ErrorProcessor;
import org.itmo.iyakupov.a4autogen.CsLexer;
import org.itmo.iyakupov.a4autogen.CsParser;
import org.itmo.iyakupov.scope.TranslateScope;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Type;

public class PostfixExpression extends ExpressionType {
	private final Log log = LogFactory.getLog(getClass());

    protected ErrorProcessor errors;
	protected TranslateScope scope;
	protected ParserRuleContext tree;
	protected Expression primaryExpression;
	protected Expression nextPostfixExpression;
	protected List<Expression> methodArgs = new ArrayList<Expression>();
	protected boolean callMethod = false;
	
	public PostfixExpression(ParserRuleContext tree, TranslateScope scope, ErrorProcessor errors) {
		super(CsLexer.DOT);
		
        this.errors = errors;
        this.scope = scope;
        this.tree = tree;	
    
        primaryExpression = new Expression(tree.getRuleContext(ParserRuleContext.class, 0), errors, scope);
        if (tree.getTokens(CsLexer.DOT).size() > 0) { //access field
        	for (ParserRuleContext child : tree.getRuleContexts(ParserRuleContext.class)) {
        		if (child.getRuleIndex() == CsParser.RULE_postfix_expression) {
        			nextPostfixExpression = new Expression(child, errors, scope);
        		}
        	}
        }
        
        if (tree.getTokens(CsLexer.OPB_RND).size() > 0) { //call method
        	callMethod = true;
        	for (ParserRuleContext child : tree.getRuleContexts(ParserRuleContext.class)) {
        		if (child.getRuleIndex() == CsParser.RULE_argument_expression_list) {
        			for (ParserRuleContext grandChild : child.getRuleContexts(ParserRuleContext.class)) {
                		if (grandChild.getRuleIndex() == CsParser.RULE_assignment_expression) {
                			methodArgs.add(new Expression(grandChild, errors, scope));
                		}
                	}
        		}
        	}
        }
    	

        
		log.trace("Constructor call added: " + tree.getText());
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

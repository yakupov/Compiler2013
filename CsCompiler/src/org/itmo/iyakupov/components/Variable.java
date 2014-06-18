package org.itmo.iyakupov.components;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.itmo.iyakupov.ErrorProcessor;
import org.itmo.iyakupov.a4autogen.CsParser;
import org.itmo.iyakupov.components.expr.Expression;
import org.itmo.iyakupov.scope.TranslateScope;
import org.objectweb.asm.Type;

public class Variable  {
	private final Log log = LogFactory.getLog(getClass());
	protected String initOperator; //unused maybe
	protected TranslateScope scope;
	protected Expression initExpression;
	protected String name;
	protected DeclarationSpecifier declarationSpecifier;
	protected final int line;

	public Variable(ParserRuleContext tree, ParserRuleContext declarationSpecifierTree, 
			TranslateScope st, ErrorProcessor errorProcessor, String className) {
		this.scope = st;
		declarationSpecifier = new DeclarationSpecifier(declarationSpecifierTree, st);
		line = tree.getStart().getLine();
		
		if (tree.getTokens(CsParser.IDENTIFIER).size() > 0) {
			name = tree.getToken(CsParser.IDENTIFIER, 0).getText();
			log.trace("Field/variable added: " + name);
		} else {
			throw new RuntimeException("Field/variable w/o name (compiler error)");
		}
		
		for (ParserRuleContext child : tree.getRuleContexts(ParserRuleContext.class)) {
			if (child.getRuleIndex() == CsParser.RULE_assignment_operator) {
				TerminalNode tToken = child.getToken(CsParser.ASSIGN, 0);
				if (tToken != null)
					initOperator = tToken.getText();
			} else if (child.getRuleIndex() == CsParser.RULE_assignment_expression) {
				initExpression = new Expression(child, errorProcessor, scope, className);
			}
		}
		//scope.addLocalVariable(name, declarationSpecifier.type);
		//scope.addVariable(this); //FIXME
	}

	
	public Type getType() {
		return declarationSpecifier.type;
	}
	
	public String getObjName() {
		return declarationSpecifier.objName;
	}
	
	public String getName() {
		return name;
	}
	
	public Expression getInitExpression() {
		return initExpression;
	}
	
	public int getLine() {
		return line;
	}
}


package org.itmo.iyakupov.components;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.itmo.iyakupov.ErrorProcessor;
import org.itmo.iyakupov.SymbolTable;
import org.itmo.iyakupov.a4autogen.CsParser;
import org.itmo.iyakupov.components.common.DeclarationSpecifier;
import org.itmo.iyakupov.components.expr.Expression;

public class Variable extends ClassResident {
	private final Log log = LogFactory.getLog(getClass());
	protected String initOperator;
	protected SymbolTable symbolTable;
	protected Expression initExpression;
	
	public Variable(ParserRuleContext tree, ParserRuleContext declarationSpecifierTree, 
			SymbolTable st, ClassDef parentClass, ErrorProcessor ep) {
		this.parent = parentClass;
		this.symbolTable = st;
		declarationSpecifier = new DeclarationSpecifier(declarationSpecifierTree, st);
		
		if (tree.getTokens(CsParser.IDENTIFIER).size() > 0) {
			name = tree.getToken(CsParser.IDENTIFIER, 0).getText();
			log.trace("Method added: " + tree.getToken(CsParser.IDENTIFIER, 0).getText());	
		} else {
			throw new RuntimeException("Field w/o name (compiler error)");
		}
		
		for (ParserRuleContext child : tree.getRuleContexts(ParserRuleContext.class)) {
			if (child.getRuleIndex() == CsParser.RULE_assignment_operator) {
				TerminalNode tToken = child.getToken(CsParser.ASSIGN, 0);
				if (tToken != null)
					initOperator = tToken.getText();
			} else if (child.getRuleIndex() == CsParser.RULE_assignment_expression) {
				initExpression = new Expression(child, ep, symbolTable);
			}
		}

		log.trace("Field added: " + name);
		// TODO Auto-generated constructor stub
	}

	
	public Type getType() {
		return declarationSpecifier.type;
	}
	
	public String getObjName() {
		return declarationSpecifier.objName;
	}
}


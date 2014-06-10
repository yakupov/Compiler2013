package org.itmo.iyakupov.components;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.ParserRuleContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.itmo.iyakupov.ErrorProcessor;
import org.itmo.iyakupov.SymbolTable;
import org.itmo.iyakupov.a4autogen.CsParser;
import org.itmo.iyakupov.components.expr.Expression;

public class CompoundStatement {
	private final Log log = LogFactory.getLog(getClass());

	protected SymbolTable symbolTable;
	protected ErrorProcessor errorProcessor;
	
	protected List<Variable> declarations = new ArrayList<Variable>();
	
	public CompoundStatement(ParserRuleContext tree, SymbolTable symbolTable, ErrorProcessor errorProcessor) {
		this.symbolTable = symbolTable;
		this.errorProcessor = errorProcessor;
		
		for (ParserRuleContext child: tree.getRuleContexts(ParserRuleContext.class)) {
			if (child.getRuleIndex() == CsParser.RULE_declaration) {
				log.trace("Decl in da block: " + child.getText());
				ParserRuleContext declarationSpecifier = null;
				for (ParserRuleContext details : child.getRuleContexts(ParserRuleContext.class)) {
					if (details.getRuleIndex() == CsParser.RULE_declaration_specifier) {
						errorProcessor.assertTrue(declarationSpecifier == null, tree.getStart().getLine(), 
								"declaration specifier: there is more than one of it");
						declarationSpecifier = details;
					} else if (details.getRuleIndex() == CsParser.RULE_init_declarator_list) {
						for (ParserRuleContext declarator : details.getRuleContexts(ParserRuleContext.class)) {
							if (declarator.getRuleIndex() == CsParser.RULE_init_declarator) {
								declarations.add(new Variable(declarator, declarationSpecifier, symbolTable, errorProcessor));							
							}
						}
					}
				}
			} else if (child.getRuleIndex() == CsParser.RULE_statement) {
				log.trace("stmt in da block: " + child.getText());
				//FIXME
				if (child.getRuleContext(ParserRuleContext.class, 0).getRuleIndex() == CsParser.RULE_expression_statement) {
					new Expression(child.getRuleContext(ParserRuleContext.class, 0).getRuleContext(ParserRuleContext.class, 0),
							errorProcessor, 
							symbolTable);
				}
			}
		}
	}

}

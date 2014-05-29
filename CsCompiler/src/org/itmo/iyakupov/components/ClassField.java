package org.itmo.iyakupov.components;

import org.antlr.v4.runtime.ParserRuleContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.itmo.iyakupov.SymbolTable;
import org.itmo.iyakupov.a4autogen.CsParser;
import org.itmo.iyakupov.components.common.DeclarationSpecifier;

public class ClassField extends ClassResident {
	private final Log log = LogFactory.getLog(getClass());

	public ClassField(ParserRuleContext tree, ParserRuleContext declarationSpecifierTree, SymbolTable st, ClassDef parentClass) {
		this.parent = parentClass;
		declarationSpecifier = new DeclarationSpecifier(declarationSpecifierTree, st);
		
		if (tree.getTokens(CsParser.IDENTIFIER).size() > 0) {
			name = tree.getToken(CsParser.IDENTIFIER, 0).getText();
			log.trace("Method added: " + tree.getToken(CsParser.IDENTIFIER, 0).getText());	
		} else {
			throw new RuntimeException("Field w/o name (compiler error)");
		}
		
		for (ParserRuleContext child : tree.getRuleContexts(ParserRuleContext.class)) {
			if (child.getRuleIndex() == CsParser.RULE_assignment_operator) {
				//TODO
			} else if (child.getRuleIndex() == CsParser.RULE_assignment_expression) {
				//TODO
			}
		}

		log.trace("Field added: " + tree.getToken(CsParser.IDENTIFIER, 0).getText());
		// TODO Auto-generated constructor stub
	}

}


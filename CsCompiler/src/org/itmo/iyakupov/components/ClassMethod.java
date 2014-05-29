package org.itmo.iyakupov.components;

import java.util.ArrayList;

import org.antlr.v4.runtime.ParserRuleContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.itmo.iyakupov.SymbolTable;
import org.itmo.iyakupov.a4autogen.CsParser;
import org.itmo.iyakupov.components.common.DeclarationSpecifier;

public class ClassMethod extends ClassResident {
	private final Log log = LogFactory.getLog(getClass());
	
	protected CompoundStatement block;
	protected ArrayList<MethodArg> args = new ArrayList<MethodArg>();
	protected boolean varargs = false;

	public ClassMethod(ParserRuleContext tree, SymbolTable st, ClassDef parentClass) {
		this.parent = parentClass;
		
		if (tree.getTokens(CsParser.IDENTIFIER).size() > 0) {
			name = tree.getToken(CsParser.IDENTIFIER, 0).getText();
			log.trace("Method added: " + tree.getToken(CsParser.IDENTIFIER, 0).getText());	
		} else {
			log.trace("Constructor added");
		}
		
		for (ParserRuleContext child : tree.getRuleContexts(ParserRuleContext.class)) {
			if (child.getRuleIndex() == CsParser.RULE_declaration_specifier) {
				declarationSpecifier = new DeclarationSpecifier(child, st);
			} else if (child.getRuleIndex() == CsParser.RULE_declarator_suffix) {
				for (ParserRuleContext declSuffixChild : child.getRuleContexts(ParserRuleContext.class)) {
					if (declSuffixChild.getRuleIndex() == CsParser.RULE_parameter_type_list) {
						if (declSuffixChild.getTokens(CsParser.ETC).size() > 0)
							varargs = true;
						
						for (ParserRuleContext parmTypeListChild : declSuffixChild.getRuleContexts(ParserRuleContext.class)) {
							if (parmTypeListChild.getRuleIndex() == CsParser.RULE_parameter_list) {
								for (ParserRuleContext parmListChild : parmTypeListChild.getRuleContexts(ParserRuleContext.class)) {
									if (parmListChild.getRuleIndex() == CsParser.RULE_parameter_declaration) {
										args.add(new MethodArg(parmListChild, st));
									}
								}
							}
						}
					}
				}
			} else if (child.getRuleIndex() == CsParser.RULE_compound_statement) {
				block = new CompoundStatement(child, st);
			}
		}
		

		// TODO Auto-generated constructor stub
	}
	//TODO
}


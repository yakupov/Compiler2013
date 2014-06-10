package org.itmo.iyakupov.components;

import java.util.ArrayList;

import org.antlr.v4.runtime.ParserRuleContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.itmo.iyakupov.CodeWriter;
import org.itmo.iyakupov.ErrorProcessor;
import org.itmo.iyakupov.SymbolTable;
import org.itmo.iyakupov.a4autogen.CsParser;
import org.itmo.iyakupov.components.common.DeclarationSpecifier;

public class ClassMethod implements GenerableCode {
	private final Log log = LogFactory.getLog(getClass());
	
	protected CompoundStatement block;
	protected ArrayList<Variable> args = new ArrayList<Variable>();
	protected boolean varargs = false;
	protected SymbolTable symbolTable;
	protected ClassDef parent;
	protected String name;
	protected DeclarationSpecifier declarationSpecifier;
	protected ErrorProcessor errorProcessor;

	public ClassMethod(ParserRuleContext tree, SymbolTable symbolTable, ClassDef parentClass, ErrorProcessor errorProcessor) {
		this.parent = parentClass;
		this.symbolTable = symbolTable;
		this.errorProcessor = errorProcessor;
		
		if (tree.getTokens(CsParser.IDENTIFIER).size() > 0) {
			name = tree.getToken(CsParser.IDENTIFIER, 0).getText();
			log.trace("Method added: " + tree.getToken(CsParser.IDENTIFIER, 0).getText());	
		} else {
			log.trace("Constructor added");
		}
		
		symbolTable.newBlock();
		
		for (ParserRuleContext child : tree.getRuleContexts(ParserRuleContext.class)) {
			if (child.getRuleIndex() == CsParser.RULE_declaration_specifier) {
				declarationSpecifier = new DeclarationSpecifier(child, symbolTable);
			} else if (child.getRuleIndex() == CsParser.RULE_declarator_suffix) {
				for (ParserRuleContext declSuffixChild : child.getRuleContexts(ParserRuleContext.class)) {
					if (declSuffixChild.getRuleIndex() == CsParser.RULE_parameter_type_list) {
						if (declSuffixChild.getTokens(CsParser.ETC).size() > 0)
							varargs = true;
						
						for (ParserRuleContext parmTypeListChild : declSuffixChild.getRuleContexts(ParserRuleContext.class)) {
							if (parmTypeListChild.getRuleIndex() == CsParser.RULE_parameter_list) {
								for (ParserRuleContext parmListChild : parmTypeListChild.getRuleContexts(ParserRuleContext.class)) {
									if (parmListChild.getRuleIndex() == CsParser.RULE_parameter_declaration) {
										args.add(new Variable(parmListChild.getRuleContext(ParserRuleContext.class, 1), 
												parmListChild.getRuleContext(ParserRuleContext.class, 0),
												symbolTable,
												errorProcessor));
									}
								}
							}
						}
					}
				}
			} else if (child.getRuleIndex() == CsParser.RULE_compound_statement) {
				block = new CompoundStatement(child, symbolTable, errorProcessor);
			}
		}
		
		symbolTable.endBlock(tree.getStart().getLine());
	}

	public String getName() {
		return name;
	}

	@Override
	public void writeCode(CodeWriter writer) {
		// TODO Auto-generated method stub
		
	}
}


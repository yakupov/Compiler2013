package org.itmo.iyakupov.components;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.itmo.iyakupov.CodeWriter;
import org.itmo.iyakupov.ErrorProcessor;
import org.itmo.iyakupov.SymbolTable;
import org.itmo.iyakupov.a4autogen.CsParser;

public class ClassDef implements GenerableCode {
	private final Log log = LogFactory.getLog(getClass());
	
	protected final ParserRuleContext tree;
	protected final SymbolTable symbolTable;
	protected final List<TerminalNode> accessModifiers;
	protected final List<TerminalNode> otherModifiers;
	protected final String name;
	protected final ArrayList<Variable> fields = new ArrayList<Variable>();
	protected final ArrayList<ClassMethod> methods = new ArrayList<ClassMethod>();
	protected final ErrorProcessor errorProcessor;
	
	public ClassDef(ParserRuleContext tree, SymbolTable symbolTable, ErrorProcessor errorProcessor) {
		this.tree = tree;
		this.symbolTable = symbolTable;
		this.errorProcessor = errorProcessor;
		
		if (tree.getRuleIndex() != CsParser.RULE_cls_def) {
			throw new RuntimeException("Invalid rule, must be an error in the compiler");
		}
		
		//Modifiers - ignore for now
		accessModifiers = tree.getTokens(CsParser.ACCESS_MODIFIER);
		log.trace("AccessModifiers#: " + accessModifiers.size());
		otherModifiers = tree.getTokens(CsParser.OTHER_MODIFIER);
		log.trace("OtherModifiers#: " + accessModifiers.size());
		
		//Class name
		List<TerminalNode> identifiers = tree.getTokens(CsParser.IDENTIFIER);
		errorProcessor.assertEquals(identifiers.size(), 1, tree.getStart().getLine(), 
				"IDENTIFIER, total number in class");
		name = identifiers.get(0).getText();
		log.trace("Class name: " + name);
		
		symbolTable.newBlock();
		
		//Fields and methods
		for (ParserRuleContext child : tree.getRuleContexts(ParserRuleContext.class)) {
			if (child.getRuleIndex() == CsParser.RULE_cls_method) {
				methods.add(new ClassMethod(child, symbolTable, this, errorProcessor));
			} else if (child.getRuleIndex() == CsParser.RULE_declaration) {
				ParserRuleContext declarationSpecifier = null;
				for (ParserRuleContext details : child.getRuleContexts(ParserRuleContext.class)) {
					if (details.getRuleIndex() == CsParser.RULE_declaration_specifier) {
						errorProcessor.assertTrue(declarationSpecifier == null, tree.getStart().getLine(), 
								"declaration specifier: there is more than one of it");
						declarationSpecifier = details;
					} else if (details.getRuleIndex() == CsParser.RULE_init_declarator_list) {
						for (ParserRuleContext declarator : details.getRuleContexts(ParserRuleContext.class)) {
							if (declarator.getRuleIndex() == CsParser.RULE_init_declarator) {
								fields.add(new Variable(declarator, declarationSpecifier, symbolTable, errorProcessor));							
							}
						}
					}
				}
			}
		}

		symbolTable.endBlock(tree.getStart().getLine());

	}
	
	@Override
	public void writeCode(CodeWriter cw) {
		// TODO Auto-generated method stub
		
		symbolTable.newBlock();

		symbolTable.endBlock(tree.getStart().getLine());
	}
}

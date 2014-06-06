package org.itmo.iyakupov.components;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.itmo.iyakupov.CodeWriter;
import org.itmo.iyakupov.SymbolTable;
import org.itmo.iyakupov.a4autogen.CsParser;

public class ClassDef implements GenerableCode {
	private final Log log = LogFactory.getLog(getClass());
	
	protected ParserRuleContext tree;
	protected SymbolTable st;
	protected List<TerminalNode> accessModifiers;
	protected List<TerminalNode> otherModifiers;
	protected String name;
	protected ArrayList<Variable> fields = new ArrayList<Variable>();
	protected ArrayList<ClassMethod> methods = new ArrayList<ClassMethod>();
	//protected ArrayList<InitAssignment> initAssignments = new ArrayList<InitAssignment>();

	public ClassDef(ParserRuleContext tree, SymbolTable st) {
		this.tree = tree;
		this.st = st;
		
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
		myAssert(identifiers.size() == 1, "IDENTIFIER, total number = " + identifiers.size() + ", != 1");
		name = identifiers.get(0).getText();
		log.trace("Class name: " + name);
		
		st.beginClass(name);
		
		//Fields and methods
		for (ParserRuleContext child : tree.getRuleContexts(ParserRuleContext.class)) {
			if (child.getRuleIndex() == CsParser.RULE_cls_method) {
				methods.add(new ClassMethod(child, st, this));
			} else if (child.getRuleIndex() == CsParser.RULE_declaration) {
				ParserRuleContext declarationSpecifier = null;
				for (ParserRuleContext details : child.getRuleContexts(ParserRuleContext.class)) {
					if (details.getRuleIndex() == CsParser.RULE_declaration_specifier) {
						myAssert(declarationSpecifier == null, "declaration specifier: there is more than one of it");
						declarationSpecifier = details;
					} else if (details.getRuleIndex() == CsParser.RULE_init_declarator_list) {
						for (ParserRuleContext declarator : details.getRuleContexts(ParserRuleContext.class)) {
							if (declarator.getRuleIndex() == CsParser.RULE_init_declarator) {
								fields.add(new Variable(declarator, declarationSpecifier, st, this));							
							}
						}
					}
				}
			}
		}
		
		st.endClass();
	}
	
	/*
	public void addAssignment(ClassField lvalue, ParserRuleContext expression) {
		String initOperator = null;
		ParserRuleContext nextLvalue = null;
		for (ParserRuleContext child : expression.getRuleContexts(ParserRuleContext.class)) {
			if (child.getRuleIndex() == CsParser.RULE_conditional_expression) {
				initAssignments.add(new InitAssignment(child, lvalue));
				return;
			} else if (child.getRuleIndex() == CsParser.RULE_lvalue) {
				nextLvalue = child;
			}  else if (child.getRuleIndex() == CsParser.RULE_assignment_operator) {
				TerminalNode tToken = child.getToken(CsParser.ASSIGN, 0);
				if (tToken != null)
					initOperator = tToken.getText();
			} else if (child.getRuleIndex() == CsParser.RULE_assignment_expression) {
				if (nextLvalue != null && "=".equals(initOperator)) {
					addAssignment(processInitLvalue(nextLvalue), child);
				}
			}
		}	
	}
	
	protected ClassField processInitLvalue(ParserRuleContext nextLvalue) {
		// TODO Auto-generated method stub
		return null;
	}
*/
	@Override
	public void writeCode(CodeWriter cw) {
		// TODO Auto-generated method stub

	}
	
	public void myAssert(boolean b, String comment) {
		if (!b)
			throw new RuntimeException("Assertion failed (compiler error) when processing " + comment);
	}



}

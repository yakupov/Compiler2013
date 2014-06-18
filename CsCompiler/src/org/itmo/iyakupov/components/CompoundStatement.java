package org.itmo.iyakupov.components;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.ParserRuleContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.itmo.iyakupov.ErrorProcessor;
import org.itmo.iyakupov.MethodResident;
import org.itmo.iyakupov.a4autogen.CsParser;
import org.itmo.iyakupov.components.expr.Expression;
import org.itmo.iyakupov.scope.TranslateScope;
import org.objectweb.asm.MethodVisitor;

public class CompoundStatement implements MethodResident {
	private final Log log = LogFactory.getLog(getClass());

	protected TranslateScope symbolTable;
	protected ErrorProcessor errorProcessor;
	protected TranslateScope scope;
	
	//protected List<Variable> declarations = new ArrayList<Variable>();
	//protected List<Expression> es = new ArrayList<Expression>();
	protected List<Object> elements = new ArrayList<Object>();
	
	
	public CompoundStatement(ParserRuleContext tree, TranslateScope symbolTable, ErrorProcessor errorProcessor, TranslateScope scope) {
		this.symbolTable = symbolTable;
		this.errorProcessor = errorProcessor;
		this.scope = scope;
		
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
								elements.add(new Variable(declarator, declarationSpecifier, symbolTable, errorProcessor, null));							
							}
						}
					}
				}
			} else if (child.getRuleIndex() == CsParser.RULE_statement) {
				log.trace("stmt in da block: " + child.getText());
				//FIXME
				if (child.getRuleContext(ParserRuleContext.class, 0).getRuleIndex() == CsParser.RULE_expression_statement) {
					elements.add(new Expression(child.getRuleContext(ParserRuleContext.class, 0).getRuleContext(ParserRuleContext.class, 0),
							errorProcessor, 
							symbolTable, 
							null)
					);
				}
			}
		}
	}


	@Override
	public void compile(MethodVisitor mv) {
		for (Object o : elements) {
			if (o instanceof Variable) {
				Variable v = (Variable) o;
				scope.addLocalVariable(v.getName(), v.declarationSpecifier.type);
				//mv.visitVarInsn(ASTORE, paramInt2)
				//TODO: compile it
				/*
				Label startLabel = mv.visitLabel(null);
				mv.visitLocalVariable(getName(), 
    			getObjName() != null ? getObjName() : getType().toString().toLowerCase(),
    			null, paramLabel1, paramLabel2, paramInt);
				 */
			} else {
				//FIXME
				Expression e = (Expression) o;
				e.compile(mv);
				//...
			}
		}
		// TODO Auto-generated method stub
		
	}

}

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
import org.itmo.iyakupov.components.expr.ExpressionType;
import org.itmo.iyakupov.scope.TranslateScope;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;

public class CompoundStatement implements Opcodes, MethodResident {
	private final Log log = LogFactory.getLog(getClass());

	protected ErrorProcessor errorProcessor;
	protected TranslateScope scope;
	
	protected List<Object> elements = new ArrayList<Object>();
	
	
	public CompoundStatement(ParserRuleContext tree, ErrorProcessor errorProcessor, TranslateScope scope, Type returnType) {
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
								elements.add(new Variable(declarator, declarationSpecifier, scope, errorProcessor, null));							
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
							scope, 
							null)
					);
				} else if (child.getRuleContext(ParserRuleContext.class, 0).getRuleIndex() == CsParser.RULE_jump_statement) {
					if (child.getRuleContext(ParserRuleContext.class, 0).getTokens(CsParser.RETURN).size() == 1) {
						elements.add(new ReturnStatement(child.getRuleContext(ParserRuleContext.class, 0), errorProcessor, scope, returnType));
					}
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
				if (v.getInitExpression() != null) {
					v.getInitExpression().compile(mv);
					boolean primType = ExpressionType.isPrimitiveType(v.getInitExpression().getType());
					primType &= v.getArrDim() == 0;
					mv.visitVarInsn(primType ? ISTORE : ASTORE, scope.getLocalVariableIndex(v.getName()));
					log.trace("Add LocalVar to scope. Name = " + v.getName() + 
							", index = " + scope.getLocalVariableIndex(v.getName()));
				}
			} else if (o instanceof Expression) {
				Expression e = (Expression) o;
				e.compile(mv);
			} else {
				MethodResident mr = (MethodResident) o;
				mr.compile(mv);
			}
		}
		// TODO Auto-generated method stub
	}
}

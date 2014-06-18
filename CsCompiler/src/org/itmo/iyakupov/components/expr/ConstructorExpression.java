package org.itmo.iyakupov.components.expr;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.itmo.iyakupov.ErrorProcessor;
import org.itmo.iyakupov.a4autogen.CsLexer;
import org.itmo.iyakupov.a4autogen.CsParser;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Type;

public class ConstructorExpression extends ExpressionType {
	private final Log log = LogFactory.getLog(getClass());
	private List<Expression> arrArgs = new ArrayList<Expression>();
	private Type type;
	private String objName;
	final private Map<String, String> stdDataTypes = new HashMap<String, String>();	

	private void fillMap() {
		stdDataTypes.put("String", "Ljava/lang/String;");
	}
	
	public ConstructorExpression(Expression parent, ErrorProcessor errors) {
		super(CsLexer.NEW, parent);
		log.trace("Constructor call added: " + parent.tree.getText());
		
		fillMap();
		
		//log.trace(parent.tree.getChildCount());
		//log.trace(parent.tree.getRuleContexts(ParserRuleContext.class).size());
		for (ParserRuleContext child: parent.tree.getRuleContexts(ParserRuleContext.class)) {
			log.trace("Constr rule: " + CsParser.ruleNames[child.getRuleIndex()]);
			if (child.getRuleIndex() == CsParser.RULE_arr_arg_suffix) {
				for (ParserRuleContext details : child.getRuleContexts(ParserRuleContext.class)) {
					if (details.getRuleIndex() == CsParser.RULE_argument_expression_list) {
						for (ParserRuleContext arg : details.getRuleContexts(ParserRuleContext.class)) {
							if (arg.getRuleIndex() == CsParser.RULE_assignment_expression) {
								arrArgs.add(new Expression(arg, errors, parent.scope, null));
							}
						}
					}
				}
			} else if (child.getRuleIndex() == CsParser.RULE_type_specifier) {
				List<TerminalNode> primType = child.getTokens(CsParser.PRIMITIVE_TYPE);
				if (primType.size() > 0) {
					errors.assertEquals(primType.size(), 1, child.getStart().getLine(), "invalid primitive type def");
					type = Type.getType(primType.get(0).getText().toUpperCase());
					objName = null;
				}
				
				List<TerminalNode> complType = child.getTokens(CsParser.IDENTIFIER);
				if (complType.size() > 0) {
					errors.assertEquals(complType.size(), 1, child.getStart().getLine(), "invalid compl type def");
					if (stdDataTypes.containsKey(complType.get(0).getText())) {
						type = Type.getType(stdDataTypes.get(complType.get(0).getText()));
					} else {
						log.trace("Obtaining complex type:" + "L" + complType.get(0).getText());
						type = Type.getType("L" + complType.get(0).getText());
					}
					objName = complType.get(0).getText();
				} 
			}
		}

	}

	

	@Override
	public Type getType() {
		return type;
		//return Type.getObjectType("Ljava/lang/Object");
	}



	@Override
	public void compile(MethodVisitor mv) {
		log.trace("t= " + type.getDescriptor());
		log.trace("#args= " + arrArgs.size());
		
		if (arrArgs.size() == 0) {
			mv.visitInsn(NEW);
		} else {
			for (Expression e : arrArgs) {
				e.compile(mv);
			}
			if (arrArgs.size() == 1) {
				//if (ExpressionType.isPrimitiveType(type))
				//	mv.visitIntInsn(NEWARRAY, type.getOpcode(type.getSort()));
				//else
					mv.visitTypeInsn(NEWARRAY, '[' + type.getDescriptor());
			} else {
				StringBuilder sb = new StringBuilder();
				for (int i = 0; i < arrArgs.size(); ++i)
					sb.append('[');
				sb.append(type.getDescriptor());
				mv.visitMultiANewArrayInsn(sb.toString(), arrArgs.size());
			}
		}
		
	}

}

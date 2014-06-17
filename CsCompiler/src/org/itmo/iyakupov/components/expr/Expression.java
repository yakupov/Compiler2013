package org.itmo.iyakupov.components.expr;

import java.util.HashMap;
import java.util.Map;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.itmo.iyakupov.ErrorProcessor;
import org.itmo.iyakupov.MethodResident;
import org.itmo.iyakupov.a4autogen.CsLexer;
import org.itmo.iyakupov.a4autogen.CsParser;
import org.itmo.iyakupov.components.Variable;
import org.itmo.iyakupov.scope.Scope;
import org.itmo.iyakupov.scope.TranslateScope;

import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;

public class Expression implements Opcodes, MethodResident {
	private final Log log = LogFactory.getLog(getClass());

	private final ParserRuleContext tree;
	private final TranslateScope scope;
	private final ErrorProcessor errors;
	private final ExpressionType expressionType;
	private final Map<Integer, ExpressionType> expressionTypeByToken;

	public Expression(ParserRuleContext tree, ErrorProcessor errors, TranslateScope scope) {
		this.tree = tree;
		this.errors = errors;
		this.scope = scope;
		this.expressionTypeByToken = new HashMap<Integer, ExpressionType>();
		createExpressionTypes();
		expressionType = determineExpressionType(tree);
		//expressionType.process(); //FIXME

		log.trace("Expression added: " + CsLexer.ruleNames[expressionType.lexemType - 1]);
		log.trace("Token: " + CsParser.tokenNames[expressionType.lexemType]);
		log.trace("ExpressionType: " + expressionType.getClass().getName());
		log.trace("Expression text: " + tree.getText());
	}
	/*
	private void assignToVariable(CodeWriter writer, String varName) {
		if (scope.isGlobalVar(varDef, tree.getStart().getLine())) {
			writer.println("putstatic Main/%s %s", varDef.getName(), varDef.getType().getDescriptor());
		} else {
			writer.println("%s %s", getType().store(), scope.getVariableId(varDef, tree.getStart().getLine()));
		}
	}
	 */

	private void assignToVariable(MethodVisitor mv, String varName) {
		if (ExpressionType.isPrimitiveType(getType())) {
			mv.visitVarInsn(ISTORE, scope.getLocalVariableIndex(varName));
		} else {
			mv.visitVarInsn(ASTORE, scope.getLocalVariableIndex(varName));
		}
	}


	public boolean isLValue() {
		return expressionType.isLValue();
	}

	public Type getType() {
		return expressionType.getType();
	}
	/*
	@Override
	@Deprecated
	public void compile(MethodVisitor mv) {
		if (expressionType != null) {
			expressionType.process();
		} else {
			errors.assertTrue(false, tree.getStart().getLine(), "Cannot find value in map");
			return;
		}
		expressionType.compile(mv);
	}
	 */

	@Override
	public void compile(MethodVisitor mv) { //Exp in method
		expressionType.compile(mv);

	}


	private Expression getLValueVariableExpr() {
		errors.assertTrue(isLValue(), tree.getStart().getLine(), "LValue is expected");
		if (expressionType.lexemType == CsLexer.IDENTIFIER) {
			return this;
		}
		return ((LValueAssignExpressionType) expressionType).expression1.getLValueVariableExpr();
	}

	public String getLValueVariable() {
		return ((IDExpressionType) getLValueVariableExpr().expressionType).getVariableName();
	}

	public ExpressionType getExpressionType() {
		return expressionType;
	}

	private ExpressionType determineExpressionType(ParserRuleContext tree) {
		if (tree.getChildCount() == 0)
			throw new RuntimeException("Tree w/o children! Error! " + tree.toString());

		switch (tree.getRuleIndex()) {
		case CsParser.RULE_additive_expression:
		case CsParser.RULE_multiplicative_expression:
		case CsParser.RULE_logical_and_expression:
		case CsParser.RULE_logical_or_expression:
		case CsParser.RULE_inclusive_or_expression:
		case CsParser.RULE_exclusive_or_expression:
		case CsParser.RULE_and_expression: {
			if (tree.getChildCount() == 1)
				return determineExpressionType(tree.getRuleContext(ParserRuleContext.class, 0));
			Integer[] possibleOperators = {CsParser.PLUS, CsParser.MINUS, CsParser.MUL, CsParser.DIV, CsParser.REM, 
					CsParser.AND, CsParser.OR, CsParser.BIT_XOR, CsParser.BIT_AND, CsParser.BIT_OR};
			for (Integer operator : possibleOperators) {
				if (tree.getTokens(operator).size() > 0)
					return expressionTypeByToken.get(operator);
			}
			throw new RuntimeException("Undefined operator Error! " + tree.toString());
		}
		case CsParser.RULE_equality_expression:
		case CsParser.RULE_relational_expression:
		case CsParser.RULE_shift_expression: {
			if (tree.getChildCount() == 1)
				return determineExpressionType(tree.getRuleContext(ParserRuleContext.class, 0));
			Integer[] possibleOperators = {CsParser.EQ, CsParser.NEQ, CsParser.GT, CsParser.LT, CsParser.GE, 
					CsParser.LE, CsParser.LSHIFT, CsParser.RSHIFT};
			for (Integer operator : possibleOperators) {
				if (tree.getRuleContext(ParserRuleContext.class, 1).getTokens(operator).size() > 0)
					return expressionTypeByToken.get(operator);
			}
			throw new RuntimeException("Undefined operator Error! " + tree.toString());
		}
		case CsParser.RULE_assignment_expression: {
			if (tree.getChildCount() == 1)
				return determineExpressionType(tree.getRuleContext(ParserRuleContext.class, 0));   		
			if (tree.getRuleContext(ParserRuleContext.class, 1).getTokens(CsParser.ASSIGN).size() > 0)
				return expressionTypeByToken.get(CsParser.ASSIGN);
			Integer[] possibleOperators = {CsParser.ADD_ASS, CsParser.SUB_ASS, CsParser.MUL_ASS, CsParser.DIV_ASS, 
					CsParser.LSHIFT_ASS, CsParser.RSHIFT_ASS, CsParser.ADD_ASS, CsParser.OR_ASS, CsParser.XOR_ASS};
			for (Integer operator : possibleOperators) {
				if (tree.getRuleContext(ParserRuleContext.class, 1).
						getRuleContext(ParserRuleContext.class, 0).getTokens(operator).size() > 0)
					return expressionTypeByToken.get(operator);
			}
			throw new RuntimeException("Undefined operator Error! " + tree.toString());
		}
		case CsParser.RULE_unary_expression: {
			if (tree.getChildCount() == 1)
				return determineExpressionType(tree.getRuleContext(ParserRuleContext.class, 0));
			Integer[] possibleOperators = {CsParser.INCREMENT, CsParser.DECREMENT, CsParser.PLUS, CsParser.MINUS, CsParser.NOT};
			for (Integer operator : possibleOperators) {
				if (tree.getRuleContext(ParserRuleContext.class, 1).getTokens(operator).size() > 0)
					return expressionTypeByToken.get(operator);
			}
			throw new RuntimeException("Undefined operator Error! " + tree.toString());
		}
		case CsParser.RULE_conditional_expression: {
			//TODO - skip maybe
			if (tree.getChildCount() == 1)
				return determineExpressionType(tree.getRuleContext(ParserRuleContext.class, 0));
		}
		case CsParser.RULE_postfix_expression: {
			if (tree.getChildCount() == 1)
				return determineExpressionType(tree.getRuleContext(ParserRuleContext.class, 0));
			return new PostfixExpression(tree, scope, errors);
		}
		case CsParser.RULE_primary_expression: {
			if (tree.getChildCount() == 1) {
				if (tree.getTokens(CsLexer.IDENTIFIER).size() > 0) {
					return expressionTypeByToken.get(CsLexer.IDENTIFIER);
				} else {
					return determineExpressionType(tree.getRuleContext(ParserRuleContext.class, 0));    				
				}
			}
			return determineExpressionType(tree.getRuleContext(ParserRuleContext.class, 1));
		}
		case CsParser.RULE_constant: {
			if (tree.getChildCount() == 1)
				return expressionTypeByToken.get(((TerminalNode)(tree.getChild(0))).getSymbol().getType());
			return new PostfixExpression(tree, scope, errors);
		}
		case CsParser.RULE_constructor_call: {
			return new ConstructorExpression(tree, scope, errors);
		}
		}	

		throw new RuntimeException("Don't know this rule " + tree.getText() + "   " + CsParser.ruleNames[tree.getRuleIndex()]);
	}




	private void createExpressionTypes() {
		/*
		 * No args
		 */
		expressionTypeByToken.put(CsLexer.STRING_LITERAL, new ExpressionType(CsLexer.STRING_LITERAL) {
			private String value;

			@Override
			public void compile(MethodVisitor mv) {
				value = tree.getText();
				mv.visitLdcInsn(value);
			}

			@Override
			public Type getType() {
				return Type.getType(String.class);
			}
		});
		expressionTypeByToken.put(CsLexer.DECIMAL_LITERAL, new ExpressionType(CsLexer.DECIMAL_LITERAL) {
			private String value;

			@Override
			public void compile(MethodVisitor mv) {
				value = tree.getText();
				mv.visitLdcInsn(Integer.parseInt(value));
			}

			@Override
			public Type getType() {
				return Type.INT_TYPE;
			}
		});
		expressionTypeByToken.put(CsLexer.IDENTIFIER, new IDExpressionType(CsLexer.IDENTIFIER, errors, scope, tree));

		/*
		 * UNARY
		 */
		expressionTypeByToken.put(CsLexer.MINUS, new ExpressionType(CsLexer.MINUS) {
			private Expression expression;

			@Override
			public void compile(MethodVisitor mv) {
				errors.assertEquals(1, tree.getChildCount(), tree.getStart().getLine(), "-");
				expression = new Expression(tree.getRuleContext(ParserRuleContext.class, 0), errors, scope);
				expression.compile(mv);
				mv.visitInsn(INEG);
			}

			@Override
			public Type getType() {
				return expression.getType();
			}

			@Override
			public boolean isLValue() {
				return false;
			}
		});
		expressionTypeByToken.put(CsLexer.INCREMENT, new ExpressionType(CsLexer.INCREMENT) {
			private Expression expression;

			@Override
			public void compile(MethodVisitor mv) {
				errors.assertEquals(1, tree.getChildCount(), tree.getStart().getLine(), "POST_INC");
				expression = new Expression(tree.getRuleContext(ParserRuleContext.class, 0), errors, scope);
				expression.compile(mv);
				mv.visitInsn(IINC);
				String varName = expression.getLValueVariable();
				assignToVariable(mv, varName);
			}

			@Override
			public Type getType() {
				if (expression == null) {
					throw new IllegalArgumentException();
				}
				return expression.getType();
			}

			@Override
			public boolean isLValue() {
				return false;
			}
		});
		expressionTypeByToken.put(CsLexer.DECREMENT, new ExpressionType(CsLexer.DECREMENT) {
			private Expression expression;

			@Override
			public void compile(MethodVisitor mv) {
				errors.assertEquals(1, tree.getChildCount(), tree.getStart().getLine(), "POST_DEC");
				expression = new Expression(tree.getRuleContext(ParserRuleContext.class, 0), errors, scope);
				expression.compile(mv);
				mv.visitInsn(DUP);
				mv.visitInsn(ICONST_1);
				mv.visitInsn(ISUB);
				String varName = expression.getLValueVariable();
				assignToVariable(mv, varName);
			}

			@Override
			public Type getType() {
				if (expression == null) {
					throw new IllegalArgumentException();
				}
				return expression.getType();
			}

			@Override
			public boolean isLValue() {
				return false;
			}
		});

		/*
		 * BINARY
		 */
		expressionTypeByToken.put(CsLexer.ASSIGN, new ExpressionType(CsLexer.ASSIGN) {
			private Expression expression1;
			private Expression expression2;

			@Override
			public void compile(MethodVisitor mv) {
				expression1 = new Expression(tree.getRuleContext(ParserRuleContext.class, 0), errors, scope);
				expression2 = new Expression(tree.getRuleContext(ParserRuleContext.class, 2), errors, scope);
				
				expression2.compile(mv);
				String varName = expression1.getLValueVariable();
				if (varName == null)
					throw new RuntimeException("Null lvalue variable in assign");
				assignToVariable(mv, varName);
				expression1.compile(mv);
			}

			@Override
			public Type getType() {
				return expression1.getType();
			}

			@Override
			public boolean isLValue() {
				return true;
			}
		});
		expressionTypeByToken.put(CsLexer.MUL_ASS, new LValueAssignExpressionType(CsLexer.MUL_ASS, errors, scope, tree) {
			@Override
			public String operation() {
				return "*=";
			}

			@Override
			public int opCode() {
				return IMUL;
			}
		});
		expressionTypeByToken.put(CsLexer.DIV_ASS, new LValueAssignExpressionType(CsLexer.DIV_ASS, errors, scope, tree) {
			@Override
			public String operation() {
				return "/=";
			}

			@Override
			public int opCode() {
				return IDIV;
			}
		});
		expressionTypeByToken.put(CsLexer.REM_ASS, new LValueAssignExpressionType(CsLexer.REM_ASS, errors, scope, tree) {
			@Override
			public String operation() {
				return "%=";
			}

			@Override
			public int opCode() {
				return IREM;
			}
		});
		expressionTypeByToken.put(CsLexer.ADD_ASS, new LValueAssignExpressionType(CsLexer.ADD_ASS, errors, scope, tree) {
			@Override
			public String operation() {
				return "+=";
			}

			@Override
			public int opCode() {
				return IADD;
			}
		});
		expressionTypeByToken.put(CsLexer.SUB_ASS, new LValueAssignExpressionType(CsLexer.SUB_ASS, errors, scope, tree) {
			@Override
			public String operation() {
				return "-=";
			}

			@Override
			public int opCode() {
				return ISUB;
			}
		});
		expressionTypeByToken.put(CsLexer.LSHIFT_ASS, new LValueAssignExpressionType(CsLexer.LSHIFT_ASS, errors, scope, tree) {
			@Override
			public String operation() {
				return "<<=";
			}

			@Override
			public int opCode() {
				return ISHL;
			}
		});
		expressionTypeByToken.put(CsLexer.RSHIFT_ASS, new LValueAssignExpressionType(CsLexer.RSHIFT_ASS, errors, scope, tree) {
			@Override
			public String operation() {
				return ">>=";
			}

			@Override
			public int opCode() {
				return ISHR;
			}
		});
		expressionTypeByToken.put(CsLexer.AND_ASS, new LValueAssignExpressionType(CsLexer.AND_ASS, errors, scope, tree) {
			@Override
			public String operation() {
				return "&=";
			}

			@Override
			public int opCode() {
				return IAND;
			}
		});
		expressionTypeByToken.put(CsLexer.OR_ASS, new LValueAssignExpressionType(CsLexer.OR_ASS, errors, scope, tree) {
			@Override
			public String operation() {
				return "|=";
			}

			@Override
			public int opCode() {
				return IOR;
			}
		});
		expressionTypeByToken.put(CsLexer.XOR_ASS, new LValueAssignExpressionType(CsLexer.XOR_ASS, errors, scope, tree) {
			@Override
			public String operation() {
				return "^=";
			}

			@Override
			public int opCode() {
				return IXOR;
			}
		});
		expressionTypeByToken.put(CsLexer.OR, new ExpressionType(CsLexer.OR) {
			Expression e1;
			Expression e2;

			@Override
			public void compile(MethodVisitor mv) {
				e1 = new Expression(tree.getRuleContext(ParserRuleContext.class, 0), errors, scope);
				e2 = new Expression(tree.getRuleContext(ParserRuleContext.class, 2), errors, scope);

				// compiles e1
				e1.compile(mv);
				// tests if e1 is true
				mv.visitInsn(DUP);
				Label end = new Label();
				mv.visitJumpInsn(IFNE, end);
				// case where e1 is false : e1 || e2 is equal to e2
				mv.visitInsn(POP);
				e2.compile(mv);
				// if e1 is true, e1 || e2 is equal to e1:
				// we jump directly to this label, without evaluating e2
				mv.visitLabel(end);
			}

			@Override
			public Type getType() {
				return e1.getType();
			}
		});
		expressionTypeByToken.put(CsLexer.AND, new ExpressionType(CsLexer.AND) {
			Expression e1;
			Expression e2;

			@Override
			public void compile(MethodVisitor mv) {
				e1 = new Expression(tree.getRuleContext(ParserRuleContext.class, 0), errors, scope);
				e2 = new Expression(tree.getRuleContext(ParserRuleContext.class, 2), errors, scope);
				e1.compile(mv);
				mv.visitInsn(DUP);
				Label end = new Label();
				mv.visitJumpInsn(IFEQ, end);
				mv.visitInsn(POP);
				e2.compile(mv);
				mv.visitLabel(end);
			}

			@Override
			public Type getType() {
				return e1.getType();
			}
		});
		expressionTypeByToken.put(CsLexer.LSHIFT, new BinaryOperationExpressionType(CsLexer.PLUS, errors, scope, tree) {
			@Override
			public String operation() {
				return "<<";
			}

			@Override
			public int opCode() {
				return ISHL;
			}
		});
		expressionTypeByToken.put(CsLexer.RSHIFT, new BinaryOperationExpressionType(CsLexer.PLUS, errors, scope, tree) {
			@Override
			public String operation() {
				return ">>";
			}

			@Override
			public int opCode() {
				return ISHR;
			}
		});
		expressionTypeByToken.put(CsLexer.PLUS, new BinaryOperationExpressionType(CsLexer.PLUS, errors, scope, tree) {
			@Override
			public String operation() {
				return "+";
			}

			@Override
			public int opCode() {
				return IADD;
			}
		});
		expressionTypeByToken.put(CsLexer.MINUS, new BinaryOperationExpressionType(CsLexer.MINUS, errors, scope, tree) {
			@Override
			public String operation() {
				return "-";
			}

			@Override
			public int opCode() {
				return ISUB;
			}
		});
		expressionTypeByToken.put(CsLexer.MUL, new BinaryOperationExpressionType(CsLexer.MUL, errors, scope, tree) {
			@Override
			public String operation() {
				return "*";
			}

			@Override
			public int opCode() {
				return IMUL;
			}
		});
		expressionTypeByToken.put(CsLexer.DIV, new BinaryOperationExpressionType(CsLexer.DIV, errors, scope, tree) {
			@Override
			public String operation() {
				return "/";
			}

			@Override
			public int opCode() {
				return IDIV;
			}
		});
		expressionTypeByToken.put(CsLexer.REM, new BinaryOperationExpressionType(CsLexer.REM, errors, scope, tree) {
			@Override
			public String operation() {
				return "%";
			}

			@Override
			public int opCode() {
				return IREM;
			}
		});
		expressionTypeByToken.put(CsLexer.BIT_AND, new BinaryOperationExpressionType(CsLexer.BIT_AND, errors, scope, tree) {
			@Override
			public String operation() {
				return "&";
			}

			@Override
			public int opCode() {
				return IAND;
			}
		});
		expressionTypeByToken.put(CsLexer.BIT_XOR, new BinaryOperationExpressionType(CsLexer.BIT_XOR, errors, scope, tree) {
			@Override
			public String operation() {
				return "|";
			}

			@Override
			public int opCode() {
				return IXOR;
			}
		});
		expressionTypeByToken.put(CsLexer.OR, new BinaryOperationExpressionType(CsLexer.OR, errors, scope, tree) {
			@Override
			public String operation() {
				return "^";
			}

			@Override
			public int opCode() {
				return IOR;
			}
		});
		expressionTypeByToken.put(CsLexer.EQ, new ComparasionOperationExpressionType(CsLexer.EQ, errors, scope, tree) {
			@Override
			public String operation() {
				return "==";
			}

			@Override
			public int opCode() {
				return IF_ICMPEQ;
			}
		});
		expressionTypeByToken.put(CsLexer.NEQ, new ComparasionOperationExpressionType(CsLexer.NEQ, errors, scope, tree) {
			@Override
			public String operation() {
				return "==";
			}

			@Override
			public int opCode() {
				return IF_ACMPNE;
			}
		});
		expressionTypeByToken.put(CsLexer.LT, new ComparasionOperationExpressionType(CsLexer.LT, errors, scope, tree) {
			@Override
			public String operation() {
				return "<";
			}

			@Override
			public int opCode() {
				return IF_ICMPLT;
			}
		});
		expressionTypeByToken.put(CsLexer.LE, new ComparasionOperationExpressionType(CsLexer.LE, errors, scope, tree) {
			@Override
			public String operation() {
				return "<=";
			}

			@Override
			public int opCode() {
				return IF_ICMPLE;
			}
		});
		expressionTypeByToken.put(CsLexer.GT, new ComparasionOperationExpressionType(CsLexer.GT, errors, scope, tree) {
			@Override
			public String operation() {
				return ">";
			}

			@Override
			public int opCode() {
				return IF_ICMPGT;
			}
		});
		expressionTypeByToken.put(CsLexer.GE, new ComparasionOperationExpressionType(CsLexer.GE, errors, scope, tree) {
			@Override
			public String operation() {
				return ">=";
			}

			@Override
			public int opCode() {
				return IF_ICMPGE;
			}
		});
	}


}
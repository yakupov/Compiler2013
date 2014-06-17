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

	ParserRuleContext tree;
	final TranslateScope scope;
	final ErrorProcessor errors;
	private final ExpressionType expressionType;
	private final Map<Integer, ExpressionType> expressionTypeByToken = new HashMap<Integer, ExpressionType>();
	final String className;

	public Expression(ParserRuleContext tree, ErrorProcessor errors, TranslateScope scope, String className) {
		this.tree = tree;
		this.errors = errors;
		this.scope = scope;
		this.className = className;
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
		if (className != null) {
			mv.visitFieldInsn(PUTFIELD, className, varName, getType().getDescriptor());
		} else {
			if (ExpressionType.isPrimitiveType(getType())) {
				mv.visitVarInsn(ISTORE, scope.getLocalVariableIndex(varName));
			} else {
				mv.visitVarInsn(ASTORE, scope.getLocalVariableIndex(varName));
			}
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
		if (expressionType.lexemType == CsParser.IDENTIFIER) {
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
		this.tree = tree;
		if (tree == null) 
			throw new RuntimeException("Tree is null, fatal");
		if (tree.getChildCount() == 0)
			throw new RuntimeException("Tree w/o children! Error! " + tree.toString());
		if (tree.getChildCount() == 1)
			log.warn("OneChild tree. " + tree.getText() + CsParser.ruleNames[tree.getRuleIndex()]);
		
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
	        	//if (operator == CsParser.PLUS) throw new RuntimeException(tree.getText() + this.tree.getChildCount());
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
			Integer[] possibleOperators = {CsParser.INCREMENT, CsParser.DECREMENT, CsParser.MINUS, CsParser.NOT};
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
			return new PostfixExpression(this);
		}
		case CsParser.RULE_primary_expression: {
			if (tree.getChildCount() == 1) {
				if (tree.getTokens(CsParser.IDENTIFIER).size() > 0) {
					return expressionTypeByToken.get(CsParser.IDENTIFIER);
				} else {
					return determineExpressionType(tree.getRuleContext(ParserRuleContext.class, 0));    				
				}
			}
			return determineExpressionType(tree.getRuleContext(ParserRuleContext.class, 1));
		}
		case CsParser.RULE_constant: {
			if (tree.getChildCount() == 1)
				return expressionTypeByToken.get(((TerminalNode)(tree.getChild(0))).getSymbol().getType());
			return new PostfixExpression(this);
		}
		case CsParser.RULE_constructor_call: {
			return new ConstructorExpression(this);
		}
		}	

		throw new RuntimeException("Don't know this rule " + tree.getText() + "   " + CsParser.ruleNames[tree.getRuleIndex()]);
	}




	private void createExpressionTypes() {
		/*
		 * No args
		 */
		expressionTypeByToken.put(CsParser.STRING_LITERAL, new ExpressionType(CsParser.STRING_LITERAL, this) {
			private String value;

			@Override
			public void compile(MethodVisitor mv) {
				value = tree.getText();
				log.trace("visitLdcInsn: " + value);
		        //mv.visitVarInsn(ALOAD, 0);
				mv.visitLdcInsn(value);
			}

			@Override
			public Type getType() {
				return Type.getType(String.class);
			}
		});
		expressionTypeByToken.put(CsParser.DECIMAL_LITERAL, new ExpressionType(CsParser.DECIMAL_LITERAL, this) {
			private String value;

			@Override
			public void compile(MethodVisitor mv) {
				value = tree.getText();
				log.trace("int_visitLdcInsn: " + value);
		        //mv.visitVarInsn(ALOAD, 0);        
				//mv.visitLdcInsn(Integer.parseInt(value));
		        mv.visitIntInsn(SIPUSH, Integer.parseInt(value));
			}

			@Override
			public Type getType() {
				return Type.INT_TYPE;
			}
		});
		expressionTypeByToken.put(CsParser.IDENTIFIER, new IDExpressionType(CsParser.IDENTIFIER, this));

		/*
		 * UNARY
		 */
		expressionTypeByToken.put(CsParser.MINUS, new ExpressionType(CsParser.MINUS, this) {
			private Expression expression;

			@Override
			public void compile(MethodVisitor mv) {
				errors.assertEquals(1, tree.getChildCount(), tree.getStart().getLine(), "-");
				expression = new Expression(tree.getRuleContext(ParserRuleContext.class, 0), errors, scope, className);
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
		expressionTypeByToken.put(CsParser.INCREMENT, new ExpressionType(CsParser.INCREMENT, this) {
			private Expression expression;

			@Override
			public void compile(MethodVisitor mv) {
				errors.assertEquals(1, tree.getChildCount(), tree.getStart().getLine(), "POST_INC");
				expression = new Expression(tree.getRuleContext(ParserRuleContext.class, 0), errors, scope, className);
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
		expressionTypeByToken.put(CsParser.DECREMENT, new ExpressionType(CsParser.DECREMENT, this) {
			private Expression expression;

			@Override
			public void compile(MethodVisitor mv) {
				errors.assertEquals(1, tree.getChildCount(), tree.getStart().getLine(), "POST_DEC");
				expression = new Expression(tree.getRuleContext(ParserRuleContext.class, 0), errors, scope, className);
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
		expressionTypeByToken.put(CsParser.ASSIGN, new ExpressionType(CsParser.ASSIGN, this) {
			private Expression expression1;
			private Expression expression2;

			@Override
			public void compile(MethodVisitor mv) {
				expression1 = new Expression(tree.getRuleContext(ParserRuleContext.class, 0), errors, scope, className);
				expression2 = new Expression(tree.getRuleContext(ParserRuleContext.class, 2), errors, scope, className);
				
		        mv.visitVarInsn(ALOAD, 0);        
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
		expressionTypeByToken.put(CsParser.MUL_ASS, new LValueAssignExpressionType(CsParser.MUL_ASS, this) {
			@Override
			public String operation() {
				return "*=";
			}

			@Override
			public int opCode() {
				return IMUL;
			}
		});
		expressionTypeByToken.put(CsParser.DIV_ASS, new LValueAssignExpressionType(CsParser.DIV_ASS, this) {
			@Override
			public String operation() {
				return "/=";
			}

			@Override
			public int opCode() {
				return IDIV;
			}
		});
		expressionTypeByToken.put(CsParser.REM_ASS, new LValueAssignExpressionType(CsParser.REM_ASS, this) {
			@Override
			public String operation() {
				return "%=";
			}

			@Override
			public int opCode() {
				return IREM;
			}
		});
		expressionTypeByToken.put(CsParser.ADD_ASS, new LValueAssignExpressionType(CsParser.ADD_ASS, this) {
			@Override
			public String operation() {
				return "+=";
			}

			@Override
			public int opCode() {
				return IADD;
			}
		});
		expressionTypeByToken.put(CsParser.SUB_ASS, new LValueAssignExpressionType(CsParser.SUB_ASS, this) {
			@Override
			public String operation() {
				return "-=";
			}

			@Override
			public int opCode() {
				return ISUB;
			}
		});
		expressionTypeByToken.put(CsParser.LSHIFT_ASS, new LValueAssignExpressionType(CsParser.LSHIFT_ASS, this) {
			@Override
			public String operation() {
				return "<<=";
			}

			@Override
			public int opCode() {
				return ISHL;
			}
		});
		expressionTypeByToken.put(CsParser.RSHIFT_ASS, new LValueAssignExpressionType(CsParser.RSHIFT_ASS, this) {
			@Override
			public String operation() {
				return ">>=";
			}

			@Override
			public int opCode() {
				return ISHR;
			}
		});
		expressionTypeByToken.put(CsParser.AND_ASS, new LValueAssignExpressionType(CsParser.AND_ASS, this) {
			@Override
			public String operation() {
				return "&=";
			}

			@Override
			public int opCode() {
				return IAND;
			}
		});
		expressionTypeByToken.put(CsParser.OR_ASS, new LValueAssignExpressionType(CsParser.OR_ASS, this) {
			@Override
			public String operation() {
				return "|=";
			}

			@Override
			public int opCode() {
				return IOR;
			}
		});
		expressionTypeByToken.put(CsParser.XOR_ASS, new LValueAssignExpressionType(CsParser.XOR_ASS, this) {
			@Override
			public String operation() {
				return "^=";
			}

			@Override
			public int opCode() {
				return IXOR;
			}
		});
		expressionTypeByToken.put(CsParser.OR, new ExpressionType(CsParser.OR, this) {
			Expression e1;
			Expression e2;

			@Override
			public void compile(MethodVisitor mv) {
				e1 = new Expression(tree.getRuleContext(ParserRuleContext.class, 0), errors, scope, className);
				e2 = new Expression(tree.getRuleContext(ParserRuleContext.class, 2), errors, scope, className);

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
		expressionTypeByToken.put(CsParser.AND, new ExpressionType(CsParser.AND, this) {
			Expression e1;
			Expression e2;

			@Override
			public void compile(MethodVisitor mv) {
				e1 = new Expression(tree.getRuleContext(ParserRuleContext.class, 0), errors, scope, className);
				e2 = new Expression(tree.getRuleContext(ParserRuleContext.class, 2), errors, scope, className);
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
		expressionTypeByToken.put(CsParser.LSHIFT, new BinaryOperationExpressionType(CsParser.LSHIFT, this) {
			@Override
			public String operation() {
				return "<<";
			}

			@Override
			public int opCode() {
				return ISHL;
			}
		});
		expressionTypeByToken.put(CsParser.RSHIFT, new BinaryOperationExpressionType(CsParser.RSHIFT, this) {
			@Override
			public String operation() {
				return ">>";
			}

			@Override
			public int opCode() {
				return ISHR;
			}
		});
		expressionTypeByToken.put(CsParser.PLUS, new BinaryOperationExpressionType(CsParser.PLUS, this) {
			@Override
			public String operation() {
				return "+";
			}

			@Override
			public int opCode() {
				return IADD;
			}
		});
		expressionTypeByToken.put(CsParser.MINUS, new BinaryOperationExpressionType(CsParser.MINUS, this) {
			@Override
			public String operation() {
				return "-";
			}

			@Override
			public int opCode() {
				return ISUB;
			}
		});
		expressionTypeByToken.put(CsParser.MUL, new BinaryOperationExpressionType(CsParser.MUL, this) {
			@Override
			public String operation() {
				return "*";
			}

			@Override
			public int opCode() {
				return IMUL;
			}
		});
		expressionTypeByToken.put(CsParser.DIV, new BinaryOperationExpressionType(CsParser.DIV, this) {
			@Override
			public String operation() {
				return "/";
			}

			@Override
			public int opCode() {
				return IDIV;
			}
		});
		expressionTypeByToken.put(CsParser.REM, new BinaryOperationExpressionType(CsParser.REM, this) {
			@Override
			public String operation() {
				return "%";
			}

			@Override
			public int opCode() {
				return IREM;
			}
		});
		expressionTypeByToken.put(CsParser.BIT_AND, new BinaryOperationExpressionType(CsParser.BIT_AND, this) {
			@Override
			public String operation() {
				return "&";
			}

			@Override
			public int opCode() {
				return IAND;
			}
		});
		expressionTypeByToken.put(CsParser.BIT_XOR, new BinaryOperationExpressionType(CsParser.BIT_XOR, this) {
			@Override
			public String operation() {
				return "|";
			}

			@Override
			public int opCode() {
				return IXOR;
			}
		});
		expressionTypeByToken.put(CsParser.OR, new BinaryOperationExpressionType(CsParser.OR, this) {
			@Override
			public String operation() {
				return "^";
			}

			@Override
			public int opCode() {
				return IOR;
			}
		});
		expressionTypeByToken.put(CsParser.EQ, new ComparasionOperationExpressionType(CsParser.EQ, this) {
			@Override
			public String operation() {
				return "==";
			}

			@Override
			public int opCode() {
				return IF_ICMPEQ;
			}
		});
		expressionTypeByToken.put(CsParser.NEQ, new ComparasionOperationExpressionType(CsParser.NEQ, this) {
			@Override
			public String operation() {
				return "==";
			}

			@Override
			public int opCode() {
				return IF_ACMPNE;
			}
		});
		expressionTypeByToken.put(CsParser.LT, new ComparasionOperationExpressionType(CsParser.LT, this) {
			@Override
			public String operation() {
				return "<";
			}

			@Override
			public int opCode() {
				return IF_ICMPLT;
			}
		});
		expressionTypeByToken.put(CsParser.LE, new ComparasionOperationExpressionType(CsParser.LE, this) {
			@Override
			public String operation() {
				return "<=";
			}

			@Override
			public int opCode() {
				return IF_ICMPLE;
			}
		});
		expressionTypeByToken.put(CsParser.GT, new ComparasionOperationExpressionType(CsParser.GT, this) {
			@Override
			public String operation() {
				return ">";
			}

			@Override
			public int opCode() {
				return IF_ICMPGT;
			}
		});
		expressionTypeByToken.put(CsParser.GE, new ComparasionOperationExpressionType(CsParser.GE, this) {
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
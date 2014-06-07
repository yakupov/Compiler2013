package org.itmo.iyakupov.components.expr;

import java.util.HashMap;
import java.util.Map;

import org.antlr.v4.runtime.ParserRuleContext;
import org.itmo.iyakupov.CodeWriter;
import org.itmo.iyakupov.ErrorProcessor;
import org.itmo.iyakupov.SymbolTable;
import org.itmo.iyakupov.a4autogen.CsLexer;
import org.itmo.iyakupov.a4autogen.CsParser;
import org.itmo.iyakupov.components.GenerableCode;
import org.itmo.iyakupov.components.Type;
import org.itmo.iyakupov.components.Variable;

public class Expression implements GenerableCode {

	private final ParserRuleContext tree;
    private final SymbolTable symbolTable;
    private final ErrorProcessor errors;
    private final ExpressionType expressionType;

    private final Map<Integer, ExpressionType> noChildren;
    private final Map<Integer, ExpressionType> oneChildren;
    private final Map<Integer, ExpressionType> twoChildren;

    private void initNoChildren() {
        noChildren.put(CsLexer.STRING_LITERAL, new ExpressionType(CsLexer.STRING_LITERAL) {
            private String value;

            @Override
            public void process() {
                value = tree.getText();
            }

            @Override
            public void writeCode(CodeWriter writer) {
                writer.push(value);
                writer.println("invokestatic syscall/SysCall/string(Ljava/lang/String;)[C");
            }

            @Override
            public Type getType() {
                return Type.STRING;
            }
        });
        noChildren.put(CsLexer.DECIMAL_LITERAL, new ExpressionType(CsLexer.DECIMAL_LITERAL) {
            private String value;

            @Override
            public void process() {
                value = tree.getText();
            }

            @Override
            public void writeCode(CodeWriter writer) {
                writer.println("sipush %s", value);
            }

            @Override
            public Type getType() {
                return Type.INT;
            }
        });
        noChildren.put(CsLexer.IDENTIFIER, new IDExpressionType(CsLexer.IDENTIFIER, errors, symbolTable, tree));
    }
   

    private void initOneChildren() {
        oneChildren.put(CsLexer.MINUS, new ExpressionType(CsLexer.MINUS) {
            private Expression expression;

            @Override
            public void process() {
                errors.assertEquals(1, tree.getChildCount(), tree.getStart().getLine(), "-");
                expression = new Expression(tree.getRuleContext(ParserRuleContext.class, 0), errors, symbolTable);
                expression.expressionType.process();
            }

            @Override
            public void writeCode(CodeWriter writer) {
                expression.writeCode(writer);
                writer.writeComment("operation -");
                writer.println("ineg");
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
        oneChildren.put(CsLexer.INCREMENT, new ExpressionType(CsLexer.INCREMENT) {
            private Expression expression;

            @Override
            public void process() {
                errors.assertEquals(1, tree.getChildCount(), tree.getStart().getLine(), "POST_INC");
                expression = new Expression(tree.getRuleContext(ParserRuleContext.class, 0), errors, symbolTable);
                expression.expressionType.process();
            }

            @Override
            public void writeCode(CodeWriter writer) {
                expression.writeCode(writer);
                writer.writeComment("operation p++");
                writer.println("dup");
                writer.println("iconst_1");
                writer.println("iadd");
                Variable varDef = expression.getLValueVariable();
                assignToVariable(writer, varDef);
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
        oneChildren.put(CsLexer.DECREMENT, new ExpressionType(CsLexer.DECREMENT) {
            private Expression expression;
            @Override
            public void process() {
                errors.assertEquals(1, tree.getChildCount(), tree.getStart().getLine(), "POST_DEC");
                expression = new Expression(tree.getRuleContext(ParserRuleContext.class, 0), errors, symbolTable);
                expression.expressionType.process();
            }

            @Override
            public void writeCode(CodeWriter writer) {
                expression.writeCode(writer);
                writer.writeComment("operation p--");
                writer.println("dup");
                writer.println("iconst_1");
                writer.println("isub");
                Variable varDef = expression.getLValueVariable();
                assignToVariable(writer, varDef);
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

    }

    private void assignToVariable(CodeWriter writer, Variable varDef) {
        if (symbolTable.isGlobalVar(varDef, tree.getStart().getLine())) {
            writer.println("putstatic Main/%s %s", varDef.getName(), varDef.getType().getDescriptor());
        } else {
            writer.println("%s %s", getType().store(), symbolTable.getVariableId(varDef, tree.getStart().getLine()));
        }
    }

    private void initTwoChildren() {
        twoChildren.put(CsLexer.ASSIGN, new ExpressionType(CsLexer.ASSIGN) {
            private Expression expression1;
            private Expression expression2;

            @Override
            public void process() {
                errors.assertEquals(2, tree.getChildCount(), tree.getStart().getLine(), "ASSIGN : " + tree.getChildCount());
                expression1 = new Expression(tree.getRuleContext(ParserRuleContext.class, 0), errors, symbolTable);
                expression2 = new Expression(tree.getRuleContext(ParserRuleContext.class, 1), errors, symbolTable);
                expression1.expressionType.process();
                expression2.expressionType.process();
                errors.assertTrue(expression1.isLValue(), tree.getStart().getLine(), "Left value is required");
                errors.assertTrue(expression1.getType() != Type.VOID, tree.getStart().getLine(), "Cannot assign value to void");
                errors.assertTrue(TypeChecker.typeCheck(expression1, expression2), tree.getStart().getLine(),
                        String.format("Cannot cast %s to %s", expression2.getType(), expression1.getType()));
            }

            @Override
            public void writeCode(CodeWriter writer) {
                expression2.writeCode(writer);
                Variable varDef = expression1.getLValueVariable();
                assignToVariable(writer, varDef);
                expression1.writeCode(writer);
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
        twoChildren.put(CsLexer.MUL_ASS, new LValueAssignExpressionType(CsLexer.MUL_ASS, errors, symbolTable, tree) {
            @Override
            public String operation() {
                return "*=";
            }

            @Override
            public String byteCode() {
                return "imul";
            }
        });
        twoChildren.put(CsLexer.DIV_ASS, new LValueAssignExpressionType(CsLexer.DIV_ASS, errors, symbolTable, tree) {
            @Override
            public String operation() {
                return "/=";
            }

            @Override
            public String byteCode() {
                return "idiv";
            }
        });
        twoChildren.put(CsLexer.REM_ASS, new LValueAssignExpressionType(CsLexer.REM_ASS, errors, symbolTable, tree) {
            @Override
            public String operation() {
                return "%=";
            }

            @Override
            public String byteCode() {
                return "irem";
            }
        });
        twoChildren.put(CsLexer.ADD_ASS, new LValueAssignExpressionType(CsLexer.ADD_ASS, errors, symbolTable, tree) {
            @Override
            public String operation() {
                return "+=";
            }

            @Override
            public String byteCode() {
                return "iadd";
            }
        });
        twoChildren.put(CsLexer.SUB_ASS, new LValueAssignExpressionType(CsLexer.SUB_ASS, errors, symbolTable, tree) {
            @Override
            public String operation() {
                return "-=";
            }

            @Override
            public String byteCode() {
                return "imun";
            }
        });
        twoChildren.put(CsLexer.LSHIFT_ASS, new LValueAssignExpressionType(CsLexer.LSHIFT_ASS, errors, symbolTable, tree) {
            @Override
            public String operation() {
                return "<<=";
            }

            @Override
            public String byteCode() {
                return "ishl";
            }
        });
        twoChildren.put(CsLexer.RSHIFT_ASS, new LValueAssignExpressionType(CsLexer.RSHIFT_ASS, errors, symbolTable, tree) {
            @Override
            public String operation() {
                return ">>=";
            }

            @Override
            public String byteCode() {
                return "ishr";
            }
        });
        twoChildren.put(CsLexer.AND_ASS, new LValueAssignExpressionType(CsLexer.AND_ASS, errors, symbolTable, tree) {
            @Override
            public String operation() {
                return "&=";
            }

            @Override
            public String byteCode() {
                return "iand";
            }
        });
        twoChildren.put(CsLexer.OR_ASS, new LValueAssignExpressionType(CsLexer.OR_ASS, errors, symbolTable, tree) {
            @Override
            public String operation() {
                return "|=";
            }

            @Override
            public String byteCode() {
                return "ior";
            }
        });
        twoChildren.put(CsLexer.XOR_ASS, new LValueAssignExpressionType(CsLexer.XOR_ASS, errors, symbolTable, tree) {
            @Override
            public String operation() {
                return "^=";
            }

            @Override
            public String byteCode() {
                return "ixor";
            }
        });
        twoChildren.put(CsLexer.OR, new LogicalOperationExpressionType(CsLexer.OR, errors, symbolTable, tree) {
            @Override
            public String operation() {
                return "||";
            }

            @Override
            public String byteCode() {
                return "ifne";
            }

            @Override
            public String firstTrue() {
                return "iconst_0";
            }

            @Override
            public String secondTrue() {
                return "iconst_1";
            }
        });
        twoChildren.put(CsLexer.AND, new LogicalOperationExpressionType(CsLexer.AND, errors, symbolTable, tree) {
            @Override
            public String operation() {
                return "&&";
            }

            @Override
            public String byteCode() {
                return "ifeq";
            }

            @Override
            public String firstTrue() {
                return "iconst_1";
            }

            @Override
            public String secondTrue() {
                return "iconst_0";
            }
        });
        twoChildren.put(CsLexer.LSHIFT, new BinaryOperationExpressionType(CsLexer.PLUS, errors, symbolTable, tree) {
            @Override
            public String operation() {
                return "<<";
            }

            @Override
            public String byteCode() {
                return "ishl";
            }
        });
        twoChildren.put(CsLexer.RSHIFT, new BinaryOperationExpressionType(CsLexer.PLUS, errors, symbolTable, tree) {
            @Override
            public String operation() {
                return ">>";
            }

            @Override
            public String byteCode() {
                return "ishr";
            }
        });
        twoChildren.put(CsLexer.PLUS, new BinaryOperationExpressionType(CsLexer.PLUS, errors, symbolTable, tree) {
            @Override
            public String operation() {
                return "+";
            }

            @Override
            public String byteCode() {
                return "iadd";
            }
        });
        twoChildren.put(CsLexer.MINUS, new BinaryOperationExpressionType(CsLexer.MINUS, errors, symbolTable, tree) {
            @Override
            public String operation() {
                return "-";
            }

            @Override
            public String byteCode() {
                return "isub";
            }
        });
        twoChildren.put(CsLexer.MUL, new BinaryOperationExpressionType(CsLexer.MUL, errors, symbolTable, tree) {
            @Override
            public String operation() {
                return "*";
            }

            @Override
            public String byteCode() {
                return "imul";
            }
        });
        twoChildren.put(CsLexer.DIV, new BinaryOperationExpressionType(CsLexer.DIV, errors, symbolTable, tree) {
            @Override
            public String operation() {
                return "/";
            }

            @Override
            public String byteCode() {
                return "idiv";
            }
        });
        twoChildren.put(CsLexer.REM, new BinaryOperationExpressionType(CsLexer.REM, errors, symbolTable, tree) {
            @Override
            public String operation() {
                return "%";
            }

            @Override
            public String byteCode() {
                return "irem";
            }
        });
        twoChildren.put(CsLexer.AND, new BinaryOperationExpressionType(CsLexer.AND, errors, symbolTable, tree) {
            @Override
            public String operation() {
                return "&";
            }

            @Override
            public String byteCode() {
                return "iand";
            }
        });
        twoChildren.put(CsLexer.BIT_XOR, new BinaryOperationExpressionType(CsLexer.BIT_XOR, errors, symbolTable, tree) {
            @Override
            public String operation() {
                return "|";
            }

            @Override
            public String byteCode() {
                return "ixor";
            }
        });
        twoChildren.put(CsLexer.OR, new BinaryOperationExpressionType(CsLexer.OR, errors, symbolTable, tree) {
            @Override
            public String operation() {
                return "^";
            }

            @Override
            public String byteCode() {
                return "ior";
            }
        });
        twoChildren.put(CsLexer.EQ, new ComparasionOperationExpressionType(CsLexer.EQ, errors, symbolTable, tree) {
            @Override
            public String operation() {
                return "==";
            }

            @Override
            public String byteCode() {
                return "if_icmpeq";
            }
        });
        twoChildren.put(CsLexer.NEQ, new ComparasionOperationExpressionType(CsLexer.NEQ, errors, symbolTable, tree) {
            @Override
            public String operation() {
                return "==";
            }

            @Override
            public String byteCode() {
                return "if_icmpne";
            }
        });
        twoChildren.put(CsLexer.LT, new ComparasionOperationExpressionType(CsLexer.LT, errors, symbolTable, tree) {
            @Override
            public String operation() {
                return "<";
            }

            @Override
            public String byteCode() {
                return "if_icmplt";
            }
        });
        twoChildren.put(CsLexer.LE, new ComparasionOperationExpressionType(CsLexer.LE, errors, symbolTable, tree) {
            @Override
            public String operation() {
                return "<=";
            }

            @Override
            public String byteCode() {
                return "if_icmple";
            }
        });
        twoChildren.put(CsLexer.GT, new ComparasionOperationExpressionType(CsLexer.GT, errors, symbolTable, tree) {
            @Override
            public String operation() {
                return ">";
            }

            @Override
            public String byteCode() {
                return "if_icmpgt";
            }
        });
        twoChildren.put(CsLexer.GE, new ComparasionOperationExpressionType(CsLexer.GE, errors, symbolTable, tree) {
            @Override
            public String operation() {
                return ">=";
            }

            @Override
            public String byteCode() {
                return "if_icmpge";
            }
        });
    }

    public boolean isLValue() {
        return expressionType.isLValue();
    }

    public Expression(ParserRuleContext tree, ErrorProcessor errors, SymbolTable symbolTable) {
        this.tree = tree;
        this.errors = errors;
        this.symbolTable = symbolTable;
        this.noChildren = new HashMap<Integer, ExpressionType>();
        initNoChildren();
        this.oneChildren = new HashMap<Integer, ExpressionType>();
        initOneChildren();
        this.twoChildren = new HashMap<Integer, ExpressionType>();
        initTwoChildren();
        expressionType = determineExpressionType(tree);
    }
 

    private ExpressionType determineExpressionType(ParserRuleContext tree) {
    	switch (tree.getRuleIndex()) {
    	case CsParser.RULE_additive_expression:
    	case CsParser.RULE_multiplicative_expression:
    	case CsParser.RULE_logical_and_expression:
    	case CsParser.RULE_logical_or_expression:
    	case CsParser.RULE_inclusive_or_expression:
    	case CsParser.RULE_exclusive_or_expression:
    	case CsParser.RULE_and_expression: {
    		if (tree.getChildCount() == 0)
    			throw new RuntimeException("Tree wo children! Error! " + tree.toString());
    		if (tree.getChildCount() == 1)
    			return determineExpressionType(tree.getRuleContext(ParserRuleContext.class, 0));
    		Integer[] possibleOperators = {CsParser.PLUS, CsParser.MINUS, CsParser.MUL, CsParser.DIV, CsParser.REM, 
    				CsParser.AND, CsParser.OR, CsParser.BIT_XOR, CsParser.BIT_AND, CsParser.BIT_OR};
    		for (Integer operator : possibleOperators) {
    			if (tree.getTokens(operator).size() > 0)
    				return twoChildren.get(operator);
    		}
    		throw new RuntimeException("Undefined operator Error! " + tree.toString());
    	}
    	case CsParser.RULE_equality_expression:
    	case CsParser.RULE_relational_expression:
    	case CsParser.RULE_shift_expression: {
    		if (tree.getChildCount() == 0)
    			throw new RuntimeException("Tree wo children! Error! " + tree.toString());
    		if (tree.getChildCount() == 1)
    			return determineExpressionType(tree.getRuleContext(ParserRuleContext.class, 0));
    		Integer[] possibleOperators = {CsParser.EQ, CsParser.NEQ, CsParser.GT, CsParser.LT, CsParser.GE, 
    				CsParser.LE, CsParser.LSHIFT, CsParser.RSHIFT};
    		for (Integer operator : possibleOperators) {
    			if (tree.getRuleContext(ParserRuleContext.class, 1).getTokens(operator).size() > 0)
    				return twoChildren.get(operator);
    		}
    		throw new RuntimeException("Undefined operator Error! " + tree.toString());
    	}
    	case CsParser.RULE_assignment_expression: {
    		if (tree.getChildCount() == 0)
    			throw new RuntimeException("Tree wo children! Error! " + tree.toString());
    		if (tree.getChildCount() == 1)
    			return determineExpressionType(tree.getRuleContext(ParserRuleContext.class, 0));
    		if (tree.getRuleContext(ParserRuleContext.class, 1).getTokens(CsParser.ASSIGN).size() > 0)
    			return twoChildren.get(CsParser.ASSIGN);
    		Integer[] possibleOperators = {CsParser.ADD_ASS, CsParser.SUB_ASS, CsParser.MUL_ASS, CsParser.DIV_ASS, 
    				CsParser.LSHIFT_ASS, CsParser.RSHIFT_ASS, CsParser.ADD_ASS, CsParser.OR_ASS, CsParser.XOR_ASS};
    		for (Integer operator : possibleOperators) {
    			if (tree.getRuleContext(ParserRuleContext.class, 1).
    					getRuleContext(ParserRuleContext.class, 0).getTokens(operator).size() > 0)
    				return twoChildren.get(operator);
    		}
    		throw new RuntimeException("Undefined operator Error! " + tree.toString());
    	}
    	case CsParser.RULE_unary_expression: {
    		if (tree.getChildCount() == 0)
    			throw new RuntimeException("Tree wo children! Error! " + tree.toString());
    		if (tree.getChildCount() == 1)
    			return determineExpressionType(tree.getRuleContext(ParserRuleContext.class, 0));
    		Integer[] possibleOperators = {CsParser.INCREMENT, CsParser.DECREMENT, CsParser.PLUS, CsParser.MINUS, CsParser.NOT};
    		for (Integer operator : possibleOperators) {
    			if (tree.getRuleContext(ParserRuleContext.class, 1).getTokens(operator).size() > 0)
    				return oneChildren.get(operator);
    		}
    		throw new RuntimeException("Undefined operator Error! " + tree.toString());
    	}
    	
    	}	
    	/*
    	for (ParserRuleContext child : tree.getRuleContexts(ParserRuleContext.class)) {
    		if (child)
    	}
    	*/
		// TODO Auto-generated method stub
		return null;
	}


	private Map<Integer, ExpressionType> getMap(ParserRuleContext tree) {
        switch (tree.getChildCount()) {
            case 0: {
                return noChildren;
            }
            case 1: {
                return oneChildren;
            }
            case 2: {
                return twoChildren;
            }
            default: {
                errors.assertTrue(false, tree.getStart().getLine(), "Unexpected number of childs");
                return null;
            }
        }
    }

    public Type getType() {
        return expressionType.getType();
    }

    @Override
    public void writeCode(CodeWriter writer) {
        if (expressionType != null) {
            expressionType.process();
        } else {
            errors.assertTrue(false, tree.getStart().getLine(), "Cannot find value in map : "
                    + tree.getType());
            return;
        }
        expressionType.writeCode(writer);
    }

    private Expression getLValueVariableExpr() {
        errors.assertTrue(isLValue(), tree.getStart().getLine(), "LValue is expected");
        if (expressionType.lexemType == CsLexer.IDENTIFIER) {
            return this;
        }
        return ((LValueAssignExpressionType) expressionType).expression1.getLValueVariableExpr();
    }

    public Variable getLValueVariable() {
        return ((IDExpressionType) getLValueVariableExpr().expressionType).getVarDef();
    }

    public ExpressionType getExpressionType() {
    	return expressionType;
    }
}
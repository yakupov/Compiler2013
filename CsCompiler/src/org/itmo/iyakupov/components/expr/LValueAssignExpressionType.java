package org.itmo.iyakupov.components.expr;

import org.antlr.v4.runtime.ParserRuleContext;
import org.itmo.iyakupov.CodeWriter;
import org.itmo.iyakupov.ErrorProcessor;
import org.itmo.iyakupov.SymbolTable;
import org.itmo.iyakupov.components.Type;
import org.itmo.iyakupov.components.TypeChecker;
import org.itmo.iyakupov.components.Variable;

public abstract class LValueAssignExpressionType extends ExpressionType {
    Expression expression1;
    Expression expression2;
	protected ErrorProcessor errors;
	protected SymbolTable symbolTable;
	protected ParserRuleContext tree;

    public LValueAssignExpressionType(int lexemType, ErrorProcessor errors, SymbolTable symbolTable, ParserRuleContext tree) {
        super(lexemType);
        this.errors = errors;
        this.symbolTable = symbolTable;
        this.tree = tree;
    }

    public abstract String operation();
    public abstract String byteCode();

    @Override
    public boolean isLValue() {
        return true;
    }

    @Override
    public void process() {
        errors.assertEquals(3, tree.getChildCount(), tree.getStart().getLine(), "LValueAssign");
        expression1 = new Expression(tree.getRuleContext(ParserRuleContext.class, 0), errors, symbolTable);
        expression2 = new Expression(tree.getRuleContext(ParserRuleContext.class, 2), errors, symbolTable);
        expression1.getExpressionType().process();
        expression2.getExpressionType().process();
        errors.assertTrue(expression1.isLValue(), tree.getStart().getLine(),
                String.format("LValue is required: %s", operation()));
        errors.assertTrue(TypeChecker.typeCheck(expression1, expression2), tree.getStart().getLine(),
                String.format("Cannot cast %s to %s", expression2.getType(), expression1.getType()));
    }

    @Override
    public void writeCode(CodeWriter writer) {
        writer.writeComment(operation());
        expression1.writeCode(writer);
        expression2.writeCode(writer);
        writer.writeComment("operation " + operation());
        writer.println(byteCode());
        writer.println("dup");
        Variable varDef = expression1.getLValueVariable();
        writer.println("%s %s", getType().store(), symbolTable.getVariableId(varDef, tree.getStart().getLine()));
    }

    @Override
    public Type getType() {
        return expression1.getType();
    }
}

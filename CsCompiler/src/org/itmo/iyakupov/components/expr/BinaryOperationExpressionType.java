package org.itmo.iyakupov.components.expr;

import org.antlr.v4.runtime.ParserRuleContext;
import org.itmo.iyakupov.CodeWriter;
import org.itmo.iyakupov.ErrorProcessor;
import org.itmo.iyakupov.SymbolTable;
import org.itmo.iyakupov.components.Type;
import org.itmo.iyakupov.components.TypeChecker;

public abstract class BinaryOperationExpressionType extends ExpressionType {
	protected Expression expression1;
	protected Expression expression2;
    protected ErrorProcessor errors;
	protected SymbolTable symbolTable;
	protected ParserRuleContext tree;

    public BinaryOperationExpressionType(int lexemType, ErrorProcessor errors, SymbolTable symbolTable, ParserRuleContext tree) {
        super(lexemType);
        this.errors = errors;
        this.symbolTable = symbolTable;
        this.tree = tree;
    }

    public abstract String operation();
    public abstract String byteCode();

    @Override
    public void process() {
        errors.assertEquals(3, tree.getChildCount(), tree.getStart().getLine(), "BinOp");
        expression1 = new Expression(tree.getRuleContext(ParserRuleContext.class, 0), errors, symbolTable);
        expression2 = new Expression(tree.getRuleContext(ParserRuleContext.class, 2), errors, symbolTable);
        expression1.getExpressionType().process();
        expression2.getExpressionType().process();
        errors.assertTrue(TypeChecker.typeCheck(expression1, expression2), tree.getStart().getLine(),
                String.format("Cannot cast %s to %s", expression2.getType(), expression1.getType()));
    }

    @Override
    public void writeCode(CodeWriter writer) {
        expression1.writeCode(writer);
        expression2.writeCode(writer);
        writer.writeComment("operation " + operation());
        writer.println(byteCode());
    }

    @Override
    public Type getType() {
        return expression1.getType();
    }
}

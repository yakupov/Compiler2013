package org.itmo.iyakupov.components.expr;

import org.antlr.v4.runtime.ParserRuleContext;
import org.itmo.iyakupov.CodeWriter;
import org.itmo.iyakupov.ErrorProcessor;
import org.itmo.iyakupov.SymbolTable;

public abstract class LogicalOperationExpressionType extends BinaryOperationExpressionType {

    public LogicalOperationExpressionType(int lexemType, ErrorProcessor errors, SymbolTable symbolTable, ParserRuleContext tree) {
        super(lexemType, errors, symbolTable, tree);
    }

    public abstract String firstTrue();
    public abstract String secondTrue();

    @Override
    public boolean isLValue() {
        return false;
    }

    @Override
    public void writeCode(CodeWriter writer) {
        writer.writeComment(operation());
        expression1.writeCode(writer);
        String label0 = String.format("label_%d", symbolTable.getNextId());
        writer.println("%s %s", byteCode(), label0);
        expression2.writeCode(writer);
        writer.writeComment("operation " + operation());
        writer.println("%s %s", byteCode(), label0);
        String label1 = String.format("label_%d", symbolTable.getNextId());
        writer.println(firstTrue());
        writer.println("%s %s", "goto", label1);
        writer.writeLabel(label0);
        writer.println(secondTrue());
        writer.decreaseIndention();
        writer.writeLabel(label1);
        writer.decreaseIndention();
    }
}
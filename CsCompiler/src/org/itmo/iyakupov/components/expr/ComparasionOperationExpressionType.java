package org.itmo.iyakupov.components.expr;

import org.antlr.v4.runtime.ParserRuleContext;
import org.itmo.iyakupov.CodeWriter;
import org.itmo.iyakupov.ErrorProcessor;
import org.itmo.iyakupov.SymbolTable;

public abstract class ComparasionOperationExpressionType extends BinaryOperationExpressionType {

    public ComparasionOperationExpressionType(int lexemType, ErrorProcessor errors, SymbolTable symbolTable, ParserRuleContext tree) {
        super(lexemType, errors, symbolTable, tree);
    }

    @Override
    public void writeCode(CodeWriter writer) {
        expression1.writeCode(writer);
        expression2.writeCode(writer);
        writer.writeComment("operation " + operation());
        String label0 = String.format("label_%d", symbolTable.getNextId());
        String label1 = String.format("label_%d", symbolTable.getNextId());
        writer.println("%s %s", byteCode(), label0);
        writer.increaseIndention();
        writer.println("iconst_0");
        writer.println("%s %s", "goto", label1);
        writer.decreaseIndention();
        writer.writeLabel(label0);
        writer.println("iconst_1");
        writer.decreaseIndention();
        writer.writeLabel(label1);
        writer.decreaseIndention();
    }
}

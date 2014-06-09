package org.itmo.iyakupov.components.expr;

import org.antlr.v4.runtime.ParserRuleContext;
import org.itmo.iyakupov.CodeWriter;
import org.itmo.iyakupov.ErrorProcessor;
import org.itmo.iyakupov.SymbolTable;
import org.itmo.iyakupov.components.Type;
import org.itmo.iyakupov.components.Variable;

final class IDExpressionType extends ExpressionType {
	private String varName;
	private Variable varDef;
	private ErrorProcessor errors;
	private SymbolTable symbolTable;
	private ParserRuleContext tree;

	IDExpressionType(int lexemType, ErrorProcessor errors, SymbolTable symbolTable, ParserRuleContext tree) {
		super(lexemType);
        this.errors = errors;
        this.symbolTable = symbolTable;
        this.tree = tree;
	}

	@Override
	public void process() {
		varName = tree.getText();
		varDef = symbolTable.getVariable(varName, tree.getStart().getLine());
		errors.assertTrue(getVarDef() != null, tree.getStart().getLine(), "Cannot find variable : " + varName);
	}

	@Override
	public void writeCode(CodeWriter writer) {
		if (symbolTable.isGlobalVar(varName, tree.getStart().getLine())) {
			writer.println("getstatic Main/%s %s", varName,
					getVarDef().getType().getDescriptor());
		} else {
			writer.println("%s %s", getType().load(), symbolTable.getVariableId(varName, tree.getStart().getLine()));
		}
	}

	@Override
	public Type getType() {
		if (getVarDef() == null) {
			throw new IllegalStateException("process() was not called : " + tree.getStart().getLine());
		}
		return getVarDef().getType();
	}

	@Override
	public boolean isLValue() {
		return true;
	}

	public Variable getVarDef() {
		return varDef;
	}
}
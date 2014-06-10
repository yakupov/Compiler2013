package org.itmo.iyakupov.components.expr;

import org.antlr.v4.runtime.ParserRuleContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.itmo.iyakupov.CodeWriter;
import org.itmo.iyakupov.ErrorProcessor;
import org.itmo.iyakupov.SymbolTable;
import org.itmo.iyakupov.a4autogen.CsLexer;
import org.itmo.iyakupov.components.Type;

public class ConstructorExpression extends ExpressionType {
	private final Log log = LogFactory.getLog(getClass());

    protected ErrorProcessor errors;
	protected SymbolTable symbolTable;
	protected ParserRuleContext tree;
	
	public ConstructorExpression(ParserRuleContext tree, SymbolTable symbolTable, ErrorProcessor errors) {
		super(CsLexer.NEW);
		
        this.errors = errors;
        this.symbolTable = symbolTable;
        this.tree = tree;	
    
		log.trace("Constructor call added: " + tree.getText());
	}

	@Override
	public void writeCode(CodeWriter writer) {
		// TODO Auto-generated method stub

	}

	@Override
	public void process() {
		// TODO Auto-generated method stub

	}

	@Override
	public Type getType() {
		// TODO Auto-generated method stub
		return null;
	}

}

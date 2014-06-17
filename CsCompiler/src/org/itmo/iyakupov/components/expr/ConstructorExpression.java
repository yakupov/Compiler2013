package org.itmo.iyakupov.components.expr;

import org.antlr.v4.runtime.ParserRuleContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.itmo.iyakupov.ErrorProcessor;
import org.itmo.iyakupov.a4autogen.CsLexer;
import org.itmo.iyakupov.scope.TranslateScope;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Type;

public class ConstructorExpression extends ExpressionType {
	private final Log log = LogFactory.getLog(getClass());

    protected ErrorProcessor errors;
	protected TranslateScope scope;
	protected ParserRuleContext tree;
	
	public ConstructorExpression(ParserRuleContext tree, TranslateScope scope, ErrorProcessor errors) {
		super(CsLexer.NEW);
		
        this.errors = errors;
        this.scope = scope;
        this.tree = tree;	
    
		log.trace("Constructor call added: " + tree.getText());
	}

	

	@Override
	public Type getType() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public void compile(MethodVisitor mv) {
		// TODO Auto-generated method stub
		
	}

}

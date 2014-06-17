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

	
	public ConstructorExpression(Expression parent) {
		super(CsLexer.NEW, parent);
	
		log.trace("Constructor call added: " + parent.tree.getText());
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

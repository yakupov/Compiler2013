package org.itmo.iyakupov.components;

import java.util.List;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.itmo.iyakupov.ErrorProcessor;
import org.itmo.iyakupov.a4autogen.CsParser;
import org.itmo.iyakupov.scope.TranslateScope;
import org.objectweb.asm.Type;

public class DeclarationSpecifier {
	public final Type type; 
	public final String objName;
	final private ErrorProcessor errors = new ErrorProcessor();
	
	public DeclarationSpecifier(ParserRuleContext tree, TranslateScope st) {
		for (ParserRuleContext child : tree.getRuleContexts(ParserRuleContext.class)) {
			if (child.getRuleIndex() == CsParser.RULE_type_specifier) {
				List<TerminalNode> primType = child.getTokens(CsParser.PRIMITIVE_TYPE);
				if (primType.size() > 0) {
					errors.assertEquals(primType.size(), 1, child.getStart().getLine(), "invalid primitive type def");
					type = Type.getType(primType.get(0).getText().toUpperCase());
					objName = null;
					return;
				}
				
				List<TerminalNode> complType = child.getTokens(CsParser.PRIMITIVE_TYPE);
				if (complType.size() > 0) {
					errors.assertEquals(complType.size(), 1, child.getStart().getLine(), "invalid compl type def");
					type = Type.getType("L" + primType.get(0).getText());
					objName = complType.get(0).getText();
					return;
				}
			}
		}
		
		type = null;
		objName = null;
		errors.assertTrue(false, tree.getStart().getLine(), "E: Unsupported typeSpecifier: " + tree.getText());
	}
}

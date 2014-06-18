package org.itmo.iyakupov.components;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.itmo.iyakupov.CsCompiler;
import org.itmo.iyakupov.ErrorProcessor;
import org.itmo.iyakupov.a4autogen.CsParser;
import org.itmo.iyakupov.scope.TranslateScope;
import org.objectweb.asm.Type;

public class DeclarationSpecifier {
	private final static Log log = LogFactory.getLog(CsCompiler.class);

	public final Type type; 
	public final String objName;
	final private ErrorProcessor errors = new ErrorProcessor();
	final private Map<String, String> stdDataTypes = new HashMap<String, String>();	
	
	public DeclarationSpecifier(ParserRuleContext tree, TranslateScope scope) {
		fillMap();
		
		for (ParserRuleContext child : tree.getRuleContexts(ParserRuleContext.class)) {
			if (child.getRuleIndex() == CsParser.RULE_type_specifier) {
				List<TerminalNode> primType = child.getTokens(CsParser.PRIMITIVE_TYPE);
				if (primType.size() > 0) {
					errors.assertEquals(primType.size(), 1, child.getStart().getLine(), "invalid primitive type def");
					type = Type.getType(primType.get(0).getText().toUpperCase());
					objName = null;
					return;
				}
				
				List<TerminalNode> complType = child.getTokens(CsParser.IDENTIFIER);
				if (complType.size() > 0) {
					errors.assertEquals(complType.size(), 1, child.getStart().getLine(), "invalid compl type def");
					if (stdDataTypes.containsKey(complType.get(0).getText())) {
						type = Type.getType(stdDataTypes.get(complType.get(0).getText()));
					} else {
						log.trace("Obtaining complex type:" + "L" + complType.get(0).getText());
						type = Type.getType("L" + complType.get(0).getText());
					}
					objName = complType.get(0).getText();
					return;
				}
			}
		}
		
		type = null;
		objName = null;
		errors.assertTrue(false, tree.getStart().getLine(), "E: Unsupported typeSpecifier: " + tree.getText());
	}

	private void fillMap() {
		stdDataTypes.put("String", "Ljava/lang/String;");
	}
}

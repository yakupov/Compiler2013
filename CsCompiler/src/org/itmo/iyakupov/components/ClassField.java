package org.itmo.iyakupov.components;

import org.antlr.v4.runtime.ParserRuleContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.itmo.iyakupov.SymbolTable;
import org.itmo.iyakupov.a4autogen.CsParser;

public class ClassField extends ClassResident {
	private final Log log = LogFactory.getLog(getClass());

	public ClassField(ParserRuleContext tree, ParserRuleContext declarationSpecifier, SymbolTable st, ClassDef parentClass) {
		this.parent = parentClass;
		log.trace("Field added: " + tree.getToken(CsParser.IDENTIFIER, 0).getText());
		// TODO Auto-generated constructor stub
	}

}


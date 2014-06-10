package org.itmo.iyakupov;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.Tree;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.itmo.iyakupov.a4autogen.CsLexer;
import org.itmo.iyakupov.a4autogen.CsParser;
import org.itmo.iyakupov.components.ClassDef;
import org.itmo.iyakupov.utils.TreePsGeneratorBicycle;

public class CsCompiler {
	public final static String psFileName = "AST.ps";
	private final static Log log = LogFactory.getLog(CsCompiler.class);
	
	public static void main(String[] args) {
		args = new String[]{"Test.cs"};

		assert(args.length > 0 && args[0] != null);
		String argCompilationUnit = args[0]; //FIXME
		try {
			ANTLRInputStream input = new ANTLRInputStream(new FileInputStream(argCompilationUnit));
			CsLexer lexer = new CsLexer(input);
			CsParser parser = new CsParser(new CommonTokenStream(lexer));
			ParserRuleContext tree = parser.cls_def();

			log.trace("RuleIndexMap: " + parser.getRuleIndexMap());
			log.trace("TokenTypeMap: " + parser.getTokenTypeMap());
			
			log.debug("Printing parse tree:");
			log.debug(tree.toStringTree(parser));
			if (psFileName != null) {
				writePS(tree, parser.getRuleNames(), psFileName, "courier", 1);
			}

			int syntaxErrorsCount = parser.getNumberOfSyntaxErrors();
			if (syntaxErrorsCount > 0) {
				log.error(String.format("Parse of %s failed: %d errors found", argCompilationUnit, syntaxErrorsCount));
				System.exit(1);
			} else {
				log.info(String.format("Parse of %s completed successfully", argCompilationUnit));
			}

			//CsBaseVisitor visitor = new CsBaseVisitor();
			//visitor.visit(tree);
			testTree(tree, 0, parser);

		} catch (Exception e) {
			e.printStackTrace();
			System.exit(-1);
		}
	}

	public static void testTree(ParserRuleContext tree, int level, Parser p) {
		assert (level == tree.depth());
		log.info(level + "; " + p.getRuleNames()[tree.getRuleIndex()] + "; " + tree.getText());
		log.info("\t " + tree.toInfoString(p));

		ErrorProcessor ep = new ErrorProcessor();
		new ClassDef(tree, new SymbolTable(ep), ep);
		//System.err.println("\t " + tree.getTokens(CsLexer.CLASS).size());
		//System.err.println("\t " + tree.getTokens(CsLexer.ACCESS_MODIFIER).size());
		//System.err.println("\t " + tree.getTokens(CsLexer.IDENTIFIER).size());

		for (ParserRuleContext ct : tree.getRuleContexts(ParserRuleContext.class))
			testTree(ct, level + 1, p);
	}

	
	public static void writePS(Tree t, String[] ruleNames, 
			String fileName, String fontName, int fontSize) throws IOException {
		TreePsGeneratorBicycle psgen = new TreePsGeneratorBicycle(Arrays.asList(ruleNames), t, fontName, fontSize);
		String ps = psgen.getPS();
		FileWriter f = new FileWriter(fileName);
		BufferedWriter bw = new BufferedWriter(f);
		try {
			bw.write(ps);
		} finally {
			bw.close();
		}
	}
}

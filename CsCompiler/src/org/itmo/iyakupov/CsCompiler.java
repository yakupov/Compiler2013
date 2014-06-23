package org.itmo.iyakupov;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;
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
import org.itmo.iyakupov.scope.TranslateScope;
import org.itmo.iyakupov.utils.TreePsGeneratorBicycle;

import static java.lang.String.format;

public class CsCompiler extends ClassLoader {
	public final static String psFileName = "AST.ps";
	private final static Log log = LogFactory.getLog(CsCompiler.class);
	
	public static void main(String[] args) {
		//String[] arg0 = {"-visitor", "/home/ilia/Compiler2014/Cs.g4", "-package", "org.itmo.iyakupov.a4autogen"};
		//org.antlr.v4.Tool.main(arg0);
		//if (true) return;
		
		
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

	public static void testTree(ParserRuleContext tree, int level, Parser p) throws Exception{
		assert (level == tree.depth());
		log.info(level + "; " + p.getRuleNames()[tree.getRuleIndex()] + "; " + tree.getText());
		log.info("\t " + tree.toInfoString(p));

		ErrorProcessor ep = new ErrorProcessor();
		ClassDef cd = new ClassDef(tree, new TranslateScope(), ep);
		byte[] b = cd.compile();
		FileOutputStream fos = new FileOutputStream("Out.class");
		try {
			fos.write(b, 0, b.length);
		} finally {
			fos.close();
		}
		Runtime.getRuntime().exec("javap Out -c > Out.bc");
        Class<?> expClass = new CsCompiler().defineClass("Test", b, 0, b.length);

        String[] intVars = {"tst", "xxx", "yyy", "zzz"};
        for (Field f : expClass.getDeclaredFields()) {
        	log.info(format("%s = %d", f.getName(), expClass.getField(f.getName()).getInt(expClass.newInstance())));
        }
        /*
        for (String s : intVars) {
        	log.info(format("%s = %d", s, expClass.getField(s).getInt(expClass.newInstance())));
        }
        */
		String mainRes = String.valueOf((Boolean)expClass.getMethod("Main", String.class).invoke(expClass.newInstance(), ""));
		log.info("Main: " + mainRes);

		//System.err.println("\t " + tree.getTokens(CsLexer.CLASS).size());
		//System.err.println("\t " + tree.getTokens(CsLexer.ACCESS_MODIFIER).size());
		//System.err.println("\t " + tree.getTokens(CsLexer.IDENTIFIER).size());

		//for (ParserRuleContext ct : tree.getRuleContexts(ParserRuleContext.class))
		//	testTree(ct, level + 1, p);
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

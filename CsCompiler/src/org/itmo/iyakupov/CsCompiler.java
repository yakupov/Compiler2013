package org.itmo.iyakupov;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.Nullable;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.Tree;
import org.antlr.v4.runtime.tree.Trees;
import org.antlr.v4.runtime.tree.gui.TreePostScriptGenerator;
import org.itmo.iyakupov.a4autogen.CsBaseVisitor;
import org.itmo.iyakupov.a4autogen.CsLexer;
import org.itmo.iyakupov.a4autogen.CsParser;

public class CsCompiler {
	public static void main(String[] args) {
		args = new String[]{"Test.cs", "AST.ps"};

		assert(args.length > 0 && args[0] != null);
		String argCompilationUnit = args[0];

		try {
			ANTLRInputStream input = new ANTLRInputStream(new FileInputStream(argCompilationUnit));
			CsLexer lexer = new CsLexer(input);
			CsParser parser = new CsParser(new CommonTokenStream(lexer));
			//ParseTree tree = parser.cls_def();
			ParserRuleContext tree = parser.cls_def();

			System.out.println(tree.toStringTree(parser));
			if (args.length > 1) {
				writePS(tree, Arrays.asList(parser.getRuleNames()), args[1], "courier", 1);
				//tree.save(parser, args[1], "courier", 1);
			}

			int syntaxErrorsCount = parser.getNumberOfSyntaxErrors();
			if (syntaxErrorsCount > 0) {
				System.err.println(String.format("Parse of %s failed: %d errors found", argCompilationUnit, syntaxErrorsCount));
				System.exit(1);
			} else {
				System.out.println(String.format("Parse of %s completed successfully", argCompilationUnit));
			}


			//CsBaseVisitor visitor = new CsBaseVisitor();
			//visitor.visit(tree);
			testTree(tree, 0, parser);

			System.out.println(parser.getRuleIndexMap());
			System.out.println(parser.getTokenTypeMap());
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(-1);
		}


	}

	public static void testTree(ParserRuleContext tree, int level, Parser p) {
		assert (level == tree.depth());
		System.err.println(level + "; " + p.getRuleNames()[tree.getRuleIndex()] + "; " + tree.getText());
		System.err.println("\t " + tree.toInfoString(p));

		//System.err.println("\t " + tree.getTokens(CsLexer.CLASS).size());
		//System.err.println("\t " + tree.getTokens(CsLexer.ACCESS_MODIFIER).size());
		//System.err.println("\t " + tree.getTokens(CsLexer.IDENTIFIER).size());

		for (ParserRuleContext ct : tree.getRuleContexts(ParserRuleContext.class))
			testTree(ct, level + 1, p);
	}



	public static void writePS(Tree t, @Nullable List<String> ruleNames, String fileName, String fontName, int fontSize)
			throws IOException
			{
		TreePsGen2 psgen = new TreePsGen2(ruleNames, t, fontName, fontSize);
		String ps = psgen.getPS();
		FileWriter f = new FileWriter(fileName);
		BufferedWriter bw = new BufferedWriter(f);
		try {
			bw.write(ps);
		}
		finally {
			bw.close();
		}
	}


}

package org.itmo.iyakupov;

import java.io.FileInputStream;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.Trees;
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
			ParseTree tree = parser.cls_def();

			int syntaxErrorsCount = parser.getNumberOfSyntaxErrors();
			if (syntaxErrorsCount > 0) {
				System.err.println(String.format("Parse of %s failed: %d errors found", argCompilationUnit, syntaxErrorsCount));
				System.exit(1);
			} else {
				System.out.println(String.format("Parse of %s completed successfully", argCompilationUnit));
			}
			
			System.out.println(tree.toStringTree());
			if (args.length > 1)
				Trees.writePS(tree, null, args[1]);
			
			CsBaseVisitor visitor = new CsBaseVisitor();
			visitor.visit(tree);
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(-1);
		}
	}
}

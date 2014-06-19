package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import neptune.NeptuneLexer;
import neptune.NeptuneParser;
import neptune.NeptuneChecker;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;

public class TestNeptune {

	public static void main(String[] args) throws IOException, RecognitionException {
		
		String tests[] = {
				"declaration_statement",
				"expression",
				"foreach_statement",
				"if_statement",
				"print_statement",
				"include_statement",
				"read_statement",
				"while_statement",
				"codeblock"
		};
		
		for(String s: tests) {
			String inputFile = new File("").getAbsolutePath() + "/src/test/sample/" + s + ".npt";
			System.out.println("Testing file: "+ inputFile);
			
			InputStream in = inputFile == null ? System.in : new FileInputStream(inputFile);
	        NeptuneLexer lexer = new NeptuneLexer(new ANTLRInputStream(in));
	        CommonTokenStream tokens = new CommonTokenStream(lexer);
	        NeptuneParser parser = new NeptuneParser(tokens);

	        NeptuneParser.program_return result = parser.program();
	        CommonTree tree = (CommonTree) result.getTree();
	        System.out.println(tree.toStringTree());
	        
	        CommonTreeNodeStream treeStream = new CommonTreeNodeStream(tree);
	        NeptuneChecker checker = new NeptuneChecker(treeStream);
	        checker.program();

            System.out.println(tree.toStringTree());
            
            System.out.println("");
            System.out.println("");
            
		}
	}

}

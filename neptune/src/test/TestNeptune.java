package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import neptune.NeptuneLexer;
import neptune.NeptuneParser;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;

public class TestNeptune {

	public static void main(String[] args) throws IOException, RecognitionException {
		
		String tests[] = {
				"declaration_statement",
				"expression",
				"foreach_statement",
				"if_statement",
				"include_statement",
				"read_statement",
				"while_statement"
		};
		
		for(String s: tests) {
			String inputFile = new File("").getAbsolutePath() + "/src/test/sample/" + s + ".npt";
			System.out.println(s);
			
			InputStream in = inputFile == null ? System.in : new FileInputStream(inputFile);
	        NeptuneLexer lexer = new NeptuneLexer(new ANTLRInputStream(in));
	        CommonTokenStream tokens = new CommonTokenStream(lexer);
	        NeptuneParser parser = new NeptuneParser(tokens);

	        NeptuneParser.program_return result = parser.program();
	        CommonTree tree = (CommonTree) result.getTree();

            System.out.println(tree.toStringTree());
            
            System.out.println("");
            System.out.println("");
            
		}
	}

}

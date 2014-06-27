package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import neptune.NeptuneGenerator;
import neptune.NeptuneLexer;
import neptune.NeptuneParser;
import neptune.NeptuneChecker;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.BufferedTreeNodeStream;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.antlr.runtime.tree.TreeNodeStream;

public class TestNeptune {

	public static void main(String[] args) throws IOException, RecognitionException {
		
		File dir = new File(new File("").getAbsolutePath() + "/neptune/src/test/sample/");
		
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
		
		String tests2[] = {"loadnstore"};
		
//		for(File a: dir.listFiles()) {
		for(String s: tests2) {
//			String inputFile = a.getAbsolutePath();
			String inputFile = new File("").getAbsolutePath() + "/neptune/src/test/sample/" + s + ".npt";
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
	        
	        TreeNodeStream nodes = new BufferedTreeNodeStream(tree);
            NeptuneGenerator generator = new NeptuneGenerator(nodes);
            generator.program();
	        
            System.out.println(tree.toStringTree());
            
            System.out.println("");
            System.out.println("");
            
		}
	}

}

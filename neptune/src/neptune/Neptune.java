package neptune;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;

import neptune.assembly.Program;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;

import TAM.Assembler;
import TAM.Interpreter;

public class Neptune {

	public void run(File file, String action) throws Exception {

		String inputFile = file.getAbsolutePath();

		InputStream in = inputFile == null ? System.in : new FileInputStream(inputFile);
		NeptuneLexer lexer = new NeptuneLexer(new ANTLRInputStream(in));
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		NeptuneParser parser = new NeptuneParser(tokens);

		NeptuneParser.program_return result = null;

		result = parser.program();

		CommonTree tree = (CommonTree) result.getTree();


		CommonTreeNodeStream treeStream = new CommonTreeNodeStream(tree);
		NeptuneTree ntree = new NeptuneTree(treeStream);

		PrintStream normalOut = System.out;

		ntree.program();

		Program p = new Program();
		Program.isFunctionCall = false;

		System.out.println("Validating program.");
		ntree.rootNode.validate(p);
		
		System.out.println("OK!");
		System.out.println("");
		
		if(action.equals("compile") || action.equals("run")) {
			ntree.rootNode.generate(p, null);
		
			System.out.println("Assembling program.");
			
			PrintStream assemblyOut = new PrintStream(new File(inputFile + ".as"));
			
			System.setOut(assemblyOut);
			p.assemble();
			System.setOut(normalOut);
			
			System.out.println("OK!");
			System.out.println("");

			InputStream assemblyFile = new FileInputStream(inputFile + ".as");
			OutputStream objFile = new FileOutputStream(inputFile + ".obj");
		
			Assembler.assemble(assemblyFile, objFile);
			
			assemblyFile.close();
			objFile.close();
			
			if(action.equals("run")) {
				System.out.println("Running program.");
				
				Interpreter.loadObjectProgram(inputFile + ".obj");
				Interpreter.interpretProgram();
			}
		}
	}

	public static void main(String[] args) {
		Neptune neptune = new Neptune();
		
		
		if(args.length < 2) {
			System.out.println("Usage: action file");
			System.out.println("");
			System.out.println("Action can be:");
			System.out.println("- validate     validates the given file");
			System.out.println("- compile      validates and then compiles the given file");
			System.out.println("- run          validates, compiles and then runs the given file");
			System.exit(1);
		}
		
		if(!args[0].equals("validate") && !args[0].equals("compile") && !args[0].equals("run")) {
			System.out.println("Invalid action. Possible actions: validate, compile and run");
			System.exit(1);
		}
		
		String action = args[0];
		
		try {
			neptune.run(new File(args[1]), action);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	

}

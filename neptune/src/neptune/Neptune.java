package neptune;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;

import neptune.assembly.Program;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;

import TAM.Assembler;
import TAM.Interpreter;

public class Neptune {

	public void run(File file) throws Exception {

		String inputFile = file.getAbsolutePath();

		InputStream in = inputFile == null ? System.in : new FileInputStream(inputFile);
		NeptuneLexer lexer = new NeptuneLexer(new ANTLRInputStream(in));
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		NeptuneParser parser = new NeptuneParser(tokens);

		NeptuneParser.program_return result = null;

		PrintStream normalErr = System.err;

		System.setErr(new PrintStream(new OutputStream() {
			public void write(int b) {
			}
		}));
		result = parser.program();
		System.setErr(normalErr);

		CommonTree tree = (CommonTree) result.getTree();


		CommonTreeNodeStream treeStream = new CommonTreeNodeStream(tree);
		NeptuneTree ntree = new NeptuneTree(treeStream);

		PrintStream assemblyOut = new PrintStream(new File(inputFile + ".as"));
		PrintStream normalOut = System.out;

		String actual = "";

		try {
			ntree.program();
		} catch (RecognitionException e) {
			actual = e.toString()+ "\n";
		}


		Program p = new Program();
		Program.isFunctionCall = false;


		ntree.rootNode.validate(p);
		ntree.rootNode.generate(p, null);

		System.setOut(assemblyOut);
		p.assemble();
		System.setOut(normalOut);

		InputStream assemblyFile = new FileInputStream(inputFile + ".as");
		OutputStream objFile = new FileOutputStream(inputFile + ".obj");

		System.setErr(new PrintStream(new OutputStream() {
			public void write(int b) {
			}
		}));
		
		Assembler.assemble(assemblyFile, objFile);
		System.setErr(normalErr);

		assemblyFile.close();
		objFile.close();

		Interpreter.loadObjectProgram(inputFile + ".obj");


		PrintStream programOutput = new PrintStream(new File(inputFile + ".out"));
		System.setOut(programOutput);

		Interpreter.interpretProgram();
		System.setOut(normalOut);
	}

	private String readFile( File file ) {
		BufferedReader reader;
		StringBuilder stringBuilder = null;
		try {
			reader = new BufferedReader( new FileReader (file));

			String line = null;
			stringBuilder = new StringBuilder();
			String ls = System.getProperty("line.separator");

			while( ( line = reader.readLine() ) != null ) {
				stringBuilder.append( line );
				stringBuilder.append( ls );
			}

			reader.close();

		} catch (FileNotFoundException e) {
			System.err.println("File cannot be found " + file);
		} catch (IOException e) {
			System.err.println("Error reading file ");
			e.printStackTrace();
		}

		if(stringBuilder != null) {
			return stringBuilder.toString();
		}else{
			return "";
		}
	}

	public static void main(String[] args) {
		Neptune neptune = new Neptune();
		try {
			neptune.run(new File("/Users/koen/Desktop/Neptune/program.npt"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	

}

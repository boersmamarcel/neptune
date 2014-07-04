package test;

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

import TAM.Assembler;
import TAM.Interpreter;

public class TestNeptune {

	public static void main(String[] args) throws IOException, RecognitionException {
		
		File dir = new File(new File("").getAbsolutePath() + "/neptune/src/test/sample/");
		
		for(File a: dir.listFiles()) {
			if(!a.isDirectory()) {
				continue;
			}
			for(File b: a.listFiles()) {
				String inputFile = b.getAbsolutePath();
				if(!inputFile.endsWith(".npt") || !inputFile.contains("/correct/")) {
					continue;
				}
				System.out.println("Testing file: "+ b.getName());

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
				
				if(true) {
					continue;
				}

				TreeNodeStream nodes = new BufferedTreeNodeStream(tree);
				NeptuneGenerator generator = new NeptuneGenerator(nodes);
				
				PrintStream assemblyOut = new PrintStream(new File(inputFile + ".as"));
				PrintStream normalOut = System.out;
				
				System.setOut(assemblyOut);
				generator.program();
				System.setOut(normalOut);
				
				InputStream assemblyFile = new FileInputStream(inputFile + ".as");
				OutputStream objFile = new FileOutputStream(inputFile + ".obj");

				
				PrintStream normalErr = System.err;
				
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
				
				File checkFile = new File(a.getAbsolutePath() + "/" + b.getName().substring(0, b.getName().length() - 4) + ".txt");
				
				String actual = readFile(new File(inputFile + ".out"));
				String expected = readFile(checkFile);
				
				if(expected.equals(actual)) {
					System.out.println("Output matches!");
					new File(inputFile + ".as").delete();
				}else{
					System.out.println(">>> OUTPUT DOES NOT MATCH EXPECTED OUTPUT! <<<");
					System.out.println("============================================");
					System.out.println("Actual Output");
					System.out.println("============================================");
					System.out.print(actual);
					System.out.println("============================================");
					System.out.println("Expected");
					System.out.println("============================================");
					System.out.print(expected);
					System.out.println("============================================");
					System.out.println("");
					
				}
				

				
				new File(inputFile + ".obj").delete();
				new File(inputFile + ".out").delete();

				System.out.println("");
				System.out.println("");
			}
		}
	}
	
	private static String readFile( File file ) {
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

}

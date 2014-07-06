package test;

import static org.junit.Assert.*;

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

import neptune.NeptuneLexer;
import neptune.NeptuneParser;
import neptune.NeptuneTree;
import neptune.assembly.Program;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.junit.Test;

import TAM.Assembler;
import TAM.Interpreter;


public class FullTest {

	
	@Test
	public void array(){
		String method = new Exception().getStackTrace()[0].getMethodName();
		try {
			correctTest(method, "correct");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RecognitionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void basicexpression(){
		//method name
		String method = new Exception().getStackTrace()[0].getMethodName();
		try {
			correctTest(method, "correct");
			correctTest(method, "context");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (RecognitionException e) {
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void codeblock(){
		//method name
		String method = new Exception().getStackTrace()[0].getMethodName();
		try {
			correctTest(method, "correct");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RecognitionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void function(){
		//method name
		String method = new Exception().getStackTrace()[0].getMethodName();
		try {
			correctTest(method, "correct");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RecognitionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void ifstatement(){
		//method name
		String method = new Exception().getStackTrace()[0].getMethodName();
		try {
			correctTest(method, "correct");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RecognitionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void whilestatement(){
		//method name
		String method = new Exception().getStackTrace()[0].getMethodName();
		try {
			correctTest(method, "correct");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RecognitionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Test 
	public void foreach(){
		String method = new Exception().getStackTrace()[0].getMethodName();
		try {
			correctTest(method, "correct");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RecognitionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public void correctTest(String filebase, String dirbase) throws IOException, RecognitionException{
		File file = new File(new File("").getAbsolutePath() + "/neptune/src/test/sample/"+dirbase+"/"+filebase+".npt");
		
		String inputFile = file.getAbsolutePath();
		
		InputStream in = inputFile == null ? System.in : new FileInputStream(inputFile);
		NeptuneLexer lexer = new NeptuneLexer(new ANTLRInputStream(in));
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		NeptuneParser parser = new NeptuneParser(tokens);

		NeptuneParser.program_return result = parser.program();
		CommonTree tree = (CommonTree) result.getTree();
		

		CommonTreeNodeStream treeStream = new CommonTreeNodeStream(tree);
		NeptuneTree ntree = new NeptuneTree(treeStream);
		
		PrintStream assemblyOut = new PrintStream(new File(inputFile + ".as"));
		PrintStream normalOut = System.out;
		
		ntree.program();
		Program p = new Program();
		
		ntree.rootNode.validate(p);
		ntree.rootNode.generate(p, null);
		
		System.setOut(assemblyOut);
		p.assemble();
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
		
		
		File checkFile = new File(new File("").getAbsolutePath() + "/neptune/src/test/sample/"+dirbase+"/"+filebase+".txt");
	
		
		String actual = readFile(new File(inputFile + ".out"));
		String expected = readFile(checkFile);
		
		
		printResult(file.getName(), dirbase, actual, expected);

		new File(inputFile + ".as").delete();
		new File(inputFile + ".obj").delete();
		new File(inputFile + ".out").delete();
		

	}
	

	
	private void printResult(String filename, String type,  String actual, String expected){
		if(!expected.equals(actual)){
			System.out.println("Testing file: "+ filename +" test type:"+type);
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
			fail(filename);
			System.out.println("");
			System.out.println("");
		}
		
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
	
	@Test
	public void testAllCorrect() {
		assert(true);

	}

	
	
	
	
}

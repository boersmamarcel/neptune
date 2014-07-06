package neptune.assembly;

import java.util.ArrayList;
import java.util.List;

import neptune.SymbolTable;

/**
 * @author Koen van Urk and Marcel Boersma
 *
 */
public class Program {

	/**
	 * Stores the assembly instructions.
	 */
	private List<Instruction> instructions;
	
	/**
	 * Stores a symbol table.
	 */
	public SymbolTable symbolTable;
	
	/**
	 * Helper variable to know when a function is being defined.
	 */
	public static boolean isFunctionCall = false;
	
	/**
	 * Name of the function that is being defined when isFunctionCall is true.
	 */
	public static String definingFunction = "";
	
	/**
	 * Assembly instructions for functions. These are printed after the main block.
	 */
	private List<Instruction> functionInstructions;
	
	/**
	 * Counter to generate unique labels for things like if statements and while blocks.
	 */
	protected int labelCounter = 0;
	
	/**
	 * Creates a new instance of a Program with empty instructions sets and symbol table.
	 */
	public Program() {
		instructions = new ArrayList<Instruction>();
		functionInstructions = new ArrayList<Instruction>();
		symbolTable = new SymbolTable();
	}
	
	/**
	 * Adds an instructions to the currently active instruction set.
	 * 
	 * Instruction set is defined by instructionSet() and can be
	 * either the function instruction or the base instruction set.
	 * 
	 * @param i Instruction to add.
	 */
	public void add(Instruction i) {
		instructionSet().add(i);
	}
	
	/**
	 * Assembles the program and prints the complete instruction set.
	 */
	public void assemble() {
		
		System.out.println("PUSH " + symbolTable.getLargestSize());
		
		for(Instruction i : instructions) {
			System.out.println(i);
		}
		
		System.out.println("POP(0) " + symbolTable.getLargestSize());
		System.out.println("HALT");
		
		for(Instruction i : functionInstructions) {
			System.out.println(i);
		}
		
		System.out.println("valid0: LOAD(1) -2[LB]");
		System.out.println("LOAD(1) -1[LB]");
		System.out.println("CALL ge");
		System.out.println("JUMPIF(0) valid1[CB]");
		System.out.println("LOADL 83");
		System.out.println("LOADL 68");
		System.out.println("LOADL 78");
		System.out.println("LOADL 85");
		System.out.println("LOADL 79");
		System.out.println("LOADL 66");
		System.out.println("LOADL 32");
		System.out.println("LOADL 70");
		System.out.println("LOADL 79");
		System.out.println("LOADL 32");
		System.out.println("LOADL 84");
		System.out.println("LOADL 85");
		System.out.println("LOADL 79");
		System.out.println("CALL put");
		System.out.println("CALL put");
		System.out.println("CALL put");
		System.out.println("CALL put");
		System.out.println("CALL put");
		System.out.println("CALL put");
		System.out.println("CALL put");
		System.out.println("CALL put");
		System.out.println("CALL put");
		System.out.println("CALL put");
		System.out.println("CALL put");
		System.out.println("CALL put");
		System.out.println("CALL put");
		System.out.println("HALT");
		System.out.println("valid1: RETURN(0) 2");
	}
	
	/**
	 * Helper method to obtain the currently active instruction set.
	 * 
	 * @return The currently active instruction set (function or base)
	 */
	private List<Instruction> instructionSet() {
		if(isFunctionCall) {
			return functionInstructions;
		}else{
			return instructions;
		}
	}
	
	/**
	 * Generates a new unique numeric label.
	 * 
	 * @return Unique numeric label
	 */
	public int generateLabel() {
		return labelCounter++;
	}
}
package neptune.assembly;

/**
 * Class representing an Instruction for the Triangle Abstract Machine.
 * 
 * @author Koen van Urk and Marcel Boersma
 */
public class Instruction {

	/**
	 * Stores the assembly code of an instruction.
	 */
	public String code;
	
	/**
	 * Stores the label, if applicable, for this instruction. 
	 */
	public String label = null;
	
	/**
	 * Constructor to create a new Instruction with given assembly code.
	 * 
	 * @param code Assembly code.
	 */
	public Instruction(String code) {
		this.code = code;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		if(label != null) {
			return label + ": " + code;
		}else{
			return code;
		}
	}
	
	/**
	 * Helper method for creating a STORE instruction.
	 * 
	 * @param address Address relative to LB.
	 * @return New instruction.
	 */
	public static Instruction STORE(int address) {
		String instr = "STORE(1) " + address + "[LB]"; // all types have word length 1
		
		return new Instruction(instr);
	}
	
	/**
	 * Helper method for creating a STOREI instruction.
	 * 
	 * @param size Size of the word to store.
	 * @return New instruction.
	 */
	public static Instruction STOREI(int size) {
		return new Instruction("STOREI(" + size + ")");
	}
	
	/**
	 * Helper method for creating a PUSH instruction.
	 * 
	 * @param size Number of words to push onto the stack.
	 * @return New instruction.
	 */
	public static Instruction PUSH(int size) {
		return new Instruction("PUSH " + size);
	}
	
	/**
	 * Helper method for creating a LOAD instruction.
	 * 
	 * @param address Address relative to LB.
	 * @return New instruction.
	 */
	public static Instruction LOAD(int address) {
		String instr = "LOAD(1) " + address + "[LB]"; // all types have word length 1
		
		return new Instruction(instr);
	}
	
	/**
	 * Helper method for creating a LOAD instruction relative to the stack top.
	 * 
	 * As an example LOAD_ST(4) will generate LOAD(1) -4[ST]. Note the minus!
	 * 
	 * @param address Address relative to ST.
	 * @return New instruction.
	 */
	public static Instruction LOAD_ST(int address) {
		String instr = "LOAD(1) -" + address + "[ST]"; // all types have word length 1
		
		return new Instruction(instr);
	}
	
	/**
	 * Helper method for creating a LOAD instruction for a given number of words.
	 * 
	 * @param address Address relative to LB.
	 * @param words Number of words to load.
	 * @return New instruction.
	 */
	public static Instruction LOAD(int address, int words) {
		String instr = "LOAD(" + words + ") " + address + "[LB]"; // all types have word length 1
		
		return new Instruction(instr);
	}
	
	/**
	 * Helper method to create a LOADA instruction for loading an address onto the stack.
	 * 
	 * @param address Address relative to LB.
	 * @return New instruction.
	 */
	public static Instruction LOADA(int address) {
		return new Instruction("LOADA " + address + "[LB]");
	}
	
	/**
	 * Helper method to create a LOADL instruction for loading a literal onto the stack.
	 * 
	 * @param value Value of the literal.
	 * @return New instruction.
	 */
	public static Instruction LOADL(int value) {
		String instr = "LOADL " + value;
		
		return new Instruction(instr);
	}
	
	/**
	 * Helper method to create a LOADI instruction.
	 * 
	 * @param value Number of words to fetch.
	 * @return New instruction.
	 */
	public static Instruction LOADI(int value) {
		return new Instruction("LOADI(" + value + ")");
	}
	
	/**
	 * Helper method to create a POP instruction.
	 * 
	 * @param itemsToPop Number of words to pop from the stack.
	 * @return New instruction.
	 */
	public static Instruction POP(int itemsToPop) {
		return new Instruction("POP(0) " + itemsToPop);
	}
	
	/**
	 * Helper method to create an INC call.
	 * 
	 * @return New call instruction.
	 */
	public static Instruction INC() {
		return Instruction.CALL("succ");
	}

	/**
	 * Helper method to create an AND call.
	 * 
	 * @return New call instruction.
	 */
	public static Instruction AND() {
		return Instruction.CALL("and");
	}

	/**
	 * Helper method to create an OR call.
	 * 
	 * @return New call instruction.
	 */
	public static Instruction OR() {
		return Instruction.CALL("or");
	}

	/**
	 * Helper method to create an LT call.
	 * 
	 * @return New call instruction.
	 */
	public static Instruction LESS() {
		return Instruction.CALL("lt");
	}
	
	/**
	 * Helper method to create an LE call.
	 * 
	 * @return New call instruction.
	 */
	public static Instruction LESS_EQUAL() {
		return Instruction.CALL("le");
	}
	
	/**
	 * Helper method to create a GT call.
	 * 
	 * @return New call instruction.
	 */
	public static Instruction GREATER() {
		return Instruction.CALL("gt");
	}
	
	/**
	 * Helper method to create a GE call.
	 * 
	 * @return New call instruction.
	 */
	public static Instruction GREATER_EQUAL() {
		return Instruction.CALL("ge");
	}
	
	/**
	 * Helper method to create an EQ call.
	 * 
	 * @return New call instruction.
	 */
	public static Instruction EQUAL() {
		return Instruction.CALL("eq");
	}
	
	/**
	 * Helper method to create a NE call.
	 * @return New call instruction.
	 */
	public static Instruction NOT_EQUAL() {
		return Instruction.CALL("ne");
	}
	
	/**
	 * Helper method to create an ADD call.
	 * 
	 * @return New call instruction.
	 */
	public static Instruction ADD() {
		return Instruction.CALL("add");
	}
	
	/**
	 * Helper method to create a SUB call.
	 * 
	 * @return New call instruction.
	 */
	public static Instruction SUB() {
		return Instruction.CALL("sub");
	}
	
	/**
	 * Helper method to create a MULT call.
	 * 
	 * @return New call instruction.
	 */
	public static Instruction MULT() {
		return Instruction.CALL("mult");
	}
	
	/**
	 * Helper method to create a MOD call.
	 * 
	 * @return New call instruction.
	 */
	public static Instruction MOD() {
		return Instruction.CALL("mod");
	}
	
	/**
	 * Helper method to create a NEG call.
	 * 
	 * @return New call instruction.
	 */
	public static Instruction UNARY_MINUS() {
		return Instruction.CALL("neg");
	}
	
	/**
	 * Helper method to create a NOT call.
	 * 
	 * @return New call instruction.
	 */
	public static Instruction UNARY_NEGATE() {
		return Instruction.CALL("not");
	}
	
	/**
	 * Helper method to create a DIV call.
	 * 
	 * @return New call instruction.
	 */
	public static Instruction DIV() {
		return Instruction.CALL("div");
	}
	
	/**
	 * Helper method to create a PUT call for printing a character.
	 * 
	 * @return New call instruction.
	 */
	public static Instruction PRINT_CHAR() {
		return Instruction.CALL("put");
	}
	
	/**
	 * Helper method to create a PUTINT call for printing a number.
	 * 
	 * @return New call instruction.
	 */
	public static Instruction PRINT_INT() {
		return Instruction.CALL("putint");
	}
	
	/**
	 * Helper method to create a numeric label. Labels generated this way are prefixed with an L.
	 * 
	 * @param labelNumber Number for this label.
	 * @return New labeled empty instruction.
	 */
	public static Instruction LABEL(int labelNumber) {
		Instruction instr = new Instruction("");
		instr.label = "L" + labelNumber;
		
		return instr;
	}
	
	/**
	 * Helper method create a label based on a string.
	 * 
	 * @param str Text for this label.
	 * @return New labeled empty node.
	 */
	public static Instruction LABEL(String str){
		Instruction instr = new Instruction("");
		instr.label = str;
		
		return instr;
	}
	
	/**
	 * Helper method to create a JUMP instruction to a numeric label.
	 * 
	 * @param labelNumber Label number to jump to.
	 * @return New instruction.
	 */
	public static Instruction JUMP(int labelNumber) {
		return new Instruction("JUMP L" + labelNumber + "[CB]");
	}
	
	/**
	 * Helper method to create a JUMP instruction.
	 * 
	 * @param labelNumber Label text to jump to.
	 * @return New instruction.
	 */
	public static Instruction JUMP(String label) {
		return new Instruction("JUMP " + label + "[CB]");
	}
	
	/**
	 * @param value
	 * @param labelNumber
	 * @return
	 */
	public static Instruction JUMPIF(int value, int labelNumber) {
		return new Instruction("JUMPIF(" + value + ") L" + labelNumber + "[CB]");
	}
	
	/**
	 * Helper method to create a CALL instruction to an mnemonic.
	 * 
	 * @param operatorType One of the mnemonic values as defined in the TAM specification.
	 * @return New instruction.
	 */
	public static Instruction CALL(String operatorType) {
		return new Instruction("CALL " + operatorType);
	}
	
	/**
	 * Helper method to create a CALL instruction to a user function.
	 * 
	 * @param label Label of the function to call.
	 * @return New instruction.
	 */
	public static Instruction CALL_LABEL(String label) {
		return new Instruction("CALL(LB) " + label + "[CB]");
	}
	
	/**
	 * Helper method to create a GET call for reading a character.
	 * 
	 * @return New instruction.
	 */
	public static Instruction READ_CHAR() {
		return Instruction.CALL("get");
	}
		
	/**
	 * Helper method to create a GETINT call for reading a number.
	 * 
	 * @return New instruction.
	 */
	public static Instruction READ_INT() {
		return Instruction.CALL("getint");
	}

	/**
	 * Helper method to create a RETURN instruction.
	 * 
	 * @param return_size Size in words of the result.
	 * @param pop_n_word Size in words of the arguments that were used for the function call.
	 * @return
	 */
	public static Instruction RETURN(int return_size, int pop_n_word) {
		return new Instruction("RETURN(" + return_size + ") " + pop_n_word);
	}
	
	/**
	 * Helper method to generate a unique label for a function. It converts
	 * all character to their ASCII value and combines this.
	 * 
	 * @param funcName Name of the function.
	 * @return Unique name for a function label.
	 */
	public static String convertFunctionNameToLabel(String funcName) {
		String result = "";
		for(int i = 0; i < funcName.length(); i++) {
			int ascii = funcName.charAt(i);
			result = result + String.format("%03d", ascii);
		}
		return result;
	}
}

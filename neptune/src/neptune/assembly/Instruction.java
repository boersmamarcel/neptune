package neptune.assembly;

public class Instruction {

	public String code;
	public String label = null;
	
	public Instruction(String code) {
		this.code = code;
	}
	
	public String toString() {
		if(label != null) {
			return label + ": " + code;
		}else{
			return code;
		}
	}
	
	public static Instruction STORE(int address) {
		String instr = "STORE(1) " + address + "[LB]"; // all types have word length 1
		
		return new Instruction(instr);
	}
	
	public static Instruction STOREI(int size) {
		return new Instruction("STOREI(" + size + ")");
	}
	
	public static Instruction PUSH(int size) {
		return new Instruction("PUSH " + size);
	}
	
	public static Instruction LOAD(int address) {
		String instr = "LOAD(1) " + address + "[LB]"; // all types have word length 1
		
		return new Instruction(instr);
	}
	
	public static Instruction LOAD_ST(int address) {
		String instr = "LOAD(1) -" + address + "[ST]"; // all types have word length 1
		
		return new Instruction(instr);
	}
	
	public static Instruction LOAD(int address, int words) {
		String instr = "LOAD(" + words + ") " + address + "[LB]"; // all types have word length 1
		
		return new Instruction(instr);
	}
	
	public static Instruction LOADA(int address) {
		return new Instruction("LOADA " + address + "[LB]");
	}
	
	public static Instruction LOADL(int value) {
		String instr = "LOADL " + value;
		
		return new Instruction(instr);
	}
	
	public static Instruction LOADI(int value) {
		return new Instruction("LOADI(" + value + ")");
	}
	
	public static Instruction POP(int itemsToPop) {
		return new Instruction("POP(0) " + itemsToPop);
	}
	
	public static Instruction INC() {
		return Instruction.CALL("succ");
	}

	public static Instruction AND() {
		return Instruction.CALL("and");
	}

	public static Instruction OR() {
		return Instruction.CALL("or");
	}

	public static Instruction LESS() {
		return Instruction.CALL("lt");
	}
	
	public static Instruction LESS_EQUAL() {
		return Instruction.CALL("le");
	}
	
	public static Instruction GREATER() {
		return Instruction.CALL("gt");
	}
	
	public static Instruction GREATER_EQUAL() {
		return Instruction.CALL("ge");
	}
	
	public static Instruction EQUAL() {
		return Instruction.CALL("eq");
	}
	
	public static Instruction NOT_EQUAL() {
		return Instruction.CALL("ne");
	}
	
	public static Instruction ADD() {
		return Instruction.CALL("add");
	}
	
	public static Instruction SUB() {
		return Instruction.CALL("sub");
	}
	
	public static Instruction MULT() {
		return Instruction.CALL("mult");
	}
	
	public static Instruction MOD() {
		return Instruction.CALL("mod");
	}
	
	public static Instruction UNARY_MINUS() {
		return Instruction.CALL("neg");
	}
	
	public static Instruction UNARY_NEGATE() {
		return Instruction.CALL("not");
	}
	
	public static Instruction DIV() {
		return Instruction.CALL("div");
	}
	
	public static Instruction PRINT_CHAR() {
		return Instruction.CALL("put");
	}
	
	public static Instruction PRINT_INT() {
		return Instruction.CALL("putint");
	}
	
	public static Instruction LABEL(int labelNumber) {
		Instruction instr = new Instruction("");
		instr.label = "L" + labelNumber;
		
		return instr;
	}
	
	public static Instruction LABEL(String str){
		Instruction instr = new Instruction("");
		instr.label = str;
		
		return instr;
	}
	
	public static Instruction JUMP(int labelNumber) {
		return new Instruction("JUMP L" + labelNumber + "[CB]");
	}
	
	public static Instruction JUMP(String labelNumber) {
		return new Instruction("JUMP " + labelNumber + "[CB]");
	}
	
	public static Instruction JUMPIF(int value, int labelNumber) {
		return new Instruction("JUMPIF(" + value + ") L" + labelNumber + "[CB]");
	}
	
	public static Instruction CALL(String operatorType) {
		return new Instruction("CALL " + operatorType);
	}
	
	public static Instruction CALL_LABEL(String label) {
		return new Instruction("CALL(LB) " + label + "[CB]");
	}
	
	public static Instruction READ_CHAR() {
		return Instruction.CALL("get");
	}
		
	public static Instruction READ_INT() {
		return Instruction.CALL("getint");
	}

	public static Instruction RETURN(int return_size, int pop_n_word) {
		return new Instruction("RETURN(" + return_size + ") " + pop_n_word);
	}
	
	public static String convertFunctionNameToLabel(String funcName) {
		String result = "";
		for(int i = 0; i < funcName.length(); i++) {
			int ascii = funcName.charAt(i);
			result = result + String.format("%03d", ascii);
		}
		return result;
	}
}

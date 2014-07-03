tree grammar NeptuneGenerator;

options{
	tokenVocab=Neptune;
	ASTLabelType=CommonTree;
}

@header{
	package neptune;
	
	import neptune.assembly.*;
}

@rulecatch{
	catch(RecognitionException e){
		throw e;
	}
}

@members{
	protected SymbolTable symtab = new SymbolTable();
	public void declare(String s, Type type) throws NeptuneException {
			try {
				symtab.enter(s, new IdEntry(0, type));
			} catch (SymbolTableException e) {
				throw new NeptuneException(e.getMessage());
			}
	}

	protected Program program = new Program();
	
	protected void addTextualInstruction(String code, boolean produces, boolean uses) {
		program.add(new Instruction(code, produces, uses));
	}
	
	protected void addInstruction(Instruction instruction) {
		program.add(instruction);
	}
	
	protected int labelCounter = 0;
	
	protected int newUniqueLabel() {
		return labelCounter++;
	}

}


program
	: ^(PROGRAM {symtab.openScope();} lines) {symtab.closeScope(); program.assemble(symtab.getLargestSize()); }
	;

lines returns[ Type type = new Type(Type.primitive.VOID)]
	: t=line+ {type=t;}
	;

line returns [Type type = new Type(Type.primitive.VOID)]
	: t=expression {type=t;}
	| declaration {type = new Type(Type.primitive.VOID);}
	| logic_statement {type = new Type(Type.primitive.VOID);}
	;

codeblock returns [Type type = null]
	: ^(BLOCK {symtab.openScope();} lines {symtab.closeScope();})
	;

logic_statement
	: while_statement
	| foreach_statement
	| if_statement
	;

while_statement
	@init { int beginLabel = newUniqueLabel(); int endLabel = newUniqueLabel(); }
	: ^(WHILE {
			addInstruction(Instruction.LABEL(beginLabel));
		} expression {
			addInstruction(Instruction.JUMPIF(0, endLabel)); 
			symtab.openScope();
		} lines {
			symtab.closeScope();
			addInstruction(Instruction.JUMP(beginLabel));
			addInstruction(Instruction.LABEL(endLabel));
		}
	)
	;

foreach_statement
	@init {int count = 0; int lastlabel = 0;}
	: ^(FOREACH x=IDENTIFIER {symtab.openScope();} y=IDENTIFIER {
		Type temp_type = symtab.retrieve($y.text).getType();
		count = temp_type.elemCount; 
		declare($x.text, new Type(symtab.retrieve($y.text).getType().type));

		declare("", new Type(Type.primitive.INTEGER)); //loop counter

		addInstruction(Instruction.LOADL(0));
		addInstruction(Instruction.STORE(symtab.retrieve("").getAddress(), new Type(Type.primitive.INTEGER)));

		lastlabel = newUniqueLabel();
		addInstruction(Instruction.LABEL(lastlabel));

		addTextualInstruction("LOADA " + symtab.retrieve($y.text).getAddress() + "[LB]", true, false);
		addInstruction(Instruction.LOAD(symtab.retrieve("").getAddress(), new Type(Type.primitive.INTEGER)));
		addInstruction(Instruction.ADD());
		addTextualInstruction("LOADI(1)",true, true);
		addInstruction(Instruction.STORE(symtab.retrieve($x.text).getAddress(), temp_type));
	}
    lines 
	{
		addInstruction(Instruction.LOAD(symtab.retrieve("").getAddress(), new Type(Type.primitive.INTEGER)));
		addInstruction(Instruction.BINARY("succ"));
		addInstruction(Instruction.STORE(symtab.retrieve("").getAddress(), new Type(Type.primitive.INTEGER)));
		addInstruction(Instruction.LOAD(symtab.retrieve("").getAddress(), new Type(Type.primitive.INTEGER)));
		int endLabel = newUniqueLabel();
		addInstruction(Instruction.JUMPIF(count, endLabel));
		addInstruction(Instruction.JUMP(lastlabel));
		addInstruction(Instruction.LABEL(endLabel));
		symtab.closeScope();
	}) 
	;

if_statement
	@init { int endLabel = newUniqueLabel(); int nextLabel = newUniqueLabel(); boolean containsElse = false; }
	:	^(IF expression {
		addInstruction(Instruction.JUMPIF(0, nextLabel));
		symtab.openScope();
	} lines {
		addInstruction(Instruction.JUMP(endLabel));
		symtab.closeScope();
	}
		(ELSIF {
			addInstruction(Instruction.LABEL(nextLabel));
			nextLabel = newUniqueLabel();
		} expression {
			addInstruction(Instruction.JUMPIF(0, nextLabel));
			symtab.openScope();
		} lines {
			addInstruction(Instruction.JUMP(endLabel));
			symtab.closeScope();
		})* 
		(ELSE {
			containsElse = true;
			addInstruction(Instruction.LABEL(nextLabel));
			symtab.openScope();} lines {symtab.closeScope();
		} )?) {
			if(!containsElse) {
				addInstruction(Instruction.LABEL(nextLabel));
			}
			addInstruction(Instruction.LABEL(endLabel));
		}
	;

print_statement returns [Type type = new Type(Type.primitive.VOID)]
	@init{boolean one=true;}
	: ^(PRINT t=expression {
	
		program.markInstructionStart();

		if(t.isArray) {
			for(int i = 0; i < t.elemCount; i++) {
				addInstruction(Instruction.PRINT(t));
			}
		}else{
			addInstruction(Instruction.PRINT(t));
		}
	} (COMMA t2=expression{

		one=false;
		if(t2.isArray) {
			for(int i = 0; i < t2.elemCount; i++) {
				addInstruction(Instruction.PRINT(t2));
			}
		}else{
			addInstruction(Instruction.PRINT(t2));
		}
	})*) {
		if(one){
			type=t; 
			ArrayList<Instruction> tmp = program.popLastInstructions();

			if(t.isArray) {
				addTextualInstruction("LOAD(" + t.elemCount + ") -" + t.elemCount + "[ST]", true, false);
			}else{
				addTextualInstruction("LOAD(1) -1[ST]", true, false);	
			}
			program.addMultiple(tmp);

		}else{
			type = new Type(Type.primitive.VOID);
		}
	}
	;

read_statement returns [Type type = new Type(Type.primitive.VOID)]
	@init{boolean one=true;}
	: ^(READ (v=variable_use {
			IdEntry entry = symtab.retrieve(v.identifier);
			addTextualInstruction("LOADA " + entry.getAddress() + "[LB]", true, false);
			addInstruction(Instruction.ADD());
			addInstruction(Instruction.READ(entry.getType()));
		}) (COMMA v=variable_use {
			one=false;
			IdEntry entry = symtab.retrieve(v.identifier);
			addTextualInstruction("LOADA " + entry.getAddress() + "[SB]", true, false);
			addInstruction(Instruction.READ(entry.getType()));
		})*) {
		if(one){
			IdEntry entry = symtab.retrieve(v.identifier);
			addInstruction(Instruction.LOAD(entry.getAddress(), entry.getType()));
			type=symtab.retrieve(v.identifier).getType(); 

		}else{
			type = new Type(Type.primitive.VOID);
		}}
	;

declaration
	: ^(VAR t=type x=IDENTIFIER { declare($x.text, t); } (BECOMES expression {
		IdEntry var = symtab.retrieve($x.text);
		
		if(var.getType().isArray) {
			for(int i = 0; i < var.getType().elemCount; i++) {
				addInstruction(Instruction.STORE(var.getAddress() + i, var.getType()));
			}
		}else{
			addInstruction(Instruction.STORE(var.getAddress(), var.getType()));
		}
	})? )
	| ^(CONST t=type x=IDENTIFIER BECOMES expression) {
		declare($x.text, t);
		
		IdEntry var = symtab.retrieve($x.text);
		
		if(var.getType().isArray) {
			for(int i = 0; i < var.getType().elemCount; i++) {
				addInstruction(Instruction.STORE(var.getAddress() + i, var.getType()));
			}
		}else{
			addInstruction(Instruction.STORE(var.getAddress(), var.getType()));
		}
	}
	| ^(FUNCTION {ArrayList<String> argsList = new ArrayList<String>(); symtab.openFunctionScope(); } 
		t=type x=IDENTIFIER 
		{

		String expression_label = $x.text +"0";
		// String jump_over_label = $x.text +"1";
		// jump over the function code
		//addInstruction(Instruction.JUMP(jump_over_label));
		//add the expression label for function calls
		//TODO: STORE FUNCTION ADDRESS IN FUNCTION TABLE
		addInstruction(Instruction.LABEL(expression_label));
		}
		(
		argt=type arg=IDENTIFIER 
		{
			//arguments are on top of the stack
			argsList.add($arg.text);
		}
		)+ 
		{
			int argcount=0;
			
			program.markInstructionStart();
			
			declare("_" + $x.text, t);
			
			symtab.openScope();
			
			for(String argString : argsList){
				declare(argString, new Type(Type.primitive.INTEGER));

				//store the argument value on top of the stack into the local variables
				addTextualInstruction("LOAD(1) -"+(argsList.size()-argcount)+"[LB]", true, false);
				addTextualInstruction("STORE(1) "+symtab.retrieve(argString).getAddress()+"[LB]", false, true); 

				argcount++;
			}

			int prevSize = symtab.getSize();
				
		} line* return_type=return_statement {
			ArrayList<Instruction> tmp = program.popLastInstructions();
			addTextualInstruction("PUSH "+(symtab.getFunctionSize()), false, false);
			program.addMultiple(tmp);
			
		}) 
	 {
		symtab.closeScope();
		addInstruction(Instruction.RETURN(t,argcount));
		//addInstruction(Instruction.LABEL(jump_over_label));
		symtab.closeFunctionScope();

	}
	;

return_statement returns[Type type = new Type(Type.primitive.VOID)]
	:	^(RETURN t=expression {type = t;})
;

expression returns [Type type = new Type(Type.primitive.VOID)]
	: t=assignment_expr {type = t;}
	;

assignment_expr returns [Type type = new Type(Type.primitive.VOID)]
	: t=and_or_expr {type=t;}
	| ^(BECOMES {
		program.markInstructionStart();
	} x=variable_use {
		ArrayList<Instruction> usedInstructions = program.popLastInstructions();
	} expression {
		IdEntry var = symtab.retrieve(x.identifier);
		type = x.type;
		
		if(x.isIndexIntoArray) {
			addTextualInstruction("LOAD(1) -1[ST]", true, true);
			program.addMultiple(usedInstructions);
			addTextualInstruction("LOADA " + var.getAddress() + "[LB]", true, false);
			addInstruction(Instruction.ADD());
			addTextualInstruction("STOREI(1)", false, true);
			
		}else{
			if(type.isArray) {
				for(int i = 0; i < var.getType().elemCount; i++) {
					addInstruction(Instruction.STORE(var.getAddress() + i, var.getType()));
				}

				for(int i = var.getType().elemCount - 1; i >= 0; i--) {
					addInstruction(Instruction.LOAD(var.getAddress() + i, var.getType()));
				}
			}else{
				addInstruction(Instruction.STORE(var.getAddress(), var.getType()));
				addInstruction(Instruction.LOAD(var.getAddress(), var.getType()));
			}
		}
	})
	;

and_or_expr returns [Type type = new Type(Type.primitive.VOID)]
	: t=boolean_expr							{type = t;}
	| ^(AND expression expression) 				{
		type = new Type(Type.primitive.BOOLEAN);
		addInstruction(Instruction.BINARY("and"));
	}
	| ^(OR expression expression)			{
		type = new Type(Type.primitive.BOOLEAN);
		addInstruction(Instruction.BINARY("or"));
	}
	;

boolean_expr returns [Type type = new Type(Type.primitive.VOID)]
	: t=plus_expr 								{type = t;}
	| ^(LT expression expression) 				{
		type = new Type(Type.primitive.BOOLEAN);
		addInstruction(Instruction.BINARY("lt"));
	}
	| ^(LT_EQ expression expression)			{
		type = new Type(Type.primitive.BOOLEAN);
		addInstruction(Instruction.BINARY("le"));
	}
	| ^(GT expression expression)				{
		type = new Type(Type.primitive.BOOLEAN);
		addInstruction(Instruction.BINARY("gt"));
	}
	| ^(GT_EQ expression expression)			{
		type = new Type(Type.primitive.BOOLEAN);
		addInstruction(Instruction.BINARY("ge"));
	}
	| ^(EQ expression expression)				{
		type = new Type(Type.primitive.BOOLEAN);
		addInstruction(Instruction.LOADL(1));
		addInstruction(Instruction.BINARY("eq"));
	}
	| ^(NEQ expression expression)				{
		type = new Type(Type.primitive.BOOLEAN);
		addInstruction(Instruction.LOADL(1));
		addInstruction(Instruction.BINARY("ne"));
	}
	;

plus_expr returns [Type type = new Type(Type.primitive.VOID)]
	: t=multi_expr 						{type=t;}
	| ^(PLUS expression expression)		{
		type = new Type(Type.primitive.INTEGER);
		addInstruction(Instruction.ADD());
	}
	| ^(MINUS expression expression) 	{
		type = new Type(Type.primitive.INTEGER);
		addInstruction(Instruction.SUB());
	}
	;


multi_expr returns [Type type = null]
	: t=unary_expr						{type=t;}
	| ^(TIMES expression expression)	{
		type = new Type(Type.primitive.INTEGER);
		addInstruction(Instruction.MULT());
	}
	| ^(DIVIDE expression expression)	{
		type = new Type(Type.primitive.INTEGER);
		addInstruction(Instruction.DIV());
	}
	| ^(MOD expression expression)		{
		type = new Type(Type.primitive.INTEGER);
		addInstruction(Instruction.BINARY("mod"));
	}
	;
	
unary_expr returns [Type type = new Type(Type.primitive.VOID) ]
	: t=operand								{type = t;}
	| ^(UNARY_MINUS o=expression) {
		type = o;
		addInstruction(Instruction.BINARY("neg"));
	}
	| ^(UNARY_PLUS o=expression) {
		type = o;
	}
	| ^(NEGATE o=expression) {
		type = o;
		addInstruction(Instruction.BINARY("not"));
	}
	;

operand returns [Type type=new Type(Type.primitive.VOID)]
	: t=print_statement				{type = t;}
	| t=read_statement				{type = t;}
	| ^(FUNCTION x=IDENTIFIER ^(ARRAY_SET expression+) {
		addTextualInstruction("CALL(LB) "+$x.text+"0[CB]", true, false);
		type = symtab.retrieve("_" + $x.text).getType();
	})
	| v=variable_expression			{type = v.type;}
/*	| { int index = -1; } x=IDENTIFIER (^(ARRAY_DEF n=NUMBER { index = Integer.parseInt($n.text); }))? {
		IdEntry var = symtab.retrieve($x.text);
		type = new Type(var.getType().type);
		type.isArray = var.getType().isArray;
		type.elemCount = var.getType().elemCount;
		
		if(index > -1) {
			type.isArray = false;
		}
		
		if(index == -1) {
			index = 0;
		}
		
		if(type.isArray) {
			for(int i = type.elemCount - 1; i >= 0; i--) {
				addInstruction(Instruction.LOAD(var.getAddress() + i, type));
			}
		}else{
			addInstruction(Instruction.LOAD(var.getAddress() + index, var.getType()));
		}
	}*/
	| n=NUMBER 						{
		type = new Type(Type.primitive.INTEGER);
		addInstruction(Instruction.LOADL(Integer.parseInt($n.text)));
	}
	| {ArrayList<ArrayList<Instruction>> tmp_instructions = new ArrayList<ArrayList<Instruction>>(); int index = 0;} ^(ARRAY_SET ({program.markInstructionStart(); index++;}t=expression {
		type = t;
		tmp_instructions.add(program.popLastInstructions());
	})+) { 
		for(int i = tmp_instructions.size() - 1; i >= 0; i--){
			program.addMultiple(tmp_instructions.get(i));
		}
		t.isArray = true;
		t.elemCount = index;
	}	
	| TRUE 							{
		type = new Type(Type.primitive.BOOLEAN);
		addInstruction(Instruction.LOADL(1));
	}
	| FALSE 						{
		type = new Type(Type.primitive.BOOLEAN);
		addInstruction(Instruction.LOADL(0));
	}
	| c=CHAR_LITERAL 					{
		type = new Type(Type.primitive.CHAR);
		addInstruction(Instruction.LOADL((int)$c.text.charAt(1)));
	}
	| s=STRING_LITERAL				{
		type = new Type(Type.primitive.CHAR, 0);
		String ts = $s.text;
		ts = ts.substring(1, ts.length()-1);
		for(int i = ts.length() - 1; i >= 0; i--) {
			addInstruction(Instruction.LOADL((int)ts.charAt(i)));
		}
		type.elemCount = ts.length();
		type.isArray = true;
	}
	| t=codeblock					{type = t;}						

	| ^(SIZEOF id=IDENTIFIER) {
		type = new Type(Type.primitive.INTEGER);
		IdEntry entry = symtab.retrieve($id.text);
		if(!entry.getType().isArray) {
			throw new NeptuneException($id,"not an array, invalid use of sizeof function");
		}
		
		addInstruction(Instruction.LOADL(entry.getType().elemCount));
	}
	;
	
variable_expression returns [Variable result = new Variable() ]
	:	^(ATOMIC_VAR x=IDENTIFIER)			{
		IdEntry var = symtab.retrieve($x.text);
		result.type = symtab.retrieve($x.text).getType();
		result.identifier = $x.text;
		
		if(result.type.isArray) {
			for(int i = result.type.elemCount - 1; i >= 0; i--) {
				addInstruction(Instruction.LOAD(var.getAddress() + i, result.type));
			}
		}else{
			addInstruction(Instruction.LOAD(var.getAddress(), var.getType()));
		}
	}
	|	^(ARRAY_VAR x=IDENTIFIER expression)	{
		IdEntry var = symtab.retrieve($x.text);
		
		addTextualInstruction("LOAD(1) -1[ST]", true, true);
		addTextualInstruction("LOADL " + var.getType().elemCount, true, false);
		addTextualInstruction("CALL(LB) valid[CB]", false, true);
		
		Type newType = new Type(var.getType().type);
		result.type = newType;
		result.identifier = $x.text;
		result.isIndexIntoArray = true;
		
		addTextualInstruction("LOADA " + var.getAddress() + "[LB]", true, false);
		addInstruction(Instruction.ADD());
		addTextualInstruction("LOADI(1)", true, true);
	}
	;

variable_use returns [Variable result = new Variable() ]
	:	^(ATOMIC_VAR x=IDENTIFIER)			{
		IdEntry var = symtab.retrieve($x.text);
		result.type = symtab.retrieve($x.text).getType();
		result.identifier = $x.text;
	}
	|	^(ARRAY_VAR x=IDENTIFIER expression)	{
		IdEntry var = symtab.retrieve($x.text);
		
		Type newType = new Type(var.getType().type);
		result.type = newType;
		result.identifier = $x.text;
		result.isIndexIntoArray = true;
	}
	;

type returns [Type type = new Type(Type.primitive.VOID)]
	: INTEGER count=array_def? {
		if(count > 0){
			type = new Type(Type.primitive.INTEGER, count);
		}else{
			type = new Type(Type.primitive.INTEGER);
		}}
	| CHAR count=array_def? {
		if(count > 0){
			type = new Type(Type.primitive.CHAR, count);
		}else{
			type = new Type(Type.primitive.CHAR);
		}}
	| BOOLEAN count=array_def? {
		if(count > 0){
			type = new Type(Type.primitive.BOOLEAN, count);
		}else{
			type = new Type(Type.primitive.BOOLEAN);
		}}
	;

array_def returns [int count = 0]
	: ^(ARRAY_DEF x=NUMBER { count = Integer.parseInt($x.text); })
	;
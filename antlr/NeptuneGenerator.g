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

}


program
	: ^(PROGRAM {symtab.openScope();} lines) {symtab.closeScope(); program.assemble(symtab.getLargestSize()); }
	;

lines returns[ Type type = null]
	: t=line+ {type=t;}
	;

line returns [Type type = null]
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
	@init { int beginLabel = labelCounter; labelCounter++; int endLabel = labelCounter; labelCounter++; }
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

		addInstruction(Instruction.LABEL(labelCounter));
		lastlabel = labelCounter;
		labelCounter++;

		addTextualInstruction("LOADA " + symtab.retrieve($y.text).getAddress() + "[SB]", true, false);
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
		addInstruction(Instruction.JUMPIF(count, labelCounter));
		addInstruction(Instruction.JUMP(lastlabel));
		addInstruction(Instruction.LABEL(labelCounter));
		labelCounter++;
		symtab.closeScope();
	}) 
	;

if_statement
	@init { int endLabel = labelCounter; labelCounter++; int nextLabel = labelCounter; labelCounter++; boolean containsElse = false; }
	:	^(IF expression {
		addInstruction(Instruction.JUMPIF(0, nextLabel));
		symtab.openScope();
	} lines {
		addInstruction(Instruction.JUMP(endLabel));
		symtab.closeScope();
	}
		(ELSIF {
			addInstruction(Instruction.LABEL(nextLabel));
			nextLabel = labelCounter;
			labelCounter++;
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

print_statement returns [Type type = null]
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
			}}
	;

read_statement returns [Type type = null]
	@init{boolean one=true;}
	: ^(READ (t=IDENTIFIER {
			IdEntry entry= symtab.retrieve($t.text);
			addTextualInstruction("LOADA " + entry.getAddress() + "[SB]", true, false);
			addInstruction(Instruction.READ(entry.getType()));

		}) (COMMA t2=IDENTIFIER{
			one=false;
			IdEntry entry= symtab.retrieve($t2.text);
			addTextualInstruction("LOADA " + entry.getAddress() + "[SB]", true, false);
			addInstruction(Instruction.READ(entry.getType()));
		})*) {
		if(one){
			IdEntry entry= symtab.retrieve($t.text);
			addInstruction(Instruction.LOAD(entry.getAddress(), entry.getType()));
			type=symtab.retrieve($t.text).getType(); 

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
		//const cannot change in the future
			declare($x.text, t);
		}
	;

expression returns [Type type = null]
	: t=assignment_expr {type = t;}
	;

assignment_expr returns [Type type = null]
	: t=and_or_expr {type=t;}
	| { int index = -1; }^(BECOMES x=IDENTIFIER (^(ARRAY_DEF n=NUMBER { index = Integer.parseInt($n.text); }))? expression) {
		IdEntry var = symtab.retrieve($x.text);
		
		if(var.getType().isArray && index == -1) {
			for(int i = 0; i < var.getType().elemCount; i++) {
				addInstruction(Instruction.STORE(var.getAddress() + i, var.getType()));
			}
		}else{
			if(index == -1) {
				index = 0;
			}
			
			addInstruction(Instruction.STORE(var.getAddress() + index, var.getType()));
		}
	}
	;

and_or_expr returns [Type type = null]
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

boolean_expr returns [Type type = null]
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
		addInstruction(Instruction.BINARY("neq"));
	}
	;

plus_expr returns [Type type = null]
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
	: t=operand							{type=t;}
	| ^(TIMES expression expression)	{
		type = new Type(Type.primitive.INTEGER);
		addInstruction(Instruction.MULT());
	}
	| ^(DIVIDE expression expression)	{
		type = new Type(Type.primitive.INTEGER);
		addInstruction(Instruction.DIV());
	}
	;

operand returns [Type type=null]
	: { int index = -1; } x=IDENTIFIER (^(ARRAY_DEF n=NUMBER { index = Integer.parseInt($n.text); }))? {
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
	}
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
	| t=print_statement				{type = t;}
	| t=read_statement				{type = t;}
	;

type returns [Type type = null]
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





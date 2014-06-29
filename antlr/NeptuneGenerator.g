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
	: ^(FOREACH x=IDENTIFIER {symtab.openScope();} y=IDENTIFIER { declare($x.text, new Type(symtab.retrieve($y.text).getType().type)); } lines {symtab.closeScope();}) 
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
		addInstruction(Instruction.PRINT(t));
	} (COMMA expression{one=false;})*) {
		if(one){
			type=t; 
		}else{
			type = new Type(Type.primitive.VOID);
			}}
	;

read_statement returns [Type type = null]
	@init{boolean one=true;}
	: ^(READ (t=IDENTIFIER) (COMMA IDENTIFIER{one=false;})*) {
		if(one){
			type=symtab.retrieve($t.text).getType(); 
		}else{
			type = new Type(Type.primitive.VOID);
		}}
	;

declaration
	: ^(VAR t=type x=IDENTIFIER { declare($x.text, t); } (BECOMES expression {
		IdEntry var = symtab.retrieve($x.text);
		
		if(var.getType().isArray) {
			for(int i = var.getType().elemCount-1; i >=0; i--) {
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
			for(int i = var.getType().elemCount-1; i >=0; i--) {
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
		addInstruction(Instruction.BINARY("eq"));
	}
	| ^(NEQ expression expression)				{
		type = new Type(Type.primitive.BOOLEAN);
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
	: { int index = 0; } x=IDENTIFIER (^(ARRAY_DEF n=NUMBER { index = Integer.parseInt($n.text); }))? {
		IdEntry var = symtab.retrieve($x.text);
		type = var.getType();
		addInstruction(Instruction.LOAD(var.getAddress() + index, var.getType()));
	}
	| n=NUMBER 						{
		type = new Type(Type.primitive.INTEGER);
		addInstruction(Instruction.LOADL(Integer.parseInt($n.text)));
	}
	| ^(ARRAY_SET (t=expression{type = t;})+)	
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
		for(int i = 0; i < ts.length(); i++) {
			addInstruction(Instruction.LOADL((int)ts.charAt(i)));
		}
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
	: ^(ARRAY_DEF x=NUMBER) { count = Integer.parseInt($x.text); }
	;





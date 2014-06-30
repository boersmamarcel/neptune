tree grammar NeptuneChecker;

options{
	tokenVocab=Neptune;
	ASTLabelType=CommonTree;
}

@header{
	package neptune;
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

	public boolean isDeclared(String s){ return (symtab.retrieve(s) != null);}

}


program
	: ^(PROGRAM {symtab.openScope();} lines) {symtab.closeScope();}
	;

lines returns[ Type type = new Type(Type.primitive.VOID) ]
	: t=line+ {type=t;}
	;

line returns [Type type = new Type(Type.primitive.VOID) ]
	: t=expression {type=t;}
	| declaration {type = new Type(Type.primitive.VOID);}
	| logic_statement {type = new Type(Type.primitive.VOID);}
	;

codeblock returns [Type type = new Type(Type.primitive.VOID) ]
	: ^(BLOCK {symtab.openScope();} lines {symtab.closeScope();})
	;

logic_statement
	: while_statement
	| foreach_statement
	| if_statement
	;

while_statement
	: ^(WHILE expression {symtab.openScope();} lines {symtab.closeScope();})
	;

foreach_statement
	: ^(FOREACH x=IDENTIFIER {symtab.openScope();} y=IDENTIFIER { 
		if(!isDeclared($y.text)){
			throw new NeptuneException($y,"is not declared");
		}
		if(!symtab.retrieve($y.text).getType().isArray){
			throw new NeptuneException($y,"is not an array");
		}
		declare($x.text, new Type(symtab.retrieve($y.text).getType().type));
		} lines {symtab.closeScope();}) 
	;

if_statement
	:	^(IF expression {symtab.openScope();} lines {symtab.closeScope();}
		(ELSIF expression {symtab.openScope();} lines {symtab.closeScope();})* 
		(ELSE {symtab.openScope();} lines {symtab.closeScope();})?)
	;

print_statement returns [Type type = new Type(Type.primitive.VOID) ]
	@init{boolean one=true;}
	: ^(PRINT t=expression (COMMA expression{one=false;})*) {
		if(one){
			type=t; 
		}else{
			type = new Type(Type.primitive.VOID);
		}
	}
	;

read_statement returns [Type type = new Type(Type.primitive.VOID) ]
	@init{boolean one=true;}
	: ^(READ (t=IDENTIFIER) (COMMA IDENTIFIER{one=false;})*) {
		if(one){
			type=symtab.retrieve($t.text).getType(); 
		}else{
			type = new Type(Type.primitive.VOID);
		}}
	;

declaration
	: ^(VAR t=type x=IDENTIFIER (BECOMES ex=expression {
		if(ex.isArray != t.isArray || ex.elemCount != t.elemCount) {
			throw new NeptuneException($x,"invalid declaration assignment (non-array or count mismatch)");
		}
	})?) {
			declare($x.text, t);
		}
	| ^(CONST t=type x=IDENTIFIER BECOMES ex=expression) {
		//const cannot change in the future
		t.isConstant = true;
		declare($x.text, t);
		
		if(ex.isArray != t.isArray || ex.elemCount != t.elemCount) {
			throw new NeptuneException($x,"invalid declaration assignment (non-array or count mismatch)");
		}
	}
	;

expression returns [Type type = new Type(Type.primitive.VOID) ]
	: t=assignment_expr {type = t;}
	;

assignment_expr returns [Type type = new Type(Type.primitive.VOID) ]
	: t=and_or_expr {type=t;}
	| { boolean isIndexAccess = false; } ^(BECOMES x=IDENTIFIER {
		//x needs to be defined beforehand
		if(!isDeclared($x.text)){
			throw new NeptuneException($x,"is not declared");
		}
		if(symtab.retrieve($x.text).getType().isConstant) {
			throw new NeptuneException($x,"cannot be redeclared (constant)");
		}
	} (^(ARRAY_DEF n=NUMBER {
		isIndexAccess = true;
		
		Type tmp = symtab.retrieve($x.text).getType();
		if(!tmp.isArray) {
			throw new NeptuneException($x,"is not an array");
		}
		
		if(Integer.parseInt($n.text) >= tmp.elemCount) {
			throw new NeptuneException($x,"index out of bounds");
		}
	}))? ex=expression {
		Type idType = symtab.retrieve($x.text).getType();
		if(!isIndexAccess && (ex.isArray != idType.isArray || ex.elemCount != idType.elemCount)) {
			throw new NeptuneException($x,"invalid assignment (non-array or count mismatch)");
		}
	})
	;
	
and_or_expr returns [Type type = new Type(Type.primitive.VOID) ]
	: t=boolean_expr							{type = t;}
	| ^(AND e1=expression e2=expression) 		{
		type = new Type(Type.primitive.BOOLEAN);
		if(e1.isArray || e1.type != Type.primitive.BOOLEAN) {
			throw new NeptuneException("invalid left operand type for function &&");
		}
		if(e2.isArray || e2.type != Type.primitive.BOOLEAN) {
			throw new NeptuneException("invalid right operand type for function &&");
		}
	}
	| ^(OR e1=expression e2=expression) 		{
		type = new Type(Type.primitive.BOOLEAN);
		if(e1.isArray || e1.type != Type.primitive.BOOLEAN) {
			throw new NeptuneException("invalid left operand type for function ||");
		}
		if(e2.isArray || e2.type != Type.primitive.BOOLEAN) {
			throw new NeptuneException("invalid right operand type for function ||");
		}
	}
	;

boolean_expr returns [Type type = new Type(Type.primitive.VOID) ]
	: t=plus_expr 								{type = t;}
	| ^(LT expression expression) 				{type = new Type(Type.primitive.BOOLEAN);}
	| ^(LT_EQ expression expression)			{type = new Type(Type.primitive.BOOLEAN);}
	| ^(GT expression expression)				{type = new Type(Type.primitive.BOOLEAN);}
	| ^(GT_EQ expression expression)			{type = new Type(Type.primitive.BOOLEAN);}	
	| ^(EQ expression expression)				{type = new Type(Type.primitive.BOOLEAN);}
	| ^(NEQ expression expression)				{type = new Type(Type.primitive.BOOLEAN);}
	;

plus_expr returns [Type type = new Type(Type.primitive.VOID) ]
	: t=multi_expr 						{type=t;}
	| ^(PLUS expression expression)		{type = new Type(Type.primitive.INTEGER);}
	| ^(MINUS expression expression) 	{type = new Type(Type.primitive.INTEGER);}
	;

multi_expr returns [Type type = new Type(Type.primitive.VOID) ]
	: t=operand							{type=t;}
	| ^(TIMES expression expression)	{type = new Type(Type.primitive.INTEGER);}
	| ^(DIVIDE expression expression)	{type = new Type(Type.primitive.INTEGER);}
	;

operand returns [Type type=new Type(Type.primitive.VOID) ]
	: x=IDENTIFIER					{
		if(!isDeclared($x.text)){
			throw new NeptuneException($x,"is not declared");
		}
		type = symtab.retrieve($x.text).getType();
	} (^(ARRAY_DEF n=NUMBER {
		type = symtab.retrieve($x.text).getType();
		if(!type.isArray) {
			throw new NeptuneException($x,"is not an array");
		}
		if(Integer.parseInt($n.text) >= type.elemCount) {
			throw new NeptuneException($x,"array out of bounds");
		}
	}))?
	| NUMBER 						{type = new Type(Type.primitive.INTEGER);}
	| {int numElements = 0; } ^(ARRAY_SET (t=expression{type = t; numElements++; })+) { type.elemCount = numElements; type.isArray = true; }
	| TRUE 							{type = new Type(Type.primitive.BOOLEAN);}
	| FALSE 						{type = new Type(Type.primitive.BOOLEAN);}
	| CHAR_LITERAL 					{type = new Type(Type.primitive.CHAR);}
	| str=STRING_LITERAL			{
		type = new Type(Type.primitive.CHAR, 0);
		type.isArray = true;
		type.elemCount = $str.text.length()-2;
	}
	| t=codeblock					{type = t;}						
	| t=print_statement				{type = t;}
	| t=read_statement				{type = t;}
	;

type returns [Type type = new Type(Type.primitive.VOID) ]
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





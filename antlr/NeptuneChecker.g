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
	
	public void checkBinaryOperator(Type e1, Type e2) throws NeptuneException {
		if(e1.isArray) {
			throw new NeptuneException("left hand side of operator cannot be array");
		}
		
		if(e2.isArray) {
			throw new NeptuneException("right hand side of operator cannot be array");
		}
		
		if(e1.type == Type.primitive.BOOLEAN || e1.type == Type.primitive.VOID) {
			throw new NeptuneException("invalid operand type for left hand side");
		}
		
		if(e2.type == Type.primitive.BOOLEAN || e2.type == Type.primitive.VOID) {
			throw new NeptuneException("invalid operand type for right hand side");
		}
	}

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
	: ^(READ (t=IDENTIFIER {
		if(symtab.retrieve($t.text).getType().type == Type.primitive.BOOLEAN) {
			throw new NeptuneException($t,"cannot read into boolean variable");
		}
		
		if(symtab.retrieve($t.text).getType().isConstant) {
			throw new NeptuneException($t,"cannot read into constant variable");
		}
	}) (COMMA t1=IDENTIFIER {
		if(symtab.retrieve($t1.text).getType().type == Type.primitive.BOOLEAN) {
			throw new NeptuneException($t1,"cannot read into boolean variable");
		}
		
		if(symtab.retrieve($t1.text).getType().isConstant) {
			throw new NeptuneException($t1,"cannot read into constant variable");
		}
		one=false;
	})*) {
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
	| ^(FUNCTION t=type x=IDENTIFIER 
	{
		symtab.openScope();
		declare($x.text, t);
	} 
	(argt=type args=IDENTIFIER { declare($args.text, argt); })+ line* return_type=return_statement) 
	{
		if(t.type != return_type.type){
			throw new NeptuneException("invalid return type");
		}

		symtab.closeScope();}
	;

return_statement returns[Type type = null]
	:	^(RETURN t=expression {type = t;})
;

expression returns [Type type = new Type(Type.primitive.VOID) ]
	: t=assignment_expr {type = t;}
	;

assignment_expr returns [Type type = new Type(Type.primitive.VOID) ]
	: t=and_or_expr {type=t;}
	| ^(BECOMES x=variable_use expression) // check shit.
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
	| ^(LT e1=expression e2=expression) 				{
		checkBinaryOperator(e1, e2);
		type = new Type(Type.primitive.BOOLEAN);
	}
	| ^(LT_EQ e1=expression e2=expression)			{
		checkBinaryOperator(e1, e2);
		type = new Type(Type.primitive.BOOLEAN);
	}
	| ^(GT e1=expression e2=expression)				{
		checkBinaryOperator(e1, e2);
		type = new Type(Type.primitive.BOOLEAN);
	}
	| ^(GT_EQ e1=expression e2=expression)			{
		checkBinaryOperator(e1, e2);
		type = new Type(Type.primitive.BOOLEAN);
	}
	| ^(EQ expression expression)				{type = new Type(Type.primitive.BOOLEAN);}
	| ^(NEQ expression expression)				{type = new Type(Type.primitive.BOOLEAN);}
	;

plus_expr returns [Type type = new Type(Type.primitive.VOID) ]
	: t=multi_expr 						{type=t;}
	| ^(PLUS e1=expression e2=expression)		{
		checkBinaryOperator(e1, e2);
		type = new Type(Type.primitive.INTEGER);
	}
	| ^(MINUS e1=expression e2=expression) 	{
		checkBinaryOperator(e1, e2);
		type = new Type(Type.primitive.INTEGER);
	}
	;

multi_expr returns [Type type = new Type(Type.primitive.VOID) ]
	: t=unary_expr						{type=t;}
	| ^(TIMES e1=expression e2=expression)	{
		checkBinaryOperator(e1, e2);
		type = new Type(Type.primitive.INTEGER);}
	| ^(DIVIDE e1=expression e2=expression)	{
		type = new Type(Type.primitive.INTEGER);
		checkBinaryOperator(e1, e2);
	}
	| ^(MOD e1=expression e2=expression)		{
		checkBinaryOperator(e1, e2);
		type = new Type(Type.primitive.INTEGER);
	}
	;
	
unary_expr returns [Type type = new Type(Type.primitive.VOID) ]
	: t=operand								{type = t;}
	| ^(UNARY_MINUS o=expression) {
		if(o.type != Type.primitive.INTEGER || o.isArray) {
			throw new NeptuneException("invalid operand for unary -");
		}

		type = o;
	}
	| ^(UNARY_PLUS o=expression) {
		if(o.type != Type.primitive.INTEGER || o.isArray) {
			throw new NeptuneException("invalid operand for unary +");
		}

		type = o;
	}
	| ^(NEGATE o=expression) {
		if(o.type != Type.primitive.BOOLEAN || o.isArray) {
			throw new NeptuneException("invalid operand for unary !");
		}

		type = o;
	}
	;

operand returns [Type type=new Type(Type.primitive.VOID) ]
	: ^(FUNCTION IDENTIFIER ^(ARRAY_SET expression+))
	| v=variable_expression			{type = v.type;}
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
	| ^(SIZEOF id=IDENTIFIER) {
		type = new Type(Type.primitive.INTEGER);
		IdEntry entry = symtab.retrieve($id.text);
		if(!entry.getType().isArray) {
			throw new NeptuneException($id,"not an array, invalid use of sizeof function");
		}
	}
	;
	
variable_expression returns [Variable result = new Variable() ]
	:	^(ATOMIC_VAR x=IDENTIFIER)			{
		if(!isDeclared($x.text)){
			throw new NeptuneException($x,"is not declared");
		}
		result.type = symtab.retrieve($x.text).getType();
	}
	|	^(ARRAY_VAR x=IDENTIFIER ex=expression)	{
		if(!isDeclared($x.text)){
			throw new NeptuneException($x,"is not declared");
		}
		
		result.type = symtab.retrieve($x.text).getType();
		
		if(!result.type.isArray) {
			throw new NeptuneException($x,"is not an array");
		}
		
		if(ex.isArray) {
			throw new NeptuneException($x,"cannot have array as index into array");
		}
		
		if(ex.type != Type.primitive.INTEGER) {
			throw new NeptuneException($x,"index into array must be integer");
		}
		
		Type newType = new Type(result.type.type);
		result.type = newType;
		result.isIndexIntoArray = true;
	}
	;
	
variable_use returns [Variable result = new Variable() ]
	:	^(ATOMIC_VAR x=IDENTIFIER)			{
		if(!isDeclared($x.text)){
			throw new NeptuneException($x,"is not declared");
		}
		result.type = symtab.retrieve($x.text).getType();
	}
	|	^(ARRAY_VAR x=IDENTIFIER ex=expression)	{
		if(!isDeclared($x.text)){
			throw new NeptuneException($x,"is not declared");
		}
		result.type = symtab.retrieve($x.text).getType();
		
		if(!result.type.isArray) {
			throw new NeptuneException($x,"is not an array");
		}
		
		if(ex.isArray) {
			throw new NeptuneException($x,"cannot have array as index into array");
		}
		
		if(ex.type != Type.primitive.INTEGER) {
			throw new NeptuneException($x,"index into array must be integer");
		}
		
		Type newType = new Type(result.type.type);
		result.type = newType;
		result.isIndexIntoArray = true;
	}
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





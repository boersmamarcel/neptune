tree grammar NeptuneChecker;

options{
	tokenVocab=Neptune;
	ASTLabelType=CommonTree;
}

@header{
	package Neptune;
}

@rulecatch{
	catch(RecognitionException e){
		throw e;
	}
}

@members{

}


program
	: ^(PROGRAM lines)
	;

lines
	: line+
	;

line
	: expression
	| declaration
	| logic_statement
	;

codeblock
	: ^(BLOCK lines)
	;

logic_statement
	: while_statement
	| foreach_statement
	| if_statement
	;

while_statement
	: ^(WHILE expression lines)
	;

foreach_statement
	: ^(FOREACH identifier identifier lines)
	;

if_statement
	:	^(IF expression lines 
		(ELSIF expressions lines)* 
		(ELSE lines)?)
	;

print_statement
	:^(PRINT expression (COMMA expression)*)
	;

read_statement
	: ^(READ expression (COMMA expression)*)
	;

declaration
	: ^(VAR type IDENTIFIER (BECOMES expression)?)
	| ^(CONST type IDENTIFIER BECOMES expression)
	;

expression
	: assignment_expr
	;

assignment_expr
	: boolean_expr 
	| ^(BECOMES IDENTIFIER expression)?
	;

boolean_expr
	: plus_expr
	| ^(LT expression expression)
	| ^(LT_EQ expression expression)
	| ^(GT expression expression)
	| ^(GT_EQ expression expression)
	| ^(EQ expression expression)
	| ^(NEQ expression expression)
	;

plus_expr
	: multi_expr 
	| ^(PLUS expression expression)
	| ^(MINUS expression expression)
	;

multi_expr
	: operand
	| ^(TIMES expression expression)
	| ^(DIVIDE expression expression)
	;

operand
	: IDENTIFIER
	| NUMBER
	| assignment_expr
	| ^(ARRAY_SET expression+)
	| print_statement
	| read_statement
	| TRUE 
	| FALSE
	| CHAR_LITERAL
	| STRING_LITERAL
	| codeblock
	;

type
	: ^(IDENTIFIER array_def?)
	| ^(CHAR array_def?)
	| ^(BOOLEAN array_def?)
	;

array_def
	: NUMBER?
	;



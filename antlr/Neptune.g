grammar Neptune;

options {
    k=1;                                // LL(1) - do not use LL(*)
    language=Java;                      // target language is Java (= default)
    output=AST;                         // build an AST
}

tokens {
    COLON       =   ':'     ;
    SEMICOLON   =   ';'     ;
    LPAREN      =   '('     ;
    RPAREN      =   ')'     ;
    COMMA       =   ','     ;
	LBRACKET	=   '['		;
	RBRACKET	=	']'		;
	LCURLY		=	'{'		;
	RCURLY		=	'}'		;

    // operators
    BECOMES     =   '='     ;
    PLUS        =   '+'     ;
    MINUS       =   '-'     ;
    TIMES       =   '*'     ;
	DIVIDE		=	'/'		;
	
	UNARY_MINUS	=	'u-'		;
	UNARY_PLUS	=	'u+'		;
	NEGATE		=	'!'		;
	MOD			=	'%'		;
	
	// strings
	DQUOTE		=	'"'		;
	QUOTE		=	'\''	;
	FALSE		=	'false'	;
	TRUE		=	'true'	;

    // keywords
    PROGRAM     =   'program'   ;
	BLOCK		=	'block'		;
    VAR         =   'var'       ;
	CONST		=	'const'		;
    PRINT       =   'print'     ;
	READ		=	'read'		;
	FUNCTION	=	'function'	;
	RETURN		=	'return'	;
	SIZEOF		=	'sizeof'	;

	// types
    INTEGER     =   'int'   ;
	CHAR		=   'char'  ;
	BOOLEAN     =   'bool'  ;

    // control
    IF          =   'if'        ;
    THEN        =   'then'      ;
    ELSE        =   'else'      ;
	ELSIF		=	'elsif'		;
    DO          =   'do'        ;
    WHILE       =   'while'     ;
	FOREACH		=	'foreach'	;
	IN			=	'in'		;

    // binary-operators
    LT          =   '<'         ;
    LT_EQ       =   '<='        ;
    GT          =   '>'         ;
    GT_EQ       =   '>='        ;
    EQ          =   '=='        ;
    NEQ         =   '!='        ;
	AND			=	'&&'		;
	OR			=	'||'		;
	ARRAY_SET	=	'array_set'	;
	ARRAY_DEF	=	'array_def'	;
	ATOMIC_VAR	=	'atomic'	;
	ARRAY_VAR	=	'array_var'	;
}


@lexer::header {
package neptune;
}

@header {
package neptune;
}


// Parser rules

program
    :   lines EOF
            ->  ^(PROGRAM lines)
    ;

lines
	:	line+
	;
	
line
	:	expression SEMICOLON!
	|	declaration SEMICOLON!
	|	logic_statement
	|	return_statement SEMICOLON!
	|	function_declaration
	;
	
codeblock
	:	LCURLY lines RCURLY
		->	^(BLOCK lines)
	;
	
logic_statement
	:	while_statement
	|	foreach_statement
	|	if_statement
	;


	
while_statement
	:	WHILE^ LPAREN! expression RPAREN! LCURLY! lines RCURLY!
	;
	
foreach_statement
	:	FOREACH^ LPAREN! IDENTIFIER IN! IDENTIFIER RPAREN! LCURLY! lines RCURLY!
	;
	
if_statement
	:	IF^ LPAREN! expression RPAREN! LCURLY! lines RCURLY!
		(ELSIF LPAREN! expression RPAREN! LCURLY! lines RCURLY!)*
		(ELSE LCURLY! lines RCURLY!)?
	;
	
print_statement
	:	PRINT^ LPAREN! expression (COMMA! expression)* RPAREN!
	;
	
read_statement
	:	READ^ LPAREN! expression (COMMA! expression)* RPAREN!
	;
	
declaration
	:	type IDENTIFIER (BECOMES expression)?
		-> ^(VAR type IDENTIFIER (BECOMES expression)?)
	|	CONST^ type IDENTIFIER BECOMES expression
	;
	
function_declaration
   	:	FUNCTION type IDENTIFIER LPAREN (type IDENTIFIER (COMMA type IDENTIFIER)*)? RPAREN LCURLY line+ RCURLY
		-> ^(FUNCTION type IDENTIFIER (type IDENTIFIER)* line+)
	;

return_statement
	:	RETURN^ LPAREN! expression RPAREN!
	;
	
expression
	:  assignment_expr
	;
 
assignment_expr
	:	or_expr (BECOMES^ assignment_expr)?
	;
	
or_expr
	:	and_expr (OR^ and_expr)*
	;
	
and_expr
	:	boolean_expr (AND^ boolean_expr)*
	;
	
boolean_expr
	:	plus_expr ((LT^ | LT_EQ^ | GT^ | GT_EQ^ | EQ^ | NEQ^) plus_expr)*
	;

plus_expr
	:	multi_expr ((PLUS^ | MINUS^) multi_expr)*
	;

multi_expr
	:	unary_expr ((TIMES^ | DIVIDE^ | MOD^) unary_expr)*
	;
	
unary_expr
	:	operand
	|	MINUS operand -> ^(UNARY_MINUS operand)
	|	PLUS operand -> ^(UNARY_PLUS operand)
	|	NEGATE^ operand
	;

operand
    :   IDENTIFIER ( -> ^(ATOMIC_VAR IDENTIFIER) | LBRACKET expression RBRACKET -> ^(ARRAY_VAR IDENTIFIER expression)  | (LPAREN (expression (COMMA expression)*)? RPAREN -> ^(FUNCTION IDENTIFIER ^(ARRAY_SET expression*))))
    |   NUMBER
    |   LPAREN! assignment_expr RPAREN!
	|	LBRACKET expression (COMMA expression)* RBRACKET
		->	^(ARRAY_SET expression+)
	|	print_statement
	|	read_statement
	|	SIZEOF^ LPAREN! IDENTIFIER RPAREN!
	|	(TRUE | FALSE)
	|	CHAR_LITERAL
	|	STRING_LITERAL
	|	codeblock
    ;

type
	:	INTEGER	array_def?
	|	CHAR array_def?
	|	BOOLEAN array_def?
	;
	
array_def
	:	 LBRACKET NUMBER RBRACKET
		-> ^(ARRAY_DEF NUMBER)
	;

// Lexer rules

IDENTIFIER
    :   LETTER (LETTER | DIGIT | '_')*
    ;

NUMBER
    :   DIGIT+
    ;

 
COMMENT
    :   '//' .* '\n' 
            { $channel=HIDDEN; }
    ;

CHAR_LITERAL
	:	'\'' ~'\'' '\''
	;

STRING_LITERAL
	:	'"' (~'"')+ '"'
	;

WS
    :   (' ' | '\t' | '\f' | '\r' | '\n')+
            { $channel=HIDDEN; }
    ;

fragment DIGIT  :   ('0'..'9') ;
fragment LOWER  :   ('a'..'z') ;
fragment UPPER  :   ('A'..'Z') ;
fragment LETTER :   LOWER | UPPER ;

// EOF

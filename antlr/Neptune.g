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
	
	// strings
	DQUOTE		=	'"'		;
	QUOTE		=	'\''	;
	FALSE		=	'false'	;
	TRUE		=	'true'	;

    // keywords
    PROGRAM     =   'program'   ;
    VAR         =   'var'       ;
	CONST		=	'const'		;
    PRINT       =   'print'     ;
	READ		=	'read'		;
    INCLUDE     =   'include'   ;
	FUNCTION	=	'function'	;
	RETURN		=	'return'	;

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
	ARRAY_SET	=	'array_set'	;
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
	|	include_statement
	|	logic_statement
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
	
include_statement
	:	INCLUDE^ 'ello'
	;
	
print_statement
	:	PRINT^ LPAREN! expression (COMMA expression)* RPAREN!
	;
	
read_statement
	:	READ^ LPAREN! expression (COMMA expression)* RPAREN!
	;
	
declaration
	:	(VAR^ | CONST^) type IDENTIFIER (BECOMES expression)?
	;
	
expression
	:	assignment_expr
	;

assignment_expr
	:	boolean_expr (BECOMES^ assignment_expr)?
	;
	
boolean_expr
	:	plus_expr ((LT^ | LT_EQ^ | GT^ | GT_EQ^ | EQ^ | NEQ^) plus_expr)*
	;

plus_expr
	:	multi_expr ((PLUS^ | MINUS^) multi_expr)*
	;

multi_expr
	:	operand ((TIMES^ | DIVIDE^) operand)*
	;

operand
    :   IDENTIFIER
    |   NUMBER
    |   LPAREN! assignment_expr RPAREN!
	|	LCURLY expression (COMMA expression)* RCURLY
		->	^(ARRAY_SET expression+)
	|	print_statement
	|	read_statement
	|	(TRUE | FALSE)
	|	QUOTE! (LETTER|DIGIT) QUOTE!
    ;

type
	:	INTEGER	array_def?
	|	CHAR array_def?
	|	BOOLEAN array_def?
	;
	
array_def
	:	 LBRACKET NUMBER? RBRACKET
	;

// Lexer rules

IDENTIFIER
    :   LETTER (LETTER | DIGIT)*
    ;

NUMBER
    :   DIGIT+
    ;


COMMENT
    :   '//' .* '\n' 
            { $channel=HIDDEN; }
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
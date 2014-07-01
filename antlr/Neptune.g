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
	BLOCK		=	'block'		;
    VAR         =   'var'       ;
	CONST		=	'const'		;
    PRINT       =   'print'     ;
	READ		=	'read'		;
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
	AND			=	'&&'		;
	OR			=	'||'		;
	ARRAY_SET	=	'array_set'	;
	ARRAY_DEF	=	'array_def'	;
}

@lexer::members {
    class SaveStruct {
      SaveStruct(CharStream input){
        this.input = input;
        this.marker = input.mark();
      }
      public CharStream input;
      public int marker;
     }
 
     Stack<SaveStruct> includes = new Stack<SaveStruct>();
 
    // We should override this method for handling EOF of included file
     public Token nextToken(){
       Token token = super.nextToken();
 
       if(token.getType() == Token.EOF && includes.size() > 0){
        // We've got EOF and have non empty stack.
         SaveStruct ss = includes.pop();
         setCharStream(ss.input);
         input.rewind(ss.marker);
         //this should be used instead of super [like below] to handle exits from nested includes
         //it matters, when the 'include' token is the last in previous stream (using super, lexer 'crashes' returning EOF token)
         token = this.nextToken();
       }
 
      // Skip first token after switching on another input.
      // You need to use this rather than super as there may be nested include files
       if(((CommonToken)token).getStartIndex() < 0)
         token = this.nextToken();
 
       return token;
     }
 }

@lexer::header {
package neptune;

import java.io.File;
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
	:	PRINT^ LPAREN! expression (COMMA expression)* RPAREN!
	;
	
read_statement
	:	READ^ LPAREN! expression (COMMA expression)* RPAREN!
	;
	
declaration
	:	type IDENTIFIER (BECOMES expression)?
		-> ^(VAR type IDENTIFIER (BECOMES expression)?)
	|	CONST^ type IDENTIFIER BECOMES expression
	|   FUNCTION type IDENTIFIER LPAREN type IDENTIFIER (COMMA type IDENTIFIER)* RPAREN LCURLY line* return_statement RCURLY
		-> ^(FUNCTION type IDENTIFIER (type IDENTIFIER)* line* return_statement)
	;

return_statement
	:	RETURN^ LPAREN! expression RPAREN! SEMICOLON!
;
	
expression
	:  assignment_expr
	;

assignment_expr
	:	and_or_expr (BECOMES^ assignment_expr)?
	;
	
and_or_expr
	:	boolean_expr ((AND^ | OR^) boolean_expr)*
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
    :   IDENTIFIER ((array_def? ->	^(IDENTIFIER array_def?))| (LPAREN (expression (COMMA expression)*)? RPAREN -> ^(FUNCTION IDENTIFIER ^(ARRAY_SET expression+)?)))
    |   NUMBER
    |   LPAREN! assignment_expr RPAREN!
	|	LBRACKET expression (COMMA expression)* RBRACKET
		->	^(ARRAY_SET expression+)
	|	print_statement
	|	read_statement
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

DROPIN_STATEMENT
	:	'#dropin' LPAREN f=STRING_LITERAL RPAREN {
	       String name = $f.text;
	       name = name.substring(1,name.length()-1);
			name = new File("").getAbsolutePath() + "/neptune/src/test/sample/" + name;
	       try {
	        // save current lexer's state
	         SaveStruct ss = new SaveStruct(input);
	         includes.push(ss);

	        // switch on new input stream
	         setCharStream(new ANTLRFileStream(name));
	         reset();

	       } catch(Exception fnf) { throw new Error("Cannot open file " + name); }
	     }
    ;

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
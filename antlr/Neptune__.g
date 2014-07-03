lexer grammar Neptune;
options {
  language=Java;

}

@header {
package neptune;

import java.io.File;
}
@members {
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

AND : '&&' ;
ARRAY_DEF : 'array_def' ;
ARRAY_SET : 'array_set' ;
BECOMES : '=' ;
BLOCK : 'block' ;
BOOLEAN : 'bool' ;
CHAR : 'char' ;
COLON : ':' ;
COMMA : ',' ;
CONST : 'const' ;
DIVIDE : '/' ;
DO : 'do' ;
DQUOTE : '"' ;
ELSE : 'else' ;
ELSIF : 'elsif' ;
EQ : '==' ;
FALSE : 'false' ;
FOREACH : 'foreach' ;
FUNCTION : 'function' ;
GT : '>' ;
GT_EQ : '>=' ;
IF : 'if' ;
IN : 'in' ;
INTEGER : 'int' ;
LBRACKET : '[' ;
LCURLY : '{' ;
LPAREN : '(' ;
LT : '<' ;
LT_EQ : '<=' ;
MINUS : '-' ;
MOD : '%' ;
NEGATE : '!' ;
NEQ : '!=' ;
OR : '||' ;
PLUS : '+' ;
PRINT : 'print' ;
PROGRAM : 'program' ;
QUOTE : '\'' ;
RBRACKET : ']' ;
RCURLY : '}' ;
READ : 'read' ;
RETURN : 'return' ;
RPAREN : ')' ;
SEMICOLON : ';' ;
SIZEOF : 'sizeof' ;
THEN : 'then' ;
TIMES : '*' ;
TRUE : 'true' ;
UNARY_MINUS : 'u-' ;
UNARY_PLUS : 'u+' ;
VAR : 'var' ;
WHILE : 'while' ;

// $ANTLR src "antlr/Neptune.g" 249
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
    ;// $ANTLR src "antlr/Neptune.g" 267
IDENTIFIER
    :   LETTER (LETTER | DIGIT | '_')*
    ;// $ANTLR src "antlr/Neptune.g" 271
NUMBER
    :   DIGIT+
    ;// $ANTLR src "antlr/Neptune.g" 276
COMMENT
    :   '//' .* '\n' 
            { $channel=HIDDEN; }
    ;// $ANTLR src "antlr/Neptune.g" 281
CHAR_LITERAL
	:	'\'' ~'\'' '\''
	;// $ANTLR src "antlr/Neptune.g" 285
STRING_LITERAL
	:	'"' (~'"')+ '"'
	;// $ANTLR src "antlr/Neptune.g" 289
WS
    :   (' ' | '\t' | '\f' | '\r' | '\n')+
            { $channel=HIDDEN; }
    ;// $ANTLR src "antlr/Neptune.g" 294
fragment DIGIT  :   ('0'..'9') ;// $ANTLR src "antlr/Neptune.g" 295
fragment LOWER  :   ('a'..'z') ;// $ANTLR src "antlr/Neptune.g" 296
fragment UPPER  :   ('A'..'Z') ;// $ANTLR src "antlr/Neptune.g" 297
fragment LETTER :   LOWER | UPPER ;
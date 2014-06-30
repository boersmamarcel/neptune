// $ANTLR 3.5.2 antlr/Neptune.g 2014-06-30 22:38:59

package neptune;

import java.io.File;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class NeptuneLexer extends Lexer {
	public static final int EOF=-1;
	public static final int AND=4;
	public static final int ARRAY_DEF=5;
	public static final int ARRAY_SET=6;
	public static final int BECOMES=7;
	public static final int BLOCK=8;
	public static final int BOOLEAN=9;
	public static final int CHAR=10;
	public static final int CHAR_LITERAL=11;
	public static final int COLON=12;
	public static final int COMMA=13;
	public static final int COMMENT=14;
	public static final int CONST=15;
	public static final int DIGIT=16;
	public static final int DIVIDE=17;
	public static final int DO=18;
	public static final int DQUOTE=19;
	public static final int DROPIN_STATEMENT=20;
	public static final int ELSE=21;
	public static final int ELSIF=22;
	public static final int EQ=23;
	public static final int FALSE=24;
	public static final int FOREACH=25;
	public static final int FUNCTION=26;
	public static final int GT=27;
	public static final int GT_EQ=28;
	public static final int IDENTIFIER=29;
	public static final int IF=30;
	public static final int IN=31;
	public static final int INTEGER=32;
	public static final int LBRACKET=33;
	public static final int LCURLY=34;
	public static final int LETTER=35;
	public static final int LOWER=36;
	public static final int LPAREN=37;
	public static final int LT=38;
	public static final int LT_EQ=39;
	public static final int MINUS=40;
	public static final int MOD=41;
	public static final int NEGATE=42;
	public static final int NEQ=43;
	public static final int NUMBER=44;
	public static final int OR=45;
	public static final int PLUS=46;
	public static final int PRINT=47;
	public static final int PROGRAM=48;
	public static final int QUOTE=49;
	public static final int RBRACKET=50;
	public static final int RCURLY=51;
	public static final int READ=52;
	public static final int RETURN=53;
	public static final int RPAREN=54;
	public static final int SEMICOLON=55;
	public static final int SIZEOF=56;
	public static final int STRING_LITERAL=57;
	public static final int THEN=58;
	public static final int TIMES=59;
	public static final int TRUE=60;
	public static final int UNARY_MINUS=61;
	public static final int UNARY_PLUS=62;
	public static final int UPPER=63;
	public static final int VAR=64;
	public static final int WHILE=65;
	public static final int WS=66;

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
	 

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public NeptuneLexer() {} 
	public NeptuneLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public NeptuneLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "antlr/Neptune.g"; }

	// $ANTLR start "AND"
	public final void mAND() throws RecognitionException {
		try {
			int _type = AND;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// antlr/Neptune.g:47:5: ( '&&' )
			// antlr/Neptune.g:47:7: '&&'
			{
			match("&&"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AND"

	// $ANTLR start "ARRAY_DEF"
	public final void mARRAY_DEF() throws RecognitionException {
		try {
			int _type = ARRAY_DEF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// antlr/Neptune.g:48:11: ( 'array_def' )
			// antlr/Neptune.g:48:13: 'array_def'
			{
			match("array_def"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ARRAY_DEF"

	// $ANTLR start "ARRAY_SET"
	public final void mARRAY_SET() throws RecognitionException {
		try {
			int _type = ARRAY_SET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// antlr/Neptune.g:49:11: ( 'array_set' )
			// antlr/Neptune.g:49:13: 'array_set'
			{
			match("array_set"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ARRAY_SET"

	// $ANTLR start "BECOMES"
	public final void mBECOMES() throws RecognitionException {
		try {
			int _type = BECOMES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// antlr/Neptune.g:50:9: ( '=' )
			// antlr/Neptune.g:50:11: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BECOMES"

	// $ANTLR start "BLOCK"
	public final void mBLOCK() throws RecognitionException {
		try {
			int _type = BLOCK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// antlr/Neptune.g:51:7: ( 'block' )
			// antlr/Neptune.g:51:9: 'block'
			{
			match("block"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BLOCK"

	// $ANTLR start "BOOLEAN"
	public final void mBOOLEAN() throws RecognitionException {
		try {
			int _type = BOOLEAN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// antlr/Neptune.g:52:9: ( 'bool' )
			// antlr/Neptune.g:52:11: 'bool'
			{
			match("bool"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BOOLEAN"

	// $ANTLR start "CHAR"
	public final void mCHAR() throws RecognitionException {
		try {
			int _type = CHAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// antlr/Neptune.g:53:6: ( 'char' )
			// antlr/Neptune.g:53:8: 'char'
			{
			match("char"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CHAR"

	// $ANTLR start "COLON"
	public final void mCOLON() throws RecognitionException {
		try {
			int _type = COLON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// antlr/Neptune.g:54:7: ( ':' )
			// antlr/Neptune.g:54:9: ':'
			{
			match(':'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COLON"

	// $ANTLR start "COMMA"
	public final void mCOMMA() throws RecognitionException {
		try {
			int _type = COMMA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// antlr/Neptune.g:55:7: ( ',' )
			// antlr/Neptune.g:55:9: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMA"

	// $ANTLR start "CONST"
	public final void mCONST() throws RecognitionException {
		try {
			int _type = CONST;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// antlr/Neptune.g:56:7: ( 'const' )
			// antlr/Neptune.g:56:9: 'const'
			{
			match("const"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CONST"

	// $ANTLR start "DIVIDE"
	public final void mDIVIDE() throws RecognitionException {
		try {
			int _type = DIVIDE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// antlr/Neptune.g:57:8: ( '/' )
			// antlr/Neptune.g:57:10: '/'
			{
			match('/'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIVIDE"

	// $ANTLR start "DO"
	public final void mDO() throws RecognitionException {
		try {
			int _type = DO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// antlr/Neptune.g:58:4: ( 'do' )
			// antlr/Neptune.g:58:6: 'do'
			{
			match("do"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DO"

	// $ANTLR start "DQUOTE"
	public final void mDQUOTE() throws RecognitionException {
		try {
			int _type = DQUOTE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// antlr/Neptune.g:59:8: ( '\"' )
			// antlr/Neptune.g:59:10: '\"'
			{
			match('\"'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DQUOTE"

	// $ANTLR start "ELSE"
	public final void mELSE() throws RecognitionException {
		try {
			int _type = ELSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// antlr/Neptune.g:60:6: ( 'else' )
			// antlr/Neptune.g:60:8: 'else'
			{
			match("else"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ELSE"

	// $ANTLR start "ELSIF"
	public final void mELSIF() throws RecognitionException {
		try {
			int _type = ELSIF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// antlr/Neptune.g:61:7: ( 'elsif' )
			// antlr/Neptune.g:61:9: 'elsif'
			{
			match("elsif"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ELSIF"

	// $ANTLR start "EQ"
	public final void mEQ() throws RecognitionException {
		try {
			int _type = EQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// antlr/Neptune.g:62:4: ( '==' )
			// antlr/Neptune.g:62:6: '=='
			{
			match("=="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EQ"

	// $ANTLR start "FALSE"
	public final void mFALSE() throws RecognitionException {
		try {
			int _type = FALSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// antlr/Neptune.g:63:7: ( 'false' )
			// antlr/Neptune.g:63:9: 'false'
			{
			match("false"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FALSE"

	// $ANTLR start "FOREACH"
	public final void mFOREACH() throws RecognitionException {
		try {
			int _type = FOREACH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// antlr/Neptune.g:64:9: ( 'foreach' )
			// antlr/Neptune.g:64:11: 'foreach'
			{
			match("foreach"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FOREACH"

	// $ANTLR start "FUNCTION"
	public final void mFUNCTION() throws RecognitionException {
		try {
			int _type = FUNCTION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// antlr/Neptune.g:65:10: ( 'function' )
			// antlr/Neptune.g:65:12: 'function'
			{
			match("function"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FUNCTION"

	// $ANTLR start "GT"
	public final void mGT() throws RecognitionException {
		try {
			int _type = GT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// antlr/Neptune.g:66:4: ( '>' )
			// antlr/Neptune.g:66:6: '>'
			{
			match('>'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GT"

	// $ANTLR start "GT_EQ"
	public final void mGT_EQ() throws RecognitionException {
		try {
			int _type = GT_EQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// antlr/Neptune.g:67:7: ( '>=' )
			// antlr/Neptune.g:67:9: '>='
			{
			match(">="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GT_EQ"

	// $ANTLR start "IF"
	public final void mIF() throws RecognitionException {
		try {
			int _type = IF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// antlr/Neptune.g:68:4: ( 'if' )
			// antlr/Neptune.g:68:6: 'if'
			{
			match("if"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IF"

	// $ANTLR start "IN"
	public final void mIN() throws RecognitionException {
		try {
			int _type = IN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// antlr/Neptune.g:69:4: ( 'in' )
			// antlr/Neptune.g:69:6: 'in'
			{
			match("in"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IN"

	// $ANTLR start "INTEGER"
	public final void mINTEGER() throws RecognitionException {
		try {
			int _type = INTEGER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// antlr/Neptune.g:70:9: ( 'int' )
			// antlr/Neptune.g:70:11: 'int'
			{
			match("int"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INTEGER"

	// $ANTLR start "LBRACKET"
	public final void mLBRACKET() throws RecognitionException {
		try {
			int _type = LBRACKET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// antlr/Neptune.g:71:10: ( '[' )
			// antlr/Neptune.g:71:12: '['
			{
			match('['); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LBRACKET"

	// $ANTLR start "LCURLY"
	public final void mLCURLY() throws RecognitionException {
		try {
			int _type = LCURLY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// antlr/Neptune.g:72:8: ( '{' )
			// antlr/Neptune.g:72:10: '{'
			{
			match('{'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LCURLY"

	// $ANTLR start "LPAREN"
	public final void mLPAREN() throws RecognitionException {
		try {
			int _type = LPAREN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// antlr/Neptune.g:73:8: ( '(' )
			// antlr/Neptune.g:73:10: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LPAREN"

	// $ANTLR start "LT"
	public final void mLT() throws RecognitionException {
		try {
			int _type = LT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// antlr/Neptune.g:74:4: ( '<' )
			// antlr/Neptune.g:74:6: '<'
			{
			match('<'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LT"

	// $ANTLR start "LT_EQ"
	public final void mLT_EQ() throws RecognitionException {
		try {
			int _type = LT_EQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// antlr/Neptune.g:75:7: ( '<=' )
			// antlr/Neptune.g:75:9: '<='
			{
			match("<="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LT_EQ"

	// $ANTLR start "MINUS"
	public final void mMINUS() throws RecognitionException {
		try {
			int _type = MINUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// antlr/Neptune.g:76:7: ( '-' )
			// antlr/Neptune.g:76:9: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MINUS"

	// $ANTLR start "MOD"
	public final void mMOD() throws RecognitionException {
		try {
			int _type = MOD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// antlr/Neptune.g:77:5: ( '%' )
			// antlr/Neptune.g:77:7: '%'
			{
			match('%'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MOD"

	// $ANTLR start "NEGATE"
	public final void mNEGATE() throws RecognitionException {
		try {
			int _type = NEGATE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// antlr/Neptune.g:78:8: ( '!' )
			// antlr/Neptune.g:78:10: '!'
			{
			match('!'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NEGATE"

	// $ANTLR start "NEQ"
	public final void mNEQ() throws RecognitionException {
		try {
			int _type = NEQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// antlr/Neptune.g:79:5: ( '!=' )
			// antlr/Neptune.g:79:7: '!='
			{
			match("!="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NEQ"

	// $ANTLR start "OR"
	public final void mOR() throws RecognitionException {
		try {
			int _type = OR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// antlr/Neptune.g:80:4: ( '||' )
			// antlr/Neptune.g:80:6: '||'
			{
			match("||"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OR"

	// $ANTLR start "PLUS"
	public final void mPLUS() throws RecognitionException {
		try {
			int _type = PLUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// antlr/Neptune.g:81:6: ( '+' )
			// antlr/Neptune.g:81:8: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PLUS"

	// $ANTLR start "PRINT"
	public final void mPRINT() throws RecognitionException {
		try {
			int _type = PRINT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// antlr/Neptune.g:82:7: ( 'print' )
			// antlr/Neptune.g:82:9: 'print'
			{
			match("print"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PRINT"

	// $ANTLR start "PROGRAM"
	public final void mPROGRAM() throws RecognitionException {
		try {
			int _type = PROGRAM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// antlr/Neptune.g:83:9: ( 'program' )
			// antlr/Neptune.g:83:11: 'program'
			{
			match("program"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PROGRAM"

	// $ANTLR start "QUOTE"
	public final void mQUOTE() throws RecognitionException {
		try {
			int _type = QUOTE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// antlr/Neptune.g:84:7: ( '\\'' )
			// antlr/Neptune.g:84:9: '\\''
			{
			match('\''); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "QUOTE"

	// $ANTLR start "RBRACKET"
	public final void mRBRACKET() throws RecognitionException {
		try {
			int _type = RBRACKET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// antlr/Neptune.g:85:10: ( ']' )
			// antlr/Neptune.g:85:12: ']'
			{
			match(']'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RBRACKET"

	// $ANTLR start "RCURLY"
	public final void mRCURLY() throws RecognitionException {
		try {
			int _type = RCURLY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// antlr/Neptune.g:86:8: ( '}' )
			// antlr/Neptune.g:86:10: '}'
			{
			match('}'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RCURLY"

	// $ANTLR start "READ"
	public final void mREAD() throws RecognitionException {
		try {
			int _type = READ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// antlr/Neptune.g:87:6: ( 'read' )
			// antlr/Neptune.g:87:8: 'read'
			{
			match("read"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "READ"

	// $ANTLR start "RETURN"
	public final void mRETURN() throws RecognitionException {
		try {
			int _type = RETURN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// antlr/Neptune.g:88:8: ( 'return' )
			// antlr/Neptune.g:88:10: 'return'
			{
			match("return"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RETURN"

	// $ANTLR start "RPAREN"
	public final void mRPAREN() throws RecognitionException {
		try {
			int _type = RPAREN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// antlr/Neptune.g:89:8: ( ')' )
			// antlr/Neptune.g:89:10: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RPAREN"

	// $ANTLR start "SEMICOLON"
	public final void mSEMICOLON() throws RecognitionException {
		try {
			int _type = SEMICOLON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// antlr/Neptune.g:90:11: ( ';' )
			// antlr/Neptune.g:90:13: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SEMICOLON"

	// $ANTLR start "SIZEOF"
	public final void mSIZEOF() throws RecognitionException {
		try {
			int _type = SIZEOF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// antlr/Neptune.g:91:8: ( 'sizeof' )
			// antlr/Neptune.g:91:10: 'sizeof'
			{
			match("sizeof"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SIZEOF"

	// $ANTLR start "THEN"
	public final void mTHEN() throws RecognitionException {
		try {
			int _type = THEN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// antlr/Neptune.g:92:6: ( 'then' )
			// antlr/Neptune.g:92:8: 'then'
			{
			match("then"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "THEN"

	// $ANTLR start "TIMES"
	public final void mTIMES() throws RecognitionException {
		try {
			int _type = TIMES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// antlr/Neptune.g:93:7: ( '*' )
			// antlr/Neptune.g:93:9: '*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TIMES"

	// $ANTLR start "TRUE"
	public final void mTRUE() throws RecognitionException {
		try {
			int _type = TRUE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// antlr/Neptune.g:94:6: ( 'true' )
			// antlr/Neptune.g:94:8: 'true'
			{
			match("true"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TRUE"

	// $ANTLR start "UNARY_MINUS"
	public final void mUNARY_MINUS() throws RecognitionException {
		try {
			int _type = UNARY_MINUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// antlr/Neptune.g:95:13: ( 'u-' )
			// antlr/Neptune.g:95:15: 'u-'
			{
			match("u-"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UNARY_MINUS"

	// $ANTLR start "UNARY_PLUS"
	public final void mUNARY_PLUS() throws RecognitionException {
		try {
			int _type = UNARY_PLUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// antlr/Neptune.g:96:12: ( 'u+' )
			// antlr/Neptune.g:96:14: 'u+'
			{
			match("u+"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UNARY_PLUS"

	// $ANTLR start "VAR"
	public final void mVAR() throws RecognitionException {
		try {
			int _type = VAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// antlr/Neptune.g:97:5: ( 'var' )
			// antlr/Neptune.g:97:7: 'var'
			{
			match("var"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VAR"

	// $ANTLR start "WHILE"
	public final void mWHILE() throws RecognitionException {
		try {
			int _type = WHILE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// antlr/Neptune.g:98:7: ( 'while' )
			// antlr/Neptune.g:98:9: 'while'
			{
			match("while"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WHILE"

	// $ANTLR start "DROPIN_STATEMENT"
	public final void mDROPIN_STATEMENT() throws RecognitionException {
		try {
			int _type = DROPIN_STATEMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			CommonToken f=null;

			// antlr/Neptune.g:242:2: ( '#dropin' LPAREN f= STRING_LITERAL RPAREN )
			// antlr/Neptune.g:242:4: '#dropin' LPAREN f= STRING_LITERAL RPAREN
			{
			match("#dropin"); 

			mLPAREN(); 

			int fStart460 = getCharIndex();
			int fStartLine460 = getLine();
			int fStartCharPos460 = getCharPositionInLine();
			mSTRING_LITERAL(); 
			f = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, fStart460, getCharIndex()-1);
			f.setLine(fStartLine460);
			f.setCharPositionInLine(fStartCharPos460);

			mRPAREN(); 


				       String name = (f!=null?f.getText():null);
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

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DROPIN_STATEMENT"

	// $ANTLR start "IDENTIFIER"
	public final void mIDENTIFIER() throws RecognitionException {
		try {
			int _type = IDENTIFIER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// antlr/Neptune.g:260:5: ( LETTER ( LETTER | DIGIT | '_' )* )
			// antlr/Neptune.g:260:9: LETTER ( LETTER | DIGIT | '_' )*
			{
			mLETTER(); 

			// antlr/Neptune.g:260:16: ( LETTER | DIGIT | '_' )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// antlr/Neptune.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop1;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IDENTIFIER"

	// $ANTLR start "NUMBER"
	public final void mNUMBER() throws RecognitionException {
		try {
			int _type = NUMBER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// antlr/Neptune.g:264:5: ( ( DIGIT )+ )
			// antlr/Neptune.g:264:9: ( DIGIT )+
			{
			// antlr/Neptune.g:264:9: ( DIGIT )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// antlr/Neptune.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NUMBER"

	// $ANTLR start "COMMENT"
	public final void mCOMMENT() throws RecognitionException {
		try {
			int _type = COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// antlr/Neptune.g:269:5: ( '//' ( . )* '\\n' )
			// antlr/Neptune.g:269:9: '//' ( . )* '\\n'
			{
			match("//"); 

			// antlr/Neptune.g:269:14: ( . )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0=='\n') ) {
					alt3=2;
				}
				else if ( ((LA3_0 >= '\u0000' && LA3_0 <= '\t')||(LA3_0 >= '\u000B' && LA3_0 <= '\uFFFF')) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// antlr/Neptune.g:269:14: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop3;
				}
			}

			match('\n'); 
			 _channel=HIDDEN; 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT"

	// $ANTLR start "CHAR_LITERAL"
	public final void mCHAR_LITERAL() throws RecognitionException {
		try {
			int _type = CHAR_LITERAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// antlr/Neptune.g:274:2: ( '\\'' ~ '\\'' '\\'' )
			// antlr/Neptune.g:274:4: '\\'' ~ '\\'' '\\''
			{
			match('\''); 
			if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '\uFFFF') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			match('\''); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CHAR_LITERAL"

	// $ANTLR start "STRING_LITERAL"
	public final void mSTRING_LITERAL() throws RecognitionException {
		try {
			int _type = STRING_LITERAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// antlr/Neptune.g:278:2: ( '\"' (~ '\"' )+ '\"' )
			// antlr/Neptune.g:278:4: '\"' (~ '\"' )+ '\"'
			{
			match('\"'); 
			// antlr/Neptune.g:278:8: (~ '\"' )+
			int cnt4=0;
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( ((LA4_0 >= '\u0000' && LA4_0 <= '!')||(LA4_0 >= '#' && LA4_0 <= '\uFFFF')) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// antlr/Neptune.g:
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt4 >= 1 ) break loop4;
					EarlyExitException eee = new EarlyExitException(4, input);
					throw eee;
				}
				cnt4++;
			}

			match('\"'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRING_LITERAL"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// antlr/Neptune.g:282:5: ( ( ' ' | '\\t' | '\\f' | '\\r' | '\\n' )+ )
			// antlr/Neptune.g:282:9: ( ' ' | '\\t' | '\\f' | '\\r' | '\\n' )+
			{
			// antlr/Neptune.g:282:9: ( ' ' | '\\t' | '\\f' | '\\r' | '\\n' )+
			int cnt5=0;
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( ((LA5_0 >= '\t' && LA5_0 <= '\n')||(LA5_0 >= '\f' && LA5_0 <= '\r')||LA5_0==' ') ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// antlr/Neptune.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||(input.LA(1) >= '\f' && input.LA(1) <= '\r')||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt5 >= 1 ) break loop5;
					EarlyExitException eee = new EarlyExitException(5, input);
					throw eee;
				}
				cnt5++;
			}

			 _channel=HIDDEN; 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "DIGIT"
	public final void mDIGIT() throws RecognitionException {
		try {
			// antlr/Neptune.g:286:17: ( ( '0' .. '9' ) )
			// antlr/Neptune.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIGIT"

	// $ANTLR start "LOWER"
	public final void mLOWER() throws RecognitionException {
		try {
			// antlr/Neptune.g:287:17: ( ( 'a' .. 'z' ) )
			// antlr/Neptune.g:
			{
			if ( (input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LOWER"

	// $ANTLR start "UPPER"
	public final void mUPPER() throws RecognitionException {
		try {
			// antlr/Neptune.g:288:17: ( ( 'A' .. 'Z' ) )
			// antlr/Neptune.g:
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UPPER"

	// $ANTLR start "LETTER"
	public final void mLETTER() throws RecognitionException {
		try {
			// antlr/Neptune.g:289:17: ( LOWER | UPPER )
			// antlr/Neptune.g:
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LETTER"

	@Override
	public void mTokens() throws RecognitionException {
		// antlr/Neptune.g:1:8: ( AND | ARRAY_DEF | ARRAY_SET | BECOMES | BLOCK | BOOLEAN | CHAR | COLON | COMMA | CONST | DIVIDE | DO | DQUOTE | ELSE | ELSIF | EQ | FALSE | FOREACH | FUNCTION | GT | GT_EQ | IF | IN | INTEGER | LBRACKET | LCURLY | LPAREN | LT | LT_EQ | MINUS | MOD | NEGATE | NEQ | OR | PLUS | PRINT | PROGRAM | QUOTE | RBRACKET | RCURLY | READ | RETURN | RPAREN | SEMICOLON | SIZEOF | THEN | TIMES | TRUE | UNARY_MINUS | UNARY_PLUS | VAR | WHILE | DROPIN_STATEMENT | IDENTIFIER | NUMBER | COMMENT | CHAR_LITERAL | STRING_LITERAL | WS )
		int alt6=59;
		alt6 = dfa6.predict(input);
		switch (alt6) {
			case 1 :
				// antlr/Neptune.g:1:10: AND
				{
				mAND(); 

				}
				break;
			case 2 :
				// antlr/Neptune.g:1:14: ARRAY_DEF
				{
				mARRAY_DEF(); 

				}
				break;
			case 3 :
				// antlr/Neptune.g:1:24: ARRAY_SET
				{
				mARRAY_SET(); 

				}
				break;
			case 4 :
				// antlr/Neptune.g:1:34: BECOMES
				{
				mBECOMES(); 

				}
				break;
			case 5 :
				// antlr/Neptune.g:1:42: BLOCK
				{
				mBLOCK(); 

				}
				break;
			case 6 :
				// antlr/Neptune.g:1:48: BOOLEAN
				{
				mBOOLEAN(); 

				}
				break;
			case 7 :
				// antlr/Neptune.g:1:56: CHAR
				{
				mCHAR(); 

				}
				break;
			case 8 :
				// antlr/Neptune.g:1:61: COLON
				{
				mCOLON(); 

				}
				break;
			case 9 :
				// antlr/Neptune.g:1:67: COMMA
				{
				mCOMMA(); 

				}
				break;
			case 10 :
				// antlr/Neptune.g:1:73: CONST
				{
				mCONST(); 

				}
				break;
			case 11 :
				// antlr/Neptune.g:1:79: DIVIDE
				{
				mDIVIDE(); 

				}
				break;
			case 12 :
				// antlr/Neptune.g:1:86: DO
				{
				mDO(); 

				}
				break;
			case 13 :
				// antlr/Neptune.g:1:89: DQUOTE
				{
				mDQUOTE(); 

				}
				break;
			case 14 :
				// antlr/Neptune.g:1:96: ELSE
				{
				mELSE(); 

				}
				break;
			case 15 :
				// antlr/Neptune.g:1:101: ELSIF
				{
				mELSIF(); 

				}
				break;
			case 16 :
				// antlr/Neptune.g:1:107: EQ
				{
				mEQ(); 

				}
				break;
			case 17 :
				// antlr/Neptune.g:1:110: FALSE
				{
				mFALSE(); 

				}
				break;
			case 18 :
				// antlr/Neptune.g:1:116: FOREACH
				{
				mFOREACH(); 

				}
				break;
			case 19 :
				// antlr/Neptune.g:1:124: FUNCTION
				{
				mFUNCTION(); 

				}
				break;
			case 20 :
				// antlr/Neptune.g:1:133: GT
				{
				mGT(); 

				}
				break;
			case 21 :
				// antlr/Neptune.g:1:136: GT_EQ
				{
				mGT_EQ(); 

				}
				break;
			case 22 :
				// antlr/Neptune.g:1:142: IF
				{
				mIF(); 

				}
				break;
			case 23 :
				// antlr/Neptune.g:1:145: IN
				{
				mIN(); 

				}
				break;
			case 24 :
				// antlr/Neptune.g:1:148: INTEGER
				{
				mINTEGER(); 

				}
				break;
			case 25 :
				// antlr/Neptune.g:1:156: LBRACKET
				{
				mLBRACKET(); 

				}
				break;
			case 26 :
				// antlr/Neptune.g:1:165: LCURLY
				{
				mLCURLY(); 

				}
				break;
			case 27 :
				// antlr/Neptune.g:1:172: LPAREN
				{
				mLPAREN(); 

				}
				break;
			case 28 :
				// antlr/Neptune.g:1:179: LT
				{
				mLT(); 

				}
				break;
			case 29 :
				// antlr/Neptune.g:1:182: LT_EQ
				{
				mLT_EQ(); 

				}
				break;
			case 30 :
				// antlr/Neptune.g:1:188: MINUS
				{
				mMINUS(); 

				}
				break;
			case 31 :
				// antlr/Neptune.g:1:194: MOD
				{
				mMOD(); 

				}
				break;
			case 32 :
				// antlr/Neptune.g:1:198: NEGATE
				{
				mNEGATE(); 

				}
				break;
			case 33 :
				// antlr/Neptune.g:1:205: NEQ
				{
				mNEQ(); 

				}
				break;
			case 34 :
				// antlr/Neptune.g:1:209: OR
				{
				mOR(); 

				}
				break;
			case 35 :
				// antlr/Neptune.g:1:212: PLUS
				{
				mPLUS(); 

				}
				break;
			case 36 :
				// antlr/Neptune.g:1:217: PRINT
				{
				mPRINT(); 

				}
				break;
			case 37 :
				// antlr/Neptune.g:1:223: PROGRAM
				{
				mPROGRAM(); 

				}
				break;
			case 38 :
				// antlr/Neptune.g:1:231: QUOTE
				{
				mQUOTE(); 

				}
				break;
			case 39 :
				// antlr/Neptune.g:1:237: RBRACKET
				{
				mRBRACKET(); 

				}
				break;
			case 40 :
				// antlr/Neptune.g:1:246: RCURLY
				{
				mRCURLY(); 

				}
				break;
			case 41 :
				// antlr/Neptune.g:1:253: READ
				{
				mREAD(); 

				}
				break;
			case 42 :
				// antlr/Neptune.g:1:258: RETURN
				{
				mRETURN(); 

				}
				break;
			case 43 :
				// antlr/Neptune.g:1:265: RPAREN
				{
				mRPAREN(); 

				}
				break;
			case 44 :
				// antlr/Neptune.g:1:272: SEMICOLON
				{
				mSEMICOLON(); 

				}
				break;
			case 45 :
				// antlr/Neptune.g:1:282: SIZEOF
				{
				mSIZEOF(); 

				}
				break;
			case 46 :
				// antlr/Neptune.g:1:289: THEN
				{
				mTHEN(); 

				}
				break;
			case 47 :
				// antlr/Neptune.g:1:294: TIMES
				{
				mTIMES(); 

				}
				break;
			case 48 :
				// antlr/Neptune.g:1:300: TRUE
				{
				mTRUE(); 

				}
				break;
			case 49 :
				// antlr/Neptune.g:1:305: UNARY_MINUS
				{
				mUNARY_MINUS(); 

				}
				break;
			case 50 :
				// antlr/Neptune.g:1:317: UNARY_PLUS
				{
				mUNARY_PLUS(); 

				}
				break;
			case 51 :
				// antlr/Neptune.g:1:328: VAR
				{
				mVAR(); 

				}
				break;
			case 52 :
				// antlr/Neptune.g:1:332: WHILE
				{
				mWHILE(); 

				}
				break;
			case 53 :
				// antlr/Neptune.g:1:338: DROPIN_STATEMENT
				{
				mDROPIN_STATEMENT(); 

				}
				break;
			case 54 :
				// antlr/Neptune.g:1:355: IDENTIFIER
				{
				mIDENTIFIER(); 

				}
				break;
			case 55 :
				// antlr/Neptune.g:1:366: NUMBER
				{
				mNUMBER(); 

				}
				break;
			case 56 :
				// antlr/Neptune.g:1:373: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 57 :
				// antlr/Neptune.g:1:381: CHAR_LITERAL
				{
				mCHAR_LITERAL(); 

				}
				break;
			case 58 :
				// antlr/Neptune.g:1:394: STRING_LITERAL
				{
				mSTRING_LITERAL(); 

				}
				break;
			case 59 :
				// antlr/Neptune.g:1:409: WS
				{
				mWS(); 

				}
				break;

		}
	}


	protected DFA6 dfa6 = new DFA6(this);
	static final String DFA6_eotS =
		"\2\uffff\1\46\1\53\2\46\2\uffff\1\61\1\46\1\63\2\46\1\72\1\46\3\uffff"+
		"\1\76\2\uffff\1\100\2\uffff\1\46\1\103\2\uffff\1\46\2\uffff\2\46\1\uffff"+
		"\3\46\4\uffff\1\46\2\uffff\4\46\2\uffff\1\121\2\uffff\4\46\2\uffff\1\126"+
		"\1\130\4\uffff\1\46\2\uffff\4\46\2\uffff\7\46\1\uffff\4\46\1\uffff\1\154"+
		"\1\uffff\7\46\1\164\3\46\1\170\1\171\1\46\1\173\4\46\1\uffff\2\46\1\u0082"+
		"\2\46\1\u0085\1\u0086\1\uffff\2\46\1\u0089\2\uffff\1\u008a\1\uffff\1\u008b"+
		"\1\u008c\2\46\1\u008f\1\46\1\uffff\2\46\2\uffff\1\u0093\1\46\4\uffff\2"+
		"\46\1\uffff\1\46\1\u0099\1\u009a\1\uffff\2\46\1\u009d\1\46\1\u009f\2\uffff"+
		"\2\46\1\uffff\1\u00a2\1\uffff\1\u00a3\1\u00a4\3\uffff";
	static final String DFA6_eofS =
		"\u00a5\uffff";
	static final String DFA6_minS =
		"\1\11\1\uffff\1\162\1\75\1\154\1\150\2\uffff\1\57\1\157\1\0\1\154\1\141"+
		"\1\75\1\146\3\uffff\1\75\2\uffff\1\75\2\uffff\1\162\1\0\2\uffff\1\145"+
		"\2\uffff\1\151\1\150\1\uffff\1\53\1\141\1\150\4\uffff\1\162\2\uffff\2"+
		"\157\1\141\1\156\2\uffff\1\60\2\uffff\1\163\1\154\1\162\1\156\2\uffff"+
		"\2\60\4\uffff\1\151\2\uffff\1\141\1\172\1\145\1\165\2\uffff\1\162\1\151"+
		"\1\141\1\143\1\154\1\162\1\163\1\uffff\1\145\1\163\1\145\1\143\1\uffff"+
		"\1\60\1\uffff\1\156\1\147\1\144\1\165\1\145\1\156\1\145\1\60\1\154\1\171"+
		"\1\153\2\60\1\164\1\60\1\146\1\145\1\141\1\164\1\uffff\1\164\1\162\1\60"+
		"\1\162\1\157\2\60\1\uffff\1\145\1\137\1\60\2\uffff\1\60\1\uffff\2\60\1"+
		"\143\1\151\1\60\1\141\1\uffff\1\156\1\146\2\uffff\1\60\1\144\4\uffff\1"+
		"\150\1\157\1\uffff\1\155\2\60\1\uffff\2\145\1\60\1\156\1\60\2\uffff\1"+
		"\146\1\164\1\uffff\1\60\1\uffff\2\60\3\uffff";
	static final String DFA6_maxS =
		"\1\175\1\uffff\1\162\1\75\2\157\2\uffff\1\57\1\157\1\uffff\1\154\1\165"+
		"\1\75\1\156\3\uffff\1\75\2\uffff\1\75\2\uffff\1\162\1\uffff\2\uffff\1"+
		"\145\2\uffff\1\151\1\162\1\uffff\1\55\1\141\1\150\4\uffff\1\162\2\uffff"+
		"\2\157\1\141\1\156\2\uffff\1\172\2\uffff\1\163\1\154\1\162\1\156\2\uffff"+
		"\2\172\4\uffff\1\157\2\uffff\1\164\1\172\1\145\1\165\2\uffff\1\162\1\151"+
		"\1\141\1\143\1\154\1\162\1\163\1\uffff\1\151\1\163\1\145\1\143\1\uffff"+
		"\1\172\1\uffff\1\156\1\147\1\144\1\165\1\145\1\156\1\145\1\172\1\154\1"+
		"\171\1\153\2\172\1\164\1\172\1\146\1\145\1\141\1\164\1\uffff\1\164\1\162"+
		"\1\172\1\162\1\157\2\172\1\uffff\1\145\1\137\1\172\2\uffff\1\172\1\uffff"+
		"\2\172\1\143\1\151\1\172\1\141\1\uffff\1\156\1\146\2\uffff\1\172\1\163"+
		"\4\uffff\1\150\1\157\1\uffff\1\155\2\172\1\uffff\2\145\1\172\1\156\1\172"+
		"\2\uffff\1\146\1\164\1\uffff\1\172\1\uffff\2\172\3\uffff";
	static final String DFA6_acceptS =
		"\1\uffff\1\1\4\uffff\1\10\1\11\7\uffff\1\31\1\32\1\33\1\uffff\1\36\1\37"+
		"\1\uffff\1\42\1\43\2\uffff\1\47\1\50\1\uffff\1\53\1\54\2\uffff\1\57\3"+
		"\uffff\1\65\1\66\1\67\1\73\1\uffff\1\20\1\4\4\uffff\1\70\1\13\1\uffff"+
		"\1\15\1\72\4\uffff\1\25\1\24\2\uffff\1\35\1\34\1\41\1\40\1\uffff\1\71"+
		"\1\46\4\uffff\1\61\1\62\7\uffff\1\14\4\uffff\1\26\1\uffff\1\27\23\uffff"+
		"\1\30\7\uffff\1\63\3\uffff\1\6\1\7\1\uffff\1\16\6\uffff\1\51\2\uffff\1"+
		"\56\1\60\2\uffff\1\5\1\12\1\17\1\21\2\uffff\1\44\3\uffff\1\64\5\uffff"+
		"\1\52\1\55\2\uffff\1\22\1\uffff\1\45\2\uffff\1\23\1\2\1\3";
	static final String DFA6_specialS =
		"\12\uffff\1\0\16\uffff\1\1\u008b\uffff}>";
	static final String[] DFA6_transitionS = {
			"\2\50\1\uffff\2\50\22\uffff\1\50\1\25\1\12\1\45\1\uffff\1\24\1\1\1\31"+
			"\1\21\1\35\1\41\1\27\1\7\1\23\1\uffff\1\10\12\47\1\6\1\36\1\22\1\3\1"+
			"\15\2\uffff\32\46\1\17\1\uffff\1\32\3\uffff\1\2\1\4\1\5\1\11\1\13\1\14"+
			"\2\46\1\16\6\46\1\30\1\46\1\34\1\37\1\40\1\42\1\43\1\44\3\46\1\20\1\26"+
			"\1\33",
			"",
			"\1\51",
			"\1\52",
			"\1\54\2\uffff\1\55",
			"\1\56\6\uffff\1\57",
			"",
			"",
			"\1\60",
			"\1\62",
			"\42\64\1\uffff\uffdd\64",
			"\1\65",
			"\1\66\15\uffff\1\67\5\uffff\1\70",
			"\1\71",
			"\1\73\7\uffff\1\74",
			"",
			"",
			"",
			"\1\75",
			"",
			"",
			"\1\77",
			"",
			"",
			"\1\101",
			"\47\102\1\uffff\uffd8\102",
			"",
			"",
			"\1\104",
			"",
			"",
			"\1\105",
			"\1\106\11\uffff\1\107",
			"",
			"\1\111\1\uffff\1\110",
			"\1\112",
			"\1\113",
			"",
			"",
			"",
			"",
			"\1\114",
			"",
			"",
			"\1\115",
			"\1\116",
			"\1\117",
			"\1\120",
			"",
			"",
			"\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
			"",
			"",
			"\1\122",
			"\1\123",
			"\1\124",
			"\1\125",
			"",
			"",
			"\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
			"\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\23\46\1\127\6\46",
			"",
			"",
			"",
			"",
			"\1\131\5\uffff\1\132",
			"",
			"",
			"\1\133\22\uffff\1\134",
			"\1\135",
			"\1\136",
			"\1\137",
			"",
			"",
			"\1\140",
			"\1\141",
			"\1\142",
			"\1\143",
			"\1\144",
			"\1\145",
			"\1\146",
			"",
			"\1\147\3\uffff\1\150",
			"\1\151",
			"\1\152",
			"\1\153",
			"",
			"\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
			"",
			"\1\155",
			"\1\156",
			"\1\157",
			"\1\160",
			"\1\161",
			"\1\162",
			"\1\163",
			"\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
			"\1\165",
			"\1\166",
			"\1\167",
			"\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
			"\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
			"\1\172",
			"\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
			"\1\174",
			"\1\175",
			"\1\176",
			"\1\177",
			"",
			"\1\u0080",
			"\1\u0081",
			"\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
			"\1\u0083",
			"\1\u0084",
			"\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
			"\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
			"",
			"\1\u0087",
			"\1\u0088",
			"\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
			"",
			"",
			"\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
			"",
			"\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
			"\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
			"\1\u008d",
			"\1\u008e",
			"\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
			"\1\u0090",
			"",
			"\1\u0091",
			"\1\u0092",
			"",
			"",
			"\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
			"\1\u0094\16\uffff\1\u0095",
			"",
			"",
			"",
			"",
			"\1\u0096",
			"\1\u0097",
			"",
			"\1\u0098",
			"\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
			"\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
			"",
			"\1\u009b",
			"\1\u009c",
			"\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
			"\1\u009e",
			"\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
			"",
			"",
			"\1\u00a0",
			"\1\u00a1",
			"",
			"\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
			"",
			"\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
			"\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
			"",
			"",
			""
	};

	static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
	static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
	static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
	static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
	static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
	static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
	static final short[][] DFA6_transition;

	static {
		int numStates = DFA6_transitionS.length;
		DFA6_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
		}
	}

	protected class DFA6 extends DFA {

		public DFA6(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 6;
			this.eot = DFA6_eot;
			this.eof = DFA6_eof;
			this.min = DFA6_min;
			this.max = DFA6_max;
			this.accept = DFA6_accept;
			this.special = DFA6_special;
			this.transition = DFA6_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( AND | ARRAY_DEF | ARRAY_SET | BECOMES | BLOCK | BOOLEAN | CHAR | COLON | COMMA | CONST | DIVIDE | DO | DQUOTE | ELSE | ELSIF | EQ | FALSE | FOREACH | FUNCTION | GT | GT_EQ | IF | IN | INTEGER | LBRACKET | LCURLY | LPAREN | LT | LT_EQ | MINUS | MOD | NEGATE | NEQ | OR | PLUS | PRINT | PROGRAM | QUOTE | RBRACKET | RCURLY | READ | RETURN | RPAREN | SEMICOLON | SIZEOF | THEN | TIMES | TRUE | UNARY_MINUS | UNARY_PLUS | VAR | WHILE | DROPIN_STATEMENT | IDENTIFIER | NUMBER | COMMENT | CHAR_LITERAL | STRING_LITERAL | WS );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			IntStream input = _input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA6_10 = input.LA(1);
						s = -1;
						if ( ((LA6_10 >= '\u0000' && LA6_10 <= '!')||(LA6_10 >= '#' && LA6_10 <= '\uFFFF')) ) {s = 52;}
						else s = 51;
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA6_25 = input.LA(1);
						s = -1;
						if ( ((LA6_25 >= '\u0000' && LA6_25 <= '&')||(LA6_25 >= '(' && LA6_25 <= '\uFFFF')) ) {s = 66;}
						else s = 67;
						if ( s>=0 ) return s;
						break;
			}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 6, _s, input);
			error(nvae);
			throw nvae;
		}
	}

}

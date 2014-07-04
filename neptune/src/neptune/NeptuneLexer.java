// $ANTLR 3.5.2 antlr/Neptune.g 2014-07-04 20:07:49

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
	public static final int ARRAY_VAR=7;
	public static final int ATOMIC_VAR=8;
	public static final int BECOMES=9;
	public static final int BLOCK=10;
	public static final int BOOLEAN=11;
	public static final int CHAR=12;
	public static final int CHAR_LITERAL=13;
	public static final int COLON=14;
	public static final int COMMA=15;
	public static final int COMMENT=16;
	public static final int CONST=17;
	public static final int DIGIT=18;
	public static final int DIVIDE=19;
	public static final int DO=20;
	public static final int DQUOTE=21;
	public static final int DROPIN_STATEMENT=22;
	public static final int ELSE=23;
	public static final int ELSIF=24;
	public static final int EQ=25;
	public static final int FALSE=26;
	public static final int FOREACH=27;
	public static final int FUNCTION=28;
	public static final int GT=29;
	public static final int GT_EQ=30;
	public static final int IDENTIFIER=31;
	public static final int IF=32;
	public static final int IN=33;
	public static final int INTEGER=34;
	public static final int LBRACKET=35;
	public static final int LCURLY=36;
	public static final int LETTER=37;
	public static final int LOWER=38;
	public static final int LPAREN=39;
	public static final int LT=40;
	public static final int LT_EQ=41;
	public static final int MINUS=42;
	public static final int MOD=43;
	public static final int NEGATE=44;
	public static final int NEQ=45;
	public static final int NUMBER=46;
	public static final int OR=47;
	public static final int PLUS=48;
	public static final int PRINT=49;
	public static final int PROGRAM=50;
	public static final int QUOTE=51;
	public static final int RBRACKET=52;
	public static final int RCURLY=53;
	public static final int READ=54;
	public static final int RETURN=55;
	public static final int RPAREN=56;
	public static final int SEMICOLON=57;
	public static final int SIZEOF=58;
	public static final int STRING_LITERAL=59;
	public static final int THEN=60;
	public static final int TIMES=61;
	public static final int TRUE=62;
	public static final int UNARY_MINUS=63;
	public static final int UNARY_PLUS=64;
	public static final int UPPER=65;
	public static final int VAR=66;
	public static final int WHILE=67;
	public static final int WS=68;

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

	// $ANTLR start "ARRAY_VAR"
	public final void mARRAY_VAR() throws RecognitionException {
		try {
			int _type = ARRAY_VAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// antlr/Neptune.g:50:11: ( 'array_var' )
			// antlr/Neptune.g:50:13: 'array_var'
			{
			match("array_var"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ARRAY_VAR"

	// $ANTLR start "ATOMIC_VAR"
	public final void mATOMIC_VAR() throws RecognitionException {
		try {
			int _type = ATOMIC_VAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// antlr/Neptune.g:51:12: ( 'atomic' )
			// antlr/Neptune.g:51:14: 'atomic'
			{
			match("atomic"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ATOMIC_VAR"

	// $ANTLR start "BECOMES"
	public final void mBECOMES() throws RecognitionException {
		try {
			int _type = BECOMES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// antlr/Neptune.g:52:9: ( '=' )
			// antlr/Neptune.g:52:11: '='
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
			// antlr/Neptune.g:53:7: ( 'block' )
			// antlr/Neptune.g:53:9: 'block'
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
			// antlr/Neptune.g:54:9: ( 'bool' )
			// antlr/Neptune.g:54:11: 'bool'
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
			// antlr/Neptune.g:55:6: ( 'char' )
			// antlr/Neptune.g:55:8: 'char'
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
			// antlr/Neptune.g:56:7: ( ':' )
			// antlr/Neptune.g:56:9: ':'
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
			// antlr/Neptune.g:57:7: ( ',' )
			// antlr/Neptune.g:57:9: ','
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
			// antlr/Neptune.g:58:7: ( 'const' )
			// antlr/Neptune.g:58:9: 'const'
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
			// antlr/Neptune.g:59:8: ( '/' )
			// antlr/Neptune.g:59:10: '/'
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
			// antlr/Neptune.g:60:4: ( 'do' )
			// antlr/Neptune.g:60:6: 'do'
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
			// antlr/Neptune.g:61:8: ( '\"' )
			// antlr/Neptune.g:61:10: '\"'
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
			// antlr/Neptune.g:62:6: ( 'else' )
			// antlr/Neptune.g:62:8: 'else'
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
			// antlr/Neptune.g:63:7: ( 'elsif' )
			// antlr/Neptune.g:63:9: 'elsif'
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
			// antlr/Neptune.g:64:4: ( '==' )
			// antlr/Neptune.g:64:6: '=='
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
			// antlr/Neptune.g:65:7: ( 'false' )
			// antlr/Neptune.g:65:9: 'false'
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
			// antlr/Neptune.g:66:9: ( 'foreach' )
			// antlr/Neptune.g:66:11: 'foreach'
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
			// antlr/Neptune.g:67:10: ( 'function' )
			// antlr/Neptune.g:67:12: 'function'
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
			// antlr/Neptune.g:68:4: ( '>' )
			// antlr/Neptune.g:68:6: '>'
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
			// antlr/Neptune.g:69:7: ( '>=' )
			// antlr/Neptune.g:69:9: '>='
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
			// antlr/Neptune.g:70:4: ( 'if' )
			// antlr/Neptune.g:70:6: 'if'
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
			// antlr/Neptune.g:71:4: ( 'in' )
			// antlr/Neptune.g:71:6: 'in'
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
			// antlr/Neptune.g:72:9: ( 'int' )
			// antlr/Neptune.g:72:11: 'int'
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
			// antlr/Neptune.g:73:10: ( '[' )
			// antlr/Neptune.g:73:12: '['
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
			// antlr/Neptune.g:74:8: ( '{' )
			// antlr/Neptune.g:74:10: '{'
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
			// antlr/Neptune.g:75:8: ( '(' )
			// antlr/Neptune.g:75:10: '('
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
			// antlr/Neptune.g:76:4: ( '<' )
			// antlr/Neptune.g:76:6: '<'
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
			// antlr/Neptune.g:77:7: ( '<=' )
			// antlr/Neptune.g:77:9: '<='
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
			// antlr/Neptune.g:78:7: ( '-' )
			// antlr/Neptune.g:78:9: '-'
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
			// antlr/Neptune.g:79:5: ( '%' )
			// antlr/Neptune.g:79:7: '%'
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
			// antlr/Neptune.g:80:8: ( '!' )
			// antlr/Neptune.g:80:10: '!'
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
			// antlr/Neptune.g:81:5: ( '!=' )
			// antlr/Neptune.g:81:7: '!='
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
			// antlr/Neptune.g:82:4: ( '||' )
			// antlr/Neptune.g:82:6: '||'
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
			// antlr/Neptune.g:83:6: ( '+' )
			// antlr/Neptune.g:83:8: '+'
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
			// antlr/Neptune.g:84:7: ( 'print' )
			// antlr/Neptune.g:84:9: 'print'
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
			// antlr/Neptune.g:85:9: ( 'program' )
			// antlr/Neptune.g:85:11: 'program'
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
			// antlr/Neptune.g:86:7: ( '\\'' )
			// antlr/Neptune.g:86:9: '\\''
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
			// antlr/Neptune.g:87:10: ( ']' )
			// antlr/Neptune.g:87:12: ']'
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
			// antlr/Neptune.g:88:8: ( '}' )
			// antlr/Neptune.g:88:10: '}'
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
			// antlr/Neptune.g:89:6: ( 'read' )
			// antlr/Neptune.g:89:8: 'read'
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
			// antlr/Neptune.g:90:8: ( 'return' )
			// antlr/Neptune.g:90:10: 'return'
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
			// antlr/Neptune.g:91:8: ( ')' )
			// antlr/Neptune.g:91:10: ')'
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
			// antlr/Neptune.g:92:11: ( ';' )
			// antlr/Neptune.g:92:13: ';'
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
			// antlr/Neptune.g:93:8: ( 'sizeof' )
			// antlr/Neptune.g:93:10: 'sizeof'
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
			// antlr/Neptune.g:94:6: ( 'then' )
			// antlr/Neptune.g:94:8: 'then'
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
			// antlr/Neptune.g:95:7: ( '*' )
			// antlr/Neptune.g:95:9: '*'
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
			// antlr/Neptune.g:96:6: ( 'true' )
			// antlr/Neptune.g:96:8: 'true'
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
			// antlr/Neptune.g:97:13: ( 'u-' )
			// antlr/Neptune.g:97:15: 'u-'
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
			// antlr/Neptune.g:98:12: ( 'u+' )
			// antlr/Neptune.g:98:14: 'u+'
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
			// antlr/Neptune.g:99:5: ( 'var' )
			// antlr/Neptune.g:99:7: 'var'
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
			// antlr/Neptune.g:100:7: ( 'while' )
			// antlr/Neptune.g:100:9: 'while'
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

			// antlr/Neptune.g:253:2: ( '#dropin' LPAREN f= STRING_LITERAL RPAREN )
			// antlr/Neptune.g:253:4: '#dropin' LPAREN f= STRING_LITERAL RPAREN
			{
			match("#dropin"); 

			mLPAREN(); 

			int fStart476 = getCharIndex();
			int fStartLine476 = getLine();
			int fStartCharPos476 = getCharPositionInLine();
			mSTRING_LITERAL(); 
			f = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, fStart476, getCharIndex()-1);
			f.setLine(fStartLine476);
			f.setCharPositionInLine(fStartCharPos476);

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
			// antlr/Neptune.g:271:5: ( LETTER ( LETTER | DIGIT | '_' )* )
			// antlr/Neptune.g:271:9: LETTER ( LETTER | DIGIT | '_' )*
			{
			mLETTER(); 

			// antlr/Neptune.g:271:16: ( LETTER | DIGIT | '_' )*
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
			// antlr/Neptune.g:275:5: ( ( DIGIT )+ )
			// antlr/Neptune.g:275:9: ( DIGIT )+
			{
			// antlr/Neptune.g:275:9: ( DIGIT )+
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
			// antlr/Neptune.g:280:5: ( '//' ( . )* '\\n' )
			// antlr/Neptune.g:280:9: '//' ( . )* '\\n'
			{
			match("//"); 

			// antlr/Neptune.g:280:14: ( . )*
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
					// antlr/Neptune.g:280:14: .
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
			// antlr/Neptune.g:285:2: ( '\\'' ~ '\\'' '\\'' )
			// antlr/Neptune.g:285:4: '\\'' ~ '\\'' '\\''
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
			// antlr/Neptune.g:289:2: ( '\"' (~ '\"' )+ '\"' )
			// antlr/Neptune.g:289:4: '\"' (~ '\"' )+ '\"'
			{
			match('\"'); 
			// antlr/Neptune.g:289:8: (~ '\"' )+
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
			// antlr/Neptune.g:293:5: ( ( ' ' | '\\t' | '\\f' | '\\r' | '\\n' )+ )
			// antlr/Neptune.g:293:9: ( ' ' | '\\t' | '\\f' | '\\r' | '\\n' )+
			{
			// antlr/Neptune.g:293:9: ( ' ' | '\\t' | '\\f' | '\\r' | '\\n' )+
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
			// antlr/Neptune.g:297:17: ( ( '0' .. '9' ) )
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
			// antlr/Neptune.g:298:17: ( ( 'a' .. 'z' ) )
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
			// antlr/Neptune.g:299:17: ( ( 'A' .. 'Z' ) )
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
			// antlr/Neptune.g:300:17: ( LOWER | UPPER )
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
		// antlr/Neptune.g:1:8: ( AND | ARRAY_DEF | ARRAY_SET | ARRAY_VAR | ATOMIC_VAR | BECOMES | BLOCK | BOOLEAN | CHAR | COLON | COMMA | CONST | DIVIDE | DO | DQUOTE | ELSE | ELSIF | EQ | FALSE | FOREACH | FUNCTION | GT | GT_EQ | IF | IN | INTEGER | LBRACKET | LCURLY | LPAREN | LT | LT_EQ | MINUS | MOD | NEGATE | NEQ | OR | PLUS | PRINT | PROGRAM | QUOTE | RBRACKET | RCURLY | READ | RETURN | RPAREN | SEMICOLON | SIZEOF | THEN | TIMES | TRUE | UNARY_MINUS | UNARY_PLUS | VAR | WHILE | DROPIN_STATEMENT | IDENTIFIER | NUMBER | COMMENT | CHAR_LITERAL | STRING_LITERAL | WS )
		int alt6=61;
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
				// antlr/Neptune.g:1:34: ARRAY_VAR
				{
				mARRAY_VAR(); 

				}
				break;
			case 5 :
				// antlr/Neptune.g:1:44: ATOMIC_VAR
				{
				mATOMIC_VAR(); 

				}
				break;
			case 6 :
				// antlr/Neptune.g:1:55: BECOMES
				{
				mBECOMES(); 

				}
				break;
			case 7 :
				// antlr/Neptune.g:1:63: BLOCK
				{
				mBLOCK(); 

				}
				break;
			case 8 :
				// antlr/Neptune.g:1:69: BOOLEAN
				{
				mBOOLEAN(); 

				}
				break;
			case 9 :
				// antlr/Neptune.g:1:77: CHAR
				{
				mCHAR(); 

				}
				break;
			case 10 :
				// antlr/Neptune.g:1:82: COLON
				{
				mCOLON(); 

				}
				break;
			case 11 :
				// antlr/Neptune.g:1:88: COMMA
				{
				mCOMMA(); 

				}
				break;
			case 12 :
				// antlr/Neptune.g:1:94: CONST
				{
				mCONST(); 

				}
				break;
			case 13 :
				// antlr/Neptune.g:1:100: DIVIDE
				{
				mDIVIDE(); 

				}
				break;
			case 14 :
				// antlr/Neptune.g:1:107: DO
				{
				mDO(); 

				}
				break;
			case 15 :
				// antlr/Neptune.g:1:110: DQUOTE
				{
				mDQUOTE(); 

				}
				break;
			case 16 :
				// antlr/Neptune.g:1:117: ELSE
				{
				mELSE(); 

				}
				break;
			case 17 :
				// antlr/Neptune.g:1:122: ELSIF
				{
				mELSIF(); 

				}
				break;
			case 18 :
				// antlr/Neptune.g:1:128: EQ
				{
				mEQ(); 

				}
				break;
			case 19 :
				// antlr/Neptune.g:1:131: FALSE
				{
				mFALSE(); 

				}
				break;
			case 20 :
				// antlr/Neptune.g:1:137: FOREACH
				{
				mFOREACH(); 

				}
				break;
			case 21 :
				// antlr/Neptune.g:1:145: FUNCTION
				{
				mFUNCTION(); 

				}
				break;
			case 22 :
				// antlr/Neptune.g:1:154: GT
				{
				mGT(); 

				}
				break;
			case 23 :
				// antlr/Neptune.g:1:157: GT_EQ
				{
				mGT_EQ(); 

				}
				break;
			case 24 :
				// antlr/Neptune.g:1:163: IF
				{
				mIF(); 

				}
				break;
			case 25 :
				// antlr/Neptune.g:1:166: IN
				{
				mIN(); 

				}
				break;
			case 26 :
				// antlr/Neptune.g:1:169: INTEGER
				{
				mINTEGER(); 

				}
				break;
			case 27 :
				// antlr/Neptune.g:1:177: LBRACKET
				{
				mLBRACKET(); 

				}
				break;
			case 28 :
				// antlr/Neptune.g:1:186: LCURLY
				{
				mLCURLY(); 

				}
				break;
			case 29 :
				// antlr/Neptune.g:1:193: LPAREN
				{
				mLPAREN(); 

				}
				break;
			case 30 :
				// antlr/Neptune.g:1:200: LT
				{
				mLT(); 

				}
				break;
			case 31 :
				// antlr/Neptune.g:1:203: LT_EQ
				{
				mLT_EQ(); 

				}
				break;
			case 32 :
				// antlr/Neptune.g:1:209: MINUS
				{
				mMINUS(); 

				}
				break;
			case 33 :
				// antlr/Neptune.g:1:215: MOD
				{
				mMOD(); 

				}
				break;
			case 34 :
				// antlr/Neptune.g:1:219: NEGATE
				{
				mNEGATE(); 

				}
				break;
			case 35 :
				// antlr/Neptune.g:1:226: NEQ
				{
				mNEQ(); 

				}
				break;
			case 36 :
				// antlr/Neptune.g:1:230: OR
				{
				mOR(); 

				}
				break;
			case 37 :
				// antlr/Neptune.g:1:233: PLUS
				{
				mPLUS(); 

				}
				break;
			case 38 :
				// antlr/Neptune.g:1:238: PRINT
				{
				mPRINT(); 

				}
				break;
			case 39 :
				// antlr/Neptune.g:1:244: PROGRAM
				{
				mPROGRAM(); 

				}
				break;
			case 40 :
				// antlr/Neptune.g:1:252: QUOTE
				{
				mQUOTE(); 

				}
				break;
			case 41 :
				// antlr/Neptune.g:1:258: RBRACKET
				{
				mRBRACKET(); 

				}
				break;
			case 42 :
				// antlr/Neptune.g:1:267: RCURLY
				{
				mRCURLY(); 

				}
				break;
			case 43 :
				// antlr/Neptune.g:1:274: READ
				{
				mREAD(); 

				}
				break;
			case 44 :
				// antlr/Neptune.g:1:279: RETURN
				{
				mRETURN(); 

				}
				break;
			case 45 :
				// antlr/Neptune.g:1:286: RPAREN
				{
				mRPAREN(); 

				}
				break;
			case 46 :
				// antlr/Neptune.g:1:293: SEMICOLON
				{
				mSEMICOLON(); 

				}
				break;
			case 47 :
				// antlr/Neptune.g:1:303: SIZEOF
				{
				mSIZEOF(); 

				}
				break;
			case 48 :
				// antlr/Neptune.g:1:310: THEN
				{
				mTHEN(); 

				}
				break;
			case 49 :
				// antlr/Neptune.g:1:315: TIMES
				{
				mTIMES(); 

				}
				break;
			case 50 :
				// antlr/Neptune.g:1:321: TRUE
				{
				mTRUE(); 

				}
				break;
			case 51 :
				// antlr/Neptune.g:1:326: UNARY_MINUS
				{
				mUNARY_MINUS(); 

				}
				break;
			case 52 :
				// antlr/Neptune.g:1:338: UNARY_PLUS
				{
				mUNARY_PLUS(); 

				}
				break;
			case 53 :
				// antlr/Neptune.g:1:349: VAR
				{
				mVAR(); 

				}
				break;
			case 54 :
				// antlr/Neptune.g:1:353: WHILE
				{
				mWHILE(); 

				}
				break;
			case 55 :
				// antlr/Neptune.g:1:359: DROPIN_STATEMENT
				{
				mDROPIN_STATEMENT(); 

				}
				break;
			case 56 :
				// antlr/Neptune.g:1:376: IDENTIFIER
				{
				mIDENTIFIER(); 

				}
				break;
			case 57 :
				// antlr/Neptune.g:1:387: NUMBER
				{
				mNUMBER(); 

				}
				break;
			case 58 :
				// antlr/Neptune.g:1:394: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 59 :
				// antlr/Neptune.g:1:402: CHAR_LITERAL
				{
				mCHAR_LITERAL(); 

				}
				break;
			case 60 :
				// antlr/Neptune.g:1:415: STRING_LITERAL
				{
				mSTRING_LITERAL(); 

				}
				break;
			case 61 :
				// antlr/Neptune.g:1:430: WS
				{
				mWS(); 

				}
				break;

		}
	}


	protected DFA6 dfa6 = new DFA6(this);
	static final String DFA6_eotS =
		"\2\uffff\1\46\1\54\2\46\2\uffff\1\62\1\46\1\64\2\46\1\73\1\46\3\uffff"+
		"\1\77\2\uffff\1\101\2\uffff\1\46\1\104\2\uffff\1\46\2\uffff\2\46\1\uffff"+
		"\3\46\4\uffff\2\46\2\uffff\4\46\2\uffff\1\123\2\uffff\4\46\2\uffff\1\130"+
		"\1\132\4\uffff\1\46\2\uffff\4\46\2\uffff\10\46\1\uffff\4\46\1\uffff\1"+
		"\157\1\uffff\7\46\1\167\4\46\1\174\1\175\1\46\1\177\4\46\1\uffff\2\46"+
		"\1\u0086\2\46\1\u0089\1\u008a\1\uffff\3\46\1\u008e\2\uffff\1\u008f\1\uffff"+
		"\1\u0090\1\u0091\2\46\1\u0094\1\46\1\uffff\2\46\2\uffff\1\u0098\1\46\1"+
		"\u009c\4\uffff\2\46\1\uffff\1\46\1\u00a0\1\u00a1\1\uffff\3\46\1\uffff"+
		"\1\u00a5\1\46\1\u00a7\2\uffff\3\46\1\uffff\1\u00ab\1\uffff\1\u00ac\1\u00ad"+
		"\1\u00ae\4\uffff";
	static final String DFA6_eofS =
		"\u00af\uffff";
	static final String DFA6_minS =
		"\1\11\1\uffff\1\162\1\75\1\154\1\150\2\uffff\1\57\1\157\1\0\1\154\1\141"+
		"\1\75\1\146\3\uffff\1\75\2\uffff\1\75\2\uffff\1\162\1\0\2\uffff\1\145"+
		"\2\uffff\1\151\1\150\1\uffff\1\53\1\141\1\150\4\uffff\1\162\1\157\2\uffff"+
		"\2\157\1\141\1\156\2\uffff\1\60\2\uffff\1\163\1\154\1\162\1\156\2\uffff"+
		"\2\60\4\uffff\1\151\2\uffff\1\141\1\172\1\145\1\165\2\uffff\1\162\1\151"+
		"\1\141\1\155\1\143\1\154\1\162\1\163\1\uffff\1\145\1\163\1\145\1\143\1"+
		"\uffff\1\60\1\uffff\1\156\1\147\1\144\1\165\1\145\1\156\1\145\1\60\1\154"+
		"\1\171\1\151\1\153\2\60\1\164\1\60\1\146\1\145\1\141\1\164\1\uffff\1\164"+
		"\1\162\1\60\1\162\1\157\2\60\1\uffff\1\145\1\137\1\143\1\60\2\uffff\1"+
		"\60\1\uffff\2\60\1\143\1\151\1\60\1\141\1\uffff\1\156\1\146\2\uffff\1"+
		"\60\1\144\1\60\4\uffff\1\150\1\157\1\uffff\1\155\2\60\1\uffff\2\145\1"+
		"\141\1\uffff\1\60\1\156\1\60\2\uffff\1\146\1\164\1\162\1\uffff\1\60\1"+
		"\uffff\3\60\4\uffff";
	static final String DFA6_maxS =
		"\1\175\1\uffff\1\164\1\75\2\157\2\uffff\1\57\1\157\1\uffff\1\154\1\165"+
		"\1\75\1\156\3\uffff\1\75\2\uffff\1\75\2\uffff\1\162\1\uffff\2\uffff\1"+
		"\145\2\uffff\1\151\1\162\1\uffff\1\55\1\141\1\150\4\uffff\1\162\1\157"+
		"\2\uffff\2\157\1\141\1\156\2\uffff\1\172\2\uffff\1\163\1\154\1\162\1\156"+
		"\2\uffff\2\172\4\uffff\1\157\2\uffff\1\164\1\172\1\145\1\165\2\uffff\1"+
		"\162\1\151\1\141\1\155\1\143\1\154\1\162\1\163\1\uffff\1\151\1\163\1\145"+
		"\1\143\1\uffff\1\172\1\uffff\1\156\1\147\1\144\1\165\1\145\1\156\1\145"+
		"\1\172\1\154\1\171\1\151\1\153\2\172\1\164\1\172\1\146\1\145\1\141\1\164"+
		"\1\uffff\1\164\1\162\1\172\1\162\1\157\2\172\1\uffff\1\145\1\137\1\143"+
		"\1\172\2\uffff\1\172\1\uffff\2\172\1\143\1\151\1\172\1\141\1\uffff\1\156"+
		"\1\146\2\uffff\1\172\1\166\1\172\4\uffff\1\150\1\157\1\uffff\1\155\2\172"+
		"\1\uffff\2\145\1\141\1\uffff\1\172\1\156\1\172\2\uffff\1\146\1\164\1\162"+
		"\1\uffff\1\172\1\uffff\3\172\4\uffff";
	static final String DFA6_acceptS =
		"\1\uffff\1\1\4\uffff\1\12\1\13\7\uffff\1\33\1\34\1\35\1\uffff\1\40\1\41"+
		"\1\uffff\1\44\1\45\2\uffff\1\51\1\52\1\uffff\1\55\1\56\2\uffff\1\61\3"+
		"\uffff\1\67\1\70\1\71\1\75\2\uffff\1\22\1\6\4\uffff\1\72\1\15\1\uffff"+
		"\1\17\1\74\4\uffff\1\27\1\26\2\uffff\1\37\1\36\1\43\1\42\1\uffff\1\73"+
		"\1\50\4\uffff\1\63\1\64\10\uffff\1\16\4\uffff\1\30\1\uffff\1\31\24\uffff"+
		"\1\32\7\uffff\1\65\4\uffff\1\10\1\11\1\uffff\1\20\6\uffff\1\53\2\uffff"+
		"\1\60\1\62\3\uffff\1\7\1\14\1\21\1\23\2\uffff\1\46\3\uffff\1\66\3\uffff"+
		"\1\5\3\uffff\1\54\1\57\3\uffff\1\24\1\uffff\1\47\3\uffff\1\25\1\2\1\3"+
		"\1\4";
	static final String DFA6_specialS =
		"\12\uffff\1\1\16\uffff\1\0\u0095\uffff}>";
	static final String[] DFA6_transitionS = {
			"\2\50\1\uffff\2\50\22\uffff\1\50\1\25\1\12\1\45\1\uffff\1\24\1\1\1\31"+
			"\1\21\1\35\1\41\1\27\1\7\1\23\1\uffff\1\10\12\47\1\6\1\36\1\22\1\3\1"+
			"\15\2\uffff\32\46\1\17\1\uffff\1\32\3\uffff\1\2\1\4\1\5\1\11\1\13\1\14"+
			"\2\46\1\16\6\46\1\30\1\46\1\34\1\37\1\40\1\42\1\43\1\44\3\46\1\20\1\26"+
			"\1\33",
			"",
			"\1\51\1\uffff\1\52",
			"\1\53",
			"\1\55\2\uffff\1\56",
			"\1\57\6\uffff\1\60",
			"",
			"",
			"\1\61",
			"\1\63",
			"\42\65\1\uffff\uffdd\65",
			"\1\66",
			"\1\67\15\uffff\1\70\5\uffff\1\71",
			"\1\72",
			"\1\74\7\uffff\1\75",
			"",
			"",
			"",
			"\1\76",
			"",
			"",
			"\1\100",
			"",
			"",
			"\1\102",
			"\47\103\1\uffff\uffd8\103",
			"",
			"",
			"\1\105",
			"",
			"",
			"\1\106",
			"\1\107\11\uffff\1\110",
			"",
			"\1\112\1\uffff\1\111",
			"\1\113",
			"\1\114",
			"",
			"",
			"",
			"",
			"\1\115",
			"\1\116",
			"",
			"",
			"\1\117",
			"\1\120",
			"\1\121",
			"\1\122",
			"",
			"",
			"\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
			"",
			"",
			"\1\124",
			"\1\125",
			"\1\126",
			"\1\127",
			"",
			"",
			"\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
			"\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\23\46\1\131\6\46",
			"",
			"",
			"",
			"",
			"\1\133\5\uffff\1\134",
			"",
			"",
			"\1\135\22\uffff\1\136",
			"\1\137",
			"\1\140",
			"\1\141",
			"",
			"",
			"\1\142",
			"\1\143",
			"\1\144",
			"\1\145",
			"\1\146",
			"\1\147",
			"\1\150",
			"\1\151",
			"",
			"\1\152\3\uffff\1\153",
			"\1\154",
			"\1\155",
			"\1\156",
			"",
			"\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
			"",
			"\1\160",
			"\1\161",
			"\1\162",
			"\1\163",
			"\1\164",
			"\1\165",
			"\1\166",
			"\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
			"\1\170",
			"\1\171",
			"\1\172",
			"\1\173",
			"\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
			"\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
			"\1\176",
			"\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
			"\1\u0080",
			"\1\u0081",
			"\1\u0082",
			"\1\u0083",
			"",
			"\1\u0084",
			"\1\u0085",
			"\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
			"\1\u0087",
			"\1\u0088",
			"\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
			"\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
			"",
			"\1\u008b",
			"\1\u008c",
			"\1\u008d",
			"\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
			"",
			"",
			"\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
			"",
			"\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
			"\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
			"\1\u0092",
			"\1\u0093",
			"\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
			"\1\u0095",
			"",
			"\1\u0096",
			"\1\u0097",
			"",
			"",
			"\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
			"\1\u0099\16\uffff\1\u009a\2\uffff\1\u009b",
			"\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
			"",
			"",
			"",
			"",
			"\1\u009d",
			"\1\u009e",
			"",
			"\1\u009f",
			"\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
			"\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
			"",
			"\1\u00a2",
			"\1\u00a3",
			"\1\u00a4",
			"",
			"\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
			"\1\u00a6",
			"\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
			"",
			"",
			"\1\u00a8",
			"\1\u00a9",
			"\1\u00aa",
			"",
			"\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
			"",
			"\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
			"\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
			"\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
			"",
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
			return "1:1: Tokens : ( AND | ARRAY_DEF | ARRAY_SET | ARRAY_VAR | ATOMIC_VAR | BECOMES | BLOCK | BOOLEAN | CHAR | COLON | COMMA | CONST | DIVIDE | DO | DQUOTE | ELSE | ELSIF | EQ | FALSE | FOREACH | FUNCTION | GT | GT_EQ | IF | IN | INTEGER | LBRACKET | LCURLY | LPAREN | LT | LT_EQ | MINUS | MOD | NEGATE | NEQ | OR | PLUS | PRINT | PROGRAM | QUOTE | RBRACKET | RCURLY | READ | RETURN | RPAREN | SEMICOLON | SIZEOF | THEN | TIMES | TRUE | UNARY_MINUS | UNARY_PLUS | VAR | WHILE | DROPIN_STATEMENT | IDENTIFIER | NUMBER | COMMENT | CHAR_LITERAL | STRING_LITERAL | WS );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			IntStream input = _input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA6_25 = input.LA(1);
						s = -1;
						if ( ((LA6_25 >= '\u0000' && LA6_25 <= '&')||(LA6_25 >= '(' && LA6_25 <= '\uFFFF')) ) {s = 67;}
						else s = 68;
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA6_10 = input.LA(1);
						s = -1;
						if ( ((LA6_10 >= '\u0000' && LA6_10 <= '!')||(LA6_10 >= '#' && LA6_10 <= '\uFFFF')) ) {s = 53;}
						else s = 52;
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

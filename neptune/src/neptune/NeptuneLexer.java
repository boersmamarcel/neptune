// $ANTLR 3.5.2 Neptune.g 2014-05-30 22:59:35

package neptune;

import java.io.File;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class NeptuneLexer extends Lexer {
	public static final int EOF=-1;
	public static final int ARRAY_SET=4;
	public static final int BECOMES=5;
	public static final int BOOLEAN=6;
	public static final int CHAR=7;
	public static final int CHAR_LITERAL=8;
	public static final int COLON=9;
	public static final int COMMA=10;
	public static final int COMMENT=11;
	public static final int CONST=12;
	public static final int DIGIT=13;
	public static final int DIVIDE=14;
	public static final int DO=15;
	public static final int DQUOTE=16;
	public static final int DROPIN_STATEMENT=17;
	public static final int ELSE=18;
	public static final int ELSIF=19;
	public static final int EQ=20;
	public static final int FALSE=21;
	public static final int FOREACH=22;
	public static final int FUNCTION=23;
	public static final int GT=24;
	public static final int GT_EQ=25;
	public static final int IDENTIFIER=26;
	public static final int IF=27;
	public static final int IN=28;
	public static final int INTEGER=29;
	public static final int LBRACKET=30;
	public static final int LCURLY=31;
	public static final int LETTER=32;
	public static final int LOWER=33;
	public static final int LPAREN=34;
	public static final int LT=35;
	public static final int LT_EQ=36;
	public static final int MINUS=37;
	public static final int NEQ=38;
	public static final int NUMBER=39;
	public static final int PLUS=40;
	public static final int PRINT=41;
	public static final int PROGRAM=42;
	public static final int QUOTE=43;
	public static final int RBRACKET=44;
	public static final int RCURLY=45;
	public static final int READ=46;
	public static final int RETURN=47;
	public static final int RPAREN=48;
	public static final int SEMICOLON=49;
	public static final int STRING_LITERAL=50;
	public static final int THEN=51;
	public static final int TIMES=52;
	public static final int TRUE=53;
	public static final int UPPER=54;
	public static final int VAR=55;
	public static final int WHILE=56;
	public static final int WS=57;

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
	@Override public String getGrammarFileName() { return "Neptune.g"; }

	// $ANTLR start "ARRAY_SET"
	public final void mARRAY_SET() throws RecognitionException {
		try {
			int _type = ARRAY_SET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Neptune.g:47:11: ( 'array_set' )
			// Neptune.g:47:13: 'array_set'
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
			// Neptune.g:48:9: ( '=' )
			// Neptune.g:48:11: '='
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

	// $ANTLR start "BOOLEAN"
	public final void mBOOLEAN() throws RecognitionException {
		try {
			int _type = BOOLEAN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Neptune.g:49:9: ( 'bool' )
			// Neptune.g:49:11: 'bool'
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
			// Neptune.g:50:6: ( 'char' )
			// Neptune.g:50:8: 'char'
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
			// Neptune.g:51:7: ( ':' )
			// Neptune.g:51:9: ':'
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
			// Neptune.g:52:7: ( ',' )
			// Neptune.g:52:9: ','
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
			// Neptune.g:53:7: ( 'const' )
			// Neptune.g:53:9: 'const'
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
			// Neptune.g:54:8: ( '/' )
			// Neptune.g:54:10: '/'
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
			// Neptune.g:55:4: ( 'do' )
			// Neptune.g:55:6: 'do'
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
			// Neptune.g:56:8: ( '\"' )
			// Neptune.g:56:10: '\"'
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
			// Neptune.g:57:6: ( 'else' )
			// Neptune.g:57:8: 'else'
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
			// Neptune.g:58:7: ( 'elsif' )
			// Neptune.g:58:9: 'elsif'
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
			// Neptune.g:59:4: ( '==' )
			// Neptune.g:59:6: '=='
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
			// Neptune.g:60:7: ( 'false' )
			// Neptune.g:60:9: 'false'
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
			// Neptune.g:61:9: ( 'foreach' )
			// Neptune.g:61:11: 'foreach'
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
			// Neptune.g:62:10: ( 'function' )
			// Neptune.g:62:12: 'function'
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
			// Neptune.g:63:4: ( '>' )
			// Neptune.g:63:6: '>'
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
			// Neptune.g:64:7: ( '>=' )
			// Neptune.g:64:9: '>='
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
			// Neptune.g:65:4: ( 'if' )
			// Neptune.g:65:6: 'if'
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
			// Neptune.g:66:4: ( 'in' )
			// Neptune.g:66:6: 'in'
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
			// Neptune.g:67:9: ( 'int' )
			// Neptune.g:67:11: 'int'
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
			// Neptune.g:68:10: ( '[' )
			// Neptune.g:68:12: '['
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
			// Neptune.g:69:8: ( '{' )
			// Neptune.g:69:10: '{'
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
			// Neptune.g:70:8: ( '(' )
			// Neptune.g:70:10: '('
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
			// Neptune.g:71:4: ( '<' )
			// Neptune.g:71:6: '<'
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
			// Neptune.g:72:7: ( '<=' )
			// Neptune.g:72:9: '<='
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
			// Neptune.g:73:7: ( '-' )
			// Neptune.g:73:9: '-'
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

	// $ANTLR start "NEQ"
	public final void mNEQ() throws RecognitionException {
		try {
			int _type = NEQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Neptune.g:74:5: ( '!=' )
			// Neptune.g:74:7: '!='
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

	// $ANTLR start "PLUS"
	public final void mPLUS() throws RecognitionException {
		try {
			int _type = PLUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Neptune.g:75:6: ( '+' )
			// Neptune.g:75:8: '+'
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
			// Neptune.g:76:7: ( 'print' )
			// Neptune.g:76:9: 'print'
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
			// Neptune.g:77:9: ( 'program' )
			// Neptune.g:77:11: 'program'
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
			// Neptune.g:78:7: ( '\\'' )
			// Neptune.g:78:9: '\\''
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
			// Neptune.g:79:10: ( ']' )
			// Neptune.g:79:12: ']'
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
			// Neptune.g:80:8: ( '}' )
			// Neptune.g:80:10: '}'
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
			// Neptune.g:81:6: ( 'read' )
			// Neptune.g:81:8: 'read'
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
			// Neptune.g:82:8: ( 'return' )
			// Neptune.g:82:10: 'return'
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
			// Neptune.g:83:8: ( ')' )
			// Neptune.g:83:10: ')'
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
			// Neptune.g:84:11: ( ';' )
			// Neptune.g:84:13: ';'
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

	// $ANTLR start "THEN"
	public final void mTHEN() throws RecognitionException {
		try {
			int _type = THEN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Neptune.g:85:6: ( 'then' )
			// Neptune.g:85:8: 'then'
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
			// Neptune.g:86:7: ( '*' )
			// Neptune.g:86:9: '*'
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
			// Neptune.g:87:6: ( 'true' )
			// Neptune.g:87:8: 'true'
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

	// $ANTLR start "VAR"
	public final void mVAR() throws RecognitionException {
		try {
			int _type = VAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Neptune.g:88:5: ( 'var' )
			// Neptune.g:88:7: 'var'
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
			// Neptune.g:89:7: ( 'while' )
			// Neptune.g:89:9: 'while'
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

			// Neptune.g:209:2: ( '#dropin' LPAREN f= STRING_LITERAL RPAREN )
			// Neptune.g:209:4: '#dropin' LPAREN f= STRING_LITERAL RPAREN
			{
			match("#dropin"); 

			mLPAREN(); 

			int fStart388 = getCharIndex();
			int fStartLine388 = getLine();
			int fStartCharPos388 = getCharPositionInLine();
			mSTRING_LITERAL(); 
			f = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, fStart388, getCharIndex()-1);
			f.setLine(fStartLine388);
			f.setCharPositionInLine(fStartCharPos388);

			mRPAREN(); 


				       String name = (f!=null?f.getText():null);
				       name = name.substring(1,name.length()-1);
						name = new File("").getAbsolutePath() + "/src/test/sample/" + name;
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
			// Neptune.g:227:5: ( LETTER ( LETTER | DIGIT | '_' )* )
			// Neptune.g:227:9: LETTER ( LETTER | DIGIT | '_' )*
			{
			mLETTER(); 

			// Neptune.g:227:16: ( LETTER | DIGIT | '_' )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// Neptune.g:
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
			// Neptune.g:231:5: ( ( DIGIT )+ )
			// Neptune.g:231:9: ( DIGIT )+
			{
			// Neptune.g:231:9: ( DIGIT )+
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
					// Neptune.g:
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
			// Neptune.g:236:5: ( '//' ( . )* '\\n' )
			// Neptune.g:236:9: '//' ( . )* '\\n'
			{
			match("//"); 

			// Neptune.g:236:14: ( . )*
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
					// Neptune.g:236:14: .
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
			// Neptune.g:241:2: ( '\\'' ~ '\\'' '\\'' )
			// Neptune.g:241:4: '\\'' ~ '\\'' '\\''
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
			// Neptune.g:245:2: ( '\"' (~ '\"' )+ '\"' )
			// Neptune.g:245:4: '\"' (~ '\"' )+ '\"'
			{
			match('\"'); 
			// Neptune.g:245:8: (~ '\"' )+
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
					// Neptune.g:
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
			// Neptune.g:249:5: ( ( ' ' | '\\t' | '\\f' | '\\r' | '\\n' )+ )
			// Neptune.g:249:9: ( ' ' | '\\t' | '\\f' | '\\r' | '\\n' )+
			{
			// Neptune.g:249:9: ( ' ' | '\\t' | '\\f' | '\\r' | '\\n' )+
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
					// Neptune.g:
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
			// Neptune.g:253:17: ( ( '0' .. '9' ) )
			// Neptune.g:
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
			// Neptune.g:254:17: ( ( 'a' .. 'z' ) )
			// Neptune.g:
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
			// Neptune.g:255:17: ( ( 'A' .. 'Z' ) )
			// Neptune.g:
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
			// Neptune.g:256:17: ( LOWER | UPPER )
			// Neptune.g:
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
		// Neptune.g:1:8: ( ARRAY_SET | BECOMES | BOOLEAN | CHAR | COLON | COMMA | CONST | DIVIDE | DO | DQUOTE | ELSE | ELSIF | EQ | FALSE | FOREACH | FUNCTION | GT | GT_EQ | IF | IN | INTEGER | LBRACKET | LCURLY | LPAREN | LT | LT_EQ | MINUS | NEQ | PLUS | PRINT | PROGRAM | QUOTE | RBRACKET | RCURLY | READ | RETURN | RPAREN | SEMICOLON | THEN | TIMES | TRUE | VAR | WHILE | DROPIN_STATEMENT | IDENTIFIER | NUMBER | COMMENT | CHAR_LITERAL | STRING_LITERAL | WS )
		int alt6=50;
		alt6 = dfa6.predict(input);
		switch (alt6) {
			case 1 :
				// Neptune.g:1:10: ARRAY_SET
				{
				mARRAY_SET(); 

				}
				break;
			case 2 :
				// Neptune.g:1:20: BECOMES
				{
				mBECOMES(); 

				}
				break;
			case 3 :
				// Neptune.g:1:28: BOOLEAN
				{
				mBOOLEAN(); 

				}
				break;
			case 4 :
				// Neptune.g:1:36: CHAR
				{
				mCHAR(); 

				}
				break;
			case 5 :
				// Neptune.g:1:41: COLON
				{
				mCOLON(); 

				}
				break;
			case 6 :
				// Neptune.g:1:47: COMMA
				{
				mCOMMA(); 

				}
				break;
			case 7 :
				// Neptune.g:1:53: CONST
				{
				mCONST(); 

				}
				break;
			case 8 :
				// Neptune.g:1:59: DIVIDE
				{
				mDIVIDE(); 

				}
				break;
			case 9 :
				// Neptune.g:1:66: DO
				{
				mDO(); 

				}
				break;
			case 10 :
				// Neptune.g:1:69: DQUOTE
				{
				mDQUOTE(); 

				}
				break;
			case 11 :
				// Neptune.g:1:76: ELSE
				{
				mELSE(); 

				}
				break;
			case 12 :
				// Neptune.g:1:81: ELSIF
				{
				mELSIF(); 

				}
				break;
			case 13 :
				// Neptune.g:1:87: EQ
				{
				mEQ(); 

				}
				break;
			case 14 :
				// Neptune.g:1:90: FALSE
				{
				mFALSE(); 

				}
				break;
			case 15 :
				// Neptune.g:1:96: FOREACH
				{
				mFOREACH(); 

				}
				break;
			case 16 :
				// Neptune.g:1:104: FUNCTION
				{
				mFUNCTION(); 

				}
				break;
			case 17 :
				// Neptune.g:1:113: GT
				{
				mGT(); 

				}
				break;
			case 18 :
				// Neptune.g:1:116: GT_EQ
				{
				mGT_EQ(); 

				}
				break;
			case 19 :
				// Neptune.g:1:122: IF
				{
				mIF(); 

				}
				break;
			case 20 :
				// Neptune.g:1:125: IN
				{
				mIN(); 

				}
				break;
			case 21 :
				// Neptune.g:1:128: INTEGER
				{
				mINTEGER(); 

				}
				break;
			case 22 :
				// Neptune.g:1:136: LBRACKET
				{
				mLBRACKET(); 

				}
				break;
			case 23 :
				// Neptune.g:1:145: LCURLY
				{
				mLCURLY(); 

				}
				break;
			case 24 :
				// Neptune.g:1:152: LPAREN
				{
				mLPAREN(); 

				}
				break;
			case 25 :
				// Neptune.g:1:159: LT
				{
				mLT(); 

				}
				break;
			case 26 :
				// Neptune.g:1:162: LT_EQ
				{
				mLT_EQ(); 

				}
				break;
			case 27 :
				// Neptune.g:1:168: MINUS
				{
				mMINUS(); 

				}
				break;
			case 28 :
				// Neptune.g:1:174: NEQ
				{
				mNEQ(); 

				}
				break;
			case 29 :
				// Neptune.g:1:178: PLUS
				{
				mPLUS(); 

				}
				break;
			case 30 :
				// Neptune.g:1:183: PRINT
				{
				mPRINT(); 

				}
				break;
			case 31 :
				// Neptune.g:1:189: PROGRAM
				{
				mPROGRAM(); 

				}
				break;
			case 32 :
				// Neptune.g:1:197: QUOTE
				{
				mQUOTE(); 

				}
				break;
			case 33 :
				// Neptune.g:1:203: RBRACKET
				{
				mRBRACKET(); 

				}
				break;
			case 34 :
				// Neptune.g:1:212: RCURLY
				{
				mRCURLY(); 

				}
				break;
			case 35 :
				// Neptune.g:1:219: READ
				{
				mREAD(); 

				}
				break;
			case 36 :
				// Neptune.g:1:224: RETURN
				{
				mRETURN(); 

				}
				break;
			case 37 :
				// Neptune.g:1:231: RPAREN
				{
				mRPAREN(); 

				}
				break;
			case 38 :
				// Neptune.g:1:238: SEMICOLON
				{
				mSEMICOLON(); 

				}
				break;
			case 39 :
				// Neptune.g:1:248: THEN
				{
				mTHEN(); 

				}
				break;
			case 40 :
				// Neptune.g:1:253: TIMES
				{
				mTIMES(); 

				}
				break;
			case 41 :
				// Neptune.g:1:259: TRUE
				{
				mTRUE(); 

				}
				break;
			case 42 :
				// Neptune.g:1:264: VAR
				{
				mVAR(); 

				}
				break;
			case 43 :
				// Neptune.g:1:268: WHILE
				{
				mWHILE(); 

				}
				break;
			case 44 :
				// Neptune.g:1:274: DROPIN_STATEMENT
				{
				mDROPIN_STATEMENT(); 

				}
				break;
			case 45 :
				// Neptune.g:1:291: IDENTIFIER
				{
				mIDENTIFIER(); 

				}
				break;
			case 46 :
				// Neptune.g:1:302: NUMBER
				{
				mNUMBER(); 

				}
				break;
			case 47 :
				// Neptune.g:1:309: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 48 :
				// Neptune.g:1:317: CHAR_LITERAL
				{
				mCHAR_LITERAL(); 

				}
				break;
			case 49 :
				// Neptune.g:1:330: STRING_LITERAL
				{
				mSTRING_LITERAL(); 

				}
				break;
			case 50 :
				// Neptune.g:1:345: WS
				{
				mWS(); 

				}
				break;

		}
	}


	protected DFA6 dfa6 = new DFA6(this);
	static final String DFA6_eotS =
		"\1\uffff\1\41\1\46\2\41\2\uffff\1\53\1\41\1\55\2\41\1\64\1\41\3\uffff"+
		"\1\70\3\uffff\1\41\1\73\2\uffff\1\41\2\uffff\1\41\1\uffff\2\41\4\uffff"+
		"\1\41\2\uffff\3\41\2\uffff\1\105\2\uffff\4\41\2\uffff\1\112\1\114\2\uffff"+
		"\1\41\2\uffff\11\41\1\uffff\4\41\1\uffff\1\136\1\uffff\6\41\1\145\2\41"+
		"\1\150\1\151\1\41\1\153\4\41\1\uffff\2\41\1\162\1\41\1\164\1\165\1\uffff"+
		"\2\41\2\uffff\1\170\1\uffff\1\171\1\172\2\41\1\175\1\41\1\uffff\1\41\2"+
		"\uffff\1\u0080\1\41\3\uffff\2\41\1\uffff\1\41\1\u0085\1\uffff\1\41\1\u0087"+
		"\1\41\1\u0089\1\uffff\1\41\1\uffff\1\u008b\1\uffff\1\u008c\2\uffff";
	static final String DFA6_eofS =
		"\u008d\uffff";
	static final String DFA6_minS =
		"\1\11\1\162\1\75\1\157\1\150\2\uffff\1\57\1\157\1\0\1\154\1\141\1\75\1"+
		"\146\3\uffff\1\75\3\uffff\1\162\1\0\2\uffff\1\145\2\uffff\1\150\1\uffff"+
		"\1\141\1\150\4\uffff\1\162\2\uffff\1\157\1\141\1\156\2\uffff\1\60\2\uffff"+
		"\1\163\1\154\1\162\1\156\2\uffff\2\60\2\uffff\1\151\2\uffff\1\141\1\145"+
		"\1\165\1\162\1\151\1\141\1\154\1\162\1\163\1\uffff\1\145\1\163\1\145\1"+
		"\143\1\uffff\1\60\1\uffff\1\156\1\147\1\144\1\165\1\156\1\145\1\60\1\154"+
		"\1\171\2\60\1\164\1\60\1\146\1\145\1\141\1\164\1\uffff\1\164\1\162\1\60"+
		"\1\162\2\60\1\uffff\1\145\1\137\2\uffff\1\60\1\uffff\2\60\1\143\1\151"+
		"\1\60\1\141\1\uffff\1\156\2\uffff\1\60\1\163\3\uffff\1\150\1\157\1\uffff"+
		"\1\155\1\60\1\uffff\1\145\1\60\1\156\1\60\1\uffff\1\164\1\uffff\1\60\1"+
		"\uffff\1\60\2\uffff";
	static final String DFA6_maxS =
		"\1\175\1\162\1\75\2\157\2\uffff\1\57\1\157\1\uffff\1\154\1\165\1\75\1"+
		"\156\3\uffff\1\75\3\uffff\1\162\1\uffff\2\uffff\1\145\2\uffff\1\162\1"+
		"\uffff\1\141\1\150\4\uffff\1\162\2\uffff\1\157\1\141\1\156\2\uffff\1\172"+
		"\2\uffff\1\163\1\154\1\162\1\156\2\uffff\2\172\2\uffff\1\157\2\uffff\1"+
		"\164\1\145\1\165\1\162\1\151\1\141\1\154\1\162\1\163\1\uffff\1\151\1\163"+
		"\1\145\1\143\1\uffff\1\172\1\uffff\1\156\1\147\1\144\1\165\1\156\1\145"+
		"\1\172\1\154\1\171\2\172\1\164\1\172\1\146\1\145\1\141\1\164\1\uffff\1"+
		"\164\1\162\1\172\1\162\2\172\1\uffff\1\145\1\137\2\uffff\1\172\1\uffff"+
		"\2\172\1\143\1\151\1\172\1\141\1\uffff\1\156\2\uffff\1\172\1\163\3\uffff"+
		"\1\150\1\157\1\uffff\1\155\1\172\1\uffff\1\145\1\172\1\156\1\172\1\uffff"+
		"\1\164\1\uffff\1\172\1\uffff\1\172\2\uffff";
	static final String DFA6_acceptS =
		"\5\uffff\1\5\1\6\7\uffff\1\26\1\27\1\30\1\uffff\1\33\1\34\1\35\2\uffff"+
		"\1\41\1\42\1\uffff\1\45\1\46\1\uffff\1\50\2\uffff\1\54\1\55\1\56\1\62"+
		"\1\uffff\1\15\1\2\3\uffff\1\57\1\10\1\uffff\1\12\1\61\4\uffff\1\22\1\21"+
		"\2\uffff\1\32\1\31\1\uffff\1\60\1\40\11\uffff\1\11\4\uffff\1\23\1\uffff"+
		"\1\24\21\uffff\1\25\6\uffff\1\52\2\uffff\1\3\1\4\1\uffff\1\13\6\uffff"+
		"\1\43\1\uffff\1\47\1\51\2\uffff\1\7\1\14\1\16\2\uffff\1\36\2\uffff\1\53"+
		"\4\uffff\1\44\1\uffff\1\17\1\uffff\1\37\1\uffff\1\20\1\1";
	static final String DFA6_specialS =
		"\11\uffff\1\0\14\uffff\1\1\166\uffff}>";
	static final String[] DFA6_transitionS = {
			"\2\43\1\uffff\2\43\22\uffff\1\43\1\23\1\11\1\40\3\uffff\1\26\1\20\1\32"+
			"\1\35\1\24\1\6\1\22\1\uffff\1\7\12\42\1\5\1\33\1\21\1\2\1\14\2\uffff"+
			"\32\41\1\16\1\uffff\1\27\3\uffff\1\1\1\3\1\4\1\10\1\12\1\13\2\41\1\15"+
			"\6\41\1\25\1\41\1\31\1\41\1\34\1\41\1\36\1\37\3\41\1\17\1\uffff\1\30",
			"\1\44",
			"\1\45",
			"\1\47",
			"\1\50\6\uffff\1\51",
			"",
			"",
			"\1\52",
			"\1\54",
			"\42\56\1\uffff\uffdd\56",
			"\1\57",
			"\1\60\15\uffff\1\61\5\uffff\1\62",
			"\1\63",
			"\1\65\7\uffff\1\66",
			"",
			"",
			"",
			"\1\67",
			"",
			"",
			"",
			"\1\71",
			"\47\72\1\uffff\uffd8\72",
			"",
			"",
			"\1\74",
			"",
			"",
			"\1\75\11\uffff\1\76",
			"",
			"\1\77",
			"\1\100",
			"",
			"",
			"",
			"",
			"\1\101",
			"",
			"",
			"\1\102",
			"\1\103",
			"\1\104",
			"",
			"",
			"\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
			"",
			"",
			"\1\106",
			"\1\107",
			"\1\110",
			"\1\111",
			"",
			"",
			"\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
			"\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\23\41\1\113\6\41",
			"",
			"",
			"\1\115\5\uffff\1\116",
			"",
			"",
			"\1\117\22\uffff\1\120",
			"\1\121",
			"\1\122",
			"\1\123",
			"\1\124",
			"\1\125",
			"\1\126",
			"\1\127",
			"\1\130",
			"",
			"\1\131\3\uffff\1\132",
			"\1\133",
			"\1\134",
			"\1\135",
			"",
			"\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
			"",
			"\1\137",
			"\1\140",
			"\1\141",
			"\1\142",
			"\1\143",
			"\1\144",
			"\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
			"\1\146",
			"\1\147",
			"\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
			"\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
			"\1\152",
			"\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
			"\1\154",
			"\1\155",
			"\1\156",
			"\1\157",
			"",
			"\1\160",
			"\1\161",
			"\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
			"\1\163",
			"\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
			"\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
			"",
			"\1\166",
			"\1\167",
			"",
			"",
			"\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
			"",
			"\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
			"\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
			"\1\173",
			"\1\174",
			"\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
			"\1\176",
			"",
			"\1\177",
			"",
			"",
			"\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
			"\1\u0081",
			"",
			"",
			"",
			"\1\u0082",
			"\1\u0083",
			"",
			"\1\u0084",
			"\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
			"",
			"\1\u0086",
			"\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
			"\1\u0088",
			"\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
			"",
			"\1\u008a",
			"",
			"\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
			"",
			"\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
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
			return "1:1: Tokens : ( ARRAY_SET | BECOMES | BOOLEAN | CHAR | COLON | COMMA | CONST | DIVIDE | DO | DQUOTE | ELSE | ELSIF | EQ | FALSE | FOREACH | FUNCTION | GT | GT_EQ | IF | IN | INTEGER | LBRACKET | LCURLY | LPAREN | LT | LT_EQ | MINUS | NEQ | PLUS | PRINT | PROGRAM | QUOTE | RBRACKET | RCURLY | READ | RETURN | RPAREN | SEMICOLON | THEN | TIMES | TRUE | VAR | WHILE | DROPIN_STATEMENT | IDENTIFIER | NUMBER | COMMENT | CHAR_LITERAL | STRING_LITERAL | WS );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			IntStream input = _input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA6_9 = input.LA(1);
						s = -1;
						if ( ((LA6_9 >= '\u0000' && LA6_9 <= '!')||(LA6_9 >= '#' && LA6_9 <= '\uFFFF')) ) {s = 46;}
						else s = 45;
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA6_22 = input.LA(1);
						s = -1;
						if ( ((LA6_22 >= '\u0000' && LA6_22 <= '&')||(LA6_22 >= '(' && LA6_22 <= '\uFFFF')) ) {s = 58;}
						else s = 59;
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

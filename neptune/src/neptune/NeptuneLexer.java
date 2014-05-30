// $ANTLR 3.5.2 Neptune.g 2014-05-30 14:19:27

package neptune;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class NeptuneLexer extends Lexer {
	public static final int EOF=-1;
	public static final int T__56=56;
	public static final int ARRAY_SET=4;
	public static final int BECOMES=5;
	public static final int BOOLEAN=6;
	public static final int CHAR=7;
	public static final int COLON=8;
	public static final int COMMA=9;
	public static final int COMMENT=10;
	public static final int CONST=11;
	public static final int DIGIT=12;
	public static final int DIVIDE=13;
	public static final int DO=14;
	public static final int DQUOTE=15;
	public static final int ELSE=16;
	public static final int ELSIF=17;
	public static final int EQ=18;
	public static final int FALSE=19;
	public static final int FOREACH=20;
	public static final int FUNCTION=21;
	public static final int GT=22;
	public static final int GT_EQ=23;
	public static final int IDENTIFIER=24;
	public static final int IF=25;
	public static final int IN=26;
	public static final int INCLUDE=27;
	public static final int INTEGER=28;
	public static final int LBRACKET=29;
	public static final int LCURLY=30;
	public static final int LETTER=31;
	public static final int LOWER=32;
	public static final int LPAREN=33;
	public static final int LT=34;
	public static final int LT_EQ=35;
	public static final int MINUS=36;
	public static final int NEQ=37;
	public static final int NUMBER=38;
	public static final int PLUS=39;
	public static final int PRINT=40;
	public static final int PROGRAM=41;
	public static final int QUOTE=42;
	public static final int RBRACKET=43;
	public static final int RCURLY=44;
	public static final int READ=45;
	public static final int RETURN=46;
	public static final int RPAREN=47;
	public static final int SEMICOLON=48;
	public static final int THEN=49;
	public static final int TIMES=50;
	public static final int TRUE=51;
	public static final int UPPER=52;
	public static final int VAR=53;
	public static final int WHILE=54;
	public static final int WS=55;

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
			// Neptune.g:11:11: ( 'array_set' )
			// Neptune.g:11:13: 'array_set'
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
			// Neptune.g:12:9: ( '=' )
			// Neptune.g:12:11: '='
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
			// Neptune.g:13:9: ( 'bool' )
			// Neptune.g:13:11: 'bool'
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
			// Neptune.g:14:6: ( 'char' )
			// Neptune.g:14:8: 'char'
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
			// Neptune.g:15:7: ( ':' )
			// Neptune.g:15:9: ':'
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
			// Neptune.g:16:7: ( ',' )
			// Neptune.g:16:9: ','
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
			// Neptune.g:17:7: ( 'const' )
			// Neptune.g:17:9: 'const'
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
			// Neptune.g:18:8: ( '/' )
			// Neptune.g:18:10: '/'
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
			// Neptune.g:19:4: ( 'do' )
			// Neptune.g:19:6: 'do'
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
			// Neptune.g:20:8: ( '\"' )
			// Neptune.g:20:10: '\"'
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
			// Neptune.g:21:6: ( 'else' )
			// Neptune.g:21:8: 'else'
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
			// Neptune.g:22:7: ( 'elsif' )
			// Neptune.g:22:9: 'elsif'
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
			// Neptune.g:23:4: ( '==' )
			// Neptune.g:23:6: '=='
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
			// Neptune.g:24:7: ( 'false' )
			// Neptune.g:24:9: 'false'
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
			// Neptune.g:25:9: ( 'foreach' )
			// Neptune.g:25:11: 'foreach'
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
			// Neptune.g:26:10: ( 'function' )
			// Neptune.g:26:12: 'function'
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
			// Neptune.g:27:4: ( '>' )
			// Neptune.g:27:6: '>'
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
			// Neptune.g:28:7: ( '>=' )
			// Neptune.g:28:9: '>='
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
			// Neptune.g:29:4: ( 'if' )
			// Neptune.g:29:6: 'if'
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
			// Neptune.g:30:4: ( 'in' )
			// Neptune.g:30:6: 'in'
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

	// $ANTLR start "INCLUDE"
	public final void mINCLUDE() throws RecognitionException {
		try {
			int _type = INCLUDE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Neptune.g:31:9: ( 'include' )
			// Neptune.g:31:11: 'include'
			{
			match("include"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INCLUDE"

	// $ANTLR start "INTEGER"
	public final void mINTEGER() throws RecognitionException {
		try {
			int _type = INTEGER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Neptune.g:32:9: ( 'int' )
			// Neptune.g:32:11: 'int'
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
			// Neptune.g:33:10: ( '[' )
			// Neptune.g:33:12: '['
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
			// Neptune.g:34:8: ( '{' )
			// Neptune.g:34:10: '{'
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
			// Neptune.g:35:8: ( '(' )
			// Neptune.g:35:10: '('
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
			// Neptune.g:36:4: ( '<' )
			// Neptune.g:36:6: '<'
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
			// Neptune.g:37:7: ( '<=' )
			// Neptune.g:37:9: '<='
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
			// Neptune.g:38:7: ( '-' )
			// Neptune.g:38:9: '-'
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
			// Neptune.g:39:5: ( '!=' )
			// Neptune.g:39:7: '!='
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
			// Neptune.g:40:6: ( '+' )
			// Neptune.g:40:8: '+'
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
			// Neptune.g:41:7: ( 'print' )
			// Neptune.g:41:9: 'print'
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
			// Neptune.g:42:9: ( 'program' )
			// Neptune.g:42:11: 'program'
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
			// Neptune.g:43:7: ( '\\'' )
			// Neptune.g:43:9: '\\''
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
			// Neptune.g:44:10: ( ']' )
			// Neptune.g:44:12: ']'
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
			// Neptune.g:45:8: ( '}' )
			// Neptune.g:45:10: '}'
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
			// Neptune.g:46:6: ( 'read' )
			// Neptune.g:46:8: 'read'
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
			// Neptune.g:47:8: ( 'return' )
			// Neptune.g:47:10: 'return'
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
			// Neptune.g:48:8: ( ')' )
			// Neptune.g:48:10: ')'
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
			// Neptune.g:49:11: ( ';' )
			// Neptune.g:49:13: ';'
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
			// Neptune.g:50:6: ( 'then' )
			// Neptune.g:50:8: 'then'
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
			// Neptune.g:51:7: ( '*' )
			// Neptune.g:51:9: '*'
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
			// Neptune.g:52:6: ( 'true' )
			// Neptune.g:52:8: 'true'
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
			// Neptune.g:53:5: ( 'var' )
			// Neptune.g:53:7: 'var'
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
			// Neptune.g:54:7: ( 'while' )
			// Neptune.g:54:9: 'while'
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

	// $ANTLR start "T__56"
	public final void mT__56() throws RecognitionException {
		try {
			int _type = T__56;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Neptune.g:55:7: ( 'ello' )
			// Neptune.g:55:9: 'ello'
			{
			match("ello"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__56"

	// $ANTLR start "IDENTIFIER"
	public final void mIDENTIFIER() throws RecognitionException {
		try {
			int _type = IDENTIFIER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Neptune.g:175:5: ( LETTER ( LETTER | DIGIT )* )
			// Neptune.g:175:9: LETTER ( LETTER | DIGIT )*
			{
			mLETTER(); 

			// Neptune.g:175:16: ( LETTER | DIGIT )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// Neptune.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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
			// Neptune.g:179:5: ( ( DIGIT )+ )
			// Neptune.g:179:9: ( DIGIT )+
			{
			// Neptune.g:179:9: ( DIGIT )+
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
			// Neptune.g:184:5: ( '//' ( . )* '\\n' )
			// Neptune.g:184:9: '//' ( . )* '\\n'
			{
			match("//"); 

			// Neptune.g:184:14: ( . )*
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
					// Neptune.g:184:14: .
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

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Neptune.g:189:5: ( ( ' ' | '\\t' | '\\f' | '\\r' | '\\n' )+ )
			// Neptune.g:189:9: ( ' ' | '\\t' | '\\f' | '\\r' | '\\n' )+
			{
			// Neptune.g:189:9: ( ' ' | '\\t' | '\\f' | '\\r' | '\\n' )+
			int cnt4=0;
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( ((LA4_0 >= '\t' && LA4_0 <= '\n')||(LA4_0 >= '\f' && LA4_0 <= '\r')||LA4_0==' ') ) {
					alt4=1;
				}

				switch (alt4) {
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
					if ( cnt4 >= 1 ) break loop4;
					EarlyExitException eee = new EarlyExitException(4, input);
					throw eee;
				}
				cnt4++;
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
			// Neptune.g:193:17: ( ( '0' .. '9' ) )
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
			// Neptune.g:194:17: ( ( 'a' .. 'z' ) )
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
			// Neptune.g:195:17: ( ( 'A' .. 'Z' ) )
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
			// Neptune.g:196:17: ( LOWER | UPPER )
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
		// Neptune.g:1:8: ( ARRAY_SET | BECOMES | BOOLEAN | CHAR | COLON | COMMA | CONST | DIVIDE | DO | DQUOTE | ELSE | ELSIF | EQ | FALSE | FOREACH | FUNCTION | GT | GT_EQ | IF | IN | INCLUDE | INTEGER | LBRACKET | LCURLY | LPAREN | LT | LT_EQ | MINUS | NEQ | PLUS | PRINT | PROGRAM | QUOTE | RBRACKET | RCURLY | READ | RETURN | RPAREN | SEMICOLON | THEN | TIMES | TRUE | VAR | WHILE | T__56 | IDENTIFIER | NUMBER | COMMENT | WS )
		int alt5=49;
		alt5 = dfa5.predict(input);
		switch (alt5) {
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
				// Neptune.g:1:128: INCLUDE
				{
				mINCLUDE(); 

				}
				break;
			case 22 :
				// Neptune.g:1:136: INTEGER
				{
				mINTEGER(); 

				}
				break;
			case 23 :
				// Neptune.g:1:144: LBRACKET
				{
				mLBRACKET(); 

				}
				break;
			case 24 :
				// Neptune.g:1:153: LCURLY
				{
				mLCURLY(); 

				}
				break;
			case 25 :
				// Neptune.g:1:160: LPAREN
				{
				mLPAREN(); 

				}
				break;
			case 26 :
				// Neptune.g:1:167: LT
				{
				mLT(); 

				}
				break;
			case 27 :
				// Neptune.g:1:170: LT_EQ
				{
				mLT_EQ(); 

				}
				break;
			case 28 :
				// Neptune.g:1:176: MINUS
				{
				mMINUS(); 

				}
				break;
			case 29 :
				// Neptune.g:1:182: NEQ
				{
				mNEQ(); 

				}
				break;
			case 30 :
				// Neptune.g:1:186: PLUS
				{
				mPLUS(); 

				}
				break;
			case 31 :
				// Neptune.g:1:191: PRINT
				{
				mPRINT(); 

				}
				break;
			case 32 :
				// Neptune.g:1:197: PROGRAM
				{
				mPROGRAM(); 

				}
				break;
			case 33 :
				// Neptune.g:1:205: QUOTE
				{
				mQUOTE(); 

				}
				break;
			case 34 :
				// Neptune.g:1:211: RBRACKET
				{
				mRBRACKET(); 

				}
				break;
			case 35 :
				// Neptune.g:1:220: RCURLY
				{
				mRCURLY(); 

				}
				break;
			case 36 :
				// Neptune.g:1:227: READ
				{
				mREAD(); 

				}
				break;
			case 37 :
				// Neptune.g:1:232: RETURN
				{
				mRETURN(); 

				}
				break;
			case 38 :
				// Neptune.g:1:239: RPAREN
				{
				mRPAREN(); 

				}
				break;
			case 39 :
				// Neptune.g:1:246: SEMICOLON
				{
				mSEMICOLON(); 

				}
				break;
			case 40 :
				// Neptune.g:1:256: THEN
				{
				mTHEN(); 

				}
				break;
			case 41 :
				// Neptune.g:1:261: TIMES
				{
				mTIMES(); 

				}
				break;
			case 42 :
				// Neptune.g:1:267: TRUE
				{
				mTRUE(); 

				}
				break;
			case 43 :
				// Neptune.g:1:272: VAR
				{
				mVAR(); 

				}
				break;
			case 44 :
				// Neptune.g:1:276: WHILE
				{
				mWHILE(); 

				}
				break;
			case 45 :
				// Neptune.g:1:282: T__56
				{
				mT__56(); 

				}
				break;
			case 46 :
				// Neptune.g:1:288: IDENTIFIER
				{
				mIDENTIFIER(); 

				}
				break;
			case 47 :
				// Neptune.g:1:299: NUMBER
				{
				mNUMBER(); 

				}
				break;
			case 48 :
				// Neptune.g:1:306: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 49 :
				// Neptune.g:1:314: WS
				{
				mWS(); 

				}
				break;

		}
	}


	protected DFA5 dfa5 = new DFA5(this);
	static final String DFA5_eotS =
		"\1\uffff\1\40\1\45\2\40\2\uffff\1\52\1\40\1\uffff\2\40\1\61\1\40\3\uffff"+
		"\1\65\3\uffff\1\40\3\uffff\1\40\2\uffff\1\40\1\uffff\2\40\3\uffff\1\40"+
		"\2\uffff\3\40\2\uffff\1\100\4\40\2\uffff\1\106\1\111\2\uffff\12\40\1\uffff"+
		"\5\40\1\uffff\1\40\1\135\1\uffff\6\40\1\144\2\40\1\147\1\150\1\40\1\152"+
		"\1\40\1\154\4\40\1\uffff\2\40\1\163\1\40\1\165\1\166\1\uffff\2\40\2\uffff"+
		"\1\171\1\uffff\1\172\1\uffff\1\173\3\40\1\177\1\40\1\uffff\1\40\2\uffff"+
		"\1\u0082\4\uffff\3\40\1\uffff\1\40\1\u0087\1\uffff\1\u0088\1\40\1\u008a"+
		"\1\u008b\2\uffff\1\u008c\3\uffff";
	static final String DFA5_eofS =
		"\u008d\uffff";
	static final String DFA5_minS =
		"\1\11\1\162\1\75\1\157\1\150\2\uffff\1\57\1\157\1\uffff\1\154\1\141\1"+
		"\75\1\146\3\uffff\1\75\3\uffff\1\162\3\uffff\1\145\2\uffff\1\150\1\uffff"+
		"\1\141\1\150\3\uffff\1\162\2\uffff\1\157\1\141\1\156\2\uffff\1\60\2\154"+
		"\1\162\1\156\2\uffff\2\60\2\uffff\1\151\1\141\1\145\1\165\1\162\1\151"+
		"\1\141\1\154\1\162\1\163\1\uffff\1\145\1\157\1\163\1\145\1\143\1\uffff"+
		"\1\154\1\60\1\uffff\1\156\1\147\1\144\1\165\1\156\1\145\1\60\1\154\1\171"+
		"\2\60\1\164\1\60\1\146\1\60\1\145\1\141\1\164\1\165\1\uffff\1\164\1\162"+
		"\1\60\1\162\2\60\1\uffff\1\145\1\137\2\uffff\1\60\1\uffff\1\60\1\uffff"+
		"\1\60\1\143\1\151\1\144\1\60\1\141\1\uffff\1\156\2\uffff\1\60\4\uffff"+
		"\1\150\1\157\1\145\1\uffff\1\155\1\60\1\uffff\1\60\1\156\2\60\2\uffff"+
		"\1\60\3\uffff";
	static final String DFA5_maxS =
		"\1\175\1\162\1\75\2\157\2\uffff\1\57\1\157\1\uffff\1\154\1\165\1\75\1"+
		"\156\3\uffff\1\75\3\uffff\1\162\3\uffff\1\145\2\uffff\1\162\1\uffff\1"+
		"\141\1\150\3\uffff\1\162\2\uffff\1\157\1\141\1\156\2\uffff\1\172\1\163"+
		"\1\154\1\162\1\156\2\uffff\2\172\2\uffff\1\157\1\164\1\145\1\165\1\162"+
		"\1\151\1\141\1\154\1\162\1\163\1\uffff\1\151\1\157\1\163\1\145\1\143\1"+
		"\uffff\1\154\1\172\1\uffff\1\156\1\147\1\144\1\165\1\156\1\145\1\172\1"+
		"\154\1\171\2\172\1\164\1\172\1\146\1\172\1\145\1\141\1\164\1\165\1\uffff"+
		"\1\164\1\162\1\172\1\162\2\172\1\uffff\1\145\1\137\2\uffff\1\172\1\uffff"+
		"\1\172\1\uffff\1\172\1\143\1\151\1\144\1\172\1\141\1\uffff\1\156\2\uffff"+
		"\1\172\4\uffff\1\150\1\157\1\145\1\uffff\1\155\1\172\1\uffff\1\172\1\156"+
		"\2\172\2\uffff\1\172\3\uffff";
	static final String DFA5_acceptS =
		"\5\uffff\1\5\1\6\2\uffff\1\12\4\uffff\1\27\1\30\1\31\1\uffff\1\34\1\35"+
		"\1\36\1\uffff\1\41\1\42\1\43\1\uffff\1\46\1\47\1\uffff\1\51\2\uffff\1"+
		"\56\1\57\1\61\1\uffff\1\15\1\2\3\uffff\1\60\1\10\5\uffff\1\22\1\21\2\uffff"+
		"\1\33\1\32\12\uffff\1\11\5\uffff\1\23\2\uffff\1\24\23\uffff\1\26\6\uffff"+
		"\1\53\2\uffff\1\3\1\4\1\uffff\1\13\1\uffff\1\55\6\uffff\1\44\1\uffff\1"+
		"\50\1\52\1\uffff\1\1\1\7\1\14\1\16\3\uffff\1\37\2\uffff\1\54\4\uffff\1"+
		"\45\1\17\1\uffff\1\25\1\40\1\20";
	static final String DFA5_specialS =
		"\u008d\uffff}>";
	static final String[] DFA5_transitionS = {
			"\2\42\1\uffff\2\42\22\uffff\1\42\1\23\1\11\4\uffff\1\26\1\20\1\32\1\35"+
			"\1\24\1\6\1\22\1\uffff\1\7\12\41\1\5\1\33\1\21\1\2\1\14\2\uffff\32\40"+
			"\1\16\1\uffff\1\27\3\uffff\1\1\1\3\1\4\1\10\1\12\1\13\2\40\1\15\6\40"+
			"\1\25\1\40\1\31\1\40\1\34\1\40\1\36\1\37\3\40\1\17\1\uffff\1\30",
			"\1\43",
			"\1\44",
			"\1\46",
			"\1\47\6\uffff\1\50",
			"",
			"",
			"\1\51",
			"\1\53",
			"",
			"\1\54",
			"\1\55\15\uffff\1\56\5\uffff\1\57",
			"\1\60",
			"\1\62\7\uffff\1\63",
			"",
			"",
			"",
			"\1\64",
			"",
			"",
			"",
			"\1\66",
			"",
			"",
			"",
			"\1\67",
			"",
			"",
			"\1\70\11\uffff\1\71",
			"",
			"\1\72",
			"\1\73",
			"",
			"",
			"",
			"\1\74",
			"",
			"",
			"\1\75",
			"\1\76",
			"\1\77",
			"",
			"",
			"\12\40\7\uffff\32\40\6\uffff\32\40",
			"\1\102\6\uffff\1\101",
			"\1\103",
			"\1\104",
			"\1\105",
			"",
			"",
			"\12\40\7\uffff\32\40\6\uffff\32\40",
			"\12\40\7\uffff\32\40\6\uffff\2\40\1\107\20\40\1\110\6\40",
			"",
			"",
			"\1\112\5\uffff\1\113",
			"\1\114\22\uffff\1\115",
			"\1\116",
			"\1\117",
			"\1\120",
			"\1\121",
			"\1\122",
			"\1\123",
			"\1\124",
			"\1\125",
			"",
			"\1\126\3\uffff\1\127",
			"\1\130",
			"\1\131",
			"\1\132",
			"\1\133",
			"",
			"\1\134",
			"\12\40\7\uffff\32\40\6\uffff\32\40",
			"",
			"\1\136",
			"\1\137",
			"\1\140",
			"\1\141",
			"\1\142",
			"\1\143",
			"\12\40\7\uffff\32\40\6\uffff\32\40",
			"\1\145",
			"\1\146",
			"\12\40\7\uffff\32\40\6\uffff\32\40",
			"\12\40\7\uffff\32\40\6\uffff\32\40",
			"\1\151",
			"\12\40\7\uffff\32\40\6\uffff\32\40",
			"\1\153",
			"\12\40\7\uffff\32\40\6\uffff\32\40",
			"\1\155",
			"\1\156",
			"\1\157",
			"\1\160",
			"",
			"\1\161",
			"\1\162",
			"\12\40\7\uffff\32\40\6\uffff\32\40",
			"\1\164",
			"\12\40\7\uffff\32\40\6\uffff\32\40",
			"\12\40\7\uffff\32\40\6\uffff\32\40",
			"",
			"\1\167",
			"\1\170",
			"",
			"",
			"\12\40\7\uffff\32\40\6\uffff\32\40",
			"",
			"\12\40\7\uffff\32\40\6\uffff\32\40",
			"",
			"\12\40\7\uffff\32\40\6\uffff\32\40",
			"\1\174",
			"\1\175",
			"\1\176",
			"\12\40\7\uffff\32\40\6\uffff\32\40",
			"\1\u0080",
			"",
			"\1\u0081",
			"",
			"",
			"\12\40\7\uffff\32\40\6\uffff\32\40",
			"",
			"",
			"",
			"",
			"\1\u0083",
			"\1\u0084",
			"\1\u0085",
			"",
			"\1\u0086",
			"\12\40\7\uffff\32\40\6\uffff\32\40",
			"",
			"\12\40\7\uffff\32\40\6\uffff\32\40",
			"\1\u0089",
			"\12\40\7\uffff\32\40\6\uffff\32\40",
			"\12\40\7\uffff\32\40\6\uffff\32\40",
			"",
			"",
			"\12\40\7\uffff\32\40\6\uffff\32\40",
			"",
			"",
			""
	};

	static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
	static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
	static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
	static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
	static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
	static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
	static final short[][] DFA5_transition;

	static {
		int numStates = DFA5_transitionS.length;
		DFA5_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
		}
	}

	protected class DFA5 extends DFA {

		public DFA5(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 5;
			this.eot = DFA5_eot;
			this.eof = DFA5_eof;
			this.min = DFA5_min;
			this.max = DFA5_max;
			this.accept = DFA5_accept;
			this.special = DFA5_special;
			this.transition = DFA5_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( ARRAY_SET | BECOMES | BOOLEAN | CHAR | COLON | COMMA | CONST | DIVIDE | DO | DQUOTE | ELSE | ELSIF | EQ | FALSE | FOREACH | FUNCTION | GT | GT_EQ | IF | IN | INCLUDE | INTEGER | LBRACKET | LCURLY | LPAREN | LT | LT_EQ | MINUS | NEQ | PLUS | PRINT | PROGRAM | QUOTE | RBRACKET | RCURLY | READ | RETURN | RPAREN | SEMICOLON | THEN | TIMES | TRUE | VAR | WHILE | T__56 | IDENTIFIER | NUMBER | COMMENT | WS );";
		}
	}

}

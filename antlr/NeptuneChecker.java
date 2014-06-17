// $ANTLR 3.5.2 NeptuneChecker.g 2014-06-17 11:00:20

	package Neptune;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class NeptuneChecker extends TreeParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ARRAY_SET", "BECOMES", "BLOCK", 
		"BOOLEAN", "CHAR", "CHAR_LITERAL", "COLON", "COMMA", "COMMENT", "CONST", 
		"DIGIT", "DIVIDE", "DO", "DQUOTE", "DROPIN_STATEMENT", "ELSE", "ELSIF", 
		"EQ", "FALSE", "FOREACH", "FUNCTION", "GT", "GT_EQ", "IDENTIFIER", "IF", 
		"IN", "INTEGER", "LBRACKET", "LCURLY", "LETTER", "LOWER", "LPAREN", "LT", 
		"LT_EQ", "MINUS", "NEQ", "NUMBER", "PLUS", "PRINT", "PROGRAM", "QUOTE", 
		"RBRACKET", "RCURLY", "READ", "RETURN", "RPAREN", "SEMICOLON", "STRING_LITERAL", 
		"THEN", "TIMES", "TRUE", "UPPER", "VAR", "WHILE", "WS"
	};
	public static final int EOF=-1;
	public static final int ARRAY_SET=4;
	public static final int BECOMES=5;
	public static final int BLOCK=6;
	public static final int BOOLEAN=7;
	public static final int CHAR=8;
	public static final int CHAR_LITERAL=9;
	public static final int COLON=10;
	public static final int COMMA=11;
	public static final int COMMENT=12;
	public static final int CONST=13;
	public static final int DIGIT=14;
	public static final int DIVIDE=15;
	public static final int DO=16;
	public static final int DQUOTE=17;
	public static final int DROPIN_STATEMENT=18;
	public static final int ELSE=19;
	public static final int ELSIF=20;
	public static final int EQ=21;
	public static final int FALSE=22;
	public static final int FOREACH=23;
	public static final int FUNCTION=24;
	public static final int GT=25;
	public static final int GT_EQ=26;
	public static final int IDENTIFIER=27;
	public static final int IF=28;
	public static final int IN=29;
	public static final int INTEGER=30;
	public static final int LBRACKET=31;
	public static final int LCURLY=32;
	public static final int LETTER=33;
	public static final int LOWER=34;
	public static final int LPAREN=35;
	public static final int LT=36;
	public static final int LT_EQ=37;
	public static final int MINUS=38;
	public static final int NEQ=39;
	public static final int NUMBER=40;
	public static final int PLUS=41;
	public static final int PRINT=42;
	public static final int PROGRAM=43;
	public static final int QUOTE=44;
	public static final int RBRACKET=45;
	public static final int RCURLY=46;
	public static final int READ=47;
	public static final int RETURN=48;
	public static final int RPAREN=49;
	public static final int SEMICOLON=50;
	public static final int STRING_LITERAL=51;
	public static final int THEN=52;
	public static final int TIMES=53;
	public static final int TRUE=54;
	public static final int UPPER=55;
	public static final int VAR=56;
	public static final int WHILE=57;
	public static final int WS=58;

	// delegates
	public TreeParser[] getDelegates() {
		return new TreeParser[] {};
	}

	// delegators


	public NeptuneChecker(TreeNodeStream input) {
		this(input, new RecognizerSharedState());
	}
	public NeptuneChecker(TreeNodeStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return NeptuneChecker.tokenNames; }
	@Override public String getGrammarFileName() { return "NeptuneChecker.g"; }






	// $ANTLR start "program"
	// NeptuneChecker.g:23:1: program : ^( PROGRAM lines ) ;
	public final void program() throws RecognitionException {
		try {
			// NeptuneChecker.g:24:2: ( ^( PROGRAM lines ) )
			// NeptuneChecker.g:24:4: ^( PROGRAM lines )
			{
			match(input,PROGRAM,FOLLOW_PROGRAM_in_program47); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_lines_in_program49);
			lines();
			state._fsp--;

			match(input, Token.UP, null); 

			}

		}

			catch(RecognitionException e){
				throw e;
			}

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "program"



	// $ANTLR start "lines"
	// NeptuneChecker.g:27:1: lines : ( line )+ ;
	public final void lines() throws RecognitionException {
		try {
			// NeptuneChecker.g:28:2: ( ( line )+ )
			// NeptuneChecker.g:28:4: ( line )+
			{
			// NeptuneChecker.g:28:4: ( line )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= ARRAY_SET && LA1_0 <= BECOMES)||LA1_0==CONST||LA1_0==DIVIDE||LA1_0==EQ||LA1_0==FOREACH||(LA1_0 >= GT && LA1_0 <= IF)||(LA1_0 >= LT && LA1_0 <= PLUS)||LA1_0==TIMES||(LA1_0 >= VAR && LA1_0 <= WHILE)) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// NeptuneChecker.g:28:4: line
					{
					pushFollow(FOLLOW_line_in_lines61);
					line();
					state._fsp--;

					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			}

		}

			catch(RecognitionException e){
				throw e;
			}

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "lines"



	// $ANTLR start "line"
	// NeptuneChecker.g:31:1: line : ( expression | declaration | logic_statement );
	public final void line() throws RecognitionException {
		try {
			// NeptuneChecker.g:32:2: ( expression | declaration | logic_statement )
			int alt2=3;
			switch ( input.LA(1) ) {
			case ARRAY_SET:
			case BECOMES:
			case DIVIDE:
			case EQ:
			case GT:
			case GT_EQ:
			case IDENTIFIER:
			case LT:
			case LT_EQ:
			case MINUS:
			case NEQ:
			case NUMBER:
			case PLUS:
			case TIMES:
				{
				alt2=1;
				}
				break;
			case CONST:
			case VAR:
				{
				alt2=2;
				}
				break;
			case FOREACH:
			case IF:
			case WHILE:
				{
				alt2=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}
			switch (alt2) {
				case 1 :
					// NeptuneChecker.g:32:4: expression
					{
					pushFollow(FOLLOW_expression_in_line73);
					expression();
					state._fsp--;

					}
					break;
				case 2 :
					// NeptuneChecker.g:33:4: declaration
					{
					pushFollow(FOLLOW_declaration_in_line78);
					declaration();
					state._fsp--;

					}
					break;
				case 3 :
					// NeptuneChecker.g:34:4: logic_statement
					{
					pushFollow(FOLLOW_logic_statement_in_line83);
					logic_statement();
					state._fsp--;

					}
					break;

			}
		}

			catch(RecognitionException e){
				throw e;
			}

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "line"



	// $ANTLR start "codeblock"
	// NeptuneChecker.g:37:1: codeblock : ^( BLOCK lines ) ;
	public final void codeblock() throws RecognitionException {
		try {
			// NeptuneChecker.g:38:2: ( ^( BLOCK lines ) )
			// NeptuneChecker.g:38:4: ^( BLOCK lines )
			{
			match(input,BLOCK,FOLLOW_BLOCK_in_codeblock95); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_lines_in_codeblock97);
			lines();
			state._fsp--;

			match(input, Token.UP, null); 

			}

		}

			catch(RecognitionException e){
				throw e;
			}

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "codeblock"



	// $ANTLR start "logic_statement"
	// NeptuneChecker.g:41:1: logic_statement : ( while_statement | foreach_statement | if_statement );
	public final void logic_statement() throws RecognitionException {
		try {
			// NeptuneChecker.g:42:2: ( while_statement | foreach_statement | if_statement )
			int alt3=3;
			switch ( input.LA(1) ) {
			case WHILE:
				{
				alt3=1;
				}
				break;
			case FOREACH:
				{
				alt3=2;
				}
				break;
			case IF:
				{
				alt3=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}
			switch (alt3) {
				case 1 :
					// NeptuneChecker.g:42:4: while_statement
					{
					pushFollow(FOLLOW_while_statement_in_logic_statement109);
					while_statement();
					state._fsp--;

					}
					break;
				case 2 :
					// NeptuneChecker.g:43:4: foreach_statement
					{
					pushFollow(FOLLOW_foreach_statement_in_logic_statement114);
					foreach_statement();
					state._fsp--;

					}
					break;
				case 3 :
					// NeptuneChecker.g:44:4: if_statement
					{
					pushFollow(FOLLOW_if_statement_in_logic_statement119);
					if_statement();
					state._fsp--;

					}
					break;

			}
		}

			catch(RecognitionException e){
				throw e;
			}

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "logic_statement"



	// $ANTLR start "while_statement"
	// NeptuneChecker.g:47:1: while_statement : ^( WHILE expression lines ) ;
	public final void while_statement() throws RecognitionException {
		try {
			// NeptuneChecker.g:48:2: ( ^( WHILE expression lines ) )
			// NeptuneChecker.g:48:4: ^( WHILE expression lines )
			{
			match(input,WHILE,FOLLOW_WHILE_in_while_statement131); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expression_in_while_statement133);
			expression();
			state._fsp--;

			pushFollow(FOLLOW_lines_in_while_statement135);
			lines();
			state._fsp--;

			match(input, Token.UP, null); 

			}

		}

			catch(RecognitionException e){
				throw e;
			}

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "while_statement"



	// $ANTLR start "foreach_statement"
	// NeptuneChecker.g:51:1: foreach_statement : ^( FOREACH IDENTIFIER IDENTIFIER lines ) ;
	public final void foreach_statement() throws RecognitionException {
		try {
			// NeptuneChecker.g:52:2: ( ^( FOREACH IDENTIFIER IDENTIFIER lines ) )
			// NeptuneChecker.g:52:4: ^( FOREACH IDENTIFIER IDENTIFIER lines )
			{
			match(input,FOREACH,FOLLOW_FOREACH_in_foreach_statement148); 
			match(input, Token.DOWN, null); 
			match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_foreach_statement150); 
			match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_foreach_statement152); 
			pushFollow(FOLLOW_lines_in_foreach_statement154);
			lines();
			state._fsp--;

			match(input, Token.UP, null); 

			}

		}

			catch(RecognitionException e){
				throw e;
			}

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "foreach_statement"



	// $ANTLR start "if_statement"
	// NeptuneChecker.g:55:1: if_statement : ^( IF expression lines ( ELSIF expression lines )* ( ELSE lines )? ) ;
	public final void if_statement() throws RecognitionException {
		try {
			// NeptuneChecker.g:56:2: ( ^( IF expression lines ( ELSIF expression lines )* ( ELSE lines )? ) )
			// NeptuneChecker.g:56:4: ^( IF expression lines ( ELSIF expression lines )* ( ELSE lines )? )
			{
			match(input,IF,FOLLOW_IF_in_if_statement167); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expression_in_if_statement169);
			expression();
			state._fsp--;

			pushFollow(FOLLOW_lines_in_if_statement171);
			lines();
			state._fsp--;

			// NeptuneChecker.g:57:3: ( ELSIF expression lines )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==ELSIF) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// NeptuneChecker.g:57:4: ELSIF expression lines
					{
					match(input,ELSIF,FOLLOW_ELSIF_in_if_statement177); 
					pushFollow(FOLLOW_expression_in_if_statement179);
					expression();
					state._fsp--;

					pushFollow(FOLLOW_lines_in_if_statement181);
					lines();
					state._fsp--;

					}
					break;

				default :
					break loop4;
				}
			}

			// NeptuneChecker.g:58:3: ( ELSE lines )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==ELSE) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// NeptuneChecker.g:58:4: ELSE lines
					{
					match(input,ELSE,FOLLOW_ELSE_in_if_statement189); 
					pushFollow(FOLLOW_lines_in_if_statement191);
					lines();
					state._fsp--;

					}
					break;

			}

			match(input, Token.UP, null); 

			}

		}

			catch(RecognitionException e){
				throw e;
			}

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "if_statement"



	// $ANTLR start "print_statement"
	// NeptuneChecker.g:61:1: print_statement : ^( PRINT expression ( COMMA expression )* ) ;
	public final void print_statement() throws RecognitionException {
		try {
			// NeptuneChecker.g:62:2: ( ^( PRINT expression ( COMMA expression )* ) )
			// NeptuneChecker.g:62:3: ^( PRINT expression ( COMMA expression )* )
			{
			match(input,PRINT,FOLLOW_PRINT_in_print_statement205); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expression_in_print_statement207);
			expression();
			state._fsp--;

			// NeptuneChecker.g:62:22: ( COMMA expression )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==COMMA) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// NeptuneChecker.g:62:23: COMMA expression
					{
					match(input,COMMA,FOLLOW_COMMA_in_print_statement210); 
					pushFollow(FOLLOW_expression_in_print_statement212);
					expression();
					state._fsp--;

					}
					break;

				default :
					break loop6;
				}
			}

			match(input, Token.UP, null); 

			}

		}

			catch(RecognitionException e){
				throw e;
			}

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "print_statement"



	// $ANTLR start "read_statement"
	// NeptuneChecker.g:65:1: read_statement : ^( READ expression ( COMMA expression )* ) ;
	public final void read_statement() throws RecognitionException {
		try {
			// NeptuneChecker.g:66:2: ( ^( READ expression ( COMMA expression )* ) )
			// NeptuneChecker.g:66:4: ^( READ expression ( COMMA expression )* )
			{
			match(input,READ,FOLLOW_READ_in_read_statement227); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expression_in_read_statement229);
			expression();
			state._fsp--;

			// NeptuneChecker.g:66:22: ( COMMA expression )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==COMMA) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// NeptuneChecker.g:66:23: COMMA expression
					{
					match(input,COMMA,FOLLOW_COMMA_in_read_statement232); 
					pushFollow(FOLLOW_expression_in_read_statement234);
					expression();
					state._fsp--;

					}
					break;

				default :
					break loop7;
				}
			}

			match(input, Token.UP, null); 

			}

		}

			catch(RecognitionException e){
				throw e;
			}

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "read_statement"



	// $ANTLR start "declaration"
	// NeptuneChecker.g:69:1: declaration : ( ^( VAR type IDENTIFIER ( BECOMES expression )? ) | ^( CONST type IDENTIFIER BECOMES expression ) );
	public final void declaration() throws RecognitionException {
		try {
			// NeptuneChecker.g:70:2: ( ^( VAR type IDENTIFIER ( BECOMES expression )? ) | ^( CONST type IDENTIFIER BECOMES expression ) )
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==VAR) ) {
				alt9=1;
			}
			else if ( (LA9_0==CONST) ) {
				alt9=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}

			switch (alt9) {
				case 1 :
					// NeptuneChecker.g:70:4: ^( VAR type IDENTIFIER ( BECOMES expression )? )
					{
					match(input,VAR,FOLLOW_VAR_in_declaration249); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_type_in_declaration251);
					type();
					state._fsp--;

					match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_declaration253); 
					// NeptuneChecker.g:70:26: ( BECOMES expression )?
					int alt8=2;
					int LA8_0 = input.LA(1);
					if ( (LA8_0==BECOMES) ) {
						alt8=1;
					}
					switch (alt8) {
						case 1 :
							// NeptuneChecker.g:70:27: BECOMES expression
							{
							match(input,BECOMES,FOLLOW_BECOMES_in_declaration256); 
							pushFollow(FOLLOW_expression_in_declaration258);
							expression();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					}
					break;
				case 2 :
					// NeptuneChecker.g:71:4: ^( CONST type IDENTIFIER BECOMES expression )
					{
					match(input,CONST,FOLLOW_CONST_in_declaration267); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_type_in_declaration269);
					type();
					state._fsp--;

					match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_declaration271); 
					match(input,BECOMES,FOLLOW_BECOMES_in_declaration273); 
					pushFollow(FOLLOW_expression_in_declaration275);
					expression();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;

			}
		}

			catch(RecognitionException e){
				throw e;
			}

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "declaration"



	// $ANTLR start "expression"
	// NeptuneChecker.g:74:1: expression : assignment_expr ;
	public final void expression() throws RecognitionException {
		try {
			// NeptuneChecker.g:75:2: ( assignment_expr )
			// NeptuneChecker.g:75:4: assignment_expr
			{
			pushFollow(FOLLOW_assignment_expr_in_expression287);
			assignment_expr();
			state._fsp--;

			}

		}

			catch(RecognitionException e){
				throw e;
			}

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "expression"



	// $ANTLR start "assignment_expr"
	// NeptuneChecker.g:78:1: assignment_expr : ( boolean_expr | ^( BECOMES IDENTIFIER expression ) );
	public final void assignment_expr() throws RecognitionException {
		try {
			// NeptuneChecker.g:79:2: ( boolean_expr | ^( BECOMES IDENTIFIER expression ) )
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==ARRAY_SET||LA10_0==DIVIDE||LA10_0==EQ||(LA10_0 >= GT && LA10_0 <= IDENTIFIER)||(LA10_0 >= LT && LA10_0 <= PLUS)||LA10_0==TIMES) ) {
				alt10=1;
			}
			else if ( (LA10_0==BECOMES) ) {
				alt10=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}

			switch (alt10) {
				case 1 :
					// NeptuneChecker.g:79:4: boolean_expr
					{
					pushFollow(FOLLOW_boolean_expr_in_assignment_expr298);
					boolean_expr();
					state._fsp--;

					}
					break;
				case 2 :
					// NeptuneChecker.g:80:4: ^( BECOMES IDENTIFIER expression )
					{
					match(input,BECOMES,FOLLOW_BECOMES_in_assignment_expr305); 
					match(input, Token.DOWN, null); 
					match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_assignment_expr307); 
					pushFollow(FOLLOW_expression_in_assignment_expr309);
					expression();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;

			}
		}

			catch(RecognitionException e){
				throw e;
			}

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "assignment_expr"



	// $ANTLR start "boolean_expr"
	// NeptuneChecker.g:83:1: boolean_expr : ( plus_expr | ^( LT expression expression ) | ^( LT_EQ expression expression ) | ^( GT expression expression ) | ^( GT_EQ expression expression ) | ^( EQ expression expression ) | ^( NEQ expression expression ) );
	public final void boolean_expr() throws RecognitionException {
		try {
			// NeptuneChecker.g:84:2: ( plus_expr | ^( LT expression expression ) | ^( LT_EQ expression expression ) | ^( GT expression expression ) | ^( GT_EQ expression expression ) | ^( EQ expression expression ) | ^( NEQ expression expression ) )
			int alt11=7;
			switch ( input.LA(1) ) {
			case ARRAY_SET:
			case DIVIDE:
			case IDENTIFIER:
			case MINUS:
			case NUMBER:
			case PLUS:
			case TIMES:
				{
				alt11=1;
				}
				break;
			case LT:
				{
				alt11=2;
				}
				break;
			case LT_EQ:
				{
				alt11=3;
				}
				break;
			case GT:
				{
				alt11=4;
				}
				break;
			case GT_EQ:
				{
				alt11=5;
				}
				break;
			case EQ:
				{
				alt11=6;
				}
				break;
			case NEQ:
				{
				alt11=7;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}
			switch (alt11) {
				case 1 :
					// NeptuneChecker.g:84:4: plus_expr
					{
					pushFollow(FOLLOW_plus_expr_in_boolean_expr321);
					plus_expr();
					state._fsp--;

					}
					break;
				case 2 :
					// NeptuneChecker.g:85:4: ^( LT expression expression )
					{
					match(input,LT,FOLLOW_LT_in_boolean_expr327); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_boolean_expr329);
					expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_boolean_expr331);
					expression();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 3 :
					// NeptuneChecker.g:86:4: ^( LT_EQ expression expression )
					{
					match(input,LT_EQ,FOLLOW_LT_EQ_in_boolean_expr338); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_boolean_expr340);
					expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_boolean_expr342);
					expression();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 4 :
					// NeptuneChecker.g:87:4: ^( GT expression expression )
					{
					match(input,GT,FOLLOW_GT_in_boolean_expr349); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_boolean_expr351);
					expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_boolean_expr353);
					expression();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 5 :
					// NeptuneChecker.g:88:4: ^( GT_EQ expression expression )
					{
					match(input,GT_EQ,FOLLOW_GT_EQ_in_boolean_expr360); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_boolean_expr362);
					expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_boolean_expr364);
					expression();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 6 :
					// NeptuneChecker.g:89:4: ^( EQ expression expression )
					{
					match(input,EQ,FOLLOW_EQ_in_boolean_expr371); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_boolean_expr373);
					expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_boolean_expr375);
					expression();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 7 :
					// NeptuneChecker.g:90:4: ^( NEQ expression expression )
					{
					match(input,NEQ,FOLLOW_NEQ_in_boolean_expr382); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_boolean_expr384);
					expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_boolean_expr386);
					expression();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;

			}
		}

			catch(RecognitionException e){
				throw e;
			}

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "boolean_expr"



	// $ANTLR start "plus_expr"
	// NeptuneChecker.g:93:1: plus_expr : ( multi_expr | ^( PLUS expression expression ) | ^( MINUS expression expression ) );
	public final void plus_expr() throws RecognitionException {
		try {
			// NeptuneChecker.g:94:2: ( multi_expr | ^( PLUS expression expression ) | ^( MINUS expression expression ) )
			int alt12=3;
			switch ( input.LA(1) ) {
			case ARRAY_SET:
			case DIVIDE:
			case IDENTIFIER:
			case NUMBER:
			case TIMES:
				{
				alt12=1;
				}
				break;
			case PLUS:
				{
				alt12=2;
				}
				break;
			case MINUS:
				{
				alt12=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}
			switch (alt12) {
				case 1 :
					// NeptuneChecker.g:94:4: multi_expr
					{
					pushFollow(FOLLOW_multi_expr_in_plus_expr398);
					multi_expr();
					state._fsp--;

					}
					break;
				case 2 :
					// NeptuneChecker.g:95:4: ^( PLUS expression expression )
					{
					match(input,PLUS,FOLLOW_PLUS_in_plus_expr405); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_plus_expr407);
					expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_plus_expr409);
					expression();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 3 :
					// NeptuneChecker.g:96:4: ^( MINUS expression expression )
					{
					match(input,MINUS,FOLLOW_MINUS_in_plus_expr416); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_plus_expr418);
					expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_plus_expr420);
					expression();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;

			}
		}

			catch(RecognitionException e){
				throw e;
			}

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "plus_expr"



	// $ANTLR start "multi_expr"
	// NeptuneChecker.g:99:1: multi_expr : ( operand | ^( TIMES expression expression ) | ^( DIVIDE expression expression ) );
	public final void multi_expr() throws RecognitionException {
		try {
			// NeptuneChecker.g:100:2: ( operand | ^( TIMES expression expression ) | ^( DIVIDE expression expression ) )
			int alt13=3;
			switch ( input.LA(1) ) {
			case ARRAY_SET:
			case IDENTIFIER:
			case NUMBER:
				{
				alt13=1;
				}
				break;
			case TIMES:
				{
				alt13=2;
				}
				break;
			case DIVIDE:
				{
				alt13=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}
			switch (alt13) {
				case 1 :
					// NeptuneChecker.g:100:4: operand
					{
					pushFollow(FOLLOW_operand_in_multi_expr432);
					operand();
					state._fsp--;

					}
					break;
				case 2 :
					// NeptuneChecker.g:101:4: ^( TIMES expression expression )
					{
					match(input,TIMES,FOLLOW_TIMES_in_multi_expr438); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_multi_expr440);
					expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_multi_expr442);
					expression();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 3 :
					// NeptuneChecker.g:102:4: ^( DIVIDE expression expression )
					{
					match(input,DIVIDE,FOLLOW_DIVIDE_in_multi_expr449); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_multi_expr451);
					expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_multi_expr453);
					expression();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;

			}
		}

			catch(RecognitionException e){
				throw e;
			}

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "multi_expr"



	// $ANTLR start "operand"
	// NeptuneChecker.g:105:1: operand : ( IDENTIFIER | NUMBER | ^( ARRAY_SET ( expression )+ ) );
	public final void operand() throws RecognitionException {
		try {
			// NeptuneChecker.g:106:2: ( IDENTIFIER | NUMBER | ^( ARRAY_SET ( expression )+ ) )
			int alt15=3;
			switch ( input.LA(1) ) {
			case IDENTIFIER:
				{
				alt15=1;
				}
				break;
			case NUMBER:
				{
				alt15=2;
				}
				break;
			case ARRAY_SET:
				{
				alt15=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				throw nvae;
			}
			switch (alt15) {
				case 1 :
					// NeptuneChecker.g:106:4: IDENTIFIER
					{
					match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_operand465); 
					}
					break;
				case 2 :
					// NeptuneChecker.g:107:4: NUMBER
					{
					match(input,NUMBER,FOLLOW_NUMBER_in_operand470); 
					}
					break;
				case 3 :
					// NeptuneChecker.g:108:4: ^( ARRAY_SET ( expression )+ )
					{
					match(input,ARRAY_SET,FOLLOW_ARRAY_SET_in_operand476); 
					match(input, Token.DOWN, null); 
					// NeptuneChecker.g:108:16: ( expression )+
					int cnt14=0;
					loop14:
					while (true) {
						int alt14=2;
						int LA14_0 = input.LA(1);
						if ( ((LA14_0 >= ARRAY_SET && LA14_0 <= BECOMES)||LA14_0==DIVIDE||LA14_0==EQ||(LA14_0 >= GT && LA14_0 <= IDENTIFIER)||(LA14_0 >= LT && LA14_0 <= PLUS)||LA14_0==TIMES) ) {
							alt14=1;
						}

						switch (alt14) {
						case 1 :
							// NeptuneChecker.g:108:16: expression
							{
							pushFollow(FOLLOW_expression_in_operand478);
							expression();
							state._fsp--;

							}
							break;

						default :
							if ( cnt14 >= 1 ) break loop14;
							EarlyExitException eee = new EarlyExitException(14, input);
							throw eee;
						}
						cnt14++;
					}

					match(input, Token.UP, null); 

					}
					break;

			}
		}

			catch(RecognitionException e){
				throw e;
			}

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "operand"



	// $ANTLR start "type"
	// NeptuneChecker.g:111:1: type : ( IDENTIFIER | CHAR | BOOLEAN );
	public final void type() throws RecognitionException {
		try {
			// NeptuneChecker.g:112:2: ( IDENTIFIER | CHAR | BOOLEAN )
			// NeptuneChecker.g:
			{
			if ( (input.LA(1) >= BOOLEAN && input.LA(1) <= CHAR)||input.LA(1)==IDENTIFIER ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

		}

			catch(RecognitionException e){
				throw e;
			}

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "type"

	// Delegated rules



	public static final BitSet FOLLOW_PROGRAM_in_program47 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_lines_in_program49 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_line_in_lines61 = new BitSet(new long[]{0x032003F01EA0A032L});
	public static final BitSet FOLLOW_expression_in_line73 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declaration_in_line78 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_logic_statement_in_line83 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BLOCK_in_codeblock95 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_lines_in_codeblock97 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_while_statement_in_logic_statement109 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_foreach_statement_in_logic_statement114 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_if_statement_in_logic_statement119 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHILE_in_while_statement131 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_while_statement133 = new BitSet(new long[]{0x032003F01EA0A030L});
	public static final BitSet FOLLOW_lines_in_while_statement135 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FOREACH_in_foreach_statement148 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_foreach_statement150 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_foreach_statement152 = new BitSet(new long[]{0x032003F01EA0A030L});
	public static final BitSet FOLLOW_lines_in_foreach_statement154 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_IF_in_if_statement167 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_if_statement169 = new BitSet(new long[]{0x032003F01EA0A030L});
	public static final BitSet FOLLOW_lines_in_if_statement171 = new BitSet(new long[]{0x0000000000180008L});
	public static final BitSet FOLLOW_ELSIF_in_if_statement177 = new BitSet(new long[]{0x002003F00E208030L});
	public static final BitSet FOLLOW_expression_in_if_statement179 = new BitSet(new long[]{0x032003F01EA0A030L});
	public static final BitSet FOLLOW_lines_in_if_statement181 = new BitSet(new long[]{0x0000000000180008L});
	public static final BitSet FOLLOW_ELSE_in_if_statement189 = new BitSet(new long[]{0x032003F01EA0A030L});
	public static final BitSet FOLLOW_lines_in_if_statement191 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PRINT_in_print_statement205 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_print_statement207 = new BitSet(new long[]{0x0000000000000808L});
	public static final BitSet FOLLOW_COMMA_in_print_statement210 = new BitSet(new long[]{0x002003F00E208030L});
	public static final BitSet FOLLOW_expression_in_print_statement212 = new BitSet(new long[]{0x0000000000000808L});
	public static final BitSet FOLLOW_READ_in_read_statement227 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_read_statement229 = new BitSet(new long[]{0x0000000000000808L});
	public static final BitSet FOLLOW_COMMA_in_read_statement232 = new BitSet(new long[]{0x002003F00E208030L});
	public static final BitSet FOLLOW_expression_in_read_statement234 = new BitSet(new long[]{0x0000000000000808L});
	public static final BitSet FOLLOW_VAR_in_declaration249 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_type_in_declaration251 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_declaration253 = new BitSet(new long[]{0x0000000000000028L});
	public static final BitSet FOLLOW_BECOMES_in_declaration256 = new BitSet(new long[]{0x002003F00E208030L});
	public static final BitSet FOLLOW_expression_in_declaration258 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_CONST_in_declaration267 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_type_in_declaration269 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_declaration271 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_BECOMES_in_declaration273 = new BitSet(new long[]{0x002003F00E208030L});
	public static final BitSet FOLLOW_expression_in_declaration275 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_assignment_expr_in_expression287 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_boolean_expr_in_assignment_expr298 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BECOMES_in_assignment_expr305 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_assignment_expr307 = new BitSet(new long[]{0x002003F00E208030L});
	public static final BitSet FOLLOW_expression_in_assignment_expr309 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_plus_expr_in_boolean_expr321 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LT_in_boolean_expr327 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_boolean_expr329 = new BitSet(new long[]{0x002003F00E208030L});
	public static final BitSet FOLLOW_expression_in_boolean_expr331 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LT_EQ_in_boolean_expr338 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_boolean_expr340 = new BitSet(new long[]{0x002003F00E208030L});
	public static final BitSet FOLLOW_expression_in_boolean_expr342 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_GT_in_boolean_expr349 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_boolean_expr351 = new BitSet(new long[]{0x002003F00E208030L});
	public static final BitSet FOLLOW_expression_in_boolean_expr353 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_GT_EQ_in_boolean_expr360 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_boolean_expr362 = new BitSet(new long[]{0x002003F00E208030L});
	public static final BitSet FOLLOW_expression_in_boolean_expr364 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_EQ_in_boolean_expr371 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_boolean_expr373 = new BitSet(new long[]{0x002003F00E208030L});
	public static final BitSet FOLLOW_expression_in_boolean_expr375 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NEQ_in_boolean_expr382 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_boolean_expr384 = new BitSet(new long[]{0x002003F00E208030L});
	public static final BitSet FOLLOW_expression_in_boolean_expr386 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_multi_expr_in_plus_expr398 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PLUS_in_plus_expr405 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_plus_expr407 = new BitSet(new long[]{0x002003F00E208030L});
	public static final BitSet FOLLOW_expression_in_plus_expr409 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MINUS_in_plus_expr416 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_plus_expr418 = new BitSet(new long[]{0x002003F00E208030L});
	public static final BitSet FOLLOW_expression_in_plus_expr420 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_operand_in_multi_expr432 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIMES_in_multi_expr438 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_multi_expr440 = new BitSet(new long[]{0x002003F00E208030L});
	public static final BitSet FOLLOW_expression_in_multi_expr442 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DIVIDE_in_multi_expr449 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_multi_expr451 = new BitSet(new long[]{0x002003F00E208030L});
	public static final BitSet FOLLOW_expression_in_multi_expr453 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_IDENTIFIER_in_operand465 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMBER_in_operand470 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ARRAY_SET_in_operand476 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_operand478 = new BitSet(new long[]{0x002003F00E208038L});
}

// $ANTLR 3.5.2 antlr/NeptuneChecker.g 2014-06-30 22:39:01

	package neptune;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class NeptuneChecker extends TreeParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "ARRAY_DEF", "ARRAY_SET", 
		"BECOMES", "BLOCK", "BOOLEAN", "CHAR", "CHAR_LITERAL", "COLON", "COMMA", 
		"COMMENT", "CONST", "DIGIT", "DIVIDE", "DO", "DQUOTE", "DROPIN_STATEMENT", 
		"ELSE", "ELSIF", "EQ", "FALSE", "FOREACH", "FUNCTION", "GT", "GT_EQ", 
		"IDENTIFIER", "IF", "IN", "INTEGER", "LBRACKET", "LCURLY", "LETTER", "LOWER", 
		"LPAREN", "LT", "LT_EQ", "MINUS", "MOD", "NEGATE", "NEQ", "NUMBER", "OR", 
		"PLUS", "PRINT", "PROGRAM", "QUOTE", "RBRACKET", "RCURLY", "READ", "RETURN", 
		"RPAREN", "SEMICOLON", "SIZEOF", "STRING_LITERAL", "THEN", "TIMES", "TRUE", 
		"UNARY_MINUS", "UNARY_PLUS", "UPPER", "VAR", "WHILE", "WS"
	};
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
	@Override public String getGrammarFileName() { return "antlr/NeptuneChecker.g"; }


		protected SymbolTable symtab = new SymbolTable();
		public void declare(String s, Type type) throws NeptuneException {
				try {
					symtab.enter(s, new IdEntry(0, type));
				} catch (SymbolTableException e) {
					throw new NeptuneException(e.getMessage());
				}
		}

		public boolean isDeclared(String s){ return (symtab.retrieve(s) != null);}




	// $ANTLR start "program"
	// antlr/NeptuneChecker.g:33:1: program : ^( PROGRAM lines ) ;
	public final void program() throws RecognitionException {
		try {
			// antlr/NeptuneChecker.g:34:2: ( ^( PROGRAM lines ) )
			// antlr/NeptuneChecker.g:34:4: ^( PROGRAM lines )
			{
			match(input,PROGRAM,FOLLOW_PROGRAM_in_program47); 
			symtab.openScope();
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_lines_in_program51);
			lines();
			state._fsp--;

			match(input, Token.UP, null); 

			symtab.closeScope();
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
	// antlr/NeptuneChecker.g:37:1: lines returns [ Type type = new Type(Type.primitive.VOID) ] : (t= line )+ ;
	public final Type lines() throws RecognitionException {
		Type type =  new Type(Type.primitive.VOID);


		Type t =null;

		try {
			// antlr/NeptuneChecker.g:38:2: ( (t= line )+ )
			// antlr/NeptuneChecker.g:38:4: (t= line )+
			{
			// antlr/NeptuneChecker.g:38:5: (t= line )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==AND||(LA1_0 >= ARRAY_SET && LA1_0 <= BLOCK)||LA1_0==CHAR_LITERAL||LA1_0==CONST||LA1_0==DIVIDE||(LA1_0 >= EQ && LA1_0 <= FOREACH)||(LA1_0 >= GT && LA1_0 <= IF)||(LA1_0 >= LT && LA1_0 <= PRINT)||LA1_0==READ||(LA1_0 >= SIZEOF && LA1_0 <= STRING_LITERAL)||(LA1_0 >= TIMES && LA1_0 <= UNARY_PLUS)||(LA1_0 >= VAR && LA1_0 <= WHILE)) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// antlr/NeptuneChecker.g:38:5: t= line
					{
					pushFollow(FOLLOW_line_in_lines70);
					t=line();
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

			type=t;
			}

		}

			catch(RecognitionException e){
				throw e;
			}

		finally {
			// do for sure before leaving
		}
		return type;
	}
	// $ANTLR end "lines"



	// $ANTLR start "line"
	// antlr/NeptuneChecker.g:41:1: line returns [Type type = new Type(Type.primitive.VOID) ] : (t= expression | declaration | logic_statement );
	public final Type line() throws RecognitionException {
		Type type =  new Type(Type.primitive.VOID);


		Type t =null;

		try {
			// antlr/NeptuneChecker.g:42:2: (t= expression | declaration | logic_statement )
			int alt2=3;
			switch ( input.LA(1) ) {
			case AND:
			case ARRAY_SET:
			case BECOMES:
			case BLOCK:
			case CHAR_LITERAL:
			case DIVIDE:
			case EQ:
			case FALSE:
			case GT:
			case GT_EQ:
			case IDENTIFIER:
			case LT:
			case LT_EQ:
			case MINUS:
			case MOD:
			case NEGATE:
			case NEQ:
			case NUMBER:
			case OR:
			case PLUS:
			case PRINT:
			case READ:
			case SIZEOF:
			case STRING_LITERAL:
			case TIMES:
			case TRUE:
			case UNARY_MINUS:
			case UNARY_PLUS:
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
					// antlr/NeptuneChecker.g:42:4: t= expression
					{
					pushFollow(FOLLOW_expression_in_line90);
					t=expression();
					state._fsp--;

					type=t;
					}
					break;
				case 2 :
					// antlr/NeptuneChecker.g:43:4: declaration
					{
					pushFollow(FOLLOW_declaration_in_line97);
					declaration();
					state._fsp--;

					type = new Type(Type.primitive.VOID);
					}
					break;
				case 3 :
					// antlr/NeptuneChecker.g:44:4: logic_statement
					{
					pushFollow(FOLLOW_logic_statement_in_line104);
					logic_statement();
					state._fsp--;

					type = new Type(Type.primitive.VOID);
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
		return type;
	}
	// $ANTLR end "line"



	// $ANTLR start "codeblock"
	// antlr/NeptuneChecker.g:47:1: codeblock returns [Type type = new Type(Type.primitive.VOID) ] : ^( BLOCK lines ) ;
	public final Type codeblock() throws RecognitionException {
		Type type =  new Type(Type.primitive.VOID);


		try {
			// antlr/NeptuneChecker.g:48:2: ( ^( BLOCK lines ) )
			// antlr/NeptuneChecker.g:48:4: ^( BLOCK lines )
			{
			match(input,BLOCK,FOLLOW_BLOCK_in_codeblock122); 
			symtab.openScope();
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_lines_in_codeblock126);
			lines();
			state._fsp--;

			symtab.closeScope();
			match(input, Token.UP, null); 

			}

		}

			catch(RecognitionException e){
				throw e;
			}

		finally {
			// do for sure before leaving
		}
		return type;
	}
	// $ANTLR end "codeblock"



	// $ANTLR start "logic_statement"
	// antlr/NeptuneChecker.g:51:1: logic_statement : ( while_statement | foreach_statement | if_statement );
	public final void logic_statement() throws RecognitionException {
		try {
			// antlr/NeptuneChecker.g:52:2: ( while_statement | foreach_statement | if_statement )
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
					// antlr/NeptuneChecker.g:52:4: while_statement
					{
					pushFollow(FOLLOW_while_statement_in_logic_statement140);
					while_statement();
					state._fsp--;

					}
					break;
				case 2 :
					// antlr/NeptuneChecker.g:53:4: foreach_statement
					{
					pushFollow(FOLLOW_foreach_statement_in_logic_statement145);
					foreach_statement();
					state._fsp--;

					}
					break;
				case 3 :
					// antlr/NeptuneChecker.g:54:4: if_statement
					{
					pushFollow(FOLLOW_if_statement_in_logic_statement150);
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
	// antlr/NeptuneChecker.g:57:1: while_statement : ^( WHILE expression lines ) ;
	public final void while_statement() throws RecognitionException {
		try {
			// antlr/NeptuneChecker.g:58:2: ( ^( WHILE expression lines ) )
			// antlr/NeptuneChecker.g:58:4: ^( WHILE expression lines )
			{
			match(input,WHILE,FOLLOW_WHILE_in_while_statement162); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expression_in_while_statement164);
			expression();
			state._fsp--;

			symtab.openScope();
			pushFollow(FOLLOW_lines_in_while_statement168);
			lines();
			state._fsp--;

			symtab.closeScope();
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
	// antlr/NeptuneChecker.g:61:1: foreach_statement : ^( FOREACH x= IDENTIFIER y= IDENTIFIER lines ) ;
	public final void foreach_statement() throws RecognitionException {
		CommonTree x=null;
		CommonTree y=null;

		try {
			// antlr/NeptuneChecker.g:62:2: ( ^( FOREACH x= IDENTIFIER y= IDENTIFIER lines ) )
			// antlr/NeptuneChecker.g:62:4: ^( FOREACH x= IDENTIFIER y= IDENTIFIER lines )
			{
			match(input,FOREACH,FOLLOW_FOREACH_in_foreach_statement183); 
			match(input, Token.DOWN, null); 
			x=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_foreach_statement187); 
			symtab.openScope();
			y=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_foreach_statement193); 
			 
					if(!isDeclared((y!=null?y.getText():null))){
						throw new NeptuneException(y,"is not declared");
					}
					if(!symtab.retrieve((y!=null?y.getText():null)).getType().isArray){
						throw new NeptuneException(y,"is not an array");
					}
					declare((x!=null?x.getText():null), new Type(symtab.retrieve((y!=null?y.getText():null)).getType().type));
					
			pushFollow(FOLLOW_lines_in_foreach_statement197);
			lines();
			state._fsp--;

			symtab.closeScope();
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
	// antlr/NeptuneChecker.g:73:1: if_statement : ^( IF expression lines ( ELSIF expression lines )* ( ELSE lines )? ) ;
	public final void if_statement() throws RecognitionException {
		try {
			// antlr/NeptuneChecker.g:74:2: ( ^( IF expression lines ( ELSIF expression lines )* ( ELSE lines )? ) )
			// antlr/NeptuneChecker.g:74:4: ^( IF expression lines ( ELSIF expression lines )* ( ELSE lines )? )
			{
			match(input,IF,FOLLOW_IF_in_if_statement213); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expression_in_if_statement215);
			expression();
			state._fsp--;

			symtab.openScope();
			pushFollow(FOLLOW_lines_in_if_statement219);
			lines();
			state._fsp--;

			symtab.closeScope();
			// antlr/NeptuneChecker.g:75:3: ( ELSIF expression lines )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==ELSIF) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// antlr/NeptuneChecker.g:75:4: ELSIF expression lines
					{
					match(input,ELSIF,FOLLOW_ELSIF_in_if_statement226); 
					pushFollow(FOLLOW_expression_in_if_statement228);
					expression();
					state._fsp--;

					symtab.openScope();
					pushFollow(FOLLOW_lines_in_if_statement232);
					lines();
					state._fsp--;

					symtab.closeScope();
					}
					break;

				default :
					break loop4;
				}
			}

			// antlr/NeptuneChecker.g:76:3: ( ELSE lines )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==ELSE) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// antlr/NeptuneChecker.g:76:4: ELSE lines
					{
					match(input,ELSE,FOLLOW_ELSE_in_if_statement242); 
					symtab.openScope();
					pushFollow(FOLLOW_lines_in_if_statement246);
					lines();
					state._fsp--;

					symtab.closeScope();
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
	// antlr/NeptuneChecker.g:79:1: print_statement returns [Type type = new Type(Type.primitive.VOID) ] : ^( PRINT t= expression ( COMMA expression )* ) ;
	public final Type print_statement() throws RecognitionException {
		Type type =  new Type(Type.primitive.VOID);


		Type t =null;

		boolean one=true;
		try {
			// antlr/NeptuneChecker.g:81:2: ( ^( PRINT t= expression ( COMMA expression )* ) )
			// antlr/NeptuneChecker.g:81:4: ^( PRINT t= expression ( COMMA expression )* )
			{
			match(input,PRINT,FOLLOW_PRINT_in_print_statement272); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expression_in_print_statement276);
			t=expression();
			state._fsp--;

			// antlr/NeptuneChecker.g:81:25: ( COMMA expression )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==COMMA) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// antlr/NeptuneChecker.g:81:26: COMMA expression
					{
					match(input,COMMA,FOLLOW_COMMA_in_print_statement279); 
					pushFollow(FOLLOW_expression_in_print_statement281);
					expression();
					state._fsp--;

					one=false;
					}
					break;

				default :
					break loop6;
				}
			}

			match(input, Token.UP, null); 


					if(one){
						type=t; 
					}else{
						type = new Type(Type.primitive.VOID);
					}
				
			}

		}

			catch(RecognitionException e){
				throw e;
			}

		finally {
			// do for sure before leaving
		}
		return type;
	}
	// $ANTLR end "print_statement"



	// $ANTLR start "read_statement"
	// antlr/NeptuneChecker.g:90:1: read_statement returns [Type type = new Type(Type.primitive.VOID) ] : ^( READ (t= IDENTIFIER ) ( COMMA IDENTIFIER )* ) ;
	public final Type read_statement() throws RecognitionException {
		Type type =  new Type(Type.primitive.VOID);


		CommonTree t=null;

		boolean one=true;
		try {
			// antlr/NeptuneChecker.g:92:2: ( ^( READ (t= IDENTIFIER ) ( COMMA IDENTIFIER )* ) )
			// antlr/NeptuneChecker.g:92:4: ^( READ (t= IDENTIFIER ) ( COMMA IDENTIFIER )* )
			{
			match(input,READ,FOLLOW_READ_in_read_statement308); 
			match(input, Token.DOWN, null); 
			// antlr/NeptuneChecker.g:92:11: (t= IDENTIFIER )
			// antlr/NeptuneChecker.g:92:12: t= IDENTIFIER
			{
			t=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_read_statement313); 
			}

			// antlr/NeptuneChecker.g:92:26: ( COMMA IDENTIFIER )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==COMMA) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// antlr/NeptuneChecker.g:92:27: COMMA IDENTIFIER
					{
					match(input,COMMA,FOLLOW_COMMA_in_read_statement317); 
					match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_read_statement319); 
					one=false;
					}
					break;

				default :
					break loop7;
				}
			}

			match(input, Token.UP, null); 


					if(one){
						type=symtab.retrieve((t!=null?t.getText():null)).getType(); 
					}else{
						type = new Type(Type.primitive.VOID);
					}
			}

		}

			catch(RecognitionException e){
				throw e;
			}

		finally {
			// do for sure before leaving
		}
		return type;
	}
	// $ANTLR end "read_statement"



	// $ANTLR start "declaration"
	// antlr/NeptuneChecker.g:100:1: declaration : ( ^( VAR t= type x= IDENTIFIER ( BECOMES ex= expression )? ) | ^( CONST t= type x= IDENTIFIER BECOMES ex= expression ) );
	public final void declaration() throws RecognitionException {
		CommonTree x=null;
		Type t =null;
		Type ex =null;

		try {
			// antlr/NeptuneChecker.g:101:2: ( ^( VAR t= type x= IDENTIFIER ( BECOMES ex= expression )? ) | ^( CONST t= type x= IDENTIFIER BECOMES ex= expression ) )
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
					// antlr/NeptuneChecker.g:101:4: ^( VAR t= type x= IDENTIFIER ( BECOMES ex= expression )? )
					{
					match(input,VAR,FOLLOW_VAR_in_declaration337); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_type_in_declaration341);
					t=type();
					state._fsp--;

					x=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_declaration345); 
					// antlr/NeptuneChecker.g:101:30: ( BECOMES ex= expression )?
					int alt8=2;
					int LA8_0 = input.LA(1);
					if ( (LA8_0==BECOMES) ) {
						alt8=1;
					}
					switch (alt8) {
						case 1 :
							// antlr/NeptuneChecker.g:101:31: BECOMES ex= expression
							{
							match(input,BECOMES,FOLLOW_BECOMES_in_declaration348); 
							pushFollow(FOLLOW_expression_in_declaration352);
							ex=expression();
							state._fsp--;


									if(ex.isArray != t.isArray || ex.elemCount != t.elemCount) {
										throw new NeptuneException(x,"invalid declaration assignment (non-array or count mismatch)");
									}
								
							}
							break;

					}

					match(input, Token.UP, null); 


								declare((x!=null?x.getText():null), t);
							
					}
					break;
				case 2 :
					// antlr/NeptuneChecker.g:108:4: ^( CONST t= type x= IDENTIFIER BECOMES ex= expression )
					{
					match(input,CONST,FOLLOW_CONST_in_declaration365); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_type_in_declaration369);
					t=type();
					state._fsp--;

					x=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_declaration373); 
					match(input,BECOMES,FOLLOW_BECOMES_in_declaration375); 
					pushFollow(FOLLOW_expression_in_declaration379);
					ex=expression();
					state._fsp--;

					match(input, Token.UP, null); 


							//const cannot change in the future
							t.isConstant = true;
							declare((x!=null?x.getText():null), t);
							
							if(ex.isArray != t.isArray || ex.elemCount != t.elemCount) {
								throw new NeptuneException(x,"invalid declaration assignment (non-array or count mismatch)");
							}
						
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
	// antlr/NeptuneChecker.g:119:1: expression returns [Type type = new Type(Type.primitive.VOID) ] : t= assignment_expr ;
	public final Type expression() throws RecognitionException {
		Type type =  new Type(Type.primitive.VOID);


		Type t =null;

		try {
			// antlr/NeptuneChecker.g:120:2: (t= assignment_expr )
			// antlr/NeptuneChecker.g:120:4: t= assignment_expr
			{
			pushFollow(FOLLOW_assignment_expr_in_expression399);
			t=assignment_expr();
			state._fsp--;

			type = t;
			}

		}

			catch(RecognitionException e){
				throw e;
			}

		finally {
			// do for sure before leaving
		}
		return type;
	}
	// $ANTLR end "expression"



	// $ANTLR start "assignment_expr"
	// antlr/NeptuneChecker.g:123:1: assignment_expr returns [Type type = new Type(Type.primitive.VOID) ] : (t= and_or_expr | ^( BECOMES x= IDENTIFIER ( ^( ARRAY_DEF n= NUMBER ) )? ex= expression ) );
	public final Type assignment_expr() throws RecognitionException {
		Type type =  new Type(Type.primitive.VOID);


		CommonTree x=null;
		CommonTree n=null;
		Type t =null;
		Type ex =null;

		try {
			// antlr/NeptuneChecker.g:124:2: (t= and_or_expr | ^( BECOMES x= IDENTIFIER ( ^( ARRAY_DEF n= NUMBER ) )? ex= expression ) )
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==AND||LA11_0==ARRAY_SET||LA11_0==BLOCK||LA11_0==CHAR_LITERAL||LA11_0==DIVIDE||(LA11_0 >= EQ && LA11_0 <= FALSE)||(LA11_0 >= GT && LA11_0 <= IDENTIFIER)||(LA11_0 >= LT && LA11_0 <= PRINT)||LA11_0==READ||(LA11_0 >= SIZEOF && LA11_0 <= STRING_LITERAL)||(LA11_0 >= TIMES && LA11_0 <= UNARY_PLUS)) ) {
				alt11=1;
			}
			else if ( (LA11_0==BECOMES) ) {
				alt11=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}

			switch (alt11) {
				case 1 :
					// antlr/NeptuneChecker.g:124:4: t= and_or_expr
					{
					pushFollow(FOLLOW_and_or_expr_in_assignment_expr418);
					t=and_or_expr();
					state._fsp--;

					type=t;
					}
					break;
				case 2 :
					// antlr/NeptuneChecker.g:125:4: ^( BECOMES x= IDENTIFIER ( ^( ARRAY_DEF n= NUMBER ) )? ex= expression )
					{
					 boolean isIndexAccess = false; 
					match(input,BECOMES,FOLLOW_BECOMES_in_assignment_expr428); 
					match(input, Token.DOWN, null); 
					x=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_assignment_expr432); 

							//x needs to be defined beforehand
							if(!isDeclared((x!=null?x.getText():null))){
								throw new NeptuneException(x,"is not declared");
							}
							if(symtab.retrieve((x!=null?x.getText():null)).getType().isConstant) {
								throw new NeptuneException(x,"cannot be redeclared (constant)");
							}
						
					// antlr/NeptuneChecker.g:133:4: ( ^( ARRAY_DEF n= NUMBER ) )?
					int alt10=2;
					int LA10_0 = input.LA(1);
					if ( (LA10_0==ARRAY_DEF) ) {
						alt10=1;
					}
					switch (alt10) {
						case 1 :
							// antlr/NeptuneChecker.g:133:5: ^( ARRAY_DEF n= NUMBER )
							{
							match(input,ARRAY_DEF,FOLLOW_ARRAY_DEF_in_assignment_expr438); 
							match(input, Token.DOWN, null); 
							n=(CommonTree)match(input,NUMBER,FOLLOW_NUMBER_in_assignment_expr442); 

									isIndexAccess = true;
									
									Type tmp = symtab.retrieve((x!=null?x.getText():null)).getType();
									if(!tmp.isArray) {
										throw new NeptuneException(x,"is not an array");
									}
									
									if(Integer.parseInt((n!=null?n.getText():null)) >= tmp.elemCount) {
										throw new NeptuneException(x,"index out of bounds");
									}
								
							match(input, Token.UP, null); 

							}
							break;

					}

					pushFollow(FOLLOW_expression_in_assignment_expr451);
					ex=expression();
					state._fsp--;


							Type idType = symtab.retrieve((x!=null?x.getText():null)).getType();
							if(!isIndexAccess && (ex.isArray != idType.isArray || ex.elemCount != idType.elemCount)) {
								throw new NeptuneException(x,"invalid assignment (non-array or count mismatch)");
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
		return type;
	}
	// $ANTLR end "assignment_expr"



	// $ANTLR start "and_or_expr"
	// antlr/NeptuneChecker.g:152:1: and_or_expr returns [Type type = new Type(Type.primitive.VOID) ] : (t= boolean_expr | ^( AND e1= expression e2= expression ) | ^( OR e1= expression e2= expression ) );
	public final Type and_or_expr() throws RecognitionException {
		Type type =  new Type(Type.primitive.VOID);


		Type t =null;
		Type e1 =null;
		Type e2 =null;

		try {
			// antlr/NeptuneChecker.g:153:2: (t= boolean_expr | ^( AND e1= expression e2= expression ) | ^( OR e1= expression e2= expression ) )
			int alt12=3;
			switch ( input.LA(1) ) {
			case ARRAY_SET:
			case BLOCK:
			case CHAR_LITERAL:
			case DIVIDE:
			case EQ:
			case FALSE:
			case GT:
			case GT_EQ:
			case IDENTIFIER:
			case LT:
			case LT_EQ:
			case MINUS:
			case MOD:
			case NEGATE:
			case NEQ:
			case NUMBER:
			case PLUS:
			case PRINT:
			case READ:
			case SIZEOF:
			case STRING_LITERAL:
			case TIMES:
			case TRUE:
			case UNARY_MINUS:
			case UNARY_PLUS:
				{
				alt12=1;
				}
				break;
			case AND:
				{
				alt12=2;
				}
				break;
			case OR:
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
					// antlr/NeptuneChecker.g:153:4: t= boolean_expr
					{
					pushFollow(FOLLOW_boolean_expr_in_and_or_expr471);
					t=boolean_expr();
					state._fsp--;

					type = t;
					}
					break;
				case 2 :
					// antlr/NeptuneChecker.g:154:4: ^( AND e1= expression e2= expression )
					{
					match(input,AND,FOLLOW_AND_in_and_or_expr485); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_and_or_expr489);
					e1=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_and_or_expr493);
					e2=expression();
					state._fsp--;

					match(input, Token.UP, null); 


							type = new Type(Type.primitive.BOOLEAN);
							if(e1.isArray || e1.type != Type.primitive.BOOLEAN) {
								throw new NeptuneException("invalid left operand type for function &&");
							}
							if(e2.isArray || e2.type != Type.primitive.BOOLEAN) {
								throw new NeptuneException("invalid right operand type for function &&");
							}
						
					}
					break;
				case 3 :
					// antlr/NeptuneChecker.g:163:4: ^( OR e1= expression e2= expression )
					{
					match(input,OR,FOLLOW_OR_in_and_or_expr504); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_and_or_expr508);
					e1=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_and_or_expr512);
					e2=expression();
					state._fsp--;

					match(input, Token.UP, null); 


							type = new Type(Type.primitive.BOOLEAN);
							if(e1.isArray || e1.type != Type.primitive.BOOLEAN) {
								throw new NeptuneException("invalid left operand type for function ||");
							}
							if(e2.isArray || e2.type != Type.primitive.BOOLEAN) {
								throw new NeptuneException("invalid right operand type for function ||");
							}
						
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
		return type;
	}
	// $ANTLR end "and_or_expr"



	// $ANTLR start "boolean_expr"
	// antlr/NeptuneChecker.g:174:1: boolean_expr returns [Type type = new Type(Type.primitive.VOID) ] : (t= plus_expr | ^( LT expression expression ) | ^( LT_EQ expression expression ) | ^( GT expression expression ) | ^( GT_EQ expression expression ) | ^( EQ expression expression ) | ^( NEQ expression expression ) );
	public final Type boolean_expr() throws RecognitionException {
		Type type =  new Type(Type.primitive.VOID);


		Type t =null;

		try {
			// antlr/NeptuneChecker.g:175:2: (t= plus_expr | ^( LT expression expression ) | ^( LT_EQ expression expression ) | ^( GT expression expression ) | ^( GT_EQ expression expression ) | ^( EQ expression expression ) | ^( NEQ expression expression ) )
			int alt13=7;
			switch ( input.LA(1) ) {
			case ARRAY_SET:
			case BLOCK:
			case CHAR_LITERAL:
			case DIVIDE:
			case FALSE:
			case IDENTIFIER:
			case MINUS:
			case MOD:
			case NEGATE:
			case NUMBER:
			case PLUS:
			case PRINT:
			case READ:
			case SIZEOF:
			case STRING_LITERAL:
			case TIMES:
			case TRUE:
			case UNARY_MINUS:
			case UNARY_PLUS:
				{
				alt13=1;
				}
				break;
			case LT:
				{
				alt13=2;
				}
				break;
			case LT_EQ:
				{
				alt13=3;
				}
				break;
			case GT:
				{
				alt13=4;
				}
				break;
			case GT_EQ:
				{
				alt13=5;
				}
				break;
			case EQ:
				{
				alt13=6;
				}
				break;
			case NEQ:
				{
				alt13=7;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}
			switch (alt13) {
				case 1 :
					// antlr/NeptuneChecker.g:175:4: t= plus_expr
					{
					pushFollow(FOLLOW_plus_expr_in_boolean_expr534);
					t=plus_expr();
					state._fsp--;

					type = t;
					}
					break;
				case 2 :
					// antlr/NeptuneChecker.g:176:4: ^( LT expression expression )
					{
					match(input,LT,FOLLOW_LT_in_boolean_expr550); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_boolean_expr552);
					expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_boolean_expr554);
					expression();
					state._fsp--;

					match(input, Token.UP, null); 

					type = new Type(Type.primitive.BOOLEAN);
					}
					break;
				case 3 :
					// antlr/NeptuneChecker.g:177:4: ^( LT_EQ expression expression )
					{
					match(input,LT_EQ,FOLLOW_LT_EQ_in_boolean_expr567); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_boolean_expr569);
					expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_boolean_expr571);
					expression();
					state._fsp--;

					match(input, Token.UP, null); 

					type = new Type(Type.primitive.BOOLEAN);
					}
					break;
				case 4 :
					// antlr/NeptuneChecker.g:178:4: ^( GT expression expression )
					{
					match(input,GT,FOLLOW_GT_in_boolean_expr582); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_boolean_expr584);
					expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_boolean_expr586);
					expression();
					state._fsp--;

					match(input, Token.UP, null); 

					type = new Type(Type.primitive.BOOLEAN);
					}
					break;
				case 5 :
					// antlr/NeptuneChecker.g:179:4: ^( GT_EQ expression expression )
					{
					match(input,GT_EQ,FOLLOW_GT_EQ_in_boolean_expr598); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_boolean_expr600);
					expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_boolean_expr602);
					expression();
					state._fsp--;

					match(input, Token.UP, null); 

					type = new Type(Type.primitive.BOOLEAN);
					}
					break;
				case 6 :
					// antlr/NeptuneChecker.g:180:4: ^( EQ expression expression )
					{
					match(input,EQ,FOLLOW_EQ_in_boolean_expr614); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_boolean_expr616);
					expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_boolean_expr618);
					expression();
					state._fsp--;

					match(input, Token.UP, null); 

					type = new Type(Type.primitive.BOOLEAN);
					}
					break;
				case 7 :
					// antlr/NeptuneChecker.g:181:4: ^( NEQ expression expression )
					{
					match(input,NEQ,FOLLOW_NEQ_in_boolean_expr630); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_boolean_expr632);
					expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_boolean_expr634);
					expression();
					state._fsp--;

					match(input, Token.UP, null); 

					type = new Type(Type.primitive.BOOLEAN);
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
		return type;
	}
	// $ANTLR end "boolean_expr"



	// $ANTLR start "plus_expr"
	// antlr/NeptuneChecker.g:184:1: plus_expr returns [Type type = new Type(Type.primitive.VOID) ] : (t= multi_expr | ^( PLUS expression expression ) | ^( MINUS expression expression ) );
	public final Type plus_expr() throws RecognitionException {
		Type type =  new Type(Type.primitive.VOID);


		Type t =null;

		try {
			// antlr/NeptuneChecker.g:185:2: (t= multi_expr | ^( PLUS expression expression ) | ^( MINUS expression expression ) )
			int alt14=3;
			switch ( input.LA(1) ) {
			case ARRAY_SET:
			case BLOCK:
			case CHAR_LITERAL:
			case DIVIDE:
			case FALSE:
			case IDENTIFIER:
			case MOD:
			case NEGATE:
			case NUMBER:
			case PRINT:
			case READ:
			case SIZEOF:
			case STRING_LITERAL:
			case TIMES:
			case TRUE:
			case UNARY_MINUS:
			case UNARY_PLUS:
				{
				alt14=1;
				}
				break;
			case PLUS:
				{
				alt14=2;
				}
				break;
			case MINUS:
				{
				alt14=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				throw nvae;
			}
			switch (alt14) {
				case 1 :
					// antlr/NeptuneChecker.g:185:4: t= multi_expr
					{
					pushFollow(FOLLOW_multi_expr_in_plus_expr657);
					t=multi_expr();
					state._fsp--;

					type=t;
					}
					break;
				case 2 :
					// antlr/NeptuneChecker.g:186:4: ^( PLUS expression expression )
					{
					match(input,PLUS,FOLLOW_PLUS_in_plus_expr671); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_plus_expr673);
					expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_plus_expr675);
					expression();
					state._fsp--;

					match(input, Token.UP, null); 

					type = new Type(Type.primitive.INTEGER);
					}
					break;
				case 3 :
					// antlr/NeptuneChecker.g:187:4: ^( MINUS expression expression )
					{
					match(input,MINUS,FOLLOW_MINUS_in_plus_expr685); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_plus_expr687);
					expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_plus_expr689);
					expression();
					state._fsp--;

					match(input, Token.UP, null); 

					type = new Type(Type.primitive.INTEGER);
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
		return type;
	}
	// $ANTLR end "plus_expr"



	// $ANTLR start "multi_expr"
	// antlr/NeptuneChecker.g:190:1: multi_expr returns [Type type = new Type(Type.primitive.VOID) ] : (t= unary_expr | ^( TIMES expression expression ) | ^( DIVIDE expression expression ) | ^( MOD expression expression ) );
	public final Type multi_expr() throws RecognitionException {
		Type type =  new Type(Type.primitive.VOID);


		Type t =null;

		try {
			// antlr/NeptuneChecker.g:191:2: (t= unary_expr | ^( TIMES expression expression ) | ^( DIVIDE expression expression ) | ^( MOD expression expression ) )
			int alt15=4;
			switch ( input.LA(1) ) {
			case ARRAY_SET:
			case BLOCK:
			case CHAR_LITERAL:
			case FALSE:
			case IDENTIFIER:
			case NEGATE:
			case NUMBER:
			case PRINT:
			case READ:
			case SIZEOF:
			case STRING_LITERAL:
			case TRUE:
			case UNARY_MINUS:
			case UNARY_PLUS:
				{
				alt15=1;
				}
				break;
			case TIMES:
				{
				alt15=2;
				}
				break;
			case DIVIDE:
				{
				alt15=3;
				}
				break;
			case MOD:
				{
				alt15=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				throw nvae;
			}
			switch (alt15) {
				case 1 :
					// antlr/NeptuneChecker.g:191:4: t= unary_expr
					{
					pushFollow(FOLLOW_unary_expr_in_multi_expr710);
					t=unary_expr();
					state._fsp--;

					type=t;
					}
					break;
				case 2 :
					// antlr/NeptuneChecker.g:192:4: ^( TIMES expression expression )
					{
					match(input,TIMES,FOLLOW_TIMES_in_multi_expr723); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_multi_expr725);
					expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_multi_expr727);
					expression();
					state._fsp--;

					match(input, Token.UP, null); 

					type = new Type(Type.primitive.INTEGER);
					}
					break;
				case 3 :
					// antlr/NeptuneChecker.g:193:4: ^( DIVIDE expression expression )
					{
					match(input,DIVIDE,FOLLOW_DIVIDE_in_multi_expr736); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_multi_expr738);
					expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_multi_expr740);
					expression();
					state._fsp--;

					match(input, Token.UP, null); 

					type = new Type(Type.primitive.INTEGER);
					}
					break;
				case 4 :
					// antlr/NeptuneChecker.g:194:4: ^( MOD expression expression )
					{
					match(input,MOD,FOLLOW_MOD_in_multi_expr749); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_multi_expr751);
					expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_multi_expr753);
					expression();
					state._fsp--;

					match(input, Token.UP, null); 

					type = new Type(Type.primitive.INTEGER);
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
		return type;
	}
	// $ANTLR end "multi_expr"



	// $ANTLR start "unary_expr"
	// antlr/NeptuneChecker.g:197:1: unary_expr returns [Type type = new Type(Type.primitive.VOID) ] : (t= operand | ^( UNARY_MINUS o= expression ) | ^( UNARY_PLUS o= expression ) | ^( NEGATE o= expression ) );
	public final Type unary_expr() throws RecognitionException {
		Type type =  new Type(Type.primitive.VOID);


		Type t =null;
		Type o =null;

		try {
			// antlr/NeptuneChecker.g:198:2: (t= operand | ^( UNARY_MINUS o= expression ) | ^( UNARY_PLUS o= expression ) | ^( NEGATE o= expression ) )
			int alt16=4;
			switch ( input.LA(1) ) {
			case ARRAY_SET:
			case BLOCK:
			case CHAR_LITERAL:
			case FALSE:
			case IDENTIFIER:
			case NUMBER:
			case PRINT:
			case READ:
			case SIZEOF:
			case STRING_LITERAL:
			case TRUE:
				{
				alt16=1;
				}
				break;
			case UNARY_MINUS:
				{
				alt16=2;
				}
				break;
			case UNARY_PLUS:
				{
				alt16=3;
				}
				break;
			case NEGATE:
				{
				alt16=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				throw nvae;
			}
			switch (alt16) {
				case 1 :
					// antlr/NeptuneChecker.g:198:4: t= operand
					{
					pushFollow(FOLLOW_operand_in_unary_expr775);
					t=operand();
					state._fsp--;

					type = t;
					}
					break;
				case 2 :
					// antlr/NeptuneChecker.g:199:4: ^( UNARY_MINUS o= expression )
					{
					match(input,UNARY_MINUS,FOLLOW_UNARY_MINUS_in_unary_expr790); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_unary_expr794);
					o=expression();
					state._fsp--;

					match(input, Token.UP, null); 


							if(o.type != Type.primitive.INTEGER || o.isArray) {
								throw new NeptuneException("invalid operand for unary -");
							}

							type = o;
						
					}
					break;
				case 3 :
					// antlr/NeptuneChecker.g:206:4: ^( UNARY_PLUS o= expression )
					{
					match(input,UNARY_PLUS,FOLLOW_UNARY_PLUS_in_unary_expr803); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_unary_expr807);
					o=expression();
					state._fsp--;

					match(input, Token.UP, null); 


							if(o.type != Type.primitive.INTEGER || o.isArray) {
								throw new NeptuneException("invalid operand for unary +");
							}

							type = o;
						
					}
					break;
				case 4 :
					// antlr/NeptuneChecker.g:213:4: ^( NEGATE o= expression )
					{
					match(input,NEGATE,FOLLOW_NEGATE_in_unary_expr816); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_unary_expr820);
					o=expression();
					state._fsp--;

					match(input, Token.UP, null); 


							if(o.type != Type.primitive.BOOLEAN || o.isArray) {
								throw new NeptuneException("invalid operand for unary !");
							}

							type = o;
						
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
		return type;
	}
	// $ANTLR end "unary_expr"



	// $ANTLR start "operand"
	// antlr/NeptuneChecker.g:222:1: operand returns [Type type=new Type(Type.primitive.VOID) ] : (x= IDENTIFIER ( ^( ARRAY_DEF n= NUMBER ) )? | NUMBER | ^( ARRAY_SET (t= expression )+ ) | TRUE | FALSE | CHAR_LITERAL |str= STRING_LITERAL |t= codeblock |t= print_statement |t= read_statement | ^( SIZEOF id= IDENTIFIER ) );
	public final Type operand() throws RecognitionException {
		Type type = new Type(Type.primitive.VOID);


		CommonTree x=null;
		CommonTree n=null;
		CommonTree str=null;
		CommonTree id=null;
		Type t =null;

		try {
			// antlr/NeptuneChecker.g:223:2: (x= IDENTIFIER ( ^( ARRAY_DEF n= NUMBER ) )? | NUMBER | ^( ARRAY_SET (t= expression )+ ) | TRUE | FALSE | CHAR_LITERAL |str= STRING_LITERAL |t= codeblock |t= print_statement |t= read_statement | ^( SIZEOF id= IDENTIFIER ) )
			int alt19=11;
			switch ( input.LA(1) ) {
			case IDENTIFIER:
				{
				alt19=1;
				}
				break;
			case NUMBER:
				{
				alt19=2;
				}
				break;
			case ARRAY_SET:
				{
				alt19=3;
				}
				break;
			case TRUE:
				{
				alt19=4;
				}
				break;
			case FALSE:
				{
				alt19=5;
				}
				break;
			case CHAR_LITERAL:
				{
				alt19=6;
				}
				break;
			case STRING_LITERAL:
				{
				alt19=7;
				}
				break;
			case BLOCK:
				{
				alt19=8;
				}
				break;
			case PRINT:
				{
				alt19=9;
				}
				break;
			case READ:
				{
				alt19=10;
				}
				break;
			case SIZEOF:
				{
				alt19=11;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 19, 0, input);
				throw nvae;
			}
			switch (alt19) {
				case 1 :
					// antlr/NeptuneChecker.g:223:4: x= IDENTIFIER ( ^( ARRAY_DEF n= NUMBER ) )?
					{
					x=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_operand840); 

							if(!isDeclared((x!=null?x.getText():null))){
								throw new NeptuneException(x,"is not declared");
							}
							type = symtab.retrieve((x!=null?x.getText():null)).getType();
						
					// antlr/NeptuneChecker.g:228:4: ( ^( ARRAY_DEF n= NUMBER ) )?
					int alt17=2;
					int LA17_0 = input.LA(1);
					if ( (LA17_0==ARRAY_DEF) ) {
						alt17=1;
					}
					switch (alt17) {
						case 1 :
							// antlr/NeptuneChecker.g:228:5: ^( ARRAY_DEF n= NUMBER )
							{
							match(input,ARRAY_DEF,FOLLOW_ARRAY_DEF_in_operand850); 
							match(input, Token.DOWN, null); 
							n=(CommonTree)match(input,NUMBER,FOLLOW_NUMBER_in_operand854); 

									type = symtab.retrieve((x!=null?x.getText():null)).getType();
									if(!type.isArray) {
										throw new NeptuneException(x,"is not an array");
									}
									if(Integer.parseInt((n!=null?n.getText():null)) >= type.elemCount) {
										throw new NeptuneException(x,"array out of bounds");
									}
								
							match(input, Token.UP, null); 

							}
							break;

					}

					}
					break;
				case 2 :
					// antlr/NeptuneChecker.g:237:4: NUMBER
					{
					match(input,NUMBER,FOLLOW_NUMBER_in_operand864); 
					type = new Type(Type.primitive.INTEGER);
					}
					break;
				case 3 :
					// antlr/NeptuneChecker.g:238:4: ^( ARRAY_SET (t= expression )+ )
					{
					int numElements = 0; 
					match(input,ARRAY_SET,FOLLOW_ARRAY_SET_in_operand880); 
					match(input, Token.DOWN, null); 
					// antlr/NeptuneChecker.g:238:40: (t= expression )+
					int cnt18=0;
					loop18:
					while (true) {
						int alt18=2;
						int LA18_0 = input.LA(1);
						if ( (LA18_0==AND||(LA18_0 >= ARRAY_SET && LA18_0 <= BLOCK)||LA18_0==CHAR_LITERAL||LA18_0==DIVIDE||(LA18_0 >= EQ && LA18_0 <= FALSE)||(LA18_0 >= GT && LA18_0 <= IDENTIFIER)||(LA18_0 >= LT && LA18_0 <= PRINT)||LA18_0==READ||(LA18_0 >= SIZEOF && LA18_0 <= STRING_LITERAL)||(LA18_0 >= TIMES && LA18_0 <= UNARY_PLUS)) ) {
							alt18=1;
						}

						switch (alt18) {
						case 1 :
							// antlr/NeptuneChecker.g:238:41: t= expression
							{
							pushFollow(FOLLOW_expression_in_operand885);
							t=expression();
							state._fsp--;

							type = t; numElements++; 
							}
							break;

						default :
							if ( cnt18 >= 1 ) break loop18;
							EarlyExitException eee = new EarlyExitException(18, input);
							throw eee;
						}
						cnt18++;
					}

					match(input, Token.UP, null); 

					 type.elemCount = numElements; type.isArray = true; 
					}
					break;
				case 4 :
					// antlr/NeptuneChecker.g:239:4: TRUE
					{
					match(input,TRUE,FOLLOW_TRUE_in_operand896); 
					type = new Type(Type.primitive.BOOLEAN);
					}
					break;
				case 5 :
					// antlr/NeptuneChecker.g:240:4: FALSE
					{
					match(input,FALSE,FOLLOW_FALSE_in_operand910); 
					type = new Type(Type.primitive.BOOLEAN);
					}
					break;
				case 6 :
					// antlr/NeptuneChecker.g:241:4: CHAR_LITERAL
					{
					match(input,CHAR_LITERAL,FOLLOW_CHAR_LITERAL_in_operand923); 
					type = new Type(Type.primitive.CHAR);
					}
					break;
				case 7 :
					// antlr/NeptuneChecker.g:242:4: str= STRING_LITERAL
					{
					str=(CommonTree)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_operand937); 

							type = new Type(Type.primitive.CHAR, 0);
							type.isArray = true;
							type.elemCount = (str!=null?str.getText():null).length()-2;
						
					}
					break;
				case 8 :
					// antlr/NeptuneChecker.g:247:4: t= codeblock
					{
					pushFollow(FOLLOW_codeblock_in_operand948);
					t=codeblock();
					state._fsp--;

					type = t;
					}
					break;
				case 9 :
					// antlr/NeptuneChecker.g:248:4: t= print_statement
					{
					pushFollow(FOLLOW_print_statement_in_operand967);
					t=print_statement();
					state._fsp--;

					type = t;
					}
					break;
				case 10 :
					// antlr/NeptuneChecker.g:249:4: t= read_statement
					{
					pushFollow(FOLLOW_read_statement_in_operand979);
					t=read_statement();
					state._fsp--;

					type = t;
					}
					break;
				case 11 :
					// antlr/NeptuneChecker.g:250:4: ^( SIZEOF id= IDENTIFIER )
					{
					match(input,SIZEOF,FOLLOW_SIZEOF_in_operand990); 
					match(input, Token.DOWN, null); 
					id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_operand994); 
					match(input, Token.UP, null); 


							type = new Type(Type.primitive.INTEGER);
							IdEntry entry = symtab.retrieve((id!=null?id.getText():null));
							if(!entry.getType().isArray) {
								throw new NeptuneException(id,"not an array, invalid use of sizeof function");
							}
						
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
		return type;
	}
	// $ANTLR end "operand"



	// $ANTLR start "type"
	// antlr/NeptuneChecker.g:259:1: type returns [Type type = new Type(Type.primitive.VOID) ] : ( INTEGER (count= array_def )? | CHAR (count= array_def )? | BOOLEAN (count= array_def )? );
	public final Type type() throws RecognitionException {
		Type type =  new Type(Type.primitive.VOID);


		int count =0;

		try {
			// antlr/NeptuneChecker.g:260:2: ( INTEGER (count= array_def )? | CHAR (count= array_def )? | BOOLEAN (count= array_def )? )
			int alt23=3;
			switch ( input.LA(1) ) {
			case INTEGER:
				{
				alt23=1;
				}
				break;
			case CHAR:
				{
				alt23=2;
				}
				break;
			case BOOLEAN:
				{
				alt23=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 23, 0, input);
				throw nvae;
			}
			switch (alt23) {
				case 1 :
					// antlr/NeptuneChecker.g:260:4: INTEGER (count= array_def )?
					{
					match(input,INTEGER,FOLLOW_INTEGER_in_type1012); 
					// antlr/NeptuneChecker.g:260:17: (count= array_def )?
					int alt20=2;
					int LA20_0 = input.LA(1);
					if ( (LA20_0==ARRAY_DEF) ) {
						alt20=1;
					}
					switch (alt20) {
						case 1 :
							// antlr/NeptuneChecker.g:260:17: count= array_def
							{
							pushFollow(FOLLOW_array_def_in_type1016);
							count=array_def();
							state._fsp--;

							}
							break;

					}


							if(count > 0){
								type = new Type(Type.primitive.INTEGER, count);
							}else{
								type = new Type(Type.primitive.INTEGER);
							}
					}
					break;
				case 2 :
					// antlr/NeptuneChecker.g:266:4: CHAR (count= array_def )?
					{
					match(input,CHAR,FOLLOW_CHAR_in_type1024); 
					// antlr/NeptuneChecker.g:266:14: (count= array_def )?
					int alt21=2;
					int LA21_0 = input.LA(1);
					if ( (LA21_0==ARRAY_DEF) ) {
						alt21=1;
					}
					switch (alt21) {
						case 1 :
							// antlr/NeptuneChecker.g:266:14: count= array_def
							{
							pushFollow(FOLLOW_array_def_in_type1028);
							count=array_def();
							state._fsp--;

							}
							break;

					}


							if(count > 0){
								type = new Type(Type.primitive.CHAR, count);
							}else{
								type = new Type(Type.primitive.CHAR);
							}
					}
					break;
				case 3 :
					// antlr/NeptuneChecker.g:272:4: BOOLEAN (count= array_def )?
					{
					match(input,BOOLEAN,FOLLOW_BOOLEAN_in_type1036); 
					// antlr/NeptuneChecker.g:272:17: (count= array_def )?
					int alt22=2;
					int LA22_0 = input.LA(1);
					if ( (LA22_0==ARRAY_DEF) ) {
						alt22=1;
					}
					switch (alt22) {
						case 1 :
							// antlr/NeptuneChecker.g:272:17: count= array_def
							{
							pushFollow(FOLLOW_array_def_in_type1040);
							count=array_def();
							state._fsp--;

							}
							break;

					}


							if(count > 0){
								type = new Type(Type.primitive.BOOLEAN, count);
							}else{
								type = new Type(Type.primitive.BOOLEAN);
							}
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
		return type;
	}
	// $ANTLR end "type"



	// $ANTLR start "array_def"
	// antlr/NeptuneChecker.g:280:1: array_def returns [int count = 0] : ^( ARRAY_DEF x= NUMBER ) ;
	public final int array_def() throws RecognitionException {
		int count =  0;


		CommonTree x=null;

		try {
			// antlr/NeptuneChecker.g:281:2: ( ^( ARRAY_DEF x= NUMBER ) )
			// antlr/NeptuneChecker.g:281:4: ^( ARRAY_DEF x= NUMBER )
			{
			match(input,ARRAY_DEF,FOLLOW_ARRAY_DEF_in_array_def1059); 
			match(input, Token.DOWN, null); 
			x=(CommonTree)match(input,NUMBER,FOLLOW_NUMBER_in_array_def1063); 
			match(input, Token.UP, null); 

			 count = Integer.parseInt((x!=null?x.getText():null)); 
			}

		}

			catch(RecognitionException e){
				throw e;
			}

		finally {
			// do for sure before leaving
		}
		return count;
	}
	// $ANTLR end "array_def"

	// Delegated rules



	public static final BitSet FOLLOW_PROGRAM_in_program47 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_lines_in_program51 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_line_in_lines70 = new BitSet(new long[]{0x7B10FFC07B8289D2L,0x0000000000000003L});
	public static final BitSet FOLLOW_expression_in_line90 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declaration_in_line97 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_logic_statement_in_line104 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BLOCK_in_codeblock122 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_lines_in_codeblock126 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_while_statement_in_logic_statement140 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_foreach_statement_in_logic_statement145 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_if_statement_in_logic_statement150 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHILE_in_while_statement162 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_while_statement164 = new BitSet(new long[]{0x7B10FFC07B8289D0L,0x0000000000000003L});
	public static final BitSet FOLLOW_lines_in_while_statement168 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FOREACH_in_foreach_statement183 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_foreach_statement187 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_foreach_statement193 = new BitSet(new long[]{0x7B10FFC07B8289D0L,0x0000000000000003L});
	public static final BitSet FOLLOW_lines_in_foreach_statement197 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_IF_in_if_statement213 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_if_statement215 = new BitSet(new long[]{0x7B10FFC07B8289D0L,0x0000000000000003L});
	public static final BitSet FOLLOW_lines_in_if_statement219 = new BitSet(new long[]{0x0000000000600008L});
	public static final BitSet FOLLOW_ELSIF_in_if_statement226 = new BitSet(new long[]{0x7B10FFC0398209D0L});
	public static final BitSet FOLLOW_expression_in_if_statement228 = new BitSet(new long[]{0x7B10FFC07B8289D0L,0x0000000000000003L});
	public static final BitSet FOLLOW_lines_in_if_statement232 = new BitSet(new long[]{0x0000000000600008L});
	public static final BitSet FOLLOW_ELSE_in_if_statement242 = new BitSet(new long[]{0x7B10FFC07B8289D0L,0x0000000000000003L});
	public static final BitSet FOLLOW_lines_in_if_statement246 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PRINT_in_print_statement272 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_print_statement276 = new BitSet(new long[]{0x0000000000002008L});
	public static final BitSet FOLLOW_COMMA_in_print_statement279 = new BitSet(new long[]{0x7B10FFC0398209D0L});
	public static final BitSet FOLLOW_expression_in_print_statement281 = new BitSet(new long[]{0x0000000000002008L});
	public static final BitSet FOLLOW_READ_in_read_statement308 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_read_statement313 = new BitSet(new long[]{0x0000000000002008L});
	public static final BitSet FOLLOW_COMMA_in_read_statement317 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_read_statement319 = new BitSet(new long[]{0x0000000000002008L});
	public static final BitSet FOLLOW_VAR_in_declaration337 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_type_in_declaration341 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_declaration345 = new BitSet(new long[]{0x0000000000000088L});
	public static final BitSet FOLLOW_BECOMES_in_declaration348 = new BitSet(new long[]{0x7B10FFC0398209D0L});
	public static final BitSet FOLLOW_expression_in_declaration352 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_CONST_in_declaration365 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_type_in_declaration369 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_declaration373 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_BECOMES_in_declaration375 = new BitSet(new long[]{0x7B10FFC0398209D0L});
	public static final BitSet FOLLOW_expression_in_declaration379 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_assignment_expr_in_expression399 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_and_or_expr_in_assignment_expr418 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BECOMES_in_assignment_expr428 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_assignment_expr432 = new BitSet(new long[]{0x7B10FFC0398209F0L});
	public static final BitSet FOLLOW_ARRAY_DEF_in_assignment_expr438 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_NUMBER_in_assignment_expr442 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_expression_in_assignment_expr451 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_boolean_expr_in_and_or_expr471 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AND_in_and_or_expr485 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_and_or_expr489 = new BitSet(new long[]{0x7B10FFC0398209D0L});
	public static final BitSet FOLLOW_expression_in_and_or_expr493 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_OR_in_and_or_expr504 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_and_or_expr508 = new BitSet(new long[]{0x7B10FFC0398209D0L});
	public static final BitSet FOLLOW_expression_in_and_or_expr512 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_plus_expr_in_boolean_expr534 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LT_in_boolean_expr550 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_boolean_expr552 = new BitSet(new long[]{0x7B10FFC0398209D0L});
	public static final BitSet FOLLOW_expression_in_boolean_expr554 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LT_EQ_in_boolean_expr567 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_boolean_expr569 = new BitSet(new long[]{0x7B10FFC0398209D0L});
	public static final BitSet FOLLOW_expression_in_boolean_expr571 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_GT_in_boolean_expr582 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_boolean_expr584 = new BitSet(new long[]{0x7B10FFC0398209D0L});
	public static final BitSet FOLLOW_expression_in_boolean_expr586 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_GT_EQ_in_boolean_expr598 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_boolean_expr600 = new BitSet(new long[]{0x7B10FFC0398209D0L});
	public static final BitSet FOLLOW_expression_in_boolean_expr602 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_EQ_in_boolean_expr614 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_boolean_expr616 = new BitSet(new long[]{0x7B10FFC0398209D0L});
	public static final BitSet FOLLOW_expression_in_boolean_expr618 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NEQ_in_boolean_expr630 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_boolean_expr632 = new BitSet(new long[]{0x7B10FFC0398209D0L});
	public static final BitSet FOLLOW_expression_in_boolean_expr634 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_multi_expr_in_plus_expr657 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PLUS_in_plus_expr671 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_plus_expr673 = new BitSet(new long[]{0x7B10FFC0398209D0L});
	public static final BitSet FOLLOW_expression_in_plus_expr675 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MINUS_in_plus_expr685 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_plus_expr687 = new BitSet(new long[]{0x7B10FFC0398209D0L});
	public static final BitSet FOLLOW_expression_in_plus_expr689 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_unary_expr_in_multi_expr710 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIMES_in_multi_expr723 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_multi_expr725 = new BitSet(new long[]{0x7B10FFC0398209D0L});
	public static final BitSet FOLLOW_expression_in_multi_expr727 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DIVIDE_in_multi_expr736 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_multi_expr738 = new BitSet(new long[]{0x7B10FFC0398209D0L});
	public static final BitSet FOLLOW_expression_in_multi_expr740 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MOD_in_multi_expr749 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_multi_expr751 = new BitSet(new long[]{0x7B10FFC0398209D0L});
	public static final BitSet FOLLOW_expression_in_multi_expr753 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_operand_in_unary_expr775 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_UNARY_MINUS_in_unary_expr790 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_unary_expr794 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_UNARY_PLUS_in_unary_expr803 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_unary_expr807 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NEGATE_in_unary_expr816 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_unary_expr820 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_IDENTIFIER_in_operand840 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_ARRAY_DEF_in_operand850 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_NUMBER_in_operand854 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NUMBER_in_operand864 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ARRAY_SET_in_operand880 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_operand885 = new BitSet(new long[]{0x7B10FFC0398209D8L});
	public static final BitSet FOLLOW_TRUE_in_operand896 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FALSE_in_operand910 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_LITERAL_in_operand923 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_operand937 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_codeblock_in_operand948 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_print_statement_in_operand967 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_read_statement_in_operand979 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SIZEOF_in_operand990 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_operand994 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_INTEGER_in_type1012 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_array_def_in_type1016 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_in_type1024 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_array_def_in_type1028 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOLEAN_in_type1036 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_array_def_in_type1040 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ARRAY_DEF_in_array_def1059 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_NUMBER_in_array_def1063 = new BitSet(new long[]{0x0000000000000008L});
}

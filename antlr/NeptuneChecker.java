// $ANTLR 3.5.2 antlr/NeptuneChecker.g 2014-07-04 15:23:25

	package neptune;
	
	import neptune.node.*;
	import neptune.assembly.Program;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class NeptuneChecker extends TreeParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "ARRAY_DEF", "ARRAY_SET", 
		"ARRAY_VAR", "ATOMIC_VAR", "BECOMES", "BLOCK", "BOOLEAN", "CHAR", "CHAR_LITERAL", 
		"COLON", "COMMA", "COMMENT", "CONST", "DIGIT", "DIVIDE", "DO", "DQUOTE", 
		"DROPIN_STATEMENT", "ELSE", "ELSIF", "EQ", "FALSE", "FOREACH", "FUNCTION", 
		"GT", "GT_EQ", "IDENTIFIER", "IF", "IN", "INTEGER", "LBRACKET", "LCURLY", 
		"LETTER", "LOWER", "LPAREN", "LT", "LT_EQ", "MINUS", "MOD", "NEGATE", 
		"NEQ", "NUMBER", "OR", "PLUS", "PRINT", "PROGRAM", "QUOTE", "RBRACKET", 
		"RCURLY", "READ", "RETURN", "RPAREN", "SEMICOLON", "SIZEOF", "STRING_LITERAL", 
		"THEN", "TIMES", "TRUE", "UNARY_MINUS", "UNARY_PLUS", "UPPER", "VAR", 
		"WHILE", "WS"
	};
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



	// $ANTLR start "program"
	// antlr/NeptuneChecker.g:21:1: program : ^( PROGRAM n= lines ) ;
	public final void program() throws RecognitionException {
		List<Node> n =null;

		try {
			// antlr/NeptuneChecker.g:22:2: ( ^( PROGRAM n= lines ) )
			// antlr/NeptuneChecker.g:22:4: ^( PROGRAM n= lines )
			{
			match(input,PROGRAM,FOLLOW_PROGRAM_in_program41); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_lines_in_program45);
			n=lines();
			state._fsp--;

			match(input, Token.UP, null); 

			 ProgramNode node = new ProgramNode(n); node.validate(new Program()); 
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
	// antlr/NeptuneChecker.g:25:1: lines returns [ List<Node> nodes = new ArrayList<Node>() ] : (n= line )+ ;
	public final List<Node> lines() throws RecognitionException {
		List<Node> nodes =  new ArrayList<Node>();


		Node n =null;

		try {
			// antlr/NeptuneChecker.g:26:2: ( (n= line )+ )
			// antlr/NeptuneChecker.g:26:4: (n= line )+
			{
			// antlr/NeptuneChecker.g:26:4: (n= line )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==AND||(LA1_0 >= ARRAY_SET && LA1_0 <= BLOCK)||LA1_0==CHAR_LITERAL||LA1_0==CONST||LA1_0==DIVIDE||(LA1_0 >= EQ && LA1_0 <= GT_EQ)||LA1_0==IF||(LA1_0 >= LT && LA1_0 <= PRINT)||LA1_0==READ||(LA1_0 >= SIZEOF && LA1_0 <= STRING_LITERAL)||(LA1_0 >= TIMES && LA1_0 <= UNARY_PLUS)||(LA1_0 >= VAR && LA1_0 <= WHILE)) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// antlr/NeptuneChecker.g:26:5: n= line
					{
					pushFollow(FOLLOW_line_in_lines69);
					n=line();
					state._fsp--;

					 nodes.add(n); 
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
		return nodes;
	}
	// $ANTLR end "lines"



	// $ANTLR start "line"
	// antlr/NeptuneChecker.g:29:1: line returns [ Node node ] : (n= expression |n= declaration |n= logic_statement );
	public final Node line() throws RecognitionException {
		Node node = null;


		Node n =null;

		try {
			// antlr/NeptuneChecker.g:30:2: (n= expression |n= declaration |n= logic_statement )
			int alt2=3;
			switch ( input.LA(1) ) {
			case FUNCTION:
				{
				int LA2_1 = input.LA(2);
				if ( (LA2_1==DOWN) ) {
					int LA2_5 = input.LA(3);
					if ( (LA2_5==IDENTIFIER) ) {
						alt2=1;
					}
					else if ( ((LA2_5 >= BOOLEAN && LA2_5 <= CHAR)||LA2_5==INTEGER) ) {
						alt2=2;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 2, 5, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 2, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case AND:
			case ARRAY_SET:
			case ARRAY_VAR:
			case ATOMIC_VAR:
			case BECOMES:
			case BLOCK:
			case CHAR_LITERAL:
			case DIVIDE:
			case EQ:
			case FALSE:
			case GT:
			case GT_EQ:
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
					// antlr/NeptuneChecker.g:30:4: n= expression
					{
					pushFollow(FOLLOW_expression_in_line90);
					n=expression();
					state._fsp--;

					 node = new BasicNode("expression", n); 
					}
					break;
				case 2 :
					// antlr/NeptuneChecker.g:31:4: n= declaration
					{
					pushFollow(FOLLOW_declaration_in_line110);
					n=declaration();
					state._fsp--;

					 node = new BasicNode("declaration", n);  
					}
					break;
				case 3 :
					// antlr/NeptuneChecker.g:32:4: n= logic_statement
					{
					pushFollow(FOLLOW_logic_statement_in_line130);
					n=logic_statement();
					state._fsp--;

					 node = new BasicNode("logic", n); 
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
		return node;
	}
	// $ANTLR end "line"



	// $ANTLR start "codeblock"
	// antlr/NeptuneChecker.g:35:1: codeblock returns [ Node node ] : ^( BLOCK n= lines ) ;
	public final Node codeblock() throws RecognitionException {
		Node node = null;


		List<Node> n =null;

		try {
			// antlr/NeptuneChecker.g:36:2: ( ^( BLOCK n= lines ) )
			// antlr/NeptuneChecker.g:36:4: ^( BLOCK n= lines )
			{
			match(input,BLOCK,FOLLOW_BLOCK_in_codeblock158); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_lines_in_codeblock162);
			n=lines();
			state._fsp--;

			match(input, Token.UP, null); 

			 node = new CodeblockNode(n); 
			}

		}

			catch(RecognitionException e){
				throw e;
			}

		finally {
			// do for sure before leaving
		}
		return node;
	}
	// $ANTLR end "codeblock"



	// $ANTLR start "logic_statement"
	// antlr/NeptuneChecker.g:39:1: logic_statement returns [ Node node ] : ( ^( WHILE ex= expression l= lines ) | ^( FOREACH x= IDENTIFIER y= IDENTIFIER l= lines ) | ^( IF ex= expression l= lines ( ELSIF ex= expression l= lines )+ ( ELSE l= lines )? ) );
	public final Node logic_statement() throws RecognitionException {
		Node node = null;


		CommonTree x=null;
		CommonTree y=null;
		Node ex =null;
		List<Node> l =null;

		try {
			// antlr/NeptuneChecker.g:40:2: ( ^( WHILE ex= expression l= lines ) | ^( FOREACH x= IDENTIFIER y= IDENTIFIER l= lines ) | ^( IF ex= expression l= lines ( ELSIF ex= expression l= lines )+ ( ELSE l= lines )? ) )
			int alt5=3;
			switch ( input.LA(1) ) {
			case WHILE:
				{
				alt5=1;
				}
				break;
			case FOREACH:
				{
				alt5=2;
				}
				break;
			case IF:
				{
				alt5=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}
			switch (alt5) {
				case 1 :
					// antlr/NeptuneChecker.g:40:4: ^( WHILE ex= expression l= lines )
					{
					match(input,WHILE,FOLLOW_WHILE_in_logic_statement191); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_logic_statement195);
					ex=expression();
					state._fsp--;

					pushFollow(FOLLOW_lines_in_logic_statement199);
					l=lines();
					state._fsp--;

					match(input, Token.UP, null); 

					 node = new WhileNode(ex, l); 
					}
					break;
				case 2 :
					// antlr/NeptuneChecker.g:41:4: ^( FOREACH x= IDENTIFIER y= IDENTIFIER l= lines )
					{
					match(input,FOREACH,FOLLOW_FOREACH_in_logic_statement214); 
					match(input, Token.DOWN, null); 
					x=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_logic_statement218); 
					y=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_logic_statement222); 
					pushFollow(FOLLOW_lines_in_logic_statement226);
					l=lines();
					state._fsp--;

					match(input, Token.UP, null); 

					 node = new ForeachNode((x!=null?x.getText():null), (y!=null?y.getText():null), l); 
					}
					break;
				case 3 :
					// antlr/NeptuneChecker.g:43:4: ^( IF ex= expression l= lines ( ELSIF ex= expression l= lines )+ ( ELSE l= lines )? )
					{
					 List<Node> ifBlocks = new ArrayList<Node>(); Node elseNode = null; 
					match(input,IF,FOLLOW_IF_in_logic_statement244); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_logic_statement248);
					ex=expression();
					state._fsp--;

					pushFollow(FOLLOW_lines_in_logic_statement252);
					l=lines();
					state._fsp--;

					 ifBlocks.add(new IfBlockNode(ex, l)); 
					// antlr/NeptuneChecker.g:45:3: ( ELSIF ex= expression l= lines )+
					int cnt3=0;
					loop3:
					while (true) {
						int alt3=2;
						int LA3_0 = input.LA(1);
						if ( (LA3_0==ELSIF) ) {
							alt3=1;
						}

						switch (alt3) {
						case 1 :
							// antlr/NeptuneChecker.g:46:4: ELSIF ex= expression l= lines
							{
							match(input,ELSIF,FOLLOW_ELSIF_in_logic_statement267); 
							pushFollow(FOLLOW_expression_in_logic_statement271);
							ex=expression();
							state._fsp--;

							pushFollow(FOLLOW_lines_in_logic_statement275);
							l=lines();
							state._fsp--;

							 ifBlocks.add(new IfBlockNode(ex, l)); 
							}
							break;

						default :
							if ( cnt3 >= 1 ) break loop3;
							EarlyExitException eee = new EarlyExitException(3, input);
							throw eee;
						}
						cnt3++;
					}

					// antlr/NeptuneChecker.g:48:3: ( ELSE l= lines )?
					int alt4=2;
					int LA4_0 = input.LA(1);
					if ( (LA4_0==ELSE) ) {
						alt4=1;
					}
					switch (alt4) {
						case 1 :
							// antlr/NeptuneChecker.g:49:4: ELSE l= lines
							{
							match(input,ELSE,FOLLOW_ELSE_in_logic_statement294); 
							pushFollow(FOLLOW_lines_in_logic_statement298);
							l=lines();
							state._fsp--;

							 elseNode = new ElseNode(l); 
							}
							break;

					}

					match(input, Token.UP, null); 

					 node = new IfNode(ifBlocks, elseNode); 
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
		return node;
	}
	// $ANTLR end "logic_statement"



	// $ANTLR start "print_statement"
	// antlr/NeptuneChecker.g:54:1: print_statement returns [ Node node ] : ^( PRINT n1= expression (n2= expression )* ) ;
	public final Node print_statement() throws RecognitionException {
		Node node = null;


		Node n1 =null;
		Node n2 =null;

		try {
			// antlr/NeptuneChecker.g:55:2: ( ^( PRINT n1= expression (n2= expression )* ) )
			// antlr/NeptuneChecker.g:55:4: ^( PRINT n1= expression (n2= expression )* )
			{
			 List<Node> expressions = new ArrayList<Node>(); 
			match(input,PRINT,FOLLOW_PRINT_in_print_statement352); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expression_in_print_statement360);
			n1=expression();
			state._fsp--;

			 expressions.add(n1); 
			// antlr/NeptuneChecker.g:58:4: (n2= expression )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==AND||(LA6_0 >= ARRAY_SET && LA6_0 <= BLOCK)||LA6_0==CHAR_LITERAL||LA6_0==DIVIDE||(LA6_0 >= EQ && LA6_0 <= FALSE)||(LA6_0 >= FUNCTION && LA6_0 <= GT_EQ)||(LA6_0 >= LT && LA6_0 <= PRINT)||LA6_0==READ||(LA6_0 >= SIZEOF && LA6_0 <= STRING_LITERAL)||(LA6_0 >= TIMES && LA6_0 <= UNARY_PLUS)) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// antlr/NeptuneChecker.g:58:5: n2= expression
					{
					pushFollow(FOLLOW_expression_in_print_statement370);
					n2=expression();
					state._fsp--;

					 expressions.add(n2); 
					}
					break;

				default :
					break loop6;
				}
			}

			match(input, Token.UP, null); 

			 node = new PrintNode(expressions); 
			}

		}

			catch(RecognitionException e){
				throw e;
			}

		finally {
			// do for sure before leaving
		}
		return node;
	}
	// $ANTLR end "print_statement"



	// $ANTLR start "read_statement"
	// antlr/NeptuneChecker.g:62:1: read_statement : ^( READ t= IDENTIFIER (t1= IDENTIFIER )* ) ;
	public final void read_statement() throws RecognitionException {
		CommonTree t=null;
		CommonTree t1=null;

		try {
			// antlr/NeptuneChecker.g:63:2: ( ^( READ t= IDENTIFIER (t1= IDENTIFIER )* ) )
			// antlr/NeptuneChecker.g:63:4: ^( READ t= IDENTIFIER (t1= IDENTIFIER )* )
			{
			match(input,READ,FOLLOW_READ_in_read_statement405); 
			match(input, Token.DOWN, null); 
			t=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_read_statement409); 
			// antlr/NeptuneChecker.g:63:24: (t1= IDENTIFIER )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==IDENTIFIER) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// antlr/NeptuneChecker.g:63:25: t1= IDENTIFIER
					{
					t1=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_read_statement414); 
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
	// antlr/NeptuneChecker.g:66:1: declaration returns [ Node node ] : ( ^( VAR t= type id= IDENTIFIER ( BECOMES ex= expression )? ) | ^( CONST t= type id= IDENTIFIER BECOMES ex= expression ) | ^( FUNCTION t= type func= IDENTIFIER (t= type id= IDENTIFIER )+ l= lines return_statement ) );
	public final Node declaration() throws RecognitionException {
		Node node = null;


		CommonTree id=null;
		CommonTree func=null;
		Node t =null;
		Node ex =null;
		List<Node> l =null;

		try {
			// antlr/NeptuneChecker.g:67:2: ( ^( VAR t= type id= IDENTIFIER ( BECOMES ex= expression )? ) | ^( CONST t= type id= IDENTIFIER BECOMES ex= expression ) | ^( FUNCTION t= type func= IDENTIFIER (t= type id= IDENTIFIER )+ l= lines return_statement ) )
			int alt10=3;
			switch ( input.LA(1) ) {
			case VAR:
				{
				alt10=1;
				}
				break;
			case CONST:
				{
				alt10=2;
				}
				break;
			case FUNCTION:
				{
				alt10=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}
			switch (alt10) {
				case 1 :
					// antlr/NeptuneChecker.g:67:4: ^( VAR t= type id= IDENTIFIER ( BECOMES ex= expression )? )
					{
					match(input,VAR,FOLLOW_VAR_in_declaration433); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_type_in_declaration437);
					t=type();
					state._fsp--;

					id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_declaration441); 
					// antlr/NeptuneChecker.g:67:31: ( BECOMES ex= expression )?
					int alt8=2;
					int LA8_0 = input.LA(1);
					if ( (LA8_0==BECOMES) ) {
						alt8=1;
					}
					switch (alt8) {
						case 1 :
							// antlr/NeptuneChecker.g:67:32: BECOMES ex= expression
							{
							match(input,BECOMES,FOLLOW_BECOMES_in_declaration444); 
							pushFollow(FOLLOW_expression_in_declaration448);
							ex=expression();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					 node = new VarDeclarationNode((id!=null?id.getText():null), t, ex); 
					}
					break;
				case 2 :
					// antlr/NeptuneChecker.g:68:4: ^( CONST t= type id= IDENTIFIER BECOMES ex= expression )
					{
					match(input,CONST,FOLLOW_CONST_in_declaration460); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_type_in_declaration464);
					t=type();
					state._fsp--;

					id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_declaration468); 
					match(input,BECOMES,FOLLOW_BECOMES_in_declaration470); 
					pushFollow(FOLLOW_expression_in_declaration474);
					ex=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					 node = new ConstDeclarationNode((id!=null?id.getText():null), t, ex); 
					}
					break;
				case 3 :
					// antlr/NeptuneChecker.g:69:4: ^( FUNCTION t= type func= IDENTIFIER (t= type id= IDENTIFIER )+ l= lines return_statement )
					{
					match(input,FUNCTION,FOLLOW_FUNCTION_in_declaration485); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_type_in_declaration489);
					t=type();
					state._fsp--;

					func=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_declaration493); 
					// antlr/NeptuneChecker.g:69:38: (t= type id= IDENTIFIER )+
					int cnt9=0;
					loop9:
					while (true) {
						int alt9=2;
						int LA9_0 = input.LA(1);
						if ( ((LA9_0 >= BOOLEAN && LA9_0 <= CHAR)||LA9_0==INTEGER) ) {
							alt9=1;
						}

						switch (alt9) {
						case 1 :
							// antlr/NeptuneChecker.g:69:39: t= type id= IDENTIFIER
							{
							pushFollow(FOLLOW_type_in_declaration498);
							t=type();
							state._fsp--;

							id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_declaration502); 
							}
							break;

						default :
							if ( cnt9 >= 1 ) break loop9;
							EarlyExitException eee = new EarlyExitException(9, input);
							throw eee;
						}
						cnt9++;
					}

					pushFollow(FOLLOW_lines_in_declaration508);
					l=lines();
					state._fsp--;

					pushFollow(FOLLOW_return_statement_in_declaration510);
					return_statement();
					state._fsp--;

					match(input, Token.UP, null); 

					 node = new BasicNode("function " + (func!=null?func.getText():null)); 
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
		return node;
	}
	// $ANTLR end "declaration"



	// $ANTLR start "return_statement"
	// antlr/NeptuneChecker.g:72:1: return_statement returns [ Node node ] : ^( RETURN ex= expression ) ;
	public final Node return_statement() throws RecognitionException {
		Node node = null;


		Node ex =null;

		try {
			// antlr/NeptuneChecker.g:73:2: ( ^( RETURN ex= expression ) )
			// antlr/NeptuneChecker.g:73:4: ^( RETURN ex= expression )
			{
			match(input,RETURN,FOLLOW_RETURN_in_return_statement529); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expression_in_return_statement533);
			ex=expression();
			state._fsp--;

			match(input, Token.UP, null); 

			 node = new BasicNode("return", ex); 
			}

		}

			catch(RecognitionException e){
				throw e;
			}

		finally {
			// do for sure before leaving
		}
		return node;
	}
	// $ANTLR end "return_statement"



	// $ANTLR start "expression"
	// antlr/NeptuneChecker.g:76:1: expression returns [ Node node = new BasicNode(\"expression\"); ] : n= assignment_expr ;
	public final Node expression() throws RecognitionException {
		Node node =  new BasicNode("expression");;


		Node n =null;

		try {
			// antlr/NeptuneChecker.g:77:2: (n= assignment_expr )
			// antlr/NeptuneChecker.g:77:4: n= assignment_expr
			{
			pushFollow(FOLLOW_assignment_expr_in_expression560);
			n=assignment_expr();
			state._fsp--;

			 node = n; 
			}

		}

			catch(RecognitionException e){
				throw e;
			}

		finally {
			// do for sure before leaving
		}
		return node;
	}
	// $ANTLR end "expression"



	// $ANTLR start "assignment_expr"
	// antlr/NeptuneChecker.g:80:1: assignment_expr returns [ Node node = new BasicNode(\"assignment\"); ] : (n= and_or_expr | ^( BECOMES x= variable_use expression ) );
	public final Node assignment_expr() throws RecognitionException {
		Node node =  new BasicNode("assignment");;


		Node n =null;

		try {
			// antlr/NeptuneChecker.g:81:2: (n= and_or_expr | ^( BECOMES x= variable_use expression ) )
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==AND||(LA11_0 >= ARRAY_SET && LA11_0 <= ATOMIC_VAR)||LA11_0==BLOCK||LA11_0==CHAR_LITERAL||LA11_0==DIVIDE||(LA11_0 >= EQ && LA11_0 <= FALSE)||(LA11_0 >= FUNCTION && LA11_0 <= GT_EQ)||(LA11_0 >= LT && LA11_0 <= PRINT)||LA11_0==READ||(LA11_0 >= SIZEOF && LA11_0 <= STRING_LITERAL)||(LA11_0 >= TIMES && LA11_0 <= UNARY_PLUS)) ) {
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
					// antlr/NeptuneChecker.g:81:4: n= and_or_expr
					{
					pushFollow(FOLLOW_and_or_expr_in_assignment_expr589);
					n=and_or_expr();
					state._fsp--;

					 node = n; 
					}
					break;
				case 2 :
					// antlr/NeptuneChecker.g:82:4: ^( BECOMES x= variable_use expression )
					{
					match(input,BECOMES,FOLLOW_BECOMES_in_assignment_expr608); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_variable_use_in_assignment_expr612);
					variable_use();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_assignment_expr614);
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
		return node;
	}
	// $ANTLR end "assignment_expr"



	// $ANTLR start "and_or_expr"
	// antlr/NeptuneChecker.g:85:1: and_or_expr returns [ Node node = new BasicNode(\"and_or\"); ] : (n= boolean_expr | ^( AND e1= expression e2= expression ) | ^( OR e1= expression e2= expression ) );
	public final Node and_or_expr() throws RecognitionException {
		Node node =  new BasicNode("and_or");;


		Node n =null;
		Node e1 =null;
		Node e2 =null;

		try {
			// antlr/NeptuneChecker.g:86:2: (n= boolean_expr | ^( AND e1= expression e2= expression ) | ^( OR e1= expression e2= expression ) )
			int alt12=3;
			switch ( input.LA(1) ) {
			case ARRAY_SET:
			case ARRAY_VAR:
			case ATOMIC_VAR:
			case BLOCK:
			case CHAR_LITERAL:
			case DIVIDE:
			case EQ:
			case FALSE:
			case FUNCTION:
			case GT:
			case GT_EQ:
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
					// antlr/NeptuneChecker.g:86:4: n= boolean_expr
					{
					pushFollow(FOLLOW_boolean_expr_in_and_or_expr633);
					n=boolean_expr();
					state._fsp--;

					 node = n; 
					}
					break;
				case 2 :
					// antlr/NeptuneChecker.g:87:4: ^( AND e1= expression e2= expression )
					{
					match(input,AND,FOLLOW_AND_in_and_or_expr651); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_and_or_expr655);
					e1=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_and_or_expr659);
					e2=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 3 :
					// antlr/NeptuneChecker.g:88:4: ^( OR e1= expression e2= expression )
					{
					match(input,OR,FOLLOW_OR_in_and_or_expr666); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_and_or_expr670);
					e1=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_and_or_expr674);
					e2=expression();
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
		return node;
	}
	// $ANTLR end "and_or_expr"



	// $ANTLR start "boolean_expr"
	// antlr/NeptuneChecker.g:91:1: boolean_expr returns [ Node node = new BasicNode(\"boolean\"); ] : (n= plus_expr | ^( LT e1= expression e2= expression ) | ^( LT_EQ e1= expression e2= expression ) | ^( GT e1= expression e2= expression ) | ^( GT_EQ e1= expression e2= expression ) | ^( EQ expression expression ) | ^( NEQ expression expression ) );
	public final Node boolean_expr() throws RecognitionException {
		Node node =  new BasicNode("boolean");;


		Node n =null;
		Node e1 =null;
		Node e2 =null;

		try {
			// antlr/NeptuneChecker.g:92:2: (n= plus_expr | ^( LT e1= expression e2= expression ) | ^( LT_EQ e1= expression e2= expression ) | ^( GT e1= expression e2= expression ) | ^( GT_EQ e1= expression e2= expression ) | ^( EQ expression expression ) | ^( NEQ expression expression ) )
			int alt13=7;
			switch ( input.LA(1) ) {
			case ARRAY_SET:
			case ARRAY_VAR:
			case ATOMIC_VAR:
			case BLOCK:
			case CHAR_LITERAL:
			case DIVIDE:
			case FALSE:
			case FUNCTION:
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
					// antlr/NeptuneChecker.g:92:4: n= plus_expr
					{
					pushFollow(FOLLOW_plus_expr_in_boolean_expr692);
					n=plus_expr();
					state._fsp--;

					 node = n; 
					}
					break;
				case 2 :
					// antlr/NeptuneChecker.g:93:4: ^( LT e1= expression e2= expression )
					{
					match(input,LT,FOLLOW_LT_in_boolean_expr711); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_boolean_expr715);
					e1=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_boolean_expr719);
					e2=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 3 :
					// antlr/NeptuneChecker.g:94:4: ^( LT_EQ e1= expression e2= expression )
					{
					match(input,LT_EQ,FOLLOW_LT_EQ_in_boolean_expr726); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_boolean_expr730);
					e1=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_boolean_expr734);
					e2=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 4 :
					// antlr/NeptuneChecker.g:95:4: ^( GT e1= expression e2= expression )
					{
					match(input,GT,FOLLOW_GT_in_boolean_expr741); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_boolean_expr745);
					e1=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_boolean_expr749);
					e2=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 5 :
					// antlr/NeptuneChecker.g:96:4: ^( GT_EQ e1= expression e2= expression )
					{
					match(input,GT_EQ,FOLLOW_GT_EQ_in_boolean_expr756); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_boolean_expr760);
					e1=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_boolean_expr764);
					e2=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 6 :
					// antlr/NeptuneChecker.g:97:4: ^( EQ expression expression )
					{
					match(input,EQ,FOLLOW_EQ_in_boolean_expr771); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_boolean_expr773);
					expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_boolean_expr775);
					expression();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 7 :
					// antlr/NeptuneChecker.g:98:4: ^( NEQ expression expression )
					{
					match(input,NEQ,FOLLOW_NEQ_in_boolean_expr782); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_boolean_expr784);
					expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_boolean_expr786);
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
		return node;
	}
	// $ANTLR end "boolean_expr"



	// $ANTLR start "plus_expr"
	// antlr/NeptuneChecker.g:101:1: plus_expr returns [ Node node = new BasicNode(\"plus\"); ] : (n= multi_expr | ^( PLUS e1= expression e2= expression ) | ^( MINUS e1= expression e2= expression ) );
	public final Node plus_expr() throws RecognitionException {
		Node node =  new BasicNode("plus");;


		Node n =null;
		Node e1 =null;
		Node e2 =null;

		try {
			// antlr/NeptuneChecker.g:102:2: (n= multi_expr | ^( PLUS e1= expression e2= expression ) | ^( MINUS e1= expression e2= expression ) )
			int alt14=3;
			switch ( input.LA(1) ) {
			case ARRAY_SET:
			case ARRAY_VAR:
			case ATOMIC_VAR:
			case BLOCK:
			case CHAR_LITERAL:
			case DIVIDE:
			case FALSE:
			case FUNCTION:
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
					// antlr/NeptuneChecker.g:102:4: n= multi_expr
					{
					pushFollow(FOLLOW_multi_expr_in_plus_expr804);
					n=multi_expr();
					state._fsp--;

					 node = n; 
					}
					break;
				case 2 :
					// antlr/NeptuneChecker.g:103:4: ^( PLUS e1= expression e2= expression )
					{
					match(input,PLUS,FOLLOW_PLUS_in_plus_expr823); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_plus_expr827);
					e1=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_plus_expr831);
					e2=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 3 :
					// antlr/NeptuneChecker.g:104:4: ^( MINUS e1= expression e2= expression )
					{
					match(input,MINUS,FOLLOW_MINUS_in_plus_expr838); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_plus_expr842);
					e1=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_plus_expr846);
					e2=expression();
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
		return node;
	}
	// $ANTLR end "plus_expr"



	// $ANTLR start "multi_expr"
	// antlr/NeptuneChecker.g:107:1: multi_expr returns [ Node node = new BasicNode(\"multi\"); ] : (n= unary_expr | ^( TIMES e1= expression e2= expression ) | ^( DIVIDE e1= expression e2= expression ) | ^( MOD e1= expression e2= expression ) );
	public final Node multi_expr() throws RecognitionException {
		Node node =  new BasicNode("multi");;


		Node n =null;
		Node e1 =null;
		Node e2 =null;

		try {
			// antlr/NeptuneChecker.g:108:2: (n= unary_expr | ^( TIMES e1= expression e2= expression ) | ^( DIVIDE e1= expression e2= expression ) | ^( MOD e1= expression e2= expression ) )
			int alt15=4;
			switch ( input.LA(1) ) {
			case ARRAY_SET:
			case ARRAY_VAR:
			case ATOMIC_VAR:
			case BLOCK:
			case CHAR_LITERAL:
			case FALSE:
			case FUNCTION:
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
					// antlr/NeptuneChecker.g:108:4: n= unary_expr
					{
					pushFollow(FOLLOW_unary_expr_in_multi_expr864);
					n=unary_expr();
					state._fsp--;

					 node = n; 
					}
					break;
				case 2 :
					// antlr/NeptuneChecker.g:109:4: ^( TIMES e1= expression e2= expression )
					{
					match(input,TIMES,FOLLOW_TIMES_in_multi_expr883); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_multi_expr887);
					e1=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_multi_expr891);
					e2=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 3 :
					// antlr/NeptuneChecker.g:110:4: ^( DIVIDE e1= expression e2= expression )
					{
					match(input,DIVIDE,FOLLOW_DIVIDE_in_multi_expr898); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_multi_expr902);
					e1=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_multi_expr906);
					e2=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 4 :
					// antlr/NeptuneChecker.g:111:4: ^( MOD e1= expression e2= expression )
					{
					match(input,MOD,FOLLOW_MOD_in_multi_expr913); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_multi_expr917);
					e1=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_multi_expr921);
					e2=expression();
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
		return node;
	}
	// $ANTLR end "multi_expr"



	// $ANTLR start "unary_expr"
	// antlr/NeptuneChecker.g:114:1: unary_expr returns [ Node node = new BasicNode(\"unary\"); ] : (n= operand | ^( UNARY_MINUS o= expression ) | ^( UNARY_PLUS o= expression ) | ^( NEGATE o= expression ) );
	public final Node unary_expr() throws RecognitionException {
		Node node =  new BasicNode("unary");;


		Node n =null;
		Node o =null;

		try {
			// antlr/NeptuneChecker.g:115:2: (n= operand | ^( UNARY_MINUS o= expression ) | ^( UNARY_PLUS o= expression ) | ^( NEGATE o= expression ) )
			int alt16=4;
			switch ( input.LA(1) ) {
			case ARRAY_SET:
			case ARRAY_VAR:
			case ATOMIC_VAR:
			case BLOCK:
			case CHAR_LITERAL:
			case FALSE:
			case FUNCTION:
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
					// antlr/NeptuneChecker.g:115:4: n= operand
					{
					pushFollow(FOLLOW_operand_in_unary_expr940);
					n=operand();
					state._fsp--;

					 node = n; 
					}
					break;
				case 2 :
					// antlr/NeptuneChecker.g:116:4: ^( UNARY_MINUS o= expression )
					{
					match(input,UNARY_MINUS,FOLLOW_UNARY_MINUS_in_unary_expr960); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_unary_expr964);
					o=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 3 :
					// antlr/NeptuneChecker.g:117:4: ^( UNARY_PLUS o= expression )
					{
					match(input,UNARY_PLUS,FOLLOW_UNARY_PLUS_in_unary_expr971); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_unary_expr975);
					o=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 4 :
					// antlr/NeptuneChecker.g:118:4: ^( NEGATE o= expression )
					{
					match(input,NEGATE,FOLLOW_NEGATE_in_unary_expr982); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_unary_expr986);
					o=expression();
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
		return node;
	}
	// $ANTLR end "unary_expr"



	// $ANTLR start "operand"
	// antlr/NeptuneChecker.g:121:1: operand returns [ Node node = new BasicNode(\"operand\"); ] : ( ^( FUNCTION IDENTIFIER ^( ARRAY_SET ( expression )+ ) ) |v= variable_expression | NUMBER | ^( ARRAY_SET ( expression )+ ) | TRUE | FALSE | CHAR_LITERAL |str= STRING_LITERAL | codeblock |n= print_statement | read_statement | ^( SIZEOF id= IDENTIFIER ) );
	public final Node operand() throws RecognitionException {
		Node node =  new BasicNode("operand");;


		CommonTree str=null;
		CommonTree id=null;
		Node v =null;
		Node n =null;

		try {
			// antlr/NeptuneChecker.g:122:2: ( ^( FUNCTION IDENTIFIER ^( ARRAY_SET ( expression )+ ) ) |v= variable_expression | NUMBER | ^( ARRAY_SET ( expression )+ ) | TRUE | FALSE | CHAR_LITERAL |str= STRING_LITERAL | codeblock |n= print_statement | read_statement | ^( SIZEOF id= IDENTIFIER ) )
			int alt19=12;
			switch ( input.LA(1) ) {
			case FUNCTION:
				{
				alt19=1;
				}
				break;
			case ARRAY_VAR:
			case ATOMIC_VAR:
				{
				alt19=2;
				}
				break;
			case NUMBER:
				{
				alt19=3;
				}
				break;
			case ARRAY_SET:
				{
				alt19=4;
				}
				break;
			case TRUE:
				{
				alt19=5;
				}
				break;
			case FALSE:
				{
				alt19=6;
				}
				break;
			case CHAR_LITERAL:
				{
				alt19=7;
				}
				break;
			case STRING_LITERAL:
				{
				alt19=8;
				}
				break;
			case BLOCK:
				{
				alt19=9;
				}
				break;
			case PRINT:
				{
				alt19=10;
				}
				break;
			case READ:
				{
				alt19=11;
				}
				break;
			case SIZEOF:
				{
				alt19=12;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 19, 0, input);
				throw nvae;
			}
			switch (alt19) {
				case 1 :
					// antlr/NeptuneChecker.g:122:4: ^( FUNCTION IDENTIFIER ^( ARRAY_SET ( expression )+ ) )
					{
					match(input,FUNCTION,FOLLOW_FUNCTION_in_operand1003); 
					match(input, Token.DOWN, null); 
					match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_operand1005); 
					match(input,ARRAY_SET,FOLLOW_ARRAY_SET_in_operand1008); 
					match(input, Token.DOWN, null); 
					// antlr/NeptuneChecker.g:122:38: ( expression )+
					int cnt17=0;
					loop17:
					while (true) {
						int alt17=2;
						int LA17_0 = input.LA(1);
						if ( (LA17_0==AND||(LA17_0 >= ARRAY_SET && LA17_0 <= BLOCK)||LA17_0==CHAR_LITERAL||LA17_0==DIVIDE||(LA17_0 >= EQ && LA17_0 <= FALSE)||(LA17_0 >= FUNCTION && LA17_0 <= GT_EQ)||(LA17_0 >= LT && LA17_0 <= PRINT)||LA17_0==READ||(LA17_0 >= SIZEOF && LA17_0 <= STRING_LITERAL)||(LA17_0 >= TIMES && LA17_0 <= UNARY_PLUS)) ) {
							alt17=1;
						}

						switch (alt17) {
						case 1 :
							// antlr/NeptuneChecker.g:122:38: expression
							{
							pushFollow(FOLLOW_expression_in_operand1010);
							expression();
							state._fsp--;

							}
							break;

						default :
							if ( cnt17 >= 1 ) break loop17;
							EarlyExitException eee = new EarlyExitException(17, input);
							throw eee;
						}
						cnt17++;
					}

					match(input, Token.UP, null); 

					match(input, Token.UP, null); 

					}
					break;
				case 2 :
					// antlr/NeptuneChecker.g:123:4: v= variable_expression
					{
					pushFollow(FOLLOW_variable_expression_in_operand1020);
					v=variable_expression();
					state._fsp--;

					 node = v; 
					}
					break;
				case 3 :
					// antlr/NeptuneChecker.g:124:4: NUMBER
					{
					match(input,NUMBER,FOLLOW_NUMBER_in_operand1036); 
					}
					break;
				case 4 :
					// antlr/NeptuneChecker.g:125:4: ^( ARRAY_SET ( expression )+ )
					{
					match(input,ARRAY_SET,FOLLOW_ARRAY_SET_in_operand1042); 
					match(input, Token.DOWN, null); 
					// antlr/NeptuneChecker.g:125:16: ( expression )+
					int cnt18=0;
					loop18:
					while (true) {
						int alt18=2;
						int LA18_0 = input.LA(1);
						if ( (LA18_0==AND||(LA18_0 >= ARRAY_SET && LA18_0 <= BLOCK)||LA18_0==CHAR_LITERAL||LA18_0==DIVIDE||(LA18_0 >= EQ && LA18_0 <= FALSE)||(LA18_0 >= FUNCTION && LA18_0 <= GT_EQ)||(LA18_0 >= LT && LA18_0 <= PRINT)||LA18_0==READ||(LA18_0 >= SIZEOF && LA18_0 <= STRING_LITERAL)||(LA18_0 >= TIMES && LA18_0 <= UNARY_PLUS)) ) {
							alt18=1;
						}

						switch (alt18) {
						case 1 :
							// antlr/NeptuneChecker.g:125:17: expression
							{
							pushFollow(FOLLOW_expression_in_operand1045);
							expression();
							state._fsp--;

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

					}
					break;
				case 5 :
					// antlr/NeptuneChecker.g:126:4: TRUE
					{
					match(input,TRUE,FOLLOW_TRUE_in_operand1053); 
					}
					break;
				case 6 :
					// antlr/NeptuneChecker.g:127:4: FALSE
					{
					match(input,FALSE,FOLLOW_FALSE_in_operand1058); 
					}
					break;
				case 7 :
					// antlr/NeptuneChecker.g:128:4: CHAR_LITERAL
					{
					match(input,CHAR_LITERAL,FOLLOW_CHAR_LITERAL_in_operand1063); 
					}
					break;
				case 8 :
					// antlr/NeptuneChecker.g:129:4: str= STRING_LITERAL
					{
					str=(CommonTree)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_operand1070); 
					}
					break;
				case 9 :
					// antlr/NeptuneChecker.g:130:4: codeblock
					{
					pushFollow(FOLLOW_codeblock_in_operand1075);
					codeblock();
					state._fsp--;

					}
					break;
				case 10 :
					// antlr/NeptuneChecker.g:131:4: n= print_statement
					{
					pushFollow(FOLLOW_print_statement_in_operand1082);
					n=print_statement();
					state._fsp--;

					 node = n; 
					}
					break;
				case 11 :
					// antlr/NeptuneChecker.g:132:4: read_statement
					{
					pushFollow(FOLLOW_read_statement_in_operand1099);
					read_statement();
					state._fsp--;

					}
					break;
				case 12 :
					// antlr/NeptuneChecker.g:133:4: ^( SIZEOF id= IDENTIFIER )
					{
					match(input,SIZEOF,FOLLOW_SIZEOF_in_operand1105); 
					match(input, Token.DOWN, null); 
					id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_operand1109); 
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
		return node;
	}
	// $ANTLR end "operand"



	// $ANTLR start "variable_expression"
	// antlr/NeptuneChecker.g:136:1: variable_expression returns [ Node node ] : ( ^( ATOMIC_VAR id= IDENTIFIER ) | ^( ARRAY_VAR id= IDENTIFIER ex= expression ) );
	public final Node variable_expression() throws RecognitionException {
		Node node = null;


		CommonTree id=null;
		Node ex =null;

		try {
			// antlr/NeptuneChecker.g:137:2: ( ^( ATOMIC_VAR id= IDENTIFIER ) | ^( ARRAY_VAR id= IDENTIFIER ex= expression ) )
			int alt20=2;
			int LA20_0 = input.LA(1);
			if ( (LA20_0==ATOMIC_VAR) ) {
				alt20=1;
			}
			else if ( (LA20_0==ARRAY_VAR) ) {
				alt20=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 20, 0, input);
				throw nvae;
			}

			switch (alt20) {
				case 1 :
					// antlr/NeptuneChecker.g:137:4: ^( ATOMIC_VAR id= IDENTIFIER )
					{
					match(input,ATOMIC_VAR,FOLLOW_ATOMIC_VAR_in_variable_expression1127); 
					match(input, Token.DOWN, null); 
					id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_variable_expression1131); 
					match(input, Token.UP, null); 

					 node = new VarNode((id!=null?id.getText():null)); 
					}
					break;
				case 2 :
					// antlr/NeptuneChecker.g:138:4: ^( ARRAY_VAR id= IDENTIFIER ex= expression )
					{
					match(input,ARRAY_VAR,FOLLOW_ARRAY_VAR_in_variable_expression1147); 
					match(input, Token.DOWN, null); 
					id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_variable_expression1151); 
					pushFollow(FOLLOW_expression_in_variable_expression1155);
					ex=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					 node = new VarIndexedNode((id!=null?id.getText():null), ex); 
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
		return node;
	}
	// $ANTLR end "variable_expression"



	// $ANTLR start "variable_use"
	// antlr/NeptuneChecker.g:141:1: variable_use : ( ^( ATOMIC_VAR x= IDENTIFIER ) | ^( ARRAY_VAR x= IDENTIFIER ex= expression ) );
	public final void variable_use() throws RecognitionException {
		CommonTree x=null;
		Node ex =null;

		try {
			// antlr/NeptuneChecker.g:142:2: ( ^( ATOMIC_VAR x= IDENTIFIER ) | ^( ARRAY_VAR x= IDENTIFIER ex= expression ) )
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0==ATOMIC_VAR) ) {
				alt21=1;
			}
			else if ( (LA21_0==ARRAY_VAR) ) {
				alt21=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 21, 0, input);
				throw nvae;
			}

			switch (alt21) {
				case 1 :
					// antlr/NeptuneChecker.g:142:4: ^( ATOMIC_VAR x= IDENTIFIER )
					{
					match(input,ATOMIC_VAR,FOLLOW_ATOMIC_VAR_in_variable_use1174); 
					match(input, Token.DOWN, null); 
					x=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_variable_use1178); 
					match(input, Token.UP, null); 

					}
					break;
				case 2 :
					// antlr/NeptuneChecker.g:143:4: ^( ARRAY_VAR x= IDENTIFIER ex= expression )
					{
					match(input,ARRAY_VAR,FOLLOW_ARRAY_VAR_in_variable_use1185); 
					match(input, Token.DOWN, null); 
					x=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_variable_use1189); 
					pushFollow(FOLLOW_expression_in_variable_use1193);
					ex=expression();
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
	// $ANTLR end "variable_use"



	// $ANTLR start "type"
	// antlr/NeptuneChecker.g:146:1: type returns [ Node node ] : ( INTEGER (count= array_def )? | CHAR (count= array_def )? | BOOLEAN (count= array_def )? );
	public final Node type() throws RecognitionException {
		Node node = null;


		int count =0;

		try {
			// antlr/NeptuneChecker.g:147:2: ( INTEGER (count= array_def )? | CHAR (count= array_def )? | BOOLEAN (count= array_def )? )
			int alt25=3;
			switch ( input.LA(1) ) {
			case INTEGER:
				{
				alt25=1;
				}
				break;
			case CHAR:
				{
				alt25=2;
				}
				break;
			case BOOLEAN:
				{
				alt25=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 25, 0, input);
				throw nvae;
			}
			switch (alt25) {
				case 1 :
					// antlr/NeptuneChecker.g:147:4: INTEGER (count= array_def )?
					{
					match(input,INTEGER,FOLLOW_INTEGER_in_type1209); 
					// antlr/NeptuneChecker.g:147:17: (count= array_def )?
					int alt22=2;
					int LA22_0 = input.LA(1);
					if ( (LA22_0==ARRAY_DEF) ) {
						alt22=1;
					}
					switch (alt22) {
						case 1 :
							// antlr/NeptuneChecker.g:147:17: count= array_def
							{
							pushFollow(FOLLOW_array_def_in_type1213);
							count=array_def();
							state._fsp--;

							}
							break;

					}

					 node = new TypeNode(Node.type.INTEGER, count); 
					}
					break;
				case 2 :
					// antlr/NeptuneChecker.g:148:4: CHAR (count= array_def )?
					{
					match(input,CHAR,FOLLOW_CHAR_in_type1222); 
					// antlr/NeptuneChecker.g:148:14: (count= array_def )?
					int alt23=2;
					int LA23_0 = input.LA(1);
					if ( (LA23_0==ARRAY_DEF) ) {
						alt23=1;
					}
					switch (alt23) {
						case 1 :
							// antlr/NeptuneChecker.g:148:14: count= array_def
							{
							pushFollow(FOLLOW_array_def_in_type1226);
							count=array_def();
							state._fsp--;

							}
							break;

					}

					 node = new TypeNode(Node.type.CHAR, count); 
					}
					break;
				case 3 :
					// antlr/NeptuneChecker.g:149:4: BOOLEAN (count= array_def )?
					{
					match(input,BOOLEAN,FOLLOW_BOOLEAN_in_type1236); 
					// antlr/NeptuneChecker.g:149:17: (count= array_def )?
					int alt24=2;
					int LA24_0 = input.LA(1);
					if ( (LA24_0==ARRAY_DEF) ) {
						alt24=1;
					}
					switch (alt24) {
						case 1 :
							// antlr/NeptuneChecker.g:149:17: count= array_def
							{
							pushFollow(FOLLOW_array_def_in_type1240);
							count=array_def();
							state._fsp--;

							}
							break;

					}

					 node = new TypeNode(Node.type.BOOL, count); 
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
		return node;
	}
	// $ANTLR end "type"



	// $ANTLR start "array_def"
	// antlr/NeptuneChecker.g:152:1: array_def returns [int count = 0] : ^( ARRAY_DEF x= NUMBER ) ;
	public final int array_def() throws RecognitionException {
		int count =  0;


		CommonTree x=null;

		try {
			// antlr/NeptuneChecker.g:153:2: ( ^( ARRAY_DEF x= NUMBER ) )
			// antlr/NeptuneChecker.g:153:4: ^( ARRAY_DEF x= NUMBER )
			{
			match(input,ARRAY_DEF,FOLLOW_ARRAY_DEF_in_array_def1260); 
			match(input, Token.DOWN, null); 
			x=(CommonTree)match(input,NUMBER,FOLLOW_NUMBER_in_array_def1264); 
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



	public static final BitSet FOLLOW_PROGRAM_in_program41 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_lines_in_program45 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_line_in_lines69 = new BitSet(new long[]{0xEC43FF017E0A27D2L,0x000000000000000DL});
	public static final BitSet FOLLOW_expression_in_line90 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declaration_in_line110 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_logic_statement_in_line130 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BLOCK_in_codeblock158 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_lines_in_codeblock162 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_WHILE_in_logic_statement191 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_logic_statement195 = new BitSet(new long[]{0xEC43FF017E0A27D0L,0x000000000000000DL});
	public static final BitSet FOLLOW_lines_in_logic_statement199 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FOREACH_in_logic_statement214 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_logic_statement218 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_logic_statement222 = new BitSet(new long[]{0xEC43FF017E0A27D0L,0x000000000000000DL});
	public static final BitSet FOLLOW_lines_in_logic_statement226 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_IF_in_logic_statement244 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_logic_statement248 = new BitSet(new long[]{0xEC43FF017E0A27D0L,0x000000000000000DL});
	public static final BitSet FOLLOW_lines_in_logic_statement252 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_ELSIF_in_logic_statement267 = new BitSet(new long[]{0xEC43FF00760827D0L,0x0000000000000001L});
	public static final BitSet FOLLOW_expression_in_logic_statement271 = new BitSet(new long[]{0xEC43FF017E0A27D0L,0x000000000000000DL});
	public static final BitSet FOLLOW_lines_in_logic_statement275 = new BitSet(new long[]{0x0000000001800008L});
	public static final BitSet FOLLOW_ELSE_in_logic_statement294 = new BitSet(new long[]{0xEC43FF017E0A27D0L,0x000000000000000DL});
	public static final BitSet FOLLOW_lines_in_logic_statement298 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PRINT_in_print_statement352 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_print_statement360 = new BitSet(new long[]{0xEC43FF00760827D8L,0x0000000000000001L});
	public static final BitSet FOLLOW_expression_in_print_statement370 = new BitSet(new long[]{0xEC43FF00760827D8L,0x0000000000000001L});
	public static final BitSet FOLLOW_READ_in_read_statement405 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_read_statement409 = new BitSet(new long[]{0x0000000080000008L});
	public static final BitSet FOLLOW_IDENTIFIER_in_read_statement414 = new BitSet(new long[]{0x0000000080000008L});
	public static final BitSet FOLLOW_VAR_in_declaration433 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_type_in_declaration437 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_declaration441 = new BitSet(new long[]{0x0000000000000208L});
	public static final BitSet FOLLOW_BECOMES_in_declaration444 = new BitSet(new long[]{0xEC43FF00760827D0L,0x0000000000000001L});
	public static final BitSet FOLLOW_expression_in_declaration448 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_CONST_in_declaration460 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_type_in_declaration464 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_declaration468 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_BECOMES_in_declaration470 = new BitSet(new long[]{0xEC43FF00760827D0L,0x0000000000000001L});
	public static final BitSet FOLLOW_expression_in_declaration474 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNCTION_in_declaration485 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_type_in_declaration489 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_declaration493 = new BitSet(new long[]{0x0000000400001800L});
	public static final BitSet FOLLOW_type_in_declaration498 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_declaration502 = new BitSet(new long[]{0xEC43FF057E0A3FD0L,0x000000000000000DL});
	public static final BitSet FOLLOW_lines_in_declaration508 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_return_statement_in_declaration510 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_RETURN_in_return_statement529 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_return_statement533 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_assignment_expr_in_expression560 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_and_or_expr_in_assignment_expr589 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BECOMES_in_assignment_expr608 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_variable_use_in_assignment_expr612 = new BitSet(new long[]{0xEC43FF00760827D0L,0x0000000000000001L});
	public static final BitSet FOLLOW_expression_in_assignment_expr614 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_boolean_expr_in_and_or_expr633 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AND_in_and_or_expr651 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_and_or_expr655 = new BitSet(new long[]{0xEC43FF00760827D0L,0x0000000000000001L});
	public static final BitSet FOLLOW_expression_in_and_or_expr659 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_OR_in_and_or_expr666 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_and_or_expr670 = new BitSet(new long[]{0xEC43FF00760827D0L,0x0000000000000001L});
	public static final BitSet FOLLOW_expression_in_and_or_expr674 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_plus_expr_in_boolean_expr692 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LT_in_boolean_expr711 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_boolean_expr715 = new BitSet(new long[]{0xEC43FF00760827D0L,0x0000000000000001L});
	public static final BitSet FOLLOW_expression_in_boolean_expr719 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LT_EQ_in_boolean_expr726 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_boolean_expr730 = new BitSet(new long[]{0xEC43FF00760827D0L,0x0000000000000001L});
	public static final BitSet FOLLOW_expression_in_boolean_expr734 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_GT_in_boolean_expr741 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_boolean_expr745 = new BitSet(new long[]{0xEC43FF00760827D0L,0x0000000000000001L});
	public static final BitSet FOLLOW_expression_in_boolean_expr749 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_GT_EQ_in_boolean_expr756 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_boolean_expr760 = new BitSet(new long[]{0xEC43FF00760827D0L,0x0000000000000001L});
	public static final BitSet FOLLOW_expression_in_boolean_expr764 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_EQ_in_boolean_expr771 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_boolean_expr773 = new BitSet(new long[]{0xEC43FF00760827D0L,0x0000000000000001L});
	public static final BitSet FOLLOW_expression_in_boolean_expr775 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NEQ_in_boolean_expr782 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_boolean_expr784 = new BitSet(new long[]{0xEC43FF00760827D0L,0x0000000000000001L});
	public static final BitSet FOLLOW_expression_in_boolean_expr786 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_multi_expr_in_plus_expr804 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PLUS_in_plus_expr823 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_plus_expr827 = new BitSet(new long[]{0xEC43FF00760827D0L,0x0000000000000001L});
	public static final BitSet FOLLOW_expression_in_plus_expr831 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MINUS_in_plus_expr838 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_plus_expr842 = new BitSet(new long[]{0xEC43FF00760827D0L,0x0000000000000001L});
	public static final BitSet FOLLOW_expression_in_plus_expr846 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_unary_expr_in_multi_expr864 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIMES_in_multi_expr883 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_multi_expr887 = new BitSet(new long[]{0xEC43FF00760827D0L,0x0000000000000001L});
	public static final BitSet FOLLOW_expression_in_multi_expr891 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DIVIDE_in_multi_expr898 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_multi_expr902 = new BitSet(new long[]{0xEC43FF00760827D0L,0x0000000000000001L});
	public static final BitSet FOLLOW_expression_in_multi_expr906 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MOD_in_multi_expr913 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_multi_expr917 = new BitSet(new long[]{0xEC43FF00760827D0L,0x0000000000000001L});
	public static final BitSet FOLLOW_expression_in_multi_expr921 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_operand_in_unary_expr940 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_UNARY_MINUS_in_unary_expr960 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_unary_expr964 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_UNARY_PLUS_in_unary_expr971 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_unary_expr975 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NEGATE_in_unary_expr982 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_unary_expr986 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNCTION_in_operand1003 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_operand1005 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_ARRAY_SET_in_operand1008 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_operand1010 = new BitSet(new long[]{0xEC43FF00760827D8L,0x0000000000000001L});
	public static final BitSet FOLLOW_variable_expression_in_operand1020 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMBER_in_operand1036 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ARRAY_SET_in_operand1042 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_operand1045 = new BitSet(new long[]{0xEC43FF00760827D8L,0x0000000000000001L});
	public static final BitSet FOLLOW_TRUE_in_operand1053 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FALSE_in_operand1058 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_LITERAL_in_operand1063 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_operand1070 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_codeblock_in_operand1075 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_print_statement_in_operand1082 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_read_statement_in_operand1099 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SIZEOF_in_operand1105 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_operand1109 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ATOMIC_VAR_in_variable_expression1127 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_variable_expression1131 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ARRAY_VAR_in_variable_expression1147 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_variable_expression1151 = new BitSet(new long[]{0xEC43FF00760827D0L,0x0000000000000001L});
	public static final BitSet FOLLOW_expression_in_variable_expression1155 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ATOMIC_VAR_in_variable_use1174 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_variable_use1178 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ARRAY_VAR_in_variable_use1185 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_variable_use1189 = new BitSet(new long[]{0xEC43FF00760827D0L,0x0000000000000001L});
	public static final BitSet FOLLOW_expression_in_variable_use1193 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_INTEGER_in_type1209 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_array_def_in_type1213 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_in_type1222 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_array_def_in_type1226 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOLEAN_in_type1236 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_array_def_in_type1240 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ARRAY_DEF_in_array_def1260 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_NUMBER_in_array_def1264 = new BitSet(new long[]{0x0000000000000008L});
}

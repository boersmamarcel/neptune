// $ANTLR 3.5.2 antlr/NeptuneTree.g 2014-07-05 16:34:00

	package neptune;
	
	import neptune.node.*;
	import neptune.assembly.Program;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class NeptuneTree extends TreeParser {
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


	public NeptuneTree(TreeNodeStream input) {
		this(input, new RecognizerSharedState());
	}
	public NeptuneTree(TreeNodeStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return NeptuneTree.tokenNames; }
	@Override public String getGrammarFileName() { return "antlr/NeptuneTree.g"; }


		public ProgramNode rootNode;



	// $ANTLR start "program"
	// antlr/NeptuneTree.g:25:1: program : ^( PROGRAM n= lines ) ;
	public final void program() throws RecognitionException {
		List<Node> n =null;

		try {
			// antlr/NeptuneTree.g:26:2: ( ^( PROGRAM n= lines ) )
			// antlr/NeptuneTree.g:26:4: ^( PROGRAM n= lines )
			{
			match(input,PROGRAM,FOLLOW_PROGRAM_in_program47); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_lines_in_program51);
			n=lines();
			state._fsp--;

			match(input, Token.UP, null); 

			 rootNode = new ProgramNode(n); 
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
	// antlr/NeptuneTree.g:29:1: lines returns [ List<Node> nodes = new ArrayList<Node>() ] : (n= line )+ ;
	public final List<Node> lines() throws RecognitionException {
		List<Node> nodes =  new ArrayList<Node>();


		Node n =null;

		try {
			// antlr/NeptuneTree.g:30:2: ( (n= line )+ )
			// antlr/NeptuneTree.g:30:4: (n= line )+
			{
			// antlr/NeptuneTree.g:30:4: (n= line )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==AND||(LA1_0 >= ARRAY_SET && LA1_0 <= BLOCK)||LA1_0==CHAR_LITERAL||LA1_0==CONST||LA1_0==DIVIDE||(LA1_0 >= EQ && LA1_0 <= GT_EQ)||LA1_0==IF||(LA1_0 >= LT && LA1_0 <= PRINT)||(LA1_0 >= READ && LA1_0 <= RETURN)||(LA1_0 >= SIZEOF && LA1_0 <= STRING_LITERAL)||(LA1_0 >= TIMES && LA1_0 <= UNARY_PLUS)||(LA1_0 >= VAR && LA1_0 <= WHILE)) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// antlr/NeptuneTree.g:30:5: n= line
					{
					pushFollow(FOLLOW_line_in_lines81);
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
	// antlr/NeptuneTree.g:33:1: line returns [ Node node ] : (n= expression |n= declaration |n= logic_statement |n= return_statement );
	public final Node line() throws RecognitionException {
		Node node = null;


		Node n =null;

		try {
			// antlr/NeptuneTree.g:34:2: (n= expression |n= declaration |n= logic_statement |n= return_statement )
			int alt2=4;
			switch ( input.LA(1) ) {
			case FUNCTION:
				{
				int LA2_1 = input.LA(2);
				if ( (LA2_1==DOWN) ) {
					int LA2_6 = input.LA(3);
					if ( (LA2_6==IDENTIFIER) ) {
						alt2=1;
					}
					else if ( ((LA2_6 >= BOOLEAN && LA2_6 <= CHAR)||LA2_6==INTEGER) ) {
						alt2=2;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 2, 6, input);
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
			case RETURN:
				{
				alt2=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}
			switch (alt2) {
				case 1 :
					// antlr/NeptuneTree.g:34:4: n= expression
					{
					pushFollow(FOLLOW_expression_in_line102);
					n=expression();
					state._fsp--;

					 node = new BasicNode("expression", n); 
					}
					break;
				case 2 :
					// antlr/NeptuneTree.g:35:4: n= declaration
					{
					pushFollow(FOLLOW_declaration_in_line122);
					n=declaration();
					state._fsp--;

					 node = new BasicNode("declaration", n);  
					}
					break;
				case 3 :
					// antlr/NeptuneTree.g:36:4: n= logic_statement
					{
					pushFollow(FOLLOW_logic_statement_in_line142);
					n=logic_statement();
					state._fsp--;

					 node = new BasicNode("logic", n); 
					}
					break;
				case 4 :
					// antlr/NeptuneTree.g:37:4: n= return_statement
					{
					pushFollow(FOLLOW_return_statement_in_line161);
					n=return_statement();
					state._fsp--;

					 node = new BasicNode("return", n); 
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
	// antlr/NeptuneTree.g:40:1: codeblock returns [ Node node ] : ^( BLOCK n= lines ) ;
	public final Node codeblock() throws RecognitionException {
		Node node = null;


		List<Node> n =null;

		try {
			// antlr/NeptuneTree.g:41:2: ( ^( BLOCK n= lines ) )
			// antlr/NeptuneTree.g:41:4: ^( BLOCK n= lines )
			{
			match(input,BLOCK,FOLLOW_BLOCK_in_codeblock188); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_lines_in_codeblock192);
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
	// antlr/NeptuneTree.g:44:1: logic_statement returns [ Node node ] : ( ^( WHILE ex= expression l= lines ) | ^( FOREACH x= IDENTIFIER y= IDENTIFIER l= lines ) | ^( IF ex= expression l= lines ( ELSIF ex= expression l= lines )* ( ELSE l= lines )? ) );
	public final Node logic_statement() throws RecognitionException {
		Node node = null;


		CommonTree x=null;
		CommonTree y=null;
		Node ex =null;
		List<Node> l =null;

		try {
			// antlr/NeptuneTree.g:45:2: ( ^( WHILE ex= expression l= lines ) | ^( FOREACH x= IDENTIFIER y= IDENTIFIER l= lines ) | ^( IF ex= expression l= lines ( ELSIF ex= expression l= lines )* ( ELSE l= lines )? ) )
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
					// antlr/NeptuneTree.g:45:4: ^( WHILE ex= expression l= lines )
					{
					match(input,WHILE,FOLLOW_WHILE_in_logic_statement221); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_logic_statement225);
					ex=expression();
					state._fsp--;

					pushFollow(FOLLOW_lines_in_logic_statement229);
					l=lines();
					state._fsp--;

					match(input, Token.UP, null); 

					 node = new WhileNode(ex, l); 
					}
					break;
				case 2 :
					// antlr/NeptuneTree.g:46:4: ^( FOREACH x= IDENTIFIER y= IDENTIFIER l= lines )
					{
					match(input,FOREACH,FOLLOW_FOREACH_in_logic_statement244); 
					match(input, Token.DOWN, null); 
					x=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_logic_statement248); 
					y=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_logic_statement252); 
					pushFollow(FOLLOW_lines_in_logic_statement256);
					l=lines();
					state._fsp--;

					match(input, Token.UP, null); 

					 node = new ForeachNode((x!=null?x.getText():null), (y!=null?y.getText():null), l); 
					}
					break;
				case 3 :
					// antlr/NeptuneTree.g:48:4: ^( IF ex= expression l= lines ( ELSIF ex= expression l= lines )* ( ELSE l= lines )? )
					{
					 List<Node> ifBlocks = new ArrayList<Node>(); Node elseNode = null; 
					match(input,IF,FOLLOW_IF_in_logic_statement274); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_logic_statement278);
					ex=expression();
					state._fsp--;

					pushFollow(FOLLOW_lines_in_logic_statement282);
					l=lines();
					state._fsp--;

					 ifBlocks.add(new IfBlockNode(ex, l)); 
					// antlr/NeptuneTree.g:50:3: ( ELSIF ex= expression l= lines )*
					loop3:
					while (true) {
						int alt3=2;
						int LA3_0 = input.LA(1);
						if ( (LA3_0==ELSIF) ) {
							alt3=1;
						}

						switch (alt3) {
						case 1 :
							// antlr/NeptuneTree.g:51:4: ELSIF ex= expression l= lines
							{
							match(input,ELSIF,FOLLOW_ELSIF_in_logic_statement297); 
							pushFollow(FOLLOW_expression_in_logic_statement301);
							ex=expression();
							state._fsp--;

							pushFollow(FOLLOW_lines_in_logic_statement305);
							l=lines();
							state._fsp--;

							 ifBlocks.add(new IfBlockNode(ex, l)); 
							}
							break;

						default :
							break loop3;
						}
					}

					// antlr/NeptuneTree.g:53:3: ( ELSE l= lines )?
					int alt4=2;
					int LA4_0 = input.LA(1);
					if ( (LA4_0==ELSE) ) {
						alt4=1;
					}
					switch (alt4) {
						case 1 :
							// antlr/NeptuneTree.g:54:4: ELSE l= lines
							{
							match(input,ELSE,FOLLOW_ELSE_in_logic_statement324); 
							pushFollow(FOLLOW_lines_in_logic_statement328);
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
	// antlr/NeptuneTree.g:59:1: print_statement returns [ Node node ] : ^( PRINT n1= expression (n2= expression )* ) ;
	public final Node print_statement() throws RecognitionException {
		Node node = null;


		Node n1 =null;
		Node n2 =null;

		try {
			// antlr/NeptuneTree.g:60:2: ( ^( PRINT n1= expression (n2= expression )* ) )
			// antlr/NeptuneTree.g:60:4: ^( PRINT n1= expression (n2= expression )* )
			{
			 List<Node> expressions = new ArrayList<Node>(); 
			match(input,PRINT,FOLLOW_PRINT_in_print_statement382); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expression_in_print_statement390);
			n1=expression();
			state._fsp--;

			 expressions.add(n1); 
			// antlr/NeptuneTree.g:63:4: (n2= expression )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==AND||(LA6_0 >= ARRAY_SET && LA6_0 <= BLOCK)||LA6_0==CHAR_LITERAL||LA6_0==DIVIDE||(LA6_0 >= EQ && LA6_0 <= FALSE)||(LA6_0 >= FUNCTION && LA6_0 <= GT_EQ)||(LA6_0 >= LT && LA6_0 <= PRINT)||LA6_0==READ||(LA6_0 >= SIZEOF && LA6_0 <= STRING_LITERAL)||(LA6_0 >= TIMES && LA6_0 <= UNARY_PLUS)) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// antlr/NeptuneTree.g:63:5: n2= expression
					{
					pushFollow(FOLLOW_expression_in_print_statement400);
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
	// antlr/NeptuneTree.g:67:1: read_statement returns [ Node node ] : ^( READ n1= variable_expression (n2= variable_expression )* ) ;
	public final Node read_statement() throws RecognitionException {
		Node node = null;


		Node n1 =null;
		Node n2 =null;

		try {
			// antlr/NeptuneTree.g:68:2: ( ^( READ n1= variable_expression (n2= variable_expression )* ) )
			// antlr/NeptuneTree.g:68:4: ^( READ n1= variable_expression (n2= variable_expression )* )
			{
			 List<Node> expressions = new ArrayList<Node>(); 
			match(input,READ,FOLLOW_READ_in_read_statement443); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_variable_expression_in_read_statement451);
			n1=variable_expression();
			state._fsp--;

			 expressions.add(n1); 
			// antlr/NeptuneTree.g:71:4: (n2= variable_expression )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( ((LA7_0 >= ARRAY_VAR && LA7_0 <= ATOMIC_VAR)) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// antlr/NeptuneTree.g:71:5: n2= variable_expression
					{
					pushFollow(FOLLOW_variable_expression_in_read_statement461);
					n2=variable_expression();
					state._fsp--;

					 expressions.add(n2); 
					}
					break;

				default :
					break loop7;
				}
			}

			match(input, Token.UP, null); 

			 node = new ReadNode(expressions); 
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
	// $ANTLR end "read_statement"



	// $ANTLR start "declaration"
	// antlr/NeptuneTree.g:75:1: declaration returns [ Node node ] : ( ^( VAR t= type id= IDENTIFIER ( BECOMES ex= expression )? ) | ^( CONST t= type id= IDENTIFIER BECOMES ex= expression ) | ^( FUNCTION t1= type func= IDENTIFIER (t= type id= IDENTIFIER )+ l= lines ) );
	public final Node declaration() throws RecognitionException {
		Node node = null;


		CommonTree id=null;
		CommonTree func=null;
		Node t =null;
		Node ex =null;
		Node t1 =null;
		List<Node> l =null;

		try {
			// antlr/NeptuneTree.g:76:2: ( ^( VAR t= type id= IDENTIFIER ( BECOMES ex= expression )? ) | ^( CONST t= type id= IDENTIFIER BECOMES ex= expression ) | ^( FUNCTION t1= type func= IDENTIFIER (t= type id= IDENTIFIER )+ l= lines ) )
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
					// antlr/NeptuneTree.g:76:4: ^( VAR t= type id= IDENTIFIER ( BECOMES ex= expression )? )
					{
					match(input,VAR,FOLLOW_VAR_in_declaration500); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_type_in_declaration504);
					t=type();
					state._fsp--;

					id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_declaration508); 
					// antlr/NeptuneTree.g:76:31: ( BECOMES ex= expression )?
					int alt8=2;
					int LA8_0 = input.LA(1);
					if ( (LA8_0==BECOMES) ) {
						alt8=1;
					}
					switch (alt8) {
						case 1 :
							// antlr/NeptuneTree.g:76:32: BECOMES ex= expression
							{
							match(input,BECOMES,FOLLOW_BECOMES_in_declaration511); 
							pushFollow(FOLLOW_expression_in_declaration515);
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
					// antlr/NeptuneTree.g:77:4: ^( CONST t= type id= IDENTIFIER BECOMES ex= expression )
					{
					match(input,CONST,FOLLOW_CONST_in_declaration527); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_type_in_declaration531);
					t=type();
					state._fsp--;

					id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_declaration535); 
					match(input,BECOMES,FOLLOW_BECOMES_in_declaration537); 
					pushFollow(FOLLOW_expression_in_declaration541);
					ex=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					 node = new ConstDeclarationNode((id!=null?id.getText():null), t, ex); 
					}
					break;
				case 3 :
					// antlr/NeptuneTree.g:78:4: ^( FUNCTION t1= type func= IDENTIFIER (t= type id= IDENTIFIER )+ l= lines )
					{
					 List<Node> args = new ArrayList<Node>(); 
					match(input,FUNCTION,FOLLOW_FUNCTION_in_declaration557); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_type_in_declaration563);
					t1=type();
					state._fsp--;

					func=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_declaration569); 
					// antlr/NeptuneTree.g:82:3: (t= type id= IDENTIFIER )+
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
							// antlr/NeptuneTree.g:83:4: t= type id= IDENTIFIER
							{
							pushFollow(FOLLOW_type_in_declaration580);
							t=type();
							state._fsp--;

							id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_declaration584); 
							 args.add(new VarDeclarationNode((id!=null?id.getText():null), t, null)); 
							}
							break;

						default :
							if ( cnt9 >= 1 ) break loop9;
							EarlyExitException eee = new EarlyExitException(9, input);
							throw eee;
						}
						cnt9++;
					}

					pushFollow(FOLLOW_lines_in_declaration599);
					l=lines();
					state._fsp--;

					match(input, Token.UP, null); 

					 node = new FunctionDeclarationNode((func!=null?func.getText():null), t1, args, l); 
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
	// antlr/NeptuneTree.g:89:1: return_statement returns [ Node node ] : ^( RETURN ex= expression ) ;
	public final Node return_statement() throws RecognitionException {
		Node node = null;


		Node ex =null;

		try {
			// antlr/NeptuneTree.g:90:2: ( ^( RETURN ex= expression ) )
			// antlr/NeptuneTree.g:90:4: ^( RETURN ex= expression )
			{
			match(input,RETURN,FOLLOW_RETURN_in_return_statement635); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expression_in_return_statement639);
			ex=expression();
			state._fsp--;

			match(input, Token.UP, null); 

			 node = new ReturnNode(ex); 
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
	// antlr/NeptuneTree.g:93:1: expression returns [ Node node ] : (n= operand | ^( BECOMES x= variable_use e1= expression ) | ^( AND e1= expression e2= expression ) | ^( OR e1= expression e2= expression ) | ^( LT e1= expression e2= expression ) | ^( LT_EQ e1= expression e2= expression ) | ^( GT e1= expression e2= expression ) | ^( GT_EQ e1= expression e2= expression ) | ^( EQ e1= expression e2= expression ) | ^( NEQ e1= expression e2= expression ) | ^( PLUS e1= expression e2= expression ) | ^( MINUS e1= expression e2= expression ) | ^( TIMES e1= expression e2= expression ) | ^( DIVIDE e1= expression e2= expression ) | ^( MOD e1= expression e2= expression ) | ^( UNARY_MINUS e1= expression ) | ^( UNARY_PLUS e1= expression ) | ^( NEGATE e1= expression ) );
	public final Node expression() throws RecognitionException {
		Node node = null;


		Node n =null;
		Node x =null;
		Node e1 =null;
		Node e2 =null;

		try {
			// antlr/NeptuneTree.g:94:2: (n= operand | ^( BECOMES x= variable_use e1= expression ) | ^( AND e1= expression e2= expression ) | ^( OR e1= expression e2= expression ) | ^( LT e1= expression e2= expression ) | ^( LT_EQ e1= expression e2= expression ) | ^( GT e1= expression e2= expression ) | ^( GT_EQ e1= expression e2= expression ) | ^( EQ e1= expression e2= expression ) | ^( NEQ e1= expression e2= expression ) | ^( PLUS e1= expression e2= expression ) | ^( MINUS e1= expression e2= expression ) | ^( TIMES e1= expression e2= expression ) | ^( DIVIDE e1= expression e2= expression ) | ^( MOD e1= expression e2= expression ) | ^( UNARY_MINUS e1= expression ) | ^( UNARY_PLUS e1= expression ) | ^( NEGATE e1= expression ) )
			int alt11=18;
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
				alt11=1;
				}
				break;
			case BECOMES:
				{
				alt11=2;
				}
				break;
			case AND:
				{
				alt11=3;
				}
				break;
			case OR:
				{
				alt11=4;
				}
				break;
			case LT:
				{
				alt11=5;
				}
				break;
			case LT_EQ:
				{
				alt11=6;
				}
				break;
			case GT:
				{
				alt11=7;
				}
				break;
			case GT_EQ:
				{
				alt11=8;
				}
				break;
			case EQ:
				{
				alt11=9;
				}
				break;
			case NEQ:
				{
				alt11=10;
				}
				break;
			case PLUS:
				{
				alt11=11;
				}
				break;
			case MINUS:
				{
				alt11=12;
				}
				break;
			case TIMES:
				{
				alt11=13;
				}
				break;
			case DIVIDE:
				{
				alt11=14;
				}
				break;
			case MOD:
				{
				alt11=15;
				}
				break;
			case UNARY_MINUS:
				{
				alt11=16;
				}
				break;
			case UNARY_PLUS:
				{
				alt11=17;
				}
				break;
			case NEGATE:
				{
				alt11=18;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}
			switch (alt11) {
				case 1 :
					// antlr/NeptuneTree.g:94:4: n= operand
					{
					pushFollow(FOLLOW_operand_in_expression667);
					n=operand();
					state._fsp--;

					 node = n; 
					}
					break;
				case 2 :
					// antlr/NeptuneTree.g:95:4: ^( BECOMES x= variable_use e1= expression )
					{
					match(input,BECOMES,FOLLOW_BECOMES_in_expression687); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_variable_use_in_expression691);
					x=variable_use();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression695);
					e1=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					 node = new BinaryAnyOperatorNode(Operator.BECOMES, x, e1); 
					}
					break;
				case 3 :
					// antlr/NeptuneTree.g:96:4: ^( AND e1= expression e2= expression )
					{
					match(input,AND,FOLLOW_AND_in_expression708); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression712);
					e1=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression716);
					e2=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					 node = new BinaryPrimitiveOperatorNode(Operator.AND, e1, e2); 
					}
					break;
				case 4 :
					// antlr/NeptuneTree.g:97:4: ^( OR e1= expression e2= expression )
					{
					match(input,OR,FOLLOW_OR_in_expression730); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression734);
					e1=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression738);
					e2=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					 node = new BinaryPrimitiveOperatorNode(Operator.OR, e1, e2); 
					}
					break;
				case 5 :
					// antlr/NeptuneTree.g:98:4: ^( LT e1= expression e2= expression )
					{
					match(input,LT,FOLLOW_LT_in_expression753); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression757);
					e1=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression761);
					e2=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					 node = new BinaryPrimitiveOperatorNode(Operator.LESS, e1, e2); 
					}
					break;
				case 6 :
					// antlr/NeptuneTree.g:99:4: ^( LT_EQ e1= expression e2= expression )
					{
					match(input,LT_EQ,FOLLOW_LT_EQ_in_expression776); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression780);
					e1=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression784);
					e2=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					 node = new BinaryPrimitiveOperatorNode(Operator.LESS_EQUAL, e1, e2); 
					}
					break;
				case 7 :
					// antlr/NeptuneTree.g:100:4: ^( GT e1= expression e2= expression )
					{
					match(input,GT,FOLLOW_GT_in_expression798); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression802);
					e1=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression806);
					e2=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					 node = new BinaryPrimitiveOperatorNode(Operator.GREATER, e1, e2); 
					}
					break;
				case 8 :
					// antlr/NeptuneTree.g:101:4: ^( GT_EQ e1= expression e2= expression )
					{
					match(input,GT_EQ,FOLLOW_GT_EQ_in_expression821); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression825);
					e1=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression829);
					e2=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					 node = new BinaryPrimitiveOperatorNode(Operator.GREATER_EQUAL, e1, e2); 
					}
					break;
				case 9 :
					// antlr/NeptuneTree.g:102:4: ^( EQ e1= expression e2= expression )
					{
					match(input,EQ,FOLLOW_EQ_in_expression843); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression847);
					e1=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression851);
					e2=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					 node = new BinaryAnyOperatorNode(Operator.EQUAL, e1, e2); 
					}
					break;
				case 10 :
					// antlr/NeptuneTree.g:103:4: ^( NEQ e1= expression e2= expression )
					{
					match(input,NEQ,FOLLOW_NEQ_in_expression866); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression870);
					e1=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression874);
					e2=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					 node = new BinaryAnyOperatorNode(Operator.NOT_EQUAL, e1, e2); 
					}
					break;
				case 11 :
					// antlr/NeptuneTree.g:104:4: ^( PLUS e1= expression e2= expression )
					{
					match(input,PLUS,FOLLOW_PLUS_in_expression888); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression892);
					e1=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression896);
					e2=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					 node = new BinaryPrimitiveOperatorNode(Operator.PLUS, e1, e2); 
					}
					break;
				case 12 :
					// antlr/NeptuneTree.g:105:4: ^( MINUS e1= expression e2= expression )
					{
					match(input,MINUS,FOLLOW_MINUS_in_expression910); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression914);
					e1=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression918);
					e2=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					 node = new BinaryPrimitiveOperatorNode(Operator.MINUS, e1, e2); 
					}
					break;
				case 13 :
					// antlr/NeptuneTree.g:106:4: ^( TIMES e1= expression e2= expression )
					{
					match(input,TIMES,FOLLOW_TIMES_in_expression932); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression936);
					e1=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression940);
					e2=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					 node = new BinaryPrimitiveOperatorNode(Operator.TIMES, e1, e2); 
					}
					break;
				case 14 :
					// antlr/NeptuneTree.g:107:4: ^( DIVIDE e1= expression e2= expression )
					{
					match(input,DIVIDE,FOLLOW_DIVIDE_in_expression954); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression958);
					e1=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression962);
					e2=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					 node = new BinaryPrimitiveOperatorNode(Operator.DIVIDE, e1, e2); 
					}
					break;
				case 15 :
					// antlr/NeptuneTree.g:108:4: ^( MOD e1= expression e2= expression )
					{
					match(input,MOD,FOLLOW_MOD_in_expression976); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression980);
					e1=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression984);
					e2=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					 node = new BinaryPrimitiveOperatorNode(Operator.MOD, e1, e2); 
					}
					break;
				case 16 :
					// antlr/NeptuneTree.g:109:4: ^( UNARY_MINUS e1= expression )
					{
					match(input,UNARY_MINUS,FOLLOW_UNARY_MINUS_in_expression998); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1002);
					e1=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					 node = new UnaryPrimitiveOperatorNode(Operator.UNARY_MINUS, e1); 
					}
					break;
				case 17 :
					// antlr/NeptuneTree.g:110:4: ^( UNARY_PLUS e1= expression )
					{
					match(input,UNARY_PLUS,FOLLOW_UNARY_PLUS_in_expression1018); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1022);
					e1=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					 node = new UnaryPrimitiveOperatorNode(Operator.UNARY_PLUS, e1); 
					}
					break;
				case 18 :
					// antlr/NeptuneTree.g:111:4: ^( NEGATE e1= expression )
					{
					match(input,NEGATE,FOLLOW_NEGATE_in_expression1038); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1042);
					e1=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					 node = new UnaryPrimitiveOperatorNode(Operator.UNARY_NEGATE, e1); 
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
	// $ANTLR end "expression"



	// $ANTLR start "operand"
	// antlr/NeptuneTree.g:114:1: operand returns [ Node node ] : ( ^( FUNCTION id= IDENTIFIER n= array_set ) |v= variable_expression |l= NUMBER |n= array_set |l= TRUE |l= FALSE |l= CHAR_LITERAL |l= STRING_LITERAL |n= codeblock |n= print_statement |n= read_statement | ^( SIZEOF id= IDENTIFIER ) );
	public final Node operand() throws RecognitionException {
		Node node = null;


		CommonTree id=null;
		CommonTree l=null;
		Node n =null;
		Node v =null;

		try {
			// antlr/NeptuneTree.g:115:2: ( ^( FUNCTION id= IDENTIFIER n= array_set ) |v= variable_expression |l= NUMBER |n= array_set |l= TRUE |l= FALSE |l= CHAR_LITERAL |l= STRING_LITERAL |n= codeblock |n= print_statement |n= read_statement | ^( SIZEOF id= IDENTIFIER ) )
			int alt12=12;
			switch ( input.LA(1) ) {
			case FUNCTION:
				{
				alt12=1;
				}
				break;
			case ARRAY_VAR:
			case ATOMIC_VAR:
				{
				alt12=2;
				}
				break;
			case NUMBER:
				{
				alt12=3;
				}
				break;
			case ARRAY_SET:
				{
				alt12=4;
				}
				break;
			case TRUE:
				{
				alt12=5;
				}
				break;
			case FALSE:
				{
				alt12=6;
				}
				break;
			case CHAR_LITERAL:
				{
				alt12=7;
				}
				break;
			case STRING_LITERAL:
				{
				alt12=8;
				}
				break;
			case BLOCK:
				{
				alt12=9;
				}
				break;
			case PRINT:
				{
				alt12=10;
				}
				break;
			case READ:
				{
				alt12=11;
				}
				break;
			case SIZEOF:
				{
				alt12=12;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}
			switch (alt12) {
				case 1 :
					// antlr/NeptuneTree.g:115:4: ^( FUNCTION id= IDENTIFIER n= array_set )
					{
					match(input,FUNCTION,FOLLOW_FUNCTION_in_operand1069); 
					match(input, Token.DOWN, null); 
					id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_operand1073); 
					pushFollow(FOLLOW_array_set_in_operand1077);
					n=array_set();
					state._fsp--;

					match(input, Token.UP, null); 

					 node = new FunctionCallNode((id!=null?id.getText():null), n); 
					}
					break;
				case 2 :
					// antlr/NeptuneTree.g:116:4: v= variable_expression
					{
					pushFollow(FOLLOW_variable_expression_in_operand1093);
					v=variable_expression();
					state._fsp--;

					 node = v; 
					}
					break;
				case 3 :
					// antlr/NeptuneTree.g:117:4: l= NUMBER
					{
					l=(CommonTree)match(input,NUMBER,FOLLOW_NUMBER_in_operand1111); 
					 node = new LiteralNode((l!=null?l.getText():null), Node.type.INTEGER); 
					}
					break;
				case 4 :
					// antlr/NeptuneTree.g:118:4: n= array_set
					{
					pushFollow(FOLLOW_array_set_in_operand1132);
					n=array_set();
					state._fsp--;

					 node = n; 
					}
					break;
				case 5 :
					// antlr/NeptuneTree.g:119:4: l= TRUE
					{
					l=(CommonTree)match(input,TRUE,FOLLOW_TRUE_in_operand1152); 
					 node = new LiteralNode((l!=null?l.getText():null), Node.type.BOOL); 
					}
					break;
				case 6 :
					// antlr/NeptuneTree.g:120:4: l= FALSE
					{
					l=(CommonTree)match(input,FALSE,FOLLOW_FALSE_in_operand1173); 
					 node = new LiteralNode((l!=null?l.getText():null), Node.type.BOOL); 
					}
					break;
				case 7 :
					// antlr/NeptuneTree.g:121:4: l= CHAR_LITERAL
					{
					l=(CommonTree)match(input,CHAR_LITERAL,FOLLOW_CHAR_LITERAL_in_operand1194); 
					 node = new LiteralNode((l!=null?l.getText():null), Node.type.CHAR); 
					}
					break;
				case 8 :
					// antlr/NeptuneTree.g:122:4: l= STRING_LITERAL
					{
					l=(CommonTree)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_operand1213); 
					 node = new LiteralNode((l!=null?l.getText():null), Node.type.CHAR); 
					}
					break;
				case 9 :
					// antlr/NeptuneTree.g:123:4: n= codeblock
					{
					pushFollow(FOLLOW_codeblock_in_operand1232);
					n=codeblock();
					state._fsp--;

					 node = n; 
					}
					break;
				case 10 :
					// antlr/NeptuneTree.g:124:4: n= print_statement
					{
					pushFollow(FOLLOW_print_statement_in_operand1252);
					n=print_statement();
					state._fsp--;

					 node = n; 
					}
					break;
				case 11 :
					// antlr/NeptuneTree.g:125:4: n= read_statement
					{
					pushFollow(FOLLOW_read_statement_in_operand1271);
					n=read_statement();
					state._fsp--;

					 node = n; 
					}
					break;
				case 12 :
					// antlr/NeptuneTree.g:126:4: ^( SIZEOF id= IDENTIFIER )
					{
					match(input,SIZEOF,FOLLOW_SIZEOF_in_operand1289); 
					match(input, Token.DOWN, null); 
					id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_operand1293); 
					match(input, Token.UP, null); 

					 node = new SizeOfNode((id!=null?id.getText():null)); 
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



	// $ANTLR start "array_set"
	// antlr/NeptuneTree.g:129:1: array_set returns [ Node node ] : ^( ARRAY_SET (ex= expression )+ ) ;
	public final Node array_set() throws RecognitionException {
		Node node = null;


		Node ex =null;

		try {
			// antlr/NeptuneTree.g:130:2: ( ^( ARRAY_SET (ex= expression )+ ) )
			// antlr/NeptuneTree.g:130:4: ^( ARRAY_SET (ex= expression )+ )
			{
			 List<Node> elements = new ArrayList<Node>(); 
			match(input,ARRAY_SET,FOLLOW_ARRAY_SET_in_array_set1326); 
			match(input, Token.DOWN, null); 
			// antlr/NeptuneTree.g:132:3: (ex= expression )+
			int cnt13=0;
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( (LA13_0==AND||(LA13_0 >= ARRAY_SET && LA13_0 <= BLOCK)||LA13_0==CHAR_LITERAL||LA13_0==DIVIDE||(LA13_0 >= EQ && LA13_0 <= FALSE)||(LA13_0 >= FUNCTION && LA13_0 <= GT_EQ)||(LA13_0 >= LT && LA13_0 <= PRINT)||LA13_0==READ||(LA13_0 >= SIZEOF && LA13_0 <= STRING_LITERAL)||(LA13_0 >= TIMES && LA13_0 <= UNARY_PLUS)) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// antlr/NeptuneTree.g:133:4: ex= expression
					{
					pushFollow(FOLLOW_expression_in_array_set1337);
					ex=expression();
					state._fsp--;

					 elements.add(ex); 
					}
					break;

				default :
					if ( cnt13 >= 1 ) break loop13;
					EarlyExitException eee = new EarlyExitException(13, input);
					throw eee;
				}
				cnt13++;
			}

			match(input, Token.UP, null); 

			 node = new ArraySetNode(elements); 
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
	// $ANTLR end "array_set"



	// $ANTLR start "variable_expression"
	// antlr/NeptuneTree.g:138:1: variable_expression returns [ Node node ] : ( ^( ATOMIC_VAR id= IDENTIFIER ) | ^( ARRAY_VAR id= IDENTIFIER ex= expression ) );
	public final Node variable_expression() throws RecognitionException {
		Node node = null;


		CommonTree id=null;
		Node ex =null;

		try {
			// antlr/NeptuneTree.g:139:2: ( ^( ATOMIC_VAR id= IDENTIFIER ) | ^( ARRAY_VAR id= IDENTIFIER ex= expression ) )
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0==ATOMIC_VAR) ) {
				alt14=1;
			}
			else if ( (LA14_0==ARRAY_VAR) ) {
				alt14=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				throw nvae;
			}

			switch (alt14) {
				case 1 :
					// antlr/NeptuneTree.g:139:4: ^( ATOMIC_VAR id= IDENTIFIER )
					{
					match(input,ATOMIC_VAR,FOLLOW_ATOMIC_VAR_in_variable_expression1386); 
					match(input, Token.DOWN, null); 
					id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_variable_expression1390); 
					match(input, Token.UP, null); 

					 node = new VarNode((id!=null?id.getText():null)); 
					}
					break;
				case 2 :
					// antlr/NeptuneTree.g:140:4: ^( ARRAY_VAR id= IDENTIFIER ex= expression )
					{
					match(input,ARRAY_VAR,FOLLOW_ARRAY_VAR_in_variable_expression1406); 
					match(input, Token.DOWN, null); 
					id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_variable_expression1410); 
					pushFollow(FOLLOW_expression_in_variable_expression1414);
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
	// antlr/NeptuneTree.g:143:1: variable_use returns [ Node node ] : ( ^( ATOMIC_VAR id= IDENTIFIER ) | ^( ARRAY_VAR id= IDENTIFIER ex= expression ) );
	public final Node variable_use() throws RecognitionException {
		Node node = null;


		CommonTree id=null;
		Node ex =null;

		try {
			// antlr/NeptuneTree.g:144:2: ( ^( ATOMIC_VAR id= IDENTIFIER ) | ^( ARRAY_VAR id= IDENTIFIER ex= expression ) )
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==ATOMIC_VAR) ) {
				alt15=1;
			}
			else if ( (LA15_0==ARRAY_VAR) ) {
				alt15=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				throw nvae;
			}

			switch (alt15) {
				case 1 :
					// antlr/NeptuneTree.g:144:4: ^( ATOMIC_VAR id= IDENTIFIER )
					{
					match(input,ATOMIC_VAR,FOLLOW_ATOMIC_VAR_in_variable_use1437); 
					match(input, Token.DOWN, null); 
					id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_variable_use1441); 
					match(input, Token.UP, null); 

					 node = new VarNode((id!=null?id.getText():null)); 
					}
					break;
				case 2 :
					// antlr/NeptuneTree.g:145:4: ^( ARRAY_VAR id= IDENTIFIER ex= expression )
					{
					match(input,ARRAY_VAR,FOLLOW_ARRAY_VAR_in_variable_use1457); 
					match(input, Token.DOWN, null); 
					id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_variable_use1461); 
					pushFollow(FOLLOW_expression_in_variable_use1465);
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
	// $ANTLR end "variable_use"



	// $ANTLR start "type"
	// antlr/NeptuneTree.g:148:1: type returns [ Node node ] : ( INTEGER (count= array_def )? | CHAR (count= array_def )? | BOOLEAN (count= array_def )? );
	public final Node type() throws RecognitionException {
		Node node = null;


		int count =0;

		try {
			// antlr/NeptuneTree.g:149:2: ( INTEGER (count= array_def )? | CHAR (count= array_def )? | BOOLEAN (count= array_def )? )
			int alt19=3;
			switch ( input.LA(1) ) {
			case INTEGER:
				{
				alt19=1;
				}
				break;
			case CHAR:
				{
				alt19=2;
				}
				break;
			case BOOLEAN:
				{
				alt19=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 19, 0, input);
				throw nvae;
			}
			switch (alt19) {
				case 1 :
					// antlr/NeptuneTree.g:149:4: INTEGER (count= array_def )?
					{
					match(input,INTEGER,FOLLOW_INTEGER_in_type1486); 
					// antlr/NeptuneTree.g:149:17: (count= array_def )?
					int alt16=2;
					int LA16_0 = input.LA(1);
					if ( (LA16_0==ARRAY_DEF) ) {
						alt16=1;
					}
					switch (alt16) {
						case 1 :
							// antlr/NeptuneTree.g:149:17: count= array_def
							{
							pushFollow(FOLLOW_array_def_in_type1490);
							count=array_def();
							state._fsp--;

							}
							break;

					}

					 node = new TypeNode(Node.type.INTEGER, count); 
					}
					break;
				case 2 :
					// antlr/NeptuneTree.g:150:4: CHAR (count= array_def )?
					{
					match(input,CHAR,FOLLOW_CHAR_in_type1499); 
					// antlr/NeptuneTree.g:150:14: (count= array_def )?
					int alt17=2;
					int LA17_0 = input.LA(1);
					if ( (LA17_0==ARRAY_DEF) ) {
						alt17=1;
					}
					switch (alt17) {
						case 1 :
							// antlr/NeptuneTree.g:150:14: count= array_def
							{
							pushFollow(FOLLOW_array_def_in_type1503);
							count=array_def();
							state._fsp--;

							}
							break;

					}

					 node = new TypeNode(Node.type.CHAR, count); 
					}
					break;
				case 3 :
					// antlr/NeptuneTree.g:151:4: BOOLEAN (count= array_def )?
					{
					match(input,BOOLEAN,FOLLOW_BOOLEAN_in_type1513); 
					// antlr/NeptuneTree.g:151:17: (count= array_def )?
					int alt18=2;
					int LA18_0 = input.LA(1);
					if ( (LA18_0==ARRAY_DEF) ) {
						alt18=1;
					}
					switch (alt18) {
						case 1 :
							// antlr/NeptuneTree.g:151:17: count= array_def
							{
							pushFollow(FOLLOW_array_def_in_type1517);
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
	// antlr/NeptuneTree.g:154:1: array_def returns [int count = 0] : ^( ARRAY_DEF x= NUMBER ) ;
	public final int array_def() throws RecognitionException {
		int count =  0;


		CommonTree x=null;

		try {
			// antlr/NeptuneTree.g:155:2: ( ^( ARRAY_DEF x= NUMBER ) )
			// antlr/NeptuneTree.g:155:4: ^( ARRAY_DEF x= NUMBER )
			{
			match(input,ARRAY_DEF,FOLLOW_ARRAY_DEF_in_array_def1537); 
			match(input, Token.DOWN, null); 
			x=(CommonTree)match(input,NUMBER,FOLLOW_NUMBER_in_array_def1541); 
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
	public static final BitSet FOLLOW_line_in_lines81 = new BitSet(new long[]{0xECC3FF017E0A27D2L,0x000000000000000DL});
	public static final BitSet FOLLOW_expression_in_line102 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declaration_in_line122 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_logic_statement_in_line142 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_return_statement_in_line161 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BLOCK_in_codeblock188 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_lines_in_codeblock192 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_WHILE_in_logic_statement221 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_logic_statement225 = new BitSet(new long[]{0xECC3FF017E0A27D0L,0x000000000000000DL});
	public static final BitSet FOLLOW_lines_in_logic_statement229 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FOREACH_in_logic_statement244 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_logic_statement248 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_logic_statement252 = new BitSet(new long[]{0xECC3FF017E0A27D0L,0x000000000000000DL});
	public static final BitSet FOLLOW_lines_in_logic_statement256 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_IF_in_logic_statement274 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_logic_statement278 = new BitSet(new long[]{0xECC3FF017E0A27D0L,0x000000000000000DL});
	public static final BitSet FOLLOW_lines_in_logic_statement282 = new BitSet(new long[]{0x0000000001800008L});
	public static final BitSet FOLLOW_ELSIF_in_logic_statement297 = new BitSet(new long[]{0xEC43FF00760827D0L,0x0000000000000001L});
	public static final BitSet FOLLOW_expression_in_logic_statement301 = new BitSet(new long[]{0xECC3FF017E0A27D0L,0x000000000000000DL});
	public static final BitSet FOLLOW_lines_in_logic_statement305 = new BitSet(new long[]{0x0000000001800008L});
	public static final BitSet FOLLOW_ELSE_in_logic_statement324 = new BitSet(new long[]{0xECC3FF017E0A27D0L,0x000000000000000DL});
	public static final BitSet FOLLOW_lines_in_logic_statement328 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PRINT_in_print_statement382 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_print_statement390 = new BitSet(new long[]{0xEC43FF00760827D8L,0x0000000000000001L});
	public static final BitSet FOLLOW_expression_in_print_statement400 = new BitSet(new long[]{0xEC43FF00760827D8L,0x0000000000000001L});
	public static final BitSet FOLLOW_READ_in_read_statement443 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_variable_expression_in_read_statement451 = new BitSet(new long[]{0x0000000000000188L});
	public static final BitSet FOLLOW_variable_expression_in_read_statement461 = new BitSet(new long[]{0x0000000000000188L});
	public static final BitSet FOLLOW_VAR_in_declaration500 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_type_in_declaration504 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_declaration508 = new BitSet(new long[]{0x0000000000000208L});
	public static final BitSet FOLLOW_BECOMES_in_declaration511 = new BitSet(new long[]{0xEC43FF00760827D0L,0x0000000000000001L});
	public static final BitSet FOLLOW_expression_in_declaration515 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_CONST_in_declaration527 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_type_in_declaration531 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_declaration535 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_BECOMES_in_declaration537 = new BitSet(new long[]{0xEC43FF00760827D0L,0x0000000000000001L});
	public static final BitSet FOLLOW_expression_in_declaration541 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNCTION_in_declaration557 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_type_in_declaration563 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_declaration569 = new BitSet(new long[]{0x0000000400001800L});
	public static final BitSet FOLLOW_type_in_declaration580 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_declaration584 = new BitSet(new long[]{0xECC3FF057E0A3FD0L,0x000000000000000DL});
	public static final BitSet FOLLOW_lines_in_declaration599 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_RETURN_in_return_statement635 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_return_statement639 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_operand_in_expression667 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BECOMES_in_expression687 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_variable_use_in_expression691 = new BitSet(new long[]{0xEC43FF00760827D0L,0x0000000000000001L});
	public static final BitSet FOLLOW_expression_in_expression695 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_AND_in_expression708 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression712 = new BitSet(new long[]{0xEC43FF00760827D0L,0x0000000000000001L});
	public static final BitSet FOLLOW_expression_in_expression716 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_OR_in_expression730 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression734 = new BitSet(new long[]{0xEC43FF00760827D0L,0x0000000000000001L});
	public static final BitSet FOLLOW_expression_in_expression738 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LT_in_expression753 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression757 = new BitSet(new long[]{0xEC43FF00760827D0L,0x0000000000000001L});
	public static final BitSet FOLLOW_expression_in_expression761 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LT_EQ_in_expression776 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression780 = new BitSet(new long[]{0xEC43FF00760827D0L,0x0000000000000001L});
	public static final BitSet FOLLOW_expression_in_expression784 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_GT_in_expression798 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression802 = new BitSet(new long[]{0xEC43FF00760827D0L,0x0000000000000001L});
	public static final BitSet FOLLOW_expression_in_expression806 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_GT_EQ_in_expression821 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression825 = new BitSet(new long[]{0xEC43FF00760827D0L,0x0000000000000001L});
	public static final BitSet FOLLOW_expression_in_expression829 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_EQ_in_expression843 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression847 = new BitSet(new long[]{0xEC43FF00760827D0L,0x0000000000000001L});
	public static final BitSet FOLLOW_expression_in_expression851 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NEQ_in_expression866 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression870 = new BitSet(new long[]{0xEC43FF00760827D0L,0x0000000000000001L});
	public static final BitSet FOLLOW_expression_in_expression874 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PLUS_in_expression888 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression892 = new BitSet(new long[]{0xEC43FF00760827D0L,0x0000000000000001L});
	public static final BitSet FOLLOW_expression_in_expression896 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MINUS_in_expression910 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression914 = new BitSet(new long[]{0xEC43FF00760827D0L,0x0000000000000001L});
	public static final BitSet FOLLOW_expression_in_expression918 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_TIMES_in_expression932 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression936 = new BitSet(new long[]{0xEC43FF00760827D0L,0x0000000000000001L});
	public static final BitSet FOLLOW_expression_in_expression940 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DIVIDE_in_expression954 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression958 = new BitSet(new long[]{0xEC43FF00760827D0L,0x0000000000000001L});
	public static final BitSet FOLLOW_expression_in_expression962 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MOD_in_expression976 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression980 = new BitSet(new long[]{0xEC43FF00760827D0L,0x0000000000000001L});
	public static final BitSet FOLLOW_expression_in_expression984 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_UNARY_MINUS_in_expression998 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1002 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_UNARY_PLUS_in_expression1018 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1022 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NEGATE_in_expression1038 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1042 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNCTION_in_operand1069 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_operand1073 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_array_set_in_operand1077 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_variable_expression_in_operand1093 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMBER_in_operand1111 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_array_set_in_operand1132 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TRUE_in_operand1152 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FALSE_in_operand1173 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_LITERAL_in_operand1194 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_operand1213 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_codeblock_in_operand1232 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_print_statement_in_operand1252 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_read_statement_in_operand1271 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SIZEOF_in_operand1289 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_operand1293 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ARRAY_SET_in_array_set1326 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_array_set1337 = new BitSet(new long[]{0xEC43FF00760827D8L,0x0000000000000001L});
	public static final BitSet FOLLOW_ATOMIC_VAR_in_variable_expression1386 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_variable_expression1390 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ARRAY_VAR_in_variable_expression1406 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_variable_expression1410 = new BitSet(new long[]{0xEC43FF00760827D0L,0x0000000000000001L});
	public static final BitSet FOLLOW_expression_in_variable_expression1414 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ATOMIC_VAR_in_variable_use1437 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_variable_use1441 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ARRAY_VAR_in_variable_use1457 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_variable_use1461 = new BitSet(new long[]{0xEC43FF00760827D0L,0x0000000000000001L});
	public static final BitSet FOLLOW_expression_in_variable_use1465 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_INTEGER_in_type1486 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_array_def_in_type1490 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_in_type1499 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_array_def_in_type1503 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOLEAN_in_type1513 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_array_def_in_type1517 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ARRAY_DEF_in_array_def1537 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_NUMBER_in_array_def1541 = new BitSet(new long[]{0x0000000000000008L});
}

// $ANTLR 3.5.2 Neptune.g 2014-05-30 16:36:01

package neptune;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class NeptuneParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ARRAY_SET", "BECOMES", "BOOLEAN", 
		"CHAR", "CHAR_LITERAL", "COLON", "COMMA", "COMMENT", "CONST", "DIGIT", 
		"DIVIDE", "DO", "DQUOTE", "ELSE", "ELSIF", "EQ", "FALSE", "FOREACH", "FUNCTION", 
		"GT", "GT_EQ", "IDENTIFIER", "IF", "IN", "INTEGER", "LBRACKET", "LCURLY", 
		"LETTER", "LOWER", "LPAREN", "LT", "LT_EQ", "MINUS", "NEQ", "NUMBER", 
		"PLUS", "PRINT", "PROGRAM", "QUOTE", "RBRACKET", "RCURLY", "READ", "RETURN", 
		"RPAREN", "SEMICOLON", "STRING_LITERAL", "THEN", "TIMES", "TRUE", "UPPER", 
		"VAR", "WHILE", "WS"
	};
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
	public static final int ELSE=17;
	public static final int ELSIF=18;
	public static final int EQ=19;
	public static final int FALSE=20;
	public static final int FOREACH=21;
	public static final int FUNCTION=22;
	public static final int GT=23;
	public static final int GT_EQ=24;
	public static final int IDENTIFIER=25;
	public static final int IF=26;
	public static final int IN=27;
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
	public static final int STRING_LITERAL=49;
	public static final int THEN=50;
	public static final int TIMES=51;
	public static final int TRUE=52;
	public static final int UPPER=53;
	public static final int VAR=54;
	public static final int WHILE=55;
	public static final int WS=56;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public NeptuneParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public NeptuneParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return NeptuneParser.tokenNames; }
	@Override public String getGrammarFileName() { return "Neptune.g"; }


	public static class program_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "program"
	// Neptune.g:77:1: program : lines EOF -> ^( PROGRAM lines ) ;
	public final NeptuneParser.program_return program() throws RecognitionException {
		NeptuneParser.program_return retval = new NeptuneParser.program_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token EOF2=null;
		ParserRuleReturnScope lines1 =null;

		Object EOF2_tree=null;
		RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
		RewriteRuleSubtreeStream stream_lines=new RewriteRuleSubtreeStream(adaptor,"rule lines");

		try {
			// Neptune.g:78:5: ( lines EOF -> ^( PROGRAM lines ) )
			// Neptune.g:78:9: lines EOF
			{
			pushFollow(FOLLOW_lines_in_program1000);
			lines1=lines();
			state._fsp--;

			stream_lines.add(lines1.getTree());
			EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_program1002);  
			stream_EOF.add(EOF2);

			// AST REWRITE
			// elements: lines
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 79:13: -> ^( PROGRAM lines )
			{
				// Neptune.g:79:17: ^( PROGRAM lines )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PROGRAM, "PROGRAM"), root_1);
				adaptor.addChild(root_1, stream_lines.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "program"


	public static class lines_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "lines"
	// Neptune.g:82:1: lines : ( line )+ ;
	public final NeptuneParser.lines_return lines() throws RecognitionException {
		NeptuneParser.lines_return retval = new NeptuneParser.lines_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope line3 =null;


		try {
			// Neptune.g:83:2: ( ( line )+ )
			// Neptune.g:83:4: ( line )+
			{
			root_0 = (Object)adaptor.nil();


			// Neptune.g:83:4: ( line )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==CHAR_LITERAL||LA1_0==CONST||(LA1_0 >= FALSE && LA1_0 <= FOREACH)||(LA1_0 >= IDENTIFIER && LA1_0 <= IF)||LA1_0==LCURLY||LA1_0==LPAREN||LA1_0==NUMBER||LA1_0==PRINT||LA1_0==READ||LA1_0==STRING_LITERAL||LA1_0==TRUE||(LA1_0 >= VAR && LA1_0 <= WHILE)) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// Neptune.g:83:4: line
					{
					pushFollow(FOLLOW_line_in_lines1037);
					line3=line();
					state._fsp--;

					adaptor.addChild(root_0, line3.getTree());

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

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "lines"


	public static class line_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "line"
	// Neptune.g:86:1: line : ( expression SEMICOLON !| declaration SEMICOLON !| logic_statement );
	public final NeptuneParser.line_return line() throws RecognitionException {
		NeptuneParser.line_return retval = new NeptuneParser.line_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token SEMICOLON5=null;
		Token SEMICOLON7=null;
		ParserRuleReturnScope expression4 =null;
		ParserRuleReturnScope declaration6 =null;
		ParserRuleReturnScope logic_statement8 =null;

		Object SEMICOLON5_tree=null;
		Object SEMICOLON7_tree=null;

		try {
			// Neptune.g:87:2: ( expression SEMICOLON !| declaration SEMICOLON !| logic_statement )
			int alt2=3;
			switch ( input.LA(1) ) {
			case CHAR_LITERAL:
			case FALSE:
			case IDENTIFIER:
			case LCURLY:
			case LPAREN:
			case NUMBER:
			case PRINT:
			case READ:
			case STRING_LITERAL:
			case TRUE:
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
					// Neptune.g:87:4: expression SEMICOLON !
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_expression_in_line1050);
					expression4=expression();
					state._fsp--;

					adaptor.addChild(root_0, expression4.getTree());

					SEMICOLON5=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_line1052); 
					}
					break;
				case 2 :
					// Neptune.g:88:4: declaration SEMICOLON !
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_declaration_in_line1058);
					declaration6=declaration();
					state._fsp--;

					adaptor.addChild(root_0, declaration6.getTree());

					SEMICOLON7=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_line1060); 
					}
					break;
				case 3 :
					// Neptune.g:89:4: logic_statement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_logic_statement_in_line1066);
					logic_statement8=logic_statement();
					state._fsp--;

					adaptor.addChild(root_0, logic_statement8.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "line"


	public static class logic_statement_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "logic_statement"
	// Neptune.g:92:1: logic_statement : ( while_statement | foreach_statement | if_statement );
	public final NeptuneParser.logic_statement_return logic_statement() throws RecognitionException {
		NeptuneParser.logic_statement_return retval = new NeptuneParser.logic_statement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope while_statement9 =null;
		ParserRuleReturnScope foreach_statement10 =null;
		ParserRuleReturnScope if_statement11 =null;


		try {
			// Neptune.g:93:2: ( while_statement | foreach_statement | if_statement )
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
					// Neptune.g:93:4: while_statement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_while_statement_in_logic_statement1078);
					while_statement9=while_statement();
					state._fsp--;

					adaptor.addChild(root_0, while_statement9.getTree());

					}
					break;
				case 2 :
					// Neptune.g:94:4: foreach_statement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_foreach_statement_in_logic_statement1083);
					foreach_statement10=foreach_statement();
					state._fsp--;

					adaptor.addChild(root_0, foreach_statement10.getTree());

					}
					break;
				case 3 :
					// Neptune.g:95:4: if_statement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_if_statement_in_logic_statement1088);
					if_statement11=if_statement();
					state._fsp--;

					adaptor.addChild(root_0, if_statement11.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "logic_statement"


	public static class while_statement_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "while_statement"
	// Neptune.g:98:1: while_statement : WHILE ^ LPAREN ! expression RPAREN ! LCURLY ! lines RCURLY !;
	public final NeptuneParser.while_statement_return while_statement() throws RecognitionException {
		NeptuneParser.while_statement_return retval = new NeptuneParser.while_statement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token WHILE12=null;
		Token LPAREN13=null;
		Token RPAREN15=null;
		Token LCURLY16=null;
		Token RCURLY18=null;
		ParserRuleReturnScope expression14 =null;
		ParserRuleReturnScope lines17 =null;

		Object WHILE12_tree=null;
		Object LPAREN13_tree=null;
		Object RPAREN15_tree=null;
		Object LCURLY16_tree=null;
		Object RCURLY18_tree=null;

		try {
			// Neptune.g:99:2: ( WHILE ^ LPAREN ! expression RPAREN ! LCURLY ! lines RCURLY !)
			// Neptune.g:99:4: WHILE ^ LPAREN ! expression RPAREN ! LCURLY ! lines RCURLY !
			{
			root_0 = (Object)adaptor.nil();


			WHILE12=(Token)match(input,WHILE,FOLLOW_WHILE_in_while_statement1100); 
			WHILE12_tree = (Object)adaptor.create(WHILE12);
			root_0 = (Object)adaptor.becomeRoot(WHILE12_tree, root_0);

			LPAREN13=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_while_statement1103); 
			pushFollow(FOLLOW_expression_in_while_statement1106);
			expression14=expression();
			state._fsp--;

			adaptor.addChild(root_0, expression14.getTree());

			RPAREN15=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_while_statement1108); 
			LCURLY16=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_while_statement1111); 
			pushFollow(FOLLOW_lines_in_while_statement1114);
			lines17=lines();
			state._fsp--;

			adaptor.addChild(root_0, lines17.getTree());

			RCURLY18=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_while_statement1116); 
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "while_statement"


	public static class foreach_statement_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "foreach_statement"
	// Neptune.g:102:1: foreach_statement : FOREACH ^ LPAREN ! IDENTIFIER IN ! IDENTIFIER RPAREN ! LCURLY ! lines RCURLY !;
	public final NeptuneParser.foreach_statement_return foreach_statement() throws RecognitionException {
		NeptuneParser.foreach_statement_return retval = new NeptuneParser.foreach_statement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token FOREACH19=null;
		Token LPAREN20=null;
		Token IDENTIFIER21=null;
		Token IN22=null;
		Token IDENTIFIER23=null;
		Token RPAREN24=null;
		Token LCURLY25=null;
		Token RCURLY27=null;
		ParserRuleReturnScope lines26 =null;

		Object FOREACH19_tree=null;
		Object LPAREN20_tree=null;
		Object IDENTIFIER21_tree=null;
		Object IN22_tree=null;
		Object IDENTIFIER23_tree=null;
		Object RPAREN24_tree=null;
		Object LCURLY25_tree=null;
		Object RCURLY27_tree=null;

		try {
			// Neptune.g:103:2: ( FOREACH ^ LPAREN ! IDENTIFIER IN ! IDENTIFIER RPAREN ! LCURLY ! lines RCURLY !)
			// Neptune.g:103:4: FOREACH ^ LPAREN ! IDENTIFIER IN ! IDENTIFIER RPAREN ! LCURLY ! lines RCURLY !
			{
			root_0 = (Object)adaptor.nil();


			FOREACH19=(Token)match(input,FOREACH,FOLLOW_FOREACH_in_foreach_statement1129); 
			FOREACH19_tree = (Object)adaptor.create(FOREACH19);
			root_0 = (Object)adaptor.becomeRoot(FOREACH19_tree, root_0);

			LPAREN20=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_foreach_statement1132); 
			IDENTIFIER21=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_foreach_statement1135); 
			IDENTIFIER21_tree = (Object)adaptor.create(IDENTIFIER21);
			adaptor.addChild(root_0, IDENTIFIER21_tree);

			IN22=(Token)match(input,IN,FOLLOW_IN_in_foreach_statement1137); 
			IDENTIFIER23=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_foreach_statement1140); 
			IDENTIFIER23_tree = (Object)adaptor.create(IDENTIFIER23);
			adaptor.addChild(root_0, IDENTIFIER23_tree);

			RPAREN24=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_foreach_statement1142); 
			LCURLY25=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_foreach_statement1145); 
			pushFollow(FOLLOW_lines_in_foreach_statement1148);
			lines26=lines();
			state._fsp--;

			adaptor.addChild(root_0, lines26.getTree());

			RCURLY27=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_foreach_statement1150); 
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "foreach_statement"


	public static class if_statement_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "if_statement"
	// Neptune.g:106:1: if_statement : IF ^ LPAREN ! expression RPAREN ! LCURLY ! lines RCURLY ! ( ELSIF LPAREN ! expression RPAREN ! LCURLY ! lines RCURLY !)* ( ELSE LCURLY ! lines RCURLY !)? ;
	public final NeptuneParser.if_statement_return if_statement() throws RecognitionException {
		NeptuneParser.if_statement_return retval = new NeptuneParser.if_statement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IF28=null;
		Token LPAREN29=null;
		Token RPAREN31=null;
		Token LCURLY32=null;
		Token RCURLY34=null;
		Token ELSIF35=null;
		Token LPAREN36=null;
		Token RPAREN38=null;
		Token LCURLY39=null;
		Token RCURLY41=null;
		Token ELSE42=null;
		Token LCURLY43=null;
		Token RCURLY45=null;
		ParserRuleReturnScope expression30 =null;
		ParserRuleReturnScope lines33 =null;
		ParserRuleReturnScope expression37 =null;
		ParserRuleReturnScope lines40 =null;
		ParserRuleReturnScope lines44 =null;

		Object IF28_tree=null;
		Object LPAREN29_tree=null;
		Object RPAREN31_tree=null;
		Object LCURLY32_tree=null;
		Object RCURLY34_tree=null;
		Object ELSIF35_tree=null;
		Object LPAREN36_tree=null;
		Object RPAREN38_tree=null;
		Object LCURLY39_tree=null;
		Object RCURLY41_tree=null;
		Object ELSE42_tree=null;
		Object LCURLY43_tree=null;
		Object RCURLY45_tree=null;

		try {
			// Neptune.g:107:2: ( IF ^ LPAREN ! expression RPAREN ! LCURLY ! lines RCURLY ! ( ELSIF LPAREN ! expression RPAREN ! LCURLY ! lines RCURLY !)* ( ELSE LCURLY ! lines RCURLY !)? )
			// Neptune.g:107:4: IF ^ LPAREN ! expression RPAREN ! LCURLY ! lines RCURLY ! ( ELSIF LPAREN ! expression RPAREN ! LCURLY ! lines RCURLY !)* ( ELSE LCURLY ! lines RCURLY !)?
			{
			root_0 = (Object)adaptor.nil();


			IF28=(Token)match(input,IF,FOLLOW_IF_in_if_statement1163); 
			IF28_tree = (Object)adaptor.create(IF28);
			root_0 = (Object)adaptor.becomeRoot(IF28_tree, root_0);

			LPAREN29=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_if_statement1166); 
			pushFollow(FOLLOW_expression_in_if_statement1169);
			expression30=expression();
			state._fsp--;

			adaptor.addChild(root_0, expression30.getTree());

			RPAREN31=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_if_statement1171); 
			LCURLY32=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_if_statement1174); 
			pushFollow(FOLLOW_lines_in_if_statement1177);
			lines33=lines();
			state._fsp--;

			adaptor.addChild(root_0, lines33.getTree());

			RCURLY34=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_if_statement1179); 
			// Neptune.g:108:3: ( ELSIF LPAREN ! expression RPAREN ! LCURLY ! lines RCURLY !)*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==ELSIF) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// Neptune.g:108:4: ELSIF LPAREN ! expression RPAREN ! LCURLY ! lines RCURLY !
					{
					ELSIF35=(Token)match(input,ELSIF,FOLLOW_ELSIF_in_if_statement1185); 
					ELSIF35_tree = (Object)adaptor.create(ELSIF35);
					adaptor.addChild(root_0, ELSIF35_tree);

					LPAREN36=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_if_statement1187); 
					pushFollow(FOLLOW_expression_in_if_statement1190);
					expression37=expression();
					state._fsp--;

					adaptor.addChild(root_0, expression37.getTree());

					RPAREN38=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_if_statement1192); 
					LCURLY39=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_if_statement1195); 
					pushFollow(FOLLOW_lines_in_if_statement1198);
					lines40=lines();
					state._fsp--;

					adaptor.addChild(root_0, lines40.getTree());

					RCURLY41=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_if_statement1200); 
					}
					break;

				default :
					break loop4;
				}
			}

			// Neptune.g:109:3: ( ELSE LCURLY ! lines RCURLY !)?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==ELSE) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// Neptune.g:109:4: ELSE LCURLY ! lines RCURLY !
					{
					ELSE42=(Token)match(input,ELSE,FOLLOW_ELSE_in_if_statement1208); 
					ELSE42_tree = (Object)adaptor.create(ELSE42);
					adaptor.addChild(root_0, ELSE42_tree);

					LCURLY43=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_if_statement1210); 
					pushFollow(FOLLOW_lines_in_if_statement1213);
					lines44=lines();
					state._fsp--;

					adaptor.addChild(root_0, lines44.getTree());

					RCURLY45=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_if_statement1215); 
					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "if_statement"


	public static class print_statement_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "print_statement"
	// Neptune.g:112:1: print_statement : PRINT ^ LPAREN ! expression ( COMMA expression )* RPAREN !;
	public final NeptuneParser.print_statement_return print_statement() throws RecognitionException {
		NeptuneParser.print_statement_return retval = new NeptuneParser.print_statement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token PRINT46=null;
		Token LPAREN47=null;
		Token COMMA49=null;
		Token RPAREN51=null;
		ParserRuleReturnScope expression48 =null;
		ParserRuleReturnScope expression50 =null;

		Object PRINT46_tree=null;
		Object LPAREN47_tree=null;
		Object COMMA49_tree=null;
		Object RPAREN51_tree=null;

		try {
			// Neptune.g:113:2: ( PRINT ^ LPAREN ! expression ( COMMA expression )* RPAREN !)
			// Neptune.g:113:4: PRINT ^ LPAREN ! expression ( COMMA expression )* RPAREN !
			{
			root_0 = (Object)adaptor.nil();


			PRINT46=(Token)match(input,PRINT,FOLLOW_PRINT_in_print_statement1230); 
			PRINT46_tree = (Object)adaptor.create(PRINT46);
			root_0 = (Object)adaptor.becomeRoot(PRINT46_tree, root_0);

			LPAREN47=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_print_statement1233); 
			pushFollow(FOLLOW_expression_in_print_statement1236);
			expression48=expression();
			state._fsp--;

			adaptor.addChild(root_0, expression48.getTree());

			// Neptune.g:113:30: ( COMMA expression )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==COMMA) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// Neptune.g:113:31: COMMA expression
					{
					COMMA49=(Token)match(input,COMMA,FOLLOW_COMMA_in_print_statement1239); 
					COMMA49_tree = (Object)adaptor.create(COMMA49);
					adaptor.addChild(root_0, COMMA49_tree);

					pushFollow(FOLLOW_expression_in_print_statement1241);
					expression50=expression();
					state._fsp--;

					adaptor.addChild(root_0, expression50.getTree());

					}
					break;

				default :
					break loop6;
				}
			}

			RPAREN51=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_print_statement1245); 
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "print_statement"


	public static class read_statement_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "read_statement"
	// Neptune.g:116:1: read_statement : READ ^ LPAREN ! expression ( COMMA expression )* RPAREN !;
	public final NeptuneParser.read_statement_return read_statement() throws RecognitionException {
		NeptuneParser.read_statement_return retval = new NeptuneParser.read_statement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token READ52=null;
		Token LPAREN53=null;
		Token COMMA55=null;
		Token RPAREN57=null;
		ParserRuleReturnScope expression54 =null;
		ParserRuleReturnScope expression56 =null;

		Object READ52_tree=null;
		Object LPAREN53_tree=null;
		Object COMMA55_tree=null;
		Object RPAREN57_tree=null;

		try {
			// Neptune.g:117:2: ( READ ^ LPAREN ! expression ( COMMA expression )* RPAREN !)
			// Neptune.g:117:4: READ ^ LPAREN ! expression ( COMMA expression )* RPAREN !
			{
			root_0 = (Object)adaptor.nil();


			READ52=(Token)match(input,READ,FOLLOW_READ_in_read_statement1258); 
			READ52_tree = (Object)adaptor.create(READ52);
			root_0 = (Object)adaptor.becomeRoot(READ52_tree, root_0);

			LPAREN53=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_read_statement1261); 
			pushFollow(FOLLOW_expression_in_read_statement1264);
			expression54=expression();
			state._fsp--;

			adaptor.addChild(root_0, expression54.getTree());

			// Neptune.g:117:29: ( COMMA expression )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==COMMA) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// Neptune.g:117:30: COMMA expression
					{
					COMMA55=(Token)match(input,COMMA,FOLLOW_COMMA_in_read_statement1267); 
					COMMA55_tree = (Object)adaptor.create(COMMA55);
					adaptor.addChild(root_0, COMMA55_tree);

					pushFollow(FOLLOW_expression_in_read_statement1269);
					expression56=expression();
					state._fsp--;

					adaptor.addChild(root_0, expression56.getTree());

					}
					break;

				default :
					break loop7;
				}
			}

			RPAREN57=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_read_statement1273); 
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "read_statement"


	public static class declaration_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "declaration"
	// Neptune.g:120:1: declaration : ( VAR ^ type IDENTIFIER ( BECOMES expression )? | CONST ^ type IDENTIFIER BECOMES expression );
	public final NeptuneParser.declaration_return declaration() throws RecognitionException {
		NeptuneParser.declaration_return retval = new NeptuneParser.declaration_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token VAR58=null;
		Token IDENTIFIER60=null;
		Token BECOMES61=null;
		Token CONST63=null;
		Token IDENTIFIER65=null;
		Token BECOMES66=null;
		ParserRuleReturnScope type59 =null;
		ParserRuleReturnScope expression62 =null;
		ParserRuleReturnScope type64 =null;
		ParserRuleReturnScope expression67 =null;

		Object VAR58_tree=null;
		Object IDENTIFIER60_tree=null;
		Object BECOMES61_tree=null;
		Object CONST63_tree=null;
		Object IDENTIFIER65_tree=null;
		Object BECOMES66_tree=null;

		try {
			// Neptune.g:121:2: ( VAR ^ type IDENTIFIER ( BECOMES expression )? | CONST ^ type IDENTIFIER BECOMES expression )
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
					// Neptune.g:121:4: VAR ^ type IDENTIFIER ( BECOMES expression )?
					{
					root_0 = (Object)adaptor.nil();


					VAR58=(Token)match(input,VAR,FOLLOW_VAR_in_declaration1286); 
					VAR58_tree = (Object)adaptor.create(VAR58);
					root_0 = (Object)adaptor.becomeRoot(VAR58_tree, root_0);

					pushFollow(FOLLOW_type_in_declaration1289);
					type59=type();
					state._fsp--;

					adaptor.addChild(root_0, type59.getTree());

					IDENTIFIER60=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_declaration1291); 
					IDENTIFIER60_tree = (Object)adaptor.create(IDENTIFIER60);
					adaptor.addChild(root_0, IDENTIFIER60_tree);

					// Neptune.g:121:25: ( BECOMES expression )?
					int alt8=2;
					int LA8_0 = input.LA(1);
					if ( (LA8_0==BECOMES) ) {
						alt8=1;
					}
					switch (alt8) {
						case 1 :
							// Neptune.g:121:26: BECOMES expression
							{
							BECOMES61=(Token)match(input,BECOMES,FOLLOW_BECOMES_in_declaration1294); 
							BECOMES61_tree = (Object)adaptor.create(BECOMES61);
							adaptor.addChild(root_0, BECOMES61_tree);

							pushFollow(FOLLOW_expression_in_declaration1296);
							expression62=expression();
							state._fsp--;

							adaptor.addChild(root_0, expression62.getTree());

							}
							break;

					}

					}
					break;
				case 2 :
					// Neptune.g:122:4: CONST ^ type IDENTIFIER BECOMES expression
					{
					root_0 = (Object)adaptor.nil();


					CONST63=(Token)match(input,CONST,FOLLOW_CONST_in_declaration1303); 
					CONST63_tree = (Object)adaptor.create(CONST63);
					root_0 = (Object)adaptor.becomeRoot(CONST63_tree, root_0);

					pushFollow(FOLLOW_type_in_declaration1306);
					type64=type();
					state._fsp--;

					adaptor.addChild(root_0, type64.getTree());

					IDENTIFIER65=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_declaration1308); 
					IDENTIFIER65_tree = (Object)adaptor.create(IDENTIFIER65);
					adaptor.addChild(root_0, IDENTIFIER65_tree);

					BECOMES66=(Token)match(input,BECOMES,FOLLOW_BECOMES_in_declaration1310); 
					BECOMES66_tree = (Object)adaptor.create(BECOMES66);
					adaptor.addChild(root_0, BECOMES66_tree);

					pushFollow(FOLLOW_expression_in_declaration1312);
					expression67=expression();
					state._fsp--;

					adaptor.addChild(root_0, expression67.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "declaration"


	public static class expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expression"
	// Neptune.g:125:1: expression : assignment_expr ;
	public final NeptuneParser.expression_return expression() throws RecognitionException {
		NeptuneParser.expression_return retval = new NeptuneParser.expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope assignment_expr68 =null;


		try {
			// Neptune.g:126:2: ( assignment_expr )
			// Neptune.g:126:4: assignment_expr
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_assignment_expr_in_expression1324);
			assignment_expr68=assignment_expr();
			state._fsp--;

			adaptor.addChild(root_0, assignment_expr68.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expression"


	public static class assignment_expr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "assignment_expr"
	// Neptune.g:129:1: assignment_expr : boolean_expr ( BECOMES ^ assignment_expr )? ;
	public final NeptuneParser.assignment_expr_return assignment_expr() throws RecognitionException {
		NeptuneParser.assignment_expr_return retval = new NeptuneParser.assignment_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token BECOMES70=null;
		ParserRuleReturnScope boolean_expr69 =null;
		ParserRuleReturnScope assignment_expr71 =null;

		Object BECOMES70_tree=null;

		try {
			// Neptune.g:130:2: ( boolean_expr ( BECOMES ^ assignment_expr )? )
			// Neptune.g:130:4: boolean_expr ( BECOMES ^ assignment_expr )?
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_boolean_expr_in_assignment_expr1335);
			boolean_expr69=boolean_expr();
			state._fsp--;

			adaptor.addChild(root_0, boolean_expr69.getTree());

			// Neptune.g:130:17: ( BECOMES ^ assignment_expr )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==BECOMES) ) {
				alt10=1;
			}
			switch (alt10) {
				case 1 :
					// Neptune.g:130:18: BECOMES ^ assignment_expr
					{
					BECOMES70=(Token)match(input,BECOMES,FOLLOW_BECOMES_in_assignment_expr1338); 
					BECOMES70_tree = (Object)adaptor.create(BECOMES70);
					root_0 = (Object)adaptor.becomeRoot(BECOMES70_tree, root_0);

					pushFollow(FOLLOW_assignment_expr_in_assignment_expr1341);
					assignment_expr71=assignment_expr();
					state._fsp--;

					adaptor.addChild(root_0, assignment_expr71.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "assignment_expr"


	public static class boolean_expr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "boolean_expr"
	// Neptune.g:133:1: boolean_expr : plus_expr ( ( LT ^| LT_EQ ^| GT ^| GT_EQ ^| EQ ^| NEQ ^) plus_expr )* ;
	public final NeptuneParser.boolean_expr_return boolean_expr() throws RecognitionException {
		NeptuneParser.boolean_expr_return retval = new NeptuneParser.boolean_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token LT73=null;
		Token LT_EQ74=null;
		Token GT75=null;
		Token GT_EQ76=null;
		Token EQ77=null;
		Token NEQ78=null;
		ParserRuleReturnScope plus_expr72 =null;
		ParserRuleReturnScope plus_expr79 =null;

		Object LT73_tree=null;
		Object LT_EQ74_tree=null;
		Object GT75_tree=null;
		Object GT_EQ76_tree=null;
		Object EQ77_tree=null;
		Object NEQ78_tree=null;

		try {
			// Neptune.g:134:2: ( plus_expr ( ( LT ^| LT_EQ ^| GT ^| GT_EQ ^| EQ ^| NEQ ^) plus_expr )* )
			// Neptune.g:134:4: plus_expr ( ( LT ^| LT_EQ ^| GT ^| GT_EQ ^| EQ ^| NEQ ^) plus_expr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_plus_expr_in_boolean_expr1355);
			plus_expr72=plus_expr();
			state._fsp--;

			adaptor.addChild(root_0, plus_expr72.getTree());

			// Neptune.g:134:14: ( ( LT ^| LT_EQ ^| GT ^| GT_EQ ^| EQ ^| NEQ ^) plus_expr )*
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( (LA12_0==EQ||(LA12_0 >= GT && LA12_0 <= GT_EQ)||(LA12_0 >= LT && LA12_0 <= LT_EQ)||LA12_0==NEQ) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// Neptune.g:134:15: ( LT ^| LT_EQ ^| GT ^| GT_EQ ^| EQ ^| NEQ ^) plus_expr
					{
					// Neptune.g:134:15: ( LT ^| LT_EQ ^| GT ^| GT_EQ ^| EQ ^| NEQ ^)
					int alt11=6;
					switch ( input.LA(1) ) {
					case LT:
						{
						alt11=1;
						}
						break;
					case LT_EQ:
						{
						alt11=2;
						}
						break;
					case GT:
						{
						alt11=3;
						}
						break;
					case GT_EQ:
						{
						alt11=4;
						}
						break;
					case EQ:
						{
						alt11=5;
						}
						break;
					case NEQ:
						{
						alt11=6;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 11, 0, input);
						throw nvae;
					}
					switch (alt11) {
						case 1 :
							// Neptune.g:134:16: LT ^
							{
							LT73=(Token)match(input,LT,FOLLOW_LT_in_boolean_expr1359); 
							LT73_tree = (Object)adaptor.create(LT73);
							root_0 = (Object)adaptor.becomeRoot(LT73_tree, root_0);

							}
							break;
						case 2 :
							// Neptune.g:134:22: LT_EQ ^
							{
							LT_EQ74=(Token)match(input,LT_EQ,FOLLOW_LT_EQ_in_boolean_expr1364); 
							LT_EQ74_tree = (Object)adaptor.create(LT_EQ74);
							root_0 = (Object)adaptor.becomeRoot(LT_EQ74_tree, root_0);

							}
							break;
						case 3 :
							// Neptune.g:134:31: GT ^
							{
							GT75=(Token)match(input,GT,FOLLOW_GT_in_boolean_expr1369); 
							GT75_tree = (Object)adaptor.create(GT75);
							root_0 = (Object)adaptor.becomeRoot(GT75_tree, root_0);

							}
							break;
						case 4 :
							// Neptune.g:134:37: GT_EQ ^
							{
							GT_EQ76=(Token)match(input,GT_EQ,FOLLOW_GT_EQ_in_boolean_expr1374); 
							GT_EQ76_tree = (Object)adaptor.create(GT_EQ76);
							root_0 = (Object)adaptor.becomeRoot(GT_EQ76_tree, root_0);

							}
							break;
						case 5 :
							// Neptune.g:134:46: EQ ^
							{
							EQ77=(Token)match(input,EQ,FOLLOW_EQ_in_boolean_expr1379); 
							EQ77_tree = (Object)adaptor.create(EQ77);
							root_0 = (Object)adaptor.becomeRoot(EQ77_tree, root_0);

							}
							break;
						case 6 :
							// Neptune.g:134:52: NEQ ^
							{
							NEQ78=(Token)match(input,NEQ,FOLLOW_NEQ_in_boolean_expr1384); 
							NEQ78_tree = (Object)adaptor.create(NEQ78);
							root_0 = (Object)adaptor.becomeRoot(NEQ78_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_plus_expr_in_boolean_expr1388);
					plus_expr79=plus_expr();
					state._fsp--;

					adaptor.addChild(root_0, plus_expr79.getTree());

					}
					break;

				default :
					break loop12;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "boolean_expr"


	public static class plus_expr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "plus_expr"
	// Neptune.g:137:1: plus_expr : multi_expr ( ( PLUS ^| MINUS ^) multi_expr )* ;
	public final NeptuneParser.plus_expr_return plus_expr() throws RecognitionException {
		NeptuneParser.plus_expr_return retval = new NeptuneParser.plus_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token PLUS81=null;
		Token MINUS82=null;
		ParserRuleReturnScope multi_expr80 =null;
		ParserRuleReturnScope multi_expr83 =null;

		Object PLUS81_tree=null;
		Object MINUS82_tree=null;

		try {
			// Neptune.g:138:2: ( multi_expr ( ( PLUS ^| MINUS ^) multi_expr )* )
			// Neptune.g:138:4: multi_expr ( ( PLUS ^| MINUS ^) multi_expr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_multi_expr_in_plus_expr1401);
			multi_expr80=multi_expr();
			state._fsp--;

			adaptor.addChild(root_0, multi_expr80.getTree());

			// Neptune.g:138:15: ( ( PLUS ^| MINUS ^) multi_expr )*
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( (LA14_0==MINUS||LA14_0==PLUS) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// Neptune.g:138:16: ( PLUS ^| MINUS ^) multi_expr
					{
					// Neptune.g:138:16: ( PLUS ^| MINUS ^)
					int alt13=2;
					int LA13_0 = input.LA(1);
					if ( (LA13_0==PLUS) ) {
						alt13=1;
					}
					else if ( (LA13_0==MINUS) ) {
						alt13=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 13, 0, input);
						throw nvae;
					}

					switch (alt13) {
						case 1 :
							// Neptune.g:138:17: PLUS ^
							{
							PLUS81=(Token)match(input,PLUS,FOLLOW_PLUS_in_plus_expr1405); 
							PLUS81_tree = (Object)adaptor.create(PLUS81);
							root_0 = (Object)adaptor.becomeRoot(PLUS81_tree, root_0);

							}
							break;
						case 2 :
							// Neptune.g:138:25: MINUS ^
							{
							MINUS82=(Token)match(input,MINUS,FOLLOW_MINUS_in_plus_expr1410); 
							MINUS82_tree = (Object)adaptor.create(MINUS82);
							root_0 = (Object)adaptor.becomeRoot(MINUS82_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_multi_expr_in_plus_expr1414);
					multi_expr83=multi_expr();
					state._fsp--;

					adaptor.addChild(root_0, multi_expr83.getTree());

					}
					break;

				default :
					break loop14;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "plus_expr"


	public static class multi_expr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "multi_expr"
	// Neptune.g:141:1: multi_expr : operand ( ( TIMES ^| DIVIDE ^) operand )* ;
	public final NeptuneParser.multi_expr_return multi_expr() throws RecognitionException {
		NeptuneParser.multi_expr_return retval = new NeptuneParser.multi_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token TIMES85=null;
		Token DIVIDE86=null;
		ParserRuleReturnScope operand84 =null;
		ParserRuleReturnScope operand87 =null;

		Object TIMES85_tree=null;
		Object DIVIDE86_tree=null;

		try {
			// Neptune.g:142:2: ( operand ( ( TIMES ^| DIVIDE ^) operand )* )
			// Neptune.g:142:4: operand ( ( TIMES ^| DIVIDE ^) operand )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_operand_in_multi_expr1427);
			operand84=operand();
			state._fsp--;

			adaptor.addChild(root_0, operand84.getTree());

			// Neptune.g:142:12: ( ( TIMES ^| DIVIDE ^) operand )*
			loop16:
			while (true) {
				int alt16=2;
				int LA16_0 = input.LA(1);
				if ( (LA16_0==DIVIDE||LA16_0==TIMES) ) {
					alt16=1;
				}

				switch (alt16) {
				case 1 :
					// Neptune.g:142:13: ( TIMES ^| DIVIDE ^) operand
					{
					// Neptune.g:142:13: ( TIMES ^| DIVIDE ^)
					int alt15=2;
					int LA15_0 = input.LA(1);
					if ( (LA15_0==TIMES) ) {
						alt15=1;
					}
					else if ( (LA15_0==DIVIDE) ) {
						alt15=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 15, 0, input);
						throw nvae;
					}

					switch (alt15) {
						case 1 :
							// Neptune.g:142:14: TIMES ^
							{
							TIMES85=(Token)match(input,TIMES,FOLLOW_TIMES_in_multi_expr1431); 
							TIMES85_tree = (Object)adaptor.create(TIMES85);
							root_0 = (Object)adaptor.becomeRoot(TIMES85_tree, root_0);

							}
							break;
						case 2 :
							// Neptune.g:142:23: DIVIDE ^
							{
							DIVIDE86=(Token)match(input,DIVIDE,FOLLOW_DIVIDE_in_multi_expr1436); 
							DIVIDE86_tree = (Object)adaptor.create(DIVIDE86);
							root_0 = (Object)adaptor.becomeRoot(DIVIDE86_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_operand_in_multi_expr1440);
					operand87=operand();
					state._fsp--;

					adaptor.addChild(root_0, operand87.getTree());

					}
					break;

				default :
					break loop16;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "multi_expr"


	public static class operand_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "operand"
	// Neptune.g:145:1: operand : ( IDENTIFIER | NUMBER | LPAREN ! assignment_expr RPAREN !| LCURLY expression ( COMMA expression )* RCURLY -> ^( ARRAY_SET ( expression )+ ) | print_statement | read_statement | ( TRUE | FALSE ) | CHAR_LITERAL | STRING_LITERAL );
	public final NeptuneParser.operand_return operand() throws RecognitionException {
		NeptuneParser.operand_return retval = new NeptuneParser.operand_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IDENTIFIER88=null;
		Token NUMBER89=null;
		Token LPAREN90=null;
		Token RPAREN92=null;
		Token LCURLY93=null;
		Token COMMA95=null;
		Token RCURLY97=null;
		Token set100=null;
		Token CHAR_LITERAL101=null;
		Token STRING_LITERAL102=null;
		ParserRuleReturnScope assignment_expr91 =null;
		ParserRuleReturnScope expression94 =null;
		ParserRuleReturnScope expression96 =null;
		ParserRuleReturnScope print_statement98 =null;
		ParserRuleReturnScope read_statement99 =null;

		Object IDENTIFIER88_tree=null;
		Object NUMBER89_tree=null;
		Object LPAREN90_tree=null;
		Object RPAREN92_tree=null;
		Object LCURLY93_tree=null;
		Object COMMA95_tree=null;
		Object RCURLY97_tree=null;
		Object set100_tree=null;
		Object CHAR_LITERAL101_tree=null;
		Object STRING_LITERAL102_tree=null;
		RewriteRuleTokenStream stream_LCURLY=new RewriteRuleTokenStream(adaptor,"token LCURLY");
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_RCURLY=new RewriteRuleTokenStream(adaptor,"token RCURLY");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try {
			// Neptune.g:146:5: ( IDENTIFIER | NUMBER | LPAREN ! assignment_expr RPAREN !| LCURLY expression ( COMMA expression )* RCURLY -> ^( ARRAY_SET ( expression )+ ) | print_statement | read_statement | ( TRUE | FALSE ) | CHAR_LITERAL | STRING_LITERAL )
			int alt18=9;
			switch ( input.LA(1) ) {
			case IDENTIFIER:
				{
				alt18=1;
				}
				break;
			case NUMBER:
				{
				alt18=2;
				}
				break;
			case LPAREN:
				{
				alt18=3;
				}
				break;
			case LCURLY:
				{
				alt18=4;
				}
				break;
			case PRINT:
				{
				alt18=5;
				}
				break;
			case READ:
				{
				alt18=6;
				}
				break;
			case FALSE:
			case TRUE:
				{
				alt18=7;
				}
				break;
			case CHAR_LITERAL:
				{
				alt18=8;
				}
				break;
			case STRING_LITERAL:
				{
				alt18=9;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 18, 0, input);
				throw nvae;
			}
			switch (alt18) {
				case 1 :
					// Neptune.g:146:9: IDENTIFIER
					{
					root_0 = (Object)adaptor.nil();


					IDENTIFIER88=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_operand1458); 
					IDENTIFIER88_tree = (Object)adaptor.create(IDENTIFIER88);
					adaptor.addChild(root_0, IDENTIFIER88_tree);

					}
					break;
				case 2 :
					// Neptune.g:147:9: NUMBER
					{
					root_0 = (Object)adaptor.nil();


					NUMBER89=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_operand1468); 
					NUMBER89_tree = (Object)adaptor.create(NUMBER89);
					adaptor.addChild(root_0, NUMBER89_tree);

					}
					break;
				case 3 :
					// Neptune.g:148:9: LPAREN ! assignment_expr RPAREN !
					{
					root_0 = (Object)adaptor.nil();


					LPAREN90=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_operand1478); 
					pushFollow(FOLLOW_assignment_expr_in_operand1481);
					assignment_expr91=assignment_expr();
					state._fsp--;

					adaptor.addChild(root_0, assignment_expr91.getTree());

					RPAREN92=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_operand1483); 
					}
					break;
				case 4 :
					// Neptune.g:149:4: LCURLY expression ( COMMA expression )* RCURLY
					{
					LCURLY93=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_operand1489);  
					stream_LCURLY.add(LCURLY93);

					pushFollow(FOLLOW_expression_in_operand1491);
					expression94=expression();
					state._fsp--;

					stream_expression.add(expression94.getTree());
					// Neptune.g:149:22: ( COMMA expression )*
					loop17:
					while (true) {
						int alt17=2;
						int LA17_0 = input.LA(1);
						if ( (LA17_0==COMMA) ) {
							alt17=1;
						}

						switch (alt17) {
						case 1 :
							// Neptune.g:149:23: COMMA expression
							{
							COMMA95=(Token)match(input,COMMA,FOLLOW_COMMA_in_operand1494);  
							stream_COMMA.add(COMMA95);

							pushFollow(FOLLOW_expression_in_operand1496);
							expression96=expression();
							state._fsp--;

							stream_expression.add(expression96.getTree());
							}
							break;

						default :
							break loop17;
						}
					}

					RCURLY97=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_operand1500);  
					stream_RCURLY.add(RCURLY97);

					// AST REWRITE
					// elements: expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 150:3: -> ^( ARRAY_SET ( expression )+ )
					{
						// Neptune.g:150:6: ^( ARRAY_SET ( expression )+ )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARRAY_SET, "ARRAY_SET"), root_1);
						if ( !(stream_expression.hasNext()) ) {
							throw new RewriteEarlyExitException();
						}
						while ( stream_expression.hasNext() ) {
							adaptor.addChild(root_1, stream_expression.nextTree());
						}
						stream_expression.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 5 :
					// Neptune.g:151:4: print_statement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_print_statement_in_operand1516);
					print_statement98=print_statement();
					state._fsp--;

					adaptor.addChild(root_0, print_statement98.getTree());

					}
					break;
				case 6 :
					// Neptune.g:152:4: read_statement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_read_statement_in_operand1521);
					read_statement99=read_statement();
					state._fsp--;

					adaptor.addChild(root_0, read_statement99.getTree());

					}
					break;
				case 7 :
					// Neptune.g:153:4: ( TRUE | FALSE )
					{
					root_0 = (Object)adaptor.nil();


					set100=input.LT(1);
					if ( input.LA(1)==FALSE||input.LA(1)==TRUE ) {
						input.consume();
						adaptor.addChild(root_0, (Object)adaptor.create(set100));
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					}
					break;
				case 8 :
					// Neptune.g:154:4: CHAR_LITERAL
					{
					root_0 = (Object)adaptor.nil();


					CHAR_LITERAL101=(Token)match(input,CHAR_LITERAL,FOLLOW_CHAR_LITERAL_in_operand1537); 
					CHAR_LITERAL101_tree = (Object)adaptor.create(CHAR_LITERAL101);
					adaptor.addChild(root_0, CHAR_LITERAL101_tree);

					}
					break;
				case 9 :
					// Neptune.g:155:4: STRING_LITERAL
					{
					root_0 = (Object)adaptor.nil();


					STRING_LITERAL102=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_operand1542); 
					STRING_LITERAL102_tree = (Object)adaptor.create(STRING_LITERAL102);
					adaptor.addChild(root_0, STRING_LITERAL102_tree);

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "operand"


	public static class type_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "type"
	// Neptune.g:158:1: type : ( INTEGER ( array_def )? | CHAR ( array_def )? | BOOLEAN ( array_def )? );
	public final NeptuneParser.type_return type() throws RecognitionException {
		NeptuneParser.type_return retval = new NeptuneParser.type_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token INTEGER103=null;
		Token CHAR105=null;
		Token BOOLEAN107=null;
		ParserRuleReturnScope array_def104 =null;
		ParserRuleReturnScope array_def106 =null;
		ParserRuleReturnScope array_def108 =null;

		Object INTEGER103_tree=null;
		Object CHAR105_tree=null;
		Object BOOLEAN107_tree=null;

		try {
			// Neptune.g:159:2: ( INTEGER ( array_def )? | CHAR ( array_def )? | BOOLEAN ( array_def )? )
			int alt22=3;
			switch ( input.LA(1) ) {
			case INTEGER:
				{
				alt22=1;
				}
				break;
			case CHAR:
				{
				alt22=2;
				}
				break;
			case BOOLEAN:
				{
				alt22=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 22, 0, input);
				throw nvae;
			}
			switch (alt22) {
				case 1 :
					// Neptune.g:159:4: INTEGER ( array_def )?
					{
					root_0 = (Object)adaptor.nil();


					INTEGER103=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_type1556); 
					INTEGER103_tree = (Object)adaptor.create(INTEGER103);
					adaptor.addChild(root_0, INTEGER103_tree);

					// Neptune.g:159:12: ( array_def )?
					int alt19=2;
					int LA19_0 = input.LA(1);
					if ( (LA19_0==LBRACKET) ) {
						alt19=1;
					}
					switch (alt19) {
						case 1 :
							// Neptune.g:159:12: array_def
							{
							pushFollow(FOLLOW_array_def_in_type1558);
							array_def104=array_def();
							state._fsp--;

							adaptor.addChild(root_0, array_def104.getTree());

							}
							break;

					}

					}
					break;
				case 2 :
					// Neptune.g:160:4: CHAR ( array_def )?
					{
					root_0 = (Object)adaptor.nil();


					CHAR105=(Token)match(input,CHAR,FOLLOW_CHAR_in_type1564); 
					CHAR105_tree = (Object)adaptor.create(CHAR105);
					adaptor.addChild(root_0, CHAR105_tree);

					// Neptune.g:160:9: ( array_def )?
					int alt20=2;
					int LA20_0 = input.LA(1);
					if ( (LA20_0==LBRACKET) ) {
						alt20=1;
					}
					switch (alt20) {
						case 1 :
							// Neptune.g:160:9: array_def
							{
							pushFollow(FOLLOW_array_def_in_type1566);
							array_def106=array_def();
							state._fsp--;

							adaptor.addChild(root_0, array_def106.getTree());

							}
							break;

					}

					}
					break;
				case 3 :
					// Neptune.g:161:4: BOOLEAN ( array_def )?
					{
					root_0 = (Object)adaptor.nil();


					BOOLEAN107=(Token)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_type1572); 
					BOOLEAN107_tree = (Object)adaptor.create(BOOLEAN107);
					adaptor.addChild(root_0, BOOLEAN107_tree);

					// Neptune.g:161:12: ( array_def )?
					int alt21=2;
					int LA21_0 = input.LA(1);
					if ( (LA21_0==LBRACKET) ) {
						alt21=1;
					}
					switch (alt21) {
						case 1 :
							// Neptune.g:161:12: array_def
							{
							pushFollow(FOLLOW_array_def_in_type1574);
							array_def108=array_def();
							state._fsp--;

							adaptor.addChild(root_0, array_def108.getTree());

							}
							break;

					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "type"


	public static class array_def_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "array_def"
	// Neptune.g:164:1: array_def : LBRACKET ( NUMBER )? RBRACKET ;
	public final NeptuneParser.array_def_return array_def() throws RecognitionException {
		NeptuneParser.array_def_return retval = new NeptuneParser.array_def_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token LBRACKET109=null;
		Token NUMBER110=null;
		Token RBRACKET111=null;

		Object LBRACKET109_tree=null;
		Object NUMBER110_tree=null;
		Object RBRACKET111_tree=null;

		try {
			// Neptune.g:165:2: ( LBRACKET ( NUMBER )? RBRACKET )
			// Neptune.g:165:5: LBRACKET ( NUMBER )? RBRACKET
			{
			root_0 = (Object)adaptor.nil();


			LBRACKET109=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_array_def1588); 
			LBRACKET109_tree = (Object)adaptor.create(LBRACKET109);
			adaptor.addChild(root_0, LBRACKET109_tree);

			// Neptune.g:165:14: ( NUMBER )?
			int alt23=2;
			int LA23_0 = input.LA(1);
			if ( (LA23_0==NUMBER) ) {
				alt23=1;
			}
			switch (alt23) {
				case 1 :
					// Neptune.g:165:14: NUMBER
					{
					NUMBER110=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_array_def1590); 
					NUMBER110_tree = (Object)adaptor.create(NUMBER110);
					adaptor.addChild(root_0, NUMBER110_tree);

					}
					break;

			}

			RBRACKET111=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_array_def1593); 
			RBRACKET111_tree = (Object)adaptor.create(RBRACKET111);
			adaptor.addChild(root_0, RBRACKET111_tree);

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "array_def"

	// Delegated rules



	public static final BitSet FOLLOW_lines_in_program1000 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_program1002 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_line_in_lines1037 = new BitSet(new long[]{0x00D2214246301102L});
	public static final BitSet FOLLOW_expression_in_line1050 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_line1052 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declaration_in_line1058 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_line1060 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_logic_statement_in_line1066 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_while_statement_in_logic_statement1078 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_foreach_statement_in_logic_statement1083 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_if_statement_in_logic_statement1088 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHILE_in_while_statement1100 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_LPAREN_in_while_statement1103 = new BitSet(new long[]{0x0012214242100100L});
	public static final BitSet FOLLOW_expression_in_while_statement1106 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_RPAREN_in_while_statement1108 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_LCURLY_in_while_statement1111 = new BitSet(new long[]{0x00D2214246301100L});
	public static final BitSet FOLLOW_lines_in_while_statement1114 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_RCURLY_in_while_statement1116 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FOREACH_in_foreach_statement1129 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_LPAREN_in_foreach_statement1132 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_foreach_statement1135 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_IN_in_foreach_statement1137 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_foreach_statement1140 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_RPAREN_in_foreach_statement1142 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_LCURLY_in_foreach_statement1145 = new BitSet(new long[]{0x00D2214246301100L});
	public static final BitSet FOLLOW_lines_in_foreach_statement1148 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_RCURLY_in_foreach_statement1150 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_if_statement1163 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_LPAREN_in_if_statement1166 = new BitSet(new long[]{0x0012214242100100L});
	public static final BitSet FOLLOW_expression_in_if_statement1169 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_RPAREN_in_if_statement1171 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_LCURLY_in_if_statement1174 = new BitSet(new long[]{0x00D2214246301100L});
	public static final BitSet FOLLOW_lines_in_if_statement1177 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_RCURLY_in_if_statement1179 = new BitSet(new long[]{0x0000000000060002L});
	public static final BitSet FOLLOW_ELSIF_in_if_statement1185 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_LPAREN_in_if_statement1187 = new BitSet(new long[]{0x0012214242100100L});
	public static final BitSet FOLLOW_expression_in_if_statement1190 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_RPAREN_in_if_statement1192 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_LCURLY_in_if_statement1195 = new BitSet(new long[]{0x00D2214246301100L});
	public static final BitSet FOLLOW_lines_in_if_statement1198 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_RCURLY_in_if_statement1200 = new BitSet(new long[]{0x0000000000060002L});
	public static final BitSet FOLLOW_ELSE_in_if_statement1208 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_LCURLY_in_if_statement1210 = new BitSet(new long[]{0x00D2214246301100L});
	public static final BitSet FOLLOW_lines_in_if_statement1213 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_RCURLY_in_if_statement1215 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRINT_in_print_statement1230 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_LPAREN_in_print_statement1233 = new BitSet(new long[]{0x0012214242100100L});
	public static final BitSet FOLLOW_expression_in_print_statement1236 = new BitSet(new long[]{0x0000800000000400L});
	public static final BitSet FOLLOW_COMMA_in_print_statement1239 = new BitSet(new long[]{0x0012214242100100L});
	public static final BitSet FOLLOW_expression_in_print_statement1241 = new BitSet(new long[]{0x0000800000000400L});
	public static final BitSet FOLLOW_RPAREN_in_print_statement1245 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_READ_in_read_statement1258 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_LPAREN_in_read_statement1261 = new BitSet(new long[]{0x0012214242100100L});
	public static final BitSet FOLLOW_expression_in_read_statement1264 = new BitSet(new long[]{0x0000800000000400L});
	public static final BitSet FOLLOW_COMMA_in_read_statement1267 = new BitSet(new long[]{0x0012214242100100L});
	public static final BitSet FOLLOW_expression_in_read_statement1269 = new BitSet(new long[]{0x0000800000000400L});
	public static final BitSet FOLLOW_RPAREN_in_read_statement1273 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_declaration1286 = new BitSet(new long[]{0x00000000100000C0L});
	public static final BitSet FOLLOW_type_in_declaration1289 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_declaration1291 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_BECOMES_in_declaration1294 = new BitSet(new long[]{0x0012214242100100L});
	public static final BitSet FOLLOW_expression_in_declaration1296 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CONST_in_declaration1303 = new BitSet(new long[]{0x00000000100000C0L});
	public static final BitSet FOLLOW_type_in_declaration1306 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_declaration1308 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_BECOMES_in_declaration1310 = new BitSet(new long[]{0x0012214242100100L});
	public static final BitSet FOLLOW_expression_in_declaration1312 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignment_expr_in_expression1324 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_boolean_expr_in_assignment_expr1335 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_BECOMES_in_assignment_expr1338 = new BitSet(new long[]{0x0012214242100100L});
	public static final BitSet FOLLOW_assignment_expr_in_assignment_expr1341 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_plus_expr_in_boolean_expr1355 = new BitSet(new long[]{0x0000002C01880002L});
	public static final BitSet FOLLOW_LT_in_boolean_expr1359 = new BitSet(new long[]{0x0012214242100100L});
	public static final BitSet FOLLOW_LT_EQ_in_boolean_expr1364 = new BitSet(new long[]{0x0012214242100100L});
	public static final BitSet FOLLOW_GT_in_boolean_expr1369 = new BitSet(new long[]{0x0012214242100100L});
	public static final BitSet FOLLOW_GT_EQ_in_boolean_expr1374 = new BitSet(new long[]{0x0012214242100100L});
	public static final BitSet FOLLOW_EQ_in_boolean_expr1379 = new BitSet(new long[]{0x0012214242100100L});
	public static final BitSet FOLLOW_NEQ_in_boolean_expr1384 = new BitSet(new long[]{0x0012214242100100L});
	public static final BitSet FOLLOW_plus_expr_in_boolean_expr1388 = new BitSet(new long[]{0x0000002C01880002L});
	public static final BitSet FOLLOW_multi_expr_in_plus_expr1401 = new BitSet(new long[]{0x0000009000000002L});
	public static final BitSet FOLLOW_PLUS_in_plus_expr1405 = new BitSet(new long[]{0x0012214242100100L});
	public static final BitSet FOLLOW_MINUS_in_plus_expr1410 = new BitSet(new long[]{0x0012214242100100L});
	public static final BitSet FOLLOW_multi_expr_in_plus_expr1414 = new BitSet(new long[]{0x0000009000000002L});
	public static final BitSet FOLLOW_operand_in_multi_expr1427 = new BitSet(new long[]{0x0008000000004002L});
	public static final BitSet FOLLOW_TIMES_in_multi_expr1431 = new BitSet(new long[]{0x0012214242100100L});
	public static final BitSet FOLLOW_DIVIDE_in_multi_expr1436 = new BitSet(new long[]{0x0012214242100100L});
	public static final BitSet FOLLOW_operand_in_multi_expr1440 = new BitSet(new long[]{0x0008000000004002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_operand1458 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMBER_in_operand1468 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_operand1478 = new BitSet(new long[]{0x0012214242100100L});
	public static final BitSet FOLLOW_assignment_expr_in_operand1481 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_RPAREN_in_operand1483 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LCURLY_in_operand1489 = new BitSet(new long[]{0x0012214242100100L});
	public static final BitSet FOLLOW_expression_in_operand1491 = new BitSet(new long[]{0x0000100000000400L});
	public static final BitSet FOLLOW_COMMA_in_operand1494 = new BitSet(new long[]{0x0012214242100100L});
	public static final BitSet FOLLOW_expression_in_operand1496 = new BitSet(new long[]{0x0000100000000400L});
	public static final BitSet FOLLOW_RCURLY_in_operand1500 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_print_statement_in_operand1516 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_read_statement_in_operand1521 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_operand1526 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_LITERAL_in_operand1537 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_operand1542 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTEGER_in_type1556 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_array_def_in_type1558 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_in_type1564 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_array_def_in_type1566 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOLEAN_in_type1572 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_array_def_in_type1574 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACKET_in_array_def1588 = new BitSet(new long[]{0x0000084000000000L});
	public static final BitSet FOLLOW_NUMBER_in_array_def1590 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_RBRACKET_in_array_def1593 = new BitSet(new long[]{0x0000000000000002L});
}

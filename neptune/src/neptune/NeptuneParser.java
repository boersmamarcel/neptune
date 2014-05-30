// $ANTLR 3.5.2 Neptune.g 2014-05-30 14:01:48

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
		"CHAR", "COLON", "COMMA", "COMMENT", "CONST", "DIGIT", "DIVIDE", "DO", 
		"DQUOTE", "ELSE", "ELSIF", "EQ", "FOREACH", "FUNCTION", "GT", "GT_EQ", 
		"IDENTIFIER", "IF", "IN", "INCLUDE", "INTEGER", "LBRACKET", "LCURLY", 
		"LETTER", "LOWER", "LPAREN", "LT", "LT_EQ", "MINUS", "NEQ", "NUMBER", 
		"PLUS", "PRINT", "PROGRAM", "RBRACKET", "RCURLY", "READ", "RETURN", "RPAREN", 
		"SEMICOLON", "THEN", "TIMES", "UPPER", "VAR", "WHILE", "WS", "'ello'"
	};
	public static final int EOF=-1;
	public static final int T__53=53;
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
	public static final int FOREACH=19;
	public static final int FUNCTION=20;
	public static final int GT=21;
	public static final int GT_EQ=22;
	public static final int IDENTIFIER=23;
	public static final int IF=24;
	public static final int IN=25;
	public static final int INCLUDE=26;
	public static final int INTEGER=27;
	public static final int LBRACKET=28;
	public static final int LCURLY=29;
	public static final int LETTER=30;
	public static final int LOWER=31;
	public static final int LPAREN=32;
	public static final int LT=33;
	public static final int LT_EQ=34;
	public static final int MINUS=35;
	public static final int NEQ=36;
	public static final int NUMBER=37;
	public static final int PLUS=38;
	public static final int PRINT=39;
	public static final int PROGRAM=40;
	public static final int RBRACKET=41;
	public static final int RCURLY=42;
	public static final int READ=43;
	public static final int RETURN=44;
	public static final int RPAREN=45;
	public static final int SEMICOLON=46;
	public static final int THEN=47;
	public static final int TIMES=48;
	public static final int UPPER=49;
	public static final int VAR=50;
	public static final int WHILE=51;
	public static final int WS=52;

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
	// Neptune.g:75:1: program : lines EOF -> ^( PROGRAM lines ) ;
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
			// Neptune.g:76:5: ( lines EOF -> ^( PROGRAM lines ) )
			// Neptune.g:76:9: lines EOF
			{
			pushFollow(FOLLOW_lines_in_program990);
			lines1=lines();
			state._fsp--;

			stream_lines.add(lines1.getTree());
			EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_program992);  
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
			// 77:13: -> ^( PROGRAM lines )
			{
				// Neptune.g:77:17: ^( PROGRAM lines )
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
	// Neptune.g:80:1: lines : ( line )+ ;
	public final NeptuneParser.lines_return lines() throws RecognitionException {
		NeptuneParser.lines_return retval = new NeptuneParser.lines_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope line3 =null;


		try {
			// Neptune.g:81:2: ( ( line )+ )
			// Neptune.g:81:4: ( line )+
			{
			root_0 = (Object)adaptor.nil();


			// Neptune.g:81:4: ( line )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==CONST||LA1_0==FOREACH||(LA1_0 >= IDENTIFIER && LA1_0 <= IF)||LA1_0==INCLUDE||LA1_0==LCURLY||LA1_0==LPAREN||LA1_0==NUMBER||LA1_0==PRINT||LA1_0==READ||(LA1_0 >= VAR && LA1_0 <= WHILE)) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// Neptune.g:81:4: line
					{
					pushFollow(FOLLOW_line_in_lines1027);
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
	// Neptune.g:84:1: line : ( expression SEMICOLON !| declaration SEMICOLON !| include_statement | logic_statement );
	public final NeptuneParser.line_return line() throws RecognitionException {
		NeptuneParser.line_return retval = new NeptuneParser.line_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token SEMICOLON5=null;
		Token SEMICOLON7=null;
		ParserRuleReturnScope expression4 =null;
		ParserRuleReturnScope declaration6 =null;
		ParserRuleReturnScope include_statement8 =null;
		ParserRuleReturnScope logic_statement9 =null;

		Object SEMICOLON5_tree=null;
		Object SEMICOLON7_tree=null;

		try {
			// Neptune.g:85:2: ( expression SEMICOLON !| declaration SEMICOLON !| include_statement | logic_statement )
			int alt2=4;
			switch ( input.LA(1) ) {
			case IDENTIFIER:
			case LCURLY:
			case LPAREN:
			case NUMBER:
			case PRINT:
			case READ:
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
			case INCLUDE:
				{
				alt2=3;
				}
				break;
			case FOREACH:
			case IF:
			case WHILE:
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
					// Neptune.g:85:4: expression SEMICOLON !
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_expression_in_line1040);
					expression4=expression();
					state._fsp--;

					adaptor.addChild(root_0, expression4.getTree());

					SEMICOLON5=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_line1042); 
					}
					break;
				case 2 :
					// Neptune.g:86:4: declaration SEMICOLON !
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_declaration_in_line1048);
					declaration6=declaration();
					state._fsp--;

					adaptor.addChild(root_0, declaration6.getTree());

					SEMICOLON7=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_line1050); 
					}
					break;
				case 3 :
					// Neptune.g:87:4: include_statement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_include_statement_in_line1056);
					include_statement8=include_statement();
					state._fsp--;

					adaptor.addChild(root_0, include_statement8.getTree());

					}
					break;
				case 4 :
					// Neptune.g:88:4: logic_statement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_logic_statement_in_line1061);
					logic_statement9=logic_statement();
					state._fsp--;

					adaptor.addChild(root_0, logic_statement9.getTree());

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
	// Neptune.g:91:1: logic_statement : ( while_statement | foreach_statement | if_statement );
	public final NeptuneParser.logic_statement_return logic_statement() throws RecognitionException {
		NeptuneParser.logic_statement_return retval = new NeptuneParser.logic_statement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope while_statement10 =null;
		ParserRuleReturnScope foreach_statement11 =null;
		ParserRuleReturnScope if_statement12 =null;


		try {
			// Neptune.g:92:2: ( while_statement | foreach_statement | if_statement )
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
					// Neptune.g:92:4: while_statement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_while_statement_in_logic_statement1073);
					while_statement10=while_statement();
					state._fsp--;

					adaptor.addChild(root_0, while_statement10.getTree());

					}
					break;
				case 2 :
					// Neptune.g:93:4: foreach_statement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_foreach_statement_in_logic_statement1078);
					foreach_statement11=foreach_statement();
					state._fsp--;

					adaptor.addChild(root_0, foreach_statement11.getTree());

					}
					break;
				case 3 :
					// Neptune.g:94:4: if_statement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_if_statement_in_logic_statement1083);
					if_statement12=if_statement();
					state._fsp--;

					adaptor.addChild(root_0, if_statement12.getTree());

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
	// Neptune.g:97:1: while_statement : WHILE ^ LPAREN ! expression RPAREN ! LCURLY ! lines RCURLY !;
	public final NeptuneParser.while_statement_return while_statement() throws RecognitionException {
		NeptuneParser.while_statement_return retval = new NeptuneParser.while_statement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token WHILE13=null;
		Token LPAREN14=null;
		Token RPAREN16=null;
		Token LCURLY17=null;
		Token RCURLY19=null;
		ParserRuleReturnScope expression15 =null;
		ParserRuleReturnScope lines18 =null;

		Object WHILE13_tree=null;
		Object LPAREN14_tree=null;
		Object RPAREN16_tree=null;
		Object LCURLY17_tree=null;
		Object RCURLY19_tree=null;

		try {
			// Neptune.g:98:2: ( WHILE ^ LPAREN ! expression RPAREN ! LCURLY ! lines RCURLY !)
			// Neptune.g:98:4: WHILE ^ LPAREN ! expression RPAREN ! LCURLY ! lines RCURLY !
			{
			root_0 = (Object)adaptor.nil();


			WHILE13=(Token)match(input,WHILE,FOLLOW_WHILE_in_while_statement1095); 
			WHILE13_tree = (Object)adaptor.create(WHILE13);
			root_0 = (Object)adaptor.becomeRoot(WHILE13_tree, root_0);

			LPAREN14=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_while_statement1098); 
			pushFollow(FOLLOW_expression_in_while_statement1101);
			expression15=expression();
			state._fsp--;

			adaptor.addChild(root_0, expression15.getTree());

			RPAREN16=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_while_statement1103); 
			LCURLY17=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_while_statement1106); 
			pushFollow(FOLLOW_lines_in_while_statement1109);
			lines18=lines();
			state._fsp--;

			adaptor.addChild(root_0, lines18.getTree());

			RCURLY19=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_while_statement1111); 
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
	// Neptune.g:101:1: foreach_statement : FOREACH ^ LPAREN ! IDENTIFIER IN ! IDENTIFIER RPAREN ! LCURLY ! lines RCURLY !;
	public final NeptuneParser.foreach_statement_return foreach_statement() throws RecognitionException {
		NeptuneParser.foreach_statement_return retval = new NeptuneParser.foreach_statement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token FOREACH20=null;
		Token LPAREN21=null;
		Token IDENTIFIER22=null;
		Token IN23=null;
		Token IDENTIFIER24=null;
		Token RPAREN25=null;
		Token LCURLY26=null;
		Token RCURLY28=null;
		ParserRuleReturnScope lines27 =null;

		Object FOREACH20_tree=null;
		Object LPAREN21_tree=null;
		Object IDENTIFIER22_tree=null;
		Object IN23_tree=null;
		Object IDENTIFIER24_tree=null;
		Object RPAREN25_tree=null;
		Object LCURLY26_tree=null;
		Object RCURLY28_tree=null;

		try {
			// Neptune.g:102:2: ( FOREACH ^ LPAREN ! IDENTIFIER IN ! IDENTIFIER RPAREN ! LCURLY ! lines RCURLY !)
			// Neptune.g:102:4: FOREACH ^ LPAREN ! IDENTIFIER IN ! IDENTIFIER RPAREN ! LCURLY ! lines RCURLY !
			{
			root_0 = (Object)adaptor.nil();


			FOREACH20=(Token)match(input,FOREACH,FOLLOW_FOREACH_in_foreach_statement1124); 
			FOREACH20_tree = (Object)adaptor.create(FOREACH20);
			root_0 = (Object)adaptor.becomeRoot(FOREACH20_tree, root_0);

			LPAREN21=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_foreach_statement1127); 
			IDENTIFIER22=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_foreach_statement1130); 
			IDENTIFIER22_tree = (Object)adaptor.create(IDENTIFIER22);
			adaptor.addChild(root_0, IDENTIFIER22_tree);

			IN23=(Token)match(input,IN,FOLLOW_IN_in_foreach_statement1132); 
			IDENTIFIER24=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_foreach_statement1135); 
			IDENTIFIER24_tree = (Object)adaptor.create(IDENTIFIER24);
			adaptor.addChild(root_0, IDENTIFIER24_tree);

			RPAREN25=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_foreach_statement1137); 
			LCURLY26=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_foreach_statement1140); 
			pushFollow(FOLLOW_lines_in_foreach_statement1143);
			lines27=lines();
			state._fsp--;

			adaptor.addChild(root_0, lines27.getTree());

			RCURLY28=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_foreach_statement1145); 
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
	// Neptune.g:105:1: if_statement : IF ^ LPAREN ! expression RPAREN ! LCURLY ! lines RCURLY ! ( ELSIF LPAREN ! expression RPAREN ! LCURLY ! lines RCURLY !)* ( ELSE LCURLY ! lines RCURLY !)? ;
	public final NeptuneParser.if_statement_return if_statement() throws RecognitionException {
		NeptuneParser.if_statement_return retval = new NeptuneParser.if_statement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IF29=null;
		Token LPAREN30=null;
		Token RPAREN32=null;
		Token LCURLY33=null;
		Token RCURLY35=null;
		Token ELSIF36=null;
		Token LPAREN37=null;
		Token RPAREN39=null;
		Token LCURLY40=null;
		Token RCURLY42=null;
		Token ELSE43=null;
		Token LCURLY44=null;
		Token RCURLY46=null;
		ParserRuleReturnScope expression31 =null;
		ParserRuleReturnScope lines34 =null;
		ParserRuleReturnScope expression38 =null;
		ParserRuleReturnScope lines41 =null;
		ParserRuleReturnScope lines45 =null;

		Object IF29_tree=null;
		Object LPAREN30_tree=null;
		Object RPAREN32_tree=null;
		Object LCURLY33_tree=null;
		Object RCURLY35_tree=null;
		Object ELSIF36_tree=null;
		Object LPAREN37_tree=null;
		Object RPAREN39_tree=null;
		Object LCURLY40_tree=null;
		Object RCURLY42_tree=null;
		Object ELSE43_tree=null;
		Object LCURLY44_tree=null;
		Object RCURLY46_tree=null;

		try {
			// Neptune.g:106:2: ( IF ^ LPAREN ! expression RPAREN ! LCURLY ! lines RCURLY ! ( ELSIF LPAREN ! expression RPAREN ! LCURLY ! lines RCURLY !)* ( ELSE LCURLY ! lines RCURLY !)? )
			// Neptune.g:106:4: IF ^ LPAREN ! expression RPAREN ! LCURLY ! lines RCURLY ! ( ELSIF LPAREN ! expression RPAREN ! LCURLY ! lines RCURLY !)* ( ELSE LCURLY ! lines RCURLY !)?
			{
			root_0 = (Object)adaptor.nil();


			IF29=(Token)match(input,IF,FOLLOW_IF_in_if_statement1158); 
			IF29_tree = (Object)adaptor.create(IF29);
			root_0 = (Object)adaptor.becomeRoot(IF29_tree, root_0);

			LPAREN30=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_if_statement1161); 
			pushFollow(FOLLOW_expression_in_if_statement1164);
			expression31=expression();
			state._fsp--;

			adaptor.addChild(root_0, expression31.getTree());

			RPAREN32=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_if_statement1166); 
			LCURLY33=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_if_statement1169); 
			pushFollow(FOLLOW_lines_in_if_statement1172);
			lines34=lines();
			state._fsp--;

			adaptor.addChild(root_0, lines34.getTree());

			RCURLY35=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_if_statement1174); 
			// Neptune.g:107:3: ( ELSIF LPAREN ! expression RPAREN ! LCURLY ! lines RCURLY !)*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==ELSIF) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// Neptune.g:107:4: ELSIF LPAREN ! expression RPAREN ! LCURLY ! lines RCURLY !
					{
					ELSIF36=(Token)match(input,ELSIF,FOLLOW_ELSIF_in_if_statement1180); 
					ELSIF36_tree = (Object)adaptor.create(ELSIF36);
					adaptor.addChild(root_0, ELSIF36_tree);

					LPAREN37=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_if_statement1182); 
					pushFollow(FOLLOW_expression_in_if_statement1185);
					expression38=expression();
					state._fsp--;

					adaptor.addChild(root_0, expression38.getTree());

					RPAREN39=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_if_statement1187); 
					LCURLY40=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_if_statement1190); 
					pushFollow(FOLLOW_lines_in_if_statement1193);
					lines41=lines();
					state._fsp--;

					adaptor.addChild(root_0, lines41.getTree());

					RCURLY42=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_if_statement1195); 
					}
					break;

				default :
					break loop4;
				}
			}

			// Neptune.g:108:3: ( ELSE LCURLY ! lines RCURLY !)?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==ELSE) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// Neptune.g:108:4: ELSE LCURLY ! lines RCURLY !
					{
					ELSE43=(Token)match(input,ELSE,FOLLOW_ELSE_in_if_statement1203); 
					ELSE43_tree = (Object)adaptor.create(ELSE43);
					adaptor.addChild(root_0, ELSE43_tree);

					LCURLY44=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_if_statement1205); 
					pushFollow(FOLLOW_lines_in_if_statement1208);
					lines45=lines();
					state._fsp--;

					adaptor.addChild(root_0, lines45.getTree());

					RCURLY46=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_if_statement1210); 
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


	public static class include_statement_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "include_statement"
	// Neptune.g:111:1: include_statement : INCLUDE ^ 'ello' ;
	public final NeptuneParser.include_statement_return include_statement() throws RecognitionException {
		NeptuneParser.include_statement_return retval = new NeptuneParser.include_statement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token INCLUDE47=null;
		Token string_literal48=null;

		Object INCLUDE47_tree=null;
		Object string_literal48_tree=null;

		try {
			// Neptune.g:112:2: ( INCLUDE ^ 'ello' )
			// Neptune.g:112:4: INCLUDE ^ 'ello'
			{
			root_0 = (Object)adaptor.nil();


			INCLUDE47=(Token)match(input,INCLUDE,FOLLOW_INCLUDE_in_include_statement1225); 
			INCLUDE47_tree = (Object)adaptor.create(INCLUDE47);
			root_0 = (Object)adaptor.becomeRoot(INCLUDE47_tree, root_0);

			string_literal48=(Token)match(input,53,FOLLOW_53_in_include_statement1228); 
			string_literal48_tree = (Object)adaptor.create(string_literal48);
			adaptor.addChild(root_0, string_literal48_tree);

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
	// $ANTLR end "include_statement"


	public static class print_statement_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "print_statement"
	// Neptune.g:115:1: print_statement : PRINT ^ LPAREN ! expression ( COMMA expression )* RPAREN !;
	public final NeptuneParser.print_statement_return print_statement() throws RecognitionException {
		NeptuneParser.print_statement_return retval = new NeptuneParser.print_statement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token PRINT49=null;
		Token LPAREN50=null;
		Token COMMA52=null;
		Token RPAREN54=null;
		ParserRuleReturnScope expression51 =null;
		ParserRuleReturnScope expression53 =null;

		Object PRINT49_tree=null;
		Object LPAREN50_tree=null;
		Object COMMA52_tree=null;
		Object RPAREN54_tree=null;

		try {
			// Neptune.g:116:2: ( PRINT ^ LPAREN ! expression ( COMMA expression )* RPAREN !)
			// Neptune.g:116:4: PRINT ^ LPAREN ! expression ( COMMA expression )* RPAREN !
			{
			root_0 = (Object)adaptor.nil();


			PRINT49=(Token)match(input,PRINT,FOLLOW_PRINT_in_print_statement1240); 
			PRINT49_tree = (Object)adaptor.create(PRINT49);
			root_0 = (Object)adaptor.becomeRoot(PRINT49_tree, root_0);

			LPAREN50=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_print_statement1243); 
			pushFollow(FOLLOW_expression_in_print_statement1246);
			expression51=expression();
			state._fsp--;

			adaptor.addChild(root_0, expression51.getTree());

			// Neptune.g:116:30: ( COMMA expression )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==COMMA) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// Neptune.g:116:31: COMMA expression
					{
					COMMA52=(Token)match(input,COMMA,FOLLOW_COMMA_in_print_statement1249); 
					COMMA52_tree = (Object)adaptor.create(COMMA52);
					adaptor.addChild(root_0, COMMA52_tree);

					pushFollow(FOLLOW_expression_in_print_statement1251);
					expression53=expression();
					state._fsp--;

					adaptor.addChild(root_0, expression53.getTree());

					}
					break;

				default :
					break loop6;
				}
			}

			RPAREN54=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_print_statement1255); 
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
	// Neptune.g:119:1: read_statement : READ ^ LPAREN ! expression ( COMMA expression )* RPAREN !;
	public final NeptuneParser.read_statement_return read_statement() throws RecognitionException {
		NeptuneParser.read_statement_return retval = new NeptuneParser.read_statement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token READ55=null;
		Token LPAREN56=null;
		Token COMMA58=null;
		Token RPAREN60=null;
		ParserRuleReturnScope expression57 =null;
		ParserRuleReturnScope expression59 =null;

		Object READ55_tree=null;
		Object LPAREN56_tree=null;
		Object COMMA58_tree=null;
		Object RPAREN60_tree=null;

		try {
			// Neptune.g:120:2: ( READ ^ LPAREN ! expression ( COMMA expression )* RPAREN !)
			// Neptune.g:120:4: READ ^ LPAREN ! expression ( COMMA expression )* RPAREN !
			{
			root_0 = (Object)adaptor.nil();


			READ55=(Token)match(input,READ,FOLLOW_READ_in_read_statement1268); 
			READ55_tree = (Object)adaptor.create(READ55);
			root_0 = (Object)adaptor.becomeRoot(READ55_tree, root_0);

			LPAREN56=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_read_statement1271); 
			pushFollow(FOLLOW_expression_in_read_statement1274);
			expression57=expression();
			state._fsp--;

			adaptor.addChild(root_0, expression57.getTree());

			// Neptune.g:120:29: ( COMMA expression )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==COMMA) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// Neptune.g:120:30: COMMA expression
					{
					COMMA58=(Token)match(input,COMMA,FOLLOW_COMMA_in_read_statement1277); 
					COMMA58_tree = (Object)adaptor.create(COMMA58);
					adaptor.addChild(root_0, COMMA58_tree);

					pushFollow(FOLLOW_expression_in_read_statement1279);
					expression59=expression();
					state._fsp--;

					adaptor.addChild(root_0, expression59.getTree());

					}
					break;

				default :
					break loop7;
				}
			}

			RPAREN60=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_read_statement1283); 
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
	// Neptune.g:123:1: declaration : ( VAR ^| CONST ^) type IDENTIFIER ( BECOMES expression )? ;
	public final NeptuneParser.declaration_return declaration() throws RecognitionException {
		NeptuneParser.declaration_return retval = new NeptuneParser.declaration_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token VAR61=null;
		Token CONST62=null;
		Token IDENTIFIER64=null;
		Token BECOMES65=null;
		ParserRuleReturnScope type63 =null;
		ParserRuleReturnScope expression66 =null;

		Object VAR61_tree=null;
		Object CONST62_tree=null;
		Object IDENTIFIER64_tree=null;
		Object BECOMES65_tree=null;

		try {
			// Neptune.g:124:2: ( ( VAR ^| CONST ^) type IDENTIFIER ( BECOMES expression )? )
			// Neptune.g:124:4: ( VAR ^| CONST ^) type IDENTIFIER ( BECOMES expression )?
			{
			root_0 = (Object)adaptor.nil();


			// Neptune.g:124:4: ( VAR ^| CONST ^)
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==VAR) ) {
				alt8=1;
			}
			else if ( (LA8_0==CONST) ) {
				alt8=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}

			switch (alt8) {
				case 1 :
					// Neptune.g:124:5: VAR ^
					{
					VAR61=(Token)match(input,VAR,FOLLOW_VAR_in_declaration1297); 
					VAR61_tree = (Object)adaptor.create(VAR61);
					root_0 = (Object)adaptor.becomeRoot(VAR61_tree, root_0);

					}
					break;
				case 2 :
					// Neptune.g:124:12: CONST ^
					{
					CONST62=(Token)match(input,CONST,FOLLOW_CONST_in_declaration1302); 
					CONST62_tree = (Object)adaptor.create(CONST62);
					root_0 = (Object)adaptor.becomeRoot(CONST62_tree, root_0);

					}
					break;

			}

			pushFollow(FOLLOW_type_in_declaration1306);
			type63=type();
			state._fsp--;

			adaptor.addChild(root_0, type63.getTree());

			IDENTIFIER64=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_declaration1308); 
			IDENTIFIER64_tree = (Object)adaptor.create(IDENTIFIER64);
			adaptor.addChild(root_0, IDENTIFIER64_tree);

			// Neptune.g:124:36: ( BECOMES expression )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==BECOMES) ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// Neptune.g:124:37: BECOMES expression
					{
					BECOMES65=(Token)match(input,BECOMES,FOLLOW_BECOMES_in_declaration1311); 
					BECOMES65_tree = (Object)adaptor.create(BECOMES65);
					adaptor.addChild(root_0, BECOMES65_tree);

					pushFollow(FOLLOW_expression_in_declaration1313);
					expression66=expression();
					state._fsp--;

					adaptor.addChild(root_0, expression66.getTree());

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
	// $ANTLR end "declaration"


	public static class expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expression"
	// Neptune.g:127:1: expression : assignment_expr ;
	public final NeptuneParser.expression_return expression() throws RecognitionException {
		NeptuneParser.expression_return retval = new NeptuneParser.expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope assignment_expr67 =null;


		try {
			// Neptune.g:128:2: ( assignment_expr )
			// Neptune.g:128:4: assignment_expr
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_assignment_expr_in_expression1327);
			assignment_expr67=assignment_expr();
			state._fsp--;

			adaptor.addChild(root_0, assignment_expr67.getTree());

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
	// Neptune.g:131:1: assignment_expr : boolean_expr ( BECOMES ^ assignment_expr )? ;
	public final NeptuneParser.assignment_expr_return assignment_expr() throws RecognitionException {
		NeptuneParser.assignment_expr_return retval = new NeptuneParser.assignment_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token BECOMES69=null;
		ParserRuleReturnScope boolean_expr68 =null;
		ParserRuleReturnScope assignment_expr70 =null;

		Object BECOMES69_tree=null;

		try {
			// Neptune.g:132:2: ( boolean_expr ( BECOMES ^ assignment_expr )? )
			// Neptune.g:132:4: boolean_expr ( BECOMES ^ assignment_expr )?
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_boolean_expr_in_assignment_expr1338);
			boolean_expr68=boolean_expr();
			state._fsp--;

			adaptor.addChild(root_0, boolean_expr68.getTree());

			// Neptune.g:132:17: ( BECOMES ^ assignment_expr )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==BECOMES) ) {
				alt10=1;
			}
			switch (alt10) {
				case 1 :
					// Neptune.g:132:18: BECOMES ^ assignment_expr
					{
					BECOMES69=(Token)match(input,BECOMES,FOLLOW_BECOMES_in_assignment_expr1341); 
					BECOMES69_tree = (Object)adaptor.create(BECOMES69);
					root_0 = (Object)adaptor.becomeRoot(BECOMES69_tree, root_0);

					pushFollow(FOLLOW_assignment_expr_in_assignment_expr1344);
					assignment_expr70=assignment_expr();
					state._fsp--;

					adaptor.addChild(root_0, assignment_expr70.getTree());

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
	// Neptune.g:135:1: boolean_expr : plus_expr ( ( LT ^| LT_EQ ^| GT ^| GT_EQ ^| EQ ^| NEQ ^) plus_expr )* ;
	public final NeptuneParser.boolean_expr_return boolean_expr() throws RecognitionException {
		NeptuneParser.boolean_expr_return retval = new NeptuneParser.boolean_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token LT72=null;
		Token LT_EQ73=null;
		Token GT74=null;
		Token GT_EQ75=null;
		Token EQ76=null;
		Token NEQ77=null;
		ParserRuleReturnScope plus_expr71 =null;
		ParserRuleReturnScope plus_expr78 =null;

		Object LT72_tree=null;
		Object LT_EQ73_tree=null;
		Object GT74_tree=null;
		Object GT_EQ75_tree=null;
		Object EQ76_tree=null;
		Object NEQ77_tree=null;

		try {
			// Neptune.g:136:2: ( plus_expr ( ( LT ^| LT_EQ ^| GT ^| GT_EQ ^| EQ ^| NEQ ^) plus_expr )* )
			// Neptune.g:136:4: plus_expr ( ( LT ^| LT_EQ ^| GT ^| GT_EQ ^| EQ ^| NEQ ^) plus_expr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_plus_expr_in_boolean_expr1358);
			plus_expr71=plus_expr();
			state._fsp--;

			adaptor.addChild(root_0, plus_expr71.getTree());

			// Neptune.g:136:14: ( ( LT ^| LT_EQ ^| GT ^| GT_EQ ^| EQ ^| NEQ ^) plus_expr )*
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( (LA12_0==EQ||(LA12_0 >= GT && LA12_0 <= GT_EQ)||(LA12_0 >= LT && LA12_0 <= LT_EQ)||LA12_0==NEQ) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// Neptune.g:136:15: ( LT ^| LT_EQ ^| GT ^| GT_EQ ^| EQ ^| NEQ ^) plus_expr
					{
					// Neptune.g:136:15: ( LT ^| LT_EQ ^| GT ^| GT_EQ ^| EQ ^| NEQ ^)
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
							// Neptune.g:136:16: LT ^
							{
							LT72=(Token)match(input,LT,FOLLOW_LT_in_boolean_expr1362); 
							LT72_tree = (Object)adaptor.create(LT72);
							root_0 = (Object)adaptor.becomeRoot(LT72_tree, root_0);

							}
							break;
						case 2 :
							// Neptune.g:136:22: LT_EQ ^
							{
							LT_EQ73=(Token)match(input,LT_EQ,FOLLOW_LT_EQ_in_boolean_expr1367); 
							LT_EQ73_tree = (Object)adaptor.create(LT_EQ73);
							root_0 = (Object)adaptor.becomeRoot(LT_EQ73_tree, root_0);

							}
							break;
						case 3 :
							// Neptune.g:136:31: GT ^
							{
							GT74=(Token)match(input,GT,FOLLOW_GT_in_boolean_expr1372); 
							GT74_tree = (Object)adaptor.create(GT74);
							root_0 = (Object)adaptor.becomeRoot(GT74_tree, root_0);

							}
							break;
						case 4 :
							// Neptune.g:136:37: GT_EQ ^
							{
							GT_EQ75=(Token)match(input,GT_EQ,FOLLOW_GT_EQ_in_boolean_expr1377); 
							GT_EQ75_tree = (Object)adaptor.create(GT_EQ75);
							root_0 = (Object)adaptor.becomeRoot(GT_EQ75_tree, root_0);

							}
							break;
						case 5 :
							// Neptune.g:136:46: EQ ^
							{
							EQ76=(Token)match(input,EQ,FOLLOW_EQ_in_boolean_expr1382); 
							EQ76_tree = (Object)adaptor.create(EQ76);
							root_0 = (Object)adaptor.becomeRoot(EQ76_tree, root_0);

							}
							break;
						case 6 :
							// Neptune.g:136:52: NEQ ^
							{
							NEQ77=(Token)match(input,NEQ,FOLLOW_NEQ_in_boolean_expr1387); 
							NEQ77_tree = (Object)adaptor.create(NEQ77);
							root_0 = (Object)adaptor.becomeRoot(NEQ77_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_plus_expr_in_boolean_expr1391);
					plus_expr78=plus_expr();
					state._fsp--;

					adaptor.addChild(root_0, plus_expr78.getTree());

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
	// Neptune.g:139:1: plus_expr : multi_expr ( ( PLUS ^| MINUS ^) multi_expr )* ;
	public final NeptuneParser.plus_expr_return plus_expr() throws RecognitionException {
		NeptuneParser.plus_expr_return retval = new NeptuneParser.plus_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token PLUS80=null;
		Token MINUS81=null;
		ParserRuleReturnScope multi_expr79 =null;
		ParserRuleReturnScope multi_expr82 =null;

		Object PLUS80_tree=null;
		Object MINUS81_tree=null;

		try {
			// Neptune.g:140:2: ( multi_expr ( ( PLUS ^| MINUS ^) multi_expr )* )
			// Neptune.g:140:4: multi_expr ( ( PLUS ^| MINUS ^) multi_expr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_multi_expr_in_plus_expr1404);
			multi_expr79=multi_expr();
			state._fsp--;

			adaptor.addChild(root_0, multi_expr79.getTree());

			// Neptune.g:140:15: ( ( PLUS ^| MINUS ^) multi_expr )*
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( (LA14_0==MINUS||LA14_0==PLUS) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// Neptune.g:140:16: ( PLUS ^| MINUS ^) multi_expr
					{
					// Neptune.g:140:16: ( PLUS ^| MINUS ^)
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
							// Neptune.g:140:17: PLUS ^
							{
							PLUS80=(Token)match(input,PLUS,FOLLOW_PLUS_in_plus_expr1408); 
							PLUS80_tree = (Object)adaptor.create(PLUS80);
							root_0 = (Object)adaptor.becomeRoot(PLUS80_tree, root_0);

							}
							break;
						case 2 :
							// Neptune.g:140:25: MINUS ^
							{
							MINUS81=(Token)match(input,MINUS,FOLLOW_MINUS_in_plus_expr1413); 
							MINUS81_tree = (Object)adaptor.create(MINUS81);
							root_0 = (Object)adaptor.becomeRoot(MINUS81_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_multi_expr_in_plus_expr1417);
					multi_expr82=multi_expr();
					state._fsp--;

					adaptor.addChild(root_0, multi_expr82.getTree());

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
	// Neptune.g:143:1: multi_expr : operand ( ( TIMES ^| DIVIDE ^) operand )* ;
	public final NeptuneParser.multi_expr_return multi_expr() throws RecognitionException {
		NeptuneParser.multi_expr_return retval = new NeptuneParser.multi_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token TIMES84=null;
		Token DIVIDE85=null;
		ParserRuleReturnScope operand83 =null;
		ParserRuleReturnScope operand86 =null;

		Object TIMES84_tree=null;
		Object DIVIDE85_tree=null;

		try {
			// Neptune.g:144:2: ( operand ( ( TIMES ^| DIVIDE ^) operand )* )
			// Neptune.g:144:4: operand ( ( TIMES ^| DIVIDE ^) operand )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_operand_in_multi_expr1430);
			operand83=operand();
			state._fsp--;

			adaptor.addChild(root_0, operand83.getTree());

			// Neptune.g:144:12: ( ( TIMES ^| DIVIDE ^) operand )*
			loop16:
			while (true) {
				int alt16=2;
				int LA16_0 = input.LA(1);
				if ( (LA16_0==DIVIDE||LA16_0==TIMES) ) {
					alt16=1;
				}

				switch (alt16) {
				case 1 :
					// Neptune.g:144:13: ( TIMES ^| DIVIDE ^) operand
					{
					// Neptune.g:144:13: ( TIMES ^| DIVIDE ^)
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
							// Neptune.g:144:14: TIMES ^
							{
							TIMES84=(Token)match(input,TIMES,FOLLOW_TIMES_in_multi_expr1434); 
							TIMES84_tree = (Object)adaptor.create(TIMES84);
							root_0 = (Object)adaptor.becomeRoot(TIMES84_tree, root_0);

							}
							break;
						case 2 :
							// Neptune.g:144:23: DIVIDE ^
							{
							DIVIDE85=(Token)match(input,DIVIDE,FOLLOW_DIVIDE_in_multi_expr1439); 
							DIVIDE85_tree = (Object)adaptor.create(DIVIDE85);
							root_0 = (Object)adaptor.becomeRoot(DIVIDE85_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_operand_in_multi_expr1443);
					operand86=operand();
					state._fsp--;

					adaptor.addChild(root_0, operand86.getTree());

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
	// Neptune.g:147:1: operand : ( IDENTIFIER | NUMBER | LPAREN ! assignment_expr RPAREN !| LCURLY expression ( COMMA expression )* RCURLY -> ^( ARRAY_SET ( expression )+ ) | print_statement | read_statement );
	public final NeptuneParser.operand_return operand() throws RecognitionException {
		NeptuneParser.operand_return retval = new NeptuneParser.operand_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IDENTIFIER87=null;
		Token NUMBER88=null;
		Token LPAREN89=null;
		Token RPAREN91=null;
		Token LCURLY92=null;
		Token COMMA94=null;
		Token RCURLY96=null;
		ParserRuleReturnScope assignment_expr90 =null;
		ParserRuleReturnScope expression93 =null;
		ParserRuleReturnScope expression95 =null;
		ParserRuleReturnScope print_statement97 =null;
		ParserRuleReturnScope read_statement98 =null;

		Object IDENTIFIER87_tree=null;
		Object NUMBER88_tree=null;
		Object LPAREN89_tree=null;
		Object RPAREN91_tree=null;
		Object LCURLY92_tree=null;
		Object COMMA94_tree=null;
		Object RCURLY96_tree=null;
		RewriteRuleTokenStream stream_LCURLY=new RewriteRuleTokenStream(adaptor,"token LCURLY");
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_RCURLY=new RewriteRuleTokenStream(adaptor,"token RCURLY");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try {
			// Neptune.g:148:5: ( IDENTIFIER | NUMBER | LPAREN ! assignment_expr RPAREN !| LCURLY expression ( COMMA expression )* RCURLY -> ^( ARRAY_SET ( expression )+ ) | print_statement | read_statement )
			int alt18=6;
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
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 18, 0, input);
				throw nvae;
			}
			switch (alt18) {
				case 1 :
					// Neptune.g:148:9: IDENTIFIER
					{
					root_0 = (Object)adaptor.nil();


					IDENTIFIER87=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_operand1461); 
					IDENTIFIER87_tree = (Object)adaptor.create(IDENTIFIER87);
					adaptor.addChild(root_0, IDENTIFIER87_tree);

					}
					break;
				case 2 :
					// Neptune.g:149:9: NUMBER
					{
					root_0 = (Object)adaptor.nil();


					NUMBER88=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_operand1471); 
					NUMBER88_tree = (Object)adaptor.create(NUMBER88);
					adaptor.addChild(root_0, NUMBER88_tree);

					}
					break;
				case 3 :
					// Neptune.g:150:9: LPAREN ! assignment_expr RPAREN !
					{
					root_0 = (Object)adaptor.nil();


					LPAREN89=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_operand1481); 
					pushFollow(FOLLOW_assignment_expr_in_operand1484);
					assignment_expr90=assignment_expr();
					state._fsp--;

					adaptor.addChild(root_0, assignment_expr90.getTree());

					RPAREN91=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_operand1486); 
					}
					break;
				case 4 :
					// Neptune.g:151:4: LCURLY expression ( COMMA expression )* RCURLY
					{
					LCURLY92=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_operand1492);  
					stream_LCURLY.add(LCURLY92);

					pushFollow(FOLLOW_expression_in_operand1494);
					expression93=expression();
					state._fsp--;

					stream_expression.add(expression93.getTree());
					// Neptune.g:151:22: ( COMMA expression )*
					loop17:
					while (true) {
						int alt17=2;
						int LA17_0 = input.LA(1);
						if ( (LA17_0==COMMA) ) {
							alt17=1;
						}

						switch (alt17) {
						case 1 :
							// Neptune.g:151:23: COMMA expression
							{
							COMMA94=(Token)match(input,COMMA,FOLLOW_COMMA_in_operand1497);  
							stream_COMMA.add(COMMA94);

							pushFollow(FOLLOW_expression_in_operand1499);
							expression95=expression();
							state._fsp--;

							stream_expression.add(expression95.getTree());
							}
							break;

						default :
							break loop17;
						}
					}

					RCURLY96=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_operand1503);  
					stream_RCURLY.add(RCURLY96);

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
					// 152:3: -> ^( ARRAY_SET ( expression )+ )
					{
						// Neptune.g:152:6: ^( ARRAY_SET ( expression )+ )
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
					// Neptune.g:153:4: print_statement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_print_statement_in_operand1519);
					print_statement97=print_statement();
					state._fsp--;

					adaptor.addChild(root_0, print_statement97.getTree());

					}
					break;
				case 6 :
					// Neptune.g:154:4: read_statement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_read_statement_in_operand1524);
					read_statement98=read_statement();
					state._fsp--;

					adaptor.addChild(root_0, read_statement98.getTree());

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
	// Neptune.g:157:1: type : ( INTEGER ( array_def )? | CHAR ( array_def )? | BOOLEAN ( array_def )? );
	public final NeptuneParser.type_return type() throws RecognitionException {
		NeptuneParser.type_return retval = new NeptuneParser.type_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token INTEGER99=null;
		Token CHAR101=null;
		Token BOOLEAN103=null;
		ParserRuleReturnScope array_def100 =null;
		ParserRuleReturnScope array_def102 =null;
		ParserRuleReturnScope array_def104 =null;

		Object INTEGER99_tree=null;
		Object CHAR101_tree=null;
		Object BOOLEAN103_tree=null;

		try {
			// Neptune.g:158:2: ( INTEGER ( array_def )? | CHAR ( array_def )? | BOOLEAN ( array_def )? )
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
					// Neptune.g:158:4: INTEGER ( array_def )?
					{
					root_0 = (Object)adaptor.nil();


					INTEGER99=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_type1538); 
					INTEGER99_tree = (Object)adaptor.create(INTEGER99);
					adaptor.addChild(root_0, INTEGER99_tree);

					// Neptune.g:158:12: ( array_def )?
					int alt19=2;
					int LA19_0 = input.LA(1);
					if ( (LA19_0==LBRACKET) ) {
						alt19=1;
					}
					switch (alt19) {
						case 1 :
							// Neptune.g:158:12: array_def
							{
							pushFollow(FOLLOW_array_def_in_type1540);
							array_def100=array_def();
							state._fsp--;

							adaptor.addChild(root_0, array_def100.getTree());

							}
							break;

					}

					}
					break;
				case 2 :
					// Neptune.g:159:4: CHAR ( array_def )?
					{
					root_0 = (Object)adaptor.nil();


					CHAR101=(Token)match(input,CHAR,FOLLOW_CHAR_in_type1546); 
					CHAR101_tree = (Object)adaptor.create(CHAR101);
					adaptor.addChild(root_0, CHAR101_tree);

					// Neptune.g:159:9: ( array_def )?
					int alt20=2;
					int LA20_0 = input.LA(1);
					if ( (LA20_0==LBRACKET) ) {
						alt20=1;
					}
					switch (alt20) {
						case 1 :
							// Neptune.g:159:9: array_def
							{
							pushFollow(FOLLOW_array_def_in_type1548);
							array_def102=array_def();
							state._fsp--;

							adaptor.addChild(root_0, array_def102.getTree());

							}
							break;

					}

					}
					break;
				case 3 :
					// Neptune.g:160:4: BOOLEAN ( array_def )?
					{
					root_0 = (Object)adaptor.nil();


					BOOLEAN103=(Token)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_type1554); 
					BOOLEAN103_tree = (Object)adaptor.create(BOOLEAN103);
					adaptor.addChild(root_0, BOOLEAN103_tree);

					// Neptune.g:160:12: ( array_def )?
					int alt21=2;
					int LA21_0 = input.LA(1);
					if ( (LA21_0==LBRACKET) ) {
						alt21=1;
					}
					switch (alt21) {
						case 1 :
							// Neptune.g:160:12: array_def
							{
							pushFollow(FOLLOW_array_def_in_type1556);
							array_def104=array_def();
							state._fsp--;

							adaptor.addChild(root_0, array_def104.getTree());

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
	// Neptune.g:163:1: array_def : LBRACKET ( NUMBER )? RBRACKET ;
	public final NeptuneParser.array_def_return array_def() throws RecognitionException {
		NeptuneParser.array_def_return retval = new NeptuneParser.array_def_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token LBRACKET105=null;
		Token NUMBER106=null;
		Token RBRACKET107=null;

		Object LBRACKET105_tree=null;
		Object NUMBER106_tree=null;
		Object RBRACKET107_tree=null;

		try {
			// Neptune.g:164:2: ( LBRACKET ( NUMBER )? RBRACKET )
			// Neptune.g:164:5: LBRACKET ( NUMBER )? RBRACKET
			{
			root_0 = (Object)adaptor.nil();


			LBRACKET105=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_array_def1570); 
			LBRACKET105_tree = (Object)adaptor.create(LBRACKET105);
			adaptor.addChild(root_0, LBRACKET105_tree);

			// Neptune.g:164:14: ( NUMBER )?
			int alt23=2;
			int LA23_0 = input.LA(1);
			if ( (LA23_0==NUMBER) ) {
				alt23=1;
			}
			switch (alt23) {
				case 1 :
					// Neptune.g:164:14: NUMBER
					{
					NUMBER106=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_array_def1572); 
					NUMBER106_tree = (Object)adaptor.create(NUMBER106);
					adaptor.addChild(root_0, NUMBER106_tree);

					}
					break;

			}

			RBRACKET107=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_array_def1575); 
			RBRACKET107_tree = (Object)adaptor.create(RBRACKET107);
			adaptor.addChild(root_0, RBRACKET107_tree);

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



	public static final BitSet FOLLOW_lines_in_program990 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_program992 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_line_in_lines1027 = new BitSet(new long[]{0x000C08A125880802L});
	public static final BitSet FOLLOW_expression_in_line1040 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_line1042 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declaration_in_line1048 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_line1050 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_include_statement_in_line1056 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_logic_statement_in_line1061 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_while_statement_in_logic_statement1073 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_foreach_statement_in_logic_statement1078 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_if_statement_in_logic_statement1083 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHILE_in_while_statement1095 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_LPAREN_in_while_statement1098 = new BitSet(new long[]{0x000008A120800000L});
	public static final BitSet FOLLOW_expression_in_while_statement1101 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_RPAREN_in_while_statement1103 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_LCURLY_in_while_statement1106 = new BitSet(new long[]{0x000C08A125880800L});
	public static final BitSet FOLLOW_lines_in_while_statement1109 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_RCURLY_in_while_statement1111 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FOREACH_in_foreach_statement1124 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_LPAREN_in_foreach_statement1127 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_foreach_statement1130 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_IN_in_foreach_statement1132 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_foreach_statement1135 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_RPAREN_in_foreach_statement1137 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_LCURLY_in_foreach_statement1140 = new BitSet(new long[]{0x000C08A125880800L});
	public static final BitSet FOLLOW_lines_in_foreach_statement1143 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_RCURLY_in_foreach_statement1145 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_if_statement1158 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_LPAREN_in_if_statement1161 = new BitSet(new long[]{0x000008A120800000L});
	public static final BitSet FOLLOW_expression_in_if_statement1164 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_RPAREN_in_if_statement1166 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_LCURLY_in_if_statement1169 = new BitSet(new long[]{0x000C08A125880800L});
	public static final BitSet FOLLOW_lines_in_if_statement1172 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_RCURLY_in_if_statement1174 = new BitSet(new long[]{0x0000000000030002L});
	public static final BitSet FOLLOW_ELSIF_in_if_statement1180 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_LPAREN_in_if_statement1182 = new BitSet(new long[]{0x000008A120800000L});
	public static final BitSet FOLLOW_expression_in_if_statement1185 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_RPAREN_in_if_statement1187 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_LCURLY_in_if_statement1190 = new BitSet(new long[]{0x000C08A125880800L});
	public static final BitSet FOLLOW_lines_in_if_statement1193 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_RCURLY_in_if_statement1195 = new BitSet(new long[]{0x0000000000030002L});
	public static final BitSet FOLLOW_ELSE_in_if_statement1203 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_LCURLY_in_if_statement1205 = new BitSet(new long[]{0x000C08A125880800L});
	public static final BitSet FOLLOW_lines_in_if_statement1208 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_RCURLY_in_if_statement1210 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INCLUDE_in_include_statement1225 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_53_in_include_statement1228 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRINT_in_print_statement1240 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_LPAREN_in_print_statement1243 = new BitSet(new long[]{0x000008A120800000L});
	public static final BitSet FOLLOW_expression_in_print_statement1246 = new BitSet(new long[]{0x0000200000000200L});
	public static final BitSet FOLLOW_COMMA_in_print_statement1249 = new BitSet(new long[]{0x000008A120800000L});
	public static final BitSet FOLLOW_expression_in_print_statement1251 = new BitSet(new long[]{0x0000200000000200L});
	public static final BitSet FOLLOW_RPAREN_in_print_statement1255 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_READ_in_read_statement1268 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_LPAREN_in_read_statement1271 = new BitSet(new long[]{0x000008A120800000L});
	public static final BitSet FOLLOW_expression_in_read_statement1274 = new BitSet(new long[]{0x0000200000000200L});
	public static final BitSet FOLLOW_COMMA_in_read_statement1277 = new BitSet(new long[]{0x000008A120800000L});
	public static final BitSet FOLLOW_expression_in_read_statement1279 = new BitSet(new long[]{0x0000200000000200L});
	public static final BitSet FOLLOW_RPAREN_in_read_statement1283 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_declaration1297 = new BitSet(new long[]{0x00000000080000C0L});
	public static final BitSet FOLLOW_CONST_in_declaration1302 = new BitSet(new long[]{0x00000000080000C0L});
	public static final BitSet FOLLOW_type_in_declaration1306 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_declaration1308 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_BECOMES_in_declaration1311 = new BitSet(new long[]{0x000008A120800000L});
	public static final BitSet FOLLOW_expression_in_declaration1313 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignment_expr_in_expression1327 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_boolean_expr_in_assignment_expr1338 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_BECOMES_in_assignment_expr1341 = new BitSet(new long[]{0x000008A120800000L});
	public static final BitSet FOLLOW_assignment_expr_in_assignment_expr1344 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_plus_expr_in_boolean_expr1358 = new BitSet(new long[]{0x0000001600640002L});
	public static final BitSet FOLLOW_LT_in_boolean_expr1362 = new BitSet(new long[]{0x000008A120800000L});
	public static final BitSet FOLLOW_LT_EQ_in_boolean_expr1367 = new BitSet(new long[]{0x000008A120800000L});
	public static final BitSet FOLLOW_GT_in_boolean_expr1372 = new BitSet(new long[]{0x000008A120800000L});
	public static final BitSet FOLLOW_GT_EQ_in_boolean_expr1377 = new BitSet(new long[]{0x000008A120800000L});
	public static final BitSet FOLLOW_EQ_in_boolean_expr1382 = new BitSet(new long[]{0x000008A120800000L});
	public static final BitSet FOLLOW_NEQ_in_boolean_expr1387 = new BitSet(new long[]{0x000008A120800000L});
	public static final BitSet FOLLOW_plus_expr_in_boolean_expr1391 = new BitSet(new long[]{0x0000001600640002L});
	public static final BitSet FOLLOW_multi_expr_in_plus_expr1404 = new BitSet(new long[]{0x0000004800000002L});
	public static final BitSet FOLLOW_PLUS_in_plus_expr1408 = new BitSet(new long[]{0x000008A120800000L});
	public static final BitSet FOLLOW_MINUS_in_plus_expr1413 = new BitSet(new long[]{0x000008A120800000L});
	public static final BitSet FOLLOW_multi_expr_in_plus_expr1417 = new BitSet(new long[]{0x0000004800000002L});
	public static final BitSet FOLLOW_operand_in_multi_expr1430 = new BitSet(new long[]{0x0001000000002002L});
	public static final BitSet FOLLOW_TIMES_in_multi_expr1434 = new BitSet(new long[]{0x000008A120800000L});
	public static final BitSet FOLLOW_DIVIDE_in_multi_expr1439 = new BitSet(new long[]{0x000008A120800000L});
	public static final BitSet FOLLOW_operand_in_multi_expr1443 = new BitSet(new long[]{0x0001000000002002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_operand1461 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMBER_in_operand1471 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_operand1481 = new BitSet(new long[]{0x000008A120800000L});
	public static final BitSet FOLLOW_assignment_expr_in_operand1484 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_RPAREN_in_operand1486 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LCURLY_in_operand1492 = new BitSet(new long[]{0x000008A120800000L});
	public static final BitSet FOLLOW_expression_in_operand1494 = new BitSet(new long[]{0x0000040000000200L});
	public static final BitSet FOLLOW_COMMA_in_operand1497 = new BitSet(new long[]{0x000008A120800000L});
	public static final BitSet FOLLOW_expression_in_operand1499 = new BitSet(new long[]{0x0000040000000200L});
	public static final BitSet FOLLOW_RCURLY_in_operand1503 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_print_statement_in_operand1519 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_read_statement_in_operand1524 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTEGER_in_type1538 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_array_def_in_type1540 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_in_type1546 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_array_def_in_type1548 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOLEAN_in_type1554 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_array_def_in_type1556 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACKET_in_array_def1570 = new BitSet(new long[]{0x0000022000000000L});
	public static final BitSet FOLLOW_NUMBER_in_array_def1572 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_RBRACKET_in_array_def1575 = new BitSet(new long[]{0x0000000000000002L});
}

// $ANTLR 3.5.2 Neptune.g 2014-05-30 11:49:20

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
		"PLUS", "PRINT", "PROGRAM", "RBRACKET", "RCURLY", "RETURN", "RPAREN", 
		"SEMICOLON", "THEN", "TIMES", "UPPER", "WHILE", "WS", "'ello'"
	};
	public static final int EOF=-1;
	public static final int T__51=51;
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
	public static final int RETURN=43;
	public static final int RPAREN=44;
	public static final int SEMICOLON=45;
	public static final int THEN=46;
	public static final int TIMES=47;
	public static final int UPPER=48;
	public static final int WHILE=49;
	public static final int WS=50;

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
	// Neptune.g:74:1: program : lines EOF -> ^( PROGRAM lines ) ;
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
			// Neptune.g:75:5: ( lines EOF -> ^( PROGRAM lines ) )
			// Neptune.g:75:9: lines EOF
			{
			pushFollow(FOLLOW_lines_in_program953);
			lines1=lines();
			state._fsp--;

			stream_lines.add(lines1.getTree());
			EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_program955);  
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
			// 76:13: -> ^( PROGRAM lines )
			{
				// Neptune.g:76:17: ^( PROGRAM lines )
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
	// Neptune.g:79:1: lines : ( line )+ ;
	public final NeptuneParser.lines_return lines() throws RecognitionException {
		NeptuneParser.lines_return retval = new NeptuneParser.lines_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope line3 =null;


		try {
			// Neptune.g:80:2: ( ( line )+ )
			// Neptune.g:80:4: ( line )+
			{
			root_0 = (Object)adaptor.nil();


			// Neptune.g:80:4: ( line )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= BOOLEAN && LA1_0 <= CHAR)||LA1_0==FOREACH||(LA1_0 >= IDENTIFIER && LA1_0 <= IF)||(LA1_0 >= INCLUDE && LA1_0 <= INTEGER)||LA1_0==LCURLY||LA1_0==LPAREN||LA1_0==NUMBER||LA1_0==PRINT||LA1_0==WHILE) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// Neptune.g:80:4: line
					{
					pushFollow(FOLLOW_line_in_lines990);
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
	// Neptune.g:83:1: line : ( expression SEMICOLON !| declaration SEMICOLON !| print_statement SEMICOLON !| include_statement | logic_statement );
	public final NeptuneParser.line_return line() throws RecognitionException {
		NeptuneParser.line_return retval = new NeptuneParser.line_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token SEMICOLON5=null;
		Token SEMICOLON7=null;
		Token SEMICOLON9=null;
		ParserRuleReturnScope expression4 =null;
		ParserRuleReturnScope declaration6 =null;
		ParserRuleReturnScope print_statement8 =null;
		ParserRuleReturnScope include_statement10 =null;
		ParserRuleReturnScope logic_statement11 =null;

		Object SEMICOLON5_tree=null;
		Object SEMICOLON7_tree=null;
		Object SEMICOLON9_tree=null;

		try {
			// Neptune.g:84:2: ( expression SEMICOLON !| declaration SEMICOLON !| print_statement SEMICOLON !| include_statement | logic_statement )
			int alt2=5;
			switch ( input.LA(1) ) {
			case IDENTIFIER:
			case LCURLY:
			case LPAREN:
			case NUMBER:
				{
				alt2=1;
				}
				break;
			case BOOLEAN:
			case CHAR:
			case INTEGER:
				{
				alt2=2;
				}
				break;
			case PRINT:
				{
				alt2=3;
				}
				break;
			case INCLUDE:
				{
				alt2=4;
				}
				break;
			case FOREACH:
			case IF:
			case WHILE:
				{
				alt2=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}
			switch (alt2) {
				case 1 :
					// Neptune.g:84:4: expression SEMICOLON !
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_expression_in_line1003);
					expression4=expression();
					state._fsp--;

					adaptor.addChild(root_0, expression4.getTree());

					SEMICOLON5=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_line1005); 
					}
					break;
				case 2 :
					// Neptune.g:85:4: declaration SEMICOLON !
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_declaration_in_line1011);
					declaration6=declaration();
					state._fsp--;

					adaptor.addChild(root_0, declaration6.getTree());

					SEMICOLON7=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_line1013); 
					}
					break;
				case 3 :
					// Neptune.g:86:4: print_statement SEMICOLON !
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_print_statement_in_line1019);
					print_statement8=print_statement();
					state._fsp--;

					adaptor.addChild(root_0, print_statement8.getTree());

					SEMICOLON9=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_line1021); 
					}
					break;
				case 4 :
					// Neptune.g:87:4: include_statement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_include_statement_in_line1027);
					include_statement10=include_statement();
					state._fsp--;

					adaptor.addChild(root_0, include_statement10.getTree());

					}
					break;
				case 5 :
					// Neptune.g:88:4: logic_statement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_logic_statement_in_line1032);
					logic_statement11=logic_statement();
					state._fsp--;

					adaptor.addChild(root_0, logic_statement11.getTree());

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

		ParserRuleReturnScope while_statement12 =null;
		ParserRuleReturnScope foreach_statement13 =null;
		ParserRuleReturnScope if_statement14 =null;


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


					pushFollow(FOLLOW_while_statement_in_logic_statement1044);
					while_statement12=while_statement();
					state._fsp--;

					adaptor.addChild(root_0, while_statement12.getTree());

					}
					break;
				case 2 :
					// Neptune.g:93:4: foreach_statement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_foreach_statement_in_logic_statement1049);
					foreach_statement13=foreach_statement();
					state._fsp--;

					adaptor.addChild(root_0, foreach_statement13.getTree());

					}
					break;
				case 3 :
					// Neptune.g:94:4: if_statement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_if_statement_in_logic_statement1054);
					if_statement14=if_statement();
					state._fsp--;

					adaptor.addChild(root_0, if_statement14.getTree());

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
	// Neptune.g:98:1: while_statement : WHILE LPAREN ! expression RPAREN ! LCURLY ! lines RCURLY !;
	public final NeptuneParser.while_statement_return while_statement() throws RecognitionException {
		NeptuneParser.while_statement_return retval = new NeptuneParser.while_statement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token WHILE15=null;
		Token LPAREN16=null;
		Token RPAREN18=null;
		Token LCURLY19=null;
		Token RCURLY21=null;
		ParserRuleReturnScope expression17 =null;
		ParserRuleReturnScope lines20 =null;

		Object WHILE15_tree=null;
		Object LPAREN16_tree=null;
		Object RPAREN18_tree=null;
		Object LCURLY19_tree=null;
		Object RCURLY21_tree=null;

		try {
			// Neptune.g:99:2: ( WHILE LPAREN ! expression RPAREN ! LCURLY ! lines RCURLY !)
			// Neptune.g:99:4: WHILE LPAREN ! expression RPAREN ! LCURLY ! lines RCURLY !
			{
			root_0 = (Object)adaptor.nil();


			WHILE15=(Token)match(input,WHILE,FOLLOW_WHILE_in_while_statement1067); 
			WHILE15_tree = (Object)adaptor.create(WHILE15);
			adaptor.addChild(root_0, WHILE15_tree);

			LPAREN16=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_while_statement1069); 
			pushFollow(FOLLOW_expression_in_while_statement1072);
			expression17=expression();
			state._fsp--;

			adaptor.addChild(root_0, expression17.getTree());

			RPAREN18=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_while_statement1074); 
			LCURLY19=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_while_statement1077); 
			pushFollow(FOLLOW_lines_in_while_statement1080);
			lines20=lines();
			state._fsp--;

			adaptor.addChild(root_0, lines20.getTree());

			RCURLY21=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_while_statement1082); 
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
	// Neptune.g:102:1: foreach_statement : FOREACH LPAREN ! IDENTIFIER IN ! IDENTIFIER RPAREN ! LCURLY ! lines RCURLY !;
	public final NeptuneParser.foreach_statement_return foreach_statement() throws RecognitionException {
		NeptuneParser.foreach_statement_return retval = new NeptuneParser.foreach_statement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token FOREACH22=null;
		Token LPAREN23=null;
		Token IDENTIFIER24=null;
		Token IN25=null;
		Token IDENTIFIER26=null;
		Token RPAREN27=null;
		Token LCURLY28=null;
		Token RCURLY30=null;
		ParserRuleReturnScope lines29 =null;

		Object FOREACH22_tree=null;
		Object LPAREN23_tree=null;
		Object IDENTIFIER24_tree=null;
		Object IN25_tree=null;
		Object IDENTIFIER26_tree=null;
		Object RPAREN27_tree=null;
		Object LCURLY28_tree=null;
		Object RCURLY30_tree=null;

		try {
			// Neptune.g:103:2: ( FOREACH LPAREN ! IDENTIFIER IN ! IDENTIFIER RPAREN ! LCURLY ! lines RCURLY !)
			// Neptune.g:103:4: FOREACH LPAREN ! IDENTIFIER IN ! IDENTIFIER RPAREN ! LCURLY ! lines RCURLY !
			{
			root_0 = (Object)adaptor.nil();


			FOREACH22=(Token)match(input,FOREACH,FOLLOW_FOREACH_in_foreach_statement1095); 
			FOREACH22_tree = (Object)adaptor.create(FOREACH22);
			adaptor.addChild(root_0, FOREACH22_tree);

			LPAREN23=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_foreach_statement1097); 
			IDENTIFIER24=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_foreach_statement1100); 
			IDENTIFIER24_tree = (Object)adaptor.create(IDENTIFIER24);
			adaptor.addChild(root_0, IDENTIFIER24_tree);

			IN25=(Token)match(input,IN,FOLLOW_IN_in_foreach_statement1102); 
			IDENTIFIER26=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_foreach_statement1105); 
			IDENTIFIER26_tree = (Object)adaptor.create(IDENTIFIER26);
			adaptor.addChild(root_0, IDENTIFIER26_tree);

			RPAREN27=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_foreach_statement1107); 
			LCURLY28=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_foreach_statement1110); 
			pushFollow(FOLLOW_lines_in_foreach_statement1113);
			lines29=lines();
			state._fsp--;

			adaptor.addChild(root_0, lines29.getTree());

			RCURLY30=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_foreach_statement1115); 
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
	// Neptune.g:106:1: if_statement : IF LPAREN ! expression RPAREN ! LCURLY ! lines RCURLY ! ( ELSIF LPAREN ! expression RPAREN ! LCURLY ! lines RCURLY !)* ( ELSE LCURLY ! lines RCURLY !)? ;
	public final NeptuneParser.if_statement_return if_statement() throws RecognitionException {
		NeptuneParser.if_statement_return retval = new NeptuneParser.if_statement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IF31=null;
		Token LPAREN32=null;
		Token RPAREN34=null;
		Token LCURLY35=null;
		Token RCURLY37=null;
		Token ELSIF38=null;
		Token LPAREN39=null;
		Token RPAREN41=null;
		Token LCURLY42=null;
		Token RCURLY44=null;
		Token ELSE45=null;
		Token LCURLY46=null;
		Token RCURLY48=null;
		ParserRuleReturnScope expression33 =null;
		ParserRuleReturnScope lines36 =null;
		ParserRuleReturnScope expression40 =null;
		ParserRuleReturnScope lines43 =null;
		ParserRuleReturnScope lines47 =null;

		Object IF31_tree=null;
		Object LPAREN32_tree=null;
		Object RPAREN34_tree=null;
		Object LCURLY35_tree=null;
		Object RCURLY37_tree=null;
		Object ELSIF38_tree=null;
		Object LPAREN39_tree=null;
		Object RPAREN41_tree=null;
		Object LCURLY42_tree=null;
		Object RCURLY44_tree=null;
		Object ELSE45_tree=null;
		Object LCURLY46_tree=null;
		Object RCURLY48_tree=null;

		try {
			// Neptune.g:107:2: ( IF LPAREN ! expression RPAREN ! LCURLY ! lines RCURLY ! ( ELSIF LPAREN ! expression RPAREN ! LCURLY ! lines RCURLY !)* ( ELSE LCURLY ! lines RCURLY !)? )
			// Neptune.g:107:4: IF LPAREN ! expression RPAREN ! LCURLY ! lines RCURLY ! ( ELSIF LPAREN ! expression RPAREN ! LCURLY ! lines RCURLY !)* ( ELSE LCURLY ! lines RCURLY !)?
			{
			root_0 = (Object)adaptor.nil();


			IF31=(Token)match(input,IF,FOLLOW_IF_in_if_statement1128); 
			IF31_tree = (Object)adaptor.create(IF31);
			adaptor.addChild(root_0, IF31_tree);

			LPAREN32=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_if_statement1130); 
			pushFollow(FOLLOW_expression_in_if_statement1133);
			expression33=expression();
			state._fsp--;

			adaptor.addChild(root_0, expression33.getTree());

			RPAREN34=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_if_statement1135); 
			LCURLY35=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_if_statement1138); 
			pushFollow(FOLLOW_lines_in_if_statement1141);
			lines36=lines();
			state._fsp--;

			adaptor.addChild(root_0, lines36.getTree());

			RCURLY37=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_if_statement1143); 
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
					ELSIF38=(Token)match(input,ELSIF,FOLLOW_ELSIF_in_if_statement1149); 
					ELSIF38_tree = (Object)adaptor.create(ELSIF38);
					adaptor.addChild(root_0, ELSIF38_tree);

					LPAREN39=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_if_statement1151); 
					pushFollow(FOLLOW_expression_in_if_statement1154);
					expression40=expression();
					state._fsp--;

					adaptor.addChild(root_0, expression40.getTree());

					RPAREN41=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_if_statement1156); 
					LCURLY42=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_if_statement1159); 
					pushFollow(FOLLOW_lines_in_if_statement1162);
					lines43=lines();
					state._fsp--;

					adaptor.addChild(root_0, lines43.getTree());

					RCURLY44=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_if_statement1164); 
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
					ELSE45=(Token)match(input,ELSE,FOLLOW_ELSE_in_if_statement1172); 
					ELSE45_tree = (Object)adaptor.create(ELSE45);
					adaptor.addChild(root_0, ELSE45_tree);

					LCURLY46=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_if_statement1174); 
					pushFollow(FOLLOW_lines_in_if_statement1177);
					lines47=lines();
					state._fsp--;

					adaptor.addChild(root_0, lines47.getTree());

					RCURLY48=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_if_statement1179); 
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
	// Neptune.g:112:1: include_statement : INCLUDE 'ello' ;
	public final NeptuneParser.include_statement_return include_statement() throws RecognitionException {
		NeptuneParser.include_statement_return retval = new NeptuneParser.include_statement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token INCLUDE49=null;
		Token string_literal50=null;

		Object INCLUDE49_tree=null;
		Object string_literal50_tree=null;

		try {
			// Neptune.g:113:2: ( INCLUDE 'ello' )
			// Neptune.g:113:4: INCLUDE 'ello'
			{
			root_0 = (Object)adaptor.nil();


			INCLUDE49=(Token)match(input,INCLUDE,FOLLOW_INCLUDE_in_include_statement1194); 
			INCLUDE49_tree = (Object)adaptor.create(INCLUDE49);
			adaptor.addChild(root_0, INCLUDE49_tree);

			string_literal50=(Token)match(input,51,FOLLOW_51_in_include_statement1196); 
			string_literal50_tree = (Object)adaptor.create(string_literal50);
			adaptor.addChild(root_0, string_literal50_tree);

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
	// Neptune.g:116:1: print_statement : PRINT LPAREN ! expression ( COMMA expression )* RPAREN !;
	public final NeptuneParser.print_statement_return print_statement() throws RecognitionException {
		NeptuneParser.print_statement_return retval = new NeptuneParser.print_statement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token PRINT51=null;
		Token LPAREN52=null;
		Token COMMA54=null;
		Token RPAREN56=null;
		ParserRuleReturnScope expression53 =null;
		ParserRuleReturnScope expression55 =null;

		Object PRINT51_tree=null;
		Object LPAREN52_tree=null;
		Object COMMA54_tree=null;
		Object RPAREN56_tree=null;

		try {
			// Neptune.g:117:2: ( PRINT LPAREN ! expression ( COMMA expression )* RPAREN !)
			// Neptune.g:117:4: PRINT LPAREN ! expression ( COMMA expression )* RPAREN !
			{
			root_0 = (Object)adaptor.nil();


			PRINT51=(Token)match(input,PRINT,FOLLOW_PRINT_in_print_statement1208); 
			PRINT51_tree = (Object)adaptor.create(PRINT51);
			adaptor.addChild(root_0, PRINT51_tree);

			LPAREN52=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_print_statement1210); 
			pushFollow(FOLLOW_expression_in_print_statement1213);
			expression53=expression();
			state._fsp--;

			adaptor.addChild(root_0, expression53.getTree());

			// Neptune.g:117:29: ( COMMA expression )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==COMMA) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// Neptune.g:117:30: COMMA expression
					{
					COMMA54=(Token)match(input,COMMA,FOLLOW_COMMA_in_print_statement1216); 
					COMMA54_tree = (Object)adaptor.create(COMMA54);
					adaptor.addChild(root_0, COMMA54_tree);

					pushFollow(FOLLOW_expression_in_print_statement1218);
					expression55=expression();
					state._fsp--;

					adaptor.addChild(root_0, expression55.getTree());

					}
					break;

				default :
					break loop6;
				}
			}

			RPAREN56=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_print_statement1222); 
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


	public static class declaration_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "declaration"
	// Neptune.g:120:1: declaration : type IDENTIFIER ( BECOMES expression )? ;
	public final NeptuneParser.declaration_return declaration() throws RecognitionException {
		NeptuneParser.declaration_return retval = new NeptuneParser.declaration_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IDENTIFIER58=null;
		Token BECOMES59=null;
		ParserRuleReturnScope type57 =null;
		ParserRuleReturnScope expression60 =null;

		Object IDENTIFIER58_tree=null;
		Object BECOMES59_tree=null;

		try {
			// Neptune.g:121:2: ( type IDENTIFIER ( BECOMES expression )? )
			// Neptune.g:121:4: type IDENTIFIER ( BECOMES expression )?
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_type_in_declaration1235);
			type57=type();
			state._fsp--;

			adaptor.addChild(root_0, type57.getTree());

			IDENTIFIER58=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_declaration1237); 
			IDENTIFIER58_tree = (Object)adaptor.create(IDENTIFIER58);
			adaptor.addChild(root_0, IDENTIFIER58_tree);

			// Neptune.g:121:20: ( BECOMES expression )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==BECOMES) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// Neptune.g:121:21: BECOMES expression
					{
					BECOMES59=(Token)match(input,BECOMES,FOLLOW_BECOMES_in_declaration1240); 
					BECOMES59_tree = (Object)adaptor.create(BECOMES59);
					adaptor.addChild(root_0, BECOMES59_tree);

					pushFollow(FOLLOW_expression_in_declaration1242);
					expression60=expression();
					state._fsp--;

					adaptor.addChild(root_0, expression60.getTree());

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
	// Neptune.g:124:1: expression : assignment_expr ;
	public final NeptuneParser.expression_return expression() throws RecognitionException {
		NeptuneParser.expression_return retval = new NeptuneParser.expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope assignment_expr61 =null;


		try {
			// Neptune.g:125:2: ( assignment_expr )
			// Neptune.g:125:4: assignment_expr
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_assignment_expr_in_expression1256);
			assignment_expr61=assignment_expr();
			state._fsp--;

			adaptor.addChild(root_0, assignment_expr61.getTree());

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
	// Neptune.g:128:1: assignment_expr : boolean_expr ( BECOMES ^ assignment_expr )? ;
	public final NeptuneParser.assignment_expr_return assignment_expr() throws RecognitionException {
		NeptuneParser.assignment_expr_return retval = new NeptuneParser.assignment_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token BECOMES63=null;
		ParserRuleReturnScope boolean_expr62 =null;
		ParserRuleReturnScope assignment_expr64 =null;

		Object BECOMES63_tree=null;

		try {
			// Neptune.g:129:2: ( boolean_expr ( BECOMES ^ assignment_expr )? )
			// Neptune.g:129:4: boolean_expr ( BECOMES ^ assignment_expr )?
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_boolean_expr_in_assignment_expr1267);
			boolean_expr62=boolean_expr();
			state._fsp--;

			adaptor.addChild(root_0, boolean_expr62.getTree());

			// Neptune.g:129:17: ( BECOMES ^ assignment_expr )?
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==BECOMES) ) {
				alt8=1;
			}
			switch (alt8) {
				case 1 :
					// Neptune.g:129:18: BECOMES ^ assignment_expr
					{
					BECOMES63=(Token)match(input,BECOMES,FOLLOW_BECOMES_in_assignment_expr1270); 
					BECOMES63_tree = (Object)adaptor.create(BECOMES63);
					root_0 = (Object)adaptor.becomeRoot(BECOMES63_tree, root_0);

					pushFollow(FOLLOW_assignment_expr_in_assignment_expr1273);
					assignment_expr64=assignment_expr();
					state._fsp--;

					adaptor.addChild(root_0, assignment_expr64.getTree());

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
	// Neptune.g:132:1: boolean_expr : plus_expr ( ( LT ^| LT_EQ ^| GT ^| GT_EQ ^| EQ ^| NEQ ^) plus_expr )* ;
	public final NeptuneParser.boolean_expr_return boolean_expr() throws RecognitionException {
		NeptuneParser.boolean_expr_return retval = new NeptuneParser.boolean_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token LT66=null;
		Token LT_EQ67=null;
		Token GT68=null;
		Token GT_EQ69=null;
		Token EQ70=null;
		Token NEQ71=null;
		ParserRuleReturnScope plus_expr65 =null;
		ParserRuleReturnScope plus_expr72 =null;

		Object LT66_tree=null;
		Object LT_EQ67_tree=null;
		Object GT68_tree=null;
		Object GT_EQ69_tree=null;
		Object EQ70_tree=null;
		Object NEQ71_tree=null;

		try {
			// Neptune.g:133:2: ( plus_expr ( ( LT ^| LT_EQ ^| GT ^| GT_EQ ^| EQ ^| NEQ ^) plus_expr )* )
			// Neptune.g:133:4: plus_expr ( ( LT ^| LT_EQ ^| GT ^| GT_EQ ^| EQ ^| NEQ ^) plus_expr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_plus_expr_in_boolean_expr1287);
			plus_expr65=plus_expr();
			state._fsp--;

			adaptor.addChild(root_0, plus_expr65.getTree());

			// Neptune.g:133:14: ( ( LT ^| LT_EQ ^| GT ^| GT_EQ ^| EQ ^| NEQ ^) plus_expr )*
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==EQ||(LA10_0 >= GT && LA10_0 <= GT_EQ)||(LA10_0 >= LT && LA10_0 <= LT_EQ)||LA10_0==NEQ) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// Neptune.g:133:15: ( LT ^| LT_EQ ^| GT ^| GT_EQ ^| EQ ^| NEQ ^) plus_expr
					{
					// Neptune.g:133:15: ( LT ^| LT_EQ ^| GT ^| GT_EQ ^| EQ ^| NEQ ^)
					int alt9=6;
					switch ( input.LA(1) ) {
					case LT:
						{
						alt9=1;
						}
						break;
					case LT_EQ:
						{
						alt9=2;
						}
						break;
					case GT:
						{
						alt9=3;
						}
						break;
					case GT_EQ:
						{
						alt9=4;
						}
						break;
					case EQ:
						{
						alt9=5;
						}
						break;
					case NEQ:
						{
						alt9=6;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 9, 0, input);
						throw nvae;
					}
					switch (alt9) {
						case 1 :
							// Neptune.g:133:16: LT ^
							{
							LT66=(Token)match(input,LT,FOLLOW_LT_in_boolean_expr1291); 
							LT66_tree = (Object)adaptor.create(LT66);
							root_0 = (Object)adaptor.becomeRoot(LT66_tree, root_0);

							}
							break;
						case 2 :
							// Neptune.g:133:22: LT_EQ ^
							{
							LT_EQ67=(Token)match(input,LT_EQ,FOLLOW_LT_EQ_in_boolean_expr1296); 
							LT_EQ67_tree = (Object)adaptor.create(LT_EQ67);
							root_0 = (Object)adaptor.becomeRoot(LT_EQ67_tree, root_0);

							}
							break;
						case 3 :
							// Neptune.g:133:31: GT ^
							{
							GT68=(Token)match(input,GT,FOLLOW_GT_in_boolean_expr1301); 
							GT68_tree = (Object)adaptor.create(GT68);
							root_0 = (Object)adaptor.becomeRoot(GT68_tree, root_0);

							}
							break;
						case 4 :
							// Neptune.g:133:37: GT_EQ ^
							{
							GT_EQ69=(Token)match(input,GT_EQ,FOLLOW_GT_EQ_in_boolean_expr1306); 
							GT_EQ69_tree = (Object)adaptor.create(GT_EQ69);
							root_0 = (Object)adaptor.becomeRoot(GT_EQ69_tree, root_0);

							}
							break;
						case 5 :
							// Neptune.g:133:46: EQ ^
							{
							EQ70=(Token)match(input,EQ,FOLLOW_EQ_in_boolean_expr1311); 
							EQ70_tree = (Object)adaptor.create(EQ70);
							root_0 = (Object)adaptor.becomeRoot(EQ70_tree, root_0);

							}
							break;
						case 6 :
							// Neptune.g:133:52: NEQ ^
							{
							NEQ71=(Token)match(input,NEQ,FOLLOW_NEQ_in_boolean_expr1316); 
							NEQ71_tree = (Object)adaptor.create(NEQ71);
							root_0 = (Object)adaptor.becomeRoot(NEQ71_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_plus_expr_in_boolean_expr1320);
					plus_expr72=plus_expr();
					state._fsp--;

					adaptor.addChild(root_0, plus_expr72.getTree());

					}
					break;

				default :
					break loop10;
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
	// Neptune.g:136:1: plus_expr : multi_expr ( ( PLUS ^| MINUS ^) multi_expr )* ;
	public final NeptuneParser.plus_expr_return plus_expr() throws RecognitionException {
		NeptuneParser.plus_expr_return retval = new NeptuneParser.plus_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token PLUS74=null;
		Token MINUS75=null;
		ParserRuleReturnScope multi_expr73 =null;
		ParserRuleReturnScope multi_expr76 =null;

		Object PLUS74_tree=null;
		Object MINUS75_tree=null;

		try {
			// Neptune.g:137:2: ( multi_expr ( ( PLUS ^| MINUS ^) multi_expr )* )
			// Neptune.g:137:4: multi_expr ( ( PLUS ^| MINUS ^) multi_expr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_multi_expr_in_plus_expr1333);
			multi_expr73=multi_expr();
			state._fsp--;

			adaptor.addChild(root_0, multi_expr73.getTree());

			// Neptune.g:137:15: ( ( PLUS ^| MINUS ^) multi_expr )*
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( (LA12_0==MINUS||LA12_0==PLUS) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// Neptune.g:137:16: ( PLUS ^| MINUS ^) multi_expr
					{
					// Neptune.g:137:16: ( PLUS ^| MINUS ^)
					int alt11=2;
					int LA11_0 = input.LA(1);
					if ( (LA11_0==PLUS) ) {
						alt11=1;
					}
					else if ( (LA11_0==MINUS) ) {
						alt11=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 11, 0, input);
						throw nvae;
					}

					switch (alt11) {
						case 1 :
							// Neptune.g:137:17: PLUS ^
							{
							PLUS74=(Token)match(input,PLUS,FOLLOW_PLUS_in_plus_expr1337); 
							PLUS74_tree = (Object)adaptor.create(PLUS74);
							root_0 = (Object)adaptor.becomeRoot(PLUS74_tree, root_0);

							}
							break;
						case 2 :
							// Neptune.g:137:25: MINUS ^
							{
							MINUS75=(Token)match(input,MINUS,FOLLOW_MINUS_in_plus_expr1342); 
							MINUS75_tree = (Object)adaptor.create(MINUS75);
							root_0 = (Object)adaptor.becomeRoot(MINUS75_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_multi_expr_in_plus_expr1346);
					multi_expr76=multi_expr();
					state._fsp--;

					adaptor.addChild(root_0, multi_expr76.getTree());

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
	// $ANTLR end "plus_expr"


	public static class multi_expr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "multi_expr"
	// Neptune.g:140:1: multi_expr : operand ( ( TIMES ^| DIVIDE ^) operand )* ;
	public final NeptuneParser.multi_expr_return multi_expr() throws RecognitionException {
		NeptuneParser.multi_expr_return retval = new NeptuneParser.multi_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token TIMES78=null;
		Token DIVIDE79=null;
		ParserRuleReturnScope operand77 =null;
		ParserRuleReturnScope operand80 =null;

		Object TIMES78_tree=null;
		Object DIVIDE79_tree=null;

		try {
			// Neptune.g:141:2: ( operand ( ( TIMES ^| DIVIDE ^) operand )* )
			// Neptune.g:141:4: operand ( ( TIMES ^| DIVIDE ^) operand )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_operand_in_multi_expr1359);
			operand77=operand();
			state._fsp--;

			adaptor.addChild(root_0, operand77.getTree());

			// Neptune.g:141:12: ( ( TIMES ^| DIVIDE ^) operand )*
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( (LA14_0==DIVIDE||LA14_0==TIMES) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// Neptune.g:141:13: ( TIMES ^| DIVIDE ^) operand
					{
					// Neptune.g:141:13: ( TIMES ^| DIVIDE ^)
					int alt13=2;
					int LA13_0 = input.LA(1);
					if ( (LA13_0==TIMES) ) {
						alt13=1;
					}
					else if ( (LA13_0==DIVIDE) ) {
						alt13=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 13, 0, input);
						throw nvae;
					}

					switch (alt13) {
						case 1 :
							// Neptune.g:141:14: TIMES ^
							{
							TIMES78=(Token)match(input,TIMES,FOLLOW_TIMES_in_multi_expr1363); 
							TIMES78_tree = (Object)adaptor.create(TIMES78);
							root_0 = (Object)adaptor.becomeRoot(TIMES78_tree, root_0);

							}
							break;
						case 2 :
							// Neptune.g:141:23: DIVIDE ^
							{
							DIVIDE79=(Token)match(input,DIVIDE,FOLLOW_DIVIDE_in_multi_expr1368); 
							DIVIDE79_tree = (Object)adaptor.create(DIVIDE79);
							root_0 = (Object)adaptor.becomeRoot(DIVIDE79_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_operand_in_multi_expr1372);
					operand80=operand();
					state._fsp--;

					adaptor.addChild(root_0, operand80.getTree());

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
	// $ANTLR end "multi_expr"


	public static class operand_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "operand"
	// Neptune.g:144:1: operand : ( IDENTIFIER | NUMBER | LPAREN ! assignment_expr RPAREN !| LCURLY expression ( COMMA expression )* RCURLY -> ^( ARRAY_SET ( expression )+ ) );
	public final NeptuneParser.operand_return operand() throws RecognitionException {
		NeptuneParser.operand_return retval = new NeptuneParser.operand_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IDENTIFIER81=null;
		Token NUMBER82=null;
		Token LPAREN83=null;
		Token RPAREN85=null;
		Token LCURLY86=null;
		Token COMMA88=null;
		Token RCURLY90=null;
		ParserRuleReturnScope assignment_expr84 =null;
		ParserRuleReturnScope expression87 =null;
		ParserRuleReturnScope expression89 =null;

		Object IDENTIFIER81_tree=null;
		Object NUMBER82_tree=null;
		Object LPAREN83_tree=null;
		Object RPAREN85_tree=null;
		Object LCURLY86_tree=null;
		Object COMMA88_tree=null;
		Object RCURLY90_tree=null;
		RewriteRuleTokenStream stream_LCURLY=new RewriteRuleTokenStream(adaptor,"token LCURLY");
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_RCURLY=new RewriteRuleTokenStream(adaptor,"token RCURLY");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try {
			// Neptune.g:145:5: ( IDENTIFIER | NUMBER | LPAREN ! assignment_expr RPAREN !| LCURLY expression ( COMMA expression )* RCURLY -> ^( ARRAY_SET ( expression )+ ) )
			int alt16=4;
			switch ( input.LA(1) ) {
			case IDENTIFIER:
				{
				alt16=1;
				}
				break;
			case NUMBER:
				{
				alt16=2;
				}
				break;
			case LPAREN:
				{
				alt16=3;
				}
				break;
			case LCURLY:
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
					// Neptune.g:145:9: IDENTIFIER
					{
					root_0 = (Object)adaptor.nil();


					IDENTIFIER81=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_operand1390); 
					IDENTIFIER81_tree = (Object)adaptor.create(IDENTIFIER81);
					adaptor.addChild(root_0, IDENTIFIER81_tree);

					}
					break;
				case 2 :
					// Neptune.g:146:9: NUMBER
					{
					root_0 = (Object)adaptor.nil();


					NUMBER82=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_operand1400); 
					NUMBER82_tree = (Object)adaptor.create(NUMBER82);
					adaptor.addChild(root_0, NUMBER82_tree);

					}
					break;
				case 3 :
					// Neptune.g:147:9: LPAREN ! assignment_expr RPAREN !
					{
					root_0 = (Object)adaptor.nil();


					LPAREN83=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_operand1410); 
					pushFollow(FOLLOW_assignment_expr_in_operand1413);
					assignment_expr84=assignment_expr();
					state._fsp--;

					adaptor.addChild(root_0, assignment_expr84.getTree());

					RPAREN85=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_operand1415); 
					}
					break;
				case 4 :
					// Neptune.g:148:4: LCURLY expression ( COMMA expression )* RCURLY
					{
					LCURLY86=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_operand1421);  
					stream_LCURLY.add(LCURLY86);

					pushFollow(FOLLOW_expression_in_operand1423);
					expression87=expression();
					state._fsp--;

					stream_expression.add(expression87.getTree());
					// Neptune.g:148:22: ( COMMA expression )*
					loop15:
					while (true) {
						int alt15=2;
						int LA15_0 = input.LA(1);
						if ( (LA15_0==COMMA) ) {
							alt15=1;
						}

						switch (alt15) {
						case 1 :
							// Neptune.g:148:23: COMMA expression
							{
							COMMA88=(Token)match(input,COMMA,FOLLOW_COMMA_in_operand1426);  
							stream_COMMA.add(COMMA88);

							pushFollow(FOLLOW_expression_in_operand1428);
							expression89=expression();
							state._fsp--;

							stream_expression.add(expression89.getTree());
							}
							break;

						default :
							break loop15;
						}
					}

					RCURLY90=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_operand1432);  
					stream_RCURLY.add(RCURLY90);

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
					// 149:3: -> ^( ARRAY_SET ( expression )+ )
					{
						// Neptune.g:149:6: ^( ARRAY_SET ( expression )+ )
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
	// Neptune.g:152:1: type : ( INTEGER ( array_def )? | CHAR ( array_def )? | BOOLEAN ( array_def )? );
	public final NeptuneParser.type_return type() throws RecognitionException {
		NeptuneParser.type_return retval = new NeptuneParser.type_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token INTEGER91=null;
		Token CHAR93=null;
		Token BOOLEAN95=null;
		ParserRuleReturnScope array_def92 =null;
		ParserRuleReturnScope array_def94 =null;
		ParserRuleReturnScope array_def96 =null;

		Object INTEGER91_tree=null;
		Object CHAR93_tree=null;
		Object BOOLEAN95_tree=null;

		try {
			// Neptune.g:153:2: ( INTEGER ( array_def )? | CHAR ( array_def )? | BOOLEAN ( array_def )? )
			int alt20=3;
			switch ( input.LA(1) ) {
			case INTEGER:
				{
				alt20=1;
				}
				break;
			case CHAR:
				{
				alt20=2;
				}
				break;
			case BOOLEAN:
				{
				alt20=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 20, 0, input);
				throw nvae;
			}
			switch (alt20) {
				case 1 :
					// Neptune.g:153:4: INTEGER ( array_def )?
					{
					root_0 = (Object)adaptor.nil();


					INTEGER91=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_type1457); 
					INTEGER91_tree = (Object)adaptor.create(INTEGER91);
					adaptor.addChild(root_0, INTEGER91_tree);

					// Neptune.g:153:12: ( array_def )?
					int alt17=2;
					int LA17_0 = input.LA(1);
					if ( (LA17_0==LBRACKET) ) {
						alt17=1;
					}
					switch (alt17) {
						case 1 :
							// Neptune.g:153:12: array_def
							{
							pushFollow(FOLLOW_array_def_in_type1459);
							array_def92=array_def();
							state._fsp--;

							adaptor.addChild(root_0, array_def92.getTree());

							}
							break;

					}

					}
					break;
				case 2 :
					// Neptune.g:154:4: CHAR ( array_def )?
					{
					root_0 = (Object)adaptor.nil();


					CHAR93=(Token)match(input,CHAR,FOLLOW_CHAR_in_type1465); 
					CHAR93_tree = (Object)adaptor.create(CHAR93);
					adaptor.addChild(root_0, CHAR93_tree);

					// Neptune.g:154:9: ( array_def )?
					int alt18=2;
					int LA18_0 = input.LA(1);
					if ( (LA18_0==LBRACKET) ) {
						alt18=1;
					}
					switch (alt18) {
						case 1 :
							// Neptune.g:154:9: array_def
							{
							pushFollow(FOLLOW_array_def_in_type1467);
							array_def94=array_def();
							state._fsp--;

							adaptor.addChild(root_0, array_def94.getTree());

							}
							break;

					}

					}
					break;
				case 3 :
					// Neptune.g:155:4: BOOLEAN ( array_def )?
					{
					root_0 = (Object)adaptor.nil();


					BOOLEAN95=(Token)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_type1473); 
					BOOLEAN95_tree = (Object)adaptor.create(BOOLEAN95);
					adaptor.addChild(root_0, BOOLEAN95_tree);

					// Neptune.g:155:12: ( array_def )?
					int alt19=2;
					int LA19_0 = input.LA(1);
					if ( (LA19_0==LBRACKET) ) {
						alt19=1;
					}
					switch (alt19) {
						case 1 :
							// Neptune.g:155:12: array_def
							{
							pushFollow(FOLLOW_array_def_in_type1475);
							array_def96=array_def();
							state._fsp--;

							adaptor.addChild(root_0, array_def96.getTree());

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
	// Neptune.g:158:1: array_def : LBRACKET ( NUMBER )? RBRACKET ;
	public final NeptuneParser.array_def_return array_def() throws RecognitionException {
		NeptuneParser.array_def_return retval = new NeptuneParser.array_def_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token LBRACKET97=null;
		Token NUMBER98=null;
		Token RBRACKET99=null;

		Object LBRACKET97_tree=null;
		Object NUMBER98_tree=null;
		Object RBRACKET99_tree=null;

		try {
			// Neptune.g:159:2: ( LBRACKET ( NUMBER )? RBRACKET )
			// Neptune.g:159:5: LBRACKET ( NUMBER )? RBRACKET
			{
			root_0 = (Object)adaptor.nil();


			LBRACKET97=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_array_def1489); 
			LBRACKET97_tree = (Object)adaptor.create(LBRACKET97);
			adaptor.addChild(root_0, LBRACKET97_tree);

			// Neptune.g:159:14: ( NUMBER )?
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0==NUMBER) ) {
				alt21=1;
			}
			switch (alt21) {
				case 1 :
					// Neptune.g:159:14: NUMBER
					{
					NUMBER98=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_array_def1491); 
					NUMBER98_tree = (Object)adaptor.create(NUMBER98);
					adaptor.addChild(root_0, NUMBER98_tree);

					}
					break;

			}

			RBRACKET99=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_array_def1494); 
			RBRACKET99_tree = (Object)adaptor.create(RBRACKET99);
			adaptor.addChild(root_0, RBRACKET99_tree);

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



	public static final BitSet FOLLOW_lines_in_program953 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_program955 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_line_in_lines990 = new BitSet(new long[]{0x000200A12D8800C2L});
	public static final BitSet FOLLOW_expression_in_line1003 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_line1005 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declaration_in_line1011 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_line1013 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_print_statement_in_line1019 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_line1021 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_include_statement_in_line1027 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_logic_statement_in_line1032 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_while_statement_in_logic_statement1044 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_foreach_statement_in_logic_statement1049 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_if_statement_in_logic_statement1054 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHILE_in_while_statement1067 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_LPAREN_in_while_statement1069 = new BitSet(new long[]{0x0000002120800000L});
	public static final BitSet FOLLOW_expression_in_while_statement1072 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_RPAREN_in_while_statement1074 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_LCURLY_in_while_statement1077 = new BitSet(new long[]{0x000200A12D8800C0L});
	public static final BitSet FOLLOW_lines_in_while_statement1080 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_RCURLY_in_while_statement1082 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FOREACH_in_foreach_statement1095 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_LPAREN_in_foreach_statement1097 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_foreach_statement1100 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_IN_in_foreach_statement1102 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_foreach_statement1105 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_RPAREN_in_foreach_statement1107 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_LCURLY_in_foreach_statement1110 = new BitSet(new long[]{0x000200A12D8800C0L});
	public static final BitSet FOLLOW_lines_in_foreach_statement1113 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_RCURLY_in_foreach_statement1115 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_if_statement1128 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_LPAREN_in_if_statement1130 = new BitSet(new long[]{0x0000002120800000L});
	public static final BitSet FOLLOW_expression_in_if_statement1133 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_RPAREN_in_if_statement1135 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_LCURLY_in_if_statement1138 = new BitSet(new long[]{0x000200A12D8800C0L});
	public static final BitSet FOLLOW_lines_in_if_statement1141 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_RCURLY_in_if_statement1143 = new BitSet(new long[]{0x0000000000030002L});
	public static final BitSet FOLLOW_ELSIF_in_if_statement1149 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_LPAREN_in_if_statement1151 = new BitSet(new long[]{0x0000002120800000L});
	public static final BitSet FOLLOW_expression_in_if_statement1154 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_RPAREN_in_if_statement1156 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_LCURLY_in_if_statement1159 = new BitSet(new long[]{0x000200A12D8800C0L});
	public static final BitSet FOLLOW_lines_in_if_statement1162 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_RCURLY_in_if_statement1164 = new BitSet(new long[]{0x0000000000030002L});
	public static final BitSet FOLLOW_ELSE_in_if_statement1172 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_LCURLY_in_if_statement1174 = new BitSet(new long[]{0x000200A12D8800C0L});
	public static final BitSet FOLLOW_lines_in_if_statement1177 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_RCURLY_in_if_statement1179 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INCLUDE_in_include_statement1194 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_51_in_include_statement1196 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRINT_in_print_statement1208 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_LPAREN_in_print_statement1210 = new BitSet(new long[]{0x0000002120800000L});
	public static final BitSet FOLLOW_expression_in_print_statement1213 = new BitSet(new long[]{0x0000100000000200L});
	public static final BitSet FOLLOW_COMMA_in_print_statement1216 = new BitSet(new long[]{0x0000002120800000L});
	public static final BitSet FOLLOW_expression_in_print_statement1218 = new BitSet(new long[]{0x0000100000000200L});
	public static final BitSet FOLLOW_RPAREN_in_print_statement1222 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_declaration1235 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_declaration1237 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_BECOMES_in_declaration1240 = new BitSet(new long[]{0x0000002120800000L});
	public static final BitSet FOLLOW_expression_in_declaration1242 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignment_expr_in_expression1256 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_boolean_expr_in_assignment_expr1267 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_BECOMES_in_assignment_expr1270 = new BitSet(new long[]{0x0000002120800000L});
	public static final BitSet FOLLOW_assignment_expr_in_assignment_expr1273 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_plus_expr_in_boolean_expr1287 = new BitSet(new long[]{0x0000001600640002L});
	public static final BitSet FOLLOW_LT_in_boolean_expr1291 = new BitSet(new long[]{0x0000002120800000L});
	public static final BitSet FOLLOW_LT_EQ_in_boolean_expr1296 = new BitSet(new long[]{0x0000002120800000L});
	public static final BitSet FOLLOW_GT_in_boolean_expr1301 = new BitSet(new long[]{0x0000002120800000L});
	public static final BitSet FOLLOW_GT_EQ_in_boolean_expr1306 = new BitSet(new long[]{0x0000002120800000L});
	public static final BitSet FOLLOW_EQ_in_boolean_expr1311 = new BitSet(new long[]{0x0000002120800000L});
	public static final BitSet FOLLOW_NEQ_in_boolean_expr1316 = new BitSet(new long[]{0x0000002120800000L});
	public static final BitSet FOLLOW_plus_expr_in_boolean_expr1320 = new BitSet(new long[]{0x0000001600640002L});
	public static final BitSet FOLLOW_multi_expr_in_plus_expr1333 = new BitSet(new long[]{0x0000004800000002L});
	public static final BitSet FOLLOW_PLUS_in_plus_expr1337 = new BitSet(new long[]{0x0000002120800000L});
	public static final BitSet FOLLOW_MINUS_in_plus_expr1342 = new BitSet(new long[]{0x0000002120800000L});
	public static final BitSet FOLLOW_multi_expr_in_plus_expr1346 = new BitSet(new long[]{0x0000004800000002L});
	public static final BitSet FOLLOW_operand_in_multi_expr1359 = new BitSet(new long[]{0x0000800000002002L});
	public static final BitSet FOLLOW_TIMES_in_multi_expr1363 = new BitSet(new long[]{0x0000002120800000L});
	public static final BitSet FOLLOW_DIVIDE_in_multi_expr1368 = new BitSet(new long[]{0x0000002120800000L});
	public static final BitSet FOLLOW_operand_in_multi_expr1372 = new BitSet(new long[]{0x0000800000002002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_operand1390 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMBER_in_operand1400 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_operand1410 = new BitSet(new long[]{0x0000002120800000L});
	public static final BitSet FOLLOW_assignment_expr_in_operand1413 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_RPAREN_in_operand1415 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LCURLY_in_operand1421 = new BitSet(new long[]{0x0000002120800000L});
	public static final BitSet FOLLOW_expression_in_operand1423 = new BitSet(new long[]{0x0000040000000200L});
	public static final BitSet FOLLOW_COMMA_in_operand1426 = new BitSet(new long[]{0x0000002120800000L});
	public static final BitSet FOLLOW_expression_in_operand1428 = new BitSet(new long[]{0x0000040000000200L});
	public static final BitSet FOLLOW_RCURLY_in_operand1432 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTEGER_in_type1457 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_array_def_in_type1459 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_in_type1465 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_array_def_in_type1467 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOLEAN_in_type1473 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_array_def_in_type1475 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACKET_in_array_def1489 = new BitSet(new long[]{0x0000022000000000L});
	public static final BitSet FOLLOW_NUMBER_in_array_def1491 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_RBRACKET_in_array_def1494 = new BitSet(new long[]{0x0000000000000002L});
}

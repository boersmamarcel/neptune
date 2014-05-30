// $ANTLR 3.5.2 Neptune.g 2014-05-30 14:31:42

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
		"DQUOTE", "ELSE", "ELSIF", "EQ", "FALSE", "FOREACH", "FUNCTION", "GT", 
		"GT_EQ", "IDENTIFIER", "IF", "IN", "INCLUDE", "INTEGER", "LBRACKET", "LCURLY", 
		"LETTER", "LOWER", "LPAREN", "LT", "LT_EQ", "MINUS", "NEQ", "NUMBER", 
		"PLUS", "PRINT", "PROGRAM", "QUOTE", "RBRACKET", "RCURLY", "READ", "RETURN", 
		"RPAREN", "SEMICOLON", "STRING", "THEN", "TIMES", "TRUE", "UPPER", "VAR", 
		"WHILE", "WS", "'ello'"
	};
	public static final int EOF=-1;
	public static final int T__57=57;
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
	public static final int STRING=49;
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
	// Neptune.g:78:1: program : lines EOF -> ^( PROGRAM lines ) ;
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
			// Neptune.g:79:5: ( lines EOF -> ^( PROGRAM lines ) )
			// Neptune.g:79:9: lines EOF
			{
			pushFollow(FOLLOW_lines_in_program1020);
			lines1=lines();
			state._fsp--;

			stream_lines.add(lines1.getTree());
			EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_program1022);  
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
			// 80:13: -> ^( PROGRAM lines )
			{
				// Neptune.g:80:17: ^( PROGRAM lines )
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
	// Neptune.g:83:1: lines : ( line )+ ;
	public final NeptuneParser.lines_return lines() throws RecognitionException {
		NeptuneParser.lines_return retval = new NeptuneParser.lines_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope line3 =null;


		try {
			// Neptune.g:84:2: ( ( line )+ )
			// Neptune.g:84:4: ( line )+
			{
			root_0 = (Object)adaptor.nil();


			// Neptune.g:84:4: ( line )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==CONST||(LA1_0 >= FALSE && LA1_0 <= FOREACH)||(LA1_0 >= IDENTIFIER && LA1_0 <= IF)||LA1_0==INCLUDE||LA1_0==LCURLY||LA1_0==LPAREN||LA1_0==NUMBER||LA1_0==PRINT||LA1_0==QUOTE||LA1_0==READ||LA1_0==STRING||LA1_0==TRUE||(LA1_0 >= VAR && LA1_0 <= WHILE)) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// Neptune.g:84:4: line
					{
					pushFollow(FOLLOW_line_in_lines1057);
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
	// Neptune.g:87:1: line : ( expression SEMICOLON !| declaration SEMICOLON !| include_statement | logic_statement );
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
			// Neptune.g:88:2: ( expression SEMICOLON !| declaration SEMICOLON !| include_statement | logic_statement )
			int alt2=4;
			switch ( input.LA(1) ) {
			case FALSE:
			case IDENTIFIER:
			case LCURLY:
			case LPAREN:
			case NUMBER:
			case PRINT:
			case QUOTE:
			case READ:
			case STRING:
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
					// Neptune.g:88:4: expression SEMICOLON !
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_expression_in_line1070);
					expression4=expression();
					state._fsp--;

					adaptor.addChild(root_0, expression4.getTree());

					SEMICOLON5=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_line1072); 
					}
					break;
				case 2 :
					// Neptune.g:89:4: declaration SEMICOLON !
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_declaration_in_line1078);
					declaration6=declaration();
					state._fsp--;

					adaptor.addChild(root_0, declaration6.getTree());

					SEMICOLON7=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_line1080); 
					}
					break;
				case 3 :
					// Neptune.g:90:4: include_statement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_include_statement_in_line1086);
					include_statement8=include_statement();
					state._fsp--;

					adaptor.addChild(root_0, include_statement8.getTree());

					}
					break;
				case 4 :
					// Neptune.g:91:4: logic_statement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_logic_statement_in_line1091);
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
	// Neptune.g:94:1: logic_statement : ( while_statement | foreach_statement | if_statement );
	public final NeptuneParser.logic_statement_return logic_statement() throws RecognitionException {
		NeptuneParser.logic_statement_return retval = new NeptuneParser.logic_statement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope while_statement10 =null;
		ParserRuleReturnScope foreach_statement11 =null;
		ParserRuleReturnScope if_statement12 =null;


		try {
			// Neptune.g:95:2: ( while_statement | foreach_statement | if_statement )
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
					// Neptune.g:95:4: while_statement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_while_statement_in_logic_statement1103);
					while_statement10=while_statement();
					state._fsp--;

					adaptor.addChild(root_0, while_statement10.getTree());

					}
					break;
				case 2 :
					// Neptune.g:96:4: foreach_statement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_foreach_statement_in_logic_statement1108);
					foreach_statement11=foreach_statement();
					state._fsp--;

					adaptor.addChild(root_0, foreach_statement11.getTree());

					}
					break;
				case 3 :
					// Neptune.g:97:4: if_statement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_if_statement_in_logic_statement1113);
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
	// Neptune.g:100:1: while_statement : WHILE ^ LPAREN ! expression RPAREN ! LCURLY ! lines RCURLY !;
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
			// Neptune.g:101:2: ( WHILE ^ LPAREN ! expression RPAREN ! LCURLY ! lines RCURLY !)
			// Neptune.g:101:4: WHILE ^ LPAREN ! expression RPAREN ! LCURLY ! lines RCURLY !
			{
			root_0 = (Object)adaptor.nil();


			WHILE13=(Token)match(input,WHILE,FOLLOW_WHILE_in_while_statement1125); 
			WHILE13_tree = (Object)adaptor.create(WHILE13);
			root_0 = (Object)adaptor.becomeRoot(WHILE13_tree, root_0);

			LPAREN14=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_while_statement1128); 
			pushFollow(FOLLOW_expression_in_while_statement1131);
			expression15=expression();
			state._fsp--;

			adaptor.addChild(root_0, expression15.getTree());

			RPAREN16=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_while_statement1133); 
			LCURLY17=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_while_statement1136); 
			pushFollow(FOLLOW_lines_in_while_statement1139);
			lines18=lines();
			state._fsp--;

			adaptor.addChild(root_0, lines18.getTree());

			RCURLY19=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_while_statement1141); 
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
	// Neptune.g:104:1: foreach_statement : FOREACH ^ LPAREN ! IDENTIFIER IN ! IDENTIFIER RPAREN ! LCURLY ! lines RCURLY !;
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
			// Neptune.g:105:2: ( FOREACH ^ LPAREN ! IDENTIFIER IN ! IDENTIFIER RPAREN ! LCURLY ! lines RCURLY !)
			// Neptune.g:105:4: FOREACH ^ LPAREN ! IDENTIFIER IN ! IDENTIFIER RPAREN ! LCURLY ! lines RCURLY !
			{
			root_0 = (Object)adaptor.nil();


			FOREACH20=(Token)match(input,FOREACH,FOLLOW_FOREACH_in_foreach_statement1154); 
			FOREACH20_tree = (Object)adaptor.create(FOREACH20);
			root_0 = (Object)adaptor.becomeRoot(FOREACH20_tree, root_0);

			LPAREN21=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_foreach_statement1157); 
			IDENTIFIER22=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_foreach_statement1160); 
			IDENTIFIER22_tree = (Object)adaptor.create(IDENTIFIER22);
			adaptor.addChild(root_0, IDENTIFIER22_tree);

			IN23=(Token)match(input,IN,FOLLOW_IN_in_foreach_statement1162); 
			IDENTIFIER24=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_foreach_statement1165); 
			IDENTIFIER24_tree = (Object)adaptor.create(IDENTIFIER24);
			adaptor.addChild(root_0, IDENTIFIER24_tree);

			RPAREN25=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_foreach_statement1167); 
			LCURLY26=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_foreach_statement1170); 
			pushFollow(FOLLOW_lines_in_foreach_statement1173);
			lines27=lines();
			state._fsp--;

			adaptor.addChild(root_0, lines27.getTree());

			RCURLY28=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_foreach_statement1175); 
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
	// Neptune.g:108:1: if_statement : IF ^ LPAREN ! expression RPAREN ! LCURLY ! lines RCURLY ! ( ELSIF LPAREN ! expression RPAREN ! LCURLY ! lines RCURLY !)* ( ELSE LCURLY ! lines RCURLY !)? ;
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
			// Neptune.g:109:2: ( IF ^ LPAREN ! expression RPAREN ! LCURLY ! lines RCURLY ! ( ELSIF LPAREN ! expression RPAREN ! LCURLY ! lines RCURLY !)* ( ELSE LCURLY ! lines RCURLY !)? )
			// Neptune.g:109:4: IF ^ LPAREN ! expression RPAREN ! LCURLY ! lines RCURLY ! ( ELSIF LPAREN ! expression RPAREN ! LCURLY ! lines RCURLY !)* ( ELSE LCURLY ! lines RCURLY !)?
			{
			root_0 = (Object)adaptor.nil();


			IF29=(Token)match(input,IF,FOLLOW_IF_in_if_statement1188); 
			IF29_tree = (Object)adaptor.create(IF29);
			root_0 = (Object)adaptor.becomeRoot(IF29_tree, root_0);

			LPAREN30=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_if_statement1191); 
			pushFollow(FOLLOW_expression_in_if_statement1194);
			expression31=expression();
			state._fsp--;

			adaptor.addChild(root_0, expression31.getTree());

			RPAREN32=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_if_statement1196); 
			LCURLY33=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_if_statement1199); 
			pushFollow(FOLLOW_lines_in_if_statement1202);
			lines34=lines();
			state._fsp--;

			adaptor.addChild(root_0, lines34.getTree());

			RCURLY35=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_if_statement1204); 
			// Neptune.g:110:3: ( ELSIF LPAREN ! expression RPAREN ! LCURLY ! lines RCURLY !)*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==ELSIF) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// Neptune.g:110:4: ELSIF LPAREN ! expression RPAREN ! LCURLY ! lines RCURLY !
					{
					ELSIF36=(Token)match(input,ELSIF,FOLLOW_ELSIF_in_if_statement1210); 
					ELSIF36_tree = (Object)adaptor.create(ELSIF36);
					adaptor.addChild(root_0, ELSIF36_tree);

					LPAREN37=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_if_statement1212); 
					pushFollow(FOLLOW_expression_in_if_statement1215);
					expression38=expression();
					state._fsp--;

					adaptor.addChild(root_0, expression38.getTree());

					RPAREN39=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_if_statement1217); 
					LCURLY40=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_if_statement1220); 
					pushFollow(FOLLOW_lines_in_if_statement1223);
					lines41=lines();
					state._fsp--;

					adaptor.addChild(root_0, lines41.getTree());

					RCURLY42=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_if_statement1225); 
					}
					break;

				default :
					break loop4;
				}
			}

			// Neptune.g:111:3: ( ELSE LCURLY ! lines RCURLY !)?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==ELSE) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// Neptune.g:111:4: ELSE LCURLY ! lines RCURLY !
					{
					ELSE43=(Token)match(input,ELSE,FOLLOW_ELSE_in_if_statement1233); 
					ELSE43_tree = (Object)adaptor.create(ELSE43);
					adaptor.addChild(root_0, ELSE43_tree);

					LCURLY44=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_if_statement1235); 
					pushFollow(FOLLOW_lines_in_if_statement1238);
					lines45=lines();
					state._fsp--;

					adaptor.addChild(root_0, lines45.getTree());

					RCURLY46=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_if_statement1240); 
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
	// Neptune.g:114:1: include_statement : INCLUDE ^ 'ello' ;
	public final NeptuneParser.include_statement_return include_statement() throws RecognitionException {
		NeptuneParser.include_statement_return retval = new NeptuneParser.include_statement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token INCLUDE47=null;
		Token string_literal48=null;

		Object INCLUDE47_tree=null;
		Object string_literal48_tree=null;

		try {
			// Neptune.g:115:2: ( INCLUDE ^ 'ello' )
			// Neptune.g:115:4: INCLUDE ^ 'ello'
			{
			root_0 = (Object)adaptor.nil();


			INCLUDE47=(Token)match(input,INCLUDE,FOLLOW_INCLUDE_in_include_statement1255); 
			INCLUDE47_tree = (Object)adaptor.create(INCLUDE47);
			root_0 = (Object)adaptor.becomeRoot(INCLUDE47_tree, root_0);

			string_literal48=(Token)match(input,57,FOLLOW_57_in_include_statement1258); 
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
	// Neptune.g:118:1: print_statement : PRINT ^ LPAREN ! expression ( COMMA expression )* RPAREN !;
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
			// Neptune.g:119:2: ( PRINT ^ LPAREN ! expression ( COMMA expression )* RPAREN !)
			// Neptune.g:119:4: PRINT ^ LPAREN ! expression ( COMMA expression )* RPAREN !
			{
			root_0 = (Object)adaptor.nil();


			PRINT49=(Token)match(input,PRINT,FOLLOW_PRINT_in_print_statement1270); 
			PRINT49_tree = (Object)adaptor.create(PRINT49);
			root_0 = (Object)adaptor.becomeRoot(PRINT49_tree, root_0);

			LPAREN50=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_print_statement1273); 
			pushFollow(FOLLOW_expression_in_print_statement1276);
			expression51=expression();
			state._fsp--;

			adaptor.addChild(root_0, expression51.getTree());

			// Neptune.g:119:30: ( COMMA expression )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==COMMA) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// Neptune.g:119:31: COMMA expression
					{
					COMMA52=(Token)match(input,COMMA,FOLLOW_COMMA_in_print_statement1279); 
					COMMA52_tree = (Object)adaptor.create(COMMA52);
					adaptor.addChild(root_0, COMMA52_tree);

					pushFollow(FOLLOW_expression_in_print_statement1281);
					expression53=expression();
					state._fsp--;

					adaptor.addChild(root_0, expression53.getTree());

					}
					break;

				default :
					break loop6;
				}
			}

			RPAREN54=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_print_statement1285); 
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
	// Neptune.g:122:1: read_statement : READ ^ LPAREN ! expression ( COMMA expression )* RPAREN !;
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
			// Neptune.g:123:2: ( READ ^ LPAREN ! expression ( COMMA expression )* RPAREN !)
			// Neptune.g:123:4: READ ^ LPAREN ! expression ( COMMA expression )* RPAREN !
			{
			root_0 = (Object)adaptor.nil();


			READ55=(Token)match(input,READ,FOLLOW_READ_in_read_statement1298); 
			READ55_tree = (Object)adaptor.create(READ55);
			root_0 = (Object)adaptor.becomeRoot(READ55_tree, root_0);

			LPAREN56=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_read_statement1301); 
			pushFollow(FOLLOW_expression_in_read_statement1304);
			expression57=expression();
			state._fsp--;

			adaptor.addChild(root_0, expression57.getTree());

			// Neptune.g:123:29: ( COMMA expression )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==COMMA) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// Neptune.g:123:30: COMMA expression
					{
					COMMA58=(Token)match(input,COMMA,FOLLOW_COMMA_in_read_statement1307); 
					COMMA58_tree = (Object)adaptor.create(COMMA58);
					adaptor.addChild(root_0, COMMA58_tree);

					pushFollow(FOLLOW_expression_in_read_statement1309);
					expression59=expression();
					state._fsp--;

					adaptor.addChild(root_0, expression59.getTree());

					}
					break;

				default :
					break loop7;
				}
			}

			RPAREN60=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_read_statement1313); 
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
	// Neptune.g:126:1: declaration : ( VAR ^ type IDENTIFIER ( BECOMES expression )? | CONST ^ type IDENTIFIER BECOMES expression );
	public final NeptuneParser.declaration_return declaration() throws RecognitionException {
		NeptuneParser.declaration_return retval = new NeptuneParser.declaration_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token VAR61=null;
		Token IDENTIFIER63=null;
		Token BECOMES64=null;
		Token CONST66=null;
		Token IDENTIFIER68=null;
		Token BECOMES69=null;
		ParserRuleReturnScope type62 =null;
		ParserRuleReturnScope expression65 =null;
		ParserRuleReturnScope type67 =null;
		ParserRuleReturnScope expression70 =null;

		Object VAR61_tree=null;
		Object IDENTIFIER63_tree=null;
		Object BECOMES64_tree=null;
		Object CONST66_tree=null;
		Object IDENTIFIER68_tree=null;
		Object BECOMES69_tree=null;

		try {
			// Neptune.g:127:2: ( VAR ^ type IDENTIFIER ( BECOMES expression )? | CONST ^ type IDENTIFIER BECOMES expression )
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
					// Neptune.g:127:4: VAR ^ type IDENTIFIER ( BECOMES expression )?
					{
					root_0 = (Object)adaptor.nil();


					VAR61=(Token)match(input,VAR,FOLLOW_VAR_in_declaration1326); 
					VAR61_tree = (Object)adaptor.create(VAR61);
					root_0 = (Object)adaptor.becomeRoot(VAR61_tree, root_0);

					pushFollow(FOLLOW_type_in_declaration1329);
					type62=type();
					state._fsp--;

					adaptor.addChild(root_0, type62.getTree());

					IDENTIFIER63=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_declaration1331); 
					IDENTIFIER63_tree = (Object)adaptor.create(IDENTIFIER63);
					adaptor.addChild(root_0, IDENTIFIER63_tree);

					// Neptune.g:127:25: ( BECOMES expression )?
					int alt8=2;
					int LA8_0 = input.LA(1);
					if ( (LA8_0==BECOMES) ) {
						alt8=1;
					}
					switch (alt8) {
						case 1 :
							// Neptune.g:127:26: BECOMES expression
							{
							BECOMES64=(Token)match(input,BECOMES,FOLLOW_BECOMES_in_declaration1334); 
							BECOMES64_tree = (Object)adaptor.create(BECOMES64);
							adaptor.addChild(root_0, BECOMES64_tree);

							pushFollow(FOLLOW_expression_in_declaration1336);
							expression65=expression();
							state._fsp--;

							adaptor.addChild(root_0, expression65.getTree());

							}
							break;

					}

					}
					break;
				case 2 :
					// Neptune.g:128:4: CONST ^ type IDENTIFIER BECOMES expression
					{
					root_0 = (Object)adaptor.nil();


					CONST66=(Token)match(input,CONST,FOLLOW_CONST_in_declaration1343); 
					CONST66_tree = (Object)adaptor.create(CONST66);
					root_0 = (Object)adaptor.becomeRoot(CONST66_tree, root_0);

					pushFollow(FOLLOW_type_in_declaration1346);
					type67=type();
					state._fsp--;

					adaptor.addChild(root_0, type67.getTree());

					IDENTIFIER68=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_declaration1348); 
					IDENTIFIER68_tree = (Object)adaptor.create(IDENTIFIER68);
					adaptor.addChild(root_0, IDENTIFIER68_tree);

					BECOMES69=(Token)match(input,BECOMES,FOLLOW_BECOMES_in_declaration1350); 
					BECOMES69_tree = (Object)adaptor.create(BECOMES69);
					adaptor.addChild(root_0, BECOMES69_tree);

					pushFollow(FOLLOW_expression_in_declaration1352);
					expression70=expression();
					state._fsp--;

					adaptor.addChild(root_0, expression70.getTree());

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
	// Neptune.g:131:1: expression : assignment_expr ;
	public final NeptuneParser.expression_return expression() throws RecognitionException {
		NeptuneParser.expression_return retval = new NeptuneParser.expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope assignment_expr71 =null;


		try {
			// Neptune.g:132:2: ( assignment_expr )
			// Neptune.g:132:4: assignment_expr
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_assignment_expr_in_expression1364);
			assignment_expr71=assignment_expr();
			state._fsp--;

			adaptor.addChild(root_0, assignment_expr71.getTree());

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
	// Neptune.g:135:1: assignment_expr : boolean_expr ( BECOMES ^ assignment_expr )? ;
	public final NeptuneParser.assignment_expr_return assignment_expr() throws RecognitionException {
		NeptuneParser.assignment_expr_return retval = new NeptuneParser.assignment_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token BECOMES73=null;
		ParserRuleReturnScope boolean_expr72 =null;
		ParserRuleReturnScope assignment_expr74 =null;

		Object BECOMES73_tree=null;

		try {
			// Neptune.g:136:2: ( boolean_expr ( BECOMES ^ assignment_expr )? )
			// Neptune.g:136:4: boolean_expr ( BECOMES ^ assignment_expr )?
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_boolean_expr_in_assignment_expr1375);
			boolean_expr72=boolean_expr();
			state._fsp--;

			adaptor.addChild(root_0, boolean_expr72.getTree());

			// Neptune.g:136:17: ( BECOMES ^ assignment_expr )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==BECOMES) ) {
				alt10=1;
			}
			switch (alt10) {
				case 1 :
					// Neptune.g:136:18: BECOMES ^ assignment_expr
					{
					BECOMES73=(Token)match(input,BECOMES,FOLLOW_BECOMES_in_assignment_expr1378); 
					BECOMES73_tree = (Object)adaptor.create(BECOMES73);
					root_0 = (Object)adaptor.becomeRoot(BECOMES73_tree, root_0);

					pushFollow(FOLLOW_assignment_expr_in_assignment_expr1381);
					assignment_expr74=assignment_expr();
					state._fsp--;

					adaptor.addChild(root_0, assignment_expr74.getTree());

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
	// Neptune.g:139:1: boolean_expr : plus_expr ( ( LT ^| LT_EQ ^| GT ^| GT_EQ ^| EQ ^| NEQ ^) plus_expr )* ;
	public final NeptuneParser.boolean_expr_return boolean_expr() throws RecognitionException {
		NeptuneParser.boolean_expr_return retval = new NeptuneParser.boolean_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token LT76=null;
		Token LT_EQ77=null;
		Token GT78=null;
		Token GT_EQ79=null;
		Token EQ80=null;
		Token NEQ81=null;
		ParserRuleReturnScope plus_expr75 =null;
		ParserRuleReturnScope plus_expr82 =null;

		Object LT76_tree=null;
		Object LT_EQ77_tree=null;
		Object GT78_tree=null;
		Object GT_EQ79_tree=null;
		Object EQ80_tree=null;
		Object NEQ81_tree=null;

		try {
			// Neptune.g:140:2: ( plus_expr ( ( LT ^| LT_EQ ^| GT ^| GT_EQ ^| EQ ^| NEQ ^) plus_expr )* )
			// Neptune.g:140:4: plus_expr ( ( LT ^| LT_EQ ^| GT ^| GT_EQ ^| EQ ^| NEQ ^) plus_expr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_plus_expr_in_boolean_expr1395);
			plus_expr75=plus_expr();
			state._fsp--;

			adaptor.addChild(root_0, plus_expr75.getTree());

			// Neptune.g:140:14: ( ( LT ^| LT_EQ ^| GT ^| GT_EQ ^| EQ ^| NEQ ^) plus_expr )*
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( (LA12_0==EQ||(LA12_0 >= GT && LA12_0 <= GT_EQ)||(LA12_0 >= LT && LA12_0 <= LT_EQ)||LA12_0==NEQ) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// Neptune.g:140:15: ( LT ^| LT_EQ ^| GT ^| GT_EQ ^| EQ ^| NEQ ^) plus_expr
					{
					// Neptune.g:140:15: ( LT ^| LT_EQ ^| GT ^| GT_EQ ^| EQ ^| NEQ ^)
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
							// Neptune.g:140:16: LT ^
							{
							LT76=(Token)match(input,LT,FOLLOW_LT_in_boolean_expr1399); 
							LT76_tree = (Object)adaptor.create(LT76);
							root_0 = (Object)adaptor.becomeRoot(LT76_tree, root_0);

							}
							break;
						case 2 :
							// Neptune.g:140:22: LT_EQ ^
							{
							LT_EQ77=(Token)match(input,LT_EQ,FOLLOW_LT_EQ_in_boolean_expr1404); 
							LT_EQ77_tree = (Object)adaptor.create(LT_EQ77);
							root_0 = (Object)adaptor.becomeRoot(LT_EQ77_tree, root_0);

							}
							break;
						case 3 :
							// Neptune.g:140:31: GT ^
							{
							GT78=(Token)match(input,GT,FOLLOW_GT_in_boolean_expr1409); 
							GT78_tree = (Object)adaptor.create(GT78);
							root_0 = (Object)adaptor.becomeRoot(GT78_tree, root_0);

							}
							break;
						case 4 :
							// Neptune.g:140:37: GT_EQ ^
							{
							GT_EQ79=(Token)match(input,GT_EQ,FOLLOW_GT_EQ_in_boolean_expr1414); 
							GT_EQ79_tree = (Object)adaptor.create(GT_EQ79);
							root_0 = (Object)adaptor.becomeRoot(GT_EQ79_tree, root_0);

							}
							break;
						case 5 :
							// Neptune.g:140:46: EQ ^
							{
							EQ80=(Token)match(input,EQ,FOLLOW_EQ_in_boolean_expr1419); 
							EQ80_tree = (Object)adaptor.create(EQ80);
							root_0 = (Object)adaptor.becomeRoot(EQ80_tree, root_0);

							}
							break;
						case 6 :
							// Neptune.g:140:52: NEQ ^
							{
							NEQ81=(Token)match(input,NEQ,FOLLOW_NEQ_in_boolean_expr1424); 
							NEQ81_tree = (Object)adaptor.create(NEQ81);
							root_0 = (Object)adaptor.becomeRoot(NEQ81_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_plus_expr_in_boolean_expr1428);
					plus_expr82=plus_expr();
					state._fsp--;

					adaptor.addChild(root_0, plus_expr82.getTree());

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
	// Neptune.g:143:1: plus_expr : multi_expr ( ( PLUS ^| MINUS ^) multi_expr )* ;
	public final NeptuneParser.plus_expr_return plus_expr() throws RecognitionException {
		NeptuneParser.plus_expr_return retval = new NeptuneParser.plus_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token PLUS84=null;
		Token MINUS85=null;
		ParserRuleReturnScope multi_expr83 =null;
		ParserRuleReturnScope multi_expr86 =null;

		Object PLUS84_tree=null;
		Object MINUS85_tree=null;

		try {
			// Neptune.g:144:2: ( multi_expr ( ( PLUS ^| MINUS ^) multi_expr )* )
			// Neptune.g:144:4: multi_expr ( ( PLUS ^| MINUS ^) multi_expr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_multi_expr_in_plus_expr1441);
			multi_expr83=multi_expr();
			state._fsp--;

			adaptor.addChild(root_0, multi_expr83.getTree());

			// Neptune.g:144:15: ( ( PLUS ^| MINUS ^) multi_expr )*
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( (LA14_0==MINUS||LA14_0==PLUS) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// Neptune.g:144:16: ( PLUS ^| MINUS ^) multi_expr
					{
					// Neptune.g:144:16: ( PLUS ^| MINUS ^)
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
							// Neptune.g:144:17: PLUS ^
							{
							PLUS84=(Token)match(input,PLUS,FOLLOW_PLUS_in_plus_expr1445); 
							PLUS84_tree = (Object)adaptor.create(PLUS84);
							root_0 = (Object)adaptor.becomeRoot(PLUS84_tree, root_0);

							}
							break;
						case 2 :
							// Neptune.g:144:25: MINUS ^
							{
							MINUS85=(Token)match(input,MINUS,FOLLOW_MINUS_in_plus_expr1450); 
							MINUS85_tree = (Object)adaptor.create(MINUS85);
							root_0 = (Object)adaptor.becomeRoot(MINUS85_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_multi_expr_in_plus_expr1454);
					multi_expr86=multi_expr();
					state._fsp--;

					adaptor.addChild(root_0, multi_expr86.getTree());

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
	// Neptune.g:147:1: multi_expr : operand ( ( TIMES ^| DIVIDE ^) operand )* ;
	public final NeptuneParser.multi_expr_return multi_expr() throws RecognitionException {
		NeptuneParser.multi_expr_return retval = new NeptuneParser.multi_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token TIMES88=null;
		Token DIVIDE89=null;
		ParserRuleReturnScope operand87 =null;
		ParserRuleReturnScope operand90 =null;

		Object TIMES88_tree=null;
		Object DIVIDE89_tree=null;

		try {
			// Neptune.g:148:2: ( operand ( ( TIMES ^| DIVIDE ^) operand )* )
			// Neptune.g:148:4: operand ( ( TIMES ^| DIVIDE ^) operand )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_operand_in_multi_expr1467);
			operand87=operand();
			state._fsp--;

			adaptor.addChild(root_0, operand87.getTree());

			// Neptune.g:148:12: ( ( TIMES ^| DIVIDE ^) operand )*
			loop16:
			while (true) {
				int alt16=2;
				int LA16_0 = input.LA(1);
				if ( (LA16_0==DIVIDE||LA16_0==TIMES) ) {
					alt16=1;
				}

				switch (alt16) {
				case 1 :
					// Neptune.g:148:13: ( TIMES ^| DIVIDE ^) operand
					{
					// Neptune.g:148:13: ( TIMES ^| DIVIDE ^)
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
							// Neptune.g:148:14: TIMES ^
							{
							TIMES88=(Token)match(input,TIMES,FOLLOW_TIMES_in_multi_expr1471); 
							TIMES88_tree = (Object)adaptor.create(TIMES88);
							root_0 = (Object)adaptor.becomeRoot(TIMES88_tree, root_0);

							}
							break;
						case 2 :
							// Neptune.g:148:23: DIVIDE ^
							{
							DIVIDE89=(Token)match(input,DIVIDE,FOLLOW_DIVIDE_in_multi_expr1476); 
							DIVIDE89_tree = (Object)adaptor.create(DIVIDE89);
							root_0 = (Object)adaptor.becomeRoot(DIVIDE89_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_operand_in_multi_expr1480);
					operand90=operand();
					state._fsp--;

					adaptor.addChild(root_0, operand90.getTree());

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
	// Neptune.g:151:1: operand : ( IDENTIFIER | NUMBER | LPAREN ! assignment_expr RPAREN !| LCURLY expression ( COMMA expression )* RCURLY -> ^( ARRAY_SET ( expression )+ ) | print_statement | read_statement | ( TRUE | FALSE ) | QUOTE ! ( LETTER | DIGIT ) QUOTE !| STRING );
	public final NeptuneParser.operand_return operand() throws RecognitionException {
		NeptuneParser.operand_return retval = new NeptuneParser.operand_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IDENTIFIER91=null;
		Token NUMBER92=null;
		Token LPAREN93=null;
		Token RPAREN95=null;
		Token LCURLY96=null;
		Token COMMA98=null;
		Token RCURLY100=null;
		Token set103=null;
		Token QUOTE104=null;
		Token set105=null;
		Token QUOTE106=null;
		Token STRING107=null;
		ParserRuleReturnScope assignment_expr94 =null;
		ParserRuleReturnScope expression97 =null;
		ParserRuleReturnScope expression99 =null;
		ParserRuleReturnScope print_statement101 =null;
		ParserRuleReturnScope read_statement102 =null;

		Object IDENTIFIER91_tree=null;
		Object NUMBER92_tree=null;
		Object LPAREN93_tree=null;
		Object RPAREN95_tree=null;
		Object LCURLY96_tree=null;
		Object COMMA98_tree=null;
		Object RCURLY100_tree=null;
		Object set103_tree=null;
		Object QUOTE104_tree=null;
		Object set105_tree=null;
		Object QUOTE106_tree=null;
		Object STRING107_tree=null;
		RewriteRuleTokenStream stream_LCURLY=new RewriteRuleTokenStream(adaptor,"token LCURLY");
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_RCURLY=new RewriteRuleTokenStream(adaptor,"token RCURLY");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try {
			// Neptune.g:152:5: ( IDENTIFIER | NUMBER | LPAREN ! assignment_expr RPAREN !| LCURLY expression ( COMMA expression )* RCURLY -> ^( ARRAY_SET ( expression )+ ) | print_statement | read_statement | ( TRUE | FALSE ) | QUOTE ! ( LETTER | DIGIT ) QUOTE !| STRING )
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
			case QUOTE:
				{
				alt18=8;
				}
				break;
			case STRING:
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
					// Neptune.g:152:9: IDENTIFIER
					{
					root_0 = (Object)adaptor.nil();


					IDENTIFIER91=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_operand1498); 
					IDENTIFIER91_tree = (Object)adaptor.create(IDENTIFIER91);
					adaptor.addChild(root_0, IDENTIFIER91_tree);

					}
					break;
				case 2 :
					// Neptune.g:153:9: NUMBER
					{
					root_0 = (Object)adaptor.nil();


					NUMBER92=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_operand1508); 
					NUMBER92_tree = (Object)adaptor.create(NUMBER92);
					adaptor.addChild(root_0, NUMBER92_tree);

					}
					break;
				case 3 :
					// Neptune.g:154:9: LPAREN ! assignment_expr RPAREN !
					{
					root_0 = (Object)adaptor.nil();


					LPAREN93=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_operand1518); 
					pushFollow(FOLLOW_assignment_expr_in_operand1521);
					assignment_expr94=assignment_expr();
					state._fsp--;

					adaptor.addChild(root_0, assignment_expr94.getTree());

					RPAREN95=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_operand1523); 
					}
					break;
				case 4 :
					// Neptune.g:155:4: LCURLY expression ( COMMA expression )* RCURLY
					{
					LCURLY96=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_operand1529);  
					stream_LCURLY.add(LCURLY96);

					pushFollow(FOLLOW_expression_in_operand1531);
					expression97=expression();
					state._fsp--;

					stream_expression.add(expression97.getTree());
					// Neptune.g:155:22: ( COMMA expression )*
					loop17:
					while (true) {
						int alt17=2;
						int LA17_0 = input.LA(1);
						if ( (LA17_0==COMMA) ) {
							alt17=1;
						}

						switch (alt17) {
						case 1 :
							// Neptune.g:155:23: COMMA expression
							{
							COMMA98=(Token)match(input,COMMA,FOLLOW_COMMA_in_operand1534);  
							stream_COMMA.add(COMMA98);

							pushFollow(FOLLOW_expression_in_operand1536);
							expression99=expression();
							state._fsp--;

							stream_expression.add(expression99.getTree());
							}
							break;

						default :
							break loop17;
						}
					}

					RCURLY100=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_operand1540);  
					stream_RCURLY.add(RCURLY100);

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
					// 156:3: -> ^( ARRAY_SET ( expression )+ )
					{
						// Neptune.g:156:6: ^( ARRAY_SET ( expression )+ )
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
					// Neptune.g:157:4: print_statement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_print_statement_in_operand1556);
					print_statement101=print_statement();
					state._fsp--;

					adaptor.addChild(root_0, print_statement101.getTree());

					}
					break;
				case 6 :
					// Neptune.g:158:4: read_statement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_read_statement_in_operand1561);
					read_statement102=read_statement();
					state._fsp--;

					adaptor.addChild(root_0, read_statement102.getTree());

					}
					break;
				case 7 :
					// Neptune.g:159:4: ( TRUE | FALSE )
					{
					root_0 = (Object)adaptor.nil();


					set103=input.LT(1);
					if ( input.LA(1)==FALSE||input.LA(1)==TRUE ) {
						input.consume();
						adaptor.addChild(root_0, (Object)adaptor.create(set103));
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					}
					break;
				case 8 :
					// Neptune.g:160:4: QUOTE ! ( LETTER | DIGIT ) QUOTE !
					{
					root_0 = (Object)adaptor.nil();


					QUOTE104=(Token)match(input,QUOTE,FOLLOW_QUOTE_in_operand1577); 
					set105=input.LT(1);
					if ( input.LA(1)==DIGIT||input.LA(1)==LETTER ) {
						input.consume();
						adaptor.addChild(root_0, (Object)adaptor.create(set105));
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					QUOTE106=(Token)match(input,QUOTE,FOLLOW_QUOTE_in_operand1586); 
					}
					break;
				case 9 :
					// Neptune.g:161:4: STRING
					{
					root_0 = (Object)adaptor.nil();


					STRING107=(Token)match(input,STRING,FOLLOW_STRING_in_operand1592); 
					STRING107_tree = (Object)adaptor.create(STRING107);
					adaptor.addChild(root_0, STRING107_tree);

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
	// Neptune.g:164:1: type : ( INTEGER ( array_def )? | CHAR ( array_def )? | BOOLEAN ( array_def )? );
	public final NeptuneParser.type_return type() throws RecognitionException {
		NeptuneParser.type_return retval = new NeptuneParser.type_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token INTEGER108=null;
		Token CHAR110=null;
		Token BOOLEAN112=null;
		ParserRuleReturnScope array_def109 =null;
		ParserRuleReturnScope array_def111 =null;
		ParserRuleReturnScope array_def113 =null;

		Object INTEGER108_tree=null;
		Object CHAR110_tree=null;
		Object BOOLEAN112_tree=null;

		try {
			// Neptune.g:165:2: ( INTEGER ( array_def )? | CHAR ( array_def )? | BOOLEAN ( array_def )? )
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
					// Neptune.g:165:4: INTEGER ( array_def )?
					{
					root_0 = (Object)adaptor.nil();


					INTEGER108=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_type1606); 
					INTEGER108_tree = (Object)adaptor.create(INTEGER108);
					adaptor.addChild(root_0, INTEGER108_tree);

					// Neptune.g:165:12: ( array_def )?
					int alt19=2;
					int LA19_0 = input.LA(1);
					if ( (LA19_0==LBRACKET) ) {
						alt19=1;
					}
					switch (alt19) {
						case 1 :
							// Neptune.g:165:12: array_def
							{
							pushFollow(FOLLOW_array_def_in_type1608);
							array_def109=array_def();
							state._fsp--;

							adaptor.addChild(root_0, array_def109.getTree());

							}
							break;

					}

					}
					break;
				case 2 :
					// Neptune.g:166:4: CHAR ( array_def )?
					{
					root_0 = (Object)adaptor.nil();


					CHAR110=(Token)match(input,CHAR,FOLLOW_CHAR_in_type1614); 
					CHAR110_tree = (Object)adaptor.create(CHAR110);
					adaptor.addChild(root_0, CHAR110_tree);

					// Neptune.g:166:9: ( array_def )?
					int alt20=2;
					int LA20_0 = input.LA(1);
					if ( (LA20_0==LBRACKET) ) {
						alt20=1;
					}
					switch (alt20) {
						case 1 :
							// Neptune.g:166:9: array_def
							{
							pushFollow(FOLLOW_array_def_in_type1616);
							array_def111=array_def();
							state._fsp--;

							adaptor.addChild(root_0, array_def111.getTree());

							}
							break;

					}

					}
					break;
				case 3 :
					// Neptune.g:167:4: BOOLEAN ( array_def )?
					{
					root_0 = (Object)adaptor.nil();


					BOOLEAN112=(Token)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_type1622); 
					BOOLEAN112_tree = (Object)adaptor.create(BOOLEAN112);
					adaptor.addChild(root_0, BOOLEAN112_tree);

					// Neptune.g:167:12: ( array_def )?
					int alt21=2;
					int LA21_0 = input.LA(1);
					if ( (LA21_0==LBRACKET) ) {
						alt21=1;
					}
					switch (alt21) {
						case 1 :
							// Neptune.g:167:12: array_def
							{
							pushFollow(FOLLOW_array_def_in_type1624);
							array_def113=array_def();
							state._fsp--;

							adaptor.addChild(root_0, array_def113.getTree());

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
	// Neptune.g:170:1: array_def : LBRACKET ( NUMBER )? RBRACKET ;
	public final NeptuneParser.array_def_return array_def() throws RecognitionException {
		NeptuneParser.array_def_return retval = new NeptuneParser.array_def_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token LBRACKET114=null;
		Token NUMBER115=null;
		Token RBRACKET116=null;

		Object LBRACKET114_tree=null;
		Object NUMBER115_tree=null;
		Object RBRACKET116_tree=null;

		try {
			// Neptune.g:171:2: ( LBRACKET ( NUMBER )? RBRACKET )
			// Neptune.g:171:5: LBRACKET ( NUMBER )? RBRACKET
			{
			root_0 = (Object)adaptor.nil();


			LBRACKET114=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_array_def1638); 
			LBRACKET114_tree = (Object)adaptor.create(LBRACKET114);
			adaptor.addChild(root_0, LBRACKET114_tree);

			// Neptune.g:171:14: ( NUMBER )?
			int alt23=2;
			int LA23_0 = input.LA(1);
			if ( (LA23_0==NUMBER) ) {
				alt23=1;
			}
			switch (alt23) {
				case 1 :
					// Neptune.g:171:14: NUMBER
					{
					NUMBER115=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_array_def1640); 
					NUMBER115_tree = (Object)adaptor.create(NUMBER115);
					adaptor.addChild(root_0, NUMBER115_tree);

					}
					break;

			}

			RBRACKET116=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_array_def1643); 
			RBRACKET116_tree = (Object)adaptor.create(RBRACKET116);
			adaptor.addChild(root_0, RBRACKET116_tree);

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



	public static final BitSet FOLLOW_lines_in_program1020 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_program1022 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_line_in_lines1057 = new BitSet(new long[]{0x00D225424B180802L});
	public static final BitSet FOLLOW_expression_in_line1070 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_line1072 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declaration_in_line1078 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_line1080 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_include_statement_in_line1086 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_logic_statement_in_line1091 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_while_statement_in_logic_statement1103 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_foreach_statement_in_logic_statement1108 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_if_statement_in_logic_statement1113 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHILE_in_while_statement1125 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_LPAREN_in_while_statement1128 = new BitSet(new long[]{0x0012254241080000L});
	public static final BitSet FOLLOW_expression_in_while_statement1131 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_RPAREN_in_while_statement1133 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_LCURLY_in_while_statement1136 = new BitSet(new long[]{0x00D225424B180800L});
	public static final BitSet FOLLOW_lines_in_while_statement1139 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_RCURLY_in_while_statement1141 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FOREACH_in_foreach_statement1154 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_LPAREN_in_foreach_statement1157 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_foreach_statement1160 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_IN_in_foreach_statement1162 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_foreach_statement1165 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_RPAREN_in_foreach_statement1167 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_LCURLY_in_foreach_statement1170 = new BitSet(new long[]{0x00D225424B180800L});
	public static final BitSet FOLLOW_lines_in_foreach_statement1173 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_RCURLY_in_foreach_statement1175 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_if_statement1188 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_LPAREN_in_if_statement1191 = new BitSet(new long[]{0x0012254241080000L});
	public static final BitSet FOLLOW_expression_in_if_statement1194 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_RPAREN_in_if_statement1196 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_LCURLY_in_if_statement1199 = new BitSet(new long[]{0x00D225424B180800L});
	public static final BitSet FOLLOW_lines_in_if_statement1202 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_RCURLY_in_if_statement1204 = new BitSet(new long[]{0x0000000000030002L});
	public static final BitSet FOLLOW_ELSIF_in_if_statement1210 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_LPAREN_in_if_statement1212 = new BitSet(new long[]{0x0012254241080000L});
	public static final BitSet FOLLOW_expression_in_if_statement1215 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_RPAREN_in_if_statement1217 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_LCURLY_in_if_statement1220 = new BitSet(new long[]{0x00D225424B180800L});
	public static final BitSet FOLLOW_lines_in_if_statement1223 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_RCURLY_in_if_statement1225 = new BitSet(new long[]{0x0000000000030002L});
	public static final BitSet FOLLOW_ELSE_in_if_statement1233 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_LCURLY_in_if_statement1235 = new BitSet(new long[]{0x00D225424B180800L});
	public static final BitSet FOLLOW_lines_in_if_statement1238 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_RCURLY_in_if_statement1240 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INCLUDE_in_include_statement1255 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_57_in_include_statement1258 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRINT_in_print_statement1270 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_LPAREN_in_print_statement1273 = new BitSet(new long[]{0x0012254241080000L});
	public static final BitSet FOLLOW_expression_in_print_statement1276 = new BitSet(new long[]{0x0000800000000200L});
	public static final BitSet FOLLOW_COMMA_in_print_statement1279 = new BitSet(new long[]{0x0012254241080000L});
	public static final BitSet FOLLOW_expression_in_print_statement1281 = new BitSet(new long[]{0x0000800000000200L});
	public static final BitSet FOLLOW_RPAREN_in_print_statement1285 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_READ_in_read_statement1298 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_LPAREN_in_read_statement1301 = new BitSet(new long[]{0x0012254241080000L});
	public static final BitSet FOLLOW_expression_in_read_statement1304 = new BitSet(new long[]{0x0000800000000200L});
	public static final BitSet FOLLOW_COMMA_in_read_statement1307 = new BitSet(new long[]{0x0012254241080000L});
	public static final BitSet FOLLOW_expression_in_read_statement1309 = new BitSet(new long[]{0x0000800000000200L});
	public static final BitSet FOLLOW_RPAREN_in_read_statement1313 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_declaration1326 = new BitSet(new long[]{0x00000000100000C0L});
	public static final BitSet FOLLOW_type_in_declaration1329 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_declaration1331 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_BECOMES_in_declaration1334 = new BitSet(new long[]{0x0012254241080000L});
	public static final BitSet FOLLOW_expression_in_declaration1336 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CONST_in_declaration1343 = new BitSet(new long[]{0x00000000100000C0L});
	public static final BitSet FOLLOW_type_in_declaration1346 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_declaration1348 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_BECOMES_in_declaration1350 = new BitSet(new long[]{0x0012254241080000L});
	public static final BitSet FOLLOW_expression_in_declaration1352 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignment_expr_in_expression1364 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_boolean_expr_in_assignment_expr1375 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_BECOMES_in_assignment_expr1378 = new BitSet(new long[]{0x0012254241080000L});
	public static final BitSet FOLLOW_assignment_expr_in_assignment_expr1381 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_plus_expr_in_boolean_expr1395 = new BitSet(new long[]{0x0000002C00C40002L});
	public static final BitSet FOLLOW_LT_in_boolean_expr1399 = new BitSet(new long[]{0x0012254241080000L});
	public static final BitSet FOLLOW_LT_EQ_in_boolean_expr1404 = new BitSet(new long[]{0x0012254241080000L});
	public static final BitSet FOLLOW_GT_in_boolean_expr1409 = new BitSet(new long[]{0x0012254241080000L});
	public static final BitSet FOLLOW_GT_EQ_in_boolean_expr1414 = new BitSet(new long[]{0x0012254241080000L});
	public static final BitSet FOLLOW_EQ_in_boolean_expr1419 = new BitSet(new long[]{0x0012254241080000L});
	public static final BitSet FOLLOW_NEQ_in_boolean_expr1424 = new BitSet(new long[]{0x0012254241080000L});
	public static final BitSet FOLLOW_plus_expr_in_boolean_expr1428 = new BitSet(new long[]{0x0000002C00C40002L});
	public static final BitSet FOLLOW_multi_expr_in_plus_expr1441 = new BitSet(new long[]{0x0000009000000002L});
	public static final BitSet FOLLOW_PLUS_in_plus_expr1445 = new BitSet(new long[]{0x0012254241080000L});
	public static final BitSet FOLLOW_MINUS_in_plus_expr1450 = new BitSet(new long[]{0x0012254241080000L});
	public static final BitSet FOLLOW_multi_expr_in_plus_expr1454 = new BitSet(new long[]{0x0000009000000002L});
	public static final BitSet FOLLOW_operand_in_multi_expr1467 = new BitSet(new long[]{0x0008000000002002L});
	public static final BitSet FOLLOW_TIMES_in_multi_expr1471 = new BitSet(new long[]{0x0012254241080000L});
	public static final BitSet FOLLOW_DIVIDE_in_multi_expr1476 = new BitSet(new long[]{0x0012254241080000L});
	public static final BitSet FOLLOW_operand_in_multi_expr1480 = new BitSet(new long[]{0x0008000000002002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_operand1498 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMBER_in_operand1508 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_operand1518 = new BitSet(new long[]{0x0012254241080000L});
	public static final BitSet FOLLOW_assignment_expr_in_operand1521 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_RPAREN_in_operand1523 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LCURLY_in_operand1529 = new BitSet(new long[]{0x0012254241080000L});
	public static final BitSet FOLLOW_expression_in_operand1531 = new BitSet(new long[]{0x0000100000000200L});
	public static final BitSet FOLLOW_COMMA_in_operand1534 = new BitSet(new long[]{0x0012254241080000L});
	public static final BitSet FOLLOW_expression_in_operand1536 = new BitSet(new long[]{0x0000100000000200L});
	public static final BitSet FOLLOW_RCURLY_in_operand1540 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_print_statement_in_operand1556 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_read_statement_in_operand1561 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_operand1566 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QUOTE_in_operand1577 = new BitSet(new long[]{0x0000000080001000L});
	public static final BitSet FOLLOW_set_in_operand1580 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_QUOTE_in_operand1586 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_operand1592 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTEGER_in_type1606 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_array_def_in_type1608 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_in_type1614 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_array_def_in_type1616 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOLEAN_in_type1622 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_array_def_in_type1624 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACKET_in_array_def1638 = new BitSet(new long[]{0x0000084000000000L});
	public static final BitSet FOLLOW_NUMBER_in_array_def1640 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_RBRACKET_in_array_def1643 = new BitSet(new long[]{0x0000000000000002L});
}

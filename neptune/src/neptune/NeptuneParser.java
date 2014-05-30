// $ANTLR 3.5.2 Neptune.g 2014-05-30 14:19:27

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
		"RPAREN", "SEMICOLON", "THEN", "TIMES", "TRUE", "UPPER", "VAR", "WHILE", 
		"WS", "'ello'"
	};
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
				if ( (LA1_0==CONST||(LA1_0 >= FALSE && LA1_0 <= FOREACH)||(LA1_0 >= IDENTIFIER && LA1_0 <= IF)||LA1_0==INCLUDE||LA1_0==LCURLY||LA1_0==LPAREN||LA1_0==NUMBER||LA1_0==PRINT||LA1_0==QUOTE||LA1_0==READ||LA1_0==TRUE||(LA1_0 >= VAR && LA1_0 <= WHILE)) ) {
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

			string_literal48=(Token)match(input,56,FOLLOW_56_in_include_statement1258); 
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
	// Neptune.g:126:1: declaration : ( VAR ^| CONST ^) type IDENTIFIER ( BECOMES expression )? ;
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
			// Neptune.g:127:2: ( ( VAR ^| CONST ^) type IDENTIFIER ( BECOMES expression )? )
			// Neptune.g:127:4: ( VAR ^| CONST ^) type IDENTIFIER ( BECOMES expression )?
			{
			root_0 = (Object)adaptor.nil();


			// Neptune.g:127:4: ( VAR ^| CONST ^)
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
					// Neptune.g:127:5: VAR ^
					{
					VAR61=(Token)match(input,VAR,FOLLOW_VAR_in_declaration1327); 
					VAR61_tree = (Object)adaptor.create(VAR61);
					root_0 = (Object)adaptor.becomeRoot(VAR61_tree, root_0);

					}
					break;
				case 2 :
					// Neptune.g:127:12: CONST ^
					{
					CONST62=(Token)match(input,CONST,FOLLOW_CONST_in_declaration1332); 
					CONST62_tree = (Object)adaptor.create(CONST62);
					root_0 = (Object)adaptor.becomeRoot(CONST62_tree, root_0);

					}
					break;

			}

			pushFollow(FOLLOW_type_in_declaration1336);
			type63=type();
			state._fsp--;

			adaptor.addChild(root_0, type63.getTree());

			IDENTIFIER64=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_declaration1338); 
			IDENTIFIER64_tree = (Object)adaptor.create(IDENTIFIER64);
			adaptor.addChild(root_0, IDENTIFIER64_tree);

			// Neptune.g:127:36: ( BECOMES expression )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==BECOMES) ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// Neptune.g:127:37: BECOMES expression
					{
					BECOMES65=(Token)match(input,BECOMES,FOLLOW_BECOMES_in_declaration1341); 
					BECOMES65_tree = (Object)adaptor.create(BECOMES65);
					adaptor.addChild(root_0, BECOMES65_tree);

					pushFollow(FOLLOW_expression_in_declaration1343);
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
	// Neptune.g:130:1: expression : assignment_expr ;
	public final NeptuneParser.expression_return expression() throws RecognitionException {
		NeptuneParser.expression_return retval = new NeptuneParser.expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope assignment_expr67 =null;


		try {
			// Neptune.g:131:2: ( assignment_expr )
			// Neptune.g:131:4: assignment_expr
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_assignment_expr_in_expression1357);
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
	// Neptune.g:134:1: assignment_expr : boolean_expr ( BECOMES ^ assignment_expr )? ;
	public final NeptuneParser.assignment_expr_return assignment_expr() throws RecognitionException {
		NeptuneParser.assignment_expr_return retval = new NeptuneParser.assignment_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token BECOMES69=null;
		ParserRuleReturnScope boolean_expr68 =null;
		ParserRuleReturnScope assignment_expr70 =null;

		Object BECOMES69_tree=null;

		try {
			// Neptune.g:135:2: ( boolean_expr ( BECOMES ^ assignment_expr )? )
			// Neptune.g:135:4: boolean_expr ( BECOMES ^ assignment_expr )?
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_boolean_expr_in_assignment_expr1368);
			boolean_expr68=boolean_expr();
			state._fsp--;

			adaptor.addChild(root_0, boolean_expr68.getTree());

			// Neptune.g:135:17: ( BECOMES ^ assignment_expr )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==BECOMES) ) {
				alt10=1;
			}
			switch (alt10) {
				case 1 :
					// Neptune.g:135:18: BECOMES ^ assignment_expr
					{
					BECOMES69=(Token)match(input,BECOMES,FOLLOW_BECOMES_in_assignment_expr1371); 
					BECOMES69_tree = (Object)adaptor.create(BECOMES69);
					root_0 = (Object)adaptor.becomeRoot(BECOMES69_tree, root_0);

					pushFollow(FOLLOW_assignment_expr_in_assignment_expr1374);
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
	// Neptune.g:138:1: boolean_expr : plus_expr ( ( LT ^| LT_EQ ^| GT ^| GT_EQ ^| EQ ^| NEQ ^) plus_expr )* ;
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
			// Neptune.g:139:2: ( plus_expr ( ( LT ^| LT_EQ ^| GT ^| GT_EQ ^| EQ ^| NEQ ^) plus_expr )* )
			// Neptune.g:139:4: plus_expr ( ( LT ^| LT_EQ ^| GT ^| GT_EQ ^| EQ ^| NEQ ^) plus_expr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_plus_expr_in_boolean_expr1388);
			plus_expr71=plus_expr();
			state._fsp--;

			adaptor.addChild(root_0, plus_expr71.getTree());

			// Neptune.g:139:14: ( ( LT ^| LT_EQ ^| GT ^| GT_EQ ^| EQ ^| NEQ ^) plus_expr )*
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( (LA12_0==EQ||(LA12_0 >= GT && LA12_0 <= GT_EQ)||(LA12_0 >= LT && LA12_0 <= LT_EQ)||LA12_0==NEQ) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// Neptune.g:139:15: ( LT ^| LT_EQ ^| GT ^| GT_EQ ^| EQ ^| NEQ ^) plus_expr
					{
					// Neptune.g:139:15: ( LT ^| LT_EQ ^| GT ^| GT_EQ ^| EQ ^| NEQ ^)
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
							// Neptune.g:139:16: LT ^
							{
							LT72=(Token)match(input,LT,FOLLOW_LT_in_boolean_expr1392); 
							LT72_tree = (Object)adaptor.create(LT72);
							root_0 = (Object)adaptor.becomeRoot(LT72_tree, root_0);

							}
							break;
						case 2 :
							// Neptune.g:139:22: LT_EQ ^
							{
							LT_EQ73=(Token)match(input,LT_EQ,FOLLOW_LT_EQ_in_boolean_expr1397); 
							LT_EQ73_tree = (Object)adaptor.create(LT_EQ73);
							root_0 = (Object)adaptor.becomeRoot(LT_EQ73_tree, root_0);

							}
							break;
						case 3 :
							// Neptune.g:139:31: GT ^
							{
							GT74=(Token)match(input,GT,FOLLOW_GT_in_boolean_expr1402); 
							GT74_tree = (Object)adaptor.create(GT74);
							root_0 = (Object)adaptor.becomeRoot(GT74_tree, root_0);

							}
							break;
						case 4 :
							// Neptune.g:139:37: GT_EQ ^
							{
							GT_EQ75=(Token)match(input,GT_EQ,FOLLOW_GT_EQ_in_boolean_expr1407); 
							GT_EQ75_tree = (Object)adaptor.create(GT_EQ75);
							root_0 = (Object)adaptor.becomeRoot(GT_EQ75_tree, root_0);

							}
							break;
						case 5 :
							// Neptune.g:139:46: EQ ^
							{
							EQ76=(Token)match(input,EQ,FOLLOW_EQ_in_boolean_expr1412); 
							EQ76_tree = (Object)adaptor.create(EQ76);
							root_0 = (Object)adaptor.becomeRoot(EQ76_tree, root_0);

							}
							break;
						case 6 :
							// Neptune.g:139:52: NEQ ^
							{
							NEQ77=(Token)match(input,NEQ,FOLLOW_NEQ_in_boolean_expr1417); 
							NEQ77_tree = (Object)adaptor.create(NEQ77);
							root_0 = (Object)adaptor.becomeRoot(NEQ77_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_plus_expr_in_boolean_expr1421);
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
	// Neptune.g:142:1: plus_expr : multi_expr ( ( PLUS ^| MINUS ^) multi_expr )* ;
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
			// Neptune.g:143:2: ( multi_expr ( ( PLUS ^| MINUS ^) multi_expr )* )
			// Neptune.g:143:4: multi_expr ( ( PLUS ^| MINUS ^) multi_expr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_multi_expr_in_plus_expr1434);
			multi_expr79=multi_expr();
			state._fsp--;

			adaptor.addChild(root_0, multi_expr79.getTree());

			// Neptune.g:143:15: ( ( PLUS ^| MINUS ^) multi_expr )*
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( (LA14_0==MINUS||LA14_0==PLUS) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// Neptune.g:143:16: ( PLUS ^| MINUS ^) multi_expr
					{
					// Neptune.g:143:16: ( PLUS ^| MINUS ^)
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
							// Neptune.g:143:17: PLUS ^
							{
							PLUS80=(Token)match(input,PLUS,FOLLOW_PLUS_in_plus_expr1438); 
							PLUS80_tree = (Object)adaptor.create(PLUS80);
							root_0 = (Object)adaptor.becomeRoot(PLUS80_tree, root_0);

							}
							break;
						case 2 :
							// Neptune.g:143:25: MINUS ^
							{
							MINUS81=(Token)match(input,MINUS,FOLLOW_MINUS_in_plus_expr1443); 
							MINUS81_tree = (Object)adaptor.create(MINUS81);
							root_0 = (Object)adaptor.becomeRoot(MINUS81_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_multi_expr_in_plus_expr1447);
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
	// Neptune.g:146:1: multi_expr : operand ( ( TIMES ^| DIVIDE ^) operand )* ;
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
			// Neptune.g:147:2: ( operand ( ( TIMES ^| DIVIDE ^) operand )* )
			// Neptune.g:147:4: operand ( ( TIMES ^| DIVIDE ^) operand )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_operand_in_multi_expr1460);
			operand83=operand();
			state._fsp--;

			adaptor.addChild(root_0, operand83.getTree());

			// Neptune.g:147:12: ( ( TIMES ^| DIVIDE ^) operand )*
			loop16:
			while (true) {
				int alt16=2;
				int LA16_0 = input.LA(1);
				if ( (LA16_0==DIVIDE||LA16_0==TIMES) ) {
					alt16=1;
				}

				switch (alt16) {
				case 1 :
					// Neptune.g:147:13: ( TIMES ^| DIVIDE ^) operand
					{
					// Neptune.g:147:13: ( TIMES ^| DIVIDE ^)
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
							// Neptune.g:147:14: TIMES ^
							{
							TIMES84=(Token)match(input,TIMES,FOLLOW_TIMES_in_multi_expr1464); 
							TIMES84_tree = (Object)adaptor.create(TIMES84);
							root_0 = (Object)adaptor.becomeRoot(TIMES84_tree, root_0);

							}
							break;
						case 2 :
							// Neptune.g:147:23: DIVIDE ^
							{
							DIVIDE85=(Token)match(input,DIVIDE,FOLLOW_DIVIDE_in_multi_expr1469); 
							DIVIDE85_tree = (Object)adaptor.create(DIVIDE85);
							root_0 = (Object)adaptor.becomeRoot(DIVIDE85_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_operand_in_multi_expr1473);
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
	// Neptune.g:150:1: operand : ( IDENTIFIER | NUMBER | LPAREN ! assignment_expr RPAREN !| LCURLY expression ( COMMA expression )* RCURLY -> ^( ARRAY_SET ( expression )+ ) | print_statement | read_statement | ( TRUE | FALSE ) | QUOTE ! ( LETTER | DIGIT ) QUOTE !);
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
		Token set99=null;
		Token QUOTE100=null;
		Token set101=null;
		Token QUOTE102=null;
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
		Object set99_tree=null;
		Object QUOTE100_tree=null;
		Object set101_tree=null;
		Object QUOTE102_tree=null;
		RewriteRuleTokenStream stream_LCURLY=new RewriteRuleTokenStream(adaptor,"token LCURLY");
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_RCURLY=new RewriteRuleTokenStream(adaptor,"token RCURLY");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try {
			// Neptune.g:151:5: ( IDENTIFIER | NUMBER | LPAREN ! assignment_expr RPAREN !| LCURLY expression ( COMMA expression )* RCURLY -> ^( ARRAY_SET ( expression )+ ) | print_statement | read_statement | ( TRUE | FALSE ) | QUOTE ! ( LETTER | DIGIT ) QUOTE !)
			int alt18=8;
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
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 18, 0, input);
				throw nvae;
			}
			switch (alt18) {
				case 1 :
					// Neptune.g:151:9: IDENTIFIER
					{
					root_0 = (Object)adaptor.nil();


					IDENTIFIER87=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_operand1491); 
					IDENTIFIER87_tree = (Object)adaptor.create(IDENTIFIER87);
					adaptor.addChild(root_0, IDENTIFIER87_tree);

					}
					break;
				case 2 :
					// Neptune.g:152:9: NUMBER
					{
					root_0 = (Object)adaptor.nil();


					NUMBER88=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_operand1501); 
					NUMBER88_tree = (Object)adaptor.create(NUMBER88);
					adaptor.addChild(root_0, NUMBER88_tree);

					}
					break;
				case 3 :
					// Neptune.g:153:9: LPAREN ! assignment_expr RPAREN !
					{
					root_0 = (Object)adaptor.nil();


					LPAREN89=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_operand1511); 
					pushFollow(FOLLOW_assignment_expr_in_operand1514);
					assignment_expr90=assignment_expr();
					state._fsp--;

					adaptor.addChild(root_0, assignment_expr90.getTree());

					RPAREN91=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_operand1516); 
					}
					break;
				case 4 :
					// Neptune.g:154:4: LCURLY expression ( COMMA expression )* RCURLY
					{
					LCURLY92=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_operand1522);  
					stream_LCURLY.add(LCURLY92);

					pushFollow(FOLLOW_expression_in_operand1524);
					expression93=expression();
					state._fsp--;

					stream_expression.add(expression93.getTree());
					// Neptune.g:154:22: ( COMMA expression )*
					loop17:
					while (true) {
						int alt17=2;
						int LA17_0 = input.LA(1);
						if ( (LA17_0==COMMA) ) {
							alt17=1;
						}

						switch (alt17) {
						case 1 :
							// Neptune.g:154:23: COMMA expression
							{
							COMMA94=(Token)match(input,COMMA,FOLLOW_COMMA_in_operand1527);  
							stream_COMMA.add(COMMA94);

							pushFollow(FOLLOW_expression_in_operand1529);
							expression95=expression();
							state._fsp--;

							stream_expression.add(expression95.getTree());
							}
							break;

						default :
							break loop17;
						}
					}

					RCURLY96=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_operand1533);  
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
					// 155:3: -> ^( ARRAY_SET ( expression )+ )
					{
						// Neptune.g:155:6: ^( ARRAY_SET ( expression )+ )
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
					// Neptune.g:156:4: print_statement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_print_statement_in_operand1549);
					print_statement97=print_statement();
					state._fsp--;

					adaptor.addChild(root_0, print_statement97.getTree());

					}
					break;
				case 6 :
					// Neptune.g:157:4: read_statement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_read_statement_in_operand1554);
					read_statement98=read_statement();
					state._fsp--;

					adaptor.addChild(root_0, read_statement98.getTree());

					}
					break;
				case 7 :
					// Neptune.g:158:4: ( TRUE | FALSE )
					{
					root_0 = (Object)adaptor.nil();


					set99=input.LT(1);
					if ( input.LA(1)==FALSE||input.LA(1)==TRUE ) {
						input.consume();
						adaptor.addChild(root_0, (Object)adaptor.create(set99));
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					}
					break;
				case 8 :
					// Neptune.g:159:4: QUOTE ! ( LETTER | DIGIT ) QUOTE !
					{
					root_0 = (Object)adaptor.nil();


					QUOTE100=(Token)match(input,QUOTE,FOLLOW_QUOTE_in_operand1570); 
					set101=input.LT(1);
					if ( input.LA(1)==DIGIT||input.LA(1)==LETTER ) {
						input.consume();
						adaptor.addChild(root_0, (Object)adaptor.create(set101));
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					QUOTE102=(Token)match(input,QUOTE,FOLLOW_QUOTE_in_operand1579); 
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
	// Neptune.g:162:1: type : ( INTEGER ( array_def )? | CHAR ( array_def )? | BOOLEAN ( array_def )? );
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
			// Neptune.g:163:2: ( INTEGER ( array_def )? | CHAR ( array_def )? | BOOLEAN ( array_def )? )
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
					// Neptune.g:163:4: INTEGER ( array_def )?
					{
					root_0 = (Object)adaptor.nil();


					INTEGER103=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_type1594); 
					INTEGER103_tree = (Object)adaptor.create(INTEGER103);
					adaptor.addChild(root_0, INTEGER103_tree);

					// Neptune.g:163:12: ( array_def )?
					int alt19=2;
					int LA19_0 = input.LA(1);
					if ( (LA19_0==LBRACKET) ) {
						alt19=1;
					}
					switch (alt19) {
						case 1 :
							// Neptune.g:163:12: array_def
							{
							pushFollow(FOLLOW_array_def_in_type1596);
							array_def104=array_def();
							state._fsp--;

							adaptor.addChild(root_0, array_def104.getTree());

							}
							break;

					}

					}
					break;
				case 2 :
					// Neptune.g:164:4: CHAR ( array_def )?
					{
					root_0 = (Object)adaptor.nil();


					CHAR105=(Token)match(input,CHAR,FOLLOW_CHAR_in_type1602); 
					CHAR105_tree = (Object)adaptor.create(CHAR105);
					adaptor.addChild(root_0, CHAR105_tree);

					// Neptune.g:164:9: ( array_def )?
					int alt20=2;
					int LA20_0 = input.LA(1);
					if ( (LA20_0==LBRACKET) ) {
						alt20=1;
					}
					switch (alt20) {
						case 1 :
							// Neptune.g:164:9: array_def
							{
							pushFollow(FOLLOW_array_def_in_type1604);
							array_def106=array_def();
							state._fsp--;

							adaptor.addChild(root_0, array_def106.getTree());

							}
							break;

					}

					}
					break;
				case 3 :
					// Neptune.g:165:4: BOOLEAN ( array_def )?
					{
					root_0 = (Object)adaptor.nil();


					BOOLEAN107=(Token)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_type1610); 
					BOOLEAN107_tree = (Object)adaptor.create(BOOLEAN107);
					adaptor.addChild(root_0, BOOLEAN107_tree);

					// Neptune.g:165:12: ( array_def )?
					int alt21=2;
					int LA21_0 = input.LA(1);
					if ( (LA21_0==LBRACKET) ) {
						alt21=1;
					}
					switch (alt21) {
						case 1 :
							// Neptune.g:165:12: array_def
							{
							pushFollow(FOLLOW_array_def_in_type1612);
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
	// Neptune.g:168:1: array_def : LBRACKET ( NUMBER )? RBRACKET ;
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
			// Neptune.g:169:2: ( LBRACKET ( NUMBER )? RBRACKET )
			// Neptune.g:169:5: LBRACKET ( NUMBER )? RBRACKET
			{
			root_0 = (Object)adaptor.nil();


			LBRACKET109=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_array_def1626); 
			LBRACKET109_tree = (Object)adaptor.create(LBRACKET109);
			adaptor.addChild(root_0, LBRACKET109_tree);

			// Neptune.g:169:14: ( NUMBER )?
			int alt23=2;
			int LA23_0 = input.LA(1);
			if ( (LA23_0==NUMBER) ) {
				alt23=1;
			}
			switch (alt23) {
				case 1 :
					// Neptune.g:169:14: NUMBER
					{
					NUMBER110=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_array_def1628); 
					NUMBER110_tree = (Object)adaptor.create(NUMBER110);
					adaptor.addChild(root_0, NUMBER110_tree);

					}
					break;

			}

			RBRACKET111=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_array_def1631); 
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



	public static final BitSet FOLLOW_lines_in_program1020 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_program1022 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_line_in_lines1057 = new BitSet(new long[]{0x006825424B180802L});
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
	public static final BitSet FOLLOW_LPAREN_in_while_statement1128 = new BitSet(new long[]{0x0008254241080000L});
	public static final BitSet FOLLOW_expression_in_while_statement1131 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_RPAREN_in_while_statement1133 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_LCURLY_in_while_statement1136 = new BitSet(new long[]{0x006825424B180800L});
	public static final BitSet FOLLOW_lines_in_while_statement1139 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_RCURLY_in_while_statement1141 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FOREACH_in_foreach_statement1154 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_LPAREN_in_foreach_statement1157 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_foreach_statement1160 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_IN_in_foreach_statement1162 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_foreach_statement1165 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_RPAREN_in_foreach_statement1167 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_LCURLY_in_foreach_statement1170 = new BitSet(new long[]{0x006825424B180800L});
	public static final BitSet FOLLOW_lines_in_foreach_statement1173 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_RCURLY_in_foreach_statement1175 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_if_statement1188 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_LPAREN_in_if_statement1191 = new BitSet(new long[]{0x0008254241080000L});
	public static final BitSet FOLLOW_expression_in_if_statement1194 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_RPAREN_in_if_statement1196 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_LCURLY_in_if_statement1199 = new BitSet(new long[]{0x006825424B180800L});
	public static final BitSet FOLLOW_lines_in_if_statement1202 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_RCURLY_in_if_statement1204 = new BitSet(new long[]{0x0000000000030002L});
	public static final BitSet FOLLOW_ELSIF_in_if_statement1210 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_LPAREN_in_if_statement1212 = new BitSet(new long[]{0x0008254241080000L});
	public static final BitSet FOLLOW_expression_in_if_statement1215 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_RPAREN_in_if_statement1217 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_LCURLY_in_if_statement1220 = new BitSet(new long[]{0x006825424B180800L});
	public static final BitSet FOLLOW_lines_in_if_statement1223 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_RCURLY_in_if_statement1225 = new BitSet(new long[]{0x0000000000030002L});
	public static final BitSet FOLLOW_ELSE_in_if_statement1233 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_LCURLY_in_if_statement1235 = new BitSet(new long[]{0x006825424B180800L});
	public static final BitSet FOLLOW_lines_in_if_statement1238 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_RCURLY_in_if_statement1240 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INCLUDE_in_include_statement1255 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_56_in_include_statement1258 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRINT_in_print_statement1270 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_LPAREN_in_print_statement1273 = new BitSet(new long[]{0x0008254241080000L});
	public static final BitSet FOLLOW_expression_in_print_statement1276 = new BitSet(new long[]{0x0000800000000200L});
	public static final BitSet FOLLOW_COMMA_in_print_statement1279 = new BitSet(new long[]{0x0008254241080000L});
	public static final BitSet FOLLOW_expression_in_print_statement1281 = new BitSet(new long[]{0x0000800000000200L});
	public static final BitSet FOLLOW_RPAREN_in_print_statement1285 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_READ_in_read_statement1298 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_LPAREN_in_read_statement1301 = new BitSet(new long[]{0x0008254241080000L});
	public static final BitSet FOLLOW_expression_in_read_statement1304 = new BitSet(new long[]{0x0000800000000200L});
	public static final BitSet FOLLOW_COMMA_in_read_statement1307 = new BitSet(new long[]{0x0008254241080000L});
	public static final BitSet FOLLOW_expression_in_read_statement1309 = new BitSet(new long[]{0x0000800000000200L});
	public static final BitSet FOLLOW_RPAREN_in_read_statement1313 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_declaration1327 = new BitSet(new long[]{0x00000000100000C0L});
	public static final BitSet FOLLOW_CONST_in_declaration1332 = new BitSet(new long[]{0x00000000100000C0L});
	public static final BitSet FOLLOW_type_in_declaration1336 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_declaration1338 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_BECOMES_in_declaration1341 = new BitSet(new long[]{0x0008254241080000L});
	public static final BitSet FOLLOW_expression_in_declaration1343 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignment_expr_in_expression1357 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_boolean_expr_in_assignment_expr1368 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_BECOMES_in_assignment_expr1371 = new BitSet(new long[]{0x0008254241080000L});
	public static final BitSet FOLLOW_assignment_expr_in_assignment_expr1374 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_plus_expr_in_boolean_expr1388 = new BitSet(new long[]{0x0000002C00C40002L});
	public static final BitSet FOLLOW_LT_in_boolean_expr1392 = new BitSet(new long[]{0x0008254241080000L});
	public static final BitSet FOLLOW_LT_EQ_in_boolean_expr1397 = new BitSet(new long[]{0x0008254241080000L});
	public static final BitSet FOLLOW_GT_in_boolean_expr1402 = new BitSet(new long[]{0x0008254241080000L});
	public static final BitSet FOLLOW_GT_EQ_in_boolean_expr1407 = new BitSet(new long[]{0x0008254241080000L});
	public static final BitSet FOLLOW_EQ_in_boolean_expr1412 = new BitSet(new long[]{0x0008254241080000L});
	public static final BitSet FOLLOW_NEQ_in_boolean_expr1417 = new BitSet(new long[]{0x0008254241080000L});
	public static final BitSet FOLLOW_plus_expr_in_boolean_expr1421 = new BitSet(new long[]{0x0000002C00C40002L});
	public static final BitSet FOLLOW_multi_expr_in_plus_expr1434 = new BitSet(new long[]{0x0000009000000002L});
	public static final BitSet FOLLOW_PLUS_in_plus_expr1438 = new BitSet(new long[]{0x0008254241080000L});
	public static final BitSet FOLLOW_MINUS_in_plus_expr1443 = new BitSet(new long[]{0x0008254241080000L});
	public static final BitSet FOLLOW_multi_expr_in_plus_expr1447 = new BitSet(new long[]{0x0000009000000002L});
	public static final BitSet FOLLOW_operand_in_multi_expr1460 = new BitSet(new long[]{0x0004000000002002L});
	public static final BitSet FOLLOW_TIMES_in_multi_expr1464 = new BitSet(new long[]{0x0008254241080000L});
	public static final BitSet FOLLOW_DIVIDE_in_multi_expr1469 = new BitSet(new long[]{0x0008254241080000L});
	public static final BitSet FOLLOW_operand_in_multi_expr1473 = new BitSet(new long[]{0x0004000000002002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_operand1491 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMBER_in_operand1501 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_operand1511 = new BitSet(new long[]{0x0008254241080000L});
	public static final BitSet FOLLOW_assignment_expr_in_operand1514 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_RPAREN_in_operand1516 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LCURLY_in_operand1522 = new BitSet(new long[]{0x0008254241080000L});
	public static final BitSet FOLLOW_expression_in_operand1524 = new BitSet(new long[]{0x0000100000000200L});
	public static final BitSet FOLLOW_COMMA_in_operand1527 = new BitSet(new long[]{0x0008254241080000L});
	public static final BitSet FOLLOW_expression_in_operand1529 = new BitSet(new long[]{0x0000100000000200L});
	public static final BitSet FOLLOW_RCURLY_in_operand1533 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_print_statement_in_operand1549 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_read_statement_in_operand1554 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_operand1559 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QUOTE_in_operand1570 = new BitSet(new long[]{0x0000000080001000L});
	public static final BitSet FOLLOW_set_in_operand1573 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_QUOTE_in_operand1579 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTEGER_in_type1594 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_array_def_in_type1596 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_in_type1602 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_array_def_in_type1604 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOLEAN_in_type1610 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_array_def_in_type1612 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACKET_in_array_def1626 = new BitSet(new long[]{0x0000084000000000L});
	public static final BitSet FOLLOW_NUMBER_in_array_def1628 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_RBRACKET_in_array_def1631 = new BitSet(new long[]{0x0000000000000002L});
}

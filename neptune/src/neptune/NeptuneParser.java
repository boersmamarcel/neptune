// $ANTLR 3.5.2 antlr/Neptune.g 2014-07-04 15:23:22

package neptune;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class NeptuneParser extends Parser {
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
	@Override public String getGrammarFileName() { return "antlr/Neptune.g"; }


	public static class program_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "program"
	// antlr/Neptune.g:126:1: program : lines EOF -> ^( PROGRAM lines ) ;
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
			// antlr/Neptune.g:127:5: ( lines EOF -> ^( PROGRAM lines ) )
			// antlr/Neptune.g:127:9: lines EOF
			{
			pushFollow(FOLLOW_lines_in_program1126);
			lines1=lines();
			state._fsp--;

			stream_lines.add(lines1.getTree());
			EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_program1128);  
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
			// 128:13: -> ^( PROGRAM lines )
			{
				// antlr/Neptune.g:128:17: ^( PROGRAM lines )
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
	// antlr/Neptune.g:131:1: lines : ( line )+ ;
	public final NeptuneParser.lines_return lines() throws RecognitionException {
		NeptuneParser.lines_return retval = new NeptuneParser.lines_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope line3 =null;


		try {
			// antlr/Neptune.g:132:2: ( ( line )+ )
			// antlr/Neptune.g:132:4: ( line )+
			{
			root_0 = (Object)adaptor.nil();


			// antlr/Neptune.g:132:4: ( line )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= BOOLEAN && LA1_0 <= CHAR_LITERAL)||LA1_0==CONST||(LA1_0 >= FALSE && LA1_0 <= FUNCTION)||(LA1_0 >= IDENTIFIER && LA1_0 <= IF)||(LA1_0 >= INTEGER && LA1_0 <= LCURLY)||LA1_0==LPAREN||LA1_0==MINUS||LA1_0==NEGATE||LA1_0==NUMBER||(LA1_0 >= PLUS && LA1_0 <= PRINT)||LA1_0==READ||(LA1_0 >= SIZEOF && LA1_0 <= STRING_LITERAL)||LA1_0==TRUE||LA1_0==WHILE) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// antlr/Neptune.g:132:4: line
					{
					pushFollow(FOLLOW_line_in_lines1163);
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
	// antlr/Neptune.g:135:1: line : ( expression SEMICOLON !| declaration SEMICOLON !| logic_statement );
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
			// antlr/Neptune.g:136:2: ( expression SEMICOLON !| declaration SEMICOLON !| logic_statement )
			int alt2=3;
			switch ( input.LA(1) ) {
			case CHAR_LITERAL:
			case FALSE:
			case IDENTIFIER:
			case LBRACKET:
			case LCURLY:
			case LPAREN:
			case MINUS:
			case NEGATE:
			case NUMBER:
			case PLUS:
			case PRINT:
			case READ:
			case SIZEOF:
			case STRING_LITERAL:
			case TRUE:
				{
				alt2=1;
				}
				break;
			case BOOLEAN:
			case CHAR:
			case CONST:
			case FUNCTION:
			case INTEGER:
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
					// antlr/Neptune.g:136:4: expression SEMICOLON !
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_expression_in_line1176);
					expression4=expression();
					state._fsp--;

					adaptor.addChild(root_0, expression4.getTree());

					SEMICOLON5=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_line1178); 
					}
					break;
				case 2 :
					// antlr/Neptune.g:137:4: declaration SEMICOLON !
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_declaration_in_line1184);
					declaration6=declaration();
					state._fsp--;

					adaptor.addChild(root_0, declaration6.getTree());

					SEMICOLON7=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_line1186); 
					}
					break;
				case 3 :
					// antlr/Neptune.g:138:4: logic_statement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_logic_statement_in_line1192);
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


	public static class codeblock_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "codeblock"
	// antlr/Neptune.g:141:1: codeblock : LCURLY lines RCURLY -> ^( BLOCK lines ) ;
	public final NeptuneParser.codeblock_return codeblock() throws RecognitionException {
		NeptuneParser.codeblock_return retval = new NeptuneParser.codeblock_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token LCURLY9=null;
		Token RCURLY11=null;
		ParserRuleReturnScope lines10 =null;

		Object LCURLY9_tree=null;
		Object RCURLY11_tree=null;
		RewriteRuleTokenStream stream_LCURLY=new RewriteRuleTokenStream(adaptor,"token LCURLY");
		RewriteRuleTokenStream stream_RCURLY=new RewriteRuleTokenStream(adaptor,"token RCURLY");
		RewriteRuleSubtreeStream stream_lines=new RewriteRuleSubtreeStream(adaptor,"rule lines");

		try {
			// antlr/Neptune.g:142:2: ( LCURLY lines RCURLY -> ^( BLOCK lines ) )
			// antlr/Neptune.g:142:4: LCURLY lines RCURLY
			{
			LCURLY9=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_codeblock1204);  
			stream_LCURLY.add(LCURLY9);

			pushFollow(FOLLOW_lines_in_codeblock1206);
			lines10=lines();
			state._fsp--;

			stream_lines.add(lines10.getTree());
			RCURLY11=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_codeblock1208);  
			stream_RCURLY.add(RCURLY11);

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
			// 143:3: -> ^( BLOCK lines )
			{
				// antlr/Neptune.g:143:6: ^( BLOCK lines )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BLOCK, "BLOCK"), root_1);
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
	// $ANTLR end "codeblock"


	public static class logic_statement_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "logic_statement"
	// antlr/Neptune.g:146:1: logic_statement : ( while_statement | foreach_statement | if_statement );
	public final NeptuneParser.logic_statement_return logic_statement() throws RecognitionException {
		NeptuneParser.logic_statement_return retval = new NeptuneParser.logic_statement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope while_statement12 =null;
		ParserRuleReturnScope foreach_statement13 =null;
		ParserRuleReturnScope if_statement14 =null;


		try {
			// antlr/Neptune.g:147:2: ( while_statement | foreach_statement | if_statement )
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
					// antlr/Neptune.g:147:4: while_statement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_while_statement_in_logic_statement1230);
					while_statement12=while_statement();
					state._fsp--;

					adaptor.addChild(root_0, while_statement12.getTree());

					}
					break;
				case 2 :
					// antlr/Neptune.g:148:4: foreach_statement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_foreach_statement_in_logic_statement1235);
					foreach_statement13=foreach_statement();
					state._fsp--;

					adaptor.addChild(root_0, foreach_statement13.getTree());

					}
					break;
				case 3 :
					// antlr/Neptune.g:149:4: if_statement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_if_statement_in_logic_statement1240);
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
	// antlr/Neptune.g:154:1: while_statement : WHILE ^ LPAREN ! expression RPAREN ! LCURLY ! lines RCURLY !;
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
			// antlr/Neptune.g:155:2: ( WHILE ^ LPAREN ! expression RPAREN ! LCURLY ! lines RCURLY !)
			// antlr/Neptune.g:155:4: WHILE ^ LPAREN ! expression RPAREN ! LCURLY ! lines RCURLY !
			{
			root_0 = (Object)adaptor.nil();


			WHILE15=(Token)match(input,WHILE,FOLLOW_WHILE_in_while_statement1254); 
			WHILE15_tree = (Object)adaptor.create(WHILE15);
			root_0 = (Object)adaptor.becomeRoot(WHILE15_tree, root_0);

			LPAREN16=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_while_statement1257); 
			pushFollow(FOLLOW_expression_in_while_statement1260);
			expression17=expression();
			state._fsp--;

			adaptor.addChild(root_0, expression17.getTree());

			RPAREN18=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_while_statement1262); 
			LCURLY19=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_while_statement1265); 
			pushFollow(FOLLOW_lines_in_while_statement1268);
			lines20=lines();
			state._fsp--;

			adaptor.addChild(root_0, lines20.getTree());

			RCURLY21=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_while_statement1270); 
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
	// antlr/Neptune.g:158:1: foreach_statement : FOREACH ^ LPAREN ! IDENTIFIER IN ! IDENTIFIER RPAREN ! LCURLY ! lines RCURLY !;
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
			// antlr/Neptune.g:159:2: ( FOREACH ^ LPAREN ! IDENTIFIER IN ! IDENTIFIER RPAREN ! LCURLY ! lines RCURLY !)
			// antlr/Neptune.g:159:4: FOREACH ^ LPAREN ! IDENTIFIER IN ! IDENTIFIER RPAREN ! LCURLY ! lines RCURLY !
			{
			root_0 = (Object)adaptor.nil();


			FOREACH22=(Token)match(input,FOREACH,FOLLOW_FOREACH_in_foreach_statement1283); 
			FOREACH22_tree = (Object)adaptor.create(FOREACH22);
			root_0 = (Object)adaptor.becomeRoot(FOREACH22_tree, root_0);

			LPAREN23=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_foreach_statement1286); 
			IDENTIFIER24=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_foreach_statement1289); 
			IDENTIFIER24_tree = (Object)adaptor.create(IDENTIFIER24);
			adaptor.addChild(root_0, IDENTIFIER24_tree);

			IN25=(Token)match(input,IN,FOLLOW_IN_in_foreach_statement1291); 
			IDENTIFIER26=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_foreach_statement1294); 
			IDENTIFIER26_tree = (Object)adaptor.create(IDENTIFIER26);
			adaptor.addChild(root_0, IDENTIFIER26_tree);

			RPAREN27=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_foreach_statement1296); 
			LCURLY28=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_foreach_statement1299); 
			pushFollow(FOLLOW_lines_in_foreach_statement1302);
			lines29=lines();
			state._fsp--;

			adaptor.addChild(root_0, lines29.getTree());

			RCURLY30=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_foreach_statement1304); 
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
	// antlr/Neptune.g:162:1: if_statement : IF ^ LPAREN ! expression RPAREN ! LCURLY ! lines RCURLY ! ( ELSIF LPAREN ! expression RPAREN ! LCURLY ! lines RCURLY !)* ( ELSE LCURLY ! lines RCURLY !)? ;
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
			// antlr/Neptune.g:163:2: ( IF ^ LPAREN ! expression RPAREN ! LCURLY ! lines RCURLY ! ( ELSIF LPAREN ! expression RPAREN ! LCURLY ! lines RCURLY !)* ( ELSE LCURLY ! lines RCURLY !)? )
			// antlr/Neptune.g:163:4: IF ^ LPAREN ! expression RPAREN ! LCURLY ! lines RCURLY ! ( ELSIF LPAREN ! expression RPAREN ! LCURLY ! lines RCURLY !)* ( ELSE LCURLY ! lines RCURLY !)?
			{
			root_0 = (Object)adaptor.nil();


			IF31=(Token)match(input,IF,FOLLOW_IF_in_if_statement1317); 
			IF31_tree = (Object)adaptor.create(IF31);
			root_0 = (Object)adaptor.becomeRoot(IF31_tree, root_0);

			LPAREN32=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_if_statement1320); 
			pushFollow(FOLLOW_expression_in_if_statement1323);
			expression33=expression();
			state._fsp--;

			adaptor.addChild(root_0, expression33.getTree());

			RPAREN34=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_if_statement1325); 
			LCURLY35=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_if_statement1328); 
			pushFollow(FOLLOW_lines_in_if_statement1331);
			lines36=lines();
			state._fsp--;

			adaptor.addChild(root_0, lines36.getTree());

			RCURLY37=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_if_statement1333); 
			// antlr/Neptune.g:164:3: ( ELSIF LPAREN ! expression RPAREN ! LCURLY ! lines RCURLY !)*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==ELSIF) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// antlr/Neptune.g:164:4: ELSIF LPAREN ! expression RPAREN ! LCURLY ! lines RCURLY !
					{
					ELSIF38=(Token)match(input,ELSIF,FOLLOW_ELSIF_in_if_statement1339); 
					ELSIF38_tree = (Object)adaptor.create(ELSIF38);
					adaptor.addChild(root_0, ELSIF38_tree);

					LPAREN39=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_if_statement1341); 
					pushFollow(FOLLOW_expression_in_if_statement1344);
					expression40=expression();
					state._fsp--;

					adaptor.addChild(root_0, expression40.getTree());

					RPAREN41=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_if_statement1346); 
					LCURLY42=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_if_statement1349); 
					pushFollow(FOLLOW_lines_in_if_statement1352);
					lines43=lines();
					state._fsp--;

					adaptor.addChild(root_0, lines43.getTree());

					RCURLY44=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_if_statement1354); 
					}
					break;

				default :
					break loop4;
				}
			}

			// antlr/Neptune.g:165:3: ( ELSE LCURLY ! lines RCURLY !)?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==ELSE) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// antlr/Neptune.g:165:4: ELSE LCURLY ! lines RCURLY !
					{
					ELSE45=(Token)match(input,ELSE,FOLLOW_ELSE_in_if_statement1362); 
					ELSE45_tree = (Object)adaptor.create(ELSE45);
					adaptor.addChild(root_0, ELSE45_tree);

					LCURLY46=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_if_statement1364); 
					pushFollow(FOLLOW_lines_in_if_statement1367);
					lines47=lines();
					state._fsp--;

					adaptor.addChild(root_0, lines47.getTree());

					RCURLY48=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_if_statement1369); 
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
	// antlr/Neptune.g:168:1: print_statement : PRINT ^ LPAREN ! expression ( COMMA ! expression )* RPAREN !;
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
			// antlr/Neptune.g:169:2: ( PRINT ^ LPAREN ! expression ( COMMA ! expression )* RPAREN !)
			// antlr/Neptune.g:169:4: PRINT ^ LPAREN ! expression ( COMMA ! expression )* RPAREN !
			{
			root_0 = (Object)adaptor.nil();


			PRINT49=(Token)match(input,PRINT,FOLLOW_PRINT_in_print_statement1384); 
			PRINT49_tree = (Object)adaptor.create(PRINT49);
			root_0 = (Object)adaptor.becomeRoot(PRINT49_tree, root_0);

			LPAREN50=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_print_statement1387); 
			pushFollow(FOLLOW_expression_in_print_statement1390);
			expression51=expression();
			state._fsp--;

			adaptor.addChild(root_0, expression51.getTree());

			// antlr/Neptune.g:169:30: ( COMMA ! expression )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==COMMA) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// antlr/Neptune.g:169:31: COMMA ! expression
					{
					COMMA52=(Token)match(input,COMMA,FOLLOW_COMMA_in_print_statement1393); 
					pushFollow(FOLLOW_expression_in_print_statement1396);
					expression53=expression();
					state._fsp--;

					adaptor.addChild(root_0, expression53.getTree());

					}
					break;

				default :
					break loop6;
				}
			}

			RPAREN54=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_print_statement1400); 
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
	// antlr/Neptune.g:172:1: read_statement : READ ^ LPAREN ! expression ( COMMA ! expression )* RPAREN !;
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
			// antlr/Neptune.g:173:2: ( READ ^ LPAREN ! expression ( COMMA ! expression )* RPAREN !)
			// antlr/Neptune.g:173:4: READ ^ LPAREN ! expression ( COMMA ! expression )* RPAREN !
			{
			root_0 = (Object)adaptor.nil();


			READ55=(Token)match(input,READ,FOLLOW_READ_in_read_statement1413); 
			READ55_tree = (Object)adaptor.create(READ55);
			root_0 = (Object)adaptor.becomeRoot(READ55_tree, root_0);

			LPAREN56=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_read_statement1416); 
			pushFollow(FOLLOW_expression_in_read_statement1419);
			expression57=expression();
			state._fsp--;

			adaptor.addChild(root_0, expression57.getTree());

			// antlr/Neptune.g:173:29: ( COMMA ! expression )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==COMMA) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// antlr/Neptune.g:173:30: COMMA ! expression
					{
					COMMA58=(Token)match(input,COMMA,FOLLOW_COMMA_in_read_statement1422); 
					pushFollow(FOLLOW_expression_in_read_statement1425);
					expression59=expression();
					state._fsp--;

					adaptor.addChild(root_0, expression59.getTree());

					}
					break;

				default :
					break loop7;
				}
			}

			RPAREN60=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_read_statement1429); 
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
	// antlr/Neptune.g:176:1: declaration : ( type IDENTIFIER ( BECOMES expression )? -> ^( VAR type IDENTIFIER ( BECOMES expression )? ) | CONST ^ type IDENTIFIER BECOMES expression | FUNCTION type IDENTIFIER LPAREN type IDENTIFIER ( COMMA type IDENTIFIER )* RPAREN LCURLY ( line )* return_statement RCURLY -> ^( FUNCTION type IDENTIFIER ( type IDENTIFIER )* ( line )* return_statement ) );
	public final NeptuneParser.declaration_return declaration() throws RecognitionException {
		NeptuneParser.declaration_return retval = new NeptuneParser.declaration_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IDENTIFIER62=null;
		Token BECOMES63=null;
		Token CONST65=null;
		Token IDENTIFIER67=null;
		Token BECOMES68=null;
		Token FUNCTION70=null;
		Token IDENTIFIER72=null;
		Token LPAREN73=null;
		Token IDENTIFIER75=null;
		Token COMMA76=null;
		Token IDENTIFIER78=null;
		Token RPAREN79=null;
		Token LCURLY80=null;
		Token RCURLY83=null;
		ParserRuleReturnScope type61 =null;
		ParserRuleReturnScope expression64 =null;
		ParserRuleReturnScope type66 =null;
		ParserRuleReturnScope expression69 =null;
		ParserRuleReturnScope type71 =null;
		ParserRuleReturnScope type74 =null;
		ParserRuleReturnScope type77 =null;
		ParserRuleReturnScope line81 =null;
		ParserRuleReturnScope return_statement82 =null;

		Object IDENTIFIER62_tree=null;
		Object BECOMES63_tree=null;
		Object CONST65_tree=null;
		Object IDENTIFIER67_tree=null;
		Object BECOMES68_tree=null;
		Object FUNCTION70_tree=null;
		Object IDENTIFIER72_tree=null;
		Object LPAREN73_tree=null;
		Object IDENTIFIER75_tree=null;
		Object COMMA76_tree=null;
		Object IDENTIFIER78_tree=null;
		Object RPAREN79_tree=null;
		Object LCURLY80_tree=null;
		Object RCURLY83_tree=null;
		RewriteRuleTokenStream stream_FUNCTION=new RewriteRuleTokenStream(adaptor,"token FUNCTION");
		RewriteRuleTokenStream stream_BECOMES=new RewriteRuleTokenStream(adaptor,"token BECOMES");
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleTokenStream stream_LCURLY=new RewriteRuleTokenStream(adaptor,"token LCURLY");
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleTokenStream stream_RCURLY=new RewriteRuleTokenStream(adaptor,"token RCURLY");
		RewriteRuleSubtreeStream stream_return_statement=new RewriteRuleSubtreeStream(adaptor,"rule return_statement");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_line=new RewriteRuleSubtreeStream(adaptor,"rule line");
		RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");

		try {
			// antlr/Neptune.g:177:2: ( type IDENTIFIER ( BECOMES expression )? -> ^( VAR type IDENTIFIER ( BECOMES expression )? ) | CONST ^ type IDENTIFIER BECOMES expression | FUNCTION type IDENTIFIER LPAREN type IDENTIFIER ( COMMA type IDENTIFIER )* RPAREN LCURLY ( line )* return_statement RCURLY -> ^( FUNCTION type IDENTIFIER ( type IDENTIFIER )* ( line )* return_statement ) )
			int alt11=3;
			switch ( input.LA(1) ) {
			case BOOLEAN:
			case CHAR:
			case INTEGER:
				{
				alt11=1;
				}
				break;
			case CONST:
				{
				alt11=2;
				}
				break;
			case FUNCTION:
				{
				alt11=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}
			switch (alt11) {
				case 1 :
					// antlr/Neptune.g:177:4: type IDENTIFIER ( BECOMES expression )?
					{
					pushFollow(FOLLOW_type_in_declaration1442);
					type61=type();
					state._fsp--;

					stream_type.add(type61.getTree());
					IDENTIFIER62=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_declaration1444);  
					stream_IDENTIFIER.add(IDENTIFIER62);

					// antlr/Neptune.g:177:20: ( BECOMES expression )?
					int alt8=2;
					int LA8_0 = input.LA(1);
					if ( (LA8_0==BECOMES) ) {
						alt8=1;
					}
					switch (alt8) {
						case 1 :
							// antlr/Neptune.g:177:21: BECOMES expression
							{
							BECOMES63=(Token)match(input,BECOMES,FOLLOW_BECOMES_in_declaration1447);  
							stream_BECOMES.add(BECOMES63);

							pushFollow(FOLLOW_expression_in_declaration1449);
							expression64=expression();
							state._fsp--;

							stream_expression.add(expression64.getTree());
							}
							break;

					}

					// AST REWRITE
					// elements: BECOMES, IDENTIFIER, expression, type
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 178:3: -> ^( VAR type IDENTIFIER ( BECOMES expression )? )
					{
						// antlr/Neptune.g:178:6: ^( VAR type IDENTIFIER ( BECOMES expression )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VAR, "VAR"), root_1);
						adaptor.addChild(root_1, stream_type.nextTree());
						adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
						// antlr/Neptune.g:178:28: ( BECOMES expression )?
						if ( stream_BECOMES.hasNext()||stream_expression.hasNext() ) {
							adaptor.addChild(root_1, stream_BECOMES.nextNode());
							adaptor.addChild(root_1, stream_expression.nextTree());
						}
						stream_BECOMES.reset();
						stream_expression.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// antlr/Neptune.g:179:4: CONST ^ type IDENTIFIER BECOMES expression
					{
					root_0 = (Object)adaptor.nil();


					CONST65=(Token)match(input,CONST,FOLLOW_CONST_in_declaration1475); 
					CONST65_tree = (Object)adaptor.create(CONST65);
					root_0 = (Object)adaptor.becomeRoot(CONST65_tree, root_0);

					pushFollow(FOLLOW_type_in_declaration1478);
					type66=type();
					state._fsp--;

					adaptor.addChild(root_0, type66.getTree());

					IDENTIFIER67=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_declaration1480); 
					IDENTIFIER67_tree = (Object)adaptor.create(IDENTIFIER67);
					adaptor.addChild(root_0, IDENTIFIER67_tree);

					BECOMES68=(Token)match(input,BECOMES,FOLLOW_BECOMES_in_declaration1482); 
					BECOMES68_tree = (Object)adaptor.create(BECOMES68);
					adaptor.addChild(root_0, BECOMES68_tree);

					pushFollow(FOLLOW_expression_in_declaration1484);
					expression69=expression();
					state._fsp--;

					adaptor.addChild(root_0, expression69.getTree());

					}
					break;
				case 3 :
					// antlr/Neptune.g:180:6: FUNCTION type IDENTIFIER LPAREN type IDENTIFIER ( COMMA type IDENTIFIER )* RPAREN LCURLY ( line )* return_statement RCURLY
					{
					FUNCTION70=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_declaration1491);  
					stream_FUNCTION.add(FUNCTION70);

					pushFollow(FOLLOW_type_in_declaration1493);
					type71=type();
					state._fsp--;

					stream_type.add(type71.getTree());
					IDENTIFIER72=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_declaration1495);  
					stream_IDENTIFIER.add(IDENTIFIER72);

					LPAREN73=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_declaration1497);  
					stream_LPAREN.add(LPAREN73);

					pushFollow(FOLLOW_type_in_declaration1499);
					type74=type();
					state._fsp--;

					stream_type.add(type74.getTree());
					IDENTIFIER75=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_declaration1501);  
					stream_IDENTIFIER.add(IDENTIFIER75);

					// antlr/Neptune.g:180:54: ( COMMA type IDENTIFIER )*
					loop9:
					while (true) {
						int alt9=2;
						int LA9_0 = input.LA(1);
						if ( (LA9_0==COMMA) ) {
							alt9=1;
						}

						switch (alt9) {
						case 1 :
							// antlr/Neptune.g:180:55: COMMA type IDENTIFIER
							{
							COMMA76=(Token)match(input,COMMA,FOLLOW_COMMA_in_declaration1504);  
							stream_COMMA.add(COMMA76);

							pushFollow(FOLLOW_type_in_declaration1506);
							type77=type();
							state._fsp--;

							stream_type.add(type77.getTree());
							IDENTIFIER78=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_declaration1508);  
							stream_IDENTIFIER.add(IDENTIFIER78);

							}
							break;

						default :
							break loop9;
						}
					}

					RPAREN79=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_declaration1512);  
					stream_RPAREN.add(RPAREN79);

					LCURLY80=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_declaration1514);  
					stream_LCURLY.add(LCURLY80);

					// antlr/Neptune.g:180:93: ( line )*
					loop10:
					while (true) {
						int alt10=2;
						int LA10_0 = input.LA(1);
						if ( ((LA10_0 >= BOOLEAN && LA10_0 <= CHAR_LITERAL)||LA10_0==CONST||(LA10_0 >= FALSE && LA10_0 <= FUNCTION)||(LA10_0 >= IDENTIFIER && LA10_0 <= IF)||(LA10_0 >= INTEGER && LA10_0 <= LCURLY)||LA10_0==LPAREN||LA10_0==MINUS||LA10_0==NEGATE||LA10_0==NUMBER||(LA10_0 >= PLUS && LA10_0 <= PRINT)||LA10_0==READ||(LA10_0 >= SIZEOF && LA10_0 <= STRING_LITERAL)||LA10_0==TRUE||LA10_0==WHILE) ) {
							alt10=1;
						}

						switch (alt10) {
						case 1 :
							// antlr/Neptune.g:180:93: line
							{
							pushFollow(FOLLOW_line_in_declaration1516);
							line81=line();
							state._fsp--;

							stream_line.add(line81.getTree());
							}
							break;

						default :
							break loop10;
						}
					}

					pushFollow(FOLLOW_return_statement_in_declaration1519);
					return_statement82=return_statement();
					state._fsp--;

					stream_return_statement.add(return_statement82.getTree());
					RCURLY83=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_declaration1521);  
					stream_RCURLY.add(RCURLY83);

					// AST REWRITE
					// elements: return_statement, type, IDENTIFIER, FUNCTION, line, IDENTIFIER, type
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 181:3: -> ^( FUNCTION type IDENTIFIER ( type IDENTIFIER )* ( line )* return_statement )
					{
						// antlr/Neptune.g:181:6: ^( FUNCTION type IDENTIFIER ( type IDENTIFIER )* ( line )* return_statement )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot(stream_FUNCTION.nextNode(), root_1);
						adaptor.addChild(root_1, stream_type.nextTree());
						adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
						// antlr/Neptune.g:181:33: ( type IDENTIFIER )*
						while ( stream_IDENTIFIER.hasNext()||stream_type.hasNext() ) {
							adaptor.addChild(root_1, stream_type.nextTree());
							adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
						}
						stream_IDENTIFIER.reset();
						stream_type.reset();

						// antlr/Neptune.g:181:52: ( line )*
						while ( stream_line.hasNext() ) {
							adaptor.addChild(root_1, stream_line.nextTree());
						}
						stream_line.reset();

						adaptor.addChild(root_1, stream_return_statement.nextTree());
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
	// $ANTLR end "declaration"


	public static class return_statement_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "return_statement"
	// antlr/Neptune.g:184:1: return_statement : RETURN ^ LPAREN ! expression RPAREN ! SEMICOLON !;
	public final NeptuneParser.return_statement_return return_statement() throws RecognitionException {
		NeptuneParser.return_statement_return retval = new NeptuneParser.return_statement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token RETURN84=null;
		Token LPAREN85=null;
		Token RPAREN87=null;
		Token SEMICOLON88=null;
		ParserRuleReturnScope expression86 =null;

		Object RETURN84_tree=null;
		Object LPAREN85_tree=null;
		Object RPAREN87_tree=null;
		Object SEMICOLON88_tree=null;

		try {
			// antlr/Neptune.g:185:2: ( RETURN ^ LPAREN ! expression RPAREN ! SEMICOLON !)
			// antlr/Neptune.g:185:4: RETURN ^ LPAREN ! expression RPAREN ! SEMICOLON !
			{
			root_0 = (Object)adaptor.nil();


			RETURN84=(Token)match(input,RETURN,FOLLOW_RETURN_in_return_statement1556); 
			RETURN84_tree = (Object)adaptor.create(RETURN84);
			root_0 = (Object)adaptor.becomeRoot(RETURN84_tree, root_0);

			LPAREN85=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_return_statement1559); 
			pushFollow(FOLLOW_expression_in_return_statement1562);
			expression86=expression();
			state._fsp--;

			adaptor.addChild(root_0, expression86.getTree());

			RPAREN87=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_return_statement1564); 
			SEMICOLON88=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_return_statement1567); 
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
	// $ANTLR end "return_statement"


	public static class expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expression"
	// antlr/Neptune.g:188:1: expression : assignment_expr ;
	public final NeptuneParser.expression_return expression() throws RecognitionException {
		NeptuneParser.expression_return retval = new NeptuneParser.expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope assignment_expr89 =null;


		try {
			// antlr/Neptune.g:189:2: ( assignment_expr )
			// antlr/Neptune.g:189:5: assignment_expr
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_assignment_expr_in_expression1580);
			assignment_expr89=assignment_expr();
			state._fsp--;

			adaptor.addChild(root_0, assignment_expr89.getTree());

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
	// antlr/Neptune.g:192:1: assignment_expr : or_expr ( BECOMES ^ assignment_expr )? ;
	public final NeptuneParser.assignment_expr_return assignment_expr() throws RecognitionException {
		NeptuneParser.assignment_expr_return retval = new NeptuneParser.assignment_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token BECOMES91=null;
		ParserRuleReturnScope or_expr90 =null;
		ParserRuleReturnScope assignment_expr92 =null;

		Object BECOMES91_tree=null;

		try {
			// antlr/Neptune.g:193:2: ( or_expr ( BECOMES ^ assignment_expr )? )
			// antlr/Neptune.g:193:4: or_expr ( BECOMES ^ assignment_expr )?
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_or_expr_in_assignment_expr1592);
			or_expr90=or_expr();
			state._fsp--;

			adaptor.addChild(root_0, or_expr90.getTree());

			// antlr/Neptune.g:193:12: ( BECOMES ^ assignment_expr )?
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==BECOMES) ) {
				alt12=1;
			}
			switch (alt12) {
				case 1 :
					// antlr/Neptune.g:193:13: BECOMES ^ assignment_expr
					{
					BECOMES91=(Token)match(input,BECOMES,FOLLOW_BECOMES_in_assignment_expr1595); 
					BECOMES91_tree = (Object)adaptor.create(BECOMES91);
					root_0 = (Object)adaptor.becomeRoot(BECOMES91_tree, root_0);

					pushFollow(FOLLOW_assignment_expr_in_assignment_expr1598);
					assignment_expr92=assignment_expr();
					state._fsp--;

					adaptor.addChild(root_0, assignment_expr92.getTree());

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


	public static class or_expr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "or_expr"
	// antlr/Neptune.g:196:1: or_expr : and_expr ( OR ^ and_expr )* ;
	public final NeptuneParser.or_expr_return or_expr() throws RecognitionException {
		NeptuneParser.or_expr_return retval = new NeptuneParser.or_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token OR94=null;
		ParserRuleReturnScope and_expr93 =null;
		ParserRuleReturnScope and_expr95 =null;

		Object OR94_tree=null;

		try {
			// antlr/Neptune.g:197:2: ( and_expr ( OR ^ and_expr )* )
			// antlr/Neptune.g:197:4: and_expr ( OR ^ and_expr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_and_expr_in_or_expr1612);
			and_expr93=and_expr();
			state._fsp--;

			adaptor.addChild(root_0, and_expr93.getTree());

			// antlr/Neptune.g:197:13: ( OR ^ and_expr )*
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( (LA13_0==OR) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// antlr/Neptune.g:197:14: OR ^ and_expr
					{
					OR94=(Token)match(input,OR,FOLLOW_OR_in_or_expr1615); 
					OR94_tree = (Object)adaptor.create(OR94);
					root_0 = (Object)adaptor.becomeRoot(OR94_tree, root_0);

					pushFollow(FOLLOW_and_expr_in_or_expr1618);
					and_expr95=and_expr();
					state._fsp--;

					adaptor.addChild(root_0, and_expr95.getTree());

					}
					break;

				default :
					break loop13;
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
	// $ANTLR end "or_expr"


	public static class and_expr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "and_expr"
	// antlr/Neptune.g:200:1: and_expr : boolean_expr ( AND ^ boolean_expr )* ;
	public final NeptuneParser.and_expr_return and_expr() throws RecognitionException {
		NeptuneParser.and_expr_return retval = new NeptuneParser.and_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token AND97=null;
		ParserRuleReturnScope boolean_expr96 =null;
		ParserRuleReturnScope boolean_expr98 =null;

		Object AND97_tree=null;

		try {
			// antlr/Neptune.g:201:2: ( boolean_expr ( AND ^ boolean_expr )* )
			// antlr/Neptune.g:201:4: boolean_expr ( AND ^ boolean_expr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_boolean_expr_in_and_expr1632);
			boolean_expr96=boolean_expr();
			state._fsp--;

			adaptor.addChild(root_0, boolean_expr96.getTree());

			// antlr/Neptune.g:201:17: ( AND ^ boolean_expr )*
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( (LA14_0==AND) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// antlr/Neptune.g:201:18: AND ^ boolean_expr
					{
					AND97=(Token)match(input,AND,FOLLOW_AND_in_and_expr1635); 
					AND97_tree = (Object)adaptor.create(AND97);
					root_0 = (Object)adaptor.becomeRoot(AND97_tree, root_0);

					pushFollow(FOLLOW_boolean_expr_in_and_expr1638);
					boolean_expr98=boolean_expr();
					state._fsp--;

					adaptor.addChild(root_0, boolean_expr98.getTree());

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
	// $ANTLR end "and_expr"


	public static class boolean_expr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "boolean_expr"
	// antlr/Neptune.g:204:1: boolean_expr : plus_expr ( ( LT ^| LT_EQ ^| GT ^| GT_EQ ^| EQ ^| NEQ ^) plus_expr )* ;
	public final NeptuneParser.boolean_expr_return boolean_expr() throws RecognitionException {
		NeptuneParser.boolean_expr_return retval = new NeptuneParser.boolean_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token LT100=null;
		Token LT_EQ101=null;
		Token GT102=null;
		Token GT_EQ103=null;
		Token EQ104=null;
		Token NEQ105=null;
		ParserRuleReturnScope plus_expr99 =null;
		ParserRuleReturnScope plus_expr106 =null;

		Object LT100_tree=null;
		Object LT_EQ101_tree=null;
		Object GT102_tree=null;
		Object GT_EQ103_tree=null;
		Object EQ104_tree=null;
		Object NEQ105_tree=null;

		try {
			// antlr/Neptune.g:205:2: ( plus_expr ( ( LT ^| LT_EQ ^| GT ^| GT_EQ ^| EQ ^| NEQ ^) plus_expr )* )
			// antlr/Neptune.g:205:4: plus_expr ( ( LT ^| LT_EQ ^| GT ^| GT_EQ ^| EQ ^| NEQ ^) plus_expr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_plus_expr_in_boolean_expr1652);
			plus_expr99=plus_expr();
			state._fsp--;

			adaptor.addChild(root_0, plus_expr99.getTree());

			// antlr/Neptune.g:205:14: ( ( LT ^| LT_EQ ^| GT ^| GT_EQ ^| EQ ^| NEQ ^) plus_expr )*
			loop16:
			while (true) {
				int alt16=2;
				int LA16_0 = input.LA(1);
				if ( (LA16_0==EQ||(LA16_0 >= GT && LA16_0 <= GT_EQ)||(LA16_0 >= LT && LA16_0 <= LT_EQ)||LA16_0==NEQ) ) {
					alt16=1;
				}

				switch (alt16) {
				case 1 :
					// antlr/Neptune.g:205:15: ( LT ^| LT_EQ ^| GT ^| GT_EQ ^| EQ ^| NEQ ^) plus_expr
					{
					// antlr/Neptune.g:205:15: ( LT ^| LT_EQ ^| GT ^| GT_EQ ^| EQ ^| NEQ ^)
					int alt15=6;
					switch ( input.LA(1) ) {
					case LT:
						{
						alt15=1;
						}
						break;
					case LT_EQ:
						{
						alt15=2;
						}
						break;
					case GT:
						{
						alt15=3;
						}
						break;
					case GT_EQ:
						{
						alt15=4;
						}
						break;
					case EQ:
						{
						alt15=5;
						}
						break;
					case NEQ:
						{
						alt15=6;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 15, 0, input);
						throw nvae;
					}
					switch (alt15) {
						case 1 :
							// antlr/Neptune.g:205:16: LT ^
							{
							LT100=(Token)match(input,LT,FOLLOW_LT_in_boolean_expr1656); 
							LT100_tree = (Object)adaptor.create(LT100);
							root_0 = (Object)adaptor.becomeRoot(LT100_tree, root_0);

							}
							break;
						case 2 :
							// antlr/Neptune.g:205:22: LT_EQ ^
							{
							LT_EQ101=(Token)match(input,LT_EQ,FOLLOW_LT_EQ_in_boolean_expr1661); 
							LT_EQ101_tree = (Object)adaptor.create(LT_EQ101);
							root_0 = (Object)adaptor.becomeRoot(LT_EQ101_tree, root_0);

							}
							break;
						case 3 :
							// antlr/Neptune.g:205:31: GT ^
							{
							GT102=(Token)match(input,GT,FOLLOW_GT_in_boolean_expr1666); 
							GT102_tree = (Object)adaptor.create(GT102);
							root_0 = (Object)adaptor.becomeRoot(GT102_tree, root_0);

							}
							break;
						case 4 :
							// antlr/Neptune.g:205:37: GT_EQ ^
							{
							GT_EQ103=(Token)match(input,GT_EQ,FOLLOW_GT_EQ_in_boolean_expr1671); 
							GT_EQ103_tree = (Object)adaptor.create(GT_EQ103);
							root_0 = (Object)adaptor.becomeRoot(GT_EQ103_tree, root_0);

							}
							break;
						case 5 :
							// antlr/Neptune.g:205:46: EQ ^
							{
							EQ104=(Token)match(input,EQ,FOLLOW_EQ_in_boolean_expr1676); 
							EQ104_tree = (Object)adaptor.create(EQ104);
							root_0 = (Object)adaptor.becomeRoot(EQ104_tree, root_0);

							}
							break;
						case 6 :
							// antlr/Neptune.g:205:52: NEQ ^
							{
							NEQ105=(Token)match(input,NEQ,FOLLOW_NEQ_in_boolean_expr1681); 
							NEQ105_tree = (Object)adaptor.create(NEQ105);
							root_0 = (Object)adaptor.becomeRoot(NEQ105_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_plus_expr_in_boolean_expr1685);
					plus_expr106=plus_expr();
					state._fsp--;

					adaptor.addChild(root_0, plus_expr106.getTree());

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
	// $ANTLR end "boolean_expr"


	public static class plus_expr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "plus_expr"
	// antlr/Neptune.g:208:1: plus_expr : multi_expr ( ( PLUS ^| MINUS ^) multi_expr )* ;
	public final NeptuneParser.plus_expr_return plus_expr() throws RecognitionException {
		NeptuneParser.plus_expr_return retval = new NeptuneParser.plus_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token PLUS108=null;
		Token MINUS109=null;
		ParserRuleReturnScope multi_expr107 =null;
		ParserRuleReturnScope multi_expr110 =null;

		Object PLUS108_tree=null;
		Object MINUS109_tree=null;

		try {
			// antlr/Neptune.g:209:2: ( multi_expr ( ( PLUS ^| MINUS ^) multi_expr )* )
			// antlr/Neptune.g:209:4: multi_expr ( ( PLUS ^| MINUS ^) multi_expr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_multi_expr_in_plus_expr1698);
			multi_expr107=multi_expr();
			state._fsp--;

			adaptor.addChild(root_0, multi_expr107.getTree());

			// antlr/Neptune.g:209:15: ( ( PLUS ^| MINUS ^) multi_expr )*
			loop18:
			while (true) {
				int alt18=2;
				int LA18_0 = input.LA(1);
				if ( (LA18_0==MINUS||LA18_0==PLUS) ) {
					alt18=1;
				}

				switch (alt18) {
				case 1 :
					// antlr/Neptune.g:209:16: ( PLUS ^| MINUS ^) multi_expr
					{
					// antlr/Neptune.g:209:16: ( PLUS ^| MINUS ^)
					int alt17=2;
					int LA17_0 = input.LA(1);
					if ( (LA17_0==PLUS) ) {
						alt17=1;
					}
					else if ( (LA17_0==MINUS) ) {
						alt17=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 17, 0, input);
						throw nvae;
					}

					switch (alt17) {
						case 1 :
							// antlr/Neptune.g:209:17: PLUS ^
							{
							PLUS108=(Token)match(input,PLUS,FOLLOW_PLUS_in_plus_expr1702); 
							PLUS108_tree = (Object)adaptor.create(PLUS108);
							root_0 = (Object)adaptor.becomeRoot(PLUS108_tree, root_0);

							}
							break;
						case 2 :
							// antlr/Neptune.g:209:25: MINUS ^
							{
							MINUS109=(Token)match(input,MINUS,FOLLOW_MINUS_in_plus_expr1707); 
							MINUS109_tree = (Object)adaptor.create(MINUS109);
							root_0 = (Object)adaptor.becomeRoot(MINUS109_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_multi_expr_in_plus_expr1711);
					multi_expr110=multi_expr();
					state._fsp--;

					adaptor.addChild(root_0, multi_expr110.getTree());

					}
					break;

				default :
					break loop18;
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
	// antlr/Neptune.g:212:1: multi_expr : unary_expr ( ( TIMES ^| DIVIDE ^| MOD ^) unary_expr )* ;
	public final NeptuneParser.multi_expr_return multi_expr() throws RecognitionException {
		NeptuneParser.multi_expr_return retval = new NeptuneParser.multi_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token TIMES112=null;
		Token DIVIDE113=null;
		Token MOD114=null;
		ParserRuleReturnScope unary_expr111 =null;
		ParserRuleReturnScope unary_expr115 =null;

		Object TIMES112_tree=null;
		Object DIVIDE113_tree=null;
		Object MOD114_tree=null;

		try {
			// antlr/Neptune.g:213:2: ( unary_expr ( ( TIMES ^| DIVIDE ^| MOD ^) unary_expr )* )
			// antlr/Neptune.g:213:4: unary_expr ( ( TIMES ^| DIVIDE ^| MOD ^) unary_expr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_unary_expr_in_multi_expr1724);
			unary_expr111=unary_expr();
			state._fsp--;

			adaptor.addChild(root_0, unary_expr111.getTree());

			// antlr/Neptune.g:213:15: ( ( TIMES ^| DIVIDE ^| MOD ^) unary_expr )*
			loop20:
			while (true) {
				int alt20=2;
				int LA20_0 = input.LA(1);
				if ( (LA20_0==DIVIDE||LA20_0==MOD||LA20_0==TIMES) ) {
					alt20=1;
				}

				switch (alt20) {
				case 1 :
					// antlr/Neptune.g:213:16: ( TIMES ^| DIVIDE ^| MOD ^) unary_expr
					{
					// antlr/Neptune.g:213:16: ( TIMES ^| DIVIDE ^| MOD ^)
					int alt19=3;
					switch ( input.LA(1) ) {
					case TIMES:
						{
						alt19=1;
						}
						break;
					case DIVIDE:
						{
						alt19=2;
						}
						break;
					case MOD:
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
							// antlr/Neptune.g:213:17: TIMES ^
							{
							TIMES112=(Token)match(input,TIMES,FOLLOW_TIMES_in_multi_expr1728); 
							TIMES112_tree = (Object)adaptor.create(TIMES112);
							root_0 = (Object)adaptor.becomeRoot(TIMES112_tree, root_0);

							}
							break;
						case 2 :
							// antlr/Neptune.g:213:26: DIVIDE ^
							{
							DIVIDE113=(Token)match(input,DIVIDE,FOLLOW_DIVIDE_in_multi_expr1733); 
							DIVIDE113_tree = (Object)adaptor.create(DIVIDE113);
							root_0 = (Object)adaptor.becomeRoot(DIVIDE113_tree, root_0);

							}
							break;
						case 3 :
							// antlr/Neptune.g:213:36: MOD ^
							{
							MOD114=(Token)match(input,MOD,FOLLOW_MOD_in_multi_expr1738); 
							MOD114_tree = (Object)adaptor.create(MOD114);
							root_0 = (Object)adaptor.becomeRoot(MOD114_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_unary_expr_in_multi_expr1742);
					unary_expr115=unary_expr();
					state._fsp--;

					adaptor.addChild(root_0, unary_expr115.getTree());

					}
					break;

				default :
					break loop20;
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


	public static class unary_expr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "unary_expr"
	// antlr/Neptune.g:216:1: unary_expr : ( operand | MINUS operand -> ^( UNARY_MINUS operand ) | PLUS operand -> ^( UNARY_PLUS operand ) | NEGATE ^ operand );
	public final NeptuneParser.unary_expr_return unary_expr() throws RecognitionException {
		NeptuneParser.unary_expr_return retval = new NeptuneParser.unary_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token MINUS117=null;
		Token PLUS119=null;
		Token NEGATE121=null;
		ParserRuleReturnScope operand116 =null;
		ParserRuleReturnScope operand118 =null;
		ParserRuleReturnScope operand120 =null;
		ParserRuleReturnScope operand122 =null;

		Object MINUS117_tree=null;
		Object PLUS119_tree=null;
		Object NEGATE121_tree=null;
		RewriteRuleTokenStream stream_PLUS=new RewriteRuleTokenStream(adaptor,"token PLUS");
		RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");
		RewriteRuleSubtreeStream stream_operand=new RewriteRuleSubtreeStream(adaptor,"rule operand");

		try {
			// antlr/Neptune.g:217:2: ( operand | MINUS operand -> ^( UNARY_MINUS operand ) | PLUS operand -> ^( UNARY_PLUS operand ) | NEGATE ^ operand )
			int alt21=4;
			switch ( input.LA(1) ) {
			case CHAR_LITERAL:
			case FALSE:
			case IDENTIFIER:
			case LBRACKET:
			case LCURLY:
			case LPAREN:
			case NUMBER:
			case PRINT:
			case READ:
			case SIZEOF:
			case STRING_LITERAL:
			case TRUE:
				{
				alt21=1;
				}
				break;
			case MINUS:
				{
				alt21=2;
				}
				break;
			case PLUS:
				{
				alt21=3;
				}
				break;
			case NEGATE:
				{
				alt21=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 21, 0, input);
				throw nvae;
			}
			switch (alt21) {
				case 1 :
					// antlr/Neptune.g:217:4: operand
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_operand_in_unary_expr1756);
					operand116=operand();
					state._fsp--;

					adaptor.addChild(root_0, operand116.getTree());

					}
					break;
				case 2 :
					// antlr/Neptune.g:218:4: MINUS operand
					{
					MINUS117=(Token)match(input,MINUS,FOLLOW_MINUS_in_unary_expr1761);  
					stream_MINUS.add(MINUS117);

					pushFollow(FOLLOW_operand_in_unary_expr1763);
					operand118=operand();
					state._fsp--;

					stream_operand.add(operand118.getTree());
					// AST REWRITE
					// elements: operand
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 218:18: -> ^( UNARY_MINUS operand )
					{
						// antlr/Neptune.g:218:21: ^( UNARY_MINUS operand )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(UNARY_MINUS, "UNARY_MINUS"), root_1);
						adaptor.addChild(root_1, stream_operand.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					// antlr/Neptune.g:219:4: PLUS operand
					{
					PLUS119=(Token)match(input,PLUS,FOLLOW_PLUS_in_unary_expr1776);  
					stream_PLUS.add(PLUS119);

					pushFollow(FOLLOW_operand_in_unary_expr1778);
					operand120=operand();
					state._fsp--;

					stream_operand.add(operand120.getTree());
					// AST REWRITE
					// elements: operand
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 219:17: -> ^( UNARY_PLUS operand )
					{
						// antlr/Neptune.g:219:20: ^( UNARY_PLUS operand )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(UNARY_PLUS, "UNARY_PLUS"), root_1);
						adaptor.addChild(root_1, stream_operand.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 4 :
					// antlr/Neptune.g:220:4: NEGATE ^ operand
					{
					root_0 = (Object)adaptor.nil();


					NEGATE121=(Token)match(input,NEGATE,FOLLOW_NEGATE_in_unary_expr1791); 
					NEGATE121_tree = (Object)adaptor.create(NEGATE121);
					root_0 = (Object)adaptor.becomeRoot(NEGATE121_tree, root_0);

					pushFollow(FOLLOW_operand_in_unary_expr1794);
					operand122=operand();
					state._fsp--;

					adaptor.addChild(root_0, operand122.getTree());

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
	// $ANTLR end "unary_expr"


	public static class operand_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "operand"
	// antlr/Neptune.g:223:1: operand : ( IDENTIFIER ( -> ^( ATOMIC_VAR IDENTIFIER ) | LBRACKET expression RBRACKET -> ^( ARRAY_VAR IDENTIFIER expression ) | ( LPAREN ( expression ( COMMA expression )* )? RPAREN -> ^( FUNCTION IDENTIFIER ( ^( ARRAY_SET ( expression )+ ) )? ) ) ) | NUMBER | LPAREN ! assignment_expr RPAREN !| LBRACKET expression ( COMMA expression )* RBRACKET -> ^( ARRAY_SET ( expression )+ ) | print_statement | read_statement | SIZEOF ^ LPAREN ! IDENTIFIER RPAREN !| ( TRUE | FALSE ) | CHAR_LITERAL | STRING_LITERAL | codeblock );
	public final NeptuneParser.operand_return operand() throws RecognitionException {
		NeptuneParser.operand_return retval = new NeptuneParser.operand_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IDENTIFIER123=null;
		Token LBRACKET124=null;
		Token RBRACKET126=null;
		Token LPAREN127=null;
		Token COMMA129=null;
		Token RPAREN131=null;
		Token NUMBER132=null;
		Token LPAREN133=null;
		Token RPAREN135=null;
		Token LBRACKET136=null;
		Token COMMA138=null;
		Token RBRACKET140=null;
		Token SIZEOF143=null;
		Token LPAREN144=null;
		Token IDENTIFIER145=null;
		Token RPAREN146=null;
		Token set147=null;
		Token CHAR_LITERAL148=null;
		Token STRING_LITERAL149=null;
		ParserRuleReturnScope expression125 =null;
		ParserRuleReturnScope expression128 =null;
		ParserRuleReturnScope expression130 =null;
		ParserRuleReturnScope assignment_expr134 =null;
		ParserRuleReturnScope expression137 =null;
		ParserRuleReturnScope expression139 =null;
		ParserRuleReturnScope print_statement141 =null;
		ParserRuleReturnScope read_statement142 =null;
		ParserRuleReturnScope codeblock150 =null;

		Object IDENTIFIER123_tree=null;
		Object LBRACKET124_tree=null;
		Object RBRACKET126_tree=null;
		Object LPAREN127_tree=null;
		Object COMMA129_tree=null;
		Object RPAREN131_tree=null;
		Object NUMBER132_tree=null;
		Object LPAREN133_tree=null;
		Object RPAREN135_tree=null;
		Object LBRACKET136_tree=null;
		Object COMMA138_tree=null;
		Object RBRACKET140_tree=null;
		Object SIZEOF143_tree=null;
		Object LPAREN144_tree=null;
		Object IDENTIFIER145_tree=null;
		Object RPAREN146_tree=null;
		Object set147_tree=null;
		Object CHAR_LITERAL148_tree=null;
		Object STRING_LITERAL149_tree=null;
		RewriteRuleTokenStream stream_LBRACKET=new RewriteRuleTokenStream(adaptor,"token LBRACKET");
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleTokenStream stream_RBRACKET=new RewriteRuleTokenStream(adaptor,"token RBRACKET");
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try {
			// antlr/Neptune.g:224:5: ( IDENTIFIER ( -> ^( ATOMIC_VAR IDENTIFIER ) | LBRACKET expression RBRACKET -> ^( ARRAY_VAR IDENTIFIER expression ) | ( LPAREN ( expression ( COMMA expression )* )? RPAREN -> ^( FUNCTION IDENTIFIER ( ^( ARRAY_SET ( expression )+ ) )? ) ) ) | NUMBER | LPAREN ! assignment_expr RPAREN !| LBRACKET expression ( COMMA expression )* RBRACKET -> ^( ARRAY_SET ( expression )+ ) | print_statement | read_statement | SIZEOF ^ LPAREN ! IDENTIFIER RPAREN !| ( TRUE | FALSE ) | CHAR_LITERAL | STRING_LITERAL | codeblock )
			int alt26=11;
			switch ( input.LA(1) ) {
			case IDENTIFIER:
				{
				alt26=1;
				}
				break;
			case NUMBER:
				{
				alt26=2;
				}
				break;
			case LPAREN:
				{
				alt26=3;
				}
				break;
			case LBRACKET:
				{
				alt26=4;
				}
				break;
			case PRINT:
				{
				alt26=5;
				}
				break;
			case READ:
				{
				alt26=6;
				}
				break;
			case SIZEOF:
				{
				alt26=7;
				}
				break;
			case FALSE:
			case TRUE:
				{
				alt26=8;
				}
				break;
			case CHAR_LITERAL:
				{
				alt26=9;
				}
				break;
			case STRING_LITERAL:
				{
				alt26=10;
				}
				break;
			case LCURLY:
				{
				alt26=11;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 26, 0, input);
				throw nvae;
			}
			switch (alt26) {
				case 1 :
					// antlr/Neptune.g:224:9: IDENTIFIER ( -> ^( ATOMIC_VAR IDENTIFIER ) | LBRACKET expression RBRACKET -> ^( ARRAY_VAR IDENTIFIER expression ) | ( LPAREN ( expression ( COMMA expression )* )? RPAREN -> ^( FUNCTION IDENTIFIER ( ^( ARRAY_SET ( expression )+ ) )? ) ) )
					{
					IDENTIFIER123=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_operand1810);  
					stream_IDENTIFIER.add(IDENTIFIER123);

					// antlr/Neptune.g:224:20: ( -> ^( ATOMIC_VAR IDENTIFIER ) | LBRACKET expression RBRACKET -> ^( ARRAY_VAR IDENTIFIER expression ) | ( LPAREN ( expression ( COMMA expression )* )? RPAREN -> ^( FUNCTION IDENTIFIER ( ^( ARRAY_SET ( expression )+ ) )? ) ) )
					int alt24=3;
					switch ( input.LA(1) ) {
					case AND:
					case BECOMES:
					case COMMA:
					case DIVIDE:
					case EQ:
					case GT:
					case GT_EQ:
					case LT:
					case LT_EQ:
					case MINUS:
					case MOD:
					case NEQ:
					case OR:
					case PLUS:
					case RBRACKET:
					case RPAREN:
					case SEMICOLON:
					case TIMES:
						{
						alt24=1;
						}
						break;
					case LBRACKET:
						{
						alt24=2;
						}
						break;
					case LPAREN:
						{
						alt24=3;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 24, 0, input);
						throw nvae;
					}
					switch (alt24) {
						case 1 :
							// antlr/Neptune.g:224:22: 
							{
							// AST REWRITE
							// elements: IDENTIFIER
							// token labels: 
							// rule labels: retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (Object)adaptor.nil();
							// 224:22: -> ^( ATOMIC_VAR IDENTIFIER )
							{
								// antlr/Neptune.g:224:25: ^( ATOMIC_VAR IDENTIFIER )
								{
								Object root_1 = (Object)adaptor.nil();
								root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ATOMIC_VAR, "ATOMIC_VAR"), root_1);
								adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;

							}
							break;
						case 2 :
							// antlr/Neptune.g:224:52: LBRACKET expression RBRACKET
							{
							LBRACKET124=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_operand1824);  
							stream_LBRACKET.add(LBRACKET124);

							pushFollow(FOLLOW_expression_in_operand1826);
							expression125=expression();
							state._fsp--;

							stream_expression.add(expression125.getTree());
							RBRACKET126=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_operand1828);  
							stream_RBRACKET.add(RBRACKET126);

							// AST REWRITE
							// elements: IDENTIFIER, expression
							// token labels: 
							// rule labels: retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (Object)adaptor.nil();
							// 224:81: -> ^( ARRAY_VAR IDENTIFIER expression )
							{
								// antlr/Neptune.g:224:84: ^( ARRAY_VAR IDENTIFIER expression )
								{
								Object root_1 = (Object)adaptor.nil();
								root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARRAY_VAR, "ARRAY_VAR"), root_1);
								adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
								adaptor.addChild(root_1, stream_expression.nextTree());
								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;

							}
							break;
						case 3 :
							// antlr/Neptune.g:224:122: ( LPAREN ( expression ( COMMA expression )* )? RPAREN -> ^( FUNCTION IDENTIFIER ( ^( ARRAY_SET ( expression )+ ) )? ) )
							{
							// antlr/Neptune.g:224:122: ( LPAREN ( expression ( COMMA expression )* )? RPAREN -> ^( FUNCTION IDENTIFIER ( ^( ARRAY_SET ( expression )+ ) )? ) )
							// antlr/Neptune.g:224:123: LPAREN ( expression ( COMMA expression )* )? RPAREN
							{
							LPAREN127=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_operand1844);  
							stream_LPAREN.add(LPAREN127);

							// antlr/Neptune.g:224:130: ( expression ( COMMA expression )* )?
							int alt23=2;
							int LA23_0 = input.LA(1);
							if ( (LA23_0==CHAR_LITERAL||LA23_0==FALSE||LA23_0==IDENTIFIER||(LA23_0 >= LBRACKET && LA23_0 <= LCURLY)||LA23_0==LPAREN||LA23_0==MINUS||LA23_0==NEGATE||LA23_0==NUMBER||(LA23_0 >= PLUS && LA23_0 <= PRINT)||LA23_0==READ||(LA23_0 >= SIZEOF && LA23_0 <= STRING_LITERAL)||LA23_0==TRUE) ) {
								alt23=1;
							}
							switch (alt23) {
								case 1 :
									// antlr/Neptune.g:224:131: expression ( COMMA expression )*
									{
									pushFollow(FOLLOW_expression_in_operand1847);
									expression128=expression();
									state._fsp--;

									stream_expression.add(expression128.getTree());
									// antlr/Neptune.g:224:142: ( COMMA expression )*
									loop22:
									while (true) {
										int alt22=2;
										int LA22_0 = input.LA(1);
										if ( (LA22_0==COMMA) ) {
											alt22=1;
										}

										switch (alt22) {
										case 1 :
											// antlr/Neptune.g:224:143: COMMA expression
											{
											COMMA129=(Token)match(input,COMMA,FOLLOW_COMMA_in_operand1850);  
											stream_COMMA.add(COMMA129);

											pushFollow(FOLLOW_expression_in_operand1852);
											expression130=expression();
											state._fsp--;

											stream_expression.add(expression130.getTree());
											}
											break;

										default :
											break loop22;
										}
									}

									}
									break;

							}

							RPAREN131=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_operand1858);  
							stream_RPAREN.add(RPAREN131);

							// AST REWRITE
							// elements: IDENTIFIER, expression
							// token labels: 
							// rule labels: retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (Object)adaptor.nil();
							// 224:171: -> ^( FUNCTION IDENTIFIER ( ^( ARRAY_SET ( expression )+ ) )? )
							{
								// antlr/Neptune.g:224:174: ^( FUNCTION IDENTIFIER ( ^( ARRAY_SET ( expression )+ ) )? )
								{
								Object root_1 = (Object)adaptor.nil();
								root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNCTION, "FUNCTION"), root_1);
								adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
								// antlr/Neptune.g:224:196: ( ^( ARRAY_SET ( expression )+ ) )?
								if ( stream_expression.hasNext() ) {
									// antlr/Neptune.g:224:196: ^( ARRAY_SET ( expression )+ )
									{
									Object root_2 = (Object)adaptor.nil();
									root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARRAY_SET, "ARRAY_SET"), root_2);
									if ( !(stream_expression.hasNext()) ) {
										throw new RewriteEarlyExitException();
									}
									while ( stream_expression.hasNext() ) {
										adaptor.addChild(root_2, stream_expression.nextTree());
									}
									stream_expression.reset();

									adaptor.addChild(root_1, root_2);
									}

								}
								stream_expression.reset();

								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;

							}

							}
							break;

					}

					}
					break;
				case 2 :
					// antlr/Neptune.g:225:9: NUMBER
					{
					root_0 = (Object)adaptor.nil();


					NUMBER132=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_operand1886); 
					NUMBER132_tree = (Object)adaptor.create(NUMBER132);
					adaptor.addChild(root_0, NUMBER132_tree);

					}
					break;
				case 3 :
					// antlr/Neptune.g:226:9: LPAREN ! assignment_expr RPAREN !
					{
					root_0 = (Object)adaptor.nil();


					LPAREN133=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_operand1896); 
					pushFollow(FOLLOW_assignment_expr_in_operand1899);
					assignment_expr134=assignment_expr();
					state._fsp--;

					adaptor.addChild(root_0, assignment_expr134.getTree());

					RPAREN135=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_operand1901); 
					}
					break;
				case 4 :
					// antlr/Neptune.g:227:4: LBRACKET expression ( COMMA expression )* RBRACKET
					{
					LBRACKET136=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_operand1907);  
					stream_LBRACKET.add(LBRACKET136);

					pushFollow(FOLLOW_expression_in_operand1909);
					expression137=expression();
					state._fsp--;

					stream_expression.add(expression137.getTree());
					// antlr/Neptune.g:227:24: ( COMMA expression )*
					loop25:
					while (true) {
						int alt25=2;
						int LA25_0 = input.LA(1);
						if ( (LA25_0==COMMA) ) {
							alt25=1;
						}

						switch (alt25) {
						case 1 :
							// antlr/Neptune.g:227:25: COMMA expression
							{
							COMMA138=(Token)match(input,COMMA,FOLLOW_COMMA_in_operand1912);  
							stream_COMMA.add(COMMA138);

							pushFollow(FOLLOW_expression_in_operand1914);
							expression139=expression();
							state._fsp--;

							stream_expression.add(expression139.getTree());
							}
							break;

						default :
							break loop25;
						}
					}

					RBRACKET140=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_operand1918);  
					stream_RBRACKET.add(RBRACKET140);

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
					// 228:3: -> ^( ARRAY_SET ( expression )+ )
					{
						// antlr/Neptune.g:228:6: ^( ARRAY_SET ( expression )+ )
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
					// antlr/Neptune.g:229:4: print_statement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_print_statement_in_operand1934);
					print_statement141=print_statement();
					state._fsp--;

					adaptor.addChild(root_0, print_statement141.getTree());

					}
					break;
				case 6 :
					// antlr/Neptune.g:230:4: read_statement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_read_statement_in_operand1939);
					read_statement142=read_statement();
					state._fsp--;

					adaptor.addChild(root_0, read_statement142.getTree());

					}
					break;
				case 7 :
					// antlr/Neptune.g:231:4: SIZEOF ^ LPAREN ! IDENTIFIER RPAREN !
					{
					root_0 = (Object)adaptor.nil();


					SIZEOF143=(Token)match(input,SIZEOF,FOLLOW_SIZEOF_in_operand1944); 
					SIZEOF143_tree = (Object)adaptor.create(SIZEOF143);
					root_0 = (Object)adaptor.becomeRoot(SIZEOF143_tree, root_0);

					LPAREN144=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_operand1947); 
					IDENTIFIER145=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_operand1950); 
					IDENTIFIER145_tree = (Object)adaptor.create(IDENTIFIER145);
					adaptor.addChild(root_0, IDENTIFIER145_tree);

					RPAREN146=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_operand1952); 
					}
					break;
				case 8 :
					// antlr/Neptune.g:232:4: ( TRUE | FALSE )
					{
					root_0 = (Object)adaptor.nil();


					set147=input.LT(1);
					if ( input.LA(1)==FALSE||input.LA(1)==TRUE ) {
						input.consume();
						adaptor.addChild(root_0, (Object)adaptor.create(set147));
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					}
					break;
				case 9 :
					// antlr/Neptune.g:233:4: CHAR_LITERAL
					{
					root_0 = (Object)adaptor.nil();


					CHAR_LITERAL148=(Token)match(input,CHAR_LITERAL,FOLLOW_CHAR_LITERAL_in_operand1969); 
					CHAR_LITERAL148_tree = (Object)adaptor.create(CHAR_LITERAL148);
					adaptor.addChild(root_0, CHAR_LITERAL148_tree);

					}
					break;
				case 10 :
					// antlr/Neptune.g:234:4: STRING_LITERAL
					{
					root_0 = (Object)adaptor.nil();


					STRING_LITERAL149=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_operand1974); 
					STRING_LITERAL149_tree = (Object)adaptor.create(STRING_LITERAL149);
					adaptor.addChild(root_0, STRING_LITERAL149_tree);

					}
					break;
				case 11 :
					// antlr/Neptune.g:235:4: codeblock
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_codeblock_in_operand1979);
					codeblock150=codeblock();
					state._fsp--;

					adaptor.addChild(root_0, codeblock150.getTree());

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
	// antlr/Neptune.g:238:1: type : ( INTEGER ( array_def )? | CHAR ( array_def )? | BOOLEAN ( array_def )? );
	public final NeptuneParser.type_return type() throws RecognitionException {
		NeptuneParser.type_return retval = new NeptuneParser.type_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token INTEGER151=null;
		Token CHAR153=null;
		Token BOOLEAN155=null;
		ParserRuleReturnScope array_def152 =null;
		ParserRuleReturnScope array_def154 =null;
		ParserRuleReturnScope array_def156 =null;

		Object INTEGER151_tree=null;
		Object CHAR153_tree=null;
		Object BOOLEAN155_tree=null;

		try {
			// antlr/Neptune.g:239:2: ( INTEGER ( array_def )? | CHAR ( array_def )? | BOOLEAN ( array_def )? )
			int alt30=3;
			switch ( input.LA(1) ) {
			case INTEGER:
				{
				alt30=1;
				}
				break;
			case CHAR:
				{
				alt30=2;
				}
				break;
			case BOOLEAN:
				{
				alt30=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 30, 0, input);
				throw nvae;
			}
			switch (alt30) {
				case 1 :
					// antlr/Neptune.g:239:4: INTEGER ( array_def )?
					{
					root_0 = (Object)adaptor.nil();


					INTEGER151=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_type1993); 
					INTEGER151_tree = (Object)adaptor.create(INTEGER151);
					adaptor.addChild(root_0, INTEGER151_tree);

					// antlr/Neptune.g:239:12: ( array_def )?
					int alt27=2;
					int LA27_0 = input.LA(1);
					if ( (LA27_0==LBRACKET) ) {
						alt27=1;
					}
					switch (alt27) {
						case 1 :
							// antlr/Neptune.g:239:12: array_def
							{
							pushFollow(FOLLOW_array_def_in_type1995);
							array_def152=array_def();
							state._fsp--;

							adaptor.addChild(root_0, array_def152.getTree());

							}
							break;

					}

					}
					break;
				case 2 :
					// antlr/Neptune.g:240:4: CHAR ( array_def )?
					{
					root_0 = (Object)adaptor.nil();


					CHAR153=(Token)match(input,CHAR,FOLLOW_CHAR_in_type2001); 
					CHAR153_tree = (Object)adaptor.create(CHAR153);
					adaptor.addChild(root_0, CHAR153_tree);

					// antlr/Neptune.g:240:9: ( array_def )?
					int alt28=2;
					int LA28_0 = input.LA(1);
					if ( (LA28_0==LBRACKET) ) {
						alt28=1;
					}
					switch (alt28) {
						case 1 :
							// antlr/Neptune.g:240:9: array_def
							{
							pushFollow(FOLLOW_array_def_in_type2003);
							array_def154=array_def();
							state._fsp--;

							adaptor.addChild(root_0, array_def154.getTree());

							}
							break;

					}

					}
					break;
				case 3 :
					// antlr/Neptune.g:241:4: BOOLEAN ( array_def )?
					{
					root_0 = (Object)adaptor.nil();


					BOOLEAN155=(Token)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_type2009); 
					BOOLEAN155_tree = (Object)adaptor.create(BOOLEAN155);
					adaptor.addChild(root_0, BOOLEAN155_tree);

					// antlr/Neptune.g:241:12: ( array_def )?
					int alt29=2;
					int LA29_0 = input.LA(1);
					if ( (LA29_0==LBRACKET) ) {
						alt29=1;
					}
					switch (alt29) {
						case 1 :
							// antlr/Neptune.g:241:12: array_def
							{
							pushFollow(FOLLOW_array_def_in_type2011);
							array_def156=array_def();
							state._fsp--;

							adaptor.addChild(root_0, array_def156.getTree());

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
	// antlr/Neptune.g:244:1: array_def : LBRACKET NUMBER RBRACKET -> ^( ARRAY_DEF NUMBER ) ;
	public final NeptuneParser.array_def_return array_def() throws RecognitionException {
		NeptuneParser.array_def_return retval = new NeptuneParser.array_def_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token LBRACKET157=null;
		Token NUMBER158=null;
		Token RBRACKET159=null;

		Object LBRACKET157_tree=null;
		Object NUMBER158_tree=null;
		Object RBRACKET159_tree=null;
		RewriteRuleTokenStream stream_LBRACKET=new RewriteRuleTokenStream(adaptor,"token LBRACKET");
		RewriteRuleTokenStream stream_RBRACKET=new RewriteRuleTokenStream(adaptor,"token RBRACKET");
		RewriteRuleTokenStream stream_NUMBER=new RewriteRuleTokenStream(adaptor,"token NUMBER");

		try {
			// antlr/Neptune.g:245:2: ( LBRACKET NUMBER RBRACKET -> ^( ARRAY_DEF NUMBER ) )
			// antlr/Neptune.g:245:5: LBRACKET NUMBER RBRACKET
			{
			LBRACKET157=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_array_def2025);  
			stream_LBRACKET.add(LBRACKET157);

			NUMBER158=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_array_def2027);  
			stream_NUMBER.add(NUMBER158);

			RBRACKET159=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_array_def2029);  
			stream_RBRACKET.add(RBRACKET159);

			// AST REWRITE
			// elements: NUMBER
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 246:3: -> ^( ARRAY_DEF NUMBER )
			{
				// antlr/Neptune.g:246:6: ^( ARRAY_DEF NUMBER )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARRAY_DEF, "ARRAY_DEF"), root_1);
				adaptor.addChild(root_1, stream_NUMBER.nextNode());
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
	// $ANTLR end "array_def"

	// Delegated rules



	public static final BitSet FOLLOW_lines_in_program1126 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_program1128 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_line_in_lines1163 = new BitSet(new long[]{0x4C43549D9C023802L,0x0000000000000008L});
	public static final BitSet FOLLOW_expression_in_line1176 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_line1178 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declaration_in_line1184 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_line1186 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_logic_statement_in_line1192 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LCURLY_in_codeblock1204 = new BitSet(new long[]{0x4C43549D9C023800L,0x0000000000000008L});
	public static final BitSet FOLLOW_lines_in_codeblock1206 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_RCURLY_in_codeblock1208 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_while_statement_in_logic_statement1230 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_foreach_statement_in_logic_statement1235 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_if_statement_in_logic_statement1240 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHILE_in_while_statement1254 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_LPAREN_in_while_statement1257 = new BitSet(new long[]{0x4C43549884002000L});
	public static final BitSet FOLLOW_expression_in_while_statement1260 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_while_statement1262 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_LCURLY_in_while_statement1265 = new BitSet(new long[]{0x4C43549D9C023800L,0x0000000000000008L});
	public static final BitSet FOLLOW_lines_in_while_statement1268 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_RCURLY_in_while_statement1270 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FOREACH_in_foreach_statement1283 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_LPAREN_in_foreach_statement1286 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_foreach_statement1289 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_IN_in_foreach_statement1291 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_foreach_statement1294 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_foreach_statement1296 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_LCURLY_in_foreach_statement1299 = new BitSet(new long[]{0x4C43549D9C023800L,0x0000000000000008L});
	public static final BitSet FOLLOW_lines_in_foreach_statement1302 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_RCURLY_in_foreach_statement1304 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_if_statement1317 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_LPAREN_in_if_statement1320 = new BitSet(new long[]{0x4C43549884002000L});
	public static final BitSet FOLLOW_expression_in_if_statement1323 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_if_statement1325 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_LCURLY_in_if_statement1328 = new BitSet(new long[]{0x4C43549D9C023800L,0x0000000000000008L});
	public static final BitSet FOLLOW_lines_in_if_statement1331 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_RCURLY_in_if_statement1333 = new BitSet(new long[]{0x0000000001800002L});
	public static final BitSet FOLLOW_ELSIF_in_if_statement1339 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_LPAREN_in_if_statement1341 = new BitSet(new long[]{0x4C43549884002000L});
	public static final BitSet FOLLOW_expression_in_if_statement1344 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_if_statement1346 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_LCURLY_in_if_statement1349 = new BitSet(new long[]{0x4C43549D9C023800L,0x0000000000000008L});
	public static final BitSet FOLLOW_lines_in_if_statement1352 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_RCURLY_in_if_statement1354 = new BitSet(new long[]{0x0000000001800002L});
	public static final BitSet FOLLOW_ELSE_in_if_statement1362 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_LCURLY_in_if_statement1364 = new BitSet(new long[]{0x4C43549D9C023800L,0x0000000000000008L});
	public static final BitSet FOLLOW_lines_in_if_statement1367 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_RCURLY_in_if_statement1369 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRINT_in_print_statement1384 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_LPAREN_in_print_statement1387 = new BitSet(new long[]{0x4C43549884002000L});
	public static final BitSet FOLLOW_expression_in_print_statement1390 = new BitSet(new long[]{0x0100000000008000L});
	public static final BitSet FOLLOW_COMMA_in_print_statement1393 = new BitSet(new long[]{0x4C43549884002000L});
	public static final BitSet FOLLOW_expression_in_print_statement1396 = new BitSet(new long[]{0x0100000000008000L});
	public static final BitSet FOLLOW_RPAREN_in_print_statement1400 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_READ_in_read_statement1413 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_LPAREN_in_read_statement1416 = new BitSet(new long[]{0x4C43549884002000L});
	public static final BitSet FOLLOW_expression_in_read_statement1419 = new BitSet(new long[]{0x0100000000008000L});
	public static final BitSet FOLLOW_COMMA_in_read_statement1422 = new BitSet(new long[]{0x4C43549884002000L});
	public static final BitSet FOLLOW_expression_in_read_statement1425 = new BitSet(new long[]{0x0100000000008000L});
	public static final BitSet FOLLOW_RPAREN_in_read_statement1429 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_declaration1442 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_declaration1444 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_BECOMES_in_declaration1447 = new BitSet(new long[]{0x4C43549884002000L});
	public static final BitSet FOLLOW_expression_in_declaration1449 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CONST_in_declaration1475 = new BitSet(new long[]{0x0000000400001800L});
	public static final BitSet FOLLOW_type_in_declaration1478 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_declaration1480 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_BECOMES_in_declaration1482 = new BitSet(new long[]{0x4C43549884002000L});
	public static final BitSet FOLLOW_expression_in_declaration1484 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FUNCTION_in_declaration1491 = new BitSet(new long[]{0x0000000400001800L});
	public static final BitSet FOLLOW_type_in_declaration1493 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_declaration1495 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_LPAREN_in_declaration1497 = new BitSet(new long[]{0x0000000400001800L});
	public static final BitSet FOLLOW_type_in_declaration1499 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_declaration1501 = new BitSet(new long[]{0x0100000000008000L});
	public static final BitSet FOLLOW_COMMA_in_declaration1504 = new BitSet(new long[]{0x0000000400001800L});
	public static final BitSet FOLLOW_type_in_declaration1506 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_declaration1508 = new BitSet(new long[]{0x0100000000008000L});
	public static final BitSet FOLLOW_RPAREN_in_declaration1512 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_LCURLY_in_declaration1514 = new BitSet(new long[]{0x4CC3549D9C023800L,0x0000000000000008L});
	public static final BitSet FOLLOW_line_in_declaration1516 = new BitSet(new long[]{0x4CC3549D9C023800L,0x0000000000000008L});
	public static final BitSet FOLLOW_return_statement_in_declaration1519 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_RCURLY_in_declaration1521 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RETURN_in_return_statement1556 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_LPAREN_in_return_statement1559 = new BitSet(new long[]{0x4C43549884002000L});
	public static final BitSet FOLLOW_expression_in_return_statement1562 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_return_statement1564 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_return_statement1567 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignment_expr_in_expression1580 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_or_expr_in_assignment_expr1592 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_BECOMES_in_assignment_expr1595 = new BitSet(new long[]{0x4C43549884002000L});
	public static final BitSet FOLLOW_assignment_expr_in_assignment_expr1598 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_and_expr_in_or_expr1612 = new BitSet(new long[]{0x0000800000000002L});
	public static final BitSet FOLLOW_OR_in_or_expr1615 = new BitSet(new long[]{0x4C43549884002000L});
	public static final BitSet FOLLOW_and_expr_in_or_expr1618 = new BitSet(new long[]{0x0000800000000002L});
	public static final BitSet FOLLOW_boolean_expr_in_and_expr1632 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_AND_in_and_expr1635 = new BitSet(new long[]{0x4C43549884002000L});
	public static final BitSet FOLLOW_boolean_expr_in_and_expr1638 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_plus_expr_in_boolean_expr1652 = new BitSet(new long[]{0x0000230062000002L});
	public static final BitSet FOLLOW_LT_in_boolean_expr1656 = new BitSet(new long[]{0x4C43549884002000L});
	public static final BitSet FOLLOW_LT_EQ_in_boolean_expr1661 = new BitSet(new long[]{0x4C43549884002000L});
	public static final BitSet FOLLOW_GT_in_boolean_expr1666 = new BitSet(new long[]{0x4C43549884002000L});
	public static final BitSet FOLLOW_GT_EQ_in_boolean_expr1671 = new BitSet(new long[]{0x4C43549884002000L});
	public static final BitSet FOLLOW_EQ_in_boolean_expr1676 = new BitSet(new long[]{0x4C43549884002000L});
	public static final BitSet FOLLOW_NEQ_in_boolean_expr1681 = new BitSet(new long[]{0x4C43549884002000L});
	public static final BitSet FOLLOW_plus_expr_in_boolean_expr1685 = new BitSet(new long[]{0x0000230062000002L});
	public static final BitSet FOLLOW_multi_expr_in_plus_expr1698 = new BitSet(new long[]{0x0001040000000002L});
	public static final BitSet FOLLOW_PLUS_in_plus_expr1702 = new BitSet(new long[]{0x4C43549884002000L});
	public static final BitSet FOLLOW_MINUS_in_plus_expr1707 = new BitSet(new long[]{0x4C43549884002000L});
	public static final BitSet FOLLOW_multi_expr_in_plus_expr1711 = new BitSet(new long[]{0x0001040000000002L});
	public static final BitSet FOLLOW_unary_expr_in_multi_expr1724 = new BitSet(new long[]{0x2000080000080002L});
	public static final BitSet FOLLOW_TIMES_in_multi_expr1728 = new BitSet(new long[]{0x4C43549884002000L});
	public static final BitSet FOLLOW_DIVIDE_in_multi_expr1733 = new BitSet(new long[]{0x4C43549884002000L});
	public static final BitSet FOLLOW_MOD_in_multi_expr1738 = new BitSet(new long[]{0x4C43549884002000L});
	public static final BitSet FOLLOW_unary_expr_in_multi_expr1742 = new BitSet(new long[]{0x2000080000080002L});
	public static final BitSet FOLLOW_operand_in_unary_expr1756 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MINUS_in_unary_expr1761 = new BitSet(new long[]{0x4C42409884002000L});
	public static final BitSet FOLLOW_operand_in_unary_expr1763 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PLUS_in_unary_expr1776 = new BitSet(new long[]{0x4C42409884002000L});
	public static final BitSet FOLLOW_operand_in_unary_expr1778 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NEGATE_in_unary_expr1791 = new BitSet(new long[]{0x4C42409884002000L});
	public static final BitSet FOLLOW_operand_in_unary_expr1794 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_operand1810 = new BitSet(new long[]{0x0000008800000002L});
	public static final BitSet FOLLOW_LBRACKET_in_operand1824 = new BitSet(new long[]{0x4C43549884002000L});
	public static final BitSet FOLLOW_expression_in_operand1826 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_RBRACKET_in_operand1828 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_operand1844 = new BitSet(new long[]{0x4D43549884002000L});
	public static final BitSet FOLLOW_expression_in_operand1847 = new BitSet(new long[]{0x0100000000008000L});
	public static final BitSet FOLLOW_COMMA_in_operand1850 = new BitSet(new long[]{0x4C43549884002000L});
	public static final BitSet FOLLOW_expression_in_operand1852 = new BitSet(new long[]{0x0100000000008000L});
	public static final BitSet FOLLOW_RPAREN_in_operand1858 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMBER_in_operand1886 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_operand1896 = new BitSet(new long[]{0x4C43549884002000L});
	public static final BitSet FOLLOW_assignment_expr_in_operand1899 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_operand1901 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACKET_in_operand1907 = new BitSet(new long[]{0x4C43549884002000L});
	public static final BitSet FOLLOW_expression_in_operand1909 = new BitSet(new long[]{0x0010000000008000L});
	public static final BitSet FOLLOW_COMMA_in_operand1912 = new BitSet(new long[]{0x4C43549884002000L});
	public static final BitSet FOLLOW_expression_in_operand1914 = new BitSet(new long[]{0x0010000000008000L});
	public static final BitSet FOLLOW_RBRACKET_in_operand1918 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_print_statement_in_operand1934 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_read_statement_in_operand1939 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SIZEOF_in_operand1944 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_LPAREN_in_operand1947 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_operand1950 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_operand1952 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_operand1958 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_LITERAL_in_operand1969 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_operand1974 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_codeblock_in_operand1979 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTEGER_in_type1993 = new BitSet(new long[]{0x0000000800000002L});
	public static final BitSet FOLLOW_array_def_in_type1995 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_in_type2001 = new BitSet(new long[]{0x0000000800000002L});
	public static final BitSet FOLLOW_array_def_in_type2003 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOLEAN_in_type2009 = new BitSet(new long[]{0x0000000800000002L});
	public static final BitSet FOLLOW_array_def_in_type2011 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACKET_in_array_def2025 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_NUMBER_in_array_def2027 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_RBRACKET_in_array_def2029 = new BitSet(new long[]{0x0000000000000002L});
}

// $ANTLR 3.5.2 antlr/Neptune.g 2014-07-04 20:07:48

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
				if ( ((LA1_0 >= BOOLEAN && LA1_0 <= CHAR_LITERAL)||LA1_0==CONST||(LA1_0 >= FALSE && LA1_0 <= FUNCTION)||(LA1_0 >= IDENTIFIER && LA1_0 <= IF)||(LA1_0 >= INTEGER && LA1_0 <= LCURLY)||LA1_0==LPAREN||LA1_0==MINUS||LA1_0==NEGATE||LA1_0==NUMBER||(LA1_0 >= PLUS && LA1_0 <= PRINT)||(LA1_0 >= READ && LA1_0 <= RETURN)||(LA1_0 >= SIZEOF && LA1_0 <= STRING_LITERAL)||LA1_0==TRUE||LA1_0==WHILE) ) {
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
	// antlr/Neptune.g:135:1: line : ( expression SEMICOLON !| declaration SEMICOLON !| logic_statement | return_statement );
	public final NeptuneParser.line_return line() throws RecognitionException {
		NeptuneParser.line_return retval = new NeptuneParser.line_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token SEMICOLON5=null;
		Token SEMICOLON7=null;
		ParserRuleReturnScope expression4 =null;
		ParserRuleReturnScope declaration6 =null;
		ParserRuleReturnScope logic_statement8 =null;
		ParserRuleReturnScope return_statement9 =null;

		Object SEMICOLON5_tree=null;
		Object SEMICOLON7_tree=null;

		try {
			// antlr/Neptune.g:136:2: ( expression SEMICOLON !| declaration SEMICOLON !| logic_statement | return_statement )
			int alt2=4;
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
				case 4 :
					// antlr/Neptune.g:139:4: return_statement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_return_statement_in_line1197);
					return_statement9=return_statement();
					state._fsp--;

					adaptor.addChild(root_0, return_statement9.getTree());

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
	// antlr/Neptune.g:142:1: codeblock : LCURLY lines RCURLY -> ^( BLOCK lines ) ;
	public final NeptuneParser.codeblock_return codeblock() throws RecognitionException {
		NeptuneParser.codeblock_return retval = new NeptuneParser.codeblock_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token LCURLY10=null;
		Token RCURLY12=null;
		ParserRuleReturnScope lines11 =null;

		Object LCURLY10_tree=null;
		Object RCURLY12_tree=null;
		RewriteRuleTokenStream stream_LCURLY=new RewriteRuleTokenStream(adaptor,"token LCURLY");
		RewriteRuleTokenStream stream_RCURLY=new RewriteRuleTokenStream(adaptor,"token RCURLY");
		RewriteRuleSubtreeStream stream_lines=new RewriteRuleSubtreeStream(adaptor,"rule lines");

		try {
			// antlr/Neptune.g:143:2: ( LCURLY lines RCURLY -> ^( BLOCK lines ) )
			// antlr/Neptune.g:143:4: LCURLY lines RCURLY
			{
			LCURLY10=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_codeblock1209);  
			stream_LCURLY.add(LCURLY10);

			pushFollow(FOLLOW_lines_in_codeblock1211);
			lines11=lines();
			state._fsp--;

			stream_lines.add(lines11.getTree());
			RCURLY12=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_codeblock1213);  
			stream_RCURLY.add(RCURLY12);

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
			// 144:3: -> ^( BLOCK lines )
			{
				// antlr/Neptune.g:144:6: ^( BLOCK lines )
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
	// antlr/Neptune.g:147:1: logic_statement : ( while_statement | foreach_statement | if_statement );
	public final NeptuneParser.logic_statement_return logic_statement() throws RecognitionException {
		NeptuneParser.logic_statement_return retval = new NeptuneParser.logic_statement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope while_statement13 =null;
		ParserRuleReturnScope foreach_statement14 =null;
		ParserRuleReturnScope if_statement15 =null;


		try {
			// antlr/Neptune.g:148:2: ( while_statement | foreach_statement | if_statement )
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
					// antlr/Neptune.g:148:4: while_statement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_while_statement_in_logic_statement1235);
					while_statement13=while_statement();
					state._fsp--;

					adaptor.addChild(root_0, while_statement13.getTree());

					}
					break;
				case 2 :
					// antlr/Neptune.g:149:4: foreach_statement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_foreach_statement_in_logic_statement1240);
					foreach_statement14=foreach_statement();
					state._fsp--;

					adaptor.addChild(root_0, foreach_statement14.getTree());

					}
					break;
				case 3 :
					// antlr/Neptune.g:150:4: if_statement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_if_statement_in_logic_statement1245);
					if_statement15=if_statement();
					state._fsp--;

					adaptor.addChild(root_0, if_statement15.getTree());

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
	// antlr/Neptune.g:155:1: while_statement : WHILE ^ LPAREN ! expression RPAREN ! LCURLY ! lines RCURLY !;
	public final NeptuneParser.while_statement_return while_statement() throws RecognitionException {
		NeptuneParser.while_statement_return retval = new NeptuneParser.while_statement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token WHILE16=null;
		Token LPAREN17=null;
		Token RPAREN19=null;
		Token LCURLY20=null;
		Token RCURLY22=null;
		ParserRuleReturnScope expression18 =null;
		ParserRuleReturnScope lines21 =null;

		Object WHILE16_tree=null;
		Object LPAREN17_tree=null;
		Object RPAREN19_tree=null;
		Object LCURLY20_tree=null;
		Object RCURLY22_tree=null;

		try {
			// antlr/Neptune.g:156:2: ( WHILE ^ LPAREN ! expression RPAREN ! LCURLY ! lines RCURLY !)
			// antlr/Neptune.g:156:4: WHILE ^ LPAREN ! expression RPAREN ! LCURLY ! lines RCURLY !
			{
			root_0 = (Object)adaptor.nil();


			WHILE16=(Token)match(input,WHILE,FOLLOW_WHILE_in_while_statement1259); 
			WHILE16_tree = (Object)adaptor.create(WHILE16);
			root_0 = (Object)adaptor.becomeRoot(WHILE16_tree, root_0);

			LPAREN17=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_while_statement1262); 
			pushFollow(FOLLOW_expression_in_while_statement1265);
			expression18=expression();
			state._fsp--;

			adaptor.addChild(root_0, expression18.getTree());

			RPAREN19=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_while_statement1267); 
			LCURLY20=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_while_statement1270); 
			pushFollow(FOLLOW_lines_in_while_statement1273);
			lines21=lines();
			state._fsp--;

			adaptor.addChild(root_0, lines21.getTree());

			RCURLY22=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_while_statement1275); 
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
	// antlr/Neptune.g:159:1: foreach_statement : FOREACH ^ LPAREN ! IDENTIFIER IN ! IDENTIFIER RPAREN ! LCURLY ! lines RCURLY !;
	public final NeptuneParser.foreach_statement_return foreach_statement() throws RecognitionException {
		NeptuneParser.foreach_statement_return retval = new NeptuneParser.foreach_statement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token FOREACH23=null;
		Token LPAREN24=null;
		Token IDENTIFIER25=null;
		Token IN26=null;
		Token IDENTIFIER27=null;
		Token RPAREN28=null;
		Token LCURLY29=null;
		Token RCURLY31=null;
		ParserRuleReturnScope lines30 =null;

		Object FOREACH23_tree=null;
		Object LPAREN24_tree=null;
		Object IDENTIFIER25_tree=null;
		Object IN26_tree=null;
		Object IDENTIFIER27_tree=null;
		Object RPAREN28_tree=null;
		Object LCURLY29_tree=null;
		Object RCURLY31_tree=null;

		try {
			// antlr/Neptune.g:160:2: ( FOREACH ^ LPAREN ! IDENTIFIER IN ! IDENTIFIER RPAREN ! LCURLY ! lines RCURLY !)
			// antlr/Neptune.g:160:4: FOREACH ^ LPAREN ! IDENTIFIER IN ! IDENTIFIER RPAREN ! LCURLY ! lines RCURLY !
			{
			root_0 = (Object)adaptor.nil();


			FOREACH23=(Token)match(input,FOREACH,FOLLOW_FOREACH_in_foreach_statement1288); 
			FOREACH23_tree = (Object)adaptor.create(FOREACH23);
			root_0 = (Object)adaptor.becomeRoot(FOREACH23_tree, root_0);

			LPAREN24=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_foreach_statement1291); 
			IDENTIFIER25=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_foreach_statement1294); 
			IDENTIFIER25_tree = (Object)adaptor.create(IDENTIFIER25);
			adaptor.addChild(root_0, IDENTIFIER25_tree);

			IN26=(Token)match(input,IN,FOLLOW_IN_in_foreach_statement1296); 
			IDENTIFIER27=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_foreach_statement1299); 
			IDENTIFIER27_tree = (Object)adaptor.create(IDENTIFIER27);
			adaptor.addChild(root_0, IDENTIFIER27_tree);

			RPAREN28=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_foreach_statement1301); 
			LCURLY29=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_foreach_statement1304); 
			pushFollow(FOLLOW_lines_in_foreach_statement1307);
			lines30=lines();
			state._fsp--;

			adaptor.addChild(root_0, lines30.getTree());

			RCURLY31=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_foreach_statement1309); 
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
	// antlr/Neptune.g:163:1: if_statement : IF ^ LPAREN ! expression RPAREN ! LCURLY ! lines RCURLY ! ( ELSIF LPAREN ! expression RPAREN ! LCURLY ! lines RCURLY !)* ( ELSE LCURLY ! lines RCURLY !)? ;
	public final NeptuneParser.if_statement_return if_statement() throws RecognitionException {
		NeptuneParser.if_statement_return retval = new NeptuneParser.if_statement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IF32=null;
		Token LPAREN33=null;
		Token RPAREN35=null;
		Token LCURLY36=null;
		Token RCURLY38=null;
		Token ELSIF39=null;
		Token LPAREN40=null;
		Token RPAREN42=null;
		Token LCURLY43=null;
		Token RCURLY45=null;
		Token ELSE46=null;
		Token LCURLY47=null;
		Token RCURLY49=null;
		ParserRuleReturnScope expression34 =null;
		ParserRuleReturnScope lines37 =null;
		ParserRuleReturnScope expression41 =null;
		ParserRuleReturnScope lines44 =null;
		ParserRuleReturnScope lines48 =null;

		Object IF32_tree=null;
		Object LPAREN33_tree=null;
		Object RPAREN35_tree=null;
		Object LCURLY36_tree=null;
		Object RCURLY38_tree=null;
		Object ELSIF39_tree=null;
		Object LPAREN40_tree=null;
		Object RPAREN42_tree=null;
		Object LCURLY43_tree=null;
		Object RCURLY45_tree=null;
		Object ELSE46_tree=null;
		Object LCURLY47_tree=null;
		Object RCURLY49_tree=null;

		try {
			// antlr/Neptune.g:164:2: ( IF ^ LPAREN ! expression RPAREN ! LCURLY ! lines RCURLY ! ( ELSIF LPAREN ! expression RPAREN ! LCURLY ! lines RCURLY !)* ( ELSE LCURLY ! lines RCURLY !)? )
			// antlr/Neptune.g:164:4: IF ^ LPAREN ! expression RPAREN ! LCURLY ! lines RCURLY ! ( ELSIF LPAREN ! expression RPAREN ! LCURLY ! lines RCURLY !)* ( ELSE LCURLY ! lines RCURLY !)?
			{
			root_0 = (Object)adaptor.nil();


			IF32=(Token)match(input,IF,FOLLOW_IF_in_if_statement1322); 
			IF32_tree = (Object)adaptor.create(IF32);
			root_0 = (Object)adaptor.becomeRoot(IF32_tree, root_0);

			LPAREN33=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_if_statement1325); 
			pushFollow(FOLLOW_expression_in_if_statement1328);
			expression34=expression();
			state._fsp--;

			adaptor.addChild(root_0, expression34.getTree());

			RPAREN35=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_if_statement1330); 
			LCURLY36=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_if_statement1333); 
			pushFollow(FOLLOW_lines_in_if_statement1336);
			lines37=lines();
			state._fsp--;

			adaptor.addChild(root_0, lines37.getTree());

			RCURLY38=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_if_statement1338); 
			// antlr/Neptune.g:165:3: ( ELSIF LPAREN ! expression RPAREN ! LCURLY ! lines RCURLY !)*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==ELSIF) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// antlr/Neptune.g:165:4: ELSIF LPAREN ! expression RPAREN ! LCURLY ! lines RCURLY !
					{
					ELSIF39=(Token)match(input,ELSIF,FOLLOW_ELSIF_in_if_statement1344); 
					ELSIF39_tree = (Object)adaptor.create(ELSIF39);
					adaptor.addChild(root_0, ELSIF39_tree);

					LPAREN40=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_if_statement1346); 
					pushFollow(FOLLOW_expression_in_if_statement1349);
					expression41=expression();
					state._fsp--;

					adaptor.addChild(root_0, expression41.getTree());

					RPAREN42=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_if_statement1351); 
					LCURLY43=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_if_statement1354); 
					pushFollow(FOLLOW_lines_in_if_statement1357);
					lines44=lines();
					state._fsp--;

					adaptor.addChild(root_0, lines44.getTree());

					RCURLY45=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_if_statement1359); 
					}
					break;

				default :
					break loop4;
				}
			}

			// antlr/Neptune.g:166:3: ( ELSE LCURLY ! lines RCURLY !)?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==ELSE) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// antlr/Neptune.g:166:4: ELSE LCURLY ! lines RCURLY !
					{
					ELSE46=(Token)match(input,ELSE,FOLLOW_ELSE_in_if_statement1367); 
					ELSE46_tree = (Object)adaptor.create(ELSE46);
					adaptor.addChild(root_0, ELSE46_tree);

					LCURLY47=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_if_statement1369); 
					pushFollow(FOLLOW_lines_in_if_statement1372);
					lines48=lines();
					state._fsp--;

					adaptor.addChild(root_0, lines48.getTree());

					RCURLY49=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_if_statement1374); 
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
	// antlr/Neptune.g:169:1: print_statement : PRINT ^ LPAREN ! expression ( COMMA ! expression )* RPAREN !;
	public final NeptuneParser.print_statement_return print_statement() throws RecognitionException {
		NeptuneParser.print_statement_return retval = new NeptuneParser.print_statement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token PRINT50=null;
		Token LPAREN51=null;
		Token COMMA53=null;
		Token RPAREN55=null;
		ParserRuleReturnScope expression52 =null;
		ParserRuleReturnScope expression54 =null;

		Object PRINT50_tree=null;
		Object LPAREN51_tree=null;
		Object COMMA53_tree=null;
		Object RPAREN55_tree=null;

		try {
			// antlr/Neptune.g:170:2: ( PRINT ^ LPAREN ! expression ( COMMA ! expression )* RPAREN !)
			// antlr/Neptune.g:170:4: PRINT ^ LPAREN ! expression ( COMMA ! expression )* RPAREN !
			{
			root_0 = (Object)adaptor.nil();


			PRINT50=(Token)match(input,PRINT,FOLLOW_PRINT_in_print_statement1389); 
			PRINT50_tree = (Object)adaptor.create(PRINT50);
			root_0 = (Object)adaptor.becomeRoot(PRINT50_tree, root_0);

			LPAREN51=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_print_statement1392); 
			pushFollow(FOLLOW_expression_in_print_statement1395);
			expression52=expression();
			state._fsp--;

			adaptor.addChild(root_0, expression52.getTree());

			// antlr/Neptune.g:170:30: ( COMMA ! expression )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==COMMA) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// antlr/Neptune.g:170:31: COMMA ! expression
					{
					COMMA53=(Token)match(input,COMMA,FOLLOW_COMMA_in_print_statement1398); 
					pushFollow(FOLLOW_expression_in_print_statement1401);
					expression54=expression();
					state._fsp--;

					adaptor.addChild(root_0, expression54.getTree());

					}
					break;

				default :
					break loop6;
				}
			}

			RPAREN55=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_print_statement1405); 
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
	// antlr/Neptune.g:173:1: read_statement : READ ^ LPAREN ! expression ( COMMA ! expression )* RPAREN !;
	public final NeptuneParser.read_statement_return read_statement() throws RecognitionException {
		NeptuneParser.read_statement_return retval = new NeptuneParser.read_statement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token READ56=null;
		Token LPAREN57=null;
		Token COMMA59=null;
		Token RPAREN61=null;
		ParserRuleReturnScope expression58 =null;
		ParserRuleReturnScope expression60 =null;

		Object READ56_tree=null;
		Object LPAREN57_tree=null;
		Object COMMA59_tree=null;
		Object RPAREN61_tree=null;

		try {
			// antlr/Neptune.g:174:2: ( READ ^ LPAREN ! expression ( COMMA ! expression )* RPAREN !)
			// antlr/Neptune.g:174:4: READ ^ LPAREN ! expression ( COMMA ! expression )* RPAREN !
			{
			root_0 = (Object)adaptor.nil();


			READ56=(Token)match(input,READ,FOLLOW_READ_in_read_statement1418); 
			READ56_tree = (Object)adaptor.create(READ56);
			root_0 = (Object)adaptor.becomeRoot(READ56_tree, root_0);

			LPAREN57=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_read_statement1421); 
			pushFollow(FOLLOW_expression_in_read_statement1424);
			expression58=expression();
			state._fsp--;

			adaptor.addChild(root_0, expression58.getTree());

			// antlr/Neptune.g:174:29: ( COMMA ! expression )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==COMMA) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// antlr/Neptune.g:174:30: COMMA ! expression
					{
					COMMA59=(Token)match(input,COMMA,FOLLOW_COMMA_in_read_statement1427); 
					pushFollow(FOLLOW_expression_in_read_statement1430);
					expression60=expression();
					state._fsp--;

					adaptor.addChild(root_0, expression60.getTree());

					}
					break;

				default :
					break loop7;
				}
			}

			RPAREN61=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_read_statement1434); 
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
	// antlr/Neptune.g:177:1: declaration : ( type IDENTIFIER ( BECOMES expression )? -> ^( VAR type IDENTIFIER ( BECOMES expression )? ) | CONST ^ type IDENTIFIER BECOMES expression | FUNCTION type IDENTIFIER LPAREN type IDENTIFIER ( COMMA type IDENTIFIER )* RPAREN LCURLY ( line )+ RCURLY -> ^( FUNCTION type IDENTIFIER ( type IDENTIFIER )* ( line )+ ) );
	public final NeptuneParser.declaration_return declaration() throws RecognitionException {
		NeptuneParser.declaration_return retval = new NeptuneParser.declaration_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IDENTIFIER63=null;
		Token BECOMES64=null;
		Token CONST66=null;
		Token IDENTIFIER68=null;
		Token BECOMES69=null;
		Token FUNCTION71=null;
		Token IDENTIFIER73=null;
		Token LPAREN74=null;
		Token IDENTIFIER76=null;
		Token COMMA77=null;
		Token IDENTIFIER79=null;
		Token RPAREN80=null;
		Token LCURLY81=null;
		Token RCURLY83=null;
		ParserRuleReturnScope type62 =null;
		ParserRuleReturnScope expression65 =null;
		ParserRuleReturnScope type67 =null;
		ParserRuleReturnScope expression70 =null;
		ParserRuleReturnScope type72 =null;
		ParserRuleReturnScope type75 =null;
		ParserRuleReturnScope type78 =null;
		ParserRuleReturnScope line82 =null;

		Object IDENTIFIER63_tree=null;
		Object BECOMES64_tree=null;
		Object CONST66_tree=null;
		Object IDENTIFIER68_tree=null;
		Object BECOMES69_tree=null;
		Object FUNCTION71_tree=null;
		Object IDENTIFIER73_tree=null;
		Object LPAREN74_tree=null;
		Object IDENTIFIER76_tree=null;
		Object COMMA77_tree=null;
		Object IDENTIFIER79_tree=null;
		Object RPAREN80_tree=null;
		Object LCURLY81_tree=null;
		Object RCURLY83_tree=null;
		RewriteRuleTokenStream stream_FUNCTION=new RewriteRuleTokenStream(adaptor,"token FUNCTION");
		RewriteRuleTokenStream stream_BECOMES=new RewriteRuleTokenStream(adaptor,"token BECOMES");
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleTokenStream stream_LCURLY=new RewriteRuleTokenStream(adaptor,"token LCURLY");
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleTokenStream stream_RCURLY=new RewriteRuleTokenStream(adaptor,"token RCURLY");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_line=new RewriteRuleSubtreeStream(adaptor,"rule line");
		RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");

		try {
			// antlr/Neptune.g:178:2: ( type IDENTIFIER ( BECOMES expression )? -> ^( VAR type IDENTIFIER ( BECOMES expression )? ) | CONST ^ type IDENTIFIER BECOMES expression | FUNCTION type IDENTIFIER LPAREN type IDENTIFIER ( COMMA type IDENTIFIER )* RPAREN LCURLY ( line )+ RCURLY -> ^( FUNCTION type IDENTIFIER ( type IDENTIFIER )* ( line )+ ) )
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
					// antlr/Neptune.g:178:4: type IDENTIFIER ( BECOMES expression )?
					{
					pushFollow(FOLLOW_type_in_declaration1447);
					type62=type();
					state._fsp--;

					stream_type.add(type62.getTree());
					IDENTIFIER63=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_declaration1449);  
					stream_IDENTIFIER.add(IDENTIFIER63);

					// antlr/Neptune.g:178:20: ( BECOMES expression )?
					int alt8=2;
					int LA8_0 = input.LA(1);
					if ( (LA8_0==BECOMES) ) {
						alt8=1;
					}
					switch (alt8) {
						case 1 :
							// antlr/Neptune.g:178:21: BECOMES expression
							{
							BECOMES64=(Token)match(input,BECOMES,FOLLOW_BECOMES_in_declaration1452);  
							stream_BECOMES.add(BECOMES64);

							pushFollow(FOLLOW_expression_in_declaration1454);
							expression65=expression();
							state._fsp--;

							stream_expression.add(expression65.getTree());
							}
							break;

					}

					// AST REWRITE
					// elements: type, IDENTIFIER, BECOMES, expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 179:3: -> ^( VAR type IDENTIFIER ( BECOMES expression )? )
					{
						// antlr/Neptune.g:179:6: ^( VAR type IDENTIFIER ( BECOMES expression )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VAR, "VAR"), root_1);
						adaptor.addChild(root_1, stream_type.nextTree());
						adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
						// antlr/Neptune.g:179:28: ( BECOMES expression )?
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
					// antlr/Neptune.g:180:4: CONST ^ type IDENTIFIER BECOMES expression
					{
					root_0 = (Object)adaptor.nil();


					CONST66=(Token)match(input,CONST,FOLLOW_CONST_in_declaration1480); 
					CONST66_tree = (Object)adaptor.create(CONST66);
					root_0 = (Object)adaptor.becomeRoot(CONST66_tree, root_0);

					pushFollow(FOLLOW_type_in_declaration1483);
					type67=type();
					state._fsp--;

					adaptor.addChild(root_0, type67.getTree());

					IDENTIFIER68=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_declaration1485); 
					IDENTIFIER68_tree = (Object)adaptor.create(IDENTIFIER68);
					adaptor.addChild(root_0, IDENTIFIER68_tree);

					BECOMES69=(Token)match(input,BECOMES,FOLLOW_BECOMES_in_declaration1487); 
					BECOMES69_tree = (Object)adaptor.create(BECOMES69);
					adaptor.addChild(root_0, BECOMES69_tree);

					pushFollow(FOLLOW_expression_in_declaration1489);
					expression70=expression();
					state._fsp--;

					adaptor.addChild(root_0, expression70.getTree());

					}
					break;
				case 3 :
					// antlr/Neptune.g:181:6: FUNCTION type IDENTIFIER LPAREN type IDENTIFIER ( COMMA type IDENTIFIER )* RPAREN LCURLY ( line )+ RCURLY
					{
					FUNCTION71=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_declaration1496);  
					stream_FUNCTION.add(FUNCTION71);

					pushFollow(FOLLOW_type_in_declaration1498);
					type72=type();
					state._fsp--;

					stream_type.add(type72.getTree());
					IDENTIFIER73=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_declaration1500);  
					stream_IDENTIFIER.add(IDENTIFIER73);

					LPAREN74=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_declaration1502);  
					stream_LPAREN.add(LPAREN74);

					pushFollow(FOLLOW_type_in_declaration1504);
					type75=type();
					state._fsp--;

					stream_type.add(type75.getTree());
					IDENTIFIER76=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_declaration1506);  
					stream_IDENTIFIER.add(IDENTIFIER76);

					// antlr/Neptune.g:181:54: ( COMMA type IDENTIFIER )*
					loop9:
					while (true) {
						int alt9=2;
						int LA9_0 = input.LA(1);
						if ( (LA9_0==COMMA) ) {
							alt9=1;
						}

						switch (alt9) {
						case 1 :
							// antlr/Neptune.g:181:55: COMMA type IDENTIFIER
							{
							COMMA77=(Token)match(input,COMMA,FOLLOW_COMMA_in_declaration1509);  
							stream_COMMA.add(COMMA77);

							pushFollow(FOLLOW_type_in_declaration1511);
							type78=type();
							state._fsp--;

							stream_type.add(type78.getTree());
							IDENTIFIER79=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_declaration1513);  
							stream_IDENTIFIER.add(IDENTIFIER79);

							}
							break;

						default :
							break loop9;
						}
					}

					RPAREN80=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_declaration1517);  
					stream_RPAREN.add(RPAREN80);

					LCURLY81=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_declaration1519);  
					stream_LCURLY.add(LCURLY81);

					// antlr/Neptune.g:181:93: ( line )+
					int cnt10=0;
					loop10:
					while (true) {
						int alt10=2;
						int LA10_0 = input.LA(1);
						if ( ((LA10_0 >= BOOLEAN && LA10_0 <= CHAR_LITERAL)||LA10_0==CONST||(LA10_0 >= FALSE && LA10_0 <= FUNCTION)||(LA10_0 >= IDENTIFIER && LA10_0 <= IF)||(LA10_0 >= INTEGER && LA10_0 <= LCURLY)||LA10_0==LPAREN||LA10_0==MINUS||LA10_0==NEGATE||LA10_0==NUMBER||(LA10_0 >= PLUS && LA10_0 <= PRINT)||(LA10_0 >= READ && LA10_0 <= RETURN)||(LA10_0 >= SIZEOF && LA10_0 <= STRING_LITERAL)||LA10_0==TRUE||LA10_0==WHILE) ) {
							alt10=1;
						}

						switch (alt10) {
						case 1 :
							// antlr/Neptune.g:181:93: line
							{
							pushFollow(FOLLOW_line_in_declaration1521);
							line82=line();
							state._fsp--;

							stream_line.add(line82.getTree());
							}
							break;

						default :
							if ( cnt10 >= 1 ) break loop10;
							EarlyExitException eee = new EarlyExitException(10, input);
							throw eee;
						}
						cnt10++;
					}

					RCURLY83=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_declaration1524);  
					stream_RCURLY.add(RCURLY83);

					// AST REWRITE
					// elements: IDENTIFIER, line, IDENTIFIER, type, FUNCTION, type
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 182:3: -> ^( FUNCTION type IDENTIFIER ( type IDENTIFIER )* ( line )+ )
					{
						// antlr/Neptune.g:182:6: ^( FUNCTION type IDENTIFIER ( type IDENTIFIER )* ( line )+ )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot(stream_FUNCTION.nextNode(), root_1);
						adaptor.addChild(root_1, stream_type.nextTree());
						adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
						// antlr/Neptune.g:182:33: ( type IDENTIFIER )*
						while ( stream_IDENTIFIER.hasNext()||stream_type.hasNext() ) {
							adaptor.addChild(root_1, stream_type.nextTree());
							adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
						}
						stream_IDENTIFIER.reset();
						stream_type.reset();

						if ( !(stream_line.hasNext()) ) {
							throw new RewriteEarlyExitException();
						}
						while ( stream_line.hasNext() ) {
							adaptor.addChild(root_1, stream_line.nextTree());
						}
						stream_line.reset();

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
	// antlr/Neptune.g:185:1: return_statement : RETURN ^ LPAREN ! expression RPAREN ! SEMICOLON !;
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
			// antlr/Neptune.g:186:2: ( RETURN ^ LPAREN ! expression RPAREN ! SEMICOLON !)
			// antlr/Neptune.g:186:4: RETURN ^ LPAREN ! expression RPAREN ! SEMICOLON !
			{
			root_0 = (Object)adaptor.nil();


			RETURN84=(Token)match(input,RETURN,FOLLOW_RETURN_in_return_statement1557); 
			RETURN84_tree = (Object)adaptor.create(RETURN84);
			root_0 = (Object)adaptor.becomeRoot(RETURN84_tree, root_0);

			LPAREN85=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_return_statement1560); 
			pushFollow(FOLLOW_expression_in_return_statement1563);
			expression86=expression();
			state._fsp--;

			adaptor.addChild(root_0, expression86.getTree());

			RPAREN87=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_return_statement1565); 
			SEMICOLON88=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_return_statement1568); 
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
	// antlr/Neptune.g:189:1: expression : assignment_expr ;
	public final NeptuneParser.expression_return expression() throws RecognitionException {
		NeptuneParser.expression_return retval = new NeptuneParser.expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope assignment_expr89 =null;


		try {
			// antlr/Neptune.g:190:2: ( assignment_expr )
			// antlr/Neptune.g:190:5: assignment_expr
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_assignment_expr_in_expression1581);
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
	// antlr/Neptune.g:193:1: assignment_expr : or_expr ( BECOMES ^ assignment_expr )? ;
	public final NeptuneParser.assignment_expr_return assignment_expr() throws RecognitionException {
		NeptuneParser.assignment_expr_return retval = new NeptuneParser.assignment_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token BECOMES91=null;
		ParserRuleReturnScope or_expr90 =null;
		ParserRuleReturnScope assignment_expr92 =null;

		Object BECOMES91_tree=null;

		try {
			// antlr/Neptune.g:194:2: ( or_expr ( BECOMES ^ assignment_expr )? )
			// antlr/Neptune.g:194:4: or_expr ( BECOMES ^ assignment_expr )?
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_or_expr_in_assignment_expr1593);
			or_expr90=or_expr();
			state._fsp--;

			adaptor.addChild(root_0, or_expr90.getTree());

			// antlr/Neptune.g:194:12: ( BECOMES ^ assignment_expr )?
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==BECOMES) ) {
				alt12=1;
			}
			switch (alt12) {
				case 1 :
					// antlr/Neptune.g:194:13: BECOMES ^ assignment_expr
					{
					BECOMES91=(Token)match(input,BECOMES,FOLLOW_BECOMES_in_assignment_expr1596); 
					BECOMES91_tree = (Object)adaptor.create(BECOMES91);
					root_0 = (Object)adaptor.becomeRoot(BECOMES91_tree, root_0);

					pushFollow(FOLLOW_assignment_expr_in_assignment_expr1599);
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
	// antlr/Neptune.g:197:1: or_expr : and_expr ( OR ^ and_expr )* ;
	public final NeptuneParser.or_expr_return or_expr() throws RecognitionException {
		NeptuneParser.or_expr_return retval = new NeptuneParser.or_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token OR94=null;
		ParserRuleReturnScope and_expr93 =null;
		ParserRuleReturnScope and_expr95 =null;

		Object OR94_tree=null;

		try {
			// antlr/Neptune.g:198:2: ( and_expr ( OR ^ and_expr )* )
			// antlr/Neptune.g:198:4: and_expr ( OR ^ and_expr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_and_expr_in_or_expr1613);
			and_expr93=and_expr();
			state._fsp--;

			adaptor.addChild(root_0, and_expr93.getTree());

			// antlr/Neptune.g:198:13: ( OR ^ and_expr )*
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( (LA13_0==OR) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// antlr/Neptune.g:198:14: OR ^ and_expr
					{
					OR94=(Token)match(input,OR,FOLLOW_OR_in_or_expr1616); 
					OR94_tree = (Object)adaptor.create(OR94);
					root_0 = (Object)adaptor.becomeRoot(OR94_tree, root_0);

					pushFollow(FOLLOW_and_expr_in_or_expr1619);
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
	// antlr/Neptune.g:201:1: and_expr : boolean_expr ( AND ^ boolean_expr )* ;
	public final NeptuneParser.and_expr_return and_expr() throws RecognitionException {
		NeptuneParser.and_expr_return retval = new NeptuneParser.and_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token AND97=null;
		ParserRuleReturnScope boolean_expr96 =null;
		ParserRuleReturnScope boolean_expr98 =null;

		Object AND97_tree=null;

		try {
			// antlr/Neptune.g:202:2: ( boolean_expr ( AND ^ boolean_expr )* )
			// antlr/Neptune.g:202:4: boolean_expr ( AND ^ boolean_expr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_boolean_expr_in_and_expr1633);
			boolean_expr96=boolean_expr();
			state._fsp--;

			adaptor.addChild(root_0, boolean_expr96.getTree());

			// antlr/Neptune.g:202:17: ( AND ^ boolean_expr )*
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( (LA14_0==AND) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// antlr/Neptune.g:202:18: AND ^ boolean_expr
					{
					AND97=(Token)match(input,AND,FOLLOW_AND_in_and_expr1636); 
					AND97_tree = (Object)adaptor.create(AND97);
					root_0 = (Object)adaptor.becomeRoot(AND97_tree, root_0);

					pushFollow(FOLLOW_boolean_expr_in_and_expr1639);
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
	// antlr/Neptune.g:205:1: boolean_expr : plus_expr ( ( LT ^| LT_EQ ^| GT ^| GT_EQ ^| EQ ^| NEQ ^) plus_expr )* ;
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
			// antlr/Neptune.g:206:2: ( plus_expr ( ( LT ^| LT_EQ ^| GT ^| GT_EQ ^| EQ ^| NEQ ^) plus_expr )* )
			// antlr/Neptune.g:206:4: plus_expr ( ( LT ^| LT_EQ ^| GT ^| GT_EQ ^| EQ ^| NEQ ^) plus_expr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_plus_expr_in_boolean_expr1653);
			plus_expr99=plus_expr();
			state._fsp--;

			adaptor.addChild(root_0, plus_expr99.getTree());

			// antlr/Neptune.g:206:14: ( ( LT ^| LT_EQ ^| GT ^| GT_EQ ^| EQ ^| NEQ ^) plus_expr )*
			loop16:
			while (true) {
				int alt16=2;
				int LA16_0 = input.LA(1);
				if ( (LA16_0==EQ||(LA16_0 >= GT && LA16_0 <= GT_EQ)||(LA16_0 >= LT && LA16_0 <= LT_EQ)||LA16_0==NEQ) ) {
					alt16=1;
				}

				switch (alt16) {
				case 1 :
					// antlr/Neptune.g:206:15: ( LT ^| LT_EQ ^| GT ^| GT_EQ ^| EQ ^| NEQ ^) plus_expr
					{
					// antlr/Neptune.g:206:15: ( LT ^| LT_EQ ^| GT ^| GT_EQ ^| EQ ^| NEQ ^)
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
							// antlr/Neptune.g:206:16: LT ^
							{
							LT100=(Token)match(input,LT,FOLLOW_LT_in_boolean_expr1657); 
							LT100_tree = (Object)adaptor.create(LT100);
							root_0 = (Object)adaptor.becomeRoot(LT100_tree, root_0);

							}
							break;
						case 2 :
							// antlr/Neptune.g:206:22: LT_EQ ^
							{
							LT_EQ101=(Token)match(input,LT_EQ,FOLLOW_LT_EQ_in_boolean_expr1662); 
							LT_EQ101_tree = (Object)adaptor.create(LT_EQ101);
							root_0 = (Object)adaptor.becomeRoot(LT_EQ101_tree, root_0);

							}
							break;
						case 3 :
							// antlr/Neptune.g:206:31: GT ^
							{
							GT102=(Token)match(input,GT,FOLLOW_GT_in_boolean_expr1667); 
							GT102_tree = (Object)adaptor.create(GT102);
							root_0 = (Object)adaptor.becomeRoot(GT102_tree, root_0);

							}
							break;
						case 4 :
							// antlr/Neptune.g:206:37: GT_EQ ^
							{
							GT_EQ103=(Token)match(input,GT_EQ,FOLLOW_GT_EQ_in_boolean_expr1672); 
							GT_EQ103_tree = (Object)adaptor.create(GT_EQ103);
							root_0 = (Object)adaptor.becomeRoot(GT_EQ103_tree, root_0);

							}
							break;
						case 5 :
							// antlr/Neptune.g:206:46: EQ ^
							{
							EQ104=(Token)match(input,EQ,FOLLOW_EQ_in_boolean_expr1677); 
							EQ104_tree = (Object)adaptor.create(EQ104);
							root_0 = (Object)adaptor.becomeRoot(EQ104_tree, root_0);

							}
							break;
						case 6 :
							// antlr/Neptune.g:206:52: NEQ ^
							{
							NEQ105=(Token)match(input,NEQ,FOLLOW_NEQ_in_boolean_expr1682); 
							NEQ105_tree = (Object)adaptor.create(NEQ105);
							root_0 = (Object)adaptor.becomeRoot(NEQ105_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_plus_expr_in_boolean_expr1686);
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
	// antlr/Neptune.g:209:1: plus_expr : multi_expr ( ( PLUS ^| MINUS ^) multi_expr )* ;
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
			// antlr/Neptune.g:210:2: ( multi_expr ( ( PLUS ^| MINUS ^) multi_expr )* )
			// antlr/Neptune.g:210:4: multi_expr ( ( PLUS ^| MINUS ^) multi_expr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_multi_expr_in_plus_expr1699);
			multi_expr107=multi_expr();
			state._fsp--;

			adaptor.addChild(root_0, multi_expr107.getTree());

			// antlr/Neptune.g:210:15: ( ( PLUS ^| MINUS ^) multi_expr )*
			loop18:
			while (true) {
				int alt18=2;
				int LA18_0 = input.LA(1);
				if ( (LA18_0==MINUS||LA18_0==PLUS) ) {
					alt18=1;
				}

				switch (alt18) {
				case 1 :
					// antlr/Neptune.g:210:16: ( PLUS ^| MINUS ^) multi_expr
					{
					// antlr/Neptune.g:210:16: ( PLUS ^| MINUS ^)
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
							// antlr/Neptune.g:210:17: PLUS ^
							{
							PLUS108=(Token)match(input,PLUS,FOLLOW_PLUS_in_plus_expr1703); 
							PLUS108_tree = (Object)adaptor.create(PLUS108);
							root_0 = (Object)adaptor.becomeRoot(PLUS108_tree, root_0);

							}
							break;
						case 2 :
							// antlr/Neptune.g:210:25: MINUS ^
							{
							MINUS109=(Token)match(input,MINUS,FOLLOW_MINUS_in_plus_expr1708); 
							MINUS109_tree = (Object)adaptor.create(MINUS109);
							root_0 = (Object)adaptor.becomeRoot(MINUS109_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_multi_expr_in_plus_expr1712);
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
	// antlr/Neptune.g:213:1: multi_expr : unary_expr ( ( TIMES ^| DIVIDE ^| MOD ^) unary_expr )* ;
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
			// antlr/Neptune.g:214:2: ( unary_expr ( ( TIMES ^| DIVIDE ^| MOD ^) unary_expr )* )
			// antlr/Neptune.g:214:4: unary_expr ( ( TIMES ^| DIVIDE ^| MOD ^) unary_expr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_unary_expr_in_multi_expr1725);
			unary_expr111=unary_expr();
			state._fsp--;

			adaptor.addChild(root_0, unary_expr111.getTree());

			// antlr/Neptune.g:214:15: ( ( TIMES ^| DIVIDE ^| MOD ^) unary_expr )*
			loop20:
			while (true) {
				int alt20=2;
				int LA20_0 = input.LA(1);
				if ( (LA20_0==DIVIDE||LA20_0==MOD||LA20_0==TIMES) ) {
					alt20=1;
				}

				switch (alt20) {
				case 1 :
					// antlr/Neptune.g:214:16: ( TIMES ^| DIVIDE ^| MOD ^) unary_expr
					{
					// antlr/Neptune.g:214:16: ( TIMES ^| DIVIDE ^| MOD ^)
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
							// antlr/Neptune.g:214:17: TIMES ^
							{
							TIMES112=(Token)match(input,TIMES,FOLLOW_TIMES_in_multi_expr1729); 
							TIMES112_tree = (Object)adaptor.create(TIMES112);
							root_0 = (Object)adaptor.becomeRoot(TIMES112_tree, root_0);

							}
							break;
						case 2 :
							// antlr/Neptune.g:214:26: DIVIDE ^
							{
							DIVIDE113=(Token)match(input,DIVIDE,FOLLOW_DIVIDE_in_multi_expr1734); 
							DIVIDE113_tree = (Object)adaptor.create(DIVIDE113);
							root_0 = (Object)adaptor.becomeRoot(DIVIDE113_tree, root_0);

							}
							break;
						case 3 :
							// antlr/Neptune.g:214:36: MOD ^
							{
							MOD114=(Token)match(input,MOD,FOLLOW_MOD_in_multi_expr1739); 
							MOD114_tree = (Object)adaptor.create(MOD114);
							root_0 = (Object)adaptor.becomeRoot(MOD114_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_unary_expr_in_multi_expr1743);
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
	// antlr/Neptune.g:217:1: unary_expr : ( operand | MINUS operand -> ^( UNARY_MINUS operand ) | PLUS operand -> ^( UNARY_PLUS operand ) | NEGATE ^ operand );
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
			// antlr/Neptune.g:218:2: ( operand | MINUS operand -> ^( UNARY_MINUS operand ) | PLUS operand -> ^( UNARY_PLUS operand ) | NEGATE ^ operand )
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
					// antlr/Neptune.g:218:4: operand
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_operand_in_unary_expr1757);
					operand116=operand();
					state._fsp--;

					adaptor.addChild(root_0, operand116.getTree());

					}
					break;
				case 2 :
					// antlr/Neptune.g:219:4: MINUS operand
					{
					MINUS117=(Token)match(input,MINUS,FOLLOW_MINUS_in_unary_expr1762);  
					stream_MINUS.add(MINUS117);

					pushFollow(FOLLOW_operand_in_unary_expr1764);
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
					// 219:18: -> ^( UNARY_MINUS operand )
					{
						// antlr/Neptune.g:219:21: ^( UNARY_MINUS operand )
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
					// antlr/Neptune.g:220:4: PLUS operand
					{
					PLUS119=(Token)match(input,PLUS,FOLLOW_PLUS_in_unary_expr1777);  
					stream_PLUS.add(PLUS119);

					pushFollow(FOLLOW_operand_in_unary_expr1779);
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
					// 220:17: -> ^( UNARY_PLUS operand )
					{
						// antlr/Neptune.g:220:20: ^( UNARY_PLUS operand )
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
					// antlr/Neptune.g:221:4: NEGATE ^ operand
					{
					root_0 = (Object)adaptor.nil();


					NEGATE121=(Token)match(input,NEGATE,FOLLOW_NEGATE_in_unary_expr1792); 
					NEGATE121_tree = (Object)adaptor.create(NEGATE121);
					root_0 = (Object)adaptor.becomeRoot(NEGATE121_tree, root_0);

					pushFollow(FOLLOW_operand_in_unary_expr1795);
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
	// antlr/Neptune.g:224:1: operand : ( IDENTIFIER ( -> ^( ATOMIC_VAR IDENTIFIER ) | LBRACKET expression RBRACKET -> ^( ARRAY_VAR IDENTIFIER expression ) | ( LPAREN ( expression ( COMMA expression )* )? RPAREN -> ^( FUNCTION IDENTIFIER ( ^( ARRAY_SET ( expression )+ ) )? ) ) ) | NUMBER | LPAREN ! assignment_expr RPAREN !| LBRACKET expression ( COMMA expression )* RBRACKET -> ^( ARRAY_SET ( expression )+ ) | print_statement | read_statement | SIZEOF ^ LPAREN ! IDENTIFIER RPAREN !| ( TRUE | FALSE ) | CHAR_LITERAL | STRING_LITERAL | codeblock );
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
			// antlr/Neptune.g:225:5: ( IDENTIFIER ( -> ^( ATOMIC_VAR IDENTIFIER ) | LBRACKET expression RBRACKET -> ^( ARRAY_VAR IDENTIFIER expression ) | ( LPAREN ( expression ( COMMA expression )* )? RPAREN -> ^( FUNCTION IDENTIFIER ( ^( ARRAY_SET ( expression )+ ) )? ) ) ) | NUMBER | LPAREN ! assignment_expr RPAREN !| LBRACKET expression ( COMMA expression )* RBRACKET -> ^( ARRAY_SET ( expression )+ ) | print_statement | read_statement | SIZEOF ^ LPAREN ! IDENTIFIER RPAREN !| ( TRUE | FALSE ) | CHAR_LITERAL | STRING_LITERAL | codeblock )
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
					// antlr/Neptune.g:225:9: IDENTIFIER ( -> ^( ATOMIC_VAR IDENTIFIER ) | LBRACKET expression RBRACKET -> ^( ARRAY_VAR IDENTIFIER expression ) | ( LPAREN ( expression ( COMMA expression )* )? RPAREN -> ^( FUNCTION IDENTIFIER ( ^( ARRAY_SET ( expression )+ ) )? ) ) )
					{
					IDENTIFIER123=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_operand1811);  
					stream_IDENTIFIER.add(IDENTIFIER123);

					// antlr/Neptune.g:225:20: ( -> ^( ATOMIC_VAR IDENTIFIER ) | LBRACKET expression RBRACKET -> ^( ARRAY_VAR IDENTIFIER expression ) | ( LPAREN ( expression ( COMMA expression )* )? RPAREN -> ^( FUNCTION IDENTIFIER ( ^( ARRAY_SET ( expression )+ ) )? ) ) )
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
							// antlr/Neptune.g:225:22: 
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
							// 225:22: -> ^( ATOMIC_VAR IDENTIFIER )
							{
								// antlr/Neptune.g:225:25: ^( ATOMIC_VAR IDENTIFIER )
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
							// antlr/Neptune.g:225:52: LBRACKET expression RBRACKET
							{
							LBRACKET124=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_operand1825);  
							stream_LBRACKET.add(LBRACKET124);

							pushFollow(FOLLOW_expression_in_operand1827);
							expression125=expression();
							state._fsp--;

							stream_expression.add(expression125.getTree());
							RBRACKET126=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_operand1829);  
							stream_RBRACKET.add(RBRACKET126);

							// AST REWRITE
							// elements: expression, IDENTIFIER
							// token labels: 
							// rule labels: retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (Object)adaptor.nil();
							// 225:81: -> ^( ARRAY_VAR IDENTIFIER expression )
							{
								// antlr/Neptune.g:225:84: ^( ARRAY_VAR IDENTIFIER expression )
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
							// antlr/Neptune.g:225:122: ( LPAREN ( expression ( COMMA expression )* )? RPAREN -> ^( FUNCTION IDENTIFIER ( ^( ARRAY_SET ( expression )+ ) )? ) )
							{
							// antlr/Neptune.g:225:122: ( LPAREN ( expression ( COMMA expression )* )? RPAREN -> ^( FUNCTION IDENTIFIER ( ^( ARRAY_SET ( expression )+ ) )? ) )
							// antlr/Neptune.g:225:123: LPAREN ( expression ( COMMA expression )* )? RPAREN
							{
							LPAREN127=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_operand1845);  
							stream_LPAREN.add(LPAREN127);

							// antlr/Neptune.g:225:130: ( expression ( COMMA expression )* )?
							int alt23=2;
							int LA23_0 = input.LA(1);
							if ( (LA23_0==CHAR_LITERAL||LA23_0==FALSE||LA23_0==IDENTIFIER||(LA23_0 >= LBRACKET && LA23_0 <= LCURLY)||LA23_0==LPAREN||LA23_0==MINUS||LA23_0==NEGATE||LA23_0==NUMBER||(LA23_0 >= PLUS && LA23_0 <= PRINT)||LA23_0==READ||(LA23_0 >= SIZEOF && LA23_0 <= STRING_LITERAL)||LA23_0==TRUE) ) {
								alt23=1;
							}
							switch (alt23) {
								case 1 :
									// antlr/Neptune.g:225:131: expression ( COMMA expression )*
									{
									pushFollow(FOLLOW_expression_in_operand1848);
									expression128=expression();
									state._fsp--;

									stream_expression.add(expression128.getTree());
									// antlr/Neptune.g:225:142: ( COMMA expression )*
									loop22:
									while (true) {
										int alt22=2;
										int LA22_0 = input.LA(1);
										if ( (LA22_0==COMMA) ) {
											alt22=1;
										}

										switch (alt22) {
										case 1 :
											// antlr/Neptune.g:225:143: COMMA expression
											{
											COMMA129=(Token)match(input,COMMA,FOLLOW_COMMA_in_operand1851);  
											stream_COMMA.add(COMMA129);

											pushFollow(FOLLOW_expression_in_operand1853);
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

							RPAREN131=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_operand1859);  
							stream_RPAREN.add(RPAREN131);

							// AST REWRITE
							// elements: expression, IDENTIFIER
							// token labels: 
							// rule labels: retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (Object)adaptor.nil();
							// 225:171: -> ^( FUNCTION IDENTIFIER ( ^( ARRAY_SET ( expression )+ ) )? )
							{
								// antlr/Neptune.g:225:174: ^( FUNCTION IDENTIFIER ( ^( ARRAY_SET ( expression )+ ) )? )
								{
								Object root_1 = (Object)adaptor.nil();
								root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNCTION, "FUNCTION"), root_1);
								adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
								// antlr/Neptune.g:225:196: ( ^( ARRAY_SET ( expression )+ ) )?
								if ( stream_expression.hasNext() ) {
									// antlr/Neptune.g:225:196: ^( ARRAY_SET ( expression )+ )
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
					// antlr/Neptune.g:226:9: NUMBER
					{
					root_0 = (Object)adaptor.nil();


					NUMBER132=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_operand1887); 
					NUMBER132_tree = (Object)adaptor.create(NUMBER132);
					adaptor.addChild(root_0, NUMBER132_tree);

					}
					break;
				case 3 :
					// antlr/Neptune.g:227:9: LPAREN ! assignment_expr RPAREN !
					{
					root_0 = (Object)adaptor.nil();


					LPAREN133=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_operand1897); 
					pushFollow(FOLLOW_assignment_expr_in_operand1900);
					assignment_expr134=assignment_expr();
					state._fsp--;

					adaptor.addChild(root_0, assignment_expr134.getTree());

					RPAREN135=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_operand1902); 
					}
					break;
				case 4 :
					// antlr/Neptune.g:228:4: LBRACKET expression ( COMMA expression )* RBRACKET
					{
					LBRACKET136=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_operand1908);  
					stream_LBRACKET.add(LBRACKET136);

					pushFollow(FOLLOW_expression_in_operand1910);
					expression137=expression();
					state._fsp--;

					stream_expression.add(expression137.getTree());
					// antlr/Neptune.g:228:24: ( COMMA expression )*
					loop25:
					while (true) {
						int alt25=2;
						int LA25_0 = input.LA(1);
						if ( (LA25_0==COMMA) ) {
							alt25=1;
						}

						switch (alt25) {
						case 1 :
							// antlr/Neptune.g:228:25: COMMA expression
							{
							COMMA138=(Token)match(input,COMMA,FOLLOW_COMMA_in_operand1913);  
							stream_COMMA.add(COMMA138);

							pushFollow(FOLLOW_expression_in_operand1915);
							expression139=expression();
							state._fsp--;

							stream_expression.add(expression139.getTree());
							}
							break;

						default :
							break loop25;
						}
					}

					RBRACKET140=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_operand1919);  
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
					// 229:3: -> ^( ARRAY_SET ( expression )+ )
					{
						// antlr/Neptune.g:229:6: ^( ARRAY_SET ( expression )+ )
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
					// antlr/Neptune.g:230:4: print_statement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_print_statement_in_operand1935);
					print_statement141=print_statement();
					state._fsp--;

					adaptor.addChild(root_0, print_statement141.getTree());

					}
					break;
				case 6 :
					// antlr/Neptune.g:231:4: read_statement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_read_statement_in_operand1940);
					read_statement142=read_statement();
					state._fsp--;

					adaptor.addChild(root_0, read_statement142.getTree());

					}
					break;
				case 7 :
					// antlr/Neptune.g:232:4: SIZEOF ^ LPAREN ! IDENTIFIER RPAREN !
					{
					root_0 = (Object)adaptor.nil();


					SIZEOF143=(Token)match(input,SIZEOF,FOLLOW_SIZEOF_in_operand1945); 
					SIZEOF143_tree = (Object)adaptor.create(SIZEOF143);
					root_0 = (Object)adaptor.becomeRoot(SIZEOF143_tree, root_0);

					LPAREN144=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_operand1948); 
					IDENTIFIER145=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_operand1951); 
					IDENTIFIER145_tree = (Object)adaptor.create(IDENTIFIER145);
					adaptor.addChild(root_0, IDENTIFIER145_tree);

					RPAREN146=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_operand1953); 
					}
					break;
				case 8 :
					// antlr/Neptune.g:233:4: ( TRUE | FALSE )
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
					// antlr/Neptune.g:234:4: CHAR_LITERAL
					{
					root_0 = (Object)adaptor.nil();


					CHAR_LITERAL148=(Token)match(input,CHAR_LITERAL,FOLLOW_CHAR_LITERAL_in_operand1970); 
					CHAR_LITERAL148_tree = (Object)adaptor.create(CHAR_LITERAL148);
					adaptor.addChild(root_0, CHAR_LITERAL148_tree);

					}
					break;
				case 10 :
					// antlr/Neptune.g:235:4: STRING_LITERAL
					{
					root_0 = (Object)adaptor.nil();


					STRING_LITERAL149=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_operand1975); 
					STRING_LITERAL149_tree = (Object)adaptor.create(STRING_LITERAL149);
					adaptor.addChild(root_0, STRING_LITERAL149_tree);

					}
					break;
				case 11 :
					// antlr/Neptune.g:236:4: codeblock
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_codeblock_in_operand1980);
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
	// antlr/Neptune.g:239:1: type : ( INTEGER ( array_def )? | CHAR ( array_def )? | BOOLEAN ( array_def )? );
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
			// antlr/Neptune.g:240:2: ( INTEGER ( array_def )? | CHAR ( array_def )? | BOOLEAN ( array_def )? )
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
					// antlr/Neptune.g:240:4: INTEGER ( array_def )?
					{
					root_0 = (Object)adaptor.nil();


					INTEGER151=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_type1994); 
					INTEGER151_tree = (Object)adaptor.create(INTEGER151);
					adaptor.addChild(root_0, INTEGER151_tree);

					// antlr/Neptune.g:240:12: ( array_def )?
					int alt27=2;
					int LA27_0 = input.LA(1);
					if ( (LA27_0==LBRACKET) ) {
						alt27=1;
					}
					switch (alt27) {
						case 1 :
							// antlr/Neptune.g:240:12: array_def
							{
							pushFollow(FOLLOW_array_def_in_type1996);
							array_def152=array_def();
							state._fsp--;

							adaptor.addChild(root_0, array_def152.getTree());

							}
							break;

					}

					}
					break;
				case 2 :
					// antlr/Neptune.g:241:4: CHAR ( array_def )?
					{
					root_0 = (Object)adaptor.nil();


					CHAR153=(Token)match(input,CHAR,FOLLOW_CHAR_in_type2002); 
					CHAR153_tree = (Object)adaptor.create(CHAR153);
					adaptor.addChild(root_0, CHAR153_tree);

					// antlr/Neptune.g:241:9: ( array_def )?
					int alt28=2;
					int LA28_0 = input.LA(1);
					if ( (LA28_0==LBRACKET) ) {
						alt28=1;
					}
					switch (alt28) {
						case 1 :
							// antlr/Neptune.g:241:9: array_def
							{
							pushFollow(FOLLOW_array_def_in_type2004);
							array_def154=array_def();
							state._fsp--;

							adaptor.addChild(root_0, array_def154.getTree());

							}
							break;

					}

					}
					break;
				case 3 :
					// antlr/Neptune.g:242:4: BOOLEAN ( array_def )?
					{
					root_0 = (Object)adaptor.nil();


					BOOLEAN155=(Token)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_type2010); 
					BOOLEAN155_tree = (Object)adaptor.create(BOOLEAN155);
					adaptor.addChild(root_0, BOOLEAN155_tree);

					// antlr/Neptune.g:242:12: ( array_def )?
					int alt29=2;
					int LA29_0 = input.LA(1);
					if ( (LA29_0==LBRACKET) ) {
						alt29=1;
					}
					switch (alt29) {
						case 1 :
							// antlr/Neptune.g:242:12: array_def
							{
							pushFollow(FOLLOW_array_def_in_type2012);
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
	// antlr/Neptune.g:245:1: array_def : LBRACKET NUMBER RBRACKET -> ^( ARRAY_DEF NUMBER ) ;
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
			// antlr/Neptune.g:246:2: ( LBRACKET NUMBER RBRACKET -> ^( ARRAY_DEF NUMBER ) )
			// antlr/Neptune.g:246:5: LBRACKET NUMBER RBRACKET
			{
			LBRACKET157=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_array_def2026);  
			stream_LBRACKET.add(LBRACKET157);

			NUMBER158=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_array_def2028);  
			stream_NUMBER.add(NUMBER158);

			RBRACKET159=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_array_def2030);  
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
			// 247:3: -> ^( ARRAY_DEF NUMBER )
			{
				// antlr/Neptune.g:247:6: ^( ARRAY_DEF NUMBER )
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
	public static final BitSet FOLLOW_line_in_lines1163 = new BitSet(new long[]{0x4CC3549D9C023802L,0x0000000000000008L});
	public static final BitSet FOLLOW_expression_in_line1176 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_line1178 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declaration_in_line1184 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_line1186 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_logic_statement_in_line1192 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_return_statement_in_line1197 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LCURLY_in_codeblock1209 = new BitSet(new long[]{0x4CC3549D9C023800L,0x0000000000000008L});
	public static final BitSet FOLLOW_lines_in_codeblock1211 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_RCURLY_in_codeblock1213 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_while_statement_in_logic_statement1235 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_foreach_statement_in_logic_statement1240 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_if_statement_in_logic_statement1245 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHILE_in_while_statement1259 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_LPAREN_in_while_statement1262 = new BitSet(new long[]{0x4C43549884002000L});
	public static final BitSet FOLLOW_expression_in_while_statement1265 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_while_statement1267 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_LCURLY_in_while_statement1270 = new BitSet(new long[]{0x4CC3549D9C023800L,0x0000000000000008L});
	public static final BitSet FOLLOW_lines_in_while_statement1273 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_RCURLY_in_while_statement1275 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FOREACH_in_foreach_statement1288 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_LPAREN_in_foreach_statement1291 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_foreach_statement1294 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_IN_in_foreach_statement1296 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_foreach_statement1299 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_foreach_statement1301 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_LCURLY_in_foreach_statement1304 = new BitSet(new long[]{0x4CC3549D9C023800L,0x0000000000000008L});
	public static final BitSet FOLLOW_lines_in_foreach_statement1307 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_RCURLY_in_foreach_statement1309 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_if_statement1322 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_LPAREN_in_if_statement1325 = new BitSet(new long[]{0x4C43549884002000L});
	public static final BitSet FOLLOW_expression_in_if_statement1328 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_if_statement1330 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_LCURLY_in_if_statement1333 = new BitSet(new long[]{0x4CC3549D9C023800L,0x0000000000000008L});
	public static final BitSet FOLLOW_lines_in_if_statement1336 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_RCURLY_in_if_statement1338 = new BitSet(new long[]{0x0000000001800002L});
	public static final BitSet FOLLOW_ELSIF_in_if_statement1344 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_LPAREN_in_if_statement1346 = new BitSet(new long[]{0x4C43549884002000L});
	public static final BitSet FOLLOW_expression_in_if_statement1349 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_if_statement1351 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_LCURLY_in_if_statement1354 = new BitSet(new long[]{0x4CC3549D9C023800L,0x0000000000000008L});
	public static final BitSet FOLLOW_lines_in_if_statement1357 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_RCURLY_in_if_statement1359 = new BitSet(new long[]{0x0000000001800002L});
	public static final BitSet FOLLOW_ELSE_in_if_statement1367 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_LCURLY_in_if_statement1369 = new BitSet(new long[]{0x4CC3549D9C023800L,0x0000000000000008L});
	public static final BitSet FOLLOW_lines_in_if_statement1372 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_RCURLY_in_if_statement1374 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRINT_in_print_statement1389 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_LPAREN_in_print_statement1392 = new BitSet(new long[]{0x4C43549884002000L});
	public static final BitSet FOLLOW_expression_in_print_statement1395 = new BitSet(new long[]{0x0100000000008000L});
	public static final BitSet FOLLOW_COMMA_in_print_statement1398 = new BitSet(new long[]{0x4C43549884002000L});
	public static final BitSet FOLLOW_expression_in_print_statement1401 = new BitSet(new long[]{0x0100000000008000L});
	public static final BitSet FOLLOW_RPAREN_in_print_statement1405 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_READ_in_read_statement1418 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_LPAREN_in_read_statement1421 = new BitSet(new long[]{0x4C43549884002000L});
	public static final BitSet FOLLOW_expression_in_read_statement1424 = new BitSet(new long[]{0x0100000000008000L});
	public static final BitSet FOLLOW_COMMA_in_read_statement1427 = new BitSet(new long[]{0x4C43549884002000L});
	public static final BitSet FOLLOW_expression_in_read_statement1430 = new BitSet(new long[]{0x0100000000008000L});
	public static final BitSet FOLLOW_RPAREN_in_read_statement1434 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_declaration1447 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_declaration1449 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_BECOMES_in_declaration1452 = new BitSet(new long[]{0x4C43549884002000L});
	public static final BitSet FOLLOW_expression_in_declaration1454 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CONST_in_declaration1480 = new BitSet(new long[]{0x0000000400001800L});
	public static final BitSet FOLLOW_type_in_declaration1483 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_declaration1485 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_BECOMES_in_declaration1487 = new BitSet(new long[]{0x4C43549884002000L});
	public static final BitSet FOLLOW_expression_in_declaration1489 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FUNCTION_in_declaration1496 = new BitSet(new long[]{0x0000000400001800L});
	public static final BitSet FOLLOW_type_in_declaration1498 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_declaration1500 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_LPAREN_in_declaration1502 = new BitSet(new long[]{0x0000000400001800L});
	public static final BitSet FOLLOW_type_in_declaration1504 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_declaration1506 = new BitSet(new long[]{0x0100000000008000L});
	public static final BitSet FOLLOW_COMMA_in_declaration1509 = new BitSet(new long[]{0x0000000400001800L});
	public static final BitSet FOLLOW_type_in_declaration1511 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_declaration1513 = new BitSet(new long[]{0x0100000000008000L});
	public static final BitSet FOLLOW_RPAREN_in_declaration1517 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_LCURLY_in_declaration1519 = new BitSet(new long[]{0x4CC3549D9C023800L,0x0000000000000008L});
	public static final BitSet FOLLOW_line_in_declaration1521 = new BitSet(new long[]{0x4CE3549D9C023800L,0x0000000000000008L});
	public static final BitSet FOLLOW_RCURLY_in_declaration1524 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RETURN_in_return_statement1557 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_LPAREN_in_return_statement1560 = new BitSet(new long[]{0x4C43549884002000L});
	public static final BitSet FOLLOW_expression_in_return_statement1563 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_return_statement1565 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_return_statement1568 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignment_expr_in_expression1581 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_or_expr_in_assignment_expr1593 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_BECOMES_in_assignment_expr1596 = new BitSet(new long[]{0x4C43549884002000L});
	public static final BitSet FOLLOW_assignment_expr_in_assignment_expr1599 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_and_expr_in_or_expr1613 = new BitSet(new long[]{0x0000800000000002L});
	public static final BitSet FOLLOW_OR_in_or_expr1616 = new BitSet(new long[]{0x4C43549884002000L});
	public static final BitSet FOLLOW_and_expr_in_or_expr1619 = new BitSet(new long[]{0x0000800000000002L});
	public static final BitSet FOLLOW_boolean_expr_in_and_expr1633 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_AND_in_and_expr1636 = new BitSet(new long[]{0x4C43549884002000L});
	public static final BitSet FOLLOW_boolean_expr_in_and_expr1639 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_plus_expr_in_boolean_expr1653 = new BitSet(new long[]{0x0000230062000002L});
	public static final BitSet FOLLOW_LT_in_boolean_expr1657 = new BitSet(new long[]{0x4C43549884002000L});
	public static final BitSet FOLLOW_LT_EQ_in_boolean_expr1662 = new BitSet(new long[]{0x4C43549884002000L});
	public static final BitSet FOLLOW_GT_in_boolean_expr1667 = new BitSet(new long[]{0x4C43549884002000L});
	public static final BitSet FOLLOW_GT_EQ_in_boolean_expr1672 = new BitSet(new long[]{0x4C43549884002000L});
	public static final BitSet FOLLOW_EQ_in_boolean_expr1677 = new BitSet(new long[]{0x4C43549884002000L});
	public static final BitSet FOLLOW_NEQ_in_boolean_expr1682 = new BitSet(new long[]{0x4C43549884002000L});
	public static final BitSet FOLLOW_plus_expr_in_boolean_expr1686 = new BitSet(new long[]{0x0000230062000002L});
	public static final BitSet FOLLOW_multi_expr_in_plus_expr1699 = new BitSet(new long[]{0x0001040000000002L});
	public static final BitSet FOLLOW_PLUS_in_plus_expr1703 = new BitSet(new long[]{0x4C43549884002000L});
	public static final BitSet FOLLOW_MINUS_in_plus_expr1708 = new BitSet(new long[]{0x4C43549884002000L});
	public static final BitSet FOLLOW_multi_expr_in_plus_expr1712 = new BitSet(new long[]{0x0001040000000002L});
	public static final BitSet FOLLOW_unary_expr_in_multi_expr1725 = new BitSet(new long[]{0x2000080000080002L});
	public static final BitSet FOLLOW_TIMES_in_multi_expr1729 = new BitSet(new long[]{0x4C43549884002000L});
	public static final BitSet FOLLOW_DIVIDE_in_multi_expr1734 = new BitSet(new long[]{0x4C43549884002000L});
	public static final BitSet FOLLOW_MOD_in_multi_expr1739 = new BitSet(new long[]{0x4C43549884002000L});
	public static final BitSet FOLLOW_unary_expr_in_multi_expr1743 = new BitSet(new long[]{0x2000080000080002L});
	public static final BitSet FOLLOW_operand_in_unary_expr1757 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MINUS_in_unary_expr1762 = new BitSet(new long[]{0x4C42409884002000L});
	public static final BitSet FOLLOW_operand_in_unary_expr1764 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PLUS_in_unary_expr1777 = new BitSet(new long[]{0x4C42409884002000L});
	public static final BitSet FOLLOW_operand_in_unary_expr1779 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NEGATE_in_unary_expr1792 = new BitSet(new long[]{0x4C42409884002000L});
	public static final BitSet FOLLOW_operand_in_unary_expr1795 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_operand1811 = new BitSet(new long[]{0x0000008800000002L});
	public static final BitSet FOLLOW_LBRACKET_in_operand1825 = new BitSet(new long[]{0x4C43549884002000L});
	public static final BitSet FOLLOW_expression_in_operand1827 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_RBRACKET_in_operand1829 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_operand1845 = new BitSet(new long[]{0x4D43549884002000L});
	public static final BitSet FOLLOW_expression_in_operand1848 = new BitSet(new long[]{0x0100000000008000L});
	public static final BitSet FOLLOW_COMMA_in_operand1851 = new BitSet(new long[]{0x4C43549884002000L});
	public static final BitSet FOLLOW_expression_in_operand1853 = new BitSet(new long[]{0x0100000000008000L});
	public static final BitSet FOLLOW_RPAREN_in_operand1859 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMBER_in_operand1887 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_operand1897 = new BitSet(new long[]{0x4C43549884002000L});
	public static final BitSet FOLLOW_assignment_expr_in_operand1900 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_operand1902 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACKET_in_operand1908 = new BitSet(new long[]{0x4C43549884002000L});
	public static final BitSet FOLLOW_expression_in_operand1910 = new BitSet(new long[]{0x0010000000008000L});
	public static final BitSet FOLLOW_COMMA_in_operand1913 = new BitSet(new long[]{0x4C43549884002000L});
	public static final BitSet FOLLOW_expression_in_operand1915 = new BitSet(new long[]{0x0010000000008000L});
	public static final BitSet FOLLOW_RBRACKET_in_operand1919 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_print_statement_in_operand1935 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_read_statement_in_operand1940 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SIZEOF_in_operand1945 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_LPAREN_in_operand1948 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_operand1951 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_operand1953 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_operand1959 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_LITERAL_in_operand1970 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_operand1975 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_codeblock_in_operand1980 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTEGER_in_type1994 = new BitSet(new long[]{0x0000000800000002L});
	public static final BitSet FOLLOW_array_def_in_type1996 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_in_type2002 = new BitSet(new long[]{0x0000000800000002L});
	public static final BitSet FOLLOW_array_def_in_type2004 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOLEAN_in_type2010 = new BitSet(new long[]{0x0000000800000002L});
	public static final BitSet FOLLOW_array_def_in_type2012 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACKET_in_array_def2026 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_NUMBER_in_array_def2028 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_RBRACKET_in_array_def2030 = new BitSet(new long[]{0x0000000000000002L});
}

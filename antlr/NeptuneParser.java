// $ANTLR 3.5.2 antlr/Neptune.g 2014-06-30 22:06:16

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
		"BECOMES", "BLOCK", "BOOLEAN", "CHAR", "CHAR_LITERAL", "COLON", "COMMA", 
		"COMMENT", "CONST", "DIGIT", "DIVIDE", "DO", "DQUOTE", "DROPIN_STATEMENT", 
		"ELSE", "ELSIF", "EQ", "FALSE", "FOREACH", "FUNCTION", "GT", "GT_EQ", 
		"IDENTIFIER", "IF", "IN", "INTEGER", "LBRACKET", "LCURLY", "LETTER", "LOWER", 
		"LPAREN", "LT", "LT_EQ", "MINUS", "MOD", "NEGATE", "NEQ", "NUMBER", "OR", 
		"PLUS", "PRINT", "PROGRAM", "QUOTE", "RBRACKET", "RCURLY", "READ", "RETURN", 
		"RPAREN", "SEMICOLON", "STRING_LITERAL", "THEN", "TIMES", "TRUE", "UNARY_MINUS", 
		"UNARY_PLUS", "UPPER", "VAR", "WHILE", "WS"
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
	public static final int STRING_LITERAL=56;
	public static final int THEN=57;
	public static final int TIMES=58;
	public static final int TRUE=59;
	public static final int UNARY_MINUS=60;
	public static final int UNARY_PLUS=61;
	public static final int UPPER=62;
	public static final int VAR=63;
	public static final int WHILE=64;
	public static final int WS=65;

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
	// antlr/Neptune.g:123:1: program : lines EOF -> ^( PROGRAM lines ) ;
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
			// antlr/Neptune.g:124:5: ( lines EOF -> ^( PROGRAM lines ) )
			// antlr/Neptune.g:124:9: lines EOF
			{
			pushFollow(FOLLOW_lines_in_program1098);
			lines1=lines();
			state._fsp--;

			stream_lines.add(lines1.getTree());
			EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_program1100);  
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
			// 125:13: -> ^( PROGRAM lines )
			{
				// antlr/Neptune.g:125:17: ^( PROGRAM lines )
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
	// antlr/Neptune.g:128:1: lines : ( line )+ ;
	public final NeptuneParser.lines_return lines() throws RecognitionException {
		NeptuneParser.lines_return retval = new NeptuneParser.lines_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope line3 =null;


		try {
			// antlr/Neptune.g:129:2: ( ( line )+ )
			// antlr/Neptune.g:129:4: ( line )+
			{
			root_0 = (Object)adaptor.nil();


			// antlr/Neptune.g:129:4: ( line )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= BOOLEAN && LA1_0 <= CHAR_LITERAL)||LA1_0==CONST||(LA1_0 >= FALSE && LA1_0 <= FOREACH)||(LA1_0 >= IDENTIFIER && LA1_0 <= IF)||(LA1_0 >= INTEGER && LA1_0 <= LCURLY)||LA1_0==LPAREN||LA1_0==MINUS||LA1_0==NEGATE||LA1_0==NUMBER||(LA1_0 >= PLUS && LA1_0 <= PRINT)||LA1_0==READ||LA1_0==STRING_LITERAL||LA1_0==TRUE||LA1_0==WHILE) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// antlr/Neptune.g:129:4: line
					{
					pushFollow(FOLLOW_line_in_lines1135);
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
	// antlr/Neptune.g:132:1: line : ( expression SEMICOLON !| declaration SEMICOLON !| logic_statement );
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
			// antlr/Neptune.g:133:2: ( expression SEMICOLON !| declaration SEMICOLON !| logic_statement )
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
			case STRING_LITERAL:
			case TRUE:
				{
				alt2=1;
				}
				break;
			case BOOLEAN:
			case CHAR:
			case CONST:
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
					// antlr/Neptune.g:133:4: expression SEMICOLON !
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_expression_in_line1148);
					expression4=expression();
					state._fsp--;

					adaptor.addChild(root_0, expression4.getTree());

					SEMICOLON5=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_line1150); 
					}
					break;
				case 2 :
					// antlr/Neptune.g:134:4: declaration SEMICOLON !
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_declaration_in_line1156);
					declaration6=declaration();
					state._fsp--;

					adaptor.addChild(root_0, declaration6.getTree());

					SEMICOLON7=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_line1158); 
					}
					break;
				case 3 :
					// antlr/Neptune.g:135:4: logic_statement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_logic_statement_in_line1164);
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
	// antlr/Neptune.g:138:1: codeblock : LCURLY lines RCURLY -> ^( BLOCK lines ) ;
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
			// antlr/Neptune.g:139:2: ( LCURLY lines RCURLY -> ^( BLOCK lines ) )
			// antlr/Neptune.g:139:4: LCURLY lines RCURLY
			{
			LCURLY9=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_codeblock1176);  
			stream_LCURLY.add(LCURLY9);

			pushFollow(FOLLOW_lines_in_codeblock1178);
			lines10=lines();
			state._fsp--;

			stream_lines.add(lines10.getTree());
			RCURLY11=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_codeblock1180);  
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
			// 140:3: -> ^( BLOCK lines )
			{
				// antlr/Neptune.g:140:6: ^( BLOCK lines )
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
	// antlr/Neptune.g:143:1: logic_statement : ( while_statement | foreach_statement | if_statement );
	public final NeptuneParser.logic_statement_return logic_statement() throws RecognitionException {
		NeptuneParser.logic_statement_return retval = new NeptuneParser.logic_statement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope while_statement12 =null;
		ParserRuleReturnScope foreach_statement13 =null;
		ParserRuleReturnScope if_statement14 =null;


		try {
			// antlr/Neptune.g:144:2: ( while_statement | foreach_statement | if_statement )
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
					// antlr/Neptune.g:144:4: while_statement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_while_statement_in_logic_statement1202);
					while_statement12=while_statement();
					state._fsp--;

					adaptor.addChild(root_0, while_statement12.getTree());

					}
					break;
				case 2 :
					// antlr/Neptune.g:145:4: foreach_statement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_foreach_statement_in_logic_statement1207);
					foreach_statement13=foreach_statement();
					state._fsp--;

					adaptor.addChild(root_0, foreach_statement13.getTree());

					}
					break;
				case 3 :
					// antlr/Neptune.g:146:4: if_statement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_if_statement_in_logic_statement1212);
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
	// antlr/Neptune.g:149:1: while_statement : WHILE ^ LPAREN ! expression RPAREN ! LCURLY ! lines RCURLY !;
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
			// antlr/Neptune.g:150:2: ( WHILE ^ LPAREN ! expression RPAREN ! LCURLY ! lines RCURLY !)
			// antlr/Neptune.g:150:4: WHILE ^ LPAREN ! expression RPAREN ! LCURLY ! lines RCURLY !
			{
			root_0 = (Object)adaptor.nil();


			WHILE15=(Token)match(input,WHILE,FOLLOW_WHILE_in_while_statement1224); 
			WHILE15_tree = (Object)adaptor.create(WHILE15);
			root_0 = (Object)adaptor.becomeRoot(WHILE15_tree, root_0);

			LPAREN16=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_while_statement1227); 
			pushFollow(FOLLOW_expression_in_while_statement1230);
			expression17=expression();
			state._fsp--;

			adaptor.addChild(root_0, expression17.getTree());

			RPAREN18=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_while_statement1232); 
			LCURLY19=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_while_statement1235); 
			pushFollow(FOLLOW_lines_in_while_statement1238);
			lines20=lines();
			state._fsp--;

			adaptor.addChild(root_0, lines20.getTree());

			RCURLY21=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_while_statement1240); 
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
	// antlr/Neptune.g:153:1: foreach_statement : FOREACH ^ LPAREN ! IDENTIFIER IN ! IDENTIFIER RPAREN ! LCURLY ! lines RCURLY !;
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
			// antlr/Neptune.g:154:2: ( FOREACH ^ LPAREN ! IDENTIFIER IN ! IDENTIFIER RPAREN ! LCURLY ! lines RCURLY !)
			// antlr/Neptune.g:154:4: FOREACH ^ LPAREN ! IDENTIFIER IN ! IDENTIFIER RPAREN ! LCURLY ! lines RCURLY !
			{
			root_0 = (Object)adaptor.nil();


			FOREACH22=(Token)match(input,FOREACH,FOLLOW_FOREACH_in_foreach_statement1253); 
			FOREACH22_tree = (Object)adaptor.create(FOREACH22);
			root_0 = (Object)adaptor.becomeRoot(FOREACH22_tree, root_0);

			LPAREN23=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_foreach_statement1256); 
			IDENTIFIER24=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_foreach_statement1259); 
			IDENTIFIER24_tree = (Object)adaptor.create(IDENTIFIER24);
			adaptor.addChild(root_0, IDENTIFIER24_tree);

			IN25=(Token)match(input,IN,FOLLOW_IN_in_foreach_statement1261); 
			IDENTIFIER26=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_foreach_statement1264); 
			IDENTIFIER26_tree = (Object)adaptor.create(IDENTIFIER26);
			adaptor.addChild(root_0, IDENTIFIER26_tree);

			RPAREN27=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_foreach_statement1266); 
			LCURLY28=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_foreach_statement1269); 
			pushFollow(FOLLOW_lines_in_foreach_statement1272);
			lines29=lines();
			state._fsp--;

			adaptor.addChild(root_0, lines29.getTree());

			RCURLY30=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_foreach_statement1274); 
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
	// antlr/Neptune.g:157:1: if_statement : IF ^ LPAREN ! expression RPAREN ! LCURLY ! lines RCURLY ! ( ELSIF LPAREN ! expression RPAREN ! LCURLY ! lines RCURLY !)* ( ELSE LCURLY ! lines RCURLY !)? ;
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
			// antlr/Neptune.g:158:2: ( IF ^ LPAREN ! expression RPAREN ! LCURLY ! lines RCURLY ! ( ELSIF LPAREN ! expression RPAREN ! LCURLY ! lines RCURLY !)* ( ELSE LCURLY ! lines RCURLY !)? )
			// antlr/Neptune.g:158:4: IF ^ LPAREN ! expression RPAREN ! LCURLY ! lines RCURLY ! ( ELSIF LPAREN ! expression RPAREN ! LCURLY ! lines RCURLY !)* ( ELSE LCURLY ! lines RCURLY !)?
			{
			root_0 = (Object)adaptor.nil();


			IF31=(Token)match(input,IF,FOLLOW_IF_in_if_statement1287); 
			IF31_tree = (Object)adaptor.create(IF31);
			root_0 = (Object)adaptor.becomeRoot(IF31_tree, root_0);

			LPAREN32=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_if_statement1290); 
			pushFollow(FOLLOW_expression_in_if_statement1293);
			expression33=expression();
			state._fsp--;

			adaptor.addChild(root_0, expression33.getTree());

			RPAREN34=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_if_statement1295); 
			LCURLY35=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_if_statement1298); 
			pushFollow(FOLLOW_lines_in_if_statement1301);
			lines36=lines();
			state._fsp--;

			adaptor.addChild(root_0, lines36.getTree());

			RCURLY37=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_if_statement1303); 
			// antlr/Neptune.g:159:3: ( ELSIF LPAREN ! expression RPAREN ! LCURLY ! lines RCURLY !)*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==ELSIF) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// antlr/Neptune.g:159:4: ELSIF LPAREN ! expression RPAREN ! LCURLY ! lines RCURLY !
					{
					ELSIF38=(Token)match(input,ELSIF,FOLLOW_ELSIF_in_if_statement1309); 
					ELSIF38_tree = (Object)adaptor.create(ELSIF38);
					adaptor.addChild(root_0, ELSIF38_tree);

					LPAREN39=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_if_statement1311); 
					pushFollow(FOLLOW_expression_in_if_statement1314);
					expression40=expression();
					state._fsp--;

					adaptor.addChild(root_0, expression40.getTree());

					RPAREN41=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_if_statement1316); 
					LCURLY42=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_if_statement1319); 
					pushFollow(FOLLOW_lines_in_if_statement1322);
					lines43=lines();
					state._fsp--;

					adaptor.addChild(root_0, lines43.getTree());

					RCURLY44=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_if_statement1324); 
					}
					break;

				default :
					break loop4;
				}
			}

			// antlr/Neptune.g:160:3: ( ELSE LCURLY ! lines RCURLY !)?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==ELSE) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// antlr/Neptune.g:160:4: ELSE LCURLY ! lines RCURLY !
					{
					ELSE45=(Token)match(input,ELSE,FOLLOW_ELSE_in_if_statement1332); 
					ELSE45_tree = (Object)adaptor.create(ELSE45);
					adaptor.addChild(root_0, ELSE45_tree);

					LCURLY46=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_if_statement1334); 
					pushFollow(FOLLOW_lines_in_if_statement1337);
					lines47=lines();
					state._fsp--;

					adaptor.addChild(root_0, lines47.getTree());

					RCURLY48=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_if_statement1339); 
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
	// antlr/Neptune.g:163:1: print_statement : PRINT ^ LPAREN ! expression ( COMMA expression )* RPAREN !;
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
			// antlr/Neptune.g:164:2: ( PRINT ^ LPAREN ! expression ( COMMA expression )* RPAREN !)
			// antlr/Neptune.g:164:4: PRINT ^ LPAREN ! expression ( COMMA expression )* RPAREN !
			{
			root_0 = (Object)adaptor.nil();


			PRINT49=(Token)match(input,PRINT,FOLLOW_PRINT_in_print_statement1354); 
			PRINT49_tree = (Object)adaptor.create(PRINT49);
			root_0 = (Object)adaptor.becomeRoot(PRINT49_tree, root_0);

			LPAREN50=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_print_statement1357); 
			pushFollow(FOLLOW_expression_in_print_statement1360);
			expression51=expression();
			state._fsp--;

			adaptor.addChild(root_0, expression51.getTree());

			// antlr/Neptune.g:164:30: ( COMMA expression )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==COMMA) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// antlr/Neptune.g:164:31: COMMA expression
					{
					COMMA52=(Token)match(input,COMMA,FOLLOW_COMMA_in_print_statement1363); 
					COMMA52_tree = (Object)adaptor.create(COMMA52);
					adaptor.addChild(root_0, COMMA52_tree);

					pushFollow(FOLLOW_expression_in_print_statement1365);
					expression53=expression();
					state._fsp--;

					adaptor.addChild(root_0, expression53.getTree());

					}
					break;

				default :
					break loop6;
				}
			}

			RPAREN54=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_print_statement1369); 
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
	// antlr/Neptune.g:167:1: read_statement : READ ^ LPAREN ! expression ( COMMA expression )* RPAREN !;
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
			// antlr/Neptune.g:168:2: ( READ ^ LPAREN ! expression ( COMMA expression )* RPAREN !)
			// antlr/Neptune.g:168:4: READ ^ LPAREN ! expression ( COMMA expression )* RPAREN !
			{
			root_0 = (Object)adaptor.nil();


			READ55=(Token)match(input,READ,FOLLOW_READ_in_read_statement1382); 
			READ55_tree = (Object)adaptor.create(READ55);
			root_0 = (Object)adaptor.becomeRoot(READ55_tree, root_0);

			LPAREN56=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_read_statement1385); 
			pushFollow(FOLLOW_expression_in_read_statement1388);
			expression57=expression();
			state._fsp--;

			adaptor.addChild(root_0, expression57.getTree());

			// antlr/Neptune.g:168:29: ( COMMA expression )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==COMMA) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// antlr/Neptune.g:168:30: COMMA expression
					{
					COMMA58=(Token)match(input,COMMA,FOLLOW_COMMA_in_read_statement1391); 
					COMMA58_tree = (Object)adaptor.create(COMMA58);
					adaptor.addChild(root_0, COMMA58_tree);

					pushFollow(FOLLOW_expression_in_read_statement1393);
					expression59=expression();
					state._fsp--;

					adaptor.addChild(root_0, expression59.getTree());

					}
					break;

				default :
					break loop7;
				}
			}

			RPAREN60=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_read_statement1397); 
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
	// antlr/Neptune.g:171:1: declaration : ( type IDENTIFIER ( BECOMES expression )? -> ^( VAR type IDENTIFIER ( BECOMES expression )? ) | CONST ^ type IDENTIFIER BECOMES expression );
	public final NeptuneParser.declaration_return declaration() throws RecognitionException {
		NeptuneParser.declaration_return retval = new NeptuneParser.declaration_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IDENTIFIER62=null;
		Token BECOMES63=null;
		Token CONST65=null;
		Token IDENTIFIER67=null;
		Token BECOMES68=null;
		ParserRuleReturnScope type61 =null;
		ParserRuleReturnScope expression64 =null;
		ParserRuleReturnScope type66 =null;
		ParserRuleReturnScope expression69 =null;

		Object IDENTIFIER62_tree=null;
		Object BECOMES63_tree=null;
		Object CONST65_tree=null;
		Object IDENTIFIER67_tree=null;
		Object BECOMES68_tree=null;
		RewriteRuleTokenStream stream_BECOMES=new RewriteRuleTokenStream(adaptor,"token BECOMES");
		RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");

		try {
			// antlr/Neptune.g:172:2: ( type IDENTIFIER ( BECOMES expression )? -> ^( VAR type IDENTIFIER ( BECOMES expression )? ) | CONST ^ type IDENTIFIER BECOMES expression )
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( ((LA9_0 >= BOOLEAN && LA9_0 <= CHAR)||LA9_0==INTEGER) ) {
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
					// antlr/Neptune.g:172:4: type IDENTIFIER ( BECOMES expression )?
					{
					pushFollow(FOLLOW_type_in_declaration1410);
					type61=type();
					state._fsp--;

					stream_type.add(type61.getTree());
					IDENTIFIER62=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_declaration1412);  
					stream_IDENTIFIER.add(IDENTIFIER62);

					// antlr/Neptune.g:172:20: ( BECOMES expression )?
					int alt8=2;
					int LA8_0 = input.LA(1);
					if ( (LA8_0==BECOMES) ) {
						alt8=1;
					}
					switch (alt8) {
						case 1 :
							// antlr/Neptune.g:172:21: BECOMES expression
							{
							BECOMES63=(Token)match(input,BECOMES,FOLLOW_BECOMES_in_declaration1415);  
							stream_BECOMES.add(BECOMES63);

							pushFollow(FOLLOW_expression_in_declaration1417);
							expression64=expression();
							state._fsp--;

							stream_expression.add(expression64.getTree());
							}
							break;

					}

					// AST REWRITE
					// elements: type, BECOMES, expression, IDENTIFIER
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 173:3: -> ^( VAR type IDENTIFIER ( BECOMES expression )? )
					{
						// antlr/Neptune.g:173:6: ^( VAR type IDENTIFIER ( BECOMES expression )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VAR, "VAR"), root_1);
						adaptor.addChild(root_1, stream_type.nextTree());
						adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
						// antlr/Neptune.g:173:28: ( BECOMES expression )?
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
					// antlr/Neptune.g:174:4: CONST ^ type IDENTIFIER BECOMES expression
					{
					root_0 = (Object)adaptor.nil();


					CONST65=(Token)match(input,CONST,FOLLOW_CONST_in_declaration1443); 
					CONST65_tree = (Object)adaptor.create(CONST65);
					root_0 = (Object)adaptor.becomeRoot(CONST65_tree, root_0);

					pushFollow(FOLLOW_type_in_declaration1446);
					type66=type();
					state._fsp--;

					adaptor.addChild(root_0, type66.getTree());

					IDENTIFIER67=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_declaration1448); 
					IDENTIFIER67_tree = (Object)adaptor.create(IDENTIFIER67);
					adaptor.addChild(root_0, IDENTIFIER67_tree);

					BECOMES68=(Token)match(input,BECOMES,FOLLOW_BECOMES_in_declaration1450); 
					BECOMES68_tree = (Object)adaptor.create(BECOMES68);
					adaptor.addChild(root_0, BECOMES68_tree);

					pushFollow(FOLLOW_expression_in_declaration1452);
					expression69=expression();
					state._fsp--;

					adaptor.addChild(root_0, expression69.getTree());

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
	// antlr/Neptune.g:177:1: expression : assignment_expr ;
	public final NeptuneParser.expression_return expression() throws RecognitionException {
		NeptuneParser.expression_return retval = new NeptuneParser.expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope assignment_expr70 =null;


		try {
			// antlr/Neptune.g:178:2: ( assignment_expr )
			// antlr/Neptune.g:178:4: assignment_expr
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_assignment_expr_in_expression1464);
			assignment_expr70=assignment_expr();
			state._fsp--;

			adaptor.addChild(root_0, assignment_expr70.getTree());

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
	// antlr/Neptune.g:181:1: assignment_expr : or_expr ( BECOMES ^ assignment_expr )? ;
	public final NeptuneParser.assignment_expr_return assignment_expr() throws RecognitionException {
		NeptuneParser.assignment_expr_return retval = new NeptuneParser.assignment_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token BECOMES72=null;
		ParserRuleReturnScope or_expr71 =null;
		ParserRuleReturnScope assignment_expr73 =null;

		Object BECOMES72_tree=null;

		try {
			// antlr/Neptune.g:182:2: ( or_expr ( BECOMES ^ assignment_expr )? )
			// antlr/Neptune.g:182:4: or_expr ( BECOMES ^ assignment_expr )?
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_or_expr_in_assignment_expr1475);
			or_expr71=or_expr();
			state._fsp--;

			adaptor.addChild(root_0, or_expr71.getTree());

			// antlr/Neptune.g:182:12: ( BECOMES ^ assignment_expr )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==BECOMES) ) {
				alt10=1;
			}
			switch (alt10) {
				case 1 :
					// antlr/Neptune.g:182:13: BECOMES ^ assignment_expr
					{
					BECOMES72=(Token)match(input,BECOMES,FOLLOW_BECOMES_in_assignment_expr1478); 
					BECOMES72_tree = (Object)adaptor.create(BECOMES72);
					root_0 = (Object)adaptor.becomeRoot(BECOMES72_tree, root_0);

					pushFollow(FOLLOW_assignment_expr_in_assignment_expr1481);
					assignment_expr73=assignment_expr();
					state._fsp--;

					adaptor.addChild(root_0, assignment_expr73.getTree());

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
	// antlr/Neptune.g:185:1: or_expr : and_expr ( OR ^ and_expr )* ;
	public final NeptuneParser.or_expr_return or_expr() throws RecognitionException {
		NeptuneParser.or_expr_return retval = new NeptuneParser.or_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token OR75=null;
		ParserRuleReturnScope and_expr74 =null;
		ParserRuleReturnScope and_expr76 =null;

		Object OR75_tree=null;

		try {
			// antlr/Neptune.g:186:2: ( and_expr ( OR ^ and_expr )* )
			// antlr/Neptune.g:186:4: and_expr ( OR ^ and_expr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_and_expr_in_or_expr1495);
			and_expr74=and_expr();
			state._fsp--;

			adaptor.addChild(root_0, and_expr74.getTree());

			// antlr/Neptune.g:186:13: ( OR ^ and_expr )*
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( (LA11_0==OR) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// antlr/Neptune.g:186:14: OR ^ and_expr
					{
					OR75=(Token)match(input,OR,FOLLOW_OR_in_or_expr1498); 
					OR75_tree = (Object)adaptor.create(OR75);
					root_0 = (Object)adaptor.becomeRoot(OR75_tree, root_0);

					pushFollow(FOLLOW_and_expr_in_or_expr1501);
					and_expr76=and_expr();
					state._fsp--;

					adaptor.addChild(root_0, and_expr76.getTree());

					}
					break;

				default :
					break loop11;
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
	// antlr/Neptune.g:189:1: and_expr : boolean_expr ( AND ^ boolean_expr )* ;
	public final NeptuneParser.and_expr_return and_expr() throws RecognitionException {
		NeptuneParser.and_expr_return retval = new NeptuneParser.and_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token AND78=null;
		ParserRuleReturnScope boolean_expr77 =null;
		ParserRuleReturnScope boolean_expr79 =null;

		Object AND78_tree=null;

		try {
			// antlr/Neptune.g:190:2: ( boolean_expr ( AND ^ boolean_expr )* )
			// antlr/Neptune.g:190:4: boolean_expr ( AND ^ boolean_expr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_boolean_expr_in_and_expr1515);
			boolean_expr77=boolean_expr();
			state._fsp--;

			adaptor.addChild(root_0, boolean_expr77.getTree());

			// antlr/Neptune.g:190:17: ( AND ^ boolean_expr )*
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( (LA12_0==AND) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// antlr/Neptune.g:190:18: AND ^ boolean_expr
					{
					AND78=(Token)match(input,AND,FOLLOW_AND_in_and_expr1518); 
					AND78_tree = (Object)adaptor.create(AND78);
					root_0 = (Object)adaptor.becomeRoot(AND78_tree, root_0);

					pushFollow(FOLLOW_boolean_expr_in_and_expr1521);
					boolean_expr79=boolean_expr();
					state._fsp--;

					adaptor.addChild(root_0, boolean_expr79.getTree());

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
	// $ANTLR end "and_expr"


	public static class boolean_expr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "boolean_expr"
	// antlr/Neptune.g:193:1: boolean_expr : plus_expr ( ( LT ^| LT_EQ ^| GT ^| GT_EQ ^| EQ ^| NEQ ^) plus_expr )* ;
	public final NeptuneParser.boolean_expr_return boolean_expr() throws RecognitionException {
		NeptuneParser.boolean_expr_return retval = new NeptuneParser.boolean_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token LT81=null;
		Token LT_EQ82=null;
		Token GT83=null;
		Token GT_EQ84=null;
		Token EQ85=null;
		Token NEQ86=null;
		ParserRuleReturnScope plus_expr80 =null;
		ParserRuleReturnScope plus_expr87 =null;

		Object LT81_tree=null;
		Object LT_EQ82_tree=null;
		Object GT83_tree=null;
		Object GT_EQ84_tree=null;
		Object EQ85_tree=null;
		Object NEQ86_tree=null;

		try {
			// antlr/Neptune.g:194:2: ( plus_expr ( ( LT ^| LT_EQ ^| GT ^| GT_EQ ^| EQ ^| NEQ ^) plus_expr )* )
			// antlr/Neptune.g:194:4: plus_expr ( ( LT ^| LT_EQ ^| GT ^| GT_EQ ^| EQ ^| NEQ ^) plus_expr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_plus_expr_in_boolean_expr1535);
			plus_expr80=plus_expr();
			state._fsp--;

			adaptor.addChild(root_0, plus_expr80.getTree());

			// antlr/Neptune.g:194:14: ( ( LT ^| LT_EQ ^| GT ^| GT_EQ ^| EQ ^| NEQ ^) plus_expr )*
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( (LA14_0==EQ||(LA14_0 >= GT && LA14_0 <= GT_EQ)||(LA14_0 >= LT && LA14_0 <= LT_EQ)||LA14_0==NEQ) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// antlr/Neptune.g:194:15: ( LT ^| LT_EQ ^| GT ^| GT_EQ ^| EQ ^| NEQ ^) plus_expr
					{
					// antlr/Neptune.g:194:15: ( LT ^| LT_EQ ^| GT ^| GT_EQ ^| EQ ^| NEQ ^)
					int alt13=6;
					switch ( input.LA(1) ) {
					case LT:
						{
						alt13=1;
						}
						break;
					case LT_EQ:
						{
						alt13=2;
						}
						break;
					case GT:
						{
						alt13=3;
						}
						break;
					case GT_EQ:
						{
						alt13=4;
						}
						break;
					case EQ:
						{
						alt13=5;
						}
						break;
					case NEQ:
						{
						alt13=6;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 13, 0, input);
						throw nvae;
					}
					switch (alt13) {
						case 1 :
							// antlr/Neptune.g:194:16: LT ^
							{
							LT81=(Token)match(input,LT,FOLLOW_LT_in_boolean_expr1539); 
							LT81_tree = (Object)adaptor.create(LT81);
							root_0 = (Object)adaptor.becomeRoot(LT81_tree, root_0);

							}
							break;
						case 2 :
							// antlr/Neptune.g:194:22: LT_EQ ^
							{
							LT_EQ82=(Token)match(input,LT_EQ,FOLLOW_LT_EQ_in_boolean_expr1544); 
							LT_EQ82_tree = (Object)adaptor.create(LT_EQ82);
							root_0 = (Object)adaptor.becomeRoot(LT_EQ82_tree, root_0);

							}
							break;
						case 3 :
							// antlr/Neptune.g:194:31: GT ^
							{
							GT83=(Token)match(input,GT,FOLLOW_GT_in_boolean_expr1549); 
							GT83_tree = (Object)adaptor.create(GT83);
							root_0 = (Object)adaptor.becomeRoot(GT83_tree, root_0);

							}
							break;
						case 4 :
							// antlr/Neptune.g:194:37: GT_EQ ^
							{
							GT_EQ84=(Token)match(input,GT_EQ,FOLLOW_GT_EQ_in_boolean_expr1554); 
							GT_EQ84_tree = (Object)adaptor.create(GT_EQ84);
							root_0 = (Object)adaptor.becomeRoot(GT_EQ84_tree, root_0);

							}
							break;
						case 5 :
							// antlr/Neptune.g:194:46: EQ ^
							{
							EQ85=(Token)match(input,EQ,FOLLOW_EQ_in_boolean_expr1559); 
							EQ85_tree = (Object)adaptor.create(EQ85);
							root_0 = (Object)adaptor.becomeRoot(EQ85_tree, root_0);

							}
							break;
						case 6 :
							// antlr/Neptune.g:194:52: NEQ ^
							{
							NEQ86=(Token)match(input,NEQ,FOLLOW_NEQ_in_boolean_expr1564); 
							NEQ86_tree = (Object)adaptor.create(NEQ86);
							root_0 = (Object)adaptor.becomeRoot(NEQ86_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_plus_expr_in_boolean_expr1568);
					plus_expr87=plus_expr();
					state._fsp--;

					adaptor.addChild(root_0, plus_expr87.getTree());

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
	// $ANTLR end "boolean_expr"


	public static class plus_expr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "plus_expr"
	// antlr/Neptune.g:197:1: plus_expr : multi_expr ( ( PLUS ^| MINUS ^) multi_expr )* ;
	public final NeptuneParser.plus_expr_return plus_expr() throws RecognitionException {
		NeptuneParser.plus_expr_return retval = new NeptuneParser.plus_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token PLUS89=null;
		Token MINUS90=null;
		ParserRuleReturnScope multi_expr88 =null;
		ParserRuleReturnScope multi_expr91 =null;

		Object PLUS89_tree=null;
		Object MINUS90_tree=null;

		try {
			// antlr/Neptune.g:198:2: ( multi_expr ( ( PLUS ^| MINUS ^) multi_expr )* )
			// antlr/Neptune.g:198:4: multi_expr ( ( PLUS ^| MINUS ^) multi_expr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_multi_expr_in_plus_expr1581);
			multi_expr88=multi_expr();
			state._fsp--;

			adaptor.addChild(root_0, multi_expr88.getTree());

			// antlr/Neptune.g:198:15: ( ( PLUS ^| MINUS ^) multi_expr )*
			loop16:
			while (true) {
				int alt16=2;
				int LA16_0 = input.LA(1);
				if ( (LA16_0==MINUS||LA16_0==PLUS) ) {
					alt16=1;
				}

				switch (alt16) {
				case 1 :
					// antlr/Neptune.g:198:16: ( PLUS ^| MINUS ^) multi_expr
					{
					// antlr/Neptune.g:198:16: ( PLUS ^| MINUS ^)
					int alt15=2;
					int LA15_0 = input.LA(1);
					if ( (LA15_0==PLUS) ) {
						alt15=1;
					}
					else if ( (LA15_0==MINUS) ) {
						alt15=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 15, 0, input);
						throw nvae;
					}

					switch (alt15) {
						case 1 :
							// antlr/Neptune.g:198:17: PLUS ^
							{
							PLUS89=(Token)match(input,PLUS,FOLLOW_PLUS_in_plus_expr1585); 
							PLUS89_tree = (Object)adaptor.create(PLUS89);
							root_0 = (Object)adaptor.becomeRoot(PLUS89_tree, root_0);

							}
							break;
						case 2 :
							// antlr/Neptune.g:198:25: MINUS ^
							{
							MINUS90=(Token)match(input,MINUS,FOLLOW_MINUS_in_plus_expr1590); 
							MINUS90_tree = (Object)adaptor.create(MINUS90);
							root_0 = (Object)adaptor.becomeRoot(MINUS90_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_multi_expr_in_plus_expr1594);
					multi_expr91=multi_expr();
					state._fsp--;

					adaptor.addChild(root_0, multi_expr91.getTree());

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
	// $ANTLR end "plus_expr"


	public static class multi_expr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "multi_expr"
	// antlr/Neptune.g:201:1: multi_expr : unary_expr ( ( TIMES ^| DIVIDE ^| MOD ^) unary_expr )* ;
	public final NeptuneParser.multi_expr_return multi_expr() throws RecognitionException {
		NeptuneParser.multi_expr_return retval = new NeptuneParser.multi_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token TIMES93=null;
		Token DIVIDE94=null;
		Token MOD95=null;
		ParserRuleReturnScope unary_expr92 =null;
		ParserRuleReturnScope unary_expr96 =null;

		Object TIMES93_tree=null;
		Object DIVIDE94_tree=null;
		Object MOD95_tree=null;

		try {
			// antlr/Neptune.g:202:2: ( unary_expr ( ( TIMES ^| DIVIDE ^| MOD ^) unary_expr )* )
			// antlr/Neptune.g:202:4: unary_expr ( ( TIMES ^| DIVIDE ^| MOD ^) unary_expr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_unary_expr_in_multi_expr1607);
			unary_expr92=unary_expr();
			state._fsp--;

			adaptor.addChild(root_0, unary_expr92.getTree());

			// antlr/Neptune.g:202:15: ( ( TIMES ^| DIVIDE ^| MOD ^) unary_expr )*
			loop18:
			while (true) {
				int alt18=2;
				int LA18_0 = input.LA(1);
				if ( (LA18_0==DIVIDE||LA18_0==MOD||LA18_0==TIMES) ) {
					alt18=1;
				}

				switch (alt18) {
				case 1 :
					// antlr/Neptune.g:202:16: ( TIMES ^| DIVIDE ^| MOD ^) unary_expr
					{
					// antlr/Neptune.g:202:16: ( TIMES ^| DIVIDE ^| MOD ^)
					int alt17=3;
					switch ( input.LA(1) ) {
					case TIMES:
						{
						alt17=1;
						}
						break;
					case DIVIDE:
						{
						alt17=2;
						}
						break;
					case MOD:
						{
						alt17=3;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 17, 0, input);
						throw nvae;
					}
					switch (alt17) {
						case 1 :
							// antlr/Neptune.g:202:17: TIMES ^
							{
							TIMES93=(Token)match(input,TIMES,FOLLOW_TIMES_in_multi_expr1611); 
							TIMES93_tree = (Object)adaptor.create(TIMES93);
							root_0 = (Object)adaptor.becomeRoot(TIMES93_tree, root_0);

							}
							break;
						case 2 :
							// antlr/Neptune.g:202:26: DIVIDE ^
							{
							DIVIDE94=(Token)match(input,DIVIDE,FOLLOW_DIVIDE_in_multi_expr1616); 
							DIVIDE94_tree = (Object)adaptor.create(DIVIDE94);
							root_0 = (Object)adaptor.becomeRoot(DIVIDE94_tree, root_0);

							}
							break;
						case 3 :
							// antlr/Neptune.g:202:36: MOD ^
							{
							MOD95=(Token)match(input,MOD,FOLLOW_MOD_in_multi_expr1621); 
							MOD95_tree = (Object)adaptor.create(MOD95);
							root_0 = (Object)adaptor.becomeRoot(MOD95_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_unary_expr_in_multi_expr1625);
					unary_expr96=unary_expr();
					state._fsp--;

					adaptor.addChild(root_0, unary_expr96.getTree());

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
	// $ANTLR end "multi_expr"


	public static class unary_expr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "unary_expr"
	// antlr/Neptune.g:205:1: unary_expr : ( operand | MINUS operand -> ^( UNARY_MINUS operand ) | PLUS operand -> ^( UNARY_PLUS operand ) | NEGATE ^ operand );
	public final NeptuneParser.unary_expr_return unary_expr() throws RecognitionException {
		NeptuneParser.unary_expr_return retval = new NeptuneParser.unary_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token MINUS98=null;
		Token PLUS100=null;
		Token NEGATE102=null;
		ParserRuleReturnScope operand97 =null;
		ParserRuleReturnScope operand99 =null;
		ParserRuleReturnScope operand101 =null;
		ParserRuleReturnScope operand103 =null;

		Object MINUS98_tree=null;
		Object PLUS100_tree=null;
		Object NEGATE102_tree=null;
		RewriteRuleTokenStream stream_PLUS=new RewriteRuleTokenStream(adaptor,"token PLUS");
		RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");
		RewriteRuleSubtreeStream stream_operand=new RewriteRuleSubtreeStream(adaptor,"rule operand");

		try {
			// antlr/Neptune.g:206:2: ( operand | MINUS operand -> ^( UNARY_MINUS operand ) | PLUS operand -> ^( UNARY_PLUS operand ) | NEGATE ^ operand )
			int alt19=4;
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
			case STRING_LITERAL:
			case TRUE:
				{
				alt19=1;
				}
				break;
			case MINUS:
				{
				alt19=2;
				}
				break;
			case PLUS:
				{
				alt19=3;
				}
				break;
			case NEGATE:
				{
				alt19=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 19, 0, input);
				throw nvae;
			}
			switch (alt19) {
				case 1 :
					// antlr/Neptune.g:206:4: operand
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_operand_in_unary_expr1639);
					operand97=operand();
					state._fsp--;

					adaptor.addChild(root_0, operand97.getTree());

					}
					break;
				case 2 :
					// antlr/Neptune.g:207:4: MINUS operand
					{
					MINUS98=(Token)match(input,MINUS,FOLLOW_MINUS_in_unary_expr1644);  
					stream_MINUS.add(MINUS98);

					pushFollow(FOLLOW_operand_in_unary_expr1646);
					operand99=operand();
					state._fsp--;

					stream_operand.add(operand99.getTree());
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
					// 207:18: -> ^( UNARY_MINUS operand )
					{
						// antlr/Neptune.g:207:21: ^( UNARY_MINUS operand )
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
					// antlr/Neptune.g:208:4: PLUS operand
					{
					PLUS100=(Token)match(input,PLUS,FOLLOW_PLUS_in_unary_expr1659);  
					stream_PLUS.add(PLUS100);

					pushFollow(FOLLOW_operand_in_unary_expr1661);
					operand101=operand();
					state._fsp--;

					stream_operand.add(operand101.getTree());
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
					// 208:17: -> ^( UNARY_PLUS operand )
					{
						// antlr/Neptune.g:208:20: ^( UNARY_PLUS operand )
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
					// antlr/Neptune.g:209:4: NEGATE ^ operand
					{
					root_0 = (Object)adaptor.nil();


					NEGATE102=(Token)match(input,NEGATE,FOLLOW_NEGATE_in_unary_expr1674); 
					NEGATE102_tree = (Object)adaptor.create(NEGATE102);
					root_0 = (Object)adaptor.becomeRoot(NEGATE102_tree, root_0);

					pushFollow(FOLLOW_operand_in_unary_expr1677);
					operand103=operand();
					state._fsp--;

					adaptor.addChild(root_0, operand103.getTree());

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
	// antlr/Neptune.g:212:1: operand : ( IDENTIFIER ( array_def )? | NUMBER | LPAREN ! assignment_expr RPAREN !| LBRACKET expression ( COMMA expression )* RBRACKET -> ^( ARRAY_SET ( expression )+ ) | print_statement | read_statement | ( TRUE | FALSE ) | CHAR_LITERAL | STRING_LITERAL | codeblock );
	public final NeptuneParser.operand_return operand() throws RecognitionException {
		NeptuneParser.operand_return retval = new NeptuneParser.operand_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IDENTIFIER104=null;
		Token NUMBER106=null;
		Token LPAREN107=null;
		Token RPAREN109=null;
		Token LBRACKET110=null;
		Token COMMA112=null;
		Token RBRACKET114=null;
		Token set117=null;
		Token CHAR_LITERAL118=null;
		Token STRING_LITERAL119=null;
		ParserRuleReturnScope array_def105 =null;
		ParserRuleReturnScope assignment_expr108 =null;
		ParserRuleReturnScope expression111 =null;
		ParserRuleReturnScope expression113 =null;
		ParserRuleReturnScope print_statement115 =null;
		ParserRuleReturnScope read_statement116 =null;
		ParserRuleReturnScope codeblock120 =null;

		Object IDENTIFIER104_tree=null;
		Object NUMBER106_tree=null;
		Object LPAREN107_tree=null;
		Object RPAREN109_tree=null;
		Object LBRACKET110_tree=null;
		Object COMMA112_tree=null;
		Object RBRACKET114_tree=null;
		Object set117_tree=null;
		Object CHAR_LITERAL118_tree=null;
		Object STRING_LITERAL119_tree=null;
		RewriteRuleTokenStream stream_LBRACKET=new RewriteRuleTokenStream(adaptor,"token LBRACKET");
		RewriteRuleTokenStream stream_RBRACKET=new RewriteRuleTokenStream(adaptor,"token RBRACKET");
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try {
			// antlr/Neptune.g:213:5: ( IDENTIFIER ( array_def )? | NUMBER | LPAREN ! assignment_expr RPAREN !| LBRACKET expression ( COMMA expression )* RBRACKET -> ^( ARRAY_SET ( expression )+ ) | print_statement | read_statement | ( TRUE | FALSE ) | CHAR_LITERAL | STRING_LITERAL | codeblock )
			int alt22=10;
			switch ( input.LA(1) ) {
			case IDENTIFIER:
				{
				alt22=1;
				}
				break;
			case NUMBER:
				{
				alt22=2;
				}
				break;
			case LPAREN:
				{
				alt22=3;
				}
				break;
			case LBRACKET:
				{
				alt22=4;
				}
				break;
			case PRINT:
				{
				alt22=5;
				}
				break;
			case READ:
				{
				alt22=6;
				}
				break;
			case FALSE:
			case TRUE:
				{
				alt22=7;
				}
				break;
			case CHAR_LITERAL:
				{
				alt22=8;
				}
				break;
			case STRING_LITERAL:
				{
				alt22=9;
				}
				break;
			case LCURLY:
				{
				alt22=10;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 22, 0, input);
				throw nvae;
			}
			switch (alt22) {
				case 1 :
					// antlr/Neptune.g:213:9: IDENTIFIER ( array_def )?
					{
					root_0 = (Object)adaptor.nil();


					IDENTIFIER104=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_operand1693); 
					IDENTIFIER104_tree = (Object)adaptor.create(IDENTIFIER104);
					adaptor.addChild(root_0, IDENTIFIER104_tree);

					// antlr/Neptune.g:213:20: ( array_def )?
					int alt20=2;
					int LA20_0 = input.LA(1);
					if ( (LA20_0==LBRACKET) ) {
						alt20=1;
					}
					switch (alt20) {
						case 1 :
							// antlr/Neptune.g:213:20: array_def
							{
							pushFollow(FOLLOW_array_def_in_operand1695);
							array_def105=array_def();
							state._fsp--;

							adaptor.addChild(root_0, array_def105.getTree());

							}
							break;

					}

					}
					break;
				case 2 :
					// antlr/Neptune.g:214:9: NUMBER
					{
					root_0 = (Object)adaptor.nil();


					NUMBER106=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_operand1706); 
					NUMBER106_tree = (Object)adaptor.create(NUMBER106);
					adaptor.addChild(root_0, NUMBER106_tree);

					}
					break;
				case 3 :
					// antlr/Neptune.g:215:9: LPAREN ! assignment_expr RPAREN !
					{
					root_0 = (Object)adaptor.nil();


					LPAREN107=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_operand1716); 
					pushFollow(FOLLOW_assignment_expr_in_operand1719);
					assignment_expr108=assignment_expr();
					state._fsp--;

					adaptor.addChild(root_0, assignment_expr108.getTree());

					RPAREN109=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_operand1721); 
					}
					break;
				case 4 :
					// antlr/Neptune.g:216:4: LBRACKET expression ( COMMA expression )* RBRACKET
					{
					LBRACKET110=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_operand1727);  
					stream_LBRACKET.add(LBRACKET110);

					pushFollow(FOLLOW_expression_in_operand1729);
					expression111=expression();
					state._fsp--;

					stream_expression.add(expression111.getTree());
					// antlr/Neptune.g:216:24: ( COMMA expression )*
					loop21:
					while (true) {
						int alt21=2;
						int LA21_0 = input.LA(1);
						if ( (LA21_0==COMMA) ) {
							alt21=1;
						}

						switch (alt21) {
						case 1 :
							// antlr/Neptune.g:216:25: COMMA expression
							{
							COMMA112=(Token)match(input,COMMA,FOLLOW_COMMA_in_operand1732);  
							stream_COMMA.add(COMMA112);

							pushFollow(FOLLOW_expression_in_operand1734);
							expression113=expression();
							state._fsp--;

							stream_expression.add(expression113.getTree());
							}
							break;

						default :
							break loop21;
						}
					}

					RBRACKET114=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_operand1738);  
					stream_RBRACKET.add(RBRACKET114);

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
					// 217:3: -> ^( ARRAY_SET ( expression )+ )
					{
						// antlr/Neptune.g:217:6: ^( ARRAY_SET ( expression )+ )
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
					// antlr/Neptune.g:218:4: print_statement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_print_statement_in_operand1754);
					print_statement115=print_statement();
					state._fsp--;

					adaptor.addChild(root_0, print_statement115.getTree());

					}
					break;
				case 6 :
					// antlr/Neptune.g:219:4: read_statement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_read_statement_in_operand1759);
					read_statement116=read_statement();
					state._fsp--;

					adaptor.addChild(root_0, read_statement116.getTree());

					}
					break;
				case 7 :
					// antlr/Neptune.g:220:4: ( TRUE | FALSE )
					{
					root_0 = (Object)adaptor.nil();


					set117=input.LT(1);
					if ( input.LA(1)==FALSE||input.LA(1)==TRUE ) {
						input.consume();
						adaptor.addChild(root_0, (Object)adaptor.create(set117));
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					}
					break;
				case 8 :
					// antlr/Neptune.g:221:4: CHAR_LITERAL
					{
					root_0 = (Object)adaptor.nil();


					CHAR_LITERAL118=(Token)match(input,CHAR_LITERAL,FOLLOW_CHAR_LITERAL_in_operand1775); 
					CHAR_LITERAL118_tree = (Object)adaptor.create(CHAR_LITERAL118);
					adaptor.addChild(root_0, CHAR_LITERAL118_tree);

					}
					break;
				case 9 :
					// antlr/Neptune.g:222:4: STRING_LITERAL
					{
					root_0 = (Object)adaptor.nil();


					STRING_LITERAL119=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_operand1780); 
					STRING_LITERAL119_tree = (Object)adaptor.create(STRING_LITERAL119);
					adaptor.addChild(root_0, STRING_LITERAL119_tree);

					}
					break;
				case 10 :
					// antlr/Neptune.g:223:4: codeblock
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_codeblock_in_operand1785);
					codeblock120=codeblock();
					state._fsp--;

					adaptor.addChild(root_0, codeblock120.getTree());

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
	// antlr/Neptune.g:226:1: type : ( INTEGER ( array_def )? | CHAR ( array_def )? | BOOLEAN ( array_def )? );
	public final NeptuneParser.type_return type() throws RecognitionException {
		NeptuneParser.type_return retval = new NeptuneParser.type_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token INTEGER121=null;
		Token CHAR123=null;
		Token BOOLEAN125=null;
		ParserRuleReturnScope array_def122 =null;
		ParserRuleReturnScope array_def124 =null;
		ParserRuleReturnScope array_def126 =null;

		Object INTEGER121_tree=null;
		Object CHAR123_tree=null;
		Object BOOLEAN125_tree=null;

		try {
			// antlr/Neptune.g:227:2: ( INTEGER ( array_def )? | CHAR ( array_def )? | BOOLEAN ( array_def )? )
			int alt26=3;
			switch ( input.LA(1) ) {
			case INTEGER:
				{
				alt26=1;
				}
				break;
			case CHAR:
				{
				alt26=2;
				}
				break;
			case BOOLEAN:
				{
				alt26=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 26, 0, input);
				throw nvae;
			}
			switch (alt26) {
				case 1 :
					// antlr/Neptune.g:227:4: INTEGER ( array_def )?
					{
					root_0 = (Object)adaptor.nil();


					INTEGER121=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_type1799); 
					INTEGER121_tree = (Object)adaptor.create(INTEGER121);
					adaptor.addChild(root_0, INTEGER121_tree);

					// antlr/Neptune.g:227:12: ( array_def )?
					int alt23=2;
					int LA23_0 = input.LA(1);
					if ( (LA23_0==LBRACKET) ) {
						alt23=1;
					}
					switch (alt23) {
						case 1 :
							// antlr/Neptune.g:227:12: array_def
							{
							pushFollow(FOLLOW_array_def_in_type1801);
							array_def122=array_def();
							state._fsp--;

							adaptor.addChild(root_0, array_def122.getTree());

							}
							break;

					}

					}
					break;
				case 2 :
					// antlr/Neptune.g:228:4: CHAR ( array_def )?
					{
					root_0 = (Object)adaptor.nil();


					CHAR123=(Token)match(input,CHAR,FOLLOW_CHAR_in_type1807); 
					CHAR123_tree = (Object)adaptor.create(CHAR123);
					adaptor.addChild(root_0, CHAR123_tree);

					// antlr/Neptune.g:228:9: ( array_def )?
					int alt24=2;
					int LA24_0 = input.LA(1);
					if ( (LA24_0==LBRACKET) ) {
						alt24=1;
					}
					switch (alt24) {
						case 1 :
							// antlr/Neptune.g:228:9: array_def
							{
							pushFollow(FOLLOW_array_def_in_type1809);
							array_def124=array_def();
							state._fsp--;

							adaptor.addChild(root_0, array_def124.getTree());

							}
							break;

					}

					}
					break;
				case 3 :
					// antlr/Neptune.g:229:4: BOOLEAN ( array_def )?
					{
					root_0 = (Object)adaptor.nil();


					BOOLEAN125=(Token)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_type1815); 
					BOOLEAN125_tree = (Object)adaptor.create(BOOLEAN125);
					adaptor.addChild(root_0, BOOLEAN125_tree);

					// antlr/Neptune.g:229:12: ( array_def )?
					int alt25=2;
					int LA25_0 = input.LA(1);
					if ( (LA25_0==LBRACKET) ) {
						alt25=1;
					}
					switch (alt25) {
						case 1 :
							// antlr/Neptune.g:229:12: array_def
							{
							pushFollow(FOLLOW_array_def_in_type1817);
							array_def126=array_def();
							state._fsp--;

							adaptor.addChild(root_0, array_def126.getTree());

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
	// antlr/Neptune.g:232:1: array_def : LBRACKET NUMBER RBRACKET -> ^( ARRAY_DEF NUMBER ) ;
	public final NeptuneParser.array_def_return array_def() throws RecognitionException {
		NeptuneParser.array_def_return retval = new NeptuneParser.array_def_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token LBRACKET127=null;
		Token NUMBER128=null;
		Token RBRACKET129=null;

		Object LBRACKET127_tree=null;
		Object NUMBER128_tree=null;
		Object RBRACKET129_tree=null;
		RewriteRuleTokenStream stream_LBRACKET=new RewriteRuleTokenStream(adaptor,"token LBRACKET");
		RewriteRuleTokenStream stream_RBRACKET=new RewriteRuleTokenStream(adaptor,"token RBRACKET");
		RewriteRuleTokenStream stream_NUMBER=new RewriteRuleTokenStream(adaptor,"token NUMBER");

		try {
			// antlr/Neptune.g:233:2: ( LBRACKET NUMBER RBRACKET -> ^( ARRAY_DEF NUMBER ) )
			// antlr/Neptune.g:233:5: LBRACKET NUMBER RBRACKET
			{
			LBRACKET127=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_array_def1831);  
			stream_LBRACKET.add(LBRACKET127);

			NUMBER128=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_array_def1833);  
			stream_NUMBER.add(NUMBER128);

			RBRACKET129=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_array_def1835);  
			stream_RBRACKET.add(RBRACKET129);

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
			// 234:3: -> ^( ARRAY_DEF NUMBER )
			{
				// antlr/Neptune.g:234:6: ^( ARRAY_DEF NUMBER )
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



	public static final BitSet FOLLOW_lines_in_program1098 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_program1100 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_line_in_lines1135 = new BitSet(new long[]{0x0910D52763008E02L,0x0000000000000001L});
	public static final BitSet FOLLOW_expression_in_line1148 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_line1150 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declaration_in_line1156 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_line1158 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_logic_statement_in_line1164 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LCURLY_in_codeblock1176 = new BitSet(new long[]{0x0910D52763008E00L,0x0000000000000001L});
	public static final BitSet FOLLOW_lines_in_codeblock1178 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_RCURLY_in_codeblock1180 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_while_statement_in_logic_statement1202 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_foreach_statement_in_logic_statement1207 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_if_statement_in_logic_statement1212 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHILE_in_while_statement1224 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_LPAREN_in_while_statement1227 = new BitSet(new long[]{0x0910D52621000800L});
	public static final BitSet FOLLOW_expression_in_while_statement1230 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_while_statement1232 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_LCURLY_in_while_statement1235 = new BitSet(new long[]{0x0910D52763008E00L,0x0000000000000001L});
	public static final BitSet FOLLOW_lines_in_while_statement1238 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_RCURLY_in_while_statement1240 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FOREACH_in_foreach_statement1253 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_LPAREN_in_foreach_statement1256 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_foreach_statement1259 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_IN_in_foreach_statement1261 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_foreach_statement1264 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_foreach_statement1266 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_LCURLY_in_foreach_statement1269 = new BitSet(new long[]{0x0910D52763008E00L,0x0000000000000001L});
	public static final BitSet FOLLOW_lines_in_foreach_statement1272 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_RCURLY_in_foreach_statement1274 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_if_statement1287 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_LPAREN_in_if_statement1290 = new BitSet(new long[]{0x0910D52621000800L});
	public static final BitSet FOLLOW_expression_in_if_statement1293 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_if_statement1295 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_LCURLY_in_if_statement1298 = new BitSet(new long[]{0x0910D52763008E00L,0x0000000000000001L});
	public static final BitSet FOLLOW_lines_in_if_statement1301 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_RCURLY_in_if_statement1303 = new BitSet(new long[]{0x0000000000600002L});
	public static final BitSet FOLLOW_ELSIF_in_if_statement1309 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_LPAREN_in_if_statement1311 = new BitSet(new long[]{0x0910D52621000800L});
	public static final BitSet FOLLOW_expression_in_if_statement1314 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_if_statement1316 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_LCURLY_in_if_statement1319 = new BitSet(new long[]{0x0910D52763008E00L,0x0000000000000001L});
	public static final BitSet FOLLOW_lines_in_if_statement1322 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_RCURLY_in_if_statement1324 = new BitSet(new long[]{0x0000000000600002L});
	public static final BitSet FOLLOW_ELSE_in_if_statement1332 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_LCURLY_in_if_statement1334 = new BitSet(new long[]{0x0910D52763008E00L,0x0000000000000001L});
	public static final BitSet FOLLOW_lines_in_if_statement1337 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_RCURLY_in_if_statement1339 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRINT_in_print_statement1354 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_LPAREN_in_print_statement1357 = new BitSet(new long[]{0x0910D52621000800L});
	public static final BitSet FOLLOW_expression_in_print_statement1360 = new BitSet(new long[]{0x0040000000002000L});
	public static final BitSet FOLLOW_COMMA_in_print_statement1363 = new BitSet(new long[]{0x0910D52621000800L});
	public static final BitSet FOLLOW_expression_in_print_statement1365 = new BitSet(new long[]{0x0040000000002000L});
	public static final BitSet FOLLOW_RPAREN_in_print_statement1369 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_READ_in_read_statement1382 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_LPAREN_in_read_statement1385 = new BitSet(new long[]{0x0910D52621000800L});
	public static final BitSet FOLLOW_expression_in_read_statement1388 = new BitSet(new long[]{0x0040000000002000L});
	public static final BitSet FOLLOW_COMMA_in_read_statement1391 = new BitSet(new long[]{0x0910D52621000800L});
	public static final BitSet FOLLOW_expression_in_read_statement1393 = new BitSet(new long[]{0x0040000000002000L});
	public static final BitSet FOLLOW_RPAREN_in_read_statement1397 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_declaration1410 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_declaration1412 = new BitSet(new long[]{0x0000000000000082L});
	public static final BitSet FOLLOW_BECOMES_in_declaration1415 = new BitSet(new long[]{0x0910D52621000800L});
	public static final BitSet FOLLOW_expression_in_declaration1417 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CONST_in_declaration1443 = new BitSet(new long[]{0x0000000100000600L});
	public static final BitSet FOLLOW_type_in_declaration1446 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_declaration1448 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_BECOMES_in_declaration1450 = new BitSet(new long[]{0x0910D52621000800L});
	public static final BitSet FOLLOW_expression_in_declaration1452 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignment_expr_in_expression1464 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_or_expr_in_assignment_expr1475 = new BitSet(new long[]{0x0000000000000082L});
	public static final BitSet FOLLOW_BECOMES_in_assignment_expr1478 = new BitSet(new long[]{0x0910D52621000800L});
	public static final BitSet FOLLOW_assignment_expr_in_assignment_expr1481 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_and_expr_in_or_expr1495 = new BitSet(new long[]{0x0000200000000002L});
	public static final BitSet FOLLOW_OR_in_or_expr1498 = new BitSet(new long[]{0x0910D52621000800L});
	public static final BitSet FOLLOW_and_expr_in_or_expr1501 = new BitSet(new long[]{0x0000200000000002L});
	public static final BitSet FOLLOW_boolean_expr_in_and_expr1515 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_AND_in_and_expr1518 = new BitSet(new long[]{0x0910D52621000800L});
	public static final BitSet FOLLOW_boolean_expr_in_and_expr1521 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_plus_expr_in_boolean_expr1535 = new BitSet(new long[]{0x000008C018800002L});
	public static final BitSet FOLLOW_LT_in_boolean_expr1539 = new BitSet(new long[]{0x0910D52621000800L});
	public static final BitSet FOLLOW_LT_EQ_in_boolean_expr1544 = new BitSet(new long[]{0x0910D52621000800L});
	public static final BitSet FOLLOW_GT_in_boolean_expr1549 = new BitSet(new long[]{0x0910D52621000800L});
	public static final BitSet FOLLOW_GT_EQ_in_boolean_expr1554 = new BitSet(new long[]{0x0910D52621000800L});
	public static final BitSet FOLLOW_EQ_in_boolean_expr1559 = new BitSet(new long[]{0x0910D52621000800L});
	public static final BitSet FOLLOW_NEQ_in_boolean_expr1564 = new BitSet(new long[]{0x0910D52621000800L});
	public static final BitSet FOLLOW_plus_expr_in_boolean_expr1568 = new BitSet(new long[]{0x000008C018800002L});
	public static final BitSet FOLLOW_multi_expr_in_plus_expr1581 = new BitSet(new long[]{0x0000410000000002L});
	public static final BitSet FOLLOW_PLUS_in_plus_expr1585 = new BitSet(new long[]{0x0910D52621000800L});
	public static final BitSet FOLLOW_MINUS_in_plus_expr1590 = new BitSet(new long[]{0x0910D52621000800L});
	public static final BitSet FOLLOW_multi_expr_in_plus_expr1594 = new BitSet(new long[]{0x0000410000000002L});
	public static final BitSet FOLLOW_unary_expr_in_multi_expr1607 = new BitSet(new long[]{0x0400020000020002L});
	public static final BitSet FOLLOW_TIMES_in_multi_expr1611 = new BitSet(new long[]{0x0910D52621000800L});
	public static final BitSet FOLLOW_DIVIDE_in_multi_expr1616 = new BitSet(new long[]{0x0910D52621000800L});
	public static final BitSet FOLLOW_MOD_in_multi_expr1621 = new BitSet(new long[]{0x0910D52621000800L});
	public static final BitSet FOLLOW_unary_expr_in_multi_expr1625 = new BitSet(new long[]{0x0400020000020002L});
	public static final BitSet FOLLOW_operand_in_unary_expr1639 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MINUS_in_unary_expr1644 = new BitSet(new long[]{0x0910902621000800L});
	public static final BitSet FOLLOW_operand_in_unary_expr1646 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PLUS_in_unary_expr1659 = new BitSet(new long[]{0x0910902621000800L});
	public static final BitSet FOLLOW_operand_in_unary_expr1661 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NEGATE_in_unary_expr1674 = new BitSet(new long[]{0x0910902621000800L});
	public static final BitSet FOLLOW_operand_in_unary_expr1677 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_operand1693 = new BitSet(new long[]{0x0000000200000002L});
	public static final BitSet FOLLOW_array_def_in_operand1695 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMBER_in_operand1706 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_operand1716 = new BitSet(new long[]{0x0910D52621000800L});
	public static final BitSet FOLLOW_assignment_expr_in_operand1719 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_operand1721 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACKET_in_operand1727 = new BitSet(new long[]{0x0910D52621000800L});
	public static final BitSet FOLLOW_expression_in_operand1729 = new BitSet(new long[]{0x0004000000002000L});
	public static final BitSet FOLLOW_COMMA_in_operand1732 = new BitSet(new long[]{0x0910D52621000800L});
	public static final BitSet FOLLOW_expression_in_operand1734 = new BitSet(new long[]{0x0004000000002000L});
	public static final BitSet FOLLOW_RBRACKET_in_operand1738 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_print_statement_in_operand1754 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_read_statement_in_operand1759 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_operand1764 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_LITERAL_in_operand1775 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_operand1780 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_codeblock_in_operand1785 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTEGER_in_type1799 = new BitSet(new long[]{0x0000000200000002L});
	public static final BitSet FOLLOW_array_def_in_type1801 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_in_type1807 = new BitSet(new long[]{0x0000000200000002L});
	public static final BitSet FOLLOW_array_def_in_type1809 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOLEAN_in_type1815 = new BitSet(new long[]{0x0000000200000002L});
	public static final BitSet FOLLOW_array_def_in_type1817 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACKET_in_array_def1831 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_NUMBER_in_array_def1833 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_RBRACKET_in_array_def1835 = new BitSet(new long[]{0x0000000000000002L});
}

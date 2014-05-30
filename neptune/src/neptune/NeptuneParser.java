// $ANTLR 3.5.2 Neptune.g 2014-05-30 23:06:41

package neptune;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class NeptuneParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ARRAY_SET", "BECOMES", "BLOCK", 
		"BOOLEAN", "CHAR", "CHAR_LITERAL", "COLON", "COMMA", "COMMENT", "CONST", 
		"DIGIT", "DIVIDE", "DO", "DQUOTE", "DROPIN_STATEMENT", "ELSE", "ELSIF", 
		"EQ", "FALSE", "FOREACH", "FUNCTION", "GT", "GT_EQ", "IDENTIFIER", "IF", 
		"IN", "INTEGER", "LBRACKET", "LCURLY", "LETTER", "LOWER", "LPAREN", "LT", 
		"LT_EQ", "MINUS", "NEQ", "NUMBER", "PLUS", "PRINT", "PROGRAM", "QUOTE", 
		"RBRACKET", "RCURLY", "READ", "RETURN", "RPAREN", "SEMICOLON", "STRING_LITERAL", 
		"THEN", "TIMES", "TRUE", "UPPER", "VAR", "WHILE", "WS"
	};
	public static final int EOF=-1;
	public static final int ARRAY_SET=4;
	public static final int BECOMES=5;
	public static final int BLOCK=6;
	public static final int BOOLEAN=7;
	public static final int CHAR=8;
	public static final int CHAR_LITERAL=9;
	public static final int COLON=10;
	public static final int COMMA=11;
	public static final int COMMENT=12;
	public static final int CONST=13;
	public static final int DIGIT=14;
	public static final int DIVIDE=15;
	public static final int DO=16;
	public static final int DQUOTE=17;
	public static final int DROPIN_STATEMENT=18;
	public static final int ELSE=19;
	public static final int ELSIF=20;
	public static final int EQ=21;
	public static final int FALSE=22;
	public static final int FOREACH=23;
	public static final int FUNCTION=24;
	public static final int GT=25;
	public static final int GT_EQ=26;
	public static final int IDENTIFIER=27;
	public static final int IF=28;
	public static final int IN=29;
	public static final int INTEGER=30;
	public static final int LBRACKET=31;
	public static final int LCURLY=32;
	public static final int LETTER=33;
	public static final int LOWER=34;
	public static final int LPAREN=35;
	public static final int LT=36;
	public static final int LT_EQ=37;
	public static final int MINUS=38;
	public static final int NEQ=39;
	public static final int NUMBER=40;
	public static final int PLUS=41;
	public static final int PRINT=42;
	public static final int PROGRAM=43;
	public static final int QUOTE=44;
	public static final int RBRACKET=45;
	public static final int RCURLY=46;
	public static final int READ=47;
	public static final int RETURN=48;
	public static final int RPAREN=49;
	public static final int SEMICOLON=50;
	public static final int STRING_LITERAL=51;
	public static final int THEN=52;
	public static final int TIMES=53;
	public static final int TRUE=54;
	public static final int UPPER=55;
	public static final int VAR=56;
	public static final int WHILE=57;
	public static final int WS=58;

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
	// Neptune.g:115:1: program : lines EOF -> ^( PROGRAM lines ) ;
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
			// Neptune.g:116:5: ( lines EOF -> ^( PROGRAM lines ) )
			// Neptune.g:116:9: lines EOF
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
			// 117:13: -> ^( PROGRAM lines )
			{
				// Neptune.g:117:17: ^( PROGRAM lines )
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
	// Neptune.g:120:1: lines : ( line )+ ;
	public final NeptuneParser.lines_return lines() throws RecognitionException {
		NeptuneParser.lines_return retval = new NeptuneParser.lines_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope line3 =null;


		try {
			// Neptune.g:121:2: ( ( line )+ )
			// Neptune.g:121:4: ( line )+
			{
			root_0 = (Object)adaptor.nil();


			// Neptune.g:121:4: ( line )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= BOOLEAN && LA1_0 <= CHAR_LITERAL)||LA1_0==CONST||(LA1_0 >= FALSE && LA1_0 <= FOREACH)||(LA1_0 >= IDENTIFIER && LA1_0 <= IF)||(LA1_0 >= INTEGER && LA1_0 <= LCURLY)||LA1_0==LPAREN||LA1_0==NUMBER||LA1_0==PRINT||LA1_0==READ||LA1_0==STRING_LITERAL||LA1_0==TRUE||LA1_0==WHILE) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// Neptune.g:121:4: line
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
	// Neptune.g:124:1: line : ( expression SEMICOLON !| declaration SEMICOLON !| logic_statement );
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
			// Neptune.g:125:2: ( expression SEMICOLON !| declaration SEMICOLON !| logic_statement )
			int alt2=3;
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
					// Neptune.g:125:4: expression SEMICOLON !
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
					// Neptune.g:126:4: declaration SEMICOLON !
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
					// Neptune.g:127:4: logic_statement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_logic_statement_in_line1086);
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
	// Neptune.g:130:1: codeblock : LCURLY lines RCURLY -> ^( BLOCK lines ) ;
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
			// Neptune.g:131:2: ( LCURLY lines RCURLY -> ^( BLOCK lines ) )
			// Neptune.g:131:4: LCURLY lines RCURLY
			{
			LCURLY9=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_codeblock1098);  
			stream_LCURLY.add(LCURLY9);

			pushFollow(FOLLOW_lines_in_codeblock1100);
			lines10=lines();
			state._fsp--;

			stream_lines.add(lines10.getTree());
			RCURLY11=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_codeblock1102);  
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
			// 132:3: -> ^( BLOCK lines )
			{
				// Neptune.g:132:6: ^( BLOCK lines )
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
	// Neptune.g:135:1: logic_statement : ( while_statement | foreach_statement | if_statement );
	public final NeptuneParser.logic_statement_return logic_statement() throws RecognitionException {
		NeptuneParser.logic_statement_return retval = new NeptuneParser.logic_statement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope while_statement12 =null;
		ParserRuleReturnScope foreach_statement13 =null;
		ParserRuleReturnScope if_statement14 =null;


		try {
			// Neptune.g:136:2: ( while_statement | foreach_statement | if_statement )
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
					// Neptune.g:136:4: while_statement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_while_statement_in_logic_statement1124);
					while_statement12=while_statement();
					state._fsp--;

					adaptor.addChild(root_0, while_statement12.getTree());

					}
					break;
				case 2 :
					// Neptune.g:137:4: foreach_statement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_foreach_statement_in_logic_statement1129);
					foreach_statement13=foreach_statement();
					state._fsp--;

					adaptor.addChild(root_0, foreach_statement13.getTree());

					}
					break;
				case 3 :
					// Neptune.g:138:4: if_statement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_if_statement_in_logic_statement1134);
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
	// Neptune.g:141:1: while_statement : WHILE ^ LPAREN ! expression RPAREN ! LCURLY ! lines RCURLY !;
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
			// Neptune.g:142:2: ( WHILE ^ LPAREN ! expression RPAREN ! LCURLY ! lines RCURLY !)
			// Neptune.g:142:4: WHILE ^ LPAREN ! expression RPAREN ! LCURLY ! lines RCURLY !
			{
			root_0 = (Object)adaptor.nil();


			WHILE15=(Token)match(input,WHILE,FOLLOW_WHILE_in_while_statement1146); 
			WHILE15_tree = (Object)adaptor.create(WHILE15);
			root_0 = (Object)adaptor.becomeRoot(WHILE15_tree, root_0);

			LPAREN16=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_while_statement1149); 
			pushFollow(FOLLOW_expression_in_while_statement1152);
			expression17=expression();
			state._fsp--;

			adaptor.addChild(root_0, expression17.getTree());

			RPAREN18=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_while_statement1154); 
			LCURLY19=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_while_statement1157); 
			pushFollow(FOLLOW_lines_in_while_statement1160);
			lines20=lines();
			state._fsp--;

			adaptor.addChild(root_0, lines20.getTree());

			RCURLY21=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_while_statement1162); 
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
	// Neptune.g:145:1: foreach_statement : FOREACH ^ LPAREN ! IDENTIFIER IN ! IDENTIFIER RPAREN ! LCURLY ! lines RCURLY !;
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
			// Neptune.g:146:2: ( FOREACH ^ LPAREN ! IDENTIFIER IN ! IDENTIFIER RPAREN ! LCURLY ! lines RCURLY !)
			// Neptune.g:146:4: FOREACH ^ LPAREN ! IDENTIFIER IN ! IDENTIFIER RPAREN ! LCURLY ! lines RCURLY !
			{
			root_0 = (Object)adaptor.nil();


			FOREACH22=(Token)match(input,FOREACH,FOLLOW_FOREACH_in_foreach_statement1175); 
			FOREACH22_tree = (Object)adaptor.create(FOREACH22);
			root_0 = (Object)adaptor.becomeRoot(FOREACH22_tree, root_0);

			LPAREN23=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_foreach_statement1178); 
			IDENTIFIER24=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_foreach_statement1181); 
			IDENTIFIER24_tree = (Object)adaptor.create(IDENTIFIER24);
			adaptor.addChild(root_0, IDENTIFIER24_tree);

			IN25=(Token)match(input,IN,FOLLOW_IN_in_foreach_statement1183); 
			IDENTIFIER26=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_foreach_statement1186); 
			IDENTIFIER26_tree = (Object)adaptor.create(IDENTIFIER26);
			adaptor.addChild(root_0, IDENTIFIER26_tree);

			RPAREN27=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_foreach_statement1188); 
			LCURLY28=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_foreach_statement1191); 
			pushFollow(FOLLOW_lines_in_foreach_statement1194);
			lines29=lines();
			state._fsp--;

			adaptor.addChild(root_0, lines29.getTree());

			RCURLY30=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_foreach_statement1196); 
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
	// Neptune.g:149:1: if_statement : IF ^ LPAREN ! expression RPAREN ! LCURLY ! lines RCURLY ! ( ELSIF LPAREN ! expression RPAREN ! LCURLY ! lines RCURLY !)* ( ELSE LCURLY ! lines RCURLY !)? ;
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
			// Neptune.g:150:2: ( IF ^ LPAREN ! expression RPAREN ! LCURLY ! lines RCURLY ! ( ELSIF LPAREN ! expression RPAREN ! LCURLY ! lines RCURLY !)* ( ELSE LCURLY ! lines RCURLY !)? )
			// Neptune.g:150:4: IF ^ LPAREN ! expression RPAREN ! LCURLY ! lines RCURLY ! ( ELSIF LPAREN ! expression RPAREN ! LCURLY ! lines RCURLY !)* ( ELSE LCURLY ! lines RCURLY !)?
			{
			root_0 = (Object)adaptor.nil();


			IF31=(Token)match(input,IF,FOLLOW_IF_in_if_statement1209); 
			IF31_tree = (Object)adaptor.create(IF31);
			root_0 = (Object)adaptor.becomeRoot(IF31_tree, root_0);

			LPAREN32=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_if_statement1212); 
			pushFollow(FOLLOW_expression_in_if_statement1215);
			expression33=expression();
			state._fsp--;

			adaptor.addChild(root_0, expression33.getTree());

			RPAREN34=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_if_statement1217); 
			LCURLY35=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_if_statement1220); 
			pushFollow(FOLLOW_lines_in_if_statement1223);
			lines36=lines();
			state._fsp--;

			adaptor.addChild(root_0, lines36.getTree());

			RCURLY37=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_if_statement1225); 
			// Neptune.g:151:3: ( ELSIF LPAREN ! expression RPAREN ! LCURLY ! lines RCURLY !)*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==ELSIF) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// Neptune.g:151:4: ELSIF LPAREN ! expression RPAREN ! LCURLY ! lines RCURLY !
					{
					ELSIF38=(Token)match(input,ELSIF,FOLLOW_ELSIF_in_if_statement1231); 
					ELSIF38_tree = (Object)adaptor.create(ELSIF38);
					adaptor.addChild(root_0, ELSIF38_tree);

					LPAREN39=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_if_statement1233); 
					pushFollow(FOLLOW_expression_in_if_statement1236);
					expression40=expression();
					state._fsp--;

					adaptor.addChild(root_0, expression40.getTree());

					RPAREN41=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_if_statement1238); 
					LCURLY42=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_if_statement1241); 
					pushFollow(FOLLOW_lines_in_if_statement1244);
					lines43=lines();
					state._fsp--;

					adaptor.addChild(root_0, lines43.getTree());

					RCURLY44=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_if_statement1246); 
					}
					break;

				default :
					break loop4;
				}
			}

			// Neptune.g:152:3: ( ELSE LCURLY ! lines RCURLY !)?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==ELSE) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// Neptune.g:152:4: ELSE LCURLY ! lines RCURLY !
					{
					ELSE45=(Token)match(input,ELSE,FOLLOW_ELSE_in_if_statement1254); 
					ELSE45_tree = (Object)adaptor.create(ELSE45);
					adaptor.addChild(root_0, ELSE45_tree);

					LCURLY46=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_if_statement1256); 
					pushFollow(FOLLOW_lines_in_if_statement1259);
					lines47=lines();
					state._fsp--;

					adaptor.addChild(root_0, lines47.getTree());

					RCURLY48=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_if_statement1261); 
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
	// Neptune.g:155:1: print_statement : PRINT ^ LPAREN ! expression ( COMMA expression )* RPAREN !;
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
			// Neptune.g:156:2: ( PRINT ^ LPAREN ! expression ( COMMA expression )* RPAREN !)
			// Neptune.g:156:4: PRINT ^ LPAREN ! expression ( COMMA expression )* RPAREN !
			{
			root_0 = (Object)adaptor.nil();


			PRINT49=(Token)match(input,PRINT,FOLLOW_PRINT_in_print_statement1276); 
			PRINT49_tree = (Object)adaptor.create(PRINT49);
			root_0 = (Object)adaptor.becomeRoot(PRINT49_tree, root_0);

			LPAREN50=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_print_statement1279); 
			pushFollow(FOLLOW_expression_in_print_statement1282);
			expression51=expression();
			state._fsp--;

			adaptor.addChild(root_0, expression51.getTree());

			// Neptune.g:156:30: ( COMMA expression )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==COMMA) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// Neptune.g:156:31: COMMA expression
					{
					COMMA52=(Token)match(input,COMMA,FOLLOW_COMMA_in_print_statement1285); 
					COMMA52_tree = (Object)adaptor.create(COMMA52);
					adaptor.addChild(root_0, COMMA52_tree);

					pushFollow(FOLLOW_expression_in_print_statement1287);
					expression53=expression();
					state._fsp--;

					adaptor.addChild(root_0, expression53.getTree());

					}
					break;

				default :
					break loop6;
				}
			}

			RPAREN54=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_print_statement1291); 
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
	// Neptune.g:159:1: read_statement : READ ^ LPAREN ! expression ( COMMA expression )* RPAREN !;
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
			// Neptune.g:160:2: ( READ ^ LPAREN ! expression ( COMMA expression )* RPAREN !)
			// Neptune.g:160:4: READ ^ LPAREN ! expression ( COMMA expression )* RPAREN !
			{
			root_0 = (Object)adaptor.nil();


			READ55=(Token)match(input,READ,FOLLOW_READ_in_read_statement1304); 
			READ55_tree = (Object)adaptor.create(READ55);
			root_0 = (Object)adaptor.becomeRoot(READ55_tree, root_0);

			LPAREN56=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_read_statement1307); 
			pushFollow(FOLLOW_expression_in_read_statement1310);
			expression57=expression();
			state._fsp--;

			adaptor.addChild(root_0, expression57.getTree());

			// Neptune.g:160:29: ( COMMA expression )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==COMMA) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// Neptune.g:160:30: COMMA expression
					{
					COMMA58=(Token)match(input,COMMA,FOLLOW_COMMA_in_read_statement1313); 
					COMMA58_tree = (Object)adaptor.create(COMMA58);
					adaptor.addChild(root_0, COMMA58_tree);

					pushFollow(FOLLOW_expression_in_read_statement1315);
					expression59=expression();
					state._fsp--;

					adaptor.addChild(root_0, expression59.getTree());

					}
					break;

				default :
					break loop7;
				}
			}

			RPAREN60=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_read_statement1319); 
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
	// Neptune.g:163:1: declaration : ( type IDENTIFIER ( BECOMES expression )? -> ^( VAR type IDENTIFIER ( BECOMES expression )? ) | CONST ^ type IDENTIFIER BECOMES expression );
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
			// Neptune.g:164:2: ( type IDENTIFIER ( BECOMES expression )? -> ^( VAR type IDENTIFIER ( BECOMES expression )? ) | CONST ^ type IDENTIFIER BECOMES expression )
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
					// Neptune.g:164:4: type IDENTIFIER ( BECOMES expression )?
					{
					pushFollow(FOLLOW_type_in_declaration1332);
					type61=type();
					state._fsp--;

					stream_type.add(type61.getTree());
					IDENTIFIER62=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_declaration1334);  
					stream_IDENTIFIER.add(IDENTIFIER62);

					// Neptune.g:164:20: ( BECOMES expression )?
					int alt8=2;
					int LA8_0 = input.LA(1);
					if ( (LA8_0==BECOMES) ) {
						alt8=1;
					}
					switch (alt8) {
						case 1 :
							// Neptune.g:164:21: BECOMES expression
							{
							BECOMES63=(Token)match(input,BECOMES,FOLLOW_BECOMES_in_declaration1337);  
							stream_BECOMES.add(BECOMES63);

							pushFollow(FOLLOW_expression_in_declaration1339);
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
					// 165:3: -> ^( VAR type IDENTIFIER ( BECOMES expression )? )
					{
						// Neptune.g:165:6: ^( VAR type IDENTIFIER ( BECOMES expression )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VAR, "VAR"), root_1);
						adaptor.addChild(root_1, stream_type.nextTree());
						adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
						// Neptune.g:165:28: ( BECOMES expression )?
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
					// Neptune.g:166:4: CONST ^ type IDENTIFIER BECOMES expression
					{
					root_0 = (Object)adaptor.nil();


					CONST65=(Token)match(input,CONST,FOLLOW_CONST_in_declaration1365); 
					CONST65_tree = (Object)adaptor.create(CONST65);
					root_0 = (Object)adaptor.becomeRoot(CONST65_tree, root_0);

					pushFollow(FOLLOW_type_in_declaration1368);
					type66=type();
					state._fsp--;

					adaptor.addChild(root_0, type66.getTree());

					IDENTIFIER67=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_declaration1370); 
					IDENTIFIER67_tree = (Object)adaptor.create(IDENTIFIER67);
					adaptor.addChild(root_0, IDENTIFIER67_tree);

					BECOMES68=(Token)match(input,BECOMES,FOLLOW_BECOMES_in_declaration1372); 
					BECOMES68_tree = (Object)adaptor.create(BECOMES68);
					adaptor.addChild(root_0, BECOMES68_tree);

					pushFollow(FOLLOW_expression_in_declaration1374);
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
	// Neptune.g:169:1: expression : assignment_expr ;
	public final NeptuneParser.expression_return expression() throws RecognitionException {
		NeptuneParser.expression_return retval = new NeptuneParser.expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope assignment_expr70 =null;


		try {
			// Neptune.g:170:2: ( assignment_expr )
			// Neptune.g:170:4: assignment_expr
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_assignment_expr_in_expression1386);
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
	// Neptune.g:173:1: assignment_expr : boolean_expr ( BECOMES ^ assignment_expr )? ;
	public final NeptuneParser.assignment_expr_return assignment_expr() throws RecognitionException {
		NeptuneParser.assignment_expr_return retval = new NeptuneParser.assignment_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token BECOMES72=null;
		ParserRuleReturnScope boolean_expr71 =null;
		ParserRuleReturnScope assignment_expr73 =null;

		Object BECOMES72_tree=null;

		try {
			// Neptune.g:174:2: ( boolean_expr ( BECOMES ^ assignment_expr )? )
			// Neptune.g:174:4: boolean_expr ( BECOMES ^ assignment_expr )?
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_boolean_expr_in_assignment_expr1397);
			boolean_expr71=boolean_expr();
			state._fsp--;

			adaptor.addChild(root_0, boolean_expr71.getTree());

			// Neptune.g:174:17: ( BECOMES ^ assignment_expr )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==BECOMES) ) {
				alt10=1;
			}
			switch (alt10) {
				case 1 :
					// Neptune.g:174:18: BECOMES ^ assignment_expr
					{
					BECOMES72=(Token)match(input,BECOMES,FOLLOW_BECOMES_in_assignment_expr1400); 
					BECOMES72_tree = (Object)adaptor.create(BECOMES72);
					root_0 = (Object)adaptor.becomeRoot(BECOMES72_tree, root_0);

					pushFollow(FOLLOW_assignment_expr_in_assignment_expr1403);
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


	public static class boolean_expr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "boolean_expr"
	// Neptune.g:177:1: boolean_expr : plus_expr ( ( LT ^| LT_EQ ^| GT ^| GT_EQ ^| EQ ^| NEQ ^) plus_expr )* ;
	public final NeptuneParser.boolean_expr_return boolean_expr() throws RecognitionException {
		NeptuneParser.boolean_expr_return retval = new NeptuneParser.boolean_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token LT75=null;
		Token LT_EQ76=null;
		Token GT77=null;
		Token GT_EQ78=null;
		Token EQ79=null;
		Token NEQ80=null;
		ParserRuleReturnScope plus_expr74 =null;
		ParserRuleReturnScope plus_expr81 =null;

		Object LT75_tree=null;
		Object LT_EQ76_tree=null;
		Object GT77_tree=null;
		Object GT_EQ78_tree=null;
		Object EQ79_tree=null;
		Object NEQ80_tree=null;

		try {
			// Neptune.g:178:2: ( plus_expr ( ( LT ^| LT_EQ ^| GT ^| GT_EQ ^| EQ ^| NEQ ^) plus_expr )* )
			// Neptune.g:178:4: plus_expr ( ( LT ^| LT_EQ ^| GT ^| GT_EQ ^| EQ ^| NEQ ^) plus_expr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_plus_expr_in_boolean_expr1417);
			plus_expr74=plus_expr();
			state._fsp--;

			adaptor.addChild(root_0, plus_expr74.getTree());

			// Neptune.g:178:14: ( ( LT ^| LT_EQ ^| GT ^| GT_EQ ^| EQ ^| NEQ ^) plus_expr )*
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( (LA12_0==EQ||(LA12_0 >= GT && LA12_0 <= GT_EQ)||(LA12_0 >= LT && LA12_0 <= LT_EQ)||LA12_0==NEQ) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// Neptune.g:178:15: ( LT ^| LT_EQ ^| GT ^| GT_EQ ^| EQ ^| NEQ ^) plus_expr
					{
					// Neptune.g:178:15: ( LT ^| LT_EQ ^| GT ^| GT_EQ ^| EQ ^| NEQ ^)
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
							// Neptune.g:178:16: LT ^
							{
							LT75=(Token)match(input,LT,FOLLOW_LT_in_boolean_expr1421); 
							LT75_tree = (Object)adaptor.create(LT75);
							root_0 = (Object)adaptor.becomeRoot(LT75_tree, root_0);

							}
							break;
						case 2 :
							// Neptune.g:178:22: LT_EQ ^
							{
							LT_EQ76=(Token)match(input,LT_EQ,FOLLOW_LT_EQ_in_boolean_expr1426); 
							LT_EQ76_tree = (Object)adaptor.create(LT_EQ76);
							root_0 = (Object)adaptor.becomeRoot(LT_EQ76_tree, root_0);

							}
							break;
						case 3 :
							// Neptune.g:178:31: GT ^
							{
							GT77=(Token)match(input,GT,FOLLOW_GT_in_boolean_expr1431); 
							GT77_tree = (Object)adaptor.create(GT77);
							root_0 = (Object)adaptor.becomeRoot(GT77_tree, root_0);

							}
							break;
						case 4 :
							// Neptune.g:178:37: GT_EQ ^
							{
							GT_EQ78=(Token)match(input,GT_EQ,FOLLOW_GT_EQ_in_boolean_expr1436); 
							GT_EQ78_tree = (Object)adaptor.create(GT_EQ78);
							root_0 = (Object)adaptor.becomeRoot(GT_EQ78_tree, root_0);

							}
							break;
						case 5 :
							// Neptune.g:178:46: EQ ^
							{
							EQ79=(Token)match(input,EQ,FOLLOW_EQ_in_boolean_expr1441); 
							EQ79_tree = (Object)adaptor.create(EQ79);
							root_0 = (Object)adaptor.becomeRoot(EQ79_tree, root_0);

							}
							break;
						case 6 :
							// Neptune.g:178:52: NEQ ^
							{
							NEQ80=(Token)match(input,NEQ,FOLLOW_NEQ_in_boolean_expr1446); 
							NEQ80_tree = (Object)adaptor.create(NEQ80);
							root_0 = (Object)adaptor.becomeRoot(NEQ80_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_plus_expr_in_boolean_expr1450);
					plus_expr81=plus_expr();
					state._fsp--;

					adaptor.addChild(root_0, plus_expr81.getTree());

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
	// Neptune.g:181:1: plus_expr : multi_expr ( ( PLUS ^| MINUS ^) multi_expr )* ;
	public final NeptuneParser.plus_expr_return plus_expr() throws RecognitionException {
		NeptuneParser.plus_expr_return retval = new NeptuneParser.plus_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token PLUS83=null;
		Token MINUS84=null;
		ParserRuleReturnScope multi_expr82 =null;
		ParserRuleReturnScope multi_expr85 =null;

		Object PLUS83_tree=null;
		Object MINUS84_tree=null;

		try {
			// Neptune.g:182:2: ( multi_expr ( ( PLUS ^| MINUS ^) multi_expr )* )
			// Neptune.g:182:4: multi_expr ( ( PLUS ^| MINUS ^) multi_expr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_multi_expr_in_plus_expr1463);
			multi_expr82=multi_expr();
			state._fsp--;

			adaptor.addChild(root_0, multi_expr82.getTree());

			// Neptune.g:182:15: ( ( PLUS ^| MINUS ^) multi_expr )*
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( (LA14_0==MINUS||LA14_0==PLUS) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// Neptune.g:182:16: ( PLUS ^| MINUS ^) multi_expr
					{
					// Neptune.g:182:16: ( PLUS ^| MINUS ^)
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
							// Neptune.g:182:17: PLUS ^
							{
							PLUS83=(Token)match(input,PLUS,FOLLOW_PLUS_in_plus_expr1467); 
							PLUS83_tree = (Object)adaptor.create(PLUS83);
							root_0 = (Object)adaptor.becomeRoot(PLUS83_tree, root_0);

							}
							break;
						case 2 :
							// Neptune.g:182:25: MINUS ^
							{
							MINUS84=(Token)match(input,MINUS,FOLLOW_MINUS_in_plus_expr1472); 
							MINUS84_tree = (Object)adaptor.create(MINUS84);
							root_0 = (Object)adaptor.becomeRoot(MINUS84_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_multi_expr_in_plus_expr1476);
					multi_expr85=multi_expr();
					state._fsp--;

					adaptor.addChild(root_0, multi_expr85.getTree());

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
	// Neptune.g:185:1: multi_expr : operand ( ( TIMES ^| DIVIDE ^) operand )* ;
	public final NeptuneParser.multi_expr_return multi_expr() throws RecognitionException {
		NeptuneParser.multi_expr_return retval = new NeptuneParser.multi_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token TIMES87=null;
		Token DIVIDE88=null;
		ParserRuleReturnScope operand86 =null;
		ParserRuleReturnScope operand89 =null;

		Object TIMES87_tree=null;
		Object DIVIDE88_tree=null;

		try {
			// Neptune.g:186:2: ( operand ( ( TIMES ^| DIVIDE ^) operand )* )
			// Neptune.g:186:4: operand ( ( TIMES ^| DIVIDE ^) operand )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_operand_in_multi_expr1489);
			operand86=operand();
			state._fsp--;

			adaptor.addChild(root_0, operand86.getTree());

			// Neptune.g:186:12: ( ( TIMES ^| DIVIDE ^) operand )*
			loop16:
			while (true) {
				int alt16=2;
				int LA16_0 = input.LA(1);
				if ( (LA16_0==DIVIDE||LA16_0==TIMES) ) {
					alt16=1;
				}

				switch (alt16) {
				case 1 :
					// Neptune.g:186:13: ( TIMES ^| DIVIDE ^) operand
					{
					// Neptune.g:186:13: ( TIMES ^| DIVIDE ^)
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
							// Neptune.g:186:14: TIMES ^
							{
							TIMES87=(Token)match(input,TIMES,FOLLOW_TIMES_in_multi_expr1493); 
							TIMES87_tree = (Object)adaptor.create(TIMES87);
							root_0 = (Object)adaptor.becomeRoot(TIMES87_tree, root_0);

							}
							break;
						case 2 :
							// Neptune.g:186:23: DIVIDE ^
							{
							DIVIDE88=(Token)match(input,DIVIDE,FOLLOW_DIVIDE_in_multi_expr1498); 
							DIVIDE88_tree = (Object)adaptor.create(DIVIDE88);
							root_0 = (Object)adaptor.becomeRoot(DIVIDE88_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_operand_in_multi_expr1502);
					operand89=operand();
					state._fsp--;

					adaptor.addChild(root_0, operand89.getTree());

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
	// Neptune.g:189:1: operand : ( IDENTIFIER | NUMBER | LPAREN ! assignment_expr RPAREN !| LBRACKET expression ( COMMA expression )* RBRACKET -> ^( ARRAY_SET ( expression )+ ) | print_statement | read_statement | ( TRUE | FALSE ) | CHAR_LITERAL | STRING_LITERAL | codeblock );
	public final NeptuneParser.operand_return operand() throws RecognitionException {
		NeptuneParser.operand_return retval = new NeptuneParser.operand_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IDENTIFIER90=null;
		Token NUMBER91=null;
		Token LPAREN92=null;
		Token RPAREN94=null;
		Token LBRACKET95=null;
		Token COMMA97=null;
		Token RBRACKET99=null;
		Token set102=null;
		Token CHAR_LITERAL103=null;
		Token STRING_LITERAL104=null;
		ParserRuleReturnScope assignment_expr93 =null;
		ParserRuleReturnScope expression96 =null;
		ParserRuleReturnScope expression98 =null;
		ParserRuleReturnScope print_statement100 =null;
		ParserRuleReturnScope read_statement101 =null;
		ParserRuleReturnScope codeblock105 =null;

		Object IDENTIFIER90_tree=null;
		Object NUMBER91_tree=null;
		Object LPAREN92_tree=null;
		Object RPAREN94_tree=null;
		Object LBRACKET95_tree=null;
		Object COMMA97_tree=null;
		Object RBRACKET99_tree=null;
		Object set102_tree=null;
		Object CHAR_LITERAL103_tree=null;
		Object STRING_LITERAL104_tree=null;
		RewriteRuleTokenStream stream_LBRACKET=new RewriteRuleTokenStream(adaptor,"token LBRACKET");
		RewriteRuleTokenStream stream_RBRACKET=new RewriteRuleTokenStream(adaptor,"token RBRACKET");
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try {
			// Neptune.g:190:5: ( IDENTIFIER | NUMBER | LPAREN ! assignment_expr RPAREN !| LBRACKET expression ( COMMA expression )* RBRACKET -> ^( ARRAY_SET ( expression )+ ) | print_statement | read_statement | ( TRUE | FALSE ) | CHAR_LITERAL | STRING_LITERAL | codeblock )
			int alt18=10;
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
			case LBRACKET:
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
			case LCURLY:
				{
				alt18=10;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 18, 0, input);
				throw nvae;
			}
			switch (alt18) {
				case 1 :
					// Neptune.g:190:9: IDENTIFIER
					{
					root_0 = (Object)adaptor.nil();


					IDENTIFIER90=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_operand1520); 
					IDENTIFIER90_tree = (Object)adaptor.create(IDENTIFIER90);
					adaptor.addChild(root_0, IDENTIFIER90_tree);

					}
					break;
				case 2 :
					// Neptune.g:191:9: NUMBER
					{
					root_0 = (Object)adaptor.nil();


					NUMBER91=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_operand1530); 
					NUMBER91_tree = (Object)adaptor.create(NUMBER91);
					adaptor.addChild(root_0, NUMBER91_tree);

					}
					break;
				case 3 :
					// Neptune.g:192:9: LPAREN ! assignment_expr RPAREN !
					{
					root_0 = (Object)adaptor.nil();


					LPAREN92=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_operand1540); 
					pushFollow(FOLLOW_assignment_expr_in_operand1543);
					assignment_expr93=assignment_expr();
					state._fsp--;

					adaptor.addChild(root_0, assignment_expr93.getTree());

					RPAREN94=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_operand1545); 
					}
					break;
				case 4 :
					// Neptune.g:193:4: LBRACKET expression ( COMMA expression )* RBRACKET
					{
					LBRACKET95=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_operand1551);  
					stream_LBRACKET.add(LBRACKET95);

					pushFollow(FOLLOW_expression_in_operand1553);
					expression96=expression();
					state._fsp--;

					stream_expression.add(expression96.getTree());
					// Neptune.g:193:24: ( COMMA expression )*
					loop17:
					while (true) {
						int alt17=2;
						int LA17_0 = input.LA(1);
						if ( (LA17_0==COMMA) ) {
							alt17=1;
						}

						switch (alt17) {
						case 1 :
							// Neptune.g:193:25: COMMA expression
							{
							COMMA97=(Token)match(input,COMMA,FOLLOW_COMMA_in_operand1556);  
							stream_COMMA.add(COMMA97);

							pushFollow(FOLLOW_expression_in_operand1558);
							expression98=expression();
							state._fsp--;

							stream_expression.add(expression98.getTree());
							}
							break;

						default :
							break loop17;
						}
					}

					RBRACKET99=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_operand1562);  
					stream_RBRACKET.add(RBRACKET99);

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
					// 194:3: -> ^( ARRAY_SET ( expression )+ )
					{
						// Neptune.g:194:6: ^( ARRAY_SET ( expression )+ )
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
					// Neptune.g:195:4: print_statement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_print_statement_in_operand1578);
					print_statement100=print_statement();
					state._fsp--;

					adaptor.addChild(root_0, print_statement100.getTree());

					}
					break;
				case 6 :
					// Neptune.g:196:4: read_statement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_read_statement_in_operand1583);
					read_statement101=read_statement();
					state._fsp--;

					adaptor.addChild(root_0, read_statement101.getTree());

					}
					break;
				case 7 :
					// Neptune.g:197:4: ( TRUE | FALSE )
					{
					root_0 = (Object)adaptor.nil();


					set102=input.LT(1);
					if ( input.LA(1)==FALSE||input.LA(1)==TRUE ) {
						input.consume();
						adaptor.addChild(root_0, (Object)adaptor.create(set102));
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					}
					break;
				case 8 :
					// Neptune.g:198:4: CHAR_LITERAL
					{
					root_0 = (Object)adaptor.nil();


					CHAR_LITERAL103=(Token)match(input,CHAR_LITERAL,FOLLOW_CHAR_LITERAL_in_operand1599); 
					CHAR_LITERAL103_tree = (Object)adaptor.create(CHAR_LITERAL103);
					adaptor.addChild(root_0, CHAR_LITERAL103_tree);

					}
					break;
				case 9 :
					// Neptune.g:199:4: STRING_LITERAL
					{
					root_0 = (Object)adaptor.nil();


					STRING_LITERAL104=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_operand1604); 
					STRING_LITERAL104_tree = (Object)adaptor.create(STRING_LITERAL104);
					adaptor.addChild(root_0, STRING_LITERAL104_tree);

					}
					break;
				case 10 :
					// Neptune.g:200:4: codeblock
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_codeblock_in_operand1609);
					codeblock105=codeblock();
					state._fsp--;

					adaptor.addChild(root_0, codeblock105.getTree());

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
	// Neptune.g:203:1: type : ( INTEGER ( array_def )? | CHAR ( array_def )? | BOOLEAN ( array_def )? );
	public final NeptuneParser.type_return type() throws RecognitionException {
		NeptuneParser.type_return retval = new NeptuneParser.type_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token INTEGER106=null;
		Token CHAR108=null;
		Token BOOLEAN110=null;
		ParserRuleReturnScope array_def107 =null;
		ParserRuleReturnScope array_def109 =null;
		ParserRuleReturnScope array_def111 =null;

		Object INTEGER106_tree=null;
		Object CHAR108_tree=null;
		Object BOOLEAN110_tree=null;

		try {
			// Neptune.g:204:2: ( INTEGER ( array_def )? | CHAR ( array_def )? | BOOLEAN ( array_def )? )
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
					// Neptune.g:204:4: INTEGER ( array_def )?
					{
					root_0 = (Object)adaptor.nil();


					INTEGER106=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_type1623); 
					INTEGER106_tree = (Object)adaptor.create(INTEGER106);
					adaptor.addChild(root_0, INTEGER106_tree);

					// Neptune.g:204:12: ( array_def )?
					int alt19=2;
					int LA19_0 = input.LA(1);
					if ( (LA19_0==LBRACKET) ) {
						alt19=1;
					}
					switch (alt19) {
						case 1 :
							// Neptune.g:204:12: array_def
							{
							pushFollow(FOLLOW_array_def_in_type1625);
							array_def107=array_def();
							state._fsp--;

							adaptor.addChild(root_0, array_def107.getTree());

							}
							break;

					}

					}
					break;
				case 2 :
					// Neptune.g:205:4: CHAR ( array_def )?
					{
					root_0 = (Object)adaptor.nil();


					CHAR108=(Token)match(input,CHAR,FOLLOW_CHAR_in_type1631); 
					CHAR108_tree = (Object)adaptor.create(CHAR108);
					adaptor.addChild(root_0, CHAR108_tree);

					// Neptune.g:205:9: ( array_def )?
					int alt20=2;
					int LA20_0 = input.LA(1);
					if ( (LA20_0==LBRACKET) ) {
						alt20=1;
					}
					switch (alt20) {
						case 1 :
							// Neptune.g:205:9: array_def
							{
							pushFollow(FOLLOW_array_def_in_type1633);
							array_def109=array_def();
							state._fsp--;

							adaptor.addChild(root_0, array_def109.getTree());

							}
							break;

					}

					}
					break;
				case 3 :
					// Neptune.g:206:4: BOOLEAN ( array_def )?
					{
					root_0 = (Object)adaptor.nil();


					BOOLEAN110=(Token)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_type1639); 
					BOOLEAN110_tree = (Object)adaptor.create(BOOLEAN110);
					adaptor.addChild(root_0, BOOLEAN110_tree);

					// Neptune.g:206:12: ( array_def )?
					int alt21=2;
					int LA21_0 = input.LA(1);
					if ( (LA21_0==LBRACKET) ) {
						alt21=1;
					}
					switch (alt21) {
						case 1 :
							// Neptune.g:206:12: array_def
							{
							pushFollow(FOLLOW_array_def_in_type1641);
							array_def111=array_def();
							state._fsp--;

							adaptor.addChild(root_0, array_def111.getTree());

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
	// Neptune.g:209:1: array_def : LBRACKET ( NUMBER )? RBRACKET ;
	public final NeptuneParser.array_def_return array_def() throws RecognitionException {
		NeptuneParser.array_def_return retval = new NeptuneParser.array_def_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token LBRACKET112=null;
		Token NUMBER113=null;
		Token RBRACKET114=null;

		Object LBRACKET112_tree=null;
		Object NUMBER113_tree=null;
		Object RBRACKET114_tree=null;

		try {
			// Neptune.g:210:2: ( LBRACKET ( NUMBER )? RBRACKET )
			// Neptune.g:210:5: LBRACKET ( NUMBER )? RBRACKET
			{
			root_0 = (Object)adaptor.nil();


			LBRACKET112=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_array_def1655); 
			LBRACKET112_tree = (Object)adaptor.create(LBRACKET112);
			adaptor.addChild(root_0, LBRACKET112_tree);

			// Neptune.g:210:14: ( NUMBER )?
			int alt23=2;
			int LA23_0 = input.LA(1);
			if ( (LA23_0==NUMBER) ) {
				alt23=1;
			}
			switch (alt23) {
				case 1 :
					// Neptune.g:210:14: NUMBER
					{
					NUMBER113=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_array_def1657); 
					NUMBER113_tree = (Object)adaptor.create(NUMBER113);
					adaptor.addChild(root_0, NUMBER113_tree);

					}
					break;

			}

			RBRACKET114=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_array_def1660); 
			RBRACKET114_tree = (Object)adaptor.create(RBRACKET114);
			adaptor.addChild(root_0, RBRACKET114_tree);

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
	public static final BitSet FOLLOW_line_in_lines1057 = new BitSet(new long[]{0x02488509D8C02382L});
	public static final BitSet FOLLOW_expression_in_line1070 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_line1072 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declaration_in_line1078 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_line1080 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_logic_statement_in_line1086 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LCURLY_in_codeblock1098 = new BitSet(new long[]{0x02488509D8C02380L});
	public static final BitSet FOLLOW_lines_in_codeblock1100 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_RCURLY_in_codeblock1102 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_while_statement_in_logic_statement1124 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_foreach_statement_in_logic_statement1129 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_if_statement_in_logic_statement1134 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHILE_in_while_statement1146 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_LPAREN_in_while_statement1149 = new BitSet(new long[]{0x0048850988400200L});
	public static final BitSet FOLLOW_expression_in_while_statement1152 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_while_statement1154 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_LCURLY_in_while_statement1157 = new BitSet(new long[]{0x02488509D8C02380L});
	public static final BitSet FOLLOW_lines_in_while_statement1160 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_RCURLY_in_while_statement1162 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FOREACH_in_foreach_statement1175 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_LPAREN_in_foreach_statement1178 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_foreach_statement1181 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_IN_in_foreach_statement1183 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_foreach_statement1186 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_foreach_statement1188 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_LCURLY_in_foreach_statement1191 = new BitSet(new long[]{0x02488509D8C02380L});
	public static final BitSet FOLLOW_lines_in_foreach_statement1194 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_RCURLY_in_foreach_statement1196 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_if_statement1209 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_LPAREN_in_if_statement1212 = new BitSet(new long[]{0x0048850988400200L});
	public static final BitSet FOLLOW_expression_in_if_statement1215 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_if_statement1217 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_LCURLY_in_if_statement1220 = new BitSet(new long[]{0x02488509D8C02380L});
	public static final BitSet FOLLOW_lines_in_if_statement1223 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_RCURLY_in_if_statement1225 = new BitSet(new long[]{0x0000000000180002L});
	public static final BitSet FOLLOW_ELSIF_in_if_statement1231 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_LPAREN_in_if_statement1233 = new BitSet(new long[]{0x0048850988400200L});
	public static final BitSet FOLLOW_expression_in_if_statement1236 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_if_statement1238 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_LCURLY_in_if_statement1241 = new BitSet(new long[]{0x02488509D8C02380L});
	public static final BitSet FOLLOW_lines_in_if_statement1244 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_RCURLY_in_if_statement1246 = new BitSet(new long[]{0x0000000000180002L});
	public static final BitSet FOLLOW_ELSE_in_if_statement1254 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_LCURLY_in_if_statement1256 = new BitSet(new long[]{0x02488509D8C02380L});
	public static final BitSet FOLLOW_lines_in_if_statement1259 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_RCURLY_in_if_statement1261 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRINT_in_print_statement1276 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_LPAREN_in_print_statement1279 = new BitSet(new long[]{0x0048850988400200L});
	public static final BitSet FOLLOW_expression_in_print_statement1282 = new BitSet(new long[]{0x0002000000000800L});
	public static final BitSet FOLLOW_COMMA_in_print_statement1285 = new BitSet(new long[]{0x0048850988400200L});
	public static final BitSet FOLLOW_expression_in_print_statement1287 = new BitSet(new long[]{0x0002000000000800L});
	public static final BitSet FOLLOW_RPAREN_in_print_statement1291 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_READ_in_read_statement1304 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_LPAREN_in_read_statement1307 = new BitSet(new long[]{0x0048850988400200L});
	public static final BitSet FOLLOW_expression_in_read_statement1310 = new BitSet(new long[]{0x0002000000000800L});
	public static final BitSet FOLLOW_COMMA_in_read_statement1313 = new BitSet(new long[]{0x0048850988400200L});
	public static final BitSet FOLLOW_expression_in_read_statement1315 = new BitSet(new long[]{0x0002000000000800L});
	public static final BitSet FOLLOW_RPAREN_in_read_statement1319 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_declaration1332 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_declaration1334 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_BECOMES_in_declaration1337 = new BitSet(new long[]{0x0048850988400200L});
	public static final BitSet FOLLOW_expression_in_declaration1339 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CONST_in_declaration1365 = new BitSet(new long[]{0x0000000040000180L});
	public static final BitSet FOLLOW_type_in_declaration1368 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_declaration1370 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_BECOMES_in_declaration1372 = new BitSet(new long[]{0x0048850988400200L});
	public static final BitSet FOLLOW_expression_in_declaration1374 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignment_expr_in_expression1386 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_boolean_expr_in_assignment_expr1397 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_BECOMES_in_assignment_expr1400 = new BitSet(new long[]{0x0048850988400200L});
	public static final BitSet FOLLOW_assignment_expr_in_assignment_expr1403 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_plus_expr_in_boolean_expr1417 = new BitSet(new long[]{0x000000B006200002L});
	public static final BitSet FOLLOW_LT_in_boolean_expr1421 = new BitSet(new long[]{0x0048850988400200L});
	public static final BitSet FOLLOW_LT_EQ_in_boolean_expr1426 = new BitSet(new long[]{0x0048850988400200L});
	public static final BitSet FOLLOW_GT_in_boolean_expr1431 = new BitSet(new long[]{0x0048850988400200L});
	public static final BitSet FOLLOW_GT_EQ_in_boolean_expr1436 = new BitSet(new long[]{0x0048850988400200L});
	public static final BitSet FOLLOW_EQ_in_boolean_expr1441 = new BitSet(new long[]{0x0048850988400200L});
	public static final BitSet FOLLOW_NEQ_in_boolean_expr1446 = new BitSet(new long[]{0x0048850988400200L});
	public static final BitSet FOLLOW_plus_expr_in_boolean_expr1450 = new BitSet(new long[]{0x000000B006200002L});
	public static final BitSet FOLLOW_multi_expr_in_plus_expr1463 = new BitSet(new long[]{0x0000024000000002L});
	public static final BitSet FOLLOW_PLUS_in_plus_expr1467 = new BitSet(new long[]{0x0048850988400200L});
	public static final BitSet FOLLOW_MINUS_in_plus_expr1472 = new BitSet(new long[]{0x0048850988400200L});
	public static final BitSet FOLLOW_multi_expr_in_plus_expr1476 = new BitSet(new long[]{0x0000024000000002L});
	public static final BitSet FOLLOW_operand_in_multi_expr1489 = new BitSet(new long[]{0x0020000000008002L});
	public static final BitSet FOLLOW_TIMES_in_multi_expr1493 = new BitSet(new long[]{0x0048850988400200L});
	public static final BitSet FOLLOW_DIVIDE_in_multi_expr1498 = new BitSet(new long[]{0x0048850988400200L});
	public static final BitSet FOLLOW_operand_in_multi_expr1502 = new BitSet(new long[]{0x0020000000008002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_operand1520 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMBER_in_operand1530 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_operand1540 = new BitSet(new long[]{0x0048850988400200L});
	public static final BitSet FOLLOW_assignment_expr_in_operand1543 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_operand1545 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACKET_in_operand1551 = new BitSet(new long[]{0x0048850988400200L});
	public static final BitSet FOLLOW_expression_in_operand1553 = new BitSet(new long[]{0x0000200000000800L});
	public static final BitSet FOLLOW_COMMA_in_operand1556 = new BitSet(new long[]{0x0048850988400200L});
	public static final BitSet FOLLOW_expression_in_operand1558 = new BitSet(new long[]{0x0000200000000800L});
	public static final BitSet FOLLOW_RBRACKET_in_operand1562 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_print_statement_in_operand1578 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_read_statement_in_operand1583 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_operand1588 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_LITERAL_in_operand1599 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_operand1604 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_codeblock_in_operand1609 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTEGER_in_type1623 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_array_def_in_type1625 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_in_type1631 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_array_def_in_type1633 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOLEAN_in_type1639 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_array_def_in_type1641 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACKET_in_array_def1655 = new BitSet(new long[]{0x0000210000000000L});
	public static final BitSet FOLLOW_NUMBER_in_array_def1657 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_RBRACKET_in_array_def1660 = new BitSet(new long[]{0x0000000000000002L});
}

// $ANTLR 3.5.2 antlr/Neptune.g 2014-06-19 15:58:57

package neptune;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class NeptuneParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ARRAY_DEF", "ARRAY_SET", "BECOMES", 
		"BLOCK", "BOOLEAN", "CHAR", "CHAR_LITERAL", "COLON", "COMMA", "COMMENT", 
		"CONST", "DIGIT", "DIVIDE", "DO", "DQUOTE", "DROPIN_STATEMENT", "ELSE", 
		"ELSIF", "EQ", "FALSE", "FOREACH", "FUNCTION", "GT", "GT_EQ", "IDENTIFIER", 
		"IF", "IN", "INTEGER", "LBRACKET", "LCURLY", "LETTER", "LOWER", "LPAREN", 
		"LT", "LT_EQ", "MINUS", "NEQ", "NUMBER", "PLUS", "PRINT", "PROGRAM", "QUOTE", 
		"RBRACKET", "RCURLY", "READ", "RETURN", "RPAREN", "SEMICOLON", "STRING_LITERAL", 
		"THEN", "TIMES", "TRUE", "UPPER", "VAR", "WHILE", "WS"
	};
	public static final int EOF=-1;
	public static final int ARRAY_DEF=4;
	public static final int ARRAY_SET=5;
	public static final int BECOMES=6;
	public static final int BLOCK=7;
	public static final int BOOLEAN=8;
	public static final int CHAR=9;
	public static final int CHAR_LITERAL=10;
	public static final int COLON=11;
	public static final int COMMA=12;
	public static final int COMMENT=13;
	public static final int CONST=14;
	public static final int DIGIT=15;
	public static final int DIVIDE=16;
	public static final int DO=17;
	public static final int DQUOTE=18;
	public static final int DROPIN_STATEMENT=19;
	public static final int ELSE=20;
	public static final int ELSIF=21;
	public static final int EQ=22;
	public static final int FALSE=23;
	public static final int FOREACH=24;
	public static final int FUNCTION=25;
	public static final int GT=26;
	public static final int GT_EQ=27;
	public static final int IDENTIFIER=28;
	public static final int IF=29;
	public static final int IN=30;
	public static final int INTEGER=31;
	public static final int LBRACKET=32;
	public static final int LCURLY=33;
	public static final int LETTER=34;
	public static final int LOWER=35;
	public static final int LPAREN=36;
	public static final int LT=37;
	public static final int LT_EQ=38;
	public static final int MINUS=39;
	public static final int NEQ=40;
	public static final int NUMBER=41;
	public static final int PLUS=42;
	public static final int PRINT=43;
	public static final int PROGRAM=44;
	public static final int QUOTE=45;
	public static final int RBRACKET=46;
	public static final int RCURLY=47;
	public static final int READ=48;
	public static final int RETURN=49;
	public static final int RPAREN=50;
	public static final int SEMICOLON=51;
	public static final int STRING_LITERAL=52;
	public static final int THEN=53;
	public static final int TIMES=54;
	public static final int TRUE=55;
	public static final int UPPER=56;
	public static final int VAR=57;
	public static final int WHILE=58;
	public static final int WS=59;

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
	// antlr/Neptune.g:116:1: program : lines EOF -> ^( PROGRAM lines ) ;
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
			// antlr/Neptune.g:117:5: ( lines EOF -> ^( PROGRAM lines ) )
			// antlr/Neptune.g:117:9: lines EOF
			{
			pushFollow(FOLLOW_lines_in_program1029);
			lines1=lines();
			state._fsp--;

			stream_lines.add(lines1.getTree());
			EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_program1031);  
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
			// 118:13: -> ^( PROGRAM lines )
			{
				// antlr/Neptune.g:118:17: ^( PROGRAM lines )
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
	// antlr/Neptune.g:121:1: lines : ( line )+ ;
	public final NeptuneParser.lines_return lines() throws RecognitionException {
		NeptuneParser.lines_return retval = new NeptuneParser.lines_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope line3 =null;


		try {
			// antlr/Neptune.g:122:2: ( ( line )+ )
			// antlr/Neptune.g:122:4: ( line )+
			{
			root_0 = (Object)adaptor.nil();


			// antlr/Neptune.g:122:4: ( line )+
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
					// antlr/Neptune.g:122:4: line
					{
					pushFollow(FOLLOW_line_in_lines1066);
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
	// antlr/Neptune.g:125:1: line : ( expression SEMICOLON !| declaration SEMICOLON !| logic_statement );
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
			// antlr/Neptune.g:126:2: ( expression SEMICOLON !| declaration SEMICOLON !| logic_statement )
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
					// antlr/Neptune.g:126:4: expression SEMICOLON !
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_expression_in_line1079);
					expression4=expression();
					state._fsp--;

					adaptor.addChild(root_0, expression4.getTree());

					SEMICOLON5=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_line1081); 
					}
					break;
				case 2 :
					// antlr/Neptune.g:127:4: declaration SEMICOLON !
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_declaration_in_line1087);
					declaration6=declaration();
					state._fsp--;

					adaptor.addChild(root_0, declaration6.getTree());

					SEMICOLON7=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_line1089); 
					}
					break;
				case 3 :
					// antlr/Neptune.g:128:4: logic_statement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_logic_statement_in_line1095);
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
	// antlr/Neptune.g:131:1: codeblock : LCURLY lines RCURLY -> ^( BLOCK lines ) ;
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
			// antlr/Neptune.g:132:2: ( LCURLY lines RCURLY -> ^( BLOCK lines ) )
			// antlr/Neptune.g:132:4: LCURLY lines RCURLY
			{
			LCURLY9=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_codeblock1107);  
			stream_LCURLY.add(LCURLY9);

			pushFollow(FOLLOW_lines_in_codeblock1109);
			lines10=lines();
			state._fsp--;

			stream_lines.add(lines10.getTree());
			RCURLY11=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_codeblock1111);  
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
			// 133:3: -> ^( BLOCK lines )
			{
				// antlr/Neptune.g:133:6: ^( BLOCK lines )
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
	// antlr/Neptune.g:136:1: logic_statement : ( while_statement | foreach_statement | if_statement );
	public final NeptuneParser.logic_statement_return logic_statement() throws RecognitionException {
		NeptuneParser.logic_statement_return retval = new NeptuneParser.logic_statement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope while_statement12 =null;
		ParserRuleReturnScope foreach_statement13 =null;
		ParserRuleReturnScope if_statement14 =null;


		try {
			// antlr/Neptune.g:137:2: ( while_statement | foreach_statement | if_statement )
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
					// antlr/Neptune.g:137:4: while_statement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_while_statement_in_logic_statement1133);
					while_statement12=while_statement();
					state._fsp--;

					adaptor.addChild(root_0, while_statement12.getTree());

					}
					break;
				case 2 :
					// antlr/Neptune.g:138:4: foreach_statement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_foreach_statement_in_logic_statement1138);
					foreach_statement13=foreach_statement();
					state._fsp--;

					adaptor.addChild(root_0, foreach_statement13.getTree());

					}
					break;
				case 3 :
					// antlr/Neptune.g:139:4: if_statement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_if_statement_in_logic_statement1143);
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
	// antlr/Neptune.g:142:1: while_statement : WHILE ^ LPAREN ! expression RPAREN ! LCURLY ! lines RCURLY !;
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
			// antlr/Neptune.g:143:2: ( WHILE ^ LPAREN ! expression RPAREN ! LCURLY ! lines RCURLY !)
			// antlr/Neptune.g:143:4: WHILE ^ LPAREN ! expression RPAREN ! LCURLY ! lines RCURLY !
			{
			root_0 = (Object)adaptor.nil();


			WHILE15=(Token)match(input,WHILE,FOLLOW_WHILE_in_while_statement1155); 
			WHILE15_tree = (Object)adaptor.create(WHILE15);
			root_0 = (Object)adaptor.becomeRoot(WHILE15_tree, root_0);

			LPAREN16=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_while_statement1158); 
			pushFollow(FOLLOW_expression_in_while_statement1161);
			expression17=expression();
			state._fsp--;

			adaptor.addChild(root_0, expression17.getTree());

			RPAREN18=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_while_statement1163); 
			LCURLY19=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_while_statement1166); 
			pushFollow(FOLLOW_lines_in_while_statement1169);
			lines20=lines();
			state._fsp--;

			adaptor.addChild(root_0, lines20.getTree());

			RCURLY21=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_while_statement1171); 
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
	// antlr/Neptune.g:146:1: foreach_statement : FOREACH ^ LPAREN ! IDENTIFIER IN ! IDENTIFIER RPAREN ! LCURLY ! lines RCURLY !;
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
			// antlr/Neptune.g:147:2: ( FOREACH ^ LPAREN ! IDENTIFIER IN ! IDENTIFIER RPAREN ! LCURLY ! lines RCURLY !)
			// antlr/Neptune.g:147:4: FOREACH ^ LPAREN ! IDENTIFIER IN ! IDENTIFIER RPAREN ! LCURLY ! lines RCURLY !
			{
			root_0 = (Object)adaptor.nil();


			FOREACH22=(Token)match(input,FOREACH,FOLLOW_FOREACH_in_foreach_statement1184); 
			FOREACH22_tree = (Object)adaptor.create(FOREACH22);
			root_0 = (Object)adaptor.becomeRoot(FOREACH22_tree, root_0);

			LPAREN23=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_foreach_statement1187); 
			IDENTIFIER24=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_foreach_statement1190); 
			IDENTIFIER24_tree = (Object)adaptor.create(IDENTIFIER24);
			adaptor.addChild(root_0, IDENTIFIER24_tree);

			IN25=(Token)match(input,IN,FOLLOW_IN_in_foreach_statement1192); 
			IDENTIFIER26=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_foreach_statement1195); 
			IDENTIFIER26_tree = (Object)adaptor.create(IDENTIFIER26);
			adaptor.addChild(root_0, IDENTIFIER26_tree);

			RPAREN27=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_foreach_statement1197); 
			LCURLY28=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_foreach_statement1200); 
			pushFollow(FOLLOW_lines_in_foreach_statement1203);
			lines29=lines();
			state._fsp--;

			adaptor.addChild(root_0, lines29.getTree());

			RCURLY30=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_foreach_statement1205); 
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
	// antlr/Neptune.g:150:1: if_statement : IF ^ LPAREN ! expression RPAREN ! LCURLY ! lines RCURLY ! ( ELSIF LPAREN ! expression RPAREN ! LCURLY ! lines RCURLY !)* ( ELSE LCURLY ! lines RCURLY !)? ;
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
			// antlr/Neptune.g:151:2: ( IF ^ LPAREN ! expression RPAREN ! LCURLY ! lines RCURLY ! ( ELSIF LPAREN ! expression RPAREN ! LCURLY ! lines RCURLY !)* ( ELSE LCURLY ! lines RCURLY !)? )
			// antlr/Neptune.g:151:4: IF ^ LPAREN ! expression RPAREN ! LCURLY ! lines RCURLY ! ( ELSIF LPAREN ! expression RPAREN ! LCURLY ! lines RCURLY !)* ( ELSE LCURLY ! lines RCURLY !)?
			{
			root_0 = (Object)adaptor.nil();


			IF31=(Token)match(input,IF,FOLLOW_IF_in_if_statement1218); 
			IF31_tree = (Object)adaptor.create(IF31);
			root_0 = (Object)adaptor.becomeRoot(IF31_tree, root_0);

			LPAREN32=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_if_statement1221); 
			pushFollow(FOLLOW_expression_in_if_statement1224);
			expression33=expression();
			state._fsp--;

			adaptor.addChild(root_0, expression33.getTree());

			RPAREN34=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_if_statement1226); 
			LCURLY35=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_if_statement1229); 
			pushFollow(FOLLOW_lines_in_if_statement1232);
			lines36=lines();
			state._fsp--;

			adaptor.addChild(root_0, lines36.getTree());

			RCURLY37=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_if_statement1234); 
			// antlr/Neptune.g:152:3: ( ELSIF LPAREN ! expression RPAREN ! LCURLY ! lines RCURLY !)*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==ELSIF) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// antlr/Neptune.g:152:4: ELSIF LPAREN ! expression RPAREN ! LCURLY ! lines RCURLY !
					{
					ELSIF38=(Token)match(input,ELSIF,FOLLOW_ELSIF_in_if_statement1240); 
					ELSIF38_tree = (Object)adaptor.create(ELSIF38);
					adaptor.addChild(root_0, ELSIF38_tree);

					LPAREN39=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_if_statement1242); 
					pushFollow(FOLLOW_expression_in_if_statement1245);
					expression40=expression();
					state._fsp--;

					adaptor.addChild(root_0, expression40.getTree());

					RPAREN41=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_if_statement1247); 
					LCURLY42=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_if_statement1250); 
					pushFollow(FOLLOW_lines_in_if_statement1253);
					lines43=lines();
					state._fsp--;

					adaptor.addChild(root_0, lines43.getTree());

					RCURLY44=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_if_statement1255); 
					}
					break;

				default :
					break loop4;
				}
			}

			// antlr/Neptune.g:153:3: ( ELSE LCURLY ! lines RCURLY !)?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==ELSE) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// antlr/Neptune.g:153:4: ELSE LCURLY ! lines RCURLY !
					{
					ELSE45=(Token)match(input,ELSE,FOLLOW_ELSE_in_if_statement1263); 
					ELSE45_tree = (Object)adaptor.create(ELSE45);
					adaptor.addChild(root_0, ELSE45_tree);

					LCURLY46=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_if_statement1265); 
					pushFollow(FOLLOW_lines_in_if_statement1268);
					lines47=lines();
					state._fsp--;

					adaptor.addChild(root_0, lines47.getTree());

					RCURLY48=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_if_statement1270); 
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
	// antlr/Neptune.g:156:1: print_statement : PRINT ^ LPAREN ! expression ( COMMA expression )* RPAREN !;
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
			// antlr/Neptune.g:157:2: ( PRINT ^ LPAREN ! expression ( COMMA expression )* RPAREN !)
			// antlr/Neptune.g:157:4: PRINT ^ LPAREN ! expression ( COMMA expression )* RPAREN !
			{
			root_0 = (Object)adaptor.nil();


			PRINT49=(Token)match(input,PRINT,FOLLOW_PRINT_in_print_statement1285); 
			PRINT49_tree = (Object)adaptor.create(PRINT49);
			root_0 = (Object)adaptor.becomeRoot(PRINT49_tree, root_0);

			LPAREN50=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_print_statement1288); 
			pushFollow(FOLLOW_expression_in_print_statement1291);
			expression51=expression();
			state._fsp--;

			adaptor.addChild(root_0, expression51.getTree());

			// antlr/Neptune.g:157:30: ( COMMA expression )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==COMMA) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// antlr/Neptune.g:157:31: COMMA expression
					{
					COMMA52=(Token)match(input,COMMA,FOLLOW_COMMA_in_print_statement1294); 
					COMMA52_tree = (Object)adaptor.create(COMMA52);
					adaptor.addChild(root_0, COMMA52_tree);

					pushFollow(FOLLOW_expression_in_print_statement1296);
					expression53=expression();
					state._fsp--;

					adaptor.addChild(root_0, expression53.getTree());

					}
					break;

				default :
					break loop6;
				}
			}

			RPAREN54=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_print_statement1300); 
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
	// antlr/Neptune.g:160:1: read_statement : READ ^ LPAREN ! expression ( COMMA expression )* RPAREN !;
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
			// antlr/Neptune.g:161:2: ( READ ^ LPAREN ! expression ( COMMA expression )* RPAREN !)
			// antlr/Neptune.g:161:4: READ ^ LPAREN ! expression ( COMMA expression )* RPAREN !
			{
			root_0 = (Object)adaptor.nil();


			READ55=(Token)match(input,READ,FOLLOW_READ_in_read_statement1313); 
			READ55_tree = (Object)adaptor.create(READ55);
			root_0 = (Object)adaptor.becomeRoot(READ55_tree, root_0);

			LPAREN56=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_read_statement1316); 
			pushFollow(FOLLOW_expression_in_read_statement1319);
			expression57=expression();
			state._fsp--;

			adaptor.addChild(root_0, expression57.getTree());

			// antlr/Neptune.g:161:29: ( COMMA expression )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==COMMA) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// antlr/Neptune.g:161:30: COMMA expression
					{
					COMMA58=(Token)match(input,COMMA,FOLLOW_COMMA_in_read_statement1322); 
					COMMA58_tree = (Object)adaptor.create(COMMA58);
					adaptor.addChild(root_0, COMMA58_tree);

					pushFollow(FOLLOW_expression_in_read_statement1324);
					expression59=expression();
					state._fsp--;

					adaptor.addChild(root_0, expression59.getTree());

					}
					break;

				default :
					break loop7;
				}
			}

			RPAREN60=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_read_statement1328); 
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
	// antlr/Neptune.g:164:1: declaration : ( type IDENTIFIER ( BECOMES expression )? -> ^( VAR type IDENTIFIER ( BECOMES expression )? ) | CONST ^ type IDENTIFIER BECOMES expression );
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
			// antlr/Neptune.g:165:2: ( type IDENTIFIER ( BECOMES expression )? -> ^( VAR type IDENTIFIER ( BECOMES expression )? ) | CONST ^ type IDENTIFIER BECOMES expression )
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
					// antlr/Neptune.g:165:4: type IDENTIFIER ( BECOMES expression )?
					{
					pushFollow(FOLLOW_type_in_declaration1341);
					type61=type();
					state._fsp--;

					stream_type.add(type61.getTree());
					IDENTIFIER62=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_declaration1343);  
					stream_IDENTIFIER.add(IDENTIFIER62);

					// antlr/Neptune.g:165:20: ( BECOMES expression )?
					int alt8=2;
					int LA8_0 = input.LA(1);
					if ( (LA8_0==BECOMES) ) {
						alt8=1;
					}
					switch (alt8) {
						case 1 :
							// antlr/Neptune.g:165:21: BECOMES expression
							{
							BECOMES63=(Token)match(input,BECOMES,FOLLOW_BECOMES_in_declaration1346);  
							stream_BECOMES.add(BECOMES63);

							pushFollow(FOLLOW_expression_in_declaration1348);
							expression64=expression();
							state._fsp--;

							stream_expression.add(expression64.getTree());
							}
							break;

					}

					// AST REWRITE
					// elements: IDENTIFIER, expression, BECOMES, type
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 166:3: -> ^( VAR type IDENTIFIER ( BECOMES expression )? )
					{
						// antlr/Neptune.g:166:6: ^( VAR type IDENTIFIER ( BECOMES expression )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VAR, "VAR"), root_1);
						adaptor.addChild(root_1, stream_type.nextTree());
						adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
						// antlr/Neptune.g:166:28: ( BECOMES expression )?
						if ( stream_expression.hasNext()||stream_BECOMES.hasNext() ) {
							adaptor.addChild(root_1, stream_BECOMES.nextNode());
							adaptor.addChild(root_1, stream_expression.nextTree());
						}
						stream_expression.reset();
						stream_BECOMES.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// antlr/Neptune.g:167:4: CONST ^ type IDENTIFIER BECOMES expression
					{
					root_0 = (Object)adaptor.nil();


					CONST65=(Token)match(input,CONST,FOLLOW_CONST_in_declaration1374); 
					CONST65_tree = (Object)adaptor.create(CONST65);
					root_0 = (Object)adaptor.becomeRoot(CONST65_tree, root_0);

					pushFollow(FOLLOW_type_in_declaration1377);
					type66=type();
					state._fsp--;

					adaptor.addChild(root_0, type66.getTree());

					IDENTIFIER67=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_declaration1379); 
					IDENTIFIER67_tree = (Object)adaptor.create(IDENTIFIER67);
					adaptor.addChild(root_0, IDENTIFIER67_tree);

					BECOMES68=(Token)match(input,BECOMES,FOLLOW_BECOMES_in_declaration1381); 
					BECOMES68_tree = (Object)adaptor.create(BECOMES68);
					adaptor.addChild(root_0, BECOMES68_tree);

					pushFollow(FOLLOW_expression_in_declaration1383);
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
	// antlr/Neptune.g:170:1: expression : assignment_expr ;
	public final NeptuneParser.expression_return expression() throws RecognitionException {
		NeptuneParser.expression_return retval = new NeptuneParser.expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope assignment_expr70 =null;


		try {
			// antlr/Neptune.g:171:2: ( assignment_expr )
			// antlr/Neptune.g:171:4: assignment_expr
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_assignment_expr_in_expression1395);
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
	// antlr/Neptune.g:174:1: assignment_expr : boolean_expr ( BECOMES ^ assignment_expr )? ;
	public final NeptuneParser.assignment_expr_return assignment_expr() throws RecognitionException {
		NeptuneParser.assignment_expr_return retval = new NeptuneParser.assignment_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token BECOMES72=null;
		ParserRuleReturnScope boolean_expr71 =null;
		ParserRuleReturnScope assignment_expr73 =null;

		Object BECOMES72_tree=null;

		try {
			// antlr/Neptune.g:175:2: ( boolean_expr ( BECOMES ^ assignment_expr )? )
			// antlr/Neptune.g:175:4: boolean_expr ( BECOMES ^ assignment_expr )?
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_boolean_expr_in_assignment_expr1406);
			boolean_expr71=boolean_expr();
			state._fsp--;

			adaptor.addChild(root_0, boolean_expr71.getTree());

			// antlr/Neptune.g:175:17: ( BECOMES ^ assignment_expr )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==BECOMES) ) {
				alt10=1;
			}
			switch (alt10) {
				case 1 :
					// antlr/Neptune.g:175:18: BECOMES ^ assignment_expr
					{
					BECOMES72=(Token)match(input,BECOMES,FOLLOW_BECOMES_in_assignment_expr1409); 
					BECOMES72_tree = (Object)adaptor.create(BECOMES72);
					root_0 = (Object)adaptor.becomeRoot(BECOMES72_tree, root_0);

					pushFollow(FOLLOW_assignment_expr_in_assignment_expr1412);
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
	// antlr/Neptune.g:178:1: boolean_expr : plus_expr ( ( LT ^| LT_EQ ^| GT ^| GT_EQ ^| EQ ^| NEQ ^) plus_expr )* ;
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
			// antlr/Neptune.g:179:2: ( plus_expr ( ( LT ^| LT_EQ ^| GT ^| GT_EQ ^| EQ ^| NEQ ^) plus_expr )* )
			// antlr/Neptune.g:179:4: plus_expr ( ( LT ^| LT_EQ ^| GT ^| GT_EQ ^| EQ ^| NEQ ^) plus_expr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_plus_expr_in_boolean_expr1426);
			plus_expr74=plus_expr();
			state._fsp--;

			adaptor.addChild(root_0, plus_expr74.getTree());

			// antlr/Neptune.g:179:14: ( ( LT ^| LT_EQ ^| GT ^| GT_EQ ^| EQ ^| NEQ ^) plus_expr )*
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( (LA12_0==EQ||(LA12_0 >= GT && LA12_0 <= GT_EQ)||(LA12_0 >= LT && LA12_0 <= LT_EQ)||LA12_0==NEQ) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// antlr/Neptune.g:179:15: ( LT ^| LT_EQ ^| GT ^| GT_EQ ^| EQ ^| NEQ ^) plus_expr
					{
					// antlr/Neptune.g:179:15: ( LT ^| LT_EQ ^| GT ^| GT_EQ ^| EQ ^| NEQ ^)
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
							// antlr/Neptune.g:179:16: LT ^
							{
							LT75=(Token)match(input,LT,FOLLOW_LT_in_boolean_expr1430); 
							LT75_tree = (Object)adaptor.create(LT75);
							root_0 = (Object)adaptor.becomeRoot(LT75_tree, root_0);

							}
							break;
						case 2 :
							// antlr/Neptune.g:179:22: LT_EQ ^
							{
							LT_EQ76=(Token)match(input,LT_EQ,FOLLOW_LT_EQ_in_boolean_expr1435); 
							LT_EQ76_tree = (Object)adaptor.create(LT_EQ76);
							root_0 = (Object)adaptor.becomeRoot(LT_EQ76_tree, root_0);

							}
							break;
						case 3 :
							// antlr/Neptune.g:179:31: GT ^
							{
							GT77=(Token)match(input,GT,FOLLOW_GT_in_boolean_expr1440); 
							GT77_tree = (Object)adaptor.create(GT77);
							root_0 = (Object)adaptor.becomeRoot(GT77_tree, root_0);

							}
							break;
						case 4 :
							// antlr/Neptune.g:179:37: GT_EQ ^
							{
							GT_EQ78=(Token)match(input,GT_EQ,FOLLOW_GT_EQ_in_boolean_expr1445); 
							GT_EQ78_tree = (Object)adaptor.create(GT_EQ78);
							root_0 = (Object)adaptor.becomeRoot(GT_EQ78_tree, root_0);

							}
							break;
						case 5 :
							// antlr/Neptune.g:179:46: EQ ^
							{
							EQ79=(Token)match(input,EQ,FOLLOW_EQ_in_boolean_expr1450); 
							EQ79_tree = (Object)adaptor.create(EQ79);
							root_0 = (Object)adaptor.becomeRoot(EQ79_tree, root_0);

							}
							break;
						case 6 :
							// antlr/Neptune.g:179:52: NEQ ^
							{
							NEQ80=(Token)match(input,NEQ,FOLLOW_NEQ_in_boolean_expr1455); 
							NEQ80_tree = (Object)adaptor.create(NEQ80);
							root_0 = (Object)adaptor.becomeRoot(NEQ80_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_plus_expr_in_boolean_expr1459);
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
	// antlr/Neptune.g:182:1: plus_expr : multi_expr ( ( PLUS ^| MINUS ^) multi_expr )* ;
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
			// antlr/Neptune.g:183:2: ( multi_expr ( ( PLUS ^| MINUS ^) multi_expr )* )
			// antlr/Neptune.g:183:4: multi_expr ( ( PLUS ^| MINUS ^) multi_expr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_multi_expr_in_plus_expr1472);
			multi_expr82=multi_expr();
			state._fsp--;

			adaptor.addChild(root_0, multi_expr82.getTree());

			// antlr/Neptune.g:183:15: ( ( PLUS ^| MINUS ^) multi_expr )*
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( (LA14_0==MINUS||LA14_0==PLUS) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// antlr/Neptune.g:183:16: ( PLUS ^| MINUS ^) multi_expr
					{
					// antlr/Neptune.g:183:16: ( PLUS ^| MINUS ^)
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
							// antlr/Neptune.g:183:17: PLUS ^
							{
							PLUS83=(Token)match(input,PLUS,FOLLOW_PLUS_in_plus_expr1476); 
							PLUS83_tree = (Object)adaptor.create(PLUS83);
							root_0 = (Object)adaptor.becomeRoot(PLUS83_tree, root_0);

							}
							break;
						case 2 :
							// antlr/Neptune.g:183:25: MINUS ^
							{
							MINUS84=(Token)match(input,MINUS,FOLLOW_MINUS_in_plus_expr1481); 
							MINUS84_tree = (Object)adaptor.create(MINUS84);
							root_0 = (Object)adaptor.becomeRoot(MINUS84_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_multi_expr_in_plus_expr1485);
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
	// antlr/Neptune.g:186:1: multi_expr : operand ( ( TIMES ^| DIVIDE ^) operand )* ;
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
			// antlr/Neptune.g:187:2: ( operand ( ( TIMES ^| DIVIDE ^) operand )* )
			// antlr/Neptune.g:187:4: operand ( ( TIMES ^| DIVIDE ^) operand )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_operand_in_multi_expr1498);
			operand86=operand();
			state._fsp--;

			adaptor.addChild(root_0, operand86.getTree());

			// antlr/Neptune.g:187:12: ( ( TIMES ^| DIVIDE ^) operand )*
			loop16:
			while (true) {
				int alt16=2;
				int LA16_0 = input.LA(1);
				if ( (LA16_0==DIVIDE||LA16_0==TIMES) ) {
					alt16=1;
				}

				switch (alt16) {
				case 1 :
					// antlr/Neptune.g:187:13: ( TIMES ^| DIVIDE ^) operand
					{
					// antlr/Neptune.g:187:13: ( TIMES ^| DIVIDE ^)
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
							// antlr/Neptune.g:187:14: TIMES ^
							{
							TIMES87=(Token)match(input,TIMES,FOLLOW_TIMES_in_multi_expr1502); 
							TIMES87_tree = (Object)adaptor.create(TIMES87);
							root_0 = (Object)adaptor.becomeRoot(TIMES87_tree, root_0);

							}
							break;
						case 2 :
							// antlr/Neptune.g:187:23: DIVIDE ^
							{
							DIVIDE88=(Token)match(input,DIVIDE,FOLLOW_DIVIDE_in_multi_expr1507); 
							DIVIDE88_tree = (Object)adaptor.create(DIVIDE88);
							root_0 = (Object)adaptor.becomeRoot(DIVIDE88_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_operand_in_multi_expr1511);
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
	// antlr/Neptune.g:190:1: operand : ( IDENTIFIER | NUMBER | LPAREN ! assignment_expr RPAREN !| LBRACKET expression ( COMMA expression )* RBRACKET -> ^( ARRAY_SET ( expression )+ ) | print_statement | read_statement | ( TRUE | FALSE ) | CHAR_LITERAL | STRING_LITERAL | codeblock );
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
			// antlr/Neptune.g:191:5: ( IDENTIFIER | NUMBER | LPAREN ! assignment_expr RPAREN !| LBRACKET expression ( COMMA expression )* RBRACKET -> ^( ARRAY_SET ( expression )+ ) | print_statement | read_statement | ( TRUE | FALSE ) | CHAR_LITERAL | STRING_LITERAL | codeblock )
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
					// antlr/Neptune.g:191:9: IDENTIFIER
					{
					root_0 = (Object)adaptor.nil();


					IDENTIFIER90=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_operand1529); 
					IDENTIFIER90_tree = (Object)adaptor.create(IDENTIFIER90);
					adaptor.addChild(root_0, IDENTIFIER90_tree);

					}
					break;
				case 2 :
					// antlr/Neptune.g:192:9: NUMBER
					{
					root_0 = (Object)adaptor.nil();


					NUMBER91=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_operand1539); 
					NUMBER91_tree = (Object)adaptor.create(NUMBER91);
					adaptor.addChild(root_0, NUMBER91_tree);

					}
					break;
				case 3 :
					// antlr/Neptune.g:193:9: LPAREN ! assignment_expr RPAREN !
					{
					root_0 = (Object)adaptor.nil();


					LPAREN92=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_operand1549); 
					pushFollow(FOLLOW_assignment_expr_in_operand1552);
					assignment_expr93=assignment_expr();
					state._fsp--;

					adaptor.addChild(root_0, assignment_expr93.getTree());

					RPAREN94=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_operand1554); 
					}
					break;
				case 4 :
					// antlr/Neptune.g:194:4: LBRACKET expression ( COMMA expression )* RBRACKET
					{
					LBRACKET95=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_operand1560);  
					stream_LBRACKET.add(LBRACKET95);

					pushFollow(FOLLOW_expression_in_operand1562);
					expression96=expression();
					state._fsp--;

					stream_expression.add(expression96.getTree());
					// antlr/Neptune.g:194:24: ( COMMA expression )*
					loop17:
					while (true) {
						int alt17=2;
						int LA17_0 = input.LA(1);
						if ( (LA17_0==COMMA) ) {
							alt17=1;
						}

						switch (alt17) {
						case 1 :
							// antlr/Neptune.g:194:25: COMMA expression
							{
							COMMA97=(Token)match(input,COMMA,FOLLOW_COMMA_in_operand1565);  
							stream_COMMA.add(COMMA97);

							pushFollow(FOLLOW_expression_in_operand1567);
							expression98=expression();
							state._fsp--;

							stream_expression.add(expression98.getTree());
							}
							break;

						default :
							break loop17;
						}
					}

					RBRACKET99=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_operand1571);  
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
					// 195:3: -> ^( ARRAY_SET ( expression )+ )
					{
						// antlr/Neptune.g:195:6: ^( ARRAY_SET ( expression )+ )
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
					// antlr/Neptune.g:196:4: print_statement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_print_statement_in_operand1587);
					print_statement100=print_statement();
					state._fsp--;

					adaptor.addChild(root_0, print_statement100.getTree());

					}
					break;
				case 6 :
					// antlr/Neptune.g:197:4: read_statement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_read_statement_in_operand1592);
					read_statement101=read_statement();
					state._fsp--;

					adaptor.addChild(root_0, read_statement101.getTree());

					}
					break;
				case 7 :
					// antlr/Neptune.g:198:4: ( TRUE | FALSE )
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
					// antlr/Neptune.g:199:4: CHAR_LITERAL
					{
					root_0 = (Object)adaptor.nil();


					CHAR_LITERAL103=(Token)match(input,CHAR_LITERAL,FOLLOW_CHAR_LITERAL_in_operand1608); 
					CHAR_LITERAL103_tree = (Object)adaptor.create(CHAR_LITERAL103);
					adaptor.addChild(root_0, CHAR_LITERAL103_tree);

					}
					break;
				case 9 :
					// antlr/Neptune.g:200:4: STRING_LITERAL
					{
					root_0 = (Object)adaptor.nil();


					STRING_LITERAL104=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_operand1613); 
					STRING_LITERAL104_tree = (Object)adaptor.create(STRING_LITERAL104);
					adaptor.addChild(root_0, STRING_LITERAL104_tree);

					}
					break;
				case 10 :
					// antlr/Neptune.g:201:4: codeblock
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_codeblock_in_operand1618);
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
	// antlr/Neptune.g:204:1: type : ( INTEGER ( array_def )? | CHAR ( array_def )? | BOOLEAN ( array_def )? );
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
			// antlr/Neptune.g:205:2: ( INTEGER ( array_def )? | CHAR ( array_def )? | BOOLEAN ( array_def )? )
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
					// antlr/Neptune.g:205:4: INTEGER ( array_def )?
					{
					root_0 = (Object)adaptor.nil();


					INTEGER106=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_type1632); 
					INTEGER106_tree = (Object)adaptor.create(INTEGER106);
					adaptor.addChild(root_0, INTEGER106_tree);

					// antlr/Neptune.g:205:12: ( array_def )?
					int alt19=2;
					int LA19_0 = input.LA(1);
					if ( (LA19_0==LBRACKET) ) {
						alt19=1;
					}
					switch (alt19) {
						case 1 :
							// antlr/Neptune.g:205:12: array_def
							{
							pushFollow(FOLLOW_array_def_in_type1634);
							array_def107=array_def();
							state._fsp--;

							adaptor.addChild(root_0, array_def107.getTree());

							}
							break;

					}

					}
					break;
				case 2 :
					// antlr/Neptune.g:206:4: CHAR ( array_def )?
					{
					root_0 = (Object)adaptor.nil();


					CHAR108=(Token)match(input,CHAR,FOLLOW_CHAR_in_type1640); 
					CHAR108_tree = (Object)adaptor.create(CHAR108);
					adaptor.addChild(root_0, CHAR108_tree);

					// antlr/Neptune.g:206:9: ( array_def )?
					int alt20=2;
					int LA20_0 = input.LA(1);
					if ( (LA20_0==LBRACKET) ) {
						alt20=1;
					}
					switch (alt20) {
						case 1 :
							// antlr/Neptune.g:206:9: array_def
							{
							pushFollow(FOLLOW_array_def_in_type1642);
							array_def109=array_def();
							state._fsp--;

							adaptor.addChild(root_0, array_def109.getTree());

							}
							break;

					}

					}
					break;
				case 3 :
					// antlr/Neptune.g:207:4: BOOLEAN ( array_def )?
					{
					root_0 = (Object)adaptor.nil();


					BOOLEAN110=(Token)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_type1648); 
					BOOLEAN110_tree = (Object)adaptor.create(BOOLEAN110);
					adaptor.addChild(root_0, BOOLEAN110_tree);

					// antlr/Neptune.g:207:12: ( array_def )?
					int alt21=2;
					int LA21_0 = input.LA(1);
					if ( (LA21_0==LBRACKET) ) {
						alt21=1;
					}
					switch (alt21) {
						case 1 :
							// antlr/Neptune.g:207:12: array_def
							{
							pushFollow(FOLLOW_array_def_in_type1650);
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
	// antlr/Neptune.g:210:1: array_def : LBRACKET NUMBER RBRACKET -> ^( ARRAY_DEF NUMBER ) ;
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
		RewriteRuleTokenStream stream_LBRACKET=new RewriteRuleTokenStream(adaptor,"token LBRACKET");
		RewriteRuleTokenStream stream_RBRACKET=new RewriteRuleTokenStream(adaptor,"token RBRACKET");
		RewriteRuleTokenStream stream_NUMBER=new RewriteRuleTokenStream(adaptor,"token NUMBER");

		try {
			// antlr/Neptune.g:211:2: ( LBRACKET NUMBER RBRACKET -> ^( ARRAY_DEF NUMBER ) )
			// antlr/Neptune.g:211:5: LBRACKET NUMBER RBRACKET
			{
			LBRACKET112=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_array_def1664);  
			stream_LBRACKET.add(LBRACKET112);

			NUMBER113=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_array_def1666);  
			stream_NUMBER.add(NUMBER113);

			RBRACKET114=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_array_def1668);  
			stream_RBRACKET.add(RBRACKET114);

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
			// 212:3: -> ^( ARRAY_DEF NUMBER )
			{
				// antlr/Neptune.g:212:6: ^( ARRAY_DEF NUMBER )
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



	public static final BitSet FOLLOW_lines_in_program1029 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_program1031 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_line_in_lines1066 = new BitSet(new long[]{0x04910A13B1804702L});
	public static final BitSet FOLLOW_expression_in_line1079 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_line1081 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declaration_in_line1087 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_line1089 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_logic_statement_in_line1095 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LCURLY_in_codeblock1107 = new BitSet(new long[]{0x04910A13B1804700L});
	public static final BitSet FOLLOW_lines_in_codeblock1109 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_RCURLY_in_codeblock1111 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_while_statement_in_logic_statement1133 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_foreach_statement_in_logic_statement1138 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_if_statement_in_logic_statement1143 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHILE_in_while_statement1155 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_LPAREN_in_while_statement1158 = new BitSet(new long[]{0x00910A1310800400L});
	public static final BitSet FOLLOW_expression_in_while_statement1161 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_while_statement1163 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_LCURLY_in_while_statement1166 = new BitSet(new long[]{0x04910A13B1804700L});
	public static final BitSet FOLLOW_lines_in_while_statement1169 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_RCURLY_in_while_statement1171 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FOREACH_in_foreach_statement1184 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_LPAREN_in_foreach_statement1187 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_foreach_statement1190 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_IN_in_foreach_statement1192 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_foreach_statement1195 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_foreach_statement1197 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_LCURLY_in_foreach_statement1200 = new BitSet(new long[]{0x04910A13B1804700L});
	public static final BitSet FOLLOW_lines_in_foreach_statement1203 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_RCURLY_in_foreach_statement1205 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_if_statement1218 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_LPAREN_in_if_statement1221 = new BitSet(new long[]{0x00910A1310800400L});
	public static final BitSet FOLLOW_expression_in_if_statement1224 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_if_statement1226 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_LCURLY_in_if_statement1229 = new BitSet(new long[]{0x04910A13B1804700L});
	public static final BitSet FOLLOW_lines_in_if_statement1232 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_RCURLY_in_if_statement1234 = new BitSet(new long[]{0x0000000000300002L});
	public static final BitSet FOLLOW_ELSIF_in_if_statement1240 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_LPAREN_in_if_statement1242 = new BitSet(new long[]{0x00910A1310800400L});
	public static final BitSet FOLLOW_expression_in_if_statement1245 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_if_statement1247 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_LCURLY_in_if_statement1250 = new BitSet(new long[]{0x04910A13B1804700L});
	public static final BitSet FOLLOW_lines_in_if_statement1253 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_RCURLY_in_if_statement1255 = new BitSet(new long[]{0x0000000000300002L});
	public static final BitSet FOLLOW_ELSE_in_if_statement1263 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_LCURLY_in_if_statement1265 = new BitSet(new long[]{0x04910A13B1804700L});
	public static final BitSet FOLLOW_lines_in_if_statement1268 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_RCURLY_in_if_statement1270 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRINT_in_print_statement1285 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_LPAREN_in_print_statement1288 = new BitSet(new long[]{0x00910A1310800400L});
	public static final BitSet FOLLOW_expression_in_print_statement1291 = new BitSet(new long[]{0x0004000000001000L});
	public static final BitSet FOLLOW_COMMA_in_print_statement1294 = new BitSet(new long[]{0x00910A1310800400L});
	public static final BitSet FOLLOW_expression_in_print_statement1296 = new BitSet(new long[]{0x0004000000001000L});
	public static final BitSet FOLLOW_RPAREN_in_print_statement1300 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_READ_in_read_statement1313 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_LPAREN_in_read_statement1316 = new BitSet(new long[]{0x00910A1310800400L});
	public static final BitSet FOLLOW_expression_in_read_statement1319 = new BitSet(new long[]{0x0004000000001000L});
	public static final BitSet FOLLOW_COMMA_in_read_statement1322 = new BitSet(new long[]{0x00910A1310800400L});
	public static final BitSet FOLLOW_expression_in_read_statement1324 = new BitSet(new long[]{0x0004000000001000L});
	public static final BitSet FOLLOW_RPAREN_in_read_statement1328 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_declaration1341 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_declaration1343 = new BitSet(new long[]{0x0000000000000042L});
	public static final BitSet FOLLOW_BECOMES_in_declaration1346 = new BitSet(new long[]{0x00910A1310800400L});
	public static final BitSet FOLLOW_expression_in_declaration1348 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CONST_in_declaration1374 = new BitSet(new long[]{0x0000000080000300L});
	public static final BitSet FOLLOW_type_in_declaration1377 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_declaration1379 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_BECOMES_in_declaration1381 = new BitSet(new long[]{0x00910A1310800400L});
	public static final BitSet FOLLOW_expression_in_declaration1383 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignment_expr_in_expression1395 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_boolean_expr_in_assignment_expr1406 = new BitSet(new long[]{0x0000000000000042L});
	public static final BitSet FOLLOW_BECOMES_in_assignment_expr1409 = new BitSet(new long[]{0x00910A1310800400L});
	public static final BitSet FOLLOW_assignment_expr_in_assignment_expr1412 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_plus_expr_in_boolean_expr1426 = new BitSet(new long[]{0x000001600C400002L});
	public static final BitSet FOLLOW_LT_in_boolean_expr1430 = new BitSet(new long[]{0x00910A1310800400L});
	public static final BitSet FOLLOW_LT_EQ_in_boolean_expr1435 = new BitSet(new long[]{0x00910A1310800400L});
	public static final BitSet FOLLOW_GT_in_boolean_expr1440 = new BitSet(new long[]{0x00910A1310800400L});
	public static final BitSet FOLLOW_GT_EQ_in_boolean_expr1445 = new BitSet(new long[]{0x00910A1310800400L});
	public static final BitSet FOLLOW_EQ_in_boolean_expr1450 = new BitSet(new long[]{0x00910A1310800400L});
	public static final BitSet FOLLOW_NEQ_in_boolean_expr1455 = new BitSet(new long[]{0x00910A1310800400L});
	public static final BitSet FOLLOW_plus_expr_in_boolean_expr1459 = new BitSet(new long[]{0x000001600C400002L});
	public static final BitSet FOLLOW_multi_expr_in_plus_expr1472 = new BitSet(new long[]{0x0000048000000002L});
	public static final BitSet FOLLOW_PLUS_in_plus_expr1476 = new BitSet(new long[]{0x00910A1310800400L});
	public static final BitSet FOLLOW_MINUS_in_plus_expr1481 = new BitSet(new long[]{0x00910A1310800400L});
	public static final BitSet FOLLOW_multi_expr_in_plus_expr1485 = new BitSet(new long[]{0x0000048000000002L});
	public static final BitSet FOLLOW_operand_in_multi_expr1498 = new BitSet(new long[]{0x0040000000010002L});
	public static final BitSet FOLLOW_TIMES_in_multi_expr1502 = new BitSet(new long[]{0x00910A1310800400L});
	public static final BitSet FOLLOW_DIVIDE_in_multi_expr1507 = new BitSet(new long[]{0x00910A1310800400L});
	public static final BitSet FOLLOW_operand_in_multi_expr1511 = new BitSet(new long[]{0x0040000000010002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_operand1529 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMBER_in_operand1539 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_operand1549 = new BitSet(new long[]{0x00910A1310800400L});
	public static final BitSet FOLLOW_assignment_expr_in_operand1552 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_operand1554 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACKET_in_operand1560 = new BitSet(new long[]{0x00910A1310800400L});
	public static final BitSet FOLLOW_expression_in_operand1562 = new BitSet(new long[]{0x0000400000001000L});
	public static final BitSet FOLLOW_COMMA_in_operand1565 = new BitSet(new long[]{0x00910A1310800400L});
	public static final BitSet FOLLOW_expression_in_operand1567 = new BitSet(new long[]{0x0000400000001000L});
	public static final BitSet FOLLOW_RBRACKET_in_operand1571 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_print_statement_in_operand1587 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_read_statement_in_operand1592 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_operand1597 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_LITERAL_in_operand1608 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_operand1613 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_codeblock_in_operand1618 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTEGER_in_type1632 = new BitSet(new long[]{0x0000000100000002L});
	public static final BitSet FOLLOW_array_def_in_type1634 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_in_type1640 = new BitSet(new long[]{0x0000000100000002L});
	public static final BitSet FOLLOW_array_def_in_type1642 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOLEAN_in_type1648 = new BitSet(new long[]{0x0000000100000002L});
	public static final BitSet FOLLOW_array_def_in_type1650 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACKET_in_array_def1664 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_NUMBER_in_array_def1666 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_RBRACKET_in_array_def1668 = new BitSet(new long[]{0x0000000000000002L});
}

// $ANTLR 3.5.2 antlr/Neptune.g 2014-06-30 12:18:52

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
		"LPAREN", "LT", "LT_EQ", "MINUS", "NEQ", "NUMBER", "OR", "PLUS", "PRINT", 
		"PROGRAM", "QUOTE", "RBRACKET", "RCURLY", "READ", "RETURN", "RPAREN", 
		"SEMICOLON", "STRING_LITERAL", "THEN", "TIMES", "TRUE", "UPPER", "VAR", 
		"WHILE", "WS"
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
	public static final int NEQ=41;
	public static final int NUMBER=42;
	public static final int OR=43;
	public static final int PLUS=44;
	public static final int PRINT=45;
	public static final int PROGRAM=46;
	public static final int QUOTE=47;
	public static final int RBRACKET=48;
	public static final int RCURLY=49;
	public static final int READ=50;
	public static final int RETURN=51;
	public static final int RPAREN=52;
	public static final int SEMICOLON=53;
	public static final int STRING_LITERAL=54;
	public static final int THEN=55;
	public static final int TIMES=56;
	public static final int TRUE=57;
	public static final int UPPER=58;
	public static final int VAR=59;
	public static final int WHILE=60;
	public static final int WS=61;

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
	// antlr/Neptune.g:118:1: program : lines EOF -> ^( PROGRAM lines ) ;
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
			// antlr/Neptune.g:119:5: ( lines EOF -> ^( PROGRAM lines ) )
			// antlr/Neptune.g:119:9: lines EOF
			{
			pushFollow(FOLLOW_lines_in_program1053);
			lines1=lines();
			state._fsp--;

			stream_lines.add(lines1.getTree());
			EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_program1055);  
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
			// 120:13: -> ^( PROGRAM lines )
			{
				// antlr/Neptune.g:120:17: ^( PROGRAM lines )
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
	// antlr/Neptune.g:123:1: lines : ( line )+ ;
	public final NeptuneParser.lines_return lines() throws RecognitionException {
		NeptuneParser.lines_return retval = new NeptuneParser.lines_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope line3 =null;


		try {
			// antlr/Neptune.g:124:2: ( ( line )+ )
			// antlr/Neptune.g:124:4: ( line )+
			{
			root_0 = (Object)adaptor.nil();


			// antlr/Neptune.g:124:4: ( line )+
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
					// antlr/Neptune.g:124:4: line
					{
					pushFollow(FOLLOW_line_in_lines1090);
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
	// antlr/Neptune.g:127:1: line : ( expression SEMICOLON !| declaration SEMICOLON !| logic_statement );
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
			// antlr/Neptune.g:128:2: ( expression SEMICOLON !| declaration SEMICOLON !| logic_statement )
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
					// antlr/Neptune.g:128:4: expression SEMICOLON !
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_expression_in_line1103);
					expression4=expression();
					state._fsp--;

					adaptor.addChild(root_0, expression4.getTree());

					SEMICOLON5=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_line1105); 
					}
					break;
				case 2 :
					// antlr/Neptune.g:129:4: declaration SEMICOLON !
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_declaration_in_line1111);
					declaration6=declaration();
					state._fsp--;

					adaptor.addChild(root_0, declaration6.getTree());

					SEMICOLON7=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_line1113); 
					}
					break;
				case 3 :
					// antlr/Neptune.g:130:4: logic_statement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_logic_statement_in_line1119);
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
	// antlr/Neptune.g:133:1: codeblock : LCURLY lines RCURLY -> ^( BLOCK lines ) ;
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
			// antlr/Neptune.g:134:2: ( LCURLY lines RCURLY -> ^( BLOCK lines ) )
			// antlr/Neptune.g:134:4: LCURLY lines RCURLY
			{
			LCURLY9=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_codeblock1131);  
			stream_LCURLY.add(LCURLY9);

			pushFollow(FOLLOW_lines_in_codeblock1133);
			lines10=lines();
			state._fsp--;

			stream_lines.add(lines10.getTree());
			RCURLY11=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_codeblock1135);  
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
			// 135:3: -> ^( BLOCK lines )
			{
				// antlr/Neptune.g:135:6: ^( BLOCK lines )
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
	// antlr/Neptune.g:138:1: logic_statement : ( while_statement | foreach_statement | if_statement );
	public final NeptuneParser.logic_statement_return logic_statement() throws RecognitionException {
		NeptuneParser.logic_statement_return retval = new NeptuneParser.logic_statement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope while_statement12 =null;
		ParserRuleReturnScope foreach_statement13 =null;
		ParserRuleReturnScope if_statement14 =null;


		try {
			// antlr/Neptune.g:139:2: ( while_statement | foreach_statement | if_statement )
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
					// antlr/Neptune.g:139:4: while_statement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_while_statement_in_logic_statement1157);
					while_statement12=while_statement();
					state._fsp--;

					adaptor.addChild(root_0, while_statement12.getTree());

					}
					break;
				case 2 :
					// antlr/Neptune.g:140:4: foreach_statement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_foreach_statement_in_logic_statement1162);
					foreach_statement13=foreach_statement();
					state._fsp--;

					adaptor.addChild(root_0, foreach_statement13.getTree());

					}
					break;
				case 3 :
					// antlr/Neptune.g:141:4: if_statement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_if_statement_in_logic_statement1167);
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
	// antlr/Neptune.g:144:1: while_statement : WHILE ^ LPAREN ! expression RPAREN ! LCURLY ! lines RCURLY !;
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
			// antlr/Neptune.g:145:2: ( WHILE ^ LPAREN ! expression RPAREN ! LCURLY ! lines RCURLY !)
			// antlr/Neptune.g:145:4: WHILE ^ LPAREN ! expression RPAREN ! LCURLY ! lines RCURLY !
			{
			root_0 = (Object)adaptor.nil();


			WHILE15=(Token)match(input,WHILE,FOLLOW_WHILE_in_while_statement1179); 
			WHILE15_tree = (Object)adaptor.create(WHILE15);
			root_0 = (Object)adaptor.becomeRoot(WHILE15_tree, root_0);

			LPAREN16=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_while_statement1182); 
			pushFollow(FOLLOW_expression_in_while_statement1185);
			expression17=expression();
			state._fsp--;

			adaptor.addChild(root_0, expression17.getTree());

			RPAREN18=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_while_statement1187); 
			LCURLY19=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_while_statement1190); 
			pushFollow(FOLLOW_lines_in_while_statement1193);
			lines20=lines();
			state._fsp--;

			adaptor.addChild(root_0, lines20.getTree());

			RCURLY21=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_while_statement1195); 
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
	// antlr/Neptune.g:148:1: foreach_statement : FOREACH ^ LPAREN ! IDENTIFIER IN ! IDENTIFIER RPAREN ! LCURLY ! lines RCURLY !;
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
			// antlr/Neptune.g:149:2: ( FOREACH ^ LPAREN ! IDENTIFIER IN ! IDENTIFIER RPAREN ! LCURLY ! lines RCURLY !)
			// antlr/Neptune.g:149:4: FOREACH ^ LPAREN ! IDENTIFIER IN ! IDENTIFIER RPAREN ! LCURLY ! lines RCURLY !
			{
			root_0 = (Object)adaptor.nil();


			FOREACH22=(Token)match(input,FOREACH,FOLLOW_FOREACH_in_foreach_statement1208); 
			FOREACH22_tree = (Object)adaptor.create(FOREACH22);
			root_0 = (Object)adaptor.becomeRoot(FOREACH22_tree, root_0);

			LPAREN23=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_foreach_statement1211); 
			IDENTIFIER24=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_foreach_statement1214); 
			IDENTIFIER24_tree = (Object)adaptor.create(IDENTIFIER24);
			adaptor.addChild(root_0, IDENTIFIER24_tree);

			IN25=(Token)match(input,IN,FOLLOW_IN_in_foreach_statement1216); 
			IDENTIFIER26=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_foreach_statement1219); 
			IDENTIFIER26_tree = (Object)adaptor.create(IDENTIFIER26);
			adaptor.addChild(root_0, IDENTIFIER26_tree);

			RPAREN27=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_foreach_statement1221); 
			LCURLY28=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_foreach_statement1224); 
			pushFollow(FOLLOW_lines_in_foreach_statement1227);
			lines29=lines();
			state._fsp--;

			adaptor.addChild(root_0, lines29.getTree());

			RCURLY30=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_foreach_statement1229); 
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
	// antlr/Neptune.g:152:1: if_statement : IF ^ LPAREN ! expression RPAREN ! LCURLY ! lines RCURLY ! ( ELSIF LPAREN ! expression RPAREN ! LCURLY ! lines RCURLY !)* ( ELSE LCURLY ! lines RCURLY !)? ;
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
			// antlr/Neptune.g:153:2: ( IF ^ LPAREN ! expression RPAREN ! LCURLY ! lines RCURLY ! ( ELSIF LPAREN ! expression RPAREN ! LCURLY ! lines RCURLY !)* ( ELSE LCURLY ! lines RCURLY !)? )
			// antlr/Neptune.g:153:4: IF ^ LPAREN ! expression RPAREN ! LCURLY ! lines RCURLY ! ( ELSIF LPAREN ! expression RPAREN ! LCURLY ! lines RCURLY !)* ( ELSE LCURLY ! lines RCURLY !)?
			{
			root_0 = (Object)adaptor.nil();


			IF31=(Token)match(input,IF,FOLLOW_IF_in_if_statement1242); 
			IF31_tree = (Object)adaptor.create(IF31);
			root_0 = (Object)adaptor.becomeRoot(IF31_tree, root_0);

			LPAREN32=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_if_statement1245); 
			pushFollow(FOLLOW_expression_in_if_statement1248);
			expression33=expression();
			state._fsp--;

			adaptor.addChild(root_0, expression33.getTree());

			RPAREN34=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_if_statement1250); 
			LCURLY35=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_if_statement1253); 
			pushFollow(FOLLOW_lines_in_if_statement1256);
			lines36=lines();
			state._fsp--;

			adaptor.addChild(root_0, lines36.getTree());

			RCURLY37=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_if_statement1258); 
			// antlr/Neptune.g:154:3: ( ELSIF LPAREN ! expression RPAREN ! LCURLY ! lines RCURLY !)*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==ELSIF) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// antlr/Neptune.g:154:4: ELSIF LPAREN ! expression RPAREN ! LCURLY ! lines RCURLY !
					{
					ELSIF38=(Token)match(input,ELSIF,FOLLOW_ELSIF_in_if_statement1264); 
					ELSIF38_tree = (Object)adaptor.create(ELSIF38);
					adaptor.addChild(root_0, ELSIF38_tree);

					LPAREN39=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_if_statement1266); 
					pushFollow(FOLLOW_expression_in_if_statement1269);
					expression40=expression();
					state._fsp--;

					adaptor.addChild(root_0, expression40.getTree());

					RPAREN41=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_if_statement1271); 
					LCURLY42=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_if_statement1274); 
					pushFollow(FOLLOW_lines_in_if_statement1277);
					lines43=lines();
					state._fsp--;

					adaptor.addChild(root_0, lines43.getTree());

					RCURLY44=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_if_statement1279); 
					}
					break;

				default :
					break loop4;
				}
			}

			// antlr/Neptune.g:155:3: ( ELSE LCURLY ! lines RCURLY !)?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==ELSE) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// antlr/Neptune.g:155:4: ELSE LCURLY ! lines RCURLY !
					{
					ELSE45=(Token)match(input,ELSE,FOLLOW_ELSE_in_if_statement1287); 
					ELSE45_tree = (Object)adaptor.create(ELSE45);
					adaptor.addChild(root_0, ELSE45_tree);

					LCURLY46=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_if_statement1289); 
					pushFollow(FOLLOW_lines_in_if_statement1292);
					lines47=lines();
					state._fsp--;

					adaptor.addChild(root_0, lines47.getTree());

					RCURLY48=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_if_statement1294); 
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
	// antlr/Neptune.g:158:1: print_statement : PRINT ^ LPAREN ! expression ( COMMA expression )* RPAREN !;
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
			// antlr/Neptune.g:159:2: ( PRINT ^ LPAREN ! expression ( COMMA expression )* RPAREN !)
			// antlr/Neptune.g:159:4: PRINT ^ LPAREN ! expression ( COMMA expression )* RPAREN !
			{
			root_0 = (Object)adaptor.nil();


			PRINT49=(Token)match(input,PRINT,FOLLOW_PRINT_in_print_statement1309); 
			PRINT49_tree = (Object)adaptor.create(PRINT49);
			root_0 = (Object)adaptor.becomeRoot(PRINT49_tree, root_0);

			LPAREN50=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_print_statement1312); 
			pushFollow(FOLLOW_expression_in_print_statement1315);
			expression51=expression();
			state._fsp--;

			adaptor.addChild(root_0, expression51.getTree());

			// antlr/Neptune.g:159:30: ( COMMA expression )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==COMMA) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// antlr/Neptune.g:159:31: COMMA expression
					{
					COMMA52=(Token)match(input,COMMA,FOLLOW_COMMA_in_print_statement1318); 
					COMMA52_tree = (Object)adaptor.create(COMMA52);
					adaptor.addChild(root_0, COMMA52_tree);

					pushFollow(FOLLOW_expression_in_print_statement1320);
					expression53=expression();
					state._fsp--;

					adaptor.addChild(root_0, expression53.getTree());

					}
					break;

				default :
					break loop6;
				}
			}

			RPAREN54=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_print_statement1324); 
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
	// antlr/Neptune.g:162:1: read_statement : READ ^ LPAREN ! expression ( COMMA expression )* RPAREN !;
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
			// antlr/Neptune.g:163:2: ( READ ^ LPAREN ! expression ( COMMA expression )* RPAREN !)
			// antlr/Neptune.g:163:4: READ ^ LPAREN ! expression ( COMMA expression )* RPAREN !
			{
			root_0 = (Object)adaptor.nil();


			READ55=(Token)match(input,READ,FOLLOW_READ_in_read_statement1337); 
			READ55_tree = (Object)adaptor.create(READ55);
			root_0 = (Object)adaptor.becomeRoot(READ55_tree, root_0);

			LPAREN56=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_read_statement1340); 
			pushFollow(FOLLOW_expression_in_read_statement1343);
			expression57=expression();
			state._fsp--;

			adaptor.addChild(root_0, expression57.getTree());

			// antlr/Neptune.g:163:29: ( COMMA expression )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==COMMA) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// antlr/Neptune.g:163:30: COMMA expression
					{
					COMMA58=(Token)match(input,COMMA,FOLLOW_COMMA_in_read_statement1346); 
					COMMA58_tree = (Object)adaptor.create(COMMA58);
					adaptor.addChild(root_0, COMMA58_tree);

					pushFollow(FOLLOW_expression_in_read_statement1348);
					expression59=expression();
					state._fsp--;

					adaptor.addChild(root_0, expression59.getTree());

					}
					break;

				default :
					break loop7;
				}
			}

			RPAREN60=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_read_statement1352); 
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
	// antlr/Neptune.g:166:1: declaration : ( type IDENTIFIER ( BECOMES expression )? -> ^( VAR type IDENTIFIER ( BECOMES expression )? ) | CONST ^ type IDENTIFIER BECOMES expression );
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
			// antlr/Neptune.g:167:2: ( type IDENTIFIER ( BECOMES expression )? -> ^( VAR type IDENTIFIER ( BECOMES expression )? ) | CONST ^ type IDENTIFIER BECOMES expression )
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
					// antlr/Neptune.g:167:4: type IDENTIFIER ( BECOMES expression )?
					{
					pushFollow(FOLLOW_type_in_declaration1365);
					type61=type();
					state._fsp--;

					stream_type.add(type61.getTree());
					IDENTIFIER62=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_declaration1367);  
					stream_IDENTIFIER.add(IDENTIFIER62);

					// antlr/Neptune.g:167:20: ( BECOMES expression )?
					int alt8=2;
					int LA8_0 = input.LA(1);
					if ( (LA8_0==BECOMES) ) {
						alt8=1;
					}
					switch (alt8) {
						case 1 :
							// antlr/Neptune.g:167:21: BECOMES expression
							{
							BECOMES63=(Token)match(input,BECOMES,FOLLOW_BECOMES_in_declaration1370);  
							stream_BECOMES.add(BECOMES63);

							pushFollow(FOLLOW_expression_in_declaration1372);
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
					// 168:3: -> ^( VAR type IDENTIFIER ( BECOMES expression )? )
					{
						// antlr/Neptune.g:168:6: ^( VAR type IDENTIFIER ( BECOMES expression )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VAR, "VAR"), root_1);
						adaptor.addChild(root_1, stream_type.nextTree());
						adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
						// antlr/Neptune.g:168:28: ( BECOMES expression )?
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
					// antlr/Neptune.g:169:4: CONST ^ type IDENTIFIER BECOMES expression
					{
					root_0 = (Object)adaptor.nil();


					CONST65=(Token)match(input,CONST,FOLLOW_CONST_in_declaration1398); 
					CONST65_tree = (Object)adaptor.create(CONST65);
					root_0 = (Object)adaptor.becomeRoot(CONST65_tree, root_0);

					pushFollow(FOLLOW_type_in_declaration1401);
					type66=type();
					state._fsp--;

					adaptor.addChild(root_0, type66.getTree());

					IDENTIFIER67=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_declaration1403); 
					IDENTIFIER67_tree = (Object)adaptor.create(IDENTIFIER67);
					adaptor.addChild(root_0, IDENTIFIER67_tree);

					BECOMES68=(Token)match(input,BECOMES,FOLLOW_BECOMES_in_declaration1405); 
					BECOMES68_tree = (Object)adaptor.create(BECOMES68);
					adaptor.addChild(root_0, BECOMES68_tree);

					pushFollow(FOLLOW_expression_in_declaration1407);
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
	// antlr/Neptune.g:172:1: expression : assignment_expr ;
	public final NeptuneParser.expression_return expression() throws RecognitionException {
		NeptuneParser.expression_return retval = new NeptuneParser.expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope assignment_expr70 =null;


		try {
			// antlr/Neptune.g:173:2: ( assignment_expr )
			// antlr/Neptune.g:173:4: assignment_expr
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_assignment_expr_in_expression1419);
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
	// antlr/Neptune.g:176:1: assignment_expr : and_or_expr ( BECOMES ^ assignment_expr )? ;
	public final NeptuneParser.assignment_expr_return assignment_expr() throws RecognitionException {
		NeptuneParser.assignment_expr_return retval = new NeptuneParser.assignment_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token BECOMES72=null;
		ParserRuleReturnScope and_or_expr71 =null;
		ParserRuleReturnScope assignment_expr73 =null;

		Object BECOMES72_tree=null;

		try {
			// antlr/Neptune.g:177:2: ( and_or_expr ( BECOMES ^ assignment_expr )? )
			// antlr/Neptune.g:177:4: and_or_expr ( BECOMES ^ assignment_expr )?
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_and_or_expr_in_assignment_expr1430);
			and_or_expr71=and_or_expr();
			state._fsp--;

			adaptor.addChild(root_0, and_or_expr71.getTree());

			// antlr/Neptune.g:177:16: ( BECOMES ^ assignment_expr )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==BECOMES) ) {
				alt10=1;
			}
			switch (alt10) {
				case 1 :
					// antlr/Neptune.g:177:17: BECOMES ^ assignment_expr
					{
					BECOMES72=(Token)match(input,BECOMES,FOLLOW_BECOMES_in_assignment_expr1433); 
					BECOMES72_tree = (Object)adaptor.create(BECOMES72);
					root_0 = (Object)adaptor.becomeRoot(BECOMES72_tree, root_0);

					pushFollow(FOLLOW_assignment_expr_in_assignment_expr1436);
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


	public static class and_or_expr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "and_or_expr"
	// antlr/Neptune.g:180:1: and_or_expr : boolean_expr ( ( AND ^| OR ^) boolean_expr )* ;
	public final NeptuneParser.and_or_expr_return and_or_expr() throws RecognitionException {
		NeptuneParser.and_or_expr_return retval = new NeptuneParser.and_or_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token AND75=null;
		Token OR76=null;
		ParserRuleReturnScope boolean_expr74 =null;
		ParserRuleReturnScope boolean_expr77 =null;

		Object AND75_tree=null;
		Object OR76_tree=null;

		try {
			// antlr/Neptune.g:181:2: ( boolean_expr ( ( AND ^| OR ^) boolean_expr )* )
			// antlr/Neptune.g:181:4: boolean_expr ( ( AND ^| OR ^) boolean_expr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_boolean_expr_in_and_or_expr1450);
			boolean_expr74=boolean_expr();
			state._fsp--;

			adaptor.addChild(root_0, boolean_expr74.getTree());

			// antlr/Neptune.g:181:17: ( ( AND ^| OR ^) boolean_expr )*
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( (LA12_0==AND||LA12_0==OR) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// antlr/Neptune.g:181:18: ( AND ^| OR ^) boolean_expr
					{
					// antlr/Neptune.g:181:18: ( AND ^| OR ^)
					int alt11=2;
					int LA11_0 = input.LA(1);
					if ( (LA11_0==AND) ) {
						alt11=1;
					}
					else if ( (LA11_0==OR) ) {
						alt11=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 11, 0, input);
						throw nvae;
					}

					switch (alt11) {
						case 1 :
							// antlr/Neptune.g:181:19: AND ^
							{
							AND75=(Token)match(input,AND,FOLLOW_AND_in_and_or_expr1454); 
							AND75_tree = (Object)adaptor.create(AND75);
							root_0 = (Object)adaptor.becomeRoot(AND75_tree, root_0);

							}
							break;
						case 2 :
							// antlr/Neptune.g:181:26: OR ^
							{
							OR76=(Token)match(input,OR,FOLLOW_OR_in_and_or_expr1459); 
							OR76_tree = (Object)adaptor.create(OR76);
							root_0 = (Object)adaptor.becomeRoot(OR76_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_boolean_expr_in_and_or_expr1463);
					boolean_expr77=boolean_expr();
					state._fsp--;

					adaptor.addChild(root_0, boolean_expr77.getTree());

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
	// $ANTLR end "and_or_expr"


	public static class boolean_expr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "boolean_expr"
	// antlr/Neptune.g:184:1: boolean_expr : plus_expr ( ( LT ^| LT_EQ ^| GT ^| GT_EQ ^| EQ ^| NEQ ^) plus_expr )* ;
	public final NeptuneParser.boolean_expr_return boolean_expr() throws RecognitionException {
		NeptuneParser.boolean_expr_return retval = new NeptuneParser.boolean_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token LT79=null;
		Token LT_EQ80=null;
		Token GT81=null;
		Token GT_EQ82=null;
		Token EQ83=null;
		Token NEQ84=null;
		ParserRuleReturnScope plus_expr78 =null;
		ParserRuleReturnScope plus_expr85 =null;

		Object LT79_tree=null;
		Object LT_EQ80_tree=null;
		Object GT81_tree=null;
		Object GT_EQ82_tree=null;
		Object EQ83_tree=null;
		Object NEQ84_tree=null;

		try {
			// antlr/Neptune.g:185:2: ( plus_expr ( ( LT ^| LT_EQ ^| GT ^| GT_EQ ^| EQ ^| NEQ ^) plus_expr )* )
			// antlr/Neptune.g:185:4: plus_expr ( ( LT ^| LT_EQ ^| GT ^| GT_EQ ^| EQ ^| NEQ ^) plus_expr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_plus_expr_in_boolean_expr1477);
			plus_expr78=plus_expr();
			state._fsp--;

			adaptor.addChild(root_0, plus_expr78.getTree());

			// antlr/Neptune.g:185:14: ( ( LT ^| LT_EQ ^| GT ^| GT_EQ ^| EQ ^| NEQ ^) plus_expr )*
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( (LA14_0==EQ||(LA14_0 >= GT && LA14_0 <= GT_EQ)||(LA14_0 >= LT && LA14_0 <= LT_EQ)||LA14_0==NEQ) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// antlr/Neptune.g:185:15: ( LT ^| LT_EQ ^| GT ^| GT_EQ ^| EQ ^| NEQ ^) plus_expr
					{
					// antlr/Neptune.g:185:15: ( LT ^| LT_EQ ^| GT ^| GT_EQ ^| EQ ^| NEQ ^)
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
							// antlr/Neptune.g:185:16: LT ^
							{
							LT79=(Token)match(input,LT,FOLLOW_LT_in_boolean_expr1481); 
							LT79_tree = (Object)adaptor.create(LT79);
							root_0 = (Object)adaptor.becomeRoot(LT79_tree, root_0);

							}
							break;
						case 2 :
							// antlr/Neptune.g:185:22: LT_EQ ^
							{
							LT_EQ80=(Token)match(input,LT_EQ,FOLLOW_LT_EQ_in_boolean_expr1486); 
							LT_EQ80_tree = (Object)adaptor.create(LT_EQ80);
							root_0 = (Object)adaptor.becomeRoot(LT_EQ80_tree, root_0);

							}
							break;
						case 3 :
							// antlr/Neptune.g:185:31: GT ^
							{
							GT81=(Token)match(input,GT,FOLLOW_GT_in_boolean_expr1491); 
							GT81_tree = (Object)adaptor.create(GT81);
							root_0 = (Object)adaptor.becomeRoot(GT81_tree, root_0);

							}
							break;
						case 4 :
							// antlr/Neptune.g:185:37: GT_EQ ^
							{
							GT_EQ82=(Token)match(input,GT_EQ,FOLLOW_GT_EQ_in_boolean_expr1496); 
							GT_EQ82_tree = (Object)adaptor.create(GT_EQ82);
							root_0 = (Object)adaptor.becomeRoot(GT_EQ82_tree, root_0);

							}
							break;
						case 5 :
							// antlr/Neptune.g:185:46: EQ ^
							{
							EQ83=(Token)match(input,EQ,FOLLOW_EQ_in_boolean_expr1501); 
							EQ83_tree = (Object)adaptor.create(EQ83);
							root_0 = (Object)adaptor.becomeRoot(EQ83_tree, root_0);

							}
							break;
						case 6 :
							// antlr/Neptune.g:185:52: NEQ ^
							{
							NEQ84=(Token)match(input,NEQ,FOLLOW_NEQ_in_boolean_expr1506); 
							NEQ84_tree = (Object)adaptor.create(NEQ84);
							root_0 = (Object)adaptor.becomeRoot(NEQ84_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_plus_expr_in_boolean_expr1510);
					plus_expr85=plus_expr();
					state._fsp--;

					adaptor.addChild(root_0, plus_expr85.getTree());

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
	// antlr/Neptune.g:188:1: plus_expr : multi_expr ( ( PLUS ^| MINUS ^) multi_expr )* ;
	public final NeptuneParser.plus_expr_return plus_expr() throws RecognitionException {
		NeptuneParser.plus_expr_return retval = new NeptuneParser.plus_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token PLUS87=null;
		Token MINUS88=null;
		ParserRuleReturnScope multi_expr86 =null;
		ParserRuleReturnScope multi_expr89 =null;

		Object PLUS87_tree=null;
		Object MINUS88_tree=null;

		try {
			// antlr/Neptune.g:189:2: ( multi_expr ( ( PLUS ^| MINUS ^) multi_expr )* )
			// antlr/Neptune.g:189:4: multi_expr ( ( PLUS ^| MINUS ^) multi_expr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_multi_expr_in_plus_expr1523);
			multi_expr86=multi_expr();
			state._fsp--;

			adaptor.addChild(root_0, multi_expr86.getTree());

			// antlr/Neptune.g:189:15: ( ( PLUS ^| MINUS ^) multi_expr )*
			loop16:
			while (true) {
				int alt16=2;
				int LA16_0 = input.LA(1);
				if ( (LA16_0==MINUS||LA16_0==PLUS) ) {
					alt16=1;
				}

				switch (alt16) {
				case 1 :
					// antlr/Neptune.g:189:16: ( PLUS ^| MINUS ^) multi_expr
					{
					// antlr/Neptune.g:189:16: ( PLUS ^| MINUS ^)
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
							// antlr/Neptune.g:189:17: PLUS ^
							{
							PLUS87=(Token)match(input,PLUS,FOLLOW_PLUS_in_plus_expr1527); 
							PLUS87_tree = (Object)adaptor.create(PLUS87);
							root_0 = (Object)adaptor.becomeRoot(PLUS87_tree, root_0);

							}
							break;
						case 2 :
							// antlr/Neptune.g:189:25: MINUS ^
							{
							MINUS88=(Token)match(input,MINUS,FOLLOW_MINUS_in_plus_expr1532); 
							MINUS88_tree = (Object)adaptor.create(MINUS88);
							root_0 = (Object)adaptor.becomeRoot(MINUS88_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_multi_expr_in_plus_expr1536);
					multi_expr89=multi_expr();
					state._fsp--;

					adaptor.addChild(root_0, multi_expr89.getTree());

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
	// antlr/Neptune.g:192:1: multi_expr : operand ( ( TIMES ^| DIVIDE ^) operand )* ;
	public final NeptuneParser.multi_expr_return multi_expr() throws RecognitionException {
		NeptuneParser.multi_expr_return retval = new NeptuneParser.multi_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token TIMES91=null;
		Token DIVIDE92=null;
		ParserRuleReturnScope operand90 =null;
		ParserRuleReturnScope operand93 =null;

		Object TIMES91_tree=null;
		Object DIVIDE92_tree=null;

		try {
			// antlr/Neptune.g:193:2: ( operand ( ( TIMES ^| DIVIDE ^) operand )* )
			// antlr/Neptune.g:193:4: operand ( ( TIMES ^| DIVIDE ^) operand )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_operand_in_multi_expr1549);
			operand90=operand();
			state._fsp--;

			adaptor.addChild(root_0, operand90.getTree());

			// antlr/Neptune.g:193:12: ( ( TIMES ^| DIVIDE ^) operand )*
			loop18:
			while (true) {
				int alt18=2;
				int LA18_0 = input.LA(1);
				if ( (LA18_0==DIVIDE||LA18_0==TIMES) ) {
					alt18=1;
				}

				switch (alt18) {
				case 1 :
					// antlr/Neptune.g:193:13: ( TIMES ^| DIVIDE ^) operand
					{
					// antlr/Neptune.g:193:13: ( TIMES ^| DIVIDE ^)
					int alt17=2;
					int LA17_0 = input.LA(1);
					if ( (LA17_0==TIMES) ) {
						alt17=1;
					}
					else if ( (LA17_0==DIVIDE) ) {
						alt17=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 17, 0, input);
						throw nvae;
					}

					switch (alt17) {
						case 1 :
							// antlr/Neptune.g:193:14: TIMES ^
							{
							TIMES91=(Token)match(input,TIMES,FOLLOW_TIMES_in_multi_expr1553); 
							TIMES91_tree = (Object)adaptor.create(TIMES91);
							root_0 = (Object)adaptor.becomeRoot(TIMES91_tree, root_0);

							}
							break;
						case 2 :
							// antlr/Neptune.g:193:23: DIVIDE ^
							{
							DIVIDE92=(Token)match(input,DIVIDE,FOLLOW_DIVIDE_in_multi_expr1558); 
							DIVIDE92_tree = (Object)adaptor.create(DIVIDE92);
							root_0 = (Object)adaptor.becomeRoot(DIVIDE92_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_operand_in_multi_expr1562);
					operand93=operand();
					state._fsp--;

					adaptor.addChild(root_0, operand93.getTree());

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


	public static class operand_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "operand"
	// antlr/Neptune.g:196:1: operand : ( IDENTIFIER ( array_def )? | NUMBER | LPAREN ! assignment_expr RPAREN !| LBRACKET expression ( COMMA expression )* RBRACKET -> ^( ARRAY_SET ( expression )+ ) | print_statement | read_statement | ( TRUE | FALSE ) | CHAR_LITERAL | STRING_LITERAL | codeblock );
	public final NeptuneParser.operand_return operand() throws RecognitionException {
		NeptuneParser.operand_return retval = new NeptuneParser.operand_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IDENTIFIER94=null;
		Token NUMBER96=null;
		Token LPAREN97=null;
		Token RPAREN99=null;
		Token LBRACKET100=null;
		Token COMMA102=null;
		Token RBRACKET104=null;
		Token set107=null;
		Token CHAR_LITERAL108=null;
		Token STRING_LITERAL109=null;
		ParserRuleReturnScope array_def95 =null;
		ParserRuleReturnScope assignment_expr98 =null;
		ParserRuleReturnScope expression101 =null;
		ParserRuleReturnScope expression103 =null;
		ParserRuleReturnScope print_statement105 =null;
		ParserRuleReturnScope read_statement106 =null;
		ParserRuleReturnScope codeblock110 =null;

		Object IDENTIFIER94_tree=null;
		Object NUMBER96_tree=null;
		Object LPAREN97_tree=null;
		Object RPAREN99_tree=null;
		Object LBRACKET100_tree=null;
		Object COMMA102_tree=null;
		Object RBRACKET104_tree=null;
		Object set107_tree=null;
		Object CHAR_LITERAL108_tree=null;
		Object STRING_LITERAL109_tree=null;
		RewriteRuleTokenStream stream_LBRACKET=new RewriteRuleTokenStream(adaptor,"token LBRACKET");
		RewriteRuleTokenStream stream_RBRACKET=new RewriteRuleTokenStream(adaptor,"token RBRACKET");
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try {
			// antlr/Neptune.g:197:5: ( IDENTIFIER ( array_def )? | NUMBER | LPAREN ! assignment_expr RPAREN !| LBRACKET expression ( COMMA expression )* RBRACKET -> ^( ARRAY_SET ( expression )+ ) | print_statement | read_statement | ( TRUE | FALSE ) | CHAR_LITERAL | STRING_LITERAL | codeblock )
			int alt21=10;
			switch ( input.LA(1) ) {
			case IDENTIFIER:
				{
				alt21=1;
				}
				break;
			case NUMBER:
				{
				alt21=2;
				}
				break;
			case LPAREN:
				{
				alt21=3;
				}
				break;
			case LBRACKET:
				{
				alt21=4;
				}
				break;
			case PRINT:
				{
				alt21=5;
				}
				break;
			case READ:
				{
				alt21=6;
				}
				break;
			case FALSE:
			case TRUE:
				{
				alt21=7;
				}
				break;
			case CHAR_LITERAL:
				{
				alt21=8;
				}
				break;
			case STRING_LITERAL:
				{
				alt21=9;
				}
				break;
			case LCURLY:
				{
				alt21=10;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 21, 0, input);
				throw nvae;
			}
			switch (alt21) {
				case 1 :
					// antlr/Neptune.g:197:9: IDENTIFIER ( array_def )?
					{
					root_0 = (Object)adaptor.nil();


					IDENTIFIER94=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_operand1580); 
					IDENTIFIER94_tree = (Object)adaptor.create(IDENTIFIER94);
					adaptor.addChild(root_0, IDENTIFIER94_tree);

					// antlr/Neptune.g:197:20: ( array_def )?
					int alt19=2;
					int LA19_0 = input.LA(1);
					if ( (LA19_0==LBRACKET) ) {
						alt19=1;
					}
					switch (alt19) {
						case 1 :
							// antlr/Neptune.g:197:20: array_def
							{
							pushFollow(FOLLOW_array_def_in_operand1582);
							array_def95=array_def();
							state._fsp--;

							adaptor.addChild(root_0, array_def95.getTree());

							}
							break;

					}

					}
					break;
				case 2 :
					// antlr/Neptune.g:198:9: NUMBER
					{
					root_0 = (Object)adaptor.nil();


					NUMBER96=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_operand1593); 
					NUMBER96_tree = (Object)adaptor.create(NUMBER96);
					adaptor.addChild(root_0, NUMBER96_tree);

					}
					break;
				case 3 :
					// antlr/Neptune.g:199:9: LPAREN ! assignment_expr RPAREN !
					{
					root_0 = (Object)adaptor.nil();


					LPAREN97=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_operand1603); 
					pushFollow(FOLLOW_assignment_expr_in_operand1606);
					assignment_expr98=assignment_expr();
					state._fsp--;

					adaptor.addChild(root_0, assignment_expr98.getTree());

					RPAREN99=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_operand1608); 
					}
					break;
				case 4 :
					// antlr/Neptune.g:200:4: LBRACKET expression ( COMMA expression )* RBRACKET
					{
					LBRACKET100=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_operand1614);  
					stream_LBRACKET.add(LBRACKET100);

					pushFollow(FOLLOW_expression_in_operand1616);
					expression101=expression();
					state._fsp--;

					stream_expression.add(expression101.getTree());
					// antlr/Neptune.g:200:24: ( COMMA expression )*
					loop20:
					while (true) {
						int alt20=2;
						int LA20_0 = input.LA(1);
						if ( (LA20_0==COMMA) ) {
							alt20=1;
						}

						switch (alt20) {
						case 1 :
							// antlr/Neptune.g:200:25: COMMA expression
							{
							COMMA102=(Token)match(input,COMMA,FOLLOW_COMMA_in_operand1619);  
							stream_COMMA.add(COMMA102);

							pushFollow(FOLLOW_expression_in_operand1621);
							expression103=expression();
							state._fsp--;

							stream_expression.add(expression103.getTree());
							}
							break;

						default :
							break loop20;
						}
					}

					RBRACKET104=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_operand1625);  
					stream_RBRACKET.add(RBRACKET104);

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
					// 201:3: -> ^( ARRAY_SET ( expression )+ )
					{
						// antlr/Neptune.g:201:6: ^( ARRAY_SET ( expression )+ )
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
					// antlr/Neptune.g:202:4: print_statement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_print_statement_in_operand1641);
					print_statement105=print_statement();
					state._fsp--;

					adaptor.addChild(root_0, print_statement105.getTree());

					}
					break;
				case 6 :
					// antlr/Neptune.g:203:4: read_statement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_read_statement_in_operand1646);
					read_statement106=read_statement();
					state._fsp--;

					adaptor.addChild(root_0, read_statement106.getTree());

					}
					break;
				case 7 :
					// antlr/Neptune.g:204:4: ( TRUE | FALSE )
					{
					root_0 = (Object)adaptor.nil();


					set107=input.LT(1);
					if ( input.LA(1)==FALSE||input.LA(1)==TRUE ) {
						input.consume();
						adaptor.addChild(root_0, (Object)adaptor.create(set107));
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					}
					break;
				case 8 :
					// antlr/Neptune.g:205:4: CHAR_LITERAL
					{
					root_0 = (Object)adaptor.nil();


					CHAR_LITERAL108=(Token)match(input,CHAR_LITERAL,FOLLOW_CHAR_LITERAL_in_operand1662); 
					CHAR_LITERAL108_tree = (Object)adaptor.create(CHAR_LITERAL108);
					adaptor.addChild(root_0, CHAR_LITERAL108_tree);

					}
					break;
				case 9 :
					// antlr/Neptune.g:206:4: STRING_LITERAL
					{
					root_0 = (Object)adaptor.nil();


					STRING_LITERAL109=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_operand1667); 
					STRING_LITERAL109_tree = (Object)adaptor.create(STRING_LITERAL109);
					adaptor.addChild(root_0, STRING_LITERAL109_tree);

					}
					break;
				case 10 :
					// antlr/Neptune.g:207:4: codeblock
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_codeblock_in_operand1672);
					codeblock110=codeblock();
					state._fsp--;

					adaptor.addChild(root_0, codeblock110.getTree());

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
	// antlr/Neptune.g:210:1: type : ( INTEGER ( array_def )? | CHAR ( array_def )? | BOOLEAN ( array_def )? );
	public final NeptuneParser.type_return type() throws RecognitionException {
		NeptuneParser.type_return retval = new NeptuneParser.type_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token INTEGER111=null;
		Token CHAR113=null;
		Token BOOLEAN115=null;
		ParserRuleReturnScope array_def112 =null;
		ParserRuleReturnScope array_def114 =null;
		ParserRuleReturnScope array_def116 =null;

		Object INTEGER111_tree=null;
		Object CHAR113_tree=null;
		Object BOOLEAN115_tree=null;

		try {
			// antlr/Neptune.g:211:2: ( INTEGER ( array_def )? | CHAR ( array_def )? | BOOLEAN ( array_def )? )
			int alt25=3;
			switch ( input.LA(1) ) {
			case INTEGER:
				{
				alt25=1;
				}
				break;
			case CHAR:
				{
				alt25=2;
				}
				break;
			case BOOLEAN:
				{
				alt25=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 25, 0, input);
				throw nvae;
			}
			switch (alt25) {
				case 1 :
					// antlr/Neptune.g:211:4: INTEGER ( array_def )?
					{
					root_0 = (Object)adaptor.nil();


					INTEGER111=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_type1686); 
					INTEGER111_tree = (Object)adaptor.create(INTEGER111);
					adaptor.addChild(root_0, INTEGER111_tree);

					// antlr/Neptune.g:211:12: ( array_def )?
					int alt22=2;
					int LA22_0 = input.LA(1);
					if ( (LA22_0==LBRACKET) ) {
						alt22=1;
					}
					switch (alt22) {
						case 1 :
							// antlr/Neptune.g:211:12: array_def
							{
							pushFollow(FOLLOW_array_def_in_type1688);
							array_def112=array_def();
							state._fsp--;

							adaptor.addChild(root_0, array_def112.getTree());

							}
							break;

					}

					}
					break;
				case 2 :
					// antlr/Neptune.g:212:4: CHAR ( array_def )?
					{
					root_0 = (Object)adaptor.nil();


					CHAR113=(Token)match(input,CHAR,FOLLOW_CHAR_in_type1694); 
					CHAR113_tree = (Object)adaptor.create(CHAR113);
					adaptor.addChild(root_0, CHAR113_tree);

					// antlr/Neptune.g:212:9: ( array_def )?
					int alt23=2;
					int LA23_0 = input.LA(1);
					if ( (LA23_0==LBRACKET) ) {
						alt23=1;
					}
					switch (alt23) {
						case 1 :
							// antlr/Neptune.g:212:9: array_def
							{
							pushFollow(FOLLOW_array_def_in_type1696);
							array_def114=array_def();
							state._fsp--;

							adaptor.addChild(root_0, array_def114.getTree());

							}
							break;

					}

					}
					break;
				case 3 :
					// antlr/Neptune.g:213:4: BOOLEAN ( array_def )?
					{
					root_0 = (Object)adaptor.nil();


					BOOLEAN115=(Token)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_type1702); 
					BOOLEAN115_tree = (Object)adaptor.create(BOOLEAN115);
					adaptor.addChild(root_0, BOOLEAN115_tree);

					// antlr/Neptune.g:213:12: ( array_def )?
					int alt24=2;
					int LA24_0 = input.LA(1);
					if ( (LA24_0==LBRACKET) ) {
						alt24=1;
					}
					switch (alt24) {
						case 1 :
							// antlr/Neptune.g:213:12: array_def
							{
							pushFollow(FOLLOW_array_def_in_type1704);
							array_def116=array_def();
							state._fsp--;

							adaptor.addChild(root_0, array_def116.getTree());

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
	// antlr/Neptune.g:216:1: array_def : LBRACKET NUMBER RBRACKET -> ^( ARRAY_DEF NUMBER ) ;
	public final NeptuneParser.array_def_return array_def() throws RecognitionException {
		NeptuneParser.array_def_return retval = new NeptuneParser.array_def_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token LBRACKET117=null;
		Token NUMBER118=null;
		Token RBRACKET119=null;

		Object LBRACKET117_tree=null;
		Object NUMBER118_tree=null;
		Object RBRACKET119_tree=null;
		RewriteRuleTokenStream stream_LBRACKET=new RewriteRuleTokenStream(adaptor,"token LBRACKET");
		RewriteRuleTokenStream stream_RBRACKET=new RewriteRuleTokenStream(adaptor,"token RBRACKET");
		RewriteRuleTokenStream stream_NUMBER=new RewriteRuleTokenStream(adaptor,"token NUMBER");

		try {
			// antlr/Neptune.g:217:2: ( LBRACKET NUMBER RBRACKET -> ^( ARRAY_DEF NUMBER ) )
			// antlr/Neptune.g:217:5: LBRACKET NUMBER RBRACKET
			{
			LBRACKET117=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_array_def1718);  
			stream_LBRACKET.add(LBRACKET117);

			NUMBER118=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_array_def1720);  
			stream_NUMBER.add(NUMBER118);

			RBRACKET119=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_array_def1722);  
			stream_RBRACKET.add(RBRACKET119);

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
			// 218:3: -> ^( ARRAY_DEF NUMBER )
			{
				// antlr/Neptune.g:218:6: ^( ARRAY_DEF NUMBER )
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



	public static final BitSet FOLLOW_lines_in_program1053 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_program1055 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_line_in_lines1090 = new BitSet(new long[]{0x1244242763008E02L});
	public static final BitSet FOLLOW_expression_in_line1103 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_line1105 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declaration_in_line1111 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_line1113 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_logic_statement_in_line1119 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LCURLY_in_codeblock1131 = new BitSet(new long[]{0x1244242763008E00L});
	public static final BitSet FOLLOW_lines_in_codeblock1133 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_RCURLY_in_codeblock1135 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_while_statement_in_logic_statement1157 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_foreach_statement_in_logic_statement1162 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_if_statement_in_logic_statement1167 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHILE_in_while_statement1179 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_LPAREN_in_while_statement1182 = new BitSet(new long[]{0x0244242621000800L});
	public static final BitSet FOLLOW_expression_in_while_statement1185 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_while_statement1187 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_LCURLY_in_while_statement1190 = new BitSet(new long[]{0x1244242763008E00L});
	public static final BitSet FOLLOW_lines_in_while_statement1193 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_RCURLY_in_while_statement1195 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FOREACH_in_foreach_statement1208 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_LPAREN_in_foreach_statement1211 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_foreach_statement1214 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_IN_in_foreach_statement1216 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_foreach_statement1219 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_foreach_statement1221 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_LCURLY_in_foreach_statement1224 = new BitSet(new long[]{0x1244242763008E00L});
	public static final BitSet FOLLOW_lines_in_foreach_statement1227 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_RCURLY_in_foreach_statement1229 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_if_statement1242 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_LPAREN_in_if_statement1245 = new BitSet(new long[]{0x0244242621000800L});
	public static final BitSet FOLLOW_expression_in_if_statement1248 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_if_statement1250 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_LCURLY_in_if_statement1253 = new BitSet(new long[]{0x1244242763008E00L});
	public static final BitSet FOLLOW_lines_in_if_statement1256 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_RCURLY_in_if_statement1258 = new BitSet(new long[]{0x0000000000600002L});
	public static final BitSet FOLLOW_ELSIF_in_if_statement1264 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_LPAREN_in_if_statement1266 = new BitSet(new long[]{0x0244242621000800L});
	public static final BitSet FOLLOW_expression_in_if_statement1269 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_if_statement1271 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_LCURLY_in_if_statement1274 = new BitSet(new long[]{0x1244242763008E00L});
	public static final BitSet FOLLOW_lines_in_if_statement1277 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_RCURLY_in_if_statement1279 = new BitSet(new long[]{0x0000000000600002L});
	public static final BitSet FOLLOW_ELSE_in_if_statement1287 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_LCURLY_in_if_statement1289 = new BitSet(new long[]{0x1244242763008E00L});
	public static final BitSet FOLLOW_lines_in_if_statement1292 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_RCURLY_in_if_statement1294 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRINT_in_print_statement1309 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_LPAREN_in_print_statement1312 = new BitSet(new long[]{0x0244242621000800L});
	public static final BitSet FOLLOW_expression_in_print_statement1315 = new BitSet(new long[]{0x0010000000002000L});
	public static final BitSet FOLLOW_COMMA_in_print_statement1318 = new BitSet(new long[]{0x0244242621000800L});
	public static final BitSet FOLLOW_expression_in_print_statement1320 = new BitSet(new long[]{0x0010000000002000L});
	public static final BitSet FOLLOW_RPAREN_in_print_statement1324 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_READ_in_read_statement1337 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_LPAREN_in_read_statement1340 = new BitSet(new long[]{0x0244242621000800L});
	public static final BitSet FOLLOW_expression_in_read_statement1343 = new BitSet(new long[]{0x0010000000002000L});
	public static final BitSet FOLLOW_COMMA_in_read_statement1346 = new BitSet(new long[]{0x0244242621000800L});
	public static final BitSet FOLLOW_expression_in_read_statement1348 = new BitSet(new long[]{0x0010000000002000L});
	public static final BitSet FOLLOW_RPAREN_in_read_statement1352 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_declaration1365 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_declaration1367 = new BitSet(new long[]{0x0000000000000082L});
	public static final BitSet FOLLOW_BECOMES_in_declaration1370 = new BitSet(new long[]{0x0244242621000800L});
	public static final BitSet FOLLOW_expression_in_declaration1372 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CONST_in_declaration1398 = new BitSet(new long[]{0x0000000100000600L});
	public static final BitSet FOLLOW_type_in_declaration1401 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_declaration1403 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_BECOMES_in_declaration1405 = new BitSet(new long[]{0x0244242621000800L});
	public static final BitSet FOLLOW_expression_in_declaration1407 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignment_expr_in_expression1419 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_and_or_expr_in_assignment_expr1430 = new BitSet(new long[]{0x0000000000000082L});
	public static final BitSet FOLLOW_BECOMES_in_assignment_expr1433 = new BitSet(new long[]{0x0244242621000800L});
	public static final BitSet FOLLOW_assignment_expr_in_assignment_expr1436 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_boolean_expr_in_and_or_expr1450 = new BitSet(new long[]{0x0000080000000012L});
	public static final BitSet FOLLOW_AND_in_and_or_expr1454 = new BitSet(new long[]{0x0244242621000800L});
	public static final BitSet FOLLOW_OR_in_and_or_expr1459 = new BitSet(new long[]{0x0244242621000800L});
	public static final BitSet FOLLOW_boolean_expr_in_and_or_expr1463 = new BitSet(new long[]{0x0000080000000012L});
	public static final BitSet FOLLOW_plus_expr_in_boolean_expr1477 = new BitSet(new long[]{0x000002C018800002L});
	public static final BitSet FOLLOW_LT_in_boolean_expr1481 = new BitSet(new long[]{0x0244242621000800L});
	public static final BitSet FOLLOW_LT_EQ_in_boolean_expr1486 = new BitSet(new long[]{0x0244242621000800L});
	public static final BitSet FOLLOW_GT_in_boolean_expr1491 = new BitSet(new long[]{0x0244242621000800L});
	public static final BitSet FOLLOW_GT_EQ_in_boolean_expr1496 = new BitSet(new long[]{0x0244242621000800L});
	public static final BitSet FOLLOW_EQ_in_boolean_expr1501 = new BitSet(new long[]{0x0244242621000800L});
	public static final BitSet FOLLOW_NEQ_in_boolean_expr1506 = new BitSet(new long[]{0x0244242621000800L});
	public static final BitSet FOLLOW_plus_expr_in_boolean_expr1510 = new BitSet(new long[]{0x000002C018800002L});
	public static final BitSet FOLLOW_multi_expr_in_plus_expr1523 = new BitSet(new long[]{0x0000110000000002L});
	public static final BitSet FOLLOW_PLUS_in_plus_expr1527 = new BitSet(new long[]{0x0244242621000800L});
	public static final BitSet FOLLOW_MINUS_in_plus_expr1532 = new BitSet(new long[]{0x0244242621000800L});
	public static final BitSet FOLLOW_multi_expr_in_plus_expr1536 = new BitSet(new long[]{0x0000110000000002L});
	public static final BitSet FOLLOW_operand_in_multi_expr1549 = new BitSet(new long[]{0x0100000000020002L});
	public static final BitSet FOLLOW_TIMES_in_multi_expr1553 = new BitSet(new long[]{0x0244242621000800L});
	public static final BitSet FOLLOW_DIVIDE_in_multi_expr1558 = new BitSet(new long[]{0x0244242621000800L});
	public static final BitSet FOLLOW_operand_in_multi_expr1562 = new BitSet(new long[]{0x0100000000020002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_operand1580 = new BitSet(new long[]{0x0000000200000002L});
	public static final BitSet FOLLOW_array_def_in_operand1582 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMBER_in_operand1593 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_operand1603 = new BitSet(new long[]{0x0244242621000800L});
	public static final BitSet FOLLOW_assignment_expr_in_operand1606 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_operand1608 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACKET_in_operand1614 = new BitSet(new long[]{0x0244242621000800L});
	public static final BitSet FOLLOW_expression_in_operand1616 = new BitSet(new long[]{0x0001000000002000L});
	public static final BitSet FOLLOW_COMMA_in_operand1619 = new BitSet(new long[]{0x0244242621000800L});
	public static final BitSet FOLLOW_expression_in_operand1621 = new BitSet(new long[]{0x0001000000002000L});
	public static final BitSet FOLLOW_RBRACKET_in_operand1625 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_print_statement_in_operand1641 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_read_statement_in_operand1646 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_operand1651 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_LITERAL_in_operand1662 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_operand1667 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_codeblock_in_operand1672 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTEGER_in_type1686 = new BitSet(new long[]{0x0000000200000002L});
	public static final BitSet FOLLOW_array_def_in_type1688 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_in_type1694 = new BitSet(new long[]{0x0000000200000002L});
	public static final BitSet FOLLOW_array_def_in_type1696 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOLEAN_in_type1702 = new BitSet(new long[]{0x0000000200000002L});
	public static final BitSet FOLLOW_array_def_in_type1704 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACKET_in_array_def1718 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_NUMBER_in_array_def1720 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_RBRACKET_in_array_def1722 = new BitSet(new long[]{0x0000000000000002L});
}

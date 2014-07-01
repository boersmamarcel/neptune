// $ANTLR 3.5.2 antlr/Neptune.g 2014-07-01 13:35:27

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
				if ( ((LA1_0 >= BOOLEAN && LA1_0 <= CHAR_LITERAL)||LA1_0==CONST||(LA1_0 >= FALSE && LA1_0 <= FUNCTION)||(LA1_0 >= IDENTIFIER && LA1_0 <= IF)||(LA1_0 >= INTEGER && LA1_0 <= LCURLY)||LA1_0==LPAREN||LA1_0==NUMBER||LA1_0==PRINT||LA1_0==READ||LA1_0==STRING_LITERAL||LA1_0==TRUE||LA1_0==WHILE) ) {
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
	// antlr/Neptune.g:146:1: while_statement : WHILE ^ LPAREN ! expression RPAREN ! LCURLY ! lines RCURLY !;
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
			// antlr/Neptune.g:147:2: ( WHILE ^ LPAREN ! expression RPAREN ! LCURLY ! lines RCURLY !)
			// antlr/Neptune.g:147:4: WHILE ^ LPAREN ! expression RPAREN ! LCURLY ! lines RCURLY !
			{
			root_0 = (Object)adaptor.nil();


			WHILE15=(Token)match(input,WHILE,FOLLOW_WHILE_in_while_statement1181); 
			WHILE15_tree = (Object)adaptor.create(WHILE15);
			root_0 = (Object)adaptor.becomeRoot(WHILE15_tree, root_0);

			LPAREN16=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_while_statement1184); 
			pushFollow(FOLLOW_expression_in_while_statement1187);
			expression17=expression();
			state._fsp--;

			adaptor.addChild(root_0, expression17.getTree());

			RPAREN18=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_while_statement1189); 
			LCURLY19=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_while_statement1192); 
			pushFollow(FOLLOW_lines_in_while_statement1195);
			lines20=lines();
			state._fsp--;

			adaptor.addChild(root_0, lines20.getTree());

			RCURLY21=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_while_statement1197); 
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
	// antlr/Neptune.g:150:1: foreach_statement : FOREACH ^ LPAREN ! IDENTIFIER IN ! IDENTIFIER RPAREN ! LCURLY ! lines RCURLY !;
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
			// antlr/Neptune.g:151:2: ( FOREACH ^ LPAREN ! IDENTIFIER IN ! IDENTIFIER RPAREN ! LCURLY ! lines RCURLY !)
			// antlr/Neptune.g:151:4: FOREACH ^ LPAREN ! IDENTIFIER IN ! IDENTIFIER RPAREN ! LCURLY ! lines RCURLY !
			{
			root_0 = (Object)adaptor.nil();


			FOREACH22=(Token)match(input,FOREACH,FOLLOW_FOREACH_in_foreach_statement1210); 
			FOREACH22_tree = (Object)adaptor.create(FOREACH22);
			root_0 = (Object)adaptor.becomeRoot(FOREACH22_tree, root_0);

			LPAREN23=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_foreach_statement1213); 
			IDENTIFIER24=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_foreach_statement1216); 
			IDENTIFIER24_tree = (Object)adaptor.create(IDENTIFIER24);
			adaptor.addChild(root_0, IDENTIFIER24_tree);

			IN25=(Token)match(input,IN,FOLLOW_IN_in_foreach_statement1218); 
			IDENTIFIER26=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_foreach_statement1221); 
			IDENTIFIER26_tree = (Object)adaptor.create(IDENTIFIER26);
			adaptor.addChild(root_0, IDENTIFIER26_tree);

			RPAREN27=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_foreach_statement1223); 
			LCURLY28=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_foreach_statement1226); 
			pushFollow(FOLLOW_lines_in_foreach_statement1229);
			lines29=lines();
			state._fsp--;

			adaptor.addChild(root_0, lines29.getTree());

			RCURLY30=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_foreach_statement1231); 
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
	// antlr/Neptune.g:154:1: if_statement : IF ^ LPAREN ! expression RPAREN ! LCURLY ! lines RCURLY ! ( ELSIF LPAREN ! expression RPAREN ! LCURLY ! lines RCURLY !)* ( ELSE LCURLY ! lines RCURLY !)? ;
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
			// antlr/Neptune.g:155:2: ( IF ^ LPAREN ! expression RPAREN ! LCURLY ! lines RCURLY ! ( ELSIF LPAREN ! expression RPAREN ! LCURLY ! lines RCURLY !)* ( ELSE LCURLY ! lines RCURLY !)? )
			// antlr/Neptune.g:155:4: IF ^ LPAREN ! expression RPAREN ! LCURLY ! lines RCURLY ! ( ELSIF LPAREN ! expression RPAREN ! LCURLY ! lines RCURLY !)* ( ELSE LCURLY ! lines RCURLY !)?
			{
			root_0 = (Object)adaptor.nil();


			IF31=(Token)match(input,IF,FOLLOW_IF_in_if_statement1244); 
			IF31_tree = (Object)adaptor.create(IF31);
			root_0 = (Object)adaptor.becomeRoot(IF31_tree, root_0);

			LPAREN32=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_if_statement1247); 
			pushFollow(FOLLOW_expression_in_if_statement1250);
			expression33=expression();
			state._fsp--;

			adaptor.addChild(root_0, expression33.getTree());

			RPAREN34=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_if_statement1252); 
			LCURLY35=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_if_statement1255); 
			pushFollow(FOLLOW_lines_in_if_statement1258);
			lines36=lines();
			state._fsp--;

			adaptor.addChild(root_0, lines36.getTree());

			RCURLY37=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_if_statement1260); 
			// antlr/Neptune.g:156:3: ( ELSIF LPAREN ! expression RPAREN ! LCURLY ! lines RCURLY !)*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==ELSIF) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// antlr/Neptune.g:156:4: ELSIF LPAREN ! expression RPAREN ! LCURLY ! lines RCURLY !
					{
					ELSIF38=(Token)match(input,ELSIF,FOLLOW_ELSIF_in_if_statement1266); 
					ELSIF38_tree = (Object)adaptor.create(ELSIF38);
					adaptor.addChild(root_0, ELSIF38_tree);

					LPAREN39=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_if_statement1268); 
					pushFollow(FOLLOW_expression_in_if_statement1271);
					expression40=expression();
					state._fsp--;

					adaptor.addChild(root_0, expression40.getTree());

					RPAREN41=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_if_statement1273); 
					LCURLY42=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_if_statement1276); 
					pushFollow(FOLLOW_lines_in_if_statement1279);
					lines43=lines();
					state._fsp--;

					adaptor.addChild(root_0, lines43.getTree());

					RCURLY44=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_if_statement1281); 
					}
					break;

				default :
					break loop4;
				}
			}

			// antlr/Neptune.g:157:3: ( ELSE LCURLY ! lines RCURLY !)?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==ELSE) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// antlr/Neptune.g:157:4: ELSE LCURLY ! lines RCURLY !
					{
					ELSE45=(Token)match(input,ELSE,FOLLOW_ELSE_in_if_statement1289); 
					ELSE45_tree = (Object)adaptor.create(ELSE45);
					adaptor.addChild(root_0, ELSE45_tree);

					LCURLY46=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_if_statement1291); 
					pushFollow(FOLLOW_lines_in_if_statement1294);
					lines47=lines();
					state._fsp--;

					adaptor.addChild(root_0, lines47.getTree());

					RCURLY48=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_if_statement1296); 
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
	// antlr/Neptune.g:160:1: print_statement : PRINT ^ LPAREN ! expression ( COMMA expression )* RPAREN !;
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
			// antlr/Neptune.g:161:2: ( PRINT ^ LPAREN ! expression ( COMMA expression )* RPAREN !)
			// antlr/Neptune.g:161:4: PRINT ^ LPAREN ! expression ( COMMA expression )* RPAREN !
			{
			root_0 = (Object)adaptor.nil();


			PRINT49=(Token)match(input,PRINT,FOLLOW_PRINT_in_print_statement1311); 
			PRINT49_tree = (Object)adaptor.create(PRINT49);
			root_0 = (Object)adaptor.becomeRoot(PRINT49_tree, root_0);

			LPAREN50=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_print_statement1314); 
			pushFollow(FOLLOW_expression_in_print_statement1317);
			expression51=expression();
			state._fsp--;

			adaptor.addChild(root_0, expression51.getTree());

			// antlr/Neptune.g:161:30: ( COMMA expression )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==COMMA) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// antlr/Neptune.g:161:31: COMMA expression
					{
					COMMA52=(Token)match(input,COMMA,FOLLOW_COMMA_in_print_statement1320); 
					COMMA52_tree = (Object)adaptor.create(COMMA52);
					adaptor.addChild(root_0, COMMA52_tree);

					pushFollow(FOLLOW_expression_in_print_statement1322);
					expression53=expression();
					state._fsp--;

					adaptor.addChild(root_0, expression53.getTree());

					}
					break;

				default :
					break loop6;
				}
			}

			RPAREN54=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_print_statement1326); 
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
	// antlr/Neptune.g:164:1: read_statement : READ ^ LPAREN ! expression ( COMMA expression )* RPAREN !;
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
			// antlr/Neptune.g:165:2: ( READ ^ LPAREN ! expression ( COMMA expression )* RPAREN !)
			// antlr/Neptune.g:165:4: READ ^ LPAREN ! expression ( COMMA expression )* RPAREN !
			{
			root_0 = (Object)adaptor.nil();


			READ55=(Token)match(input,READ,FOLLOW_READ_in_read_statement1339); 
			READ55_tree = (Object)adaptor.create(READ55);
			root_0 = (Object)adaptor.becomeRoot(READ55_tree, root_0);

			LPAREN56=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_read_statement1342); 
			pushFollow(FOLLOW_expression_in_read_statement1345);
			expression57=expression();
			state._fsp--;

			adaptor.addChild(root_0, expression57.getTree());

			// antlr/Neptune.g:165:29: ( COMMA expression )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==COMMA) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// antlr/Neptune.g:165:30: COMMA expression
					{
					COMMA58=(Token)match(input,COMMA,FOLLOW_COMMA_in_read_statement1348); 
					COMMA58_tree = (Object)adaptor.create(COMMA58);
					adaptor.addChild(root_0, COMMA58_tree);

					pushFollow(FOLLOW_expression_in_read_statement1350);
					expression59=expression();
					state._fsp--;

					adaptor.addChild(root_0, expression59.getTree());

					}
					break;

				default :
					break loop7;
				}
			}

			RPAREN60=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_read_statement1354); 
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
	// antlr/Neptune.g:168:1: declaration : ( type IDENTIFIER ( BECOMES expression )? -> ^( VAR type IDENTIFIER ( BECOMES expression )? ) | CONST ^ type IDENTIFIER BECOMES expression | FUNCTION type IDENTIFIER LPAREN type IDENTIFIER ( COMMA type IDENTIFIER )* RPAREN LCURLY ( line )* return_statement RCURLY -> ^( FUNCTION type IDENTIFIER ( type IDENTIFIER )* ( line )* return_statement ) );
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
			// antlr/Neptune.g:169:2: ( type IDENTIFIER ( BECOMES expression )? -> ^( VAR type IDENTIFIER ( BECOMES expression )? ) | CONST ^ type IDENTIFIER BECOMES expression | FUNCTION type IDENTIFIER LPAREN type IDENTIFIER ( COMMA type IDENTIFIER )* RPAREN LCURLY ( line )* return_statement RCURLY -> ^( FUNCTION type IDENTIFIER ( type IDENTIFIER )* ( line )* return_statement ) )
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
					// antlr/Neptune.g:169:4: type IDENTIFIER ( BECOMES expression )?
					{
					pushFollow(FOLLOW_type_in_declaration1367);
					type61=type();
					state._fsp--;

					stream_type.add(type61.getTree());
					IDENTIFIER62=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_declaration1369);  
					stream_IDENTIFIER.add(IDENTIFIER62);

					// antlr/Neptune.g:169:20: ( BECOMES expression )?
					int alt8=2;
					int LA8_0 = input.LA(1);
					if ( (LA8_0==BECOMES) ) {
						alt8=1;
					}
					switch (alt8) {
						case 1 :
							// antlr/Neptune.g:169:21: BECOMES expression
							{
							BECOMES63=(Token)match(input,BECOMES,FOLLOW_BECOMES_in_declaration1372);  
							stream_BECOMES.add(BECOMES63);

							pushFollow(FOLLOW_expression_in_declaration1374);
							expression64=expression();
							state._fsp--;

							stream_expression.add(expression64.getTree());
							}
							break;

					}

					// AST REWRITE
					// elements: type, expression, BECOMES, IDENTIFIER
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 170:3: -> ^( VAR type IDENTIFIER ( BECOMES expression )? )
					{
						// antlr/Neptune.g:170:6: ^( VAR type IDENTIFIER ( BECOMES expression )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VAR, "VAR"), root_1);
						adaptor.addChild(root_1, stream_type.nextTree());
						adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
						// antlr/Neptune.g:170:28: ( BECOMES expression )?
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
					// antlr/Neptune.g:171:4: CONST ^ type IDENTIFIER BECOMES expression
					{
					root_0 = (Object)adaptor.nil();


					CONST65=(Token)match(input,CONST,FOLLOW_CONST_in_declaration1400); 
					CONST65_tree = (Object)adaptor.create(CONST65);
					root_0 = (Object)adaptor.becomeRoot(CONST65_tree, root_0);

					pushFollow(FOLLOW_type_in_declaration1403);
					type66=type();
					state._fsp--;

					adaptor.addChild(root_0, type66.getTree());

					IDENTIFIER67=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_declaration1405); 
					IDENTIFIER67_tree = (Object)adaptor.create(IDENTIFIER67);
					adaptor.addChild(root_0, IDENTIFIER67_tree);

					BECOMES68=(Token)match(input,BECOMES,FOLLOW_BECOMES_in_declaration1407); 
					BECOMES68_tree = (Object)adaptor.create(BECOMES68);
					adaptor.addChild(root_0, BECOMES68_tree);

					pushFollow(FOLLOW_expression_in_declaration1409);
					expression69=expression();
					state._fsp--;

					adaptor.addChild(root_0, expression69.getTree());

					}
					break;
				case 3 :
					// antlr/Neptune.g:172:6: FUNCTION type IDENTIFIER LPAREN type IDENTIFIER ( COMMA type IDENTIFIER )* RPAREN LCURLY ( line )* return_statement RCURLY
					{
					FUNCTION70=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_declaration1416);  
					stream_FUNCTION.add(FUNCTION70);

					pushFollow(FOLLOW_type_in_declaration1418);
					type71=type();
					state._fsp--;

					stream_type.add(type71.getTree());
					IDENTIFIER72=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_declaration1420);  
					stream_IDENTIFIER.add(IDENTIFIER72);

					LPAREN73=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_declaration1422);  
					stream_LPAREN.add(LPAREN73);

					pushFollow(FOLLOW_type_in_declaration1424);
					type74=type();
					state._fsp--;

					stream_type.add(type74.getTree());
					IDENTIFIER75=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_declaration1426);  
					stream_IDENTIFIER.add(IDENTIFIER75);

					// antlr/Neptune.g:172:54: ( COMMA type IDENTIFIER )*
					loop9:
					while (true) {
						int alt9=2;
						int LA9_0 = input.LA(1);
						if ( (LA9_0==COMMA) ) {
							alt9=1;
						}

						switch (alt9) {
						case 1 :
							// antlr/Neptune.g:172:55: COMMA type IDENTIFIER
							{
							COMMA76=(Token)match(input,COMMA,FOLLOW_COMMA_in_declaration1429);  
							stream_COMMA.add(COMMA76);

							pushFollow(FOLLOW_type_in_declaration1431);
							type77=type();
							state._fsp--;

							stream_type.add(type77.getTree());
							IDENTIFIER78=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_declaration1433);  
							stream_IDENTIFIER.add(IDENTIFIER78);

							}
							break;

						default :
							break loop9;
						}
					}

					RPAREN79=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_declaration1437);  
					stream_RPAREN.add(RPAREN79);

					LCURLY80=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_declaration1439);  
					stream_LCURLY.add(LCURLY80);

					// antlr/Neptune.g:172:93: ( line )*
					loop10:
					while (true) {
						int alt10=2;
						int LA10_0 = input.LA(1);
						if ( ((LA10_0 >= BOOLEAN && LA10_0 <= CHAR_LITERAL)||LA10_0==CONST||(LA10_0 >= FALSE && LA10_0 <= FUNCTION)||(LA10_0 >= IDENTIFIER && LA10_0 <= IF)||(LA10_0 >= INTEGER && LA10_0 <= LCURLY)||LA10_0==LPAREN||LA10_0==NUMBER||LA10_0==PRINT||LA10_0==READ||LA10_0==STRING_LITERAL||LA10_0==TRUE||LA10_0==WHILE) ) {
							alt10=1;
						}

						switch (alt10) {
						case 1 :
							// antlr/Neptune.g:172:93: line
							{
							pushFollow(FOLLOW_line_in_declaration1441);
							line81=line();
							state._fsp--;

							stream_line.add(line81.getTree());
							}
							break;

						default :
							break loop10;
						}
					}

					pushFollow(FOLLOW_return_statement_in_declaration1444);
					return_statement82=return_statement();
					state._fsp--;

					stream_return_statement.add(return_statement82.getTree());
					RCURLY83=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_declaration1446);  
					stream_RCURLY.add(RCURLY83);

					// AST REWRITE
					// elements: return_statement, line, IDENTIFIER, type, type, IDENTIFIER, FUNCTION
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 173:3: -> ^( FUNCTION type IDENTIFIER ( type IDENTIFIER )* ( line )* return_statement )
					{
						// antlr/Neptune.g:173:6: ^( FUNCTION type IDENTIFIER ( type IDENTIFIER )* ( line )* return_statement )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot(stream_FUNCTION.nextNode(), root_1);
						adaptor.addChild(root_1, stream_type.nextTree());
						adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
						// antlr/Neptune.g:173:33: ( type IDENTIFIER )*
						while ( stream_IDENTIFIER.hasNext()||stream_type.hasNext() ) {
							adaptor.addChild(root_1, stream_type.nextTree());
							adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
						}
						stream_IDENTIFIER.reset();
						stream_type.reset();

						// antlr/Neptune.g:173:52: ( line )*
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
	// antlr/Neptune.g:176:1: return_statement : RETURN ^ LPAREN ! expression RPAREN ! SEMICOLON !;
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
			// antlr/Neptune.g:177:2: ( RETURN ^ LPAREN ! expression RPAREN ! SEMICOLON !)
			// antlr/Neptune.g:177:4: RETURN ^ LPAREN ! expression RPAREN ! SEMICOLON !
			{
			root_0 = (Object)adaptor.nil();


			RETURN84=(Token)match(input,RETURN,FOLLOW_RETURN_in_return_statement1481); 
			RETURN84_tree = (Object)adaptor.create(RETURN84);
			root_0 = (Object)adaptor.becomeRoot(RETURN84_tree, root_0);

			LPAREN85=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_return_statement1484); 
			pushFollow(FOLLOW_expression_in_return_statement1487);
			expression86=expression();
			state._fsp--;

			adaptor.addChild(root_0, expression86.getTree());

			RPAREN87=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_return_statement1489); 
			SEMICOLON88=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_return_statement1492); 
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
	// antlr/Neptune.g:180:1: expression : assignment_expr ;
	public final NeptuneParser.expression_return expression() throws RecognitionException {
		NeptuneParser.expression_return retval = new NeptuneParser.expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope assignment_expr89 =null;


		try {
			// antlr/Neptune.g:181:2: ( assignment_expr )
			// antlr/Neptune.g:181:5: assignment_expr
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_assignment_expr_in_expression1505);
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
	// antlr/Neptune.g:184:1: assignment_expr : and_or_expr ( BECOMES ^ assignment_expr )? ;
	public final NeptuneParser.assignment_expr_return assignment_expr() throws RecognitionException {
		NeptuneParser.assignment_expr_return retval = new NeptuneParser.assignment_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token BECOMES91=null;
		ParserRuleReturnScope and_or_expr90 =null;
		ParserRuleReturnScope assignment_expr92 =null;

		Object BECOMES91_tree=null;

		try {
			// antlr/Neptune.g:185:2: ( and_or_expr ( BECOMES ^ assignment_expr )? )
			// antlr/Neptune.g:185:4: and_or_expr ( BECOMES ^ assignment_expr )?
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_and_or_expr_in_assignment_expr1516);
			and_or_expr90=and_or_expr();
			state._fsp--;

			adaptor.addChild(root_0, and_or_expr90.getTree());

			// antlr/Neptune.g:185:16: ( BECOMES ^ assignment_expr )?
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==BECOMES) ) {
				alt12=1;
			}
			switch (alt12) {
				case 1 :
					// antlr/Neptune.g:185:17: BECOMES ^ assignment_expr
					{
					BECOMES91=(Token)match(input,BECOMES,FOLLOW_BECOMES_in_assignment_expr1519); 
					BECOMES91_tree = (Object)adaptor.create(BECOMES91);
					root_0 = (Object)adaptor.becomeRoot(BECOMES91_tree, root_0);

					pushFollow(FOLLOW_assignment_expr_in_assignment_expr1522);
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


	public static class and_or_expr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "and_or_expr"
	// antlr/Neptune.g:188:1: and_or_expr : boolean_expr ( ( AND ^| OR ^) boolean_expr )* ;
	public final NeptuneParser.and_or_expr_return and_or_expr() throws RecognitionException {
		NeptuneParser.and_or_expr_return retval = new NeptuneParser.and_or_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token AND94=null;
		Token OR95=null;
		ParserRuleReturnScope boolean_expr93 =null;
		ParserRuleReturnScope boolean_expr96 =null;

		Object AND94_tree=null;
		Object OR95_tree=null;

		try {
			// antlr/Neptune.g:189:2: ( boolean_expr ( ( AND ^| OR ^) boolean_expr )* )
			// antlr/Neptune.g:189:4: boolean_expr ( ( AND ^| OR ^) boolean_expr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_boolean_expr_in_and_or_expr1536);
			boolean_expr93=boolean_expr();
			state._fsp--;

			adaptor.addChild(root_0, boolean_expr93.getTree());

			// antlr/Neptune.g:189:17: ( ( AND ^| OR ^) boolean_expr )*
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( (LA14_0==AND||LA14_0==OR) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// antlr/Neptune.g:189:18: ( AND ^| OR ^) boolean_expr
					{
					// antlr/Neptune.g:189:18: ( AND ^| OR ^)
					int alt13=2;
					int LA13_0 = input.LA(1);
					if ( (LA13_0==AND) ) {
						alt13=1;
					}
					else if ( (LA13_0==OR) ) {
						alt13=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 13, 0, input);
						throw nvae;
					}

					switch (alt13) {
						case 1 :
							// antlr/Neptune.g:189:19: AND ^
							{
							AND94=(Token)match(input,AND,FOLLOW_AND_in_and_or_expr1540); 
							AND94_tree = (Object)adaptor.create(AND94);
							root_0 = (Object)adaptor.becomeRoot(AND94_tree, root_0);

							}
							break;
						case 2 :
							// antlr/Neptune.g:189:26: OR ^
							{
							OR95=(Token)match(input,OR,FOLLOW_OR_in_and_or_expr1545); 
							OR95_tree = (Object)adaptor.create(OR95);
							root_0 = (Object)adaptor.becomeRoot(OR95_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_boolean_expr_in_and_or_expr1549);
					boolean_expr96=boolean_expr();
					state._fsp--;

					adaptor.addChild(root_0, boolean_expr96.getTree());

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
	// $ANTLR end "and_or_expr"


	public static class boolean_expr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "boolean_expr"
	// antlr/Neptune.g:192:1: boolean_expr : plus_expr ( ( LT ^| LT_EQ ^| GT ^| GT_EQ ^| EQ ^| NEQ ^) plus_expr )* ;
	public final NeptuneParser.boolean_expr_return boolean_expr() throws RecognitionException {
		NeptuneParser.boolean_expr_return retval = new NeptuneParser.boolean_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token LT98=null;
		Token LT_EQ99=null;
		Token GT100=null;
		Token GT_EQ101=null;
		Token EQ102=null;
		Token NEQ103=null;
		ParserRuleReturnScope plus_expr97 =null;
		ParserRuleReturnScope plus_expr104 =null;

		Object LT98_tree=null;
		Object LT_EQ99_tree=null;
		Object GT100_tree=null;
		Object GT_EQ101_tree=null;
		Object EQ102_tree=null;
		Object NEQ103_tree=null;

		try {
			// antlr/Neptune.g:193:2: ( plus_expr ( ( LT ^| LT_EQ ^| GT ^| GT_EQ ^| EQ ^| NEQ ^) plus_expr )* )
			// antlr/Neptune.g:193:4: plus_expr ( ( LT ^| LT_EQ ^| GT ^| GT_EQ ^| EQ ^| NEQ ^) plus_expr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_plus_expr_in_boolean_expr1563);
			plus_expr97=plus_expr();
			state._fsp--;

			adaptor.addChild(root_0, plus_expr97.getTree());

			// antlr/Neptune.g:193:14: ( ( LT ^| LT_EQ ^| GT ^| GT_EQ ^| EQ ^| NEQ ^) plus_expr )*
			loop16:
			while (true) {
				int alt16=2;
				int LA16_0 = input.LA(1);
				if ( (LA16_0==EQ||(LA16_0 >= GT && LA16_0 <= GT_EQ)||(LA16_0 >= LT && LA16_0 <= LT_EQ)||LA16_0==NEQ) ) {
					alt16=1;
				}

				switch (alt16) {
				case 1 :
					// antlr/Neptune.g:193:15: ( LT ^| LT_EQ ^| GT ^| GT_EQ ^| EQ ^| NEQ ^) plus_expr
					{
					// antlr/Neptune.g:193:15: ( LT ^| LT_EQ ^| GT ^| GT_EQ ^| EQ ^| NEQ ^)
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
							// antlr/Neptune.g:193:16: LT ^
							{
							LT98=(Token)match(input,LT,FOLLOW_LT_in_boolean_expr1567); 
							LT98_tree = (Object)adaptor.create(LT98);
							root_0 = (Object)adaptor.becomeRoot(LT98_tree, root_0);

							}
							break;
						case 2 :
							// antlr/Neptune.g:193:22: LT_EQ ^
							{
							LT_EQ99=(Token)match(input,LT_EQ,FOLLOW_LT_EQ_in_boolean_expr1572); 
							LT_EQ99_tree = (Object)adaptor.create(LT_EQ99);
							root_0 = (Object)adaptor.becomeRoot(LT_EQ99_tree, root_0);

							}
							break;
						case 3 :
							// antlr/Neptune.g:193:31: GT ^
							{
							GT100=(Token)match(input,GT,FOLLOW_GT_in_boolean_expr1577); 
							GT100_tree = (Object)adaptor.create(GT100);
							root_0 = (Object)adaptor.becomeRoot(GT100_tree, root_0);

							}
							break;
						case 4 :
							// antlr/Neptune.g:193:37: GT_EQ ^
							{
							GT_EQ101=(Token)match(input,GT_EQ,FOLLOW_GT_EQ_in_boolean_expr1582); 
							GT_EQ101_tree = (Object)adaptor.create(GT_EQ101);
							root_0 = (Object)adaptor.becomeRoot(GT_EQ101_tree, root_0);

							}
							break;
						case 5 :
							// antlr/Neptune.g:193:46: EQ ^
							{
							EQ102=(Token)match(input,EQ,FOLLOW_EQ_in_boolean_expr1587); 
							EQ102_tree = (Object)adaptor.create(EQ102);
							root_0 = (Object)adaptor.becomeRoot(EQ102_tree, root_0);

							}
							break;
						case 6 :
							// antlr/Neptune.g:193:52: NEQ ^
							{
							NEQ103=(Token)match(input,NEQ,FOLLOW_NEQ_in_boolean_expr1592); 
							NEQ103_tree = (Object)adaptor.create(NEQ103);
							root_0 = (Object)adaptor.becomeRoot(NEQ103_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_plus_expr_in_boolean_expr1596);
					plus_expr104=plus_expr();
					state._fsp--;

					adaptor.addChild(root_0, plus_expr104.getTree());

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
	// antlr/Neptune.g:196:1: plus_expr : multi_expr ( ( PLUS ^| MINUS ^) multi_expr )* ;
	public final NeptuneParser.plus_expr_return plus_expr() throws RecognitionException {
		NeptuneParser.plus_expr_return retval = new NeptuneParser.plus_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token PLUS106=null;
		Token MINUS107=null;
		ParserRuleReturnScope multi_expr105 =null;
		ParserRuleReturnScope multi_expr108 =null;

		Object PLUS106_tree=null;
		Object MINUS107_tree=null;

		try {
			// antlr/Neptune.g:197:2: ( multi_expr ( ( PLUS ^| MINUS ^) multi_expr )* )
			// antlr/Neptune.g:197:4: multi_expr ( ( PLUS ^| MINUS ^) multi_expr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_multi_expr_in_plus_expr1609);
			multi_expr105=multi_expr();
			state._fsp--;

			adaptor.addChild(root_0, multi_expr105.getTree());

			// antlr/Neptune.g:197:15: ( ( PLUS ^| MINUS ^) multi_expr )*
			loop18:
			while (true) {
				int alt18=2;
				int LA18_0 = input.LA(1);
				if ( (LA18_0==MINUS||LA18_0==PLUS) ) {
					alt18=1;
				}

				switch (alt18) {
				case 1 :
					// antlr/Neptune.g:197:16: ( PLUS ^| MINUS ^) multi_expr
					{
					// antlr/Neptune.g:197:16: ( PLUS ^| MINUS ^)
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
							// antlr/Neptune.g:197:17: PLUS ^
							{
							PLUS106=(Token)match(input,PLUS,FOLLOW_PLUS_in_plus_expr1613); 
							PLUS106_tree = (Object)adaptor.create(PLUS106);
							root_0 = (Object)adaptor.becomeRoot(PLUS106_tree, root_0);

							}
							break;
						case 2 :
							// antlr/Neptune.g:197:25: MINUS ^
							{
							MINUS107=(Token)match(input,MINUS,FOLLOW_MINUS_in_plus_expr1618); 
							MINUS107_tree = (Object)adaptor.create(MINUS107);
							root_0 = (Object)adaptor.becomeRoot(MINUS107_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_multi_expr_in_plus_expr1622);
					multi_expr108=multi_expr();
					state._fsp--;

					adaptor.addChild(root_0, multi_expr108.getTree());

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
	// antlr/Neptune.g:200:1: multi_expr : operand ( ( TIMES ^| DIVIDE ^) operand )* ;
	public final NeptuneParser.multi_expr_return multi_expr() throws RecognitionException {
		NeptuneParser.multi_expr_return retval = new NeptuneParser.multi_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token TIMES110=null;
		Token DIVIDE111=null;
		ParserRuleReturnScope operand109 =null;
		ParserRuleReturnScope operand112 =null;

		Object TIMES110_tree=null;
		Object DIVIDE111_tree=null;

		try {
			// antlr/Neptune.g:201:2: ( operand ( ( TIMES ^| DIVIDE ^) operand )* )
			// antlr/Neptune.g:201:4: operand ( ( TIMES ^| DIVIDE ^) operand )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_operand_in_multi_expr1635);
			operand109=operand();
			state._fsp--;

			adaptor.addChild(root_0, operand109.getTree());

			// antlr/Neptune.g:201:12: ( ( TIMES ^| DIVIDE ^) operand )*
			loop20:
			while (true) {
				int alt20=2;
				int LA20_0 = input.LA(1);
				if ( (LA20_0==DIVIDE||LA20_0==TIMES) ) {
					alt20=1;
				}

				switch (alt20) {
				case 1 :
					// antlr/Neptune.g:201:13: ( TIMES ^| DIVIDE ^) operand
					{
					// antlr/Neptune.g:201:13: ( TIMES ^| DIVIDE ^)
					int alt19=2;
					int LA19_0 = input.LA(1);
					if ( (LA19_0==TIMES) ) {
						alt19=1;
					}
					else if ( (LA19_0==DIVIDE) ) {
						alt19=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 19, 0, input);
						throw nvae;
					}

					switch (alt19) {
						case 1 :
							// antlr/Neptune.g:201:14: TIMES ^
							{
							TIMES110=(Token)match(input,TIMES,FOLLOW_TIMES_in_multi_expr1639); 
							TIMES110_tree = (Object)adaptor.create(TIMES110);
							root_0 = (Object)adaptor.becomeRoot(TIMES110_tree, root_0);

							}
							break;
						case 2 :
							// antlr/Neptune.g:201:23: DIVIDE ^
							{
							DIVIDE111=(Token)match(input,DIVIDE,FOLLOW_DIVIDE_in_multi_expr1644); 
							DIVIDE111_tree = (Object)adaptor.create(DIVIDE111);
							root_0 = (Object)adaptor.becomeRoot(DIVIDE111_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_operand_in_multi_expr1648);
					operand112=operand();
					state._fsp--;

					adaptor.addChild(root_0, operand112.getTree());

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


	public static class operand_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "operand"
	// antlr/Neptune.g:204:1: operand : ( IDENTIFIER ( ( ( array_def )? -> ^( IDENTIFIER ( array_def )? ) ) | ( LPAREN ( expression ( COMMA expression )* )? RPAREN -> ^( FUNCTION IDENTIFIER ( ^( ARRAY_SET ( expression )+ ) )? ) ) ) | NUMBER | LPAREN ! assignment_expr RPAREN !| LBRACKET expression ( COMMA expression )* RBRACKET -> ^( ARRAY_SET ( expression )+ ) | print_statement | read_statement | ( TRUE | FALSE ) | CHAR_LITERAL | STRING_LITERAL | codeblock );
	public final NeptuneParser.operand_return operand() throws RecognitionException {
		NeptuneParser.operand_return retval = new NeptuneParser.operand_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IDENTIFIER113=null;
		Token LPAREN115=null;
		Token COMMA117=null;
		Token RPAREN119=null;
		Token NUMBER120=null;
		Token LPAREN121=null;
		Token RPAREN123=null;
		Token LBRACKET124=null;
		Token COMMA126=null;
		Token RBRACKET128=null;
		Token set131=null;
		Token CHAR_LITERAL132=null;
		Token STRING_LITERAL133=null;
		ParserRuleReturnScope array_def114 =null;
		ParserRuleReturnScope expression116 =null;
		ParserRuleReturnScope expression118 =null;
		ParserRuleReturnScope assignment_expr122 =null;
		ParserRuleReturnScope expression125 =null;
		ParserRuleReturnScope expression127 =null;
		ParserRuleReturnScope print_statement129 =null;
		ParserRuleReturnScope read_statement130 =null;
		ParserRuleReturnScope codeblock134 =null;

		Object IDENTIFIER113_tree=null;
		Object LPAREN115_tree=null;
		Object COMMA117_tree=null;
		Object RPAREN119_tree=null;
		Object NUMBER120_tree=null;
		Object LPAREN121_tree=null;
		Object RPAREN123_tree=null;
		Object LBRACKET124_tree=null;
		Object COMMA126_tree=null;
		Object RBRACKET128_tree=null;
		Object set131_tree=null;
		Object CHAR_LITERAL132_tree=null;
		Object STRING_LITERAL133_tree=null;
		RewriteRuleTokenStream stream_LBRACKET=new RewriteRuleTokenStream(adaptor,"token LBRACKET");
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleTokenStream stream_RBRACKET=new RewriteRuleTokenStream(adaptor,"token RBRACKET");
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_array_def=new RewriteRuleSubtreeStream(adaptor,"rule array_def");

		try {
			// antlr/Neptune.g:205:5: ( IDENTIFIER ( ( ( array_def )? -> ^( IDENTIFIER ( array_def )? ) ) | ( LPAREN ( expression ( COMMA expression )* )? RPAREN -> ^( FUNCTION IDENTIFIER ( ^( ARRAY_SET ( expression )+ ) )? ) ) ) | NUMBER | LPAREN ! assignment_expr RPAREN !| LBRACKET expression ( COMMA expression )* RBRACKET -> ^( ARRAY_SET ( expression )+ ) | print_statement | read_statement | ( TRUE | FALSE ) | CHAR_LITERAL | STRING_LITERAL | codeblock )
			int alt26=10;
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
			case FALSE:
			case TRUE:
				{
				alt26=7;
				}
				break;
			case CHAR_LITERAL:
				{
				alt26=8;
				}
				break;
			case STRING_LITERAL:
				{
				alt26=9;
				}
				break;
			case LCURLY:
				{
				alt26=10;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 26, 0, input);
				throw nvae;
			}
			switch (alt26) {
				case 1 :
					// antlr/Neptune.g:205:9: IDENTIFIER ( ( ( array_def )? -> ^( IDENTIFIER ( array_def )? ) ) | ( LPAREN ( expression ( COMMA expression )* )? RPAREN -> ^( FUNCTION IDENTIFIER ( ^( ARRAY_SET ( expression )+ ) )? ) ) )
					{
					IDENTIFIER113=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_operand1666);  
					stream_IDENTIFIER.add(IDENTIFIER113);

					// antlr/Neptune.g:205:20: ( ( ( array_def )? -> ^( IDENTIFIER ( array_def )? ) ) | ( LPAREN ( expression ( COMMA expression )* )? RPAREN -> ^( FUNCTION IDENTIFIER ( ^( ARRAY_SET ( expression )+ ) )? ) ) )
					int alt24=2;
					int LA24_0 = input.LA(1);
					if ( (LA24_0==AND||LA24_0==BECOMES||LA24_0==COMMA||LA24_0==DIVIDE||LA24_0==EQ||(LA24_0 >= GT && LA24_0 <= GT_EQ)||LA24_0==LBRACKET||(LA24_0 >= LT && LA24_0 <= NEQ)||(LA24_0 >= OR && LA24_0 <= PLUS)||LA24_0==RBRACKET||(LA24_0 >= RPAREN && LA24_0 <= SEMICOLON)||LA24_0==TIMES) ) {
						alt24=1;
					}
					else if ( (LA24_0==LPAREN) ) {
						alt24=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 24, 0, input);
						throw nvae;
					}

					switch (alt24) {
						case 1 :
							// antlr/Neptune.g:205:21: ( ( array_def )? -> ^( IDENTIFIER ( array_def )? ) )
							{
							// antlr/Neptune.g:205:21: ( ( array_def )? -> ^( IDENTIFIER ( array_def )? ) )
							// antlr/Neptune.g:205:22: ( array_def )?
							{
							// antlr/Neptune.g:205:22: ( array_def )?
							int alt21=2;
							int LA21_0 = input.LA(1);
							if ( (LA21_0==LBRACKET) ) {
								alt21=1;
							}
							switch (alt21) {
								case 1 :
									// antlr/Neptune.g:205:22: array_def
									{
									pushFollow(FOLLOW_array_def_in_operand1670);
									array_def114=array_def();
									state._fsp--;

									stream_array_def.add(array_def114.getTree());
									}
									break;

							}

							// AST REWRITE
							// elements: array_def, IDENTIFIER
							// token labels: 
							// rule labels: retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (Object)adaptor.nil();
							// 205:33: -> ^( IDENTIFIER ( array_def )? )
							{
								// antlr/Neptune.g:205:36: ^( IDENTIFIER ( array_def )? )
								{
								Object root_1 = (Object)adaptor.nil();
								root_1 = (Object)adaptor.becomeRoot(stream_IDENTIFIER.nextNode(), root_1);
								// antlr/Neptune.g:205:49: ( array_def )?
								if ( stream_array_def.hasNext() ) {
									adaptor.addChild(root_1, stream_array_def.nextTree());
								}
								stream_array_def.reset();

								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;

							}

							}
							break;
						case 2 :
							// antlr/Neptune.g:205:63: ( LPAREN ( expression ( COMMA expression )* )? RPAREN -> ^( FUNCTION IDENTIFIER ( ^( ARRAY_SET ( expression )+ ) )? ) )
							{
							// antlr/Neptune.g:205:63: ( LPAREN ( expression ( COMMA expression )* )? RPAREN -> ^( FUNCTION IDENTIFIER ( ^( ARRAY_SET ( expression )+ ) )? ) )
							// antlr/Neptune.g:205:64: LPAREN ( expression ( COMMA expression )* )? RPAREN
							{
							LPAREN115=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_operand1685);  
							stream_LPAREN.add(LPAREN115);

							// antlr/Neptune.g:205:71: ( expression ( COMMA expression )* )?
							int alt23=2;
							int LA23_0 = input.LA(1);
							if ( (LA23_0==CHAR_LITERAL||LA23_0==FALSE||LA23_0==IDENTIFIER||(LA23_0 >= LBRACKET && LA23_0 <= LCURLY)||LA23_0==LPAREN||LA23_0==NUMBER||LA23_0==PRINT||LA23_0==READ||LA23_0==STRING_LITERAL||LA23_0==TRUE) ) {
								alt23=1;
							}
							switch (alt23) {
								case 1 :
									// antlr/Neptune.g:205:72: expression ( COMMA expression )*
									{
									pushFollow(FOLLOW_expression_in_operand1688);
									expression116=expression();
									state._fsp--;

									stream_expression.add(expression116.getTree());
									// antlr/Neptune.g:205:83: ( COMMA expression )*
									loop22:
									while (true) {
										int alt22=2;
										int LA22_0 = input.LA(1);
										if ( (LA22_0==COMMA) ) {
											alt22=1;
										}

										switch (alt22) {
										case 1 :
											// antlr/Neptune.g:205:84: COMMA expression
											{
											COMMA117=(Token)match(input,COMMA,FOLLOW_COMMA_in_operand1691);  
											stream_COMMA.add(COMMA117);

											pushFollow(FOLLOW_expression_in_operand1693);
											expression118=expression();
											state._fsp--;

											stream_expression.add(expression118.getTree());
											}
											break;

										default :
											break loop22;
										}
									}

									}
									break;

							}

							RPAREN119=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_operand1699);  
							stream_RPAREN.add(RPAREN119);

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
							// 205:112: -> ^( FUNCTION IDENTIFIER ( ^( ARRAY_SET ( expression )+ ) )? )
							{
								// antlr/Neptune.g:205:115: ^( FUNCTION IDENTIFIER ( ^( ARRAY_SET ( expression )+ ) )? )
								{
								Object root_1 = (Object)adaptor.nil();
								root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNCTION, "FUNCTION"), root_1);
								adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
								// antlr/Neptune.g:205:137: ( ^( ARRAY_SET ( expression )+ ) )?
								if ( stream_expression.hasNext() ) {
									// antlr/Neptune.g:205:137: ^( ARRAY_SET ( expression )+ )
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
					// antlr/Neptune.g:206:9: NUMBER
					{
					root_0 = (Object)adaptor.nil();


					NUMBER120=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_operand1727); 
					NUMBER120_tree = (Object)adaptor.create(NUMBER120);
					adaptor.addChild(root_0, NUMBER120_tree);

					}
					break;
				case 3 :
					// antlr/Neptune.g:207:9: LPAREN ! assignment_expr RPAREN !
					{
					root_0 = (Object)adaptor.nil();


					LPAREN121=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_operand1737); 
					pushFollow(FOLLOW_assignment_expr_in_operand1740);
					assignment_expr122=assignment_expr();
					state._fsp--;

					adaptor.addChild(root_0, assignment_expr122.getTree());

					RPAREN123=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_operand1742); 
					}
					break;
				case 4 :
					// antlr/Neptune.g:208:4: LBRACKET expression ( COMMA expression )* RBRACKET
					{
					LBRACKET124=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_operand1748);  
					stream_LBRACKET.add(LBRACKET124);

					pushFollow(FOLLOW_expression_in_operand1750);
					expression125=expression();
					state._fsp--;

					stream_expression.add(expression125.getTree());
					// antlr/Neptune.g:208:24: ( COMMA expression )*
					loop25:
					while (true) {
						int alt25=2;
						int LA25_0 = input.LA(1);
						if ( (LA25_0==COMMA) ) {
							alt25=1;
						}

						switch (alt25) {
						case 1 :
							// antlr/Neptune.g:208:25: COMMA expression
							{
							COMMA126=(Token)match(input,COMMA,FOLLOW_COMMA_in_operand1753);  
							stream_COMMA.add(COMMA126);

							pushFollow(FOLLOW_expression_in_operand1755);
							expression127=expression();
							state._fsp--;

							stream_expression.add(expression127.getTree());
							}
							break;

						default :
							break loop25;
						}
					}

					RBRACKET128=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_operand1759);  
					stream_RBRACKET.add(RBRACKET128);

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
					// 209:3: -> ^( ARRAY_SET ( expression )+ )
					{
						// antlr/Neptune.g:209:6: ^( ARRAY_SET ( expression )+ )
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
					// antlr/Neptune.g:210:4: print_statement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_print_statement_in_operand1775);
					print_statement129=print_statement();
					state._fsp--;

					adaptor.addChild(root_0, print_statement129.getTree());

					}
					break;
				case 6 :
					// antlr/Neptune.g:211:4: read_statement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_read_statement_in_operand1780);
					read_statement130=read_statement();
					state._fsp--;

					adaptor.addChild(root_0, read_statement130.getTree());

					}
					break;
				case 7 :
					// antlr/Neptune.g:212:4: ( TRUE | FALSE )
					{
					root_0 = (Object)adaptor.nil();


					set131=input.LT(1);
					if ( input.LA(1)==FALSE||input.LA(1)==TRUE ) {
						input.consume();
						adaptor.addChild(root_0, (Object)adaptor.create(set131));
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					}
					break;
				case 8 :
					// antlr/Neptune.g:213:4: CHAR_LITERAL
					{
					root_0 = (Object)adaptor.nil();


					CHAR_LITERAL132=(Token)match(input,CHAR_LITERAL,FOLLOW_CHAR_LITERAL_in_operand1796); 
					CHAR_LITERAL132_tree = (Object)adaptor.create(CHAR_LITERAL132);
					adaptor.addChild(root_0, CHAR_LITERAL132_tree);

					}
					break;
				case 9 :
					// antlr/Neptune.g:214:4: STRING_LITERAL
					{
					root_0 = (Object)adaptor.nil();


					STRING_LITERAL133=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_operand1801); 
					STRING_LITERAL133_tree = (Object)adaptor.create(STRING_LITERAL133);
					adaptor.addChild(root_0, STRING_LITERAL133_tree);

					}
					break;
				case 10 :
					// antlr/Neptune.g:215:4: codeblock
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_codeblock_in_operand1806);
					codeblock134=codeblock();
					state._fsp--;

					adaptor.addChild(root_0, codeblock134.getTree());

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
	// antlr/Neptune.g:218:1: type : ( INTEGER ( array_def )? | CHAR ( array_def )? | BOOLEAN ( array_def )? );
	public final NeptuneParser.type_return type() throws RecognitionException {
		NeptuneParser.type_return retval = new NeptuneParser.type_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token INTEGER135=null;
		Token CHAR137=null;
		Token BOOLEAN139=null;
		ParserRuleReturnScope array_def136 =null;
		ParserRuleReturnScope array_def138 =null;
		ParserRuleReturnScope array_def140 =null;

		Object INTEGER135_tree=null;
		Object CHAR137_tree=null;
		Object BOOLEAN139_tree=null;

		try {
			// antlr/Neptune.g:219:2: ( INTEGER ( array_def )? | CHAR ( array_def )? | BOOLEAN ( array_def )? )
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
					// antlr/Neptune.g:219:4: INTEGER ( array_def )?
					{
					root_0 = (Object)adaptor.nil();


					INTEGER135=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_type1820); 
					INTEGER135_tree = (Object)adaptor.create(INTEGER135);
					adaptor.addChild(root_0, INTEGER135_tree);

					// antlr/Neptune.g:219:12: ( array_def )?
					int alt27=2;
					int LA27_0 = input.LA(1);
					if ( (LA27_0==LBRACKET) ) {
						alt27=1;
					}
					switch (alt27) {
						case 1 :
							// antlr/Neptune.g:219:12: array_def
							{
							pushFollow(FOLLOW_array_def_in_type1822);
							array_def136=array_def();
							state._fsp--;

							adaptor.addChild(root_0, array_def136.getTree());

							}
							break;

					}

					}
					break;
				case 2 :
					// antlr/Neptune.g:220:4: CHAR ( array_def )?
					{
					root_0 = (Object)adaptor.nil();


					CHAR137=(Token)match(input,CHAR,FOLLOW_CHAR_in_type1828); 
					CHAR137_tree = (Object)adaptor.create(CHAR137);
					adaptor.addChild(root_0, CHAR137_tree);

					// antlr/Neptune.g:220:9: ( array_def )?
					int alt28=2;
					int LA28_0 = input.LA(1);
					if ( (LA28_0==LBRACKET) ) {
						alt28=1;
					}
					switch (alt28) {
						case 1 :
							// antlr/Neptune.g:220:9: array_def
							{
							pushFollow(FOLLOW_array_def_in_type1830);
							array_def138=array_def();
							state._fsp--;

							adaptor.addChild(root_0, array_def138.getTree());

							}
							break;

					}

					}
					break;
				case 3 :
					// antlr/Neptune.g:221:4: BOOLEAN ( array_def )?
					{
					root_0 = (Object)adaptor.nil();


					BOOLEAN139=(Token)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_type1836); 
					BOOLEAN139_tree = (Object)adaptor.create(BOOLEAN139);
					adaptor.addChild(root_0, BOOLEAN139_tree);

					// antlr/Neptune.g:221:12: ( array_def )?
					int alt29=2;
					int LA29_0 = input.LA(1);
					if ( (LA29_0==LBRACKET) ) {
						alt29=1;
					}
					switch (alt29) {
						case 1 :
							// antlr/Neptune.g:221:12: array_def
							{
							pushFollow(FOLLOW_array_def_in_type1838);
							array_def140=array_def();
							state._fsp--;

							adaptor.addChild(root_0, array_def140.getTree());

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
	// antlr/Neptune.g:224:1: array_def : LBRACKET NUMBER RBRACKET -> ^( ARRAY_DEF NUMBER ) ;
	public final NeptuneParser.array_def_return array_def() throws RecognitionException {
		NeptuneParser.array_def_return retval = new NeptuneParser.array_def_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token LBRACKET141=null;
		Token NUMBER142=null;
		Token RBRACKET143=null;

		Object LBRACKET141_tree=null;
		Object NUMBER142_tree=null;
		Object RBRACKET143_tree=null;
		RewriteRuleTokenStream stream_LBRACKET=new RewriteRuleTokenStream(adaptor,"token LBRACKET");
		RewriteRuleTokenStream stream_RBRACKET=new RewriteRuleTokenStream(adaptor,"token RBRACKET");
		RewriteRuleTokenStream stream_NUMBER=new RewriteRuleTokenStream(adaptor,"token NUMBER");

		try {
			// antlr/Neptune.g:225:2: ( LBRACKET NUMBER RBRACKET -> ^( ARRAY_DEF NUMBER ) )
			// antlr/Neptune.g:225:5: LBRACKET NUMBER RBRACKET
			{
			LBRACKET141=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_array_def1852);  
			stream_LBRACKET.add(LBRACKET141);

			NUMBER142=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_array_def1854);  
			stream_NUMBER.add(NUMBER142);

			RBRACKET143=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_array_def1856);  
			stream_RBRACKET.add(RBRACKET143);

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
			// 226:3: -> ^( ARRAY_DEF NUMBER )
			{
				// antlr/Neptune.g:226:6: ^( ARRAY_DEF NUMBER )
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
	public static final BitSet FOLLOW_line_in_lines1090 = new BitSet(new long[]{0x1244242767008E02L});
	public static final BitSet FOLLOW_expression_in_line1103 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_line1105 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declaration_in_line1111 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_line1113 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_logic_statement_in_line1119 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LCURLY_in_codeblock1131 = new BitSet(new long[]{0x1244242767008E00L});
	public static final BitSet FOLLOW_lines_in_codeblock1133 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_RCURLY_in_codeblock1135 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_while_statement_in_logic_statement1157 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_foreach_statement_in_logic_statement1162 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_if_statement_in_logic_statement1167 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHILE_in_while_statement1181 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_LPAREN_in_while_statement1184 = new BitSet(new long[]{0x0244242621000800L});
	public static final BitSet FOLLOW_expression_in_while_statement1187 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_while_statement1189 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_LCURLY_in_while_statement1192 = new BitSet(new long[]{0x1244242767008E00L});
	public static final BitSet FOLLOW_lines_in_while_statement1195 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_RCURLY_in_while_statement1197 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FOREACH_in_foreach_statement1210 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_LPAREN_in_foreach_statement1213 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_foreach_statement1216 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_IN_in_foreach_statement1218 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_foreach_statement1221 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_foreach_statement1223 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_LCURLY_in_foreach_statement1226 = new BitSet(new long[]{0x1244242767008E00L});
	public static final BitSet FOLLOW_lines_in_foreach_statement1229 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_RCURLY_in_foreach_statement1231 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_if_statement1244 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_LPAREN_in_if_statement1247 = new BitSet(new long[]{0x0244242621000800L});
	public static final BitSet FOLLOW_expression_in_if_statement1250 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_if_statement1252 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_LCURLY_in_if_statement1255 = new BitSet(new long[]{0x1244242767008E00L});
	public static final BitSet FOLLOW_lines_in_if_statement1258 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_RCURLY_in_if_statement1260 = new BitSet(new long[]{0x0000000000600002L});
	public static final BitSet FOLLOW_ELSIF_in_if_statement1266 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_LPAREN_in_if_statement1268 = new BitSet(new long[]{0x0244242621000800L});
	public static final BitSet FOLLOW_expression_in_if_statement1271 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_if_statement1273 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_LCURLY_in_if_statement1276 = new BitSet(new long[]{0x1244242767008E00L});
	public static final BitSet FOLLOW_lines_in_if_statement1279 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_RCURLY_in_if_statement1281 = new BitSet(new long[]{0x0000000000600002L});
	public static final BitSet FOLLOW_ELSE_in_if_statement1289 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_LCURLY_in_if_statement1291 = new BitSet(new long[]{0x1244242767008E00L});
	public static final BitSet FOLLOW_lines_in_if_statement1294 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_RCURLY_in_if_statement1296 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRINT_in_print_statement1311 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_LPAREN_in_print_statement1314 = new BitSet(new long[]{0x0244242621000800L});
	public static final BitSet FOLLOW_expression_in_print_statement1317 = new BitSet(new long[]{0x0010000000002000L});
	public static final BitSet FOLLOW_COMMA_in_print_statement1320 = new BitSet(new long[]{0x0244242621000800L});
	public static final BitSet FOLLOW_expression_in_print_statement1322 = new BitSet(new long[]{0x0010000000002000L});
	public static final BitSet FOLLOW_RPAREN_in_print_statement1326 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_READ_in_read_statement1339 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_LPAREN_in_read_statement1342 = new BitSet(new long[]{0x0244242621000800L});
	public static final BitSet FOLLOW_expression_in_read_statement1345 = new BitSet(new long[]{0x0010000000002000L});
	public static final BitSet FOLLOW_COMMA_in_read_statement1348 = new BitSet(new long[]{0x0244242621000800L});
	public static final BitSet FOLLOW_expression_in_read_statement1350 = new BitSet(new long[]{0x0010000000002000L});
	public static final BitSet FOLLOW_RPAREN_in_read_statement1354 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_declaration1367 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_declaration1369 = new BitSet(new long[]{0x0000000000000082L});
	public static final BitSet FOLLOW_BECOMES_in_declaration1372 = new BitSet(new long[]{0x0244242621000800L});
	public static final BitSet FOLLOW_expression_in_declaration1374 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CONST_in_declaration1400 = new BitSet(new long[]{0x0000000100000600L});
	public static final BitSet FOLLOW_type_in_declaration1403 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_declaration1405 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_BECOMES_in_declaration1407 = new BitSet(new long[]{0x0244242621000800L});
	public static final BitSet FOLLOW_expression_in_declaration1409 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FUNCTION_in_declaration1416 = new BitSet(new long[]{0x0000000100000600L});
	public static final BitSet FOLLOW_type_in_declaration1418 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_declaration1420 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_LPAREN_in_declaration1422 = new BitSet(new long[]{0x0000000100000600L});
	public static final BitSet FOLLOW_type_in_declaration1424 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_declaration1426 = new BitSet(new long[]{0x0010000000002000L});
	public static final BitSet FOLLOW_COMMA_in_declaration1429 = new BitSet(new long[]{0x0000000100000600L});
	public static final BitSet FOLLOW_type_in_declaration1431 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_declaration1433 = new BitSet(new long[]{0x0010000000002000L});
	public static final BitSet FOLLOW_RPAREN_in_declaration1437 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_LCURLY_in_declaration1439 = new BitSet(new long[]{0x124C242767008E00L});
	public static final BitSet FOLLOW_line_in_declaration1441 = new BitSet(new long[]{0x124C242767008E00L});
	public static final BitSet FOLLOW_return_statement_in_declaration1444 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_RCURLY_in_declaration1446 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RETURN_in_return_statement1481 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_LPAREN_in_return_statement1484 = new BitSet(new long[]{0x0244242621000800L});
	public static final BitSet FOLLOW_expression_in_return_statement1487 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_return_statement1489 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_return_statement1492 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignment_expr_in_expression1505 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_and_or_expr_in_assignment_expr1516 = new BitSet(new long[]{0x0000000000000082L});
	public static final BitSet FOLLOW_BECOMES_in_assignment_expr1519 = new BitSet(new long[]{0x0244242621000800L});
	public static final BitSet FOLLOW_assignment_expr_in_assignment_expr1522 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_boolean_expr_in_and_or_expr1536 = new BitSet(new long[]{0x0000080000000012L});
	public static final BitSet FOLLOW_AND_in_and_or_expr1540 = new BitSet(new long[]{0x0244242621000800L});
	public static final BitSet FOLLOW_OR_in_and_or_expr1545 = new BitSet(new long[]{0x0244242621000800L});
	public static final BitSet FOLLOW_boolean_expr_in_and_or_expr1549 = new BitSet(new long[]{0x0000080000000012L});
	public static final BitSet FOLLOW_plus_expr_in_boolean_expr1563 = new BitSet(new long[]{0x000002C018800002L});
	public static final BitSet FOLLOW_LT_in_boolean_expr1567 = new BitSet(new long[]{0x0244242621000800L});
	public static final BitSet FOLLOW_LT_EQ_in_boolean_expr1572 = new BitSet(new long[]{0x0244242621000800L});
	public static final BitSet FOLLOW_GT_in_boolean_expr1577 = new BitSet(new long[]{0x0244242621000800L});
	public static final BitSet FOLLOW_GT_EQ_in_boolean_expr1582 = new BitSet(new long[]{0x0244242621000800L});
	public static final BitSet FOLLOW_EQ_in_boolean_expr1587 = new BitSet(new long[]{0x0244242621000800L});
	public static final BitSet FOLLOW_NEQ_in_boolean_expr1592 = new BitSet(new long[]{0x0244242621000800L});
	public static final BitSet FOLLOW_plus_expr_in_boolean_expr1596 = new BitSet(new long[]{0x000002C018800002L});
	public static final BitSet FOLLOW_multi_expr_in_plus_expr1609 = new BitSet(new long[]{0x0000110000000002L});
	public static final BitSet FOLLOW_PLUS_in_plus_expr1613 = new BitSet(new long[]{0x0244242621000800L});
	public static final BitSet FOLLOW_MINUS_in_plus_expr1618 = new BitSet(new long[]{0x0244242621000800L});
	public static final BitSet FOLLOW_multi_expr_in_plus_expr1622 = new BitSet(new long[]{0x0000110000000002L});
	public static final BitSet FOLLOW_operand_in_multi_expr1635 = new BitSet(new long[]{0x0100000000020002L});
	public static final BitSet FOLLOW_TIMES_in_multi_expr1639 = new BitSet(new long[]{0x0244242621000800L});
	public static final BitSet FOLLOW_DIVIDE_in_multi_expr1644 = new BitSet(new long[]{0x0244242621000800L});
	public static final BitSet FOLLOW_operand_in_multi_expr1648 = new BitSet(new long[]{0x0100000000020002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_operand1666 = new BitSet(new long[]{0x0000002200000002L});
	public static final BitSet FOLLOW_array_def_in_operand1670 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_operand1685 = new BitSet(new long[]{0x0254242621000800L});
	public static final BitSet FOLLOW_expression_in_operand1688 = new BitSet(new long[]{0x0010000000002000L});
	public static final BitSet FOLLOW_COMMA_in_operand1691 = new BitSet(new long[]{0x0244242621000800L});
	public static final BitSet FOLLOW_expression_in_operand1693 = new BitSet(new long[]{0x0010000000002000L});
	public static final BitSet FOLLOW_RPAREN_in_operand1699 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMBER_in_operand1727 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_operand1737 = new BitSet(new long[]{0x0244242621000800L});
	public static final BitSet FOLLOW_assignment_expr_in_operand1740 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_operand1742 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACKET_in_operand1748 = new BitSet(new long[]{0x0244242621000800L});
	public static final BitSet FOLLOW_expression_in_operand1750 = new BitSet(new long[]{0x0001000000002000L});
	public static final BitSet FOLLOW_COMMA_in_operand1753 = new BitSet(new long[]{0x0244242621000800L});
	public static final BitSet FOLLOW_expression_in_operand1755 = new BitSet(new long[]{0x0001000000002000L});
	public static final BitSet FOLLOW_RBRACKET_in_operand1759 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_print_statement_in_operand1775 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_read_statement_in_operand1780 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_operand1785 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_LITERAL_in_operand1796 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_operand1801 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_codeblock_in_operand1806 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTEGER_in_type1820 = new BitSet(new long[]{0x0000000200000002L});
	public static final BitSet FOLLOW_array_def_in_type1822 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_in_type1828 = new BitSet(new long[]{0x0000000200000002L});
	public static final BitSet FOLLOW_array_def_in_type1830 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOLEAN_in_type1836 = new BitSet(new long[]{0x0000000200000002L});
	public static final BitSet FOLLOW_array_def_in_type1838 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACKET_in_array_def1852 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_NUMBER_in_array_def1854 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_RBRACKET_in_array_def1856 = new BitSet(new long[]{0x0000000000000002L});
}

// $ANTLR 3.5.2 antlr/Neptune.g 2014-07-04 21:59:31

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
	// antlr/Neptune.g:135:1: line : ( expression SEMICOLON !| declaration SEMICOLON !| logic_statement | return_statement SEMICOLON !| function_declaration );
	public final NeptuneParser.line_return line() throws RecognitionException {
		NeptuneParser.line_return retval = new NeptuneParser.line_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token SEMICOLON5=null;
		Token SEMICOLON7=null;
		Token SEMICOLON10=null;
		ParserRuleReturnScope expression4 =null;
		ParserRuleReturnScope declaration6 =null;
		ParserRuleReturnScope logic_statement8 =null;
		ParserRuleReturnScope return_statement9 =null;
		ParserRuleReturnScope function_declaration11 =null;

		Object SEMICOLON5_tree=null;
		Object SEMICOLON7_tree=null;
		Object SEMICOLON10_tree=null;

		try {
			// antlr/Neptune.g:136:2: ( expression SEMICOLON !| declaration SEMICOLON !| logic_statement | return_statement SEMICOLON !| function_declaration )
			int alt2=5;
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
			case FUNCTION:
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
					// antlr/Neptune.g:139:4: return_statement SEMICOLON !
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_return_statement_in_line1197);
					return_statement9=return_statement();
					state._fsp--;

					adaptor.addChild(root_0, return_statement9.getTree());

					SEMICOLON10=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_line1199); 
					}
					break;
				case 5 :
					// antlr/Neptune.g:140:4: function_declaration
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_function_declaration_in_line1205);
					function_declaration11=function_declaration();
					state._fsp--;

					adaptor.addChild(root_0, function_declaration11.getTree());

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
	// antlr/Neptune.g:143:1: codeblock : LCURLY lines RCURLY -> ^( BLOCK lines ) ;
	public final NeptuneParser.codeblock_return codeblock() throws RecognitionException {
		NeptuneParser.codeblock_return retval = new NeptuneParser.codeblock_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token LCURLY12=null;
		Token RCURLY14=null;
		ParserRuleReturnScope lines13 =null;

		Object LCURLY12_tree=null;
		Object RCURLY14_tree=null;
		RewriteRuleTokenStream stream_LCURLY=new RewriteRuleTokenStream(adaptor,"token LCURLY");
		RewriteRuleTokenStream stream_RCURLY=new RewriteRuleTokenStream(adaptor,"token RCURLY");
		RewriteRuleSubtreeStream stream_lines=new RewriteRuleSubtreeStream(adaptor,"rule lines");

		try {
			// antlr/Neptune.g:144:2: ( LCURLY lines RCURLY -> ^( BLOCK lines ) )
			// antlr/Neptune.g:144:4: LCURLY lines RCURLY
			{
			LCURLY12=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_codeblock1217);  
			stream_LCURLY.add(LCURLY12);

			pushFollow(FOLLOW_lines_in_codeblock1219);
			lines13=lines();
			state._fsp--;

			stream_lines.add(lines13.getTree());
			RCURLY14=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_codeblock1221);  
			stream_RCURLY.add(RCURLY14);

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
			// 145:3: -> ^( BLOCK lines )
			{
				// antlr/Neptune.g:145:6: ^( BLOCK lines )
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
	// antlr/Neptune.g:148:1: logic_statement : ( while_statement | foreach_statement | if_statement );
	public final NeptuneParser.logic_statement_return logic_statement() throws RecognitionException {
		NeptuneParser.logic_statement_return retval = new NeptuneParser.logic_statement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope while_statement15 =null;
		ParserRuleReturnScope foreach_statement16 =null;
		ParserRuleReturnScope if_statement17 =null;


		try {
			// antlr/Neptune.g:149:2: ( while_statement | foreach_statement | if_statement )
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
					// antlr/Neptune.g:149:4: while_statement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_while_statement_in_logic_statement1243);
					while_statement15=while_statement();
					state._fsp--;

					adaptor.addChild(root_0, while_statement15.getTree());

					}
					break;
				case 2 :
					// antlr/Neptune.g:150:4: foreach_statement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_foreach_statement_in_logic_statement1248);
					foreach_statement16=foreach_statement();
					state._fsp--;

					adaptor.addChild(root_0, foreach_statement16.getTree());

					}
					break;
				case 3 :
					// antlr/Neptune.g:151:4: if_statement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_if_statement_in_logic_statement1253);
					if_statement17=if_statement();
					state._fsp--;

					adaptor.addChild(root_0, if_statement17.getTree());

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
	// antlr/Neptune.g:156:1: while_statement : WHILE ^ LPAREN ! expression RPAREN ! LCURLY ! lines RCURLY !;
	public final NeptuneParser.while_statement_return while_statement() throws RecognitionException {
		NeptuneParser.while_statement_return retval = new NeptuneParser.while_statement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token WHILE18=null;
		Token LPAREN19=null;
		Token RPAREN21=null;
		Token LCURLY22=null;
		Token RCURLY24=null;
		ParserRuleReturnScope expression20 =null;
		ParserRuleReturnScope lines23 =null;

		Object WHILE18_tree=null;
		Object LPAREN19_tree=null;
		Object RPAREN21_tree=null;
		Object LCURLY22_tree=null;
		Object RCURLY24_tree=null;

		try {
			// antlr/Neptune.g:157:2: ( WHILE ^ LPAREN ! expression RPAREN ! LCURLY ! lines RCURLY !)
			// antlr/Neptune.g:157:4: WHILE ^ LPAREN ! expression RPAREN ! LCURLY ! lines RCURLY !
			{
			root_0 = (Object)adaptor.nil();


			WHILE18=(Token)match(input,WHILE,FOLLOW_WHILE_in_while_statement1267); 
			WHILE18_tree = (Object)adaptor.create(WHILE18);
			root_0 = (Object)adaptor.becomeRoot(WHILE18_tree, root_0);

			LPAREN19=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_while_statement1270); 
			pushFollow(FOLLOW_expression_in_while_statement1273);
			expression20=expression();
			state._fsp--;

			adaptor.addChild(root_0, expression20.getTree());

			RPAREN21=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_while_statement1275); 
			LCURLY22=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_while_statement1278); 
			pushFollow(FOLLOW_lines_in_while_statement1281);
			lines23=lines();
			state._fsp--;

			adaptor.addChild(root_0, lines23.getTree());

			RCURLY24=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_while_statement1283); 
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
	// antlr/Neptune.g:160:1: foreach_statement : FOREACH ^ LPAREN ! IDENTIFIER IN ! IDENTIFIER RPAREN ! LCURLY ! lines RCURLY !;
	public final NeptuneParser.foreach_statement_return foreach_statement() throws RecognitionException {
		NeptuneParser.foreach_statement_return retval = new NeptuneParser.foreach_statement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token FOREACH25=null;
		Token LPAREN26=null;
		Token IDENTIFIER27=null;
		Token IN28=null;
		Token IDENTIFIER29=null;
		Token RPAREN30=null;
		Token LCURLY31=null;
		Token RCURLY33=null;
		ParserRuleReturnScope lines32 =null;

		Object FOREACH25_tree=null;
		Object LPAREN26_tree=null;
		Object IDENTIFIER27_tree=null;
		Object IN28_tree=null;
		Object IDENTIFIER29_tree=null;
		Object RPAREN30_tree=null;
		Object LCURLY31_tree=null;
		Object RCURLY33_tree=null;

		try {
			// antlr/Neptune.g:161:2: ( FOREACH ^ LPAREN ! IDENTIFIER IN ! IDENTIFIER RPAREN ! LCURLY ! lines RCURLY !)
			// antlr/Neptune.g:161:4: FOREACH ^ LPAREN ! IDENTIFIER IN ! IDENTIFIER RPAREN ! LCURLY ! lines RCURLY !
			{
			root_0 = (Object)adaptor.nil();


			FOREACH25=(Token)match(input,FOREACH,FOLLOW_FOREACH_in_foreach_statement1296); 
			FOREACH25_tree = (Object)adaptor.create(FOREACH25);
			root_0 = (Object)adaptor.becomeRoot(FOREACH25_tree, root_0);

			LPAREN26=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_foreach_statement1299); 
			IDENTIFIER27=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_foreach_statement1302); 
			IDENTIFIER27_tree = (Object)adaptor.create(IDENTIFIER27);
			adaptor.addChild(root_0, IDENTIFIER27_tree);

			IN28=(Token)match(input,IN,FOLLOW_IN_in_foreach_statement1304); 
			IDENTIFIER29=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_foreach_statement1307); 
			IDENTIFIER29_tree = (Object)adaptor.create(IDENTIFIER29);
			adaptor.addChild(root_0, IDENTIFIER29_tree);

			RPAREN30=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_foreach_statement1309); 
			LCURLY31=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_foreach_statement1312); 
			pushFollow(FOLLOW_lines_in_foreach_statement1315);
			lines32=lines();
			state._fsp--;

			adaptor.addChild(root_0, lines32.getTree());

			RCURLY33=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_foreach_statement1317); 
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
	// antlr/Neptune.g:164:1: if_statement : IF ^ LPAREN ! expression RPAREN ! LCURLY ! lines RCURLY ! ( ELSIF LPAREN ! expression RPAREN ! LCURLY ! lines RCURLY !)* ( ELSE LCURLY ! lines RCURLY !)? ;
	public final NeptuneParser.if_statement_return if_statement() throws RecognitionException {
		NeptuneParser.if_statement_return retval = new NeptuneParser.if_statement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IF34=null;
		Token LPAREN35=null;
		Token RPAREN37=null;
		Token LCURLY38=null;
		Token RCURLY40=null;
		Token ELSIF41=null;
		Token LPAREN42=null;
		Token RPAREN44=null;
		Token LCURLY45=null;
		Token RCURLY47=null;
		Token ELSE48=null;
		Token LCURLY49=null;
		Token RCURLY51=null;
		ParserRuleReturnScope expression36 =null;
		ParserRuleReturnScope lines39 =null;
		ParserRuleReturnScope expression43 =null;
		ParserRuleReturnScope lines46 =null;
		ParserRuleReturnScope lines50 =null;

		Object IF34_tree=null;
		Object LPAREN35_tree=null;
		Object RPAREN37_tree=null;
		Object LCURLY38_tree=null;
		Object RCURLY40_tree=null;
		Object ELSIF41_tree=null;
		Object LPAREN42_tree=null;
		Object RPAREN44_tree=null;
		Object LCURLY45_tree=null;
		Object RCURLY47_tree=null;
		Object ELSE48_tree=null;
		Object LCURLY49_tree=null;
		Object RCURLY51_tree=null;

		try {
			// antlr/Neptune.g:165:2: ( IF ^ LPAREN ! expression RPAREN ! LCURLY ! lines RCURLY ! ( ELSIF LPAREN ! expression RPAREN ! LCURLY ! lines RCURLY !)* ( ELSE LCURLY ! lines RCURLY !)? )
			// antlr/Neptune.g:165:4: IF ^ LPAREN ! expression RPAREN ! LCURLY ! lines RCURLY ! ( ELSIF LPAREN ! expression RPAREN ! LCURLY ! lines RCURLY !)* ( ELSE LCURLY ! lines RCURLY !)?
			{
			root_0 = (Object)adaptor.nil();


			IF34=(Token)match(input,IF,FOLLOW_IF_in_if_statement1330); 
			IF34_tree = (Object)adaptor.create(IF34);
			root_0 = (Object)adaptor.becomeRoot(IF34_tree, root_0);

			LPAREN35=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_if_statement1333); 
			pushFollow(FOLLOW_expression_in_if_statement1336);
			expression36=expression();
			state._fsp--;

			adaptor.addChild(root_0, expression36.getTree());

			RPAREN37=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_if_statement1338); 
			LCURLY38=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_if_statement1341); 
			pushFollow(FOLLOW_lines_in_if_statement1344);
			lines39=lines();
			state._fsp--;

			adaptor.addChild(root_0, lines39.getTree());

			RCURLY40=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_if_statement1346); 
			// antlr/Neptune.g:166:3: ( ELSIF LPAREN ! expression RPAREN ! LCURLY ! lines RCURLY !)*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==ELSIF) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// antlr/Neptune.g:166:4: ELSIF LPAREN ! expression RPAREN ! LCURLY ! lines RCURLY !
					{
					ELSIF41=(Token)match(input,ELSIF,FOLLOW_ELSIF_in_if_statement1352); 
					ELSIF41_tree = (Object)adaptor.create(ELSIF41);
					adaptor.addChild(root_0, ELSIF41_tree);

					LPAREN42=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_if_statement1354); 
					pushFollow(FOLLOW_expression_in_if_statement1357);
					expression43=expression();
					state._fsp--;

					adaptor.addChild(root_0, expression43.getTree());

					RPAREN44=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_if_statement1359); 
					LCURLY45=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_if_statement1362); 
					pushFollow(FOLLOW_lines_in_if_statement1365);
					lines46=lines();
					state._fsp--;

					adaptor.addChild(root_0, lines46.getTree());

					RCURLY47=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_if_statement1367); 
					}
					break;

				default :
					break loop4;
				}
			}

			// antlr/Neptune.g:167:3: ( ELSE LCURLY ! lines RCURLY !)?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==ELSE) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// antlr/Neptune.g:167:4: ELSE LCURLY ! lines RCURLY !
					{
					ELSE48=(Token)match(input,ELSE,FOLLOW_ELSE_in_if_statement1375); 
					ELSE48_tree = (Object)adaptor.create(ELSE48);
					adaptor.addChild(root_0, ELSE48_tree);

					LCURLY49=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_if_statement1377); 
					pushFollow(FOLLOW_lines_in_if_statement1380);
					lines50=lines();
					state._fsp--;

					adaptor.addChild(root_0, lines50.getTree());

					RCURLY51=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_if_statement1382); 
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
	// antlr/Neptune.g:170:1: print_statement : PRINT ^ LPAREN ! expression ( COMMA ! expression )* RPAREN !;
	public final NeptuneParser.print_statement_return print_statement() throws RecognitionException {
		NeptuneParser.print_statement_return retval = new NeptuneParser.print_statement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token PRINT52=null;
		Token LPAREN53=null;
		Token COMMA55=null;
		Token RPAREN57=null;
		ParserRuleReturnScope expression54 =null;
		ParserRuleReturnScope expression56 =null;

		Object PRINT52_tree=null;
		Object LPAREN53_tree=null;
		Object COMMA55_tree=null;
		Object RPAREN57_tree=null;

		try {
			// antlr/Neptune.g:171:2: ( PRINT ^ LPAREN ! expression ( COMMA ! expression )* RPAREN !)
			// antlr/Neptune.g:171:4: PRINT ^ LPAREN ! expression ( COMMA ! expression )* RPAREN !
			{
			root_0 = (Object)adaptor.nil();


			PRINT52=(Token)match(input,PRINT,FOLLOW_PRINT_in_print_statement1397); 
			PRINT52_tree = (Object)adaptor.create(PRINT52);
			root_0 = (Object)adaptor.becomeRoot(PRINT52_tree, root_0);

			LPAREN53=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_print_statement1400); 
			pushFollow(FOLLOW_expression_in_print_statement1403);
			expression54=expression();
			state._fsp--;

			adaptor.addChild(root_0, expression54.getTree());

			// antlr/Neptune.g:171:30: ( COMMA ! expression )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==COMMA) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// antlr/Neptune.g:171:31: COMMA ! expression
					{
					COMMA55=(Token)match(input,COMMA,FOLLOW_COMMA_in_print_statement1406); 
					pushFollow(FOLLOW_expression_in_print_statement1409);
					expression56=expression();
					state._fsp--;

					adaptor.addChild(root_0, expression56.getTree());

					}
					break;

				default :
					break loop6;
				}
			}

			RPAREN57=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_print_statement1413); 
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
	// antlr/Neptune.g:174:1: read_statement : READ ^ LPAREN ! expression ( COMMA ! expression )* RPAREN !;
	public final NeptuneParser.read_statement_return read_statement() throws RecognitionException {
		NeptuneParser.read_statement_return retval = new NeptuneParser.read_statement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token READ58=null;
		Token LPAREN59=null;
		Token COMMA61=null;
		Token RPAREN63=null;
		ParserRuleReturnScope expression60 =null;
		ParserRuleReturnScope expression62 =null;

		Object READ58_tree=null;
		Object LPAREN59_tree=null;
		Object COMMA61_tree=null;
		Object RPAREN63_tree=null;

		try {
			// antlr/Neptune.g:175:2: ( READ ^ LPAREN ! expression ( COMMA ! expression )* RPAREN !)
			// antlr/Neptune.g:175:4: READ ^ LPAREN ! expression ( COMMA ! expression )* RPAREN !
			{
			root_0 = (Object)adaptor.nil();


			READ58=(Token)match(input,READ,FOLLOW_READ_in_read_statement1426); 
			READ58_tree = (Object)adaptor.create(READ58);
			root_0 = (Object)adaptor.becomeRoot(READ58_tree, root_0);

			LPAREN59=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_read_statement1429); 
			pushFollow(FOLLOW_expression_in_read_statement1432);
			expression60=expression();
			state._fsp--;

			adaptor.addChild(root_0, expression60.getTree());

			// antlr/Neptune.g:175:29: ( COMMA ! expression )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==COMMA) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// antlr/Neptune.g:175:30: COMMA ! expression
					{
					COMMA61=(Token)match(input,COMMA,FOLLOW_COMMA_in_read_statement1435); 
					pushFollow(FOLLOW_expression_in_read_statement1438);
					expression62=expression();
					state._fsp--;

					adaptor.addChild(root_0, expression62.getTree());

					}
					break;

				default :
					break loop7;
				}
			}

			RPAREN63=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_read_statement1442); 
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
	// antlr/Neptune.g:178:1: declaration : ( type IDENTIFIER ( BECOMES expression )? -> ^( VAR type IDENTIFIER ( BECOMES expression )? ) | CONST ^ type IDENTIFIER BECOMES expression );
	public final NeptuneParser.declaration_return declaration() throws RecognitionException {
		NeptuneParser.declaration_return retval = new NeptuneParser.declaration_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IDENTIFIER65=null;
		Token BECOMES66=null;
		Token CONST68=null;
		Token IDENTIFIER70=null;
		Token BECOMES71=null;
		ParserRuleReturnScope type64 =null;
		ParserRuleReturnScope expression67 =null;
		ParserRuleReturnScope type69 =null;
		ParserRuleReturnScope expression72 =null;

		Object IDENTIFIER65_tree=null;
		Object BECOMES66_tree=null;
		Object CONST68_tree=null;
		Object IDENTIFIER70_tree=null;
		Object BECOMES71_tree=null;
		RewriteRuleTokenStream stream_BECOMES=new RewriteRuleTokenStream(adaptor,"token BECOMES");
		RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");

		try {
			// antlr/Neptune.g:179:2: ( type IDENTIFIER ( BECOMES expression )? -> ^( VAR type IDENTIFIER ( BECOMES expression )? ) | CONST ^ type IDENTIFIER BECOMES expression )
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
					// antlr/Neptune.g:179:4: type IDENTIFIER ( BECOMES expression )?
					{
					pushFollow(FOLLOW_type_in_declaration1455);
					type64=type();
					state._fsp--;

					stream_type.add(type64.getTree());
					IDENTIFIER65=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_declaration1457);  
					stream_IDENTIFIER.add(IDENTIFIER65);

					// antlr/Neptune.g:179:20: ( BECOMES expression )?
					int alt8=2;
					int LA8_0 = input.LA(1);
					if ( (LA8_0==BECOMES) ) {
						alt8=1;
					}
					switch (alt8) {
						case 1 :
							// antlr/Neptune.g:179:21: BECOMES expression
							{
							BECOMES66=(Token)match(input,BECOMES,FOLLOW_BECOMES_in_declaration1460);  
							stream_BECOMES.add(BECOMES66);

							pushFollow(FOLLOW_expression_in_declaration1462);
							expression67=expression();
							state._fsp--;

							stream_expression.add(expression67.getTree());
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
					// 180:3: -> ^( VAR type IDENTIFIER ( BECOMES expression )? )
					{
						// antlr/Neptune.g:180:6: ^( VAR type IDENTIFIER ( BECOMES expression )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VAR, "VAR"), root_1);
						adaptor.addChild(root_1, stream_type.nextTree());
						adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
						// antlr/Neptune.g:180:28: ( BECOMES expression )?
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
					// antlr/Neptune.g:181:4: CONST ^ type IDENTIFIER BECOMES expression
					{
					root_0 = (Object)adaptor.nil();


					CONST68=(Token)match(input,CONST,FOLLOW_CONST_in_declaration1488); 
					CONST68_tree = (Object)adaptor.create(CONST68);
					root_0 = (Object)adaptor.becomeRoot(CONST68_tree, root_0);

					pushFollow(FOLLOW_type_in_declaration1491);
					type69=type();
					state._fsp--;

					adaptor.addChild(root_0, type69.getTree());

					IDENTIFIER70=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_declaration1493); 
					IDENTIFIER70_tree = (Object)adaptor.create(IDENTIFIER70);
					adaptor.addChild(root_0, IDENTIFIER70_tree);

					BECOMES71=(Token)match(input,BECOMES,FOLLOW_BECOMES_in_declaration1495); 
					BECOMES71_tree = (Object)adaptor.create(BECOMES71);
					adaptor.addChild(root_0, BECOMES71_tree);

					pushFollow(FOLLOW_expression_in_declaration1497);
					expression72=expression();
					state._fsp--;

					adaptor.addChild(root_0, expression72.getTree());

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


	public static class function_declaration_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "function_declaration"
	// antlr/Neptune.g:184:1: function_declaration : FUNCTION type IDENTIFIER LPAREN type IDENTIFIER ( COMMA type IDENTIFIER )* RPAREN LCURLY ( line )+ RCURLY -> ^( FUNCTION type IDENTIFIER ( type IDENTIFIER )* ( line )+ ) ;
	public final NeptuneParser.function_declaration_return function_declaration() throws RecognitionException {
		NeptuneParser.function_declaration_return retval = new NeptuneParser.function_declaration_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token FUNCTION73=null;
		Token IDENTIFIER75=null;
		Token LPAREN76=null;
		Token IDENTIFIER78=null;
		Token COMMA79=null;
		Token IDENTIFIER81=null;
		Token RPAREN82=null;
		Token LCURLY83=null;
		Token RCURLY85=null;
		ParserRuleReturnScope type74 =null;
		ParserRuleReturnScope type77 =null;
		ParserRuleReturnScope type80 =null;
		ParserRuleReturnScope line84 =null;

		Object FUNCTION73_tree=null;
		Object IDENTIFIER75_tree=null;
		Object LPAREN76_tree=null;
		Object IDENTIFIER78_tree=null;
		Object COMMA79_tree=null;
		Object IDENTIFIER81_tree=null;
		Object RPAREN82_tree=null;
		Object LCURLY83_tree=null;
		Object RCURLY85_tree=null;
		RewriteRuleTokenStream stream_FUNCTION=new RewriteRuleTokenStream(adaptor,"token FUNCTION");
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleTokenStream stream_LCURLY=new RewriteRuleTokenStream(adaptor,"token LCURLY");
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleTokenStream stream_RCURLY=new RewriteRuleTokenStream(adaptor,"token RCURLY");
		RewriteRuleSubtreeStream stream_line=new RewriteRuleSubtreeStream(adaptor,"rule line");
		RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");

		try {
			// antlr/Neptune.g:185:5: ( FUNCTION type IDENTIFIER LPAREN type IDENTIFIER ( COMMA type IDENTIFIER )* RPAREN LCURLY ( line )+ RCURLY -> ^( FUNCTION type IDENTIFIER ( type IDENTIFIER )* ( line )+ ) )
			// antlr/Neptune.g:185:7: FUNCTION type IDENTIFIER LPAREN type IDENTIFIER ( COMMA type IDENTIFIER )* RPAREN LCURLY ( line )+ RCURLY
			{
			FUNCTION73=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_function_declaration1512);  
			stream_FUNCTION.add(FUNCTION73);

			pushFollow(FOLLOW_type_in_function_declaration1514);
			type74=type();
			state._fsp--;

			stream_type.add(type74.getTree());
			IDENTIFIER75=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_function_declaration1516);  
			stream_IDENTIFIER.add(IDENTIFIER75);

			LPAREN76=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_function_declaration1518);  
			stream_LPAREN.add(LPAREN76);

			pushFollow(FOLLOW_type_in_function_declaration1520);
			type77=type();
			state._fsp--;

			stream_type.add(type77.getTree());
			IDENTIFIER78=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_function_declaration1522);  
			stream_IDENTIFIER.add(IDENTIFIER78);

			// antlr/Neptune.g:185:55: ( COMMA type IDENTIFIER )*
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==COMMA) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// antlr/Neptune.g:185:56: COMMA type IDENTIFIER
					{
					COMMA79=(Token)match(input,COMMA,FOLLOW_COMMA_in_function_declaration1525);  
					stream_COMMA.add(COMMA79);

					pushFollow(FOLLOW_type_in_function_declaration1527);
					type80=type();
					state._fsp--;

					stream_type.add(type80.getTree());
					IDENTIFIER81=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_function_declaration1529);  
					stream_IDENTIFIER.add(IDENTIFIER81);

					}
					break;

				default :
					break loop10;
				}
			}

			RPAREN82=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_function_declaration1533);  
			stream_RPAREN.add(RPAREN82);

			LCURLY83=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_function_declaration1535);  
			stream_LCURLY.add(LCURLY83);

			// antlr/Neptune.g:185:94: ( line )+
			int cnt11=0;
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( ((LA11_0 >= BOOLEAN && LA11_0 <= CHAR_LITERAL)||LA11_0==CONST||(LA11_0 >= FALSE && LA11_0 <= FUNCTION)||(LA11_0 >= IDENTIFIER && LA11_0 <= IF)||(LA11_0 >= INTEGER && LA11_0 <= LCURLY)||LA11_0==LPAREN||LA11_0==MINUS||LA11_0==NEGATE||LA11_0==NUMBER||(LA11_0 >= PLUS && LA11_0 <= PRINT)||(LA11_0 >= READ && LA11_0 <= RETURN)||(LA11_0 >= SIZEOF && LA11_0 <= STRING_LITERAL)||LA11_0==TRUE||LA11_0==WHILE) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// antlr/Neptune.g:185:94: line
					{
					pushFollow(FOLLOW_line_in_function_declaration1537);
					line84=line();
					state._fsp--;

					stream_line.add(line84.getTree());
					}
					break;

				default :
					if ( cnt11 >= 1 ) break loop11;
					EarlyExitException eee = new EarlyExitException(11, input);
					throw eee;
				}
				cnt11++;
			}

			RCURLY85=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_function_declaration1540);  
			stream_RCURLY.add(RCURLY85);

			// AST REWRITE
			// elements: type, IDENTIFIER, type, line, IDENTIFIER, FUNCTION
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 186:3: -> ^( FUNCTION type IDENTIFIER ( type IDENTIFIER )* ( line )+ )
			{
				// antlr/Neptune.g:186:6: ^( FUNCTION type IDENTIFIER ( type IDENTIFIER )* ( line )+ )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(stream_FUNCTION.nextNode(), root_1);
				adaptor.addChild(root_1, stream_type.nextTree());
				adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
				// antlr/Neptune.g:186:33: ( type IDENTIFIER )*
				while ( stream_type.hasNext()||stream_IDENTIFIER.hasNext() ) {
					adaptor.addChild(root_1, stream_type.nextTree());
					adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
				}
				stream_type.reset();
				stream_IDENTIFIER.reset();

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
	// $ANTLR end "function_declaration"


	public static class return_statement_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "return_statement"
	// antlr/Neptune.g:189:1: return_statement : RETURN ^ LPAREN ! expression RPAREN !;
	public final NeptuneParser.return_statement_return return_statement() throws RecognitionException {
		NeptuneParser.return_statement_return retval = new NeptuneParser.return_statement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token RETURN86=null;
		Token LPAREN87=null;
		Token RPAREN89=null;
		ParserRuleReturnScope expression88 =null;

		Object RETURN86_tree=null;
		Object LPAREN87_tree=null;
		Object RPAREN89_tree=null;

		try {
			// antlr/Neptune.g:190:2: ( RETURN ^ LPAREN ! expression RPAREN !)
			// antlr/Neptune.g:190:4: RETURN ^ LPAREN ! expression RPAREN !
			{
			root_0 = (Object)adaptor.nil();


			RETURN86=(Token)match(input,RETURN,FOLLOW_RETURN_in_return_statement1573); 
			RETURN86_tree = (Object)adaptor.create(RETURN86);
			root_0 = (Object)adaptor.becomeRoot(RETURN86_tree, root_0);

			LPAREN87=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_return_statement1576); 
			pushFollow(FOLLOW_expression_in_return_statement1579);
			expression88=expression();
			state._fsp--;

			adaptor.addChild(root_0, expression88.getTree());

			RPAREN89=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_return_statement1581); 
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
	// antlr/Neptune.g:193:1: expression : assignment_expr ;
	public final NeptuneParser.expression_return expression() throws RecognitionException {
		NeptuneParser.expression_return retval = new NeptuneParser.expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope assignment_expr90 =null;


		try {
			// antlr/Neptune.g:194:2: ( assignment_expr )
			// antlr/Neptune.g:194:5: assignment_expr
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_assignment_expr_in_expression1595);
			assignment_expr90=assignment_expr();
			state._fsp--;

			adaptor.addChild(root_0, assignment_expr90.getTree());

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
	// antlr/Neptune.g:197:1: assignment_expr : or_expr ( BECOMES ^ assignment_expr )? ;
	public final NeptuneParser.assignment_expr_return assignment_expr() throws RecognitionException {
		NeptuneParser.assignment_expr_return retval = new NeptuneParser.assignment_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token BECOMES92=null;
		ParserRuleReturnScope or_expr91 =null;
		ParserRuleReturnScope assignment_expr93 =null;

		Object BECOMES92_tree=null;

		try {
			// antlr/Neptune.g:198:2: ( or_expr ( BECOMES ^ assignment_expr )? )
			// antlr/Neptune.g:198:4: or_expr ( BECOMES ^ assignment_expr )?
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_or_expr_in_assignment_expr1607);
			or_expr91=or_expr();
			state._fsp--;

			adaptor.addChild(root_0, or_expr91.getTree());

			// antlr/Neptune.g:198:12: ( BECOMES ^ assignment_expr )?
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==BECOMES) ) {
				alt12=1;
			}
			switch (alt12) {
				case 1 :
					// antlr/Neptune.g:198:13: BECOMES ^ assignment_expr
					{
					BECOMES92=(Token)match(input,BECOMES,FOLLOW_BECOMES_in_assignment_expr1610); 
					BECOMES92_tree = (Object)adaptor.create(BECOMES92);
					root_0 = (Object)adaptor.becomeRoot(BECOMES92_tree, root_0);

					pushFollow(FOLLOW_assignment_expr_in_assignment_expr1613);
					assignment_expr93=assignment_expr();
					state._fsp--;

					adaptor.addChild(root_0, assignment_expr93.getTree());

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
	// antlr/Neptune.g:201:1: or_expr : and_expr ( OR ^ and_expr )* ;
	public final NeptuneParser.or_expr_return or_expr() throws RecognitionException {
		NeptuneParser.or_expr_return retval = new NeptuneParser.or_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token OR95=null;
		ParserRuleReturnScope and_expr94 =null;
		ParserRuleReturnScope and_expr96 =null;

		Object OR95_tree=null;

		try {
			// antlr/Neptune.g:202:2: ( and_expr ( OR ^ and_expr )* )
			// antlr/Neptune.g:202:4: and_expr ( OR ^ and_expr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_and_expr_in_or_expr1627);
			and_expr94=and_expr();
			state._fsp--;

			adaptor.addChild(root_0, and_expr94.getTree());

			// antlr/Neptune.g:202:13: ( OR ^ and_expr )*
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( (LA13_0==OR) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// antlr/Neptune.g:202:14: OR ^ and_expr
					{
					OR95=(Token)match(input,OR,FOLLOW_OR_in_or_expr1630); 
					OR95_tree = (Object)adaptor.create(OR95);
					root_0 = (Object)adaptor.becomeRoot(OR95_tree, root_0);

					pushFollow(FOLLOW_and_expr_in_or_expr1633);
					and_expr96=and_expr();
					state._fsp--;

					adaptor.addChild(root_0, and_expr96.getTree());

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
	// antlr/Neptune.g:205:1: and_expr : boolean_expr ( AND ^ boolean_expr )* ;
	public final NeptuneParser.and_expr_return and_expr() throws RecognitionException {
		NeptuneParser.and_expr_return retval = new NeptuneParser.and_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token AND98=null;
		ParserRuleReturnScope boolean_expr97 =null;
		ParserRuleReturnScope boolean_expr99 =null;

		Object AND98_tree=null;

		try {
			// antlr/Neptune.g:206:2: ( boolean_expr ( AND ^ boolean_expr )* )
			// antlr/Neptune.g:206:4: boolean_expr ( AND ^ boolean_expr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_boolean_expr_in_and_expr1647);
			boolean_expr97=boolean_expr();
			state._fsp--;

			adaptor.addChild(root_0, boolean_expr97.getTree());

			// antlr/Neptune.g:206:17: ( AND ^ boolean_expr )*
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( (LA14_0==AND) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// antlr/Neptune.g:206:18: AND ^ boolean_expr
					{
					AND98=(Token)match(input,AND,FOLLOW_AND_in_and_expr1650); 
					AND98_tree = (Object)adaptor.create(AND98);
					root_0 = (Object)adaptor.becomeRoot(AND98_tree, root_0);

					pushFollow(FOLLOW_boolean_expr_in_and_expr1653);
					boolean_expr99=boolean_expr();
					state._fsp--;

					adaptor.addChild(root_0, boolean_expr99.getTree());

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
	// antlr/Neptune.g:209:1: boolean_expr : plus_expr ( ( LT ^| LT_EQ ^| GT ^| GT_EQ ^| EQ ^| NEQ ^) plus_expr )* ;
	public final NeptuneParser.boolean_expr_return boolean_expr() throws RecognitionException {
		NeptuneParser.boolean_expr_return retval = new NeptuneParser.boolean_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token LT101=null;
		Token LT_EQ102=null;
		Token GT103=null;
		Token GT_EQ104=null;
		Token EQ105=null;
		Token NEQ106=null;
		ParserRuleReturnScope plus_expr100 =null;
		ParserRuleReturnScope plus_expr107 =null;

		Object LT101_tree=null;
		Object LT_EQ102_tree=null;
		Object GT103_tree=null;
		Object GT_EQ104_tree=null;
		Object EQ105_tree=null;
		Object NEQ106_tree=null;

		try {
			// antlr/Neptune.g:210:2: ( plus_expr ( ( LT ^| LT_EQ ^| GT ^| GT_EQ ^| EQ ^| NEQ ^) plus_expr )* )
			// antlr/Neptune.g:210:4: plus_expr ( ( LT ^| LT_EQ ^| GT ^| GT_EQ ^| EQ ^| NEQ ^) plus_expr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_plus_expr_in_boolean_expr1667);
			plus_expr100=plus_expr();
			state._fsp--;

			adaptor.addChild(root_0, plus_expr100.getTree());

			// antlr/Neptune.g:210:14: ( ( LT ^| LT_EQ ^| GT ^| GT_EQ ^| EQ ^| NEQ ^) plus_expr )*
			loop16:
			while (true) {
				int alt16=2;
				int LA16_0 = input.LA(1);
				if ( (LA16_0==EQ||(LA16_0 >= GT && LA16_0 <= GT_EQ)||(LA16_0 >= LT && LA16_0 <= LT_EQ)||LA16_0==NEQ) ) {
					alt16=1;
				}

				switch (alt16) {
				case 1 :
					// antlr/Neptune.g:210:15: ( LT ^| LT_EQ ^| GT ^| GT_EQ ^| EQ ^| NEQ ^) plus_expr
					{
					// antlr/Neptune.g:210:15: ( LT ^| LT_EQ ^| GT ^| GT_EQ ^| EQ ^| NEQ ^)
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
							// antlr/Neptune.g:210:16: LT ^
							{
							LT101=(Token)match(input,LT,FOLLOW_LT_in_boolean_expr1671); 
							LT101_tree = (Object)adaptor.create(LT101);
							root_0 = (Object)adaptor.becomeRoot(LT101_tree, root_0);

							}
							break;
						case 2 :
							// antlr/Neptune.g:210:22: LT_EQ ^
							{
							LT_EQ102=(Token)match(input,LT_EQ,FOLLOW_LT_EQ_in_boolean_expr1676); 
							LT_EQ102_tree = (Object)adaptor.create(LT_EQ102);
							root_0 = (Object)adaptor.becomeRoot(LT_EQ102_tree, root_0);

							}
							break;
						case 3 :
							// antlr/Neptune.g:210:31: GT ^
							{
							GT103=(Token)match(input,GT,FOLLOW_GT_in_boolean_expr1681); 
							GT103_tree = (Object)adaptor.create(GT103);
							root_0 = (Object)adaptor.becomeRoot(GT103_tree, root_0);

							}
							break;
						case 4 :
							// antlr/Neptune.g:210:37: GT_EQ ^
							{
							GT_EQ104=(Token)match(input,GT_EQ,FOLLOW_GT_EQ_in_boolean_expr1686); 
							GT_EQ104_tree = (Object)adaptor.create(GT_EQ104);
							root_0 = (Object)adaptor.becomeRoot(GT_EQ104_tree, root_0);

							}
							break;
						case 5 :
							// antlr/Neptune.g:210:46: EQ ^
							{
							EQ105=(Token)match(input,EQ,FOLLOW_EQ_in_boolean_expr1691); 
							EQ105_tree = (Object)adaptor.create(EQ105);
							root_0 = (Object)adaptor.becomeRoot(EQ105_tree, root_0);

							}
							break;
						case 6 :
							// antlr/Neptune.g:210:52: NEQ ^
							{
							NEQ106=(Token)match(input,NEQ,FOLLOW_NEQ_in_boolean_expr1696); 
							NEQ106_tree = (Object)adaptor.create(NEQ106);
							root_0 = (Object)adaptor.becomeRoot(NEQ106_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_plus_expr_in_boolean_expr1700);
					plus_expr107=plus_expr();
					state._fsp--;

					adaptor.addChild(root_0, plus_expr107.getTree());

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
	// antlr/Neptune.g:213:1: plus_expr : multi_expr ( ( PLUS ^| MINUS ^) multi_expr )* ;
	public final NeptuneParser.plus_expr_return plus_expr() throws RecognitionException {
		NeptuneParser.plus_expr_return retval = new NeptuneParser.plus_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token PLUS109=null;
		Token MINUS110=null;
		ParserRuleReturnScope multi_expr108 =null;
		ParserRuleReturnScope multi_expr111 =null;

		Object PLUS109_tree=null;
		Object MINUS110_tree=null;

		try {
			// antlr/Neptune.g:214:2: ( multi_expr ( ( PLUS ^| MINUS ^) multi_expr )* )
			// antlr/Neptune.g:214:4: multi_expr ( ( PLUS ^| MINUS ^) multi_expr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_multi_expr_in_plus_expr1713);
			multi_expr108=multi_expr();
			state._fsp--;

			adaptor.addChild(root_0, multi_expr108.getTree());

			// antlr/Neptune.g:214:15: ( ( PLUS ^| MINUS ^) multi_expr )*
			loop18:
			while (true) {
				int alt18=2;
				int LA18_0 = input.LA(1);
				if ( (LA18_0==MINUS||LA18_0==PLUS) ) {
					alt18=1;
				}

				switch (alt18) {
				case 1 :
					// antlr/Neptune.g:214:16: ( PLUS ^| MINUS ^) multi_expr
					{
					// antlr/Neptune.g:214:16: ( PLUS ^| MINUS ^)
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
							// antlr/Neptune.g:214:17: PLUS ^
							{
							PLUS109=(Token)match(input,PLUS,FOLLOW_PLUS_in_plus_expr1717); 
							PLUS109_tree = (Object)adaptor.create(PLUS109);
							root_0 = (Object)adaptor.becomeRoot(PLUS109_tree, root_0);

							}
							break;
						case 2 :
							// antlr/Neptune.g:214:25: MINUS ^
							{
							MINUS110=(Token)match(input,MINUS,FOLLOW_MINUS_in_plus_expr1722); 
							MINUS110_tree = (Object)adaptor.create(MINUS110);
							root_0 = (Object)adaptor.becomeRoot(MINUS110_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_multi_expr_in_plus_expr1726);
					multi_expr111=multi_expr();
					state._fsp--;

					adaptor.addChild(root_0, multi_expr111.getTree());

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
	// antlr/Neptune.g:217:1: multi_expr : unary_expr ( ( TIMES ^| DIVIDE ^| MOD ^) unary_expr )* ;
	public final NeptuneParser.multi_expr_return multi_expr() throws RecognitionException {
		NeptuneParser.multi_expr_return retval = new NeptuneParser.multi_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token TIMES113=null;
		Token DIVIDE114=null;
		Token MOD115=null;
		ParserRuleReturnScope unary_expr112 =null;
		ParserRuleReturnScope unary_expr116 =null;

		Object TIMES113_tree=null;
		Object DIVIDE114_tree=null;
		Object MOD115_tree=null;

		try {
			// antlr/Neptune.g:218:2: ( unary_expr ( ( TIMES ^| DIVIDE ^| MOD ^) unary_expr )* )
			// antlr/Neptune.g:218:4: unary_expr ( ( TIMES ^| DIVIDE ^| MOD ^) unary_expr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_unary_expr_in_multi_expr1739);
			unary_expr112=unary_expr();
			state._fsp--;

			adaptor.addChild(root_0, unary_expr112.getTree());

			// antlr/Neptune.g:218:15: ( ( TIMES ^| DIVIDE ^| MOD ^) unary_expr )*
			loop20:
			while (true) {
				int alt20=2;
				int LA20_0 = input.LA(1);
				if ( (LA20_0==DIVIDE||LA20_0==MOD||LA20_0==TIMES) ) {
					alt20=1;
				}

				switch (alt20) {
				case 1 :
					// antlr/Neptune.g:218:16: ( TIMES ^| DIVIDE ^| MOD ^) unary_expr
					{
					// antlr/Neptune.g:218:16: ( TIMES ^| DIVIDE ^| MOD ^)
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
							// antlr/Neptune.g:218:17: TIMES ^
							{
							TIMES113=(Token)match(input,TIMES,FOLLOW_TIMES_in_multi_expr1743); 
							TIMES113_tree = (Object)adaptor.create(TIMES113);
							root_0 = (Object)adaptor.becomeRoot(TIMES113_tree, root_0);

							}
							break;
						case 2 :
							// antlr/Neptune.g:218:26: DIVIDE ^
							{
							DIVIDE114=(Token)match(input,DIVIDE,FOLLOW_DIVIDE_in_multi_expr1748); 
							DIVIDE114_tree = (Object)adaptor.create(DIVIDE114);
							root_0 = (Object)adaptor.becomeRoot(DIVIDE114_tree, root_0);

							}
							break;
						case 3 :
							// antlr/Neptune.g:218:36: MOD ^
							{
							MOD115=(Token)match(input,MOD,FOLLOW_MOD_in_multi_expr1753); 
							MOD115_tree = (Object)adaptor.create(MOD115);
							root_0 = (Object)adaptor.becomeRoot(MOD115_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_unary_expr_in_multi_expr1757);
					unary_expr116=unary_expr();
					state._fsp--;

					adaptor.addChild(root_0, unary_expr116.getTree());

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
	// antlr/Neptune.g:221:1: unary_expr : ( operand | MINUS operand -> ^( UNARY_MINUS operand ) | PLUS operand -> ^( UNARY_PLUS operand ) | NEGATE ^ operand );
	public final NeptuneParser.unary_expr_return unary_expr() throws RecognitionException {
		NeptuneParser.unary_expr_return retval = new NeptuneParser.unary_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token MINUS118=null;
		Token PLUS120=null;
		Token NEGATE122=null;
		ParserRuleReturnScope operand117 =null;
		ParserRuleReturnScope operand119 =null;
		ParserRuleReturnScope operand121 =null;
		ParserRuleReturnScope operand123 =null;

		Object MINUS118_tree=null;
		Object PLUS120_tree=null;
		Object NEGATE122_tree=null;
		RewriteRuleTokenStream stream_PLUS=new RewriteRuleTokenStream(adaptor,"token PLUS");
		RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");
		RewriteRuleSubtreeStream stream_operand=new RewriteRuleSubtreeStream(adaptor,"rule operand");

		try {
			// antlr/Neptune.g:222:2: ( operand | MINUS operand -> ^( UNARY_MINUS operand ) | PLUS operand -> ^( UNARY_PLUS operand ) | NEGATE ^ operand )
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
					// antlr/Neptune.g:222:4: operand
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_operand_in_unary_expr1771);
					operand117=operand();
					state._fsp--;

					adaptor.addChild(root_0, operand117.getTree());

					}
					break;
				case 2 :
					// antlr/Neptune.g:223:4: MINUS operand
					{
					MINUS118=(Token)match(input,MINUS,FOLLOW_MINUS_in_unary_expr1776);  
					stream_MINUS.add(MINUS118);

					pushFollow(FOLLOW_operand_in_unary_expr1778);
					operand119=operand();
					state._fsp--;

					stream_operand.add(operand119.getTree());
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
					// 223:18: -> ^( UNARY_MINUS operand )
					{
						// antlr/Neptune.g:223:21: ^( UNARY_MINUS operand )
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
					// antlr/Neptune.g:224:4: PLUS operand
					{
					PLUS120=(Token)match(input,PLUS,FOLLOW_PLUS_in_unary_expr1791);  
					stream_PLUS.add(PLUS120);

					pushFollow(FOLLOW_operand_in_unary_expr1793);
					operand121=operand();
					state._fsp--;

					stream_operand.add(operand121.getTree());
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
					// 224:17: -> ^( UNARY_PLUS operand )
					{
						// antlr/Neptune.g:224:20: ^( UNARY_PLUS operand )
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
					// antlr/Neptune.g:225:4: NEGATE ^ operand
					{
					root_0 = (Object)adaptor.nil();


					NEGATE122=(Token)match(input,NEGATE,FOLLOW_NEGATE_in_unary_expr1806); 
					NEGATE122_tree = (Object)adaptor.create(NEGATE122);
					root_0 = (Object)adaptor.becomeRoot(NEGATE122_tree, root_0);

					pushFollow(FOLLOW_operand_in_unary_expr1809);
					operand123=operand();
					state._fsp--;

					adaptor.addChild(root_0, operand123.getTree());

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
	// antlr/Neptune.g:228:1: operand : ( IDENTIFIER ( -> ^( ATOMIC_VAR IDENTIFIER ) | LBRACKET expression RBRACKET -> ^( ARRAY_VAR IDENTIFIER expression ) | ( LPAREN ( expression ( COMMA expression )* )? RPAREN -> ^( FUNCTION IDENTIFIER ( ^( ARRAY_SET ( expression )+ ) )? ) ) ) | NUMBER | LPAREN ! assignment_expr RPAREN !| LBRACKET expression ( COMMA expression )* RBRACKET -> ^( ARRAY_SET ( expression )+ ) | print_statement | read_statement | SIZEOF ^ LPAREN ! IDENTIFIER RPAREN !| ( TRUE | FALSE ) | CHAR_LITERAL | STRING_LITERAL | codeblock );
	public final NeptuneParser.operand_return operand() throws RecognitionException {
		NeptuneParser.operand_return retval = new NeptuneParser.operand_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IDENTIFIER124=null;
		Token LBRACKET125=null;
		Token RBRACKET127=null;
		Token LPAREN128=null;
		Token COMMA130=null;
		Token RPAREN132=null;
		Token NUMBER133=null;
		Token LPAREN134=null;
		Token RPAREN136=null;
		Token LBRACKET137=null;
		Token COMMA139=null;
		Token RBRACKET141=null;
		Token SIZEOF144=null;
		Token LPAREN145=null;
		Token IDENTIFIER146=null;
		Token RPAREN147=null;
		Token set148=null;
		Token CHAR_LITERAL149=null;
		Token STRING_LITERAL150=null;
		ParserRuleReturnScope expression126 =null;
		ParserRuleReturnScope expression129 =null;
		ParserRuleReturnScope expression131 =null;
		ParserRuleReturnScope assignment_expr135 =null;
		ParserRuleReturnScope expression138 =null;
		ParserRuleReturnScope expression140 =null;
		ParserRuleReturnScope print_statement142 =null;
		ParserRuleReturnScope read_statement143 =null;
		ParserRuleReturnScope codeblock151 =null;

		Object IDENTIFIER124_tree=null;
		Object LBRACKET125_tree=null;
		Object RBRACKET127_tree=null;
		Object LPAREN128_tree=null;
		Object COMMA130_tree=null;
		Object RPAREN132_tree=null;
		Object NUMBER133_tree=null;
		Object LPAREN134_tree=null;
		Object RPAREN136_tree=null;
		Object LBRACKET137_tree=null;
		Object COMMA139_tree=null;
		Object RBRACKET141_tree=null;
		Object SIZEOF144_tree=null;
		Object LPAREN145_tree=null;
		Object IDENTIFIER146_tree=null;
		Object RPAREN147_tree=null;
		Object set148_tree=null;
		Object CHAR_LITERAL149_tree=null;
		Object STRING_LITERAL150_tree=null;
		RewriteRuleTokenStream stream_LBRACKET=new RewriteRuleTokenStream(adaptor,"token LBRACKET");
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleTokenStream stream_RBRACKET=new RewriteRuleTokenStream(adaptor,"token RBRACKET");
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try {
			// antlr/Neptune.g:229:5: ( IDENTIFIER ( -> ^( ATOMIC_VAR IDENTIFIER ) | LBRACKET expression RBRACKET -> ^( ARRAY_VAR IDENTIFIER expression ) | ( LPAREN ( expression ( COMMA expression )* )? RPAREN -> ^( FUNCTION IDENTIFIER ( ^( ARRAY_SET ( expression )+ ) )? ) ) ) | NUMBER | LPAREN ! assignment_expr RPAREN !| LBRACKET expression ( COMMA expression )* RBRACKET -> ^( ARRAY_SET ( expression )+ ) | print_statement | read_statement | SIZEOF ^ LPAREN ! IDENTIFIER RPAREN !| ( TRUE | FALSE ) | CHAR_LITERAL | STRING_LITERAL | codeblock )
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
					// antlr/Neptune.g:229:9: IDENTIFIER ( -> ^( ATOMIC_VAR IDENTIFIER ) | LBRACKET expression RBRACKET -> ^( ARRAY_VAR IDENTIFIER expression ) | ( LPAREN ( expression ( COMMA expression )* )? RPAREN -> ^( FUNCTION IDENTIFIER ( ^( ARRAY_SET ( expression )+ ) )? ) ) )
					{
					IDENTIFIER124=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_operand1825);  
					stream_IDENTIFIER.add(IDENTIFIER124);

					// antlr/Neptune.g:229:20: ( -> ^( ATOMIC_VAR IDENTIFIER ) | LBRACKET expression RBRACKET -> ^( ARRAY_VAR IDENTIFIER expression ) | ( LPAREN ( expression ( COMMA expression )* )? RPAREN -> ^( FUNCTION IDENTIFIER ( ^( ARRAY_SET ( expression )+ ) )? ) ) )
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
							// antlr/Neptune.g:229:22: 
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
							// 229:22: -> ^( ATOMIC_VAR IDENTIFIER )
							{
								// antlr/Neptune.g:229:25: ^( ATOMIC_VAR IDENTIFIER )
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
							// antlr/Neptune.g:229:52: LBRACKET expression RBRACKET
							{
							LBRACKET125=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_operand1839);  
							stream_LBRACKET.add(LBRACKET125);

							pushFollow(FOLLOW_expression_in_operand1841);
							expression126=expression();
							state._fsp--;

							stream_expression.add(expression126.getTree());
							RBRACKET127=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_operand1843);  
							stream_RBRACKET.add(RBRACKET127);

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
							// 229:81: -> ^( ARRAY_VAR IDENTIFIER expression )
							{
								// antlr/Neptune.g:229:84: ^( ARRAY_VAR IDENTIFIER expression )
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
							// antlr/Neptune.g:229:122: ( LPAREN ( expression ( COMMA expression )* )? RPAREN -> ^( FUNCTION IDENTIFIER ( ^( ARRAY_SET ( expression )+ ) )? ) )
							{
							// antlr/Neptune.g:229:122: ( LPAREN ( expression ( COMMA expression )* )? RPAREN -> ^( FUNCTION IDENTIFIER ( ^( ARRAY_SET ( expression )+ ) )? ) )
							// antlr/Neptune.g:229:123: LPAREN ( expression ( COMMA expression )* )? RPAREN
							{
							LPAREN128=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_operand1859);  
							stream_LPAREN.add(LPAREN128);

							// antlr/Neptune.g:229:130: ( expression ( COMMA expression )* )?
							int alt23=2;
							int LA23_0 = input.LA(1);
							if ( (LA23_0==CHAR_LITERAL||LA23_0==FALSE||LA23_0==IDENTIFIER||(LA23_0 >= LBRACKET && LA23_0 <= LCURLY)||LA23_0==LPAREN||LA23_0==MINUS||LA23_0==NEGATE||LA23_0==NUMBER||(LA23_0 >= PLUS && LA23_0 <= PRINT)||LA23_0==READ||(LA23_0 >= SIZEOF && LA23_0 <= STRING_LITERAL)||LA23_0==TRUE) ) {
								alt23=1;
							}
							switch (alt23) {
								case 1 :
									// antlr/Neptune.g:229:131: expression ( COMMA expression )*
									{
									pushFollow(FOLLOW_expression_in_operand1862);
									expression129=expression();
									state._fsp--;

									stream_expression.add(expression129.getTree());
									// antlr/Neptune.g:229:142: ( COMMA expression )*
									loop22:
									while (true) {
										int alt22=2;
										int LA22_0 = input.LA(1);
										if ( (LA22_0==COMMA) ) {
											alt22=1;
										}

										switch (alt22) {
										case 1 :
											// antlr/Neptune.g:229:143: COMMA expression
											{
											COMMA130=(Token)match(input,COMMA,FOLLOW_COMMA_in_operand1865);  
											stream_COMMA.add(COMMA130);

											pushFollow(FOLLOW_expression_in_operand1867);
											expression131=expression();
											state._fsp--;

											stream_expression.add(expression131.getTree());
											}
											break;

										default :
											break loop22;
										}
									}

									}
									break;

							}

							RPAREN132=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_operand1873);  
							stream_RPAREN.add(RPAREN132);

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
							// 229:171: -> ^( FUNCTION IDENTIFIER ( ^( ARRAY_SET ( expression )+ ) )? )
							{
								// antlr/Neptune.g:229:174: ^( FUNCTION IDENTIFIER ( ^( ARRAY_SET ( expression )+ ) )? )
								{
								Object root_1 = (Object)adaptor.nil();
								root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNCTION, "FUNCTION"), root_1);
								adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
								// antlr/Neptune.g:229:196: ( ^( ARRAY_SET ( expression )+ ) )?
								if ( stream_expression.hasNext() ) {
									// antlr/Neptune.g:229:196: ^( ARRAY_SET ( expression )+ )
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
					// antlr/Neptune.g:230:9: NUMBER
					{
					root_0 = (Object)adaptor.nil();


					NUMBER133=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_operand1901); 
					NUMBER133_tree = (Object)adaptor.create(NUMBER133);
					adaptor.addChild(root_0, NUMBER133_tree);

					}
					break;
				case 3 :
					// antlr/Neptune.g:231:9: LPAREN ! assignment_expr RPAREN !
					{
					root_0 = (Object)adaptor.nil();


					LPAREN134=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_operand1911); 
					pushFollow(FOLLOW_assignment_expr_in_operand1914);
					assignment_expr135=assignment_expr();
					state._fsp--;

					adaptor.addChild(root_0, assignment_expr135.getTree());

					RPAREN136=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_operand1916); 
					}
					break;
				case 4 :
					// antlr/Neptune.g:232:4: LBRACKET expression ( COMMA expression )* RBRACKET
					{
					LBRACKET137=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_operand1922);  
					stream_LBRACKET.add(LBRACKET137);

					pushFollow(FOLLOW_expression_in_operand1924);
					expression138=expression();
					state._fsp--;

					stream_expression.add(expression138.getTree());
					// antlr/Neptune.g:232:24: ( COMMA expression )*
					loop25:
					while (true) {
						int alt25=2;
						int LA25_0 = input.LA(1);
						if ( (LA25_0==COMMA) ) {
							alt25=1;
						}

						switch (alt25) {
						case 1 :
							// antlr/Neptune.g:232:25: COMMA expression
							{
							COMMA139=(Token)match(input,COMMA,FOLLOW_COMMA_in_operand1927);  
							stream_COMMA.add(COMMA139);

							pushFollow(FOLLOW_expression_in_operand1929);
							expression140=expression();
							state._fsp--;

							stream_expression.add(expression140.getTree());
							}
							break;

						default :
							break loop25;
						}
					}

					RBRACKET141=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_operand1933);  
					stream_RBRACKET.add(RBRACKET141);

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
					// 233:3: -> ^( ARRAY_SET ( expression )+ )
					{
						// antlr/Neptune.g:233:6: ^( ARRAY_SET ( expression )+ )
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
					// antlr/Neptune.g:234:4: print_statement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_print_statement_in_operand1949);
					print_statement142=print_statement();
					state._fsp--;

					adaptor.addChild(root_0, print_statement142.getTree());

					}
					break;
				case 6 :
					// antlr/Neptune.g:235:4: read_statement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_read_statement_in_operand1954);
					read_statement143=read_statement();
					state._fsp--;

					adaptor.addChild(root_0, read_statement143.getTree());

					}
					break;
				case 7 :
					// antlr/Neptune.g:236:4: SIZEOF ^ LPAREN ! IDENTIFIER RPAREN !
					{
					root_0 = (Object)adaptor.nil();


					SIZEOF144=(Token)match(input,SIZEOF,FOLLOW_SIZEOF_in_operand1959); 
					SIZEOF144_tree = (Object)adaptor.create(SIZEOF144);
					root_0 = (Object)adaptor.becomeRoot(SIZEOF144_tree, root_0);

					LPAREN145=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_operand1962); 
					IDENTIFIER146=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_operand1965); 
					IDENTIFIER146_tree = (Object)adaptor.create(IDENTIFIER146);
					adaptor.addChild(root_0, IDENTIFIER146_tree);

					RPAREN147=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_operand1967); 
					}
					break;
				case 8 :
					// antlr/Neptune.g:237:4: ( TRUE | FALSE )
					{
					root_0 = (Object)adaptor.nil();


					set148=input.LT(1);
					if ( input.LA(1)==FALSE||input.LA(1)==TRUE ) {
						input.consume();
						adaptor.addChild(root_0, (Object)adaptor.create(set148));
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					}
					break;
				case 9 :
					// antlr/Neptune.g:238:4: CHAR_LITERAL
					{
					root_0 = (Object)adaptor.nil();


					CHAR_LITERAL149=(Token)match(input,CHAR_LITERAL,FOLLOW_CHAR_LITERAL_in_operand1984); 
					CHAR_LITERAL149_tree = (Object)adaptor.create(CHAR_LITERAL149);
					adaptor.addChild(root_0, CHAR_LITERAL149_tree);

					}
					break;
				case 10 :
					// antlr/Neptune.g:239:4: STRING_LITERAL
					{
					root_0 = (Object)adaptor.nil();


					STRING_LITERAL150=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_operand1989); 
					STRING_LITERAL150_tree = (Object)adaptor.create(STRING_LITERAL150);
					adaptor.addChild(root_0, STRING_LITERAL150_tree);

					}
					break;
				case 11 :
					// antlr/Neptune.g:240:4: codeblock
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_codeblock_in_operand1994);
					codeblock151=codeblock();
					state._fsp--;

					adaptor.addChild(root_0, codeblock151.getTree());

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
	// antlr/Neptune.g:243:1: type : ( INTEGER ( array_def )? | CHAR ( array_def )? | BOOLEAN ( array_def )? );
	public final NeptuneParser.type_return type() throws RecognitionException {
		NeptuneParser.type_return retval = new NeptuneParser.type_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token INTEGER152=null;
		Token CHAR154=null;
		Token BOOLEAN156=null;
		ParserRuleReturnScope array_def153 =null;
		ParserRuleReturnScope array_def155 =null;
		ParserRuleReturnScope array_def157 =null;

		Object INTEGER152_tree=null;
		Object CHAR154_tree=null;
		Object BOOLEAN156_tree=null;

		try {
			// antlr/Neptune.g:244:2: ( INTEGER ( array_def )? | CHAR ( array_def )? | BOOLEAN ( array_def )? )
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
					// antlr/Neptune.g:244:4: INTEGER ( array_def )?
					{
					root_0 = (Object)adaptor.nil();


					INTEGER152=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_type2008); 
					INTEGER152_tree = (Object)adaptor.create(INTEGER152);
					adaptor.addChild(root_0, INTEGER152_tree);

					// antlr/Neptune.g:244:12: ( array_def )?
					int alt27=2;
					int LA27_0 = input.LA(1);
					if ( (LA27_0==LBRACKET) ) {
						alt27=1;
					}
					switch (alt27) {
						case 1 :
							// antlr/Neptune.g:244:12: array_def
							{
							pushFollow(FOLLOW_array_def_in_type2010);
							array_def153=array_def();
							state._fsp--;

							adaptor.addChild(root_0, array_def153.getTree());

							}
							break;

					}

					}
					break;
				case 2 :
					// antlr/Neptune.g:245:4: CHAR ( array_def )?
					{
					root_0 = (Object)adaptor.nil();


					CHAR154=(Token)match(input,CHAR,FOLLOW_CHAR_in_type2016); 
					CHAR154_tree = (Object)adaptor.create(CHAR154);
					adaptor.addChild(root_0, CHAR154_tree);

					// antlr/Neptune.g:245:9: ( array_def )?
					int alt28=2;
					int LA28_0 = input.LA(1);
					if ( (LA28_0==LBRACKET) ) {
						alt28=1;
					}
					switch (alt28) {
						case 1 :
							// antlr/Neptune.g:245:9: array_def
							{
							pushFollow(FOLLOW_array_def_in_type2018);
							array_def155=array_def();
							state._fsp--;

							adaptor.addChild(root_0, array_def155.getTree());

							}
							break;

					}

					}
					break;
				case 3 :
					// antlr/Neptune.g:246:4: BOOLEAN ( array_def )?
					{
					root_0 = (Object)adaptor.nil();


					BOOLEAN156=(Token)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_type2024); 
					BOOLEAN156_tree = (Object)adaptor.create(BOOLEAN156);
					adaptor.addChild(root_0, BOOLEAN156_tree);

					// antlr/Neptune.g:246:12: ( array_def )?
					int alt29=2;
					int LA29_0 = input.LA(1);
					if ( (LA29_0==LBRACKET) ) {
						alt29=1;
					}
					switch (alt29) {
						case 1 :
							// antlr/Neptune.g:246:12: array_def
							{
							pushFollow(FOLLOW_array_def_in_type2026);
							array_def157=array_def();
							state._fsp--;

							adaptor.addChild(root_0, array_def157.getTree());

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
	// antlr/Neptune.g:249:1: array_def : LBRACKET NUMBER RBRACKET -> ^( ARRAY_DEF NUMBER ) ;
	public final NeptuneParser.array_def_return array_def() throws RecognitionException {
		NeptuneParser.array_def_return retval = new NeptuneParser.array_def_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token LBRACKET158=null;
		Token NUMBER159=null;
		Token RBRACKET160=null;

		Object LBRACKET158_tree=null;
		Object NUMBER159_tree=null;
		Object RBRACKET160_tree=null;
		RewriteRuleTokenStream stream_LBRACKET=new RewriteRuleTokenStream(adaptor,"token LBRACKET");
		RewriteRuleTokenStream stream_RBRACKET=new RewriteRuleTokenStream(adaptor,"token RBRACKET");
		RewriteRuleTokenStream stream_NUMBER=new RewriteRuleTokenStream(adaptor,"token NUMBER");

		try {
			// antlr/Neptune.g:250:2: ( LBRACKET NUMBER RBRACKET -> ^( ARRAY_DEF NUMBER ) )
			// antlr/Neptune.g:250:5: LBRACKET NUMBER RBRACKET
			{
			LBRACKET158=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_array_def2040);  
			stream_LBRACKET.add(LBRACKET158);

			NUMBER159=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_array_def2042);  
			stream_NUMBER.add(NUMBER159);

			RBRACKET160=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_array_def2044);  
			stream_RBRACKET.add(RBRACKET160);

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
			// 251:3: -> ^( ARRAY_DEF NUMBER )
			{
				// antlr/Neptune.g:251:6: ^( ARRAY_DEF NUMBER )
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
	public static final BitSet FOLLOW_return_statement_in_line1197 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_line1199 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_function_declaration_in_line1205 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LCURLY_in_codeblock1217 = new BitSet(new long[]{0x4CC3549D9C023800L,0x0000000000000008L});
	public static final BitSet FOLLOW_lines_in_codeblock1219 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_RCURLY_in_codeblock1221 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_while_statement_in_logic_statement1243 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_foreach_statement_in_logic_statement1248 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_if_statement_in_logic_statement1253 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHILE_in_while_statement1267 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_LPAREN_in_while_statement1270 = new BitSet(new long[]{0x4C43549884002000L});
	public static final BitSet FOLLOW_expression_in_while_statement1273 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_while_statement1275 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_LCURLY_in_while_statement1278 = new BitSet(new long[]{0x4CC3549D9C023800L,0x0000000000000008L});
	public static final BitSet FOLLOW_lines_in_while_statement1281 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_RCURLY_in_while_statement1283 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FOREACH_in_foreach_statement1296 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_LPAREN_in_foreach_statement1299 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_foreach_statement1302 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_IN_in_foreach_statement1304 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_foreach_statement1307 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_foreach_statement1309 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_LCURLY_in_foreach_statement1312 = new BitSet(new long[]{0x4CC3549D9C023800L,0x0000000000000008L});
	public static final BitSet FOLLOW_lines_in_foreach_statement1315 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_RCURLY_in_foreach_statement1317 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_if_statement1330 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_LPAREN_in_if_statement1333 = new BitSet(new long[]{0x4C43549884002000L});
	public static final BitSet FOLLOW_expression_in_if_statement1336 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_if_statement1338 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_LCURLY_in_if_statement1341 = new BitSet(new long[]{0x4CC3549D9C023800L,0x0000000000000008L});
	public static final BitSet FOLLOW_lines_in_if_statement1344 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_RCURLY_in_if_statement1346 = new BitSet(new long[]{0x0000000001800002L});
	public static final BitSet FOLLOW_ELSIF_in_if_statement1352 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_LPAREN_in_if_statement1354 = new BitSet(new long[]{0x4C43549884002000L});
	public static final BitSet FOLLOW_expression_in_if_statement1357 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_if_statement1359 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_LCURLY_in_if_statement1362 = new BitSet(new long[]{0x4CC3549D9C023800L,0x0000000000000008L});
	public static final BitSet FOLLOW_lines_in_if_statement1365 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_RCURLY_in_if_statement1367 = new BitSet(new long[]{0x0000000001800002L});
	public static final BitSet FOLLOW_ELSE_in_if_statement1375 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_LCURLY_in_if_statement1377 = new BitSet(new long[]{0x4CC3549D9C023800L,0x0000000000000008L});
	public static final BitSet FOLLOW_lines_in_if_statement1380 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_RCURLY_in_if_statement1382 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRINT_in_print_statement1397 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_LPAREN_in_print_statement1400 = new BitSet(new long[]{0x4C43549884002000L});
	public static final BitSet FOLLOW_expression_in_print_statement1403 = new BitSet(new long[]{0x0100000000008000L});
	public static final BitSet FOLLOW_COMMA_in_print_statement1406 = new BitSet(new long[]{0x4C43549884002000L});
	public static final BitSet FOLLOW_expression_in_print_statement1409 = new BitSet(new long[]{0x0100000000008000L});
	public static final BitSet FOLLOW_RPAREN_in_print_statement1413 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_READ_in_read_statement1426 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_LPAREN_in_read_statement1429 = new BitSet(new long[]{0x4C43549884002000L});
	public static final BitSet FOLLOW_expression_in_read_statement1432 = new BitSet(new long[]{0x0100000000008000L});
	public static final BitSet FOLLOW_COMMA_in_read_statement1435 = new BitSet(new long[]{0x4C43549884002000L});
	public static final BitSet FOLLOW_expression_in_read_statement1438 = new BitSet(new long[]{0x0100000000008000L});
	public static final BitSet FOLLOW_RPAREN_in_read_statement1442 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_declaration1455 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_declaration1457 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_BECOMES_in_declaration1460 = new BitSet(new long[]{0x4C43549884002000L});
	public static final BitSet FOLLOW_expression_in_declaration1462 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CONST_in_declaration1488 = new BitSet(new long[]{0x0000000400001800L});
	public static final BitSet FOLLOW_type_in_declaration1491 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_declaration1493 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_BECOMES_in_declaration1495 = new BitSet(new long[]{0x4C43549884002000L});
	public static final BitSet FOLLOW_expression_in_declaration1497 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FUNCTION_in_function_declaration1512 = new BitSet(new long[]{0x0000000400001800L});
	public static final BitSet FOLLOW_type_in_function_declaration1514 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_function_declaration1516 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_LPAREN_in_function_declaration1518 = new BitSet(new long[]{0x0000000400001800L});
	public static final BitSet FOLLOW_type_in_function_declaration1520 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_function_declaration1522 = new BitSet(new long[]{0x0100000000008000L});
	public static final BitSet FOLLOW_COMMA_in_function_declaration1525 = new BitSet(new long[]{0x0000000400001800L});
	public static final BitSet FOLLOW_type_in_function_declaration1527 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_function_declaration1529 = new BitSet(new long[]{0x0100000000008000L});
	public static final BitSet FOLLOW_RPAREN_in_function_declaration1533 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_LCURLY_in_function_declaration1535 = new BitSet(new long[]{0x4CC3549D9C023800L,0x0000000000000008L});
	public static final BitSet FOLLOW_line_in_function_declaration1537 = new BitSet(new long[]{0x4CE3549D9C023800L,0x0000000000000008L});
	public static final BitSet FOLLOW_RCURLY_in_function_declaration1540 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RETURN_in_return_statement1573 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_LPAREN_in_return_statement1576 = new BitSet(new long[]{0x4C43549884002000L});
	public static final BitSet FOLLOW_expression_in_return_statement1579 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_return_statement1581 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignment_expr_in_expression1595 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_or_expr_in_assignment_expr1607 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_BECOMES_in_assignment_expr1610 = new BitSet(new long[]{0x4C43549884002000L});
	public static final BitSet FOLLOW_assignment_expr_in_assignment_expr1613 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_and_expr_in_or_expr1627 = new BitSet(new long[]{0x0000800000000002L});
	public static final BitSet FOLLOW_OR_in_or_expr1630 = new BitSet(new long[]{0x4C43549884002000L});
	public static final BitSet FOLLOW_and_expr_in_or_expr1633 = new BitSet(new long[]{0x0000800000000002L});
	public static final BitSet FOLLOW_boolean_expr_in_and_expr1647 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_AND_in_and_expr1650 = new BitSet(new long[]{0x4C43549884002000L});
	public static final BitSet FOLLOW_boolean_expr_in_and_expr1653 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_plus_expr_in_boolean_expr1667 = new BitSet(new long[]{0x0000230062000002L});
	public static final BitSet FOLLOW_LT_in_boolean_expr1671 = new BitSet(new long[]{0x4C43549884002000L});
	public static final BitSet FOLLOW_LT_EQ_in_boolean_expr1676 = new BitSet(new long[]{0x4C43549884002000L});
	public static final BitSet FOLLOW_GT_in_boolean_expr1681 = new BitSet(new long[]{0x4C43549884002000L});
	public static final BitSet FOLLOW_GT_EQ_in_boolean_expr1686 = new BitSet(new long[]{0x4C43549884002000L});
	public static final BitSet FOLLOW_EQ_in_boolean_expr1691 = new BitSet(new long[]{0x4C43549884002000L});
	public static final BitSet FOLLOW_NEQ_in_boolean_expr1696 = new BitSet(new long[]{0x4C43549884002000L});
	public static final BitSet FOLLOW_plus_expr_in_boolean_expr1700 = new BitSet(new long[]{0x0000230062000002L});
	public static final BitSet FOLLOW_multi_expr_in_plus_expr1713 = new BitSet(new long[]{0x0001040000000002L});
	public static final BitSet FOLLOW_PLUS_in_plus_expr1717 = new BitSet(new long[]{0x4C43549884002000L});
	public static final BitSet FOLLOW_MINUS_in_plus_expr1722 = new BitSet(new long[]{0x4C43549884002000L});
	public static final BitSet FOLLOW_multi_expr_in_plus_expr1726 = new BitSet(new long[]{0x0001040000000002L});
	public static final BitSet FOLLOW_unary_expr_in_multi_expr1739 = new BitSet(new long[]{0x2000080000080002L});
	public static final BitSet FOLLOW_TIMES_in_multi_expr1743 = new BitSet(new long[]{0x4C43549884002000L});
	public static final BitSet FOLLOW_DIVIDE_in_multi_expr1748 = new BitSet(new long[]{0x4C43549884002000L});
	public static final BitSet FOLLOW_MOD_in_multi_expr1753 = new BitSet(new long[]{0x4C43549884002000L});
	public static final BitSet FOLLOW_unary_expr_in_multi_expr1757 = new BitSet(new long[]{0x2000080000080002L});
	public static final BitSet FOLLOW_operand_in_unary_expr1771 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MINUS_in_unary_expr1776 = new BitSet(new long[]{0x4C42409884002000L});
	public static final BitSet FOLLOW_operand_in_unary_expr1778 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PLUS_in_unary_expr1791 = new BitSet(new long[]{0x4C42409884002000L});
	public static final BitSet FOLLOW_operand_in_unary_expr1793 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NEGATE_in_unary_expr1806 = new BitSet(new long[]{0x4C42409884002000L});
	public static final BitSet FOLLOW_operand_in_unary_expr1809 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_operand1825 = new BitSet(new long[]{0x0000008800000002L});
	public static final BitSet FOLLOW_LBRACKET_in_operand1839 = new BitSet(new long[]{0x4C43549884002000L});
	public static final BitSet FOLLOW_expression_in_operand1841 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_RBRACKET_in_operand1843 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_operand1859 = new BitSet(new long[]{0x4D43549884002000L});
	public static final BitSet FOLLOW_expression_in_operand1862 = new BitSet(new long[]{0x0100000000008000L});
	public static final BitSet FOLLOW_COMMA_in_operand1865 = new BitSet(new long[]{0x4C43549884002000L});
	public static final BitSet FOLLOW_expression_in_operand1867 = new BitSet(new long[]{0x0100000000008000L});
	public static final BitSet FOLLOW_RPAREN_in_operand1873 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMBER_in_operand1901 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_operand1911 = new BitSet(new long[]{0x4C43549884002000L});
	public static final BitSet FOLLOW_assignment_expr_in_operand1914 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_operand1916 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACKET_in_operand1922 = new BitSet(new long[]{0x4C43549884002000L});
	public static final BitSet FOLLOW_expression_in_operand1924 = new BitSet(new long[]{0x0010000000008000L});
	public static final BitSet FOLLOW_COMMA_in_operand1927 = new BitSet(new long[]{0x4C43549884002000L});
	public static final BitSet FOLLOW_expression_in_operand1929 = new BitSet(new long[]{0x0010000000008000L});
	public static final BitSet FOLLOW_RBRACKET_in_operand1933 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_print_statement_in_operand1949 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_read_statement_in_operand1954 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SIZEOF_in_operand1959 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_LPAREN_in_operand1962 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_operand1965 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_operand1967 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_operand1973 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_LITERAL_in_operand1984 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_operand1989 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_codeblock_in_operand1994 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTEGER_in_type2008 = new BitSet(new long[]{0x0000000800000002L});
	public static final BitSet FOLLOW_array_def_in_type2010 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_in_type2016 = new BitSet(new long[]{0x0000000800000002L});
	public static final BitSet FOLLOW_array_def_in_type2018 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOLEAN_in_type2024 = new BitSet(new long[]{0x0000000800000002L});
	public static final BitSet FOLLOW_array_def_in_type2026 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACKET_in_array_def2040 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_NUMBER_in_array_def2042 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_RBRACKET_in_array_def2044 = new BitSet(new long[]{0x0000000000000002L});
}

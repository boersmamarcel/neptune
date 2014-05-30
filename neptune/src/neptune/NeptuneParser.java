// $ANTLR 3.5.2 Neptune.g 2014-05-30 22:59:34

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
		"CHAR", "CHAR_LITERAL", "COLON", "COMMA", "COMMENT", "CONST", "DIGIT", 
		"DIVIDE", "DO", "DQUOTE", "DROPIN_STATEMENT", "ELSE", "ELSIF", "EQ", "FALSE", 
		"FOREACH", "FUNCTION", "GT", "GT_EQ", "IDENTIFIER", "IF", "IN", "INTEGER", 
		"LBRACKET", "LCURLY", "LETTER", "LOWER", "LPAREN", "LT", "LT_EQ", "MINUS", 
		"NEQ", "NUMBER", "PLUS", "PRINT", "PROGRAM", "QUOTE", "RBRACKET", "RCURLY", 
		"READ", "RETURN", "RPAREN", "SEMICOLON", "STRING_LITERAL", "THEN", "TIMES", 
		"TRUE", "UPPER", "VAR", "WHILE", "WS"
	};
	public static final int EOF=-1;
	public static final int ARRAY_SET=4;
	public static final int BECOMES=5;
	public static final int BOOLEAN=6;
	public static final int CHAR=7;
	public static final int CHAR_LITERAL=8;
	public static final int COLON=9;
	public static final int COMMA=10;
	public static final int COMMENT=11;
	public static final int CONST=12;
	public static final int DIGIT=13;
	public static final int DIVIDE=14;
	public static final int DO=15;
	public static final int DQUOTE=16;
	public static final int DROPIN_STATEMENT=17;
	public static final int ELSE=18;
	public static final int ELSIF=19;
	public static final int EQ=20;
	public static final int FALSE=21;
	public static final int FOREACH=22;
	public static final int FUNCTION=23;
	public static final int GT=24;
	public static final int GT_EQ=25;
	public static final int IDENTIFIER=26;
	public static final int IF=27;
	public static final int IN=28;
	public static final int INTEGER=29;
	public static final int LBRACKET=30;
	public static final int LCURLY=31;
	public static final int LETTER=32;
	public static final int LOWER=33;
	public static final int LPAREN=34;
	public static final int LT=35;
	public static final int LT_EQ=36;
	public static final int MINUS=37;
	public static final int NEQ=38;
	public static final int NUMBER=39;
	public static final int PLUS=40;
	public static final int PRINT=41;
	public static final int PROGRAM=42;
	public static final int QUOTE=43;
	public static final int RBRACKET=44;
	public static final int RCURLY=45;
	public static final int READ=46;
	public static final int RETURN=47;
	public static final int RPAREN=48;
	public static final int SEMICOLON=49;
	public static final int STRING_LITERAL=50;
	public static final int THEN=51;
	public static final int TIMES=52;
	public static final int TRUE=53;
	public static final int UPPER=54;
	public static final int VAR=55;
	public static final int WHILE=56;
	public static final int WS=57;

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
	// Neptune.g:114:1: program : lines EOF -> ^( PROGRAM lines ) ;
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
			// Neptune.g:115:5: ( lines EOF -> ^( PROGRAM lines ) )
			// Neptune.g:115:9: lines EOF
			{
			pushFollow(FOLLOW_lines_in_program1009);
			lines1=lines();
			state._fsp--;

			stream_lines.add(lines1.getTree());
			EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_program1011);  
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
			// 116:13: -> ^( PROGRAM lines )
			{
				// Neptune.g:116:17: ^( PROGRAM lines )
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
	// Neptune.g:119:1: lines : ( line )+ ;
	public final NeptuneParser.lines_return lines() throws RecognitionException {
		NeptuneParser.lines_return retval = new NeptuneParser.lines_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope line3 =null;


		try {
			// Neptune.g:120:2: ( ( line )+ )
			// Neptune.g:120:4: ( line )+
			{
			root_0 = (Object)adaptor.nil();


			// Neptune.g:120:4: ( line )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= BOOLEAN && LA1_0 <= CHAR_LITERAL)||LA1_0==CONST||(LA1_0 >= FALSE && LA1_0 <= FOREACH)||(LA1_0 >= IDENTIFIER && LA1_0 <= IF)||LA1_0==INTEGER||LA1_0==LCURLY||LA1_0==LPAREN||LA1_0==NUMBER||LA1_0==PRINT||LA1_0==READ||LA1_0==STRING_LITERAL||LA1_0==TRUE||LA1_0==WHILE) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// Neptune.g:120:4: line
					{
					pushFollow(FOLLOW_line_in_lines1046);
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
	// Neptune.g:123:1: line : ( expression SEMICOLON !| declaration SEMICOLON !| logic_statement );
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
			// Neptune.g:124:2: ( expression SEMICOLON !| declaration SEMICOLON !| logic_statement )
			int alt2=3;
			switch ( input.LA(1) ) {
			case CHAR_LITERAL:
			case FALSE:
			case IDENTIFIER:
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
					// Neptune.g:124:4: expression SEMICOLON !
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_expression_in_line1059);
					expression4=expression();
					state._fsp--;

					adaptor.addChild(root_0, expression4.getTree());

					SEMICOLON5=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_line1061); 
					}
					break;
				case 2 :
					// Neptune.g:125:4: declaration SEMICOLON !
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_declaration_in_line1067);
					declaration6=declaration();
					state._fsp--;

					adaptor.addChild(root_0, declaration6.getTree());

					SEMICOLON7=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_line1069); 
					}
					break;
				case 3 :
					// Neptune.g:126:4: logic_statement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_logic_statement_in_line1075);
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


	public static class logic_statement_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "logic_statement"
	// Neptune.g:129:1: logic_statement : ( while_statement | foreach_statement | if_statement );
	public final NeptuneParser.logic_statement_return logic_statement() throws RecognitionException {
		NeptuneParser.logic_statement_return retval = new NeptuneParser.logic_statement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope while_statement9 =null;
		ParserRuleReturnScope foreach_statement10 =null;
		ParserRuleReturnScope if_statement11 =null;


		try {
			// Neptune.g:130:2: ( while_statement | foreach_statement | if_statement )
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
					// Neptune.g:130:4: while_statement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_while_statement_in_logic_statement1087);
					while_statement9=while_statement();
					state._fsp--;

					adaptor.addChild(root_0, while_statement9.getTree());

					}
					break;
				case 2 :
					// Neptune.g:131:4: foreach_statement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_foreach_statement_in_logic_statement1092);
					foreach_statement10=foreach_statement();
					state._fsp--;

					adaptor.addChild(root_0, foreach_statement10.getTree());

					}
					break;
				case 3 :
					// Neptune.g:132:4: if_statement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_if_statement_in_logic_statement1097);
					if_statement11=if_statement();
					state._fsp--;

					adaptor.addChild(root_0, if_statement11.getTree());

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
	// Neptune.g:135:1: while_statement : WHILE ^ LPAREN ! expression RPAREN ! LCURLY ! lines RCURLY !;
	public final NeptuneParser.while_statement_return while_statement() throws RecognitionException {
		NeptuneParser.while_statement_return retval = new NeptuneParser.while_statement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token WHILE12=null;
		Token LPAREN13=null;
		Token RPAREN15=null;
		Token LCURLY16=null;
		Token RCURLY18=null;
		ParserRuleReturnScope expression14 =null;
		ParserRuleReturnScope lines17 =null;

		Object WHILE12_tree=null;
		Object LPAREN13_tree=null;
		Object RPAREN15_tree=null;
		Object LCURLY16_tree=null;
		Object RCURLY18_tree=null;

		try {
			// Neptune.g:136:2: ( WHILE ^ LPAREN ! expression RPAREN ! LCURLY ! lines RCURLY !)
			// Neptune.g:136:4: WHILE ^ LPAREN ! expression RPAREN ! LCURLY ! lines RCURLY !
			{
			root_0 = (Object)adaptor.nil();


			WHILE12=(Token)match(input,WHILE,FOLLOW_WHILE_in_while_statement1109); 
			WHILE12_tree = (Object)adaptor.create(WHILE12);
			root_0 = (Object)adaptor.becomeRoot(WHILE12_tree, root_0);

			LPAREN13=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_while_statement1112); 
			pushFollow(FOLLOW_expression_in_while_statement1115);
			expression14=expression();
			state._fsp--;

			adaptor.addChild(root_0, expression14.getTree());

			RPAREN15=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_while_statement1117); 
			LCURLY16=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_while_statement1120); 
			pushFollow(FOLLOW_lines_in_while_statement1123);
			lines17=lines();
			state._fsp--;

			adaptor.addChild(root_0, lines17.getTree());

			RCURLY18=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_while_statement1125); 
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
	// Neptune.g:139:1: foreach_statement : FOREACH ^ LPAREN ! IDENTIFIER IN ! IDENTIFIER RPAREN ! LCURLY ! lines RCURLY !;
	public final NeptuneParser.foreach_statement_return foreach_statement() throws RecognitionException {
		NeptuneParser.foreach_statement_return retval = new NeptuneParser.foreach_statement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token FOREACH19=null;
		Token LPAREN20=null;
		Token IDENTIFIER21=null;
		Token IN22=null;
		Token IDENTIFIER23=null;
		Token RPAREN24=null;
		Token LCURLY25=null;
		Token RCURLY27=null;
		ParserRuleReturnScope lines26 =null;

		Object FOREACH19_tree=null;
		Object LPAREN20_tree=null;
		Object IDENTIFIER21_tree=null;
		Object IN22_tree=null;
		Object IDENTIFIER23_tree=null;
		Object RPAREN24_tree=null;
		Object LCURLY25_tree=null;
		Object RCURLY27_tree=null;

		try {
			// Neptune.g:140:2: ( FOREACH ^ LPAREN ! IDENTIFIER IN ! IDENTIFIER RPAREN ! LCURLY ! lines RCURLY !)
			// Neptune.g:140:4: FOREACH ^ LPAREN ! IDENTIFIER IN ! IDENTIFIER RPAREN ! LCURLY ! lines RCURLY !
			{
			root_0 = (Object)adaptor.nil();


			FOREACH19=(Token)match(input,FOREACH,FOLLOW_FOREACH_in_foreach_statement1138); 
			FOREACH19_tree = (Object)adaptor.create(FOREACH19);
			root_0 = (Object)adaptor.becomeRoot(FOREACH19_tree, root_0);

			LPAREN20=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_foreach_statement1141); 
			IDENTIFIER21=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_foreach_statement1144); 
			IDENTIFIER21_tree = (Object)adaptor.create(IDENTIFIER21);
			adaptor.addChild(root_0, IDENTIFIER21_tree);

			IN22=(Token)match(input,IN,FOLLOW_IN_in_foreach_statement1146); 
			IDENTIFIER23=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_foreach_statement1149); 
			IDENTIFIER23_tree = (Object)adaptor.create(IDENTIFIER23);
			adaptor.addChild(root_0, IDENTIFIER23_tree);

			RPAREN24=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_foreach_statement1151); 
			LCURLY25=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_foreach_statement1154); 
			pushFollow(FOLLOW_lines_in_foreach_statement1157);
			lines26=lines();
			state._fsp--;

			adaptor.addChild(root_0, lines26.getTree());

			RCURLY27=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_foreach_statement1159); 
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
	// Neptune.g:143:1: if_statement : IF ^ LPAREN ! expression RPAREN ! LCURLY ! lines RCURLY ! ( ELSIF LPAREN ! expression RPAREN ! LCURLY ! lines RCURLY !)* ( ELSE LCURLY ! lines RCURLY !)? ;
	public final NeptuneParser.if_statement_return if_statement() throws RecognitionException {
		NeptuneParser.if_statement_return retval = new NeptuneParser.if_statement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IF28=null;
		Token LPAREN29=null;
		Token RPAREN31=null;
		Token LCURLY32=null;
		Token RCURLY34=null;
		Token ELSIF35=null;
		Token LPAREN36=null;
		Token RPAREN38=null;
		Token LCURLY39=null;
		Token RCURLY41=null;
		Token ELSE42=null;
		Token LCURLY43=null;
		Token RCURLY45=null;
		ParserRuleReturnScope expression30 =null;
		ParserRuleReturnScope lines33 =null;
		ParserRuleReturnScope expression37 =null;
		ParserRuleReturnScope lines40 =null;
		ParserRuleReturnScope lines44 =null;

		Object IF28_tree=null;
		Object LPAREN29_tree=null;
		Object RPAREN31_tree=null;
		Object LCURLY32_tree=null;
		Object RCURLY34_tree=null;
		Object ELSIF35_tree=null;
		Object LPAREN36_tree=null;
		Object RPAREN38_tree=null;
		Object LCURLY39_tree=null;
		Object RCURLY41_tree=null;
		Object ELSE42_tree=null;
		Object LCURLY43_tree=null;
		Object RCURLY45_tree=null;

		try {
			// Neptune.g:144:2: ( IF ^ LPAREN ! expression RPAREN ! LCURLY ! lines RCURLY ! ( ELSIF LPAREN ! expression RPAREN ! LCURLY ! lines RCURLY !)* ( ELSE LCURLY ! lines RCURLY !)? )
			// Neptune.g:144:4: IF ^ LPAREN ! expression RPAREN ! LCURLY ! lines RCURLY ! ( ELSIF LPAREN ! expression RPAREN ! LCURLY ! lines RCURLY !)* ( ELSE LCURLY ! lines RCURLY !)?
			{
			root_0 = (Object)adaptor.nil();


			IF28=(Token)match(input,IF,FOLLOW_IF_in_if_statement1172); 
			IF28_tree = (Object)adaptor.create(IF28);
			root_0 = (Object)adaptor.becomeRoot(IF28_tree, root_0);

			LPAREN29=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_if_statement1175); 
			pushFollow(FOLLOW_expression_in_if_statement1178);
			expression30=expression();
			state._fsp--;

			adaptor.addChild(root_0, expression30.getTree());

			RPAREN31=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_if_statement1180); 
			LCURLY32=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_if_statement1183); 
			pushFollow(FOLLOW_lines_in_if_statement1186);
			lines33=lines();
			state._fsp--;

			adaptor.addChild(root_0, lines33.getTree());

			RCURLY34=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_if_statement1188); 
			// Neptune.g:145:3: ( ELSIF LPAREN ! expression RPAREN ! LCURLY ! lines RCURLY !)*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==ELSIF) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// Neptune.g:145:4: ELSIF LPAREN ! expression RPAREN ! LCURLY ! lines RCURLY !
					{
					ELSIF35=(Token)match(input,ELSIF,FOLLOW_ELSIF_in_if_statement1194); 
					ELSIF35_tree = (Object)adaptor.create(ELSIF35);
					adaptor.addChild(root_0, ELSIF35_tree);

					LPAREN36=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_if_statement1196); 
					pushFollow(FOLLOW_expression_in_if_statement1199);
					expression37=expression();
					state._fsp--;

					adaptor.addChild(root_0, expression37.getTree());

					RPAREN38=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_if_statement1201); 
					LCURLY39=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_if_statement1204); 
					pushFollow(FOLLOW_lines_in_if_statement1207);
					lines40=lines();
					state._fsp--;

					adaptor.addChild(root_0, lines40.getTree());

					RCURLY41=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_if_statement1209); 
					}
					break;

				default :
					break loop4;
				}
			}

			// Neptune.g:146:3: ( ELSE LCURLY ! lines RCURLY !)?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==ELSE) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// Neptune.g:146:4: ELSE LCURLY ! lines RCURLY !
					{
					ELSE42=(Token)match(input,ELSE,FOLLOW_ELSE_in_if_statement1217); 
					ELSE42_tree = (Object)adaptor.create(ELSE42);
					adaptor.addChild(root_0, ELSE42_tree);

					LCURLY43=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_if_statement1219); 
					pushFollow(FOLLOW_lines_in_if_statement1222);
					lines44=lines();
					state._fsp--;

					adaptor.addChild(root_0, lines44.getTree());

					RCURLY45=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_if_statement1224); 
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
	// Neptune.g:149:1: print_statement : PRINT ^ LPAREN ! expression ( COMMA expression )* RPAREN !;
	public final NeptuneParser.print_statement_return print_statement() throws RecognitionException {
		NeptuneParser.print_statement_return retval = new NeptuneParser.print_statement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token PRINT46=null;
		Token LPAREN47=null;
		Token COMMA49=null;
		Token RPAREN51=null;
		ParserRuleReturnScope expression48 =null;
		ParserRuleReturnScope expression50 =null;

		Object PRINT46_tree=null;
		Object LPAREN47_tree=null;
		Object COMMA49_tree=null;
		Object RPAREN51_tree=null;

		try {
			// Neptune.g:150:2: ( PRINT ^ LPAREN ! expression ( COMMA expression )* RPAREN !)
			// Neptune.g:150:4: PRINT ^ LPAREN ! expression ( COMMA expression )* RPAREN !
			{
			root_0 = (Object)adaptor.nil();


			PRINT46=(Token)match(input,PRINT,FOLLOW_PRINT_in_print_statement1239); 
			PRINT46_tree = (Object)adaptor.create(PRINT46);
			root_0 = (Object)adaptor.becomeRoot(PRINT46_tree, root_0);

			LPAREN47=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_print_statement1242); 
			pushFollow(FOLLOW_expression_in_print_statement1245);
			expression48=expression();
			state._fsp--;

			adaptor.addChild(root_0, expression48.getTree());

			// Neptune.g:150:30: ( COMMA expression )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==COMMA) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// Neptune.g:150:31: COMMA expression
					{
					COMMA49=(Token)match(input,COMMA,FOLLOW_COMMA_in_print_statement1248); 
					COMMA49_tree = (Object)adaptor.create(COMMA49);
					adaptor.addChild(root_0, COMMA49_tree);

					pushFollow(FOLLOW_expression_in_print_statement1250);
					expression50=expression();
					state._fsp--;

					adaptor.addChild(root_0, expression50.getTree());

					}
					break;

				default :
					break loop6;
				}
			}

			RPAREN51=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_print_statement1254); 
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
	// Neptune.g:153:1: read_statement : READ ^ LPAREN ! expression ( COMMA expression )* RPAREN !;
	public final NeptuneParser.read_statement_return read_statement() throws RecognitionException {
		NeptuneParser.read_statement_return retval = new NeptuneParser.read_statement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token READ52=null;
		Token LPAREN53=null;
		Token COMMA55=null;
		Token RPAREN57=null;
		ParserRuleReturnScope expression54 =null;
		ParserRuleReturnScope expression56 =null;

		Object READ52_tree=null;
		Object LPAREN53_tree=null;
		Object COMMA55_tree=null;
		Object RPAREN57_tree=null;

		try {
			// Neptune.g:154:2: ( READ ^ LPAREN ! expression ( COMMA expression )* RPAREN !)
			// Neptune.g:154:4: READ ^ LPAREN ! expression ( COMMA expression )* RPAREN !
			{
			root_0 = (Object)adaptor.nil();


			READ52=(Token)match(input,READ,FOLLOW_READ_in_read_statement1267); 
			READ52_tree = (Object)adaptor.create(READ52);
			root_0 = (Object)adaptor.becomeRoot(READ52_tree, root_0);

			LPAREN53=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_read_statement1270); 
			pushFollow(FOLLOW_expression_in_read_statement1273);
			expression54=expression();
			state._fsp--;

			adaptor.addChild(root_0, expression54.getTree());

			// Neptune.g:154:29: ( COMMA expression )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==COMMA) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// Neptune.g:154:30: COMMA expression
					{
					COMMA55=(Token)match(input,COMMA,FOLLOW_COMMA_in_read_statement1276); 
					COMMA55_tree = (Object)adaptor.create(COMMA55);
					adaptor.addChild(root_0, COMMA55_tree);

					pushFollow(FOLLOW_expression_in_read_statement1278);
					expression56=expression();
					state._fsp--;

					adaptor.addChild(root_0, expression56.getTree());

					}
					break;

				default :
					break loop7;
				}
			}

			RPAREN57=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_read_statement1282); 
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
	// Neptune.g:157:1: declaration : ( type IDENTIFIER ( BECOMES expression )? -> ^( VAR type IDENTIFIER ( BECOMES expression )? ) | CONST ^ type IDENTIFIER BECOMES expression );
	public final NeptuneParser.declaration_return declaration() throws RecognitionException {
		NeptuneParser.declaration_return retval = new NeptuneParser.declaration_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IDENTIFIER59=null;
		Token BECOMES60=null;
		Token CONST62=null;
		Token IDENTIFIER64=null;
		Token BECOMES65=null;
		ParserRuleReturnScope type58 =null;
		ParserRuleReturnScope expression61 =null;
		ParserRuleReturnScope type63 =null;
		ParserRuleReturnScope expression66 =null;

		Object IDENTIFIER59_tree=null;
		Object BECOMES60_tree=null;
		Object CONST62_tree=null;
		Object IDENTIFIER64_tree=null;
		Object BECOMES65_tree=null;
		RewriteRuleTokenStream stream_BECOMES=new RewriteRuleTokenStream(adaptor,"token BECOMES");
		RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");

		try {
			// Neptune.g:158:2: ( type IDENTIFIER ( BECOMES expression )? -> ^( VAR type IDENTIFIER ( BECOMES expression )? ) | CONST ^ type IDENTIFIER BECOMES expression )
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
					// Neptune.g:158:4: type IDENTIFIER ( BECOMES expression )?
					{
					pushFollow(FOLLOW_type_in_declaration1295);
					type58=type();
					state._fsp--;

					stream_type.add(type58.getTree());
					IDENTIFIER59=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_declaration1297);  
					stream_IDENTIFIER.add(IDENTIFIER59);

					// Neptune.g:158:20: ( BECOMES expression )?
					int alt8=2;
					int LA8_0 = input.LA(1);
					if ( (LA8_0==BECOMES) ) {
						alt8=1;
					}
					switch (alt8) {
						case 1 :
							// Neptune.g:158:21: BECOMES expression
							{
							BECOMES60=(Token)match(input,BECOMES,FOLLOW_BECOMES_in_declaration1300);  
							stream_BECOMES.add(BECOMES60);

							pushFollow(FOLLOW_expression_in_declaration1302);
							expression61=expression();
							state._fsp--;

							stream_expression.add(expression61.getTree());
							}
							break;

					}

					// AST REWRITE
					// elements: type, BECOMES, IDENTIFIER, expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 159:3: -> ^( VAR type IDENTIFIER ( BECOMES expression )? )
					{
						// Neptune.g:159:6: ^( VAR type IDENTIFIER ( BECOMES expression )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VAR, "VAR"), root_1);
						adaptor.addChild(root_1, stream_type.nextTree());
						adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
						// Neptune.g:159:28: ( BECOMES expression )?
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
					// Neptune.g:160:4: CONST ^ type IDENTIFIER BECOMES expression
					{
					root_0 = (Object)adaptor.nil();


					CONST62=(Token)match(input,CONST,FOLLOW_CONST_in_declaration1328); 
					CONST62_tree = (Object)adaptor.create(CONST62);
					root_0 = (Object)adaptor.becomeRoot(CONST62_tree, root_0);

					pushFollow(FOLLOW_type_in_declaration1331);
					type63=type();
					state._fsp--;

					adaptor.addChild(root_0, type63.getTree());

					IDENTIFIER64=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_declaration1333); 
					IDENTIFIER64_tree = (Object)adaptor.create(IDENTIFIER64);
					adaptor.addChild(root_0, IDENTIFIER64_tree);

					BECOMES65=(Token)match(input,BECOMES,FOLLOW_BECOMES_in_declaration1335); 
					BECOMES65_tree = (Object)adaptor.create(BECOMES65);
					adaptor.addChild(root_0, BECOMES65_tree);

					pushFollow(FOLLOW_expression_in_declaration1337);
					expression66=expression();
					state._fsp--;

					adaptor.addChild(root_0, expression66.getTree());

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
	// Neptune.g:163:1: expression : assignment_expr ;
	public final NeptuneParser.expression_return expression() throws RecognitionException {
		NeptuneParser.expression_return retval = new NeptuneParser.expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope assignment_expr67 =null;


		try {
			// Neptune.g:164:2: ( assignment_expr )
			// Neptune.g:164:4: assignment_expr
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_assignment_expr_in_expression1349);
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
	// Neptune.g:167:1: assignment_expr : boolean_expr ( BECOMES ^ assignment_expr )? ;
	public final NeptuneParser.assignment_expr_return assignment_expr() throws RecognitionException {
		NeptuneParser.assignment_expr_return retval = new NeptuneParser.assignment_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token BECOMES69=null;
		ParserRuleReturnScope boolean_expr68 =null;
		ParserRuleReturnScope assignment_expr70 =null;

		Object BECOMES69_tree=null;

		try {
			// Neptune.g:168:2: ( boolean_expr ( BECOMES ^ assignment_expr )? )
			// Neptune.g:168:4: boolean_expr ( BECOMES ^ assignment_expr )?
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_boolean_expr_in_assignment_expr1360);
			boolean_expr68=boolean_expr();
			state._fsp--;

			adaptor.addChild(root_0, boolean_expr68.getTree());

			// Neptune.g:168:17: ( BECOMES ^ assignment_expr )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==BECOMES) ) {
				alt10=1;
			}
			switch (alt10) {
				case 1 :
					// Neptune.g:168:18: BECOMES ^ assignment_expr
					{
					BECOMES69=(Token)match(input,BECOMES,FOLLOW_BECOMES_in_assignment_expr1363); 
					BECOMES69_tree = (Object)adaptor.create(BECOMES69);
					root_0 = (Object)adaptor.becomeRoot(BECOMES69_tree, root_0);

					pushFollow(FOLLOW_assignment_expr_in_assignment_expr1366);
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
	// Neptune.g:171:1: boolean_expr : plus_expr ( ( LT ^| LT_EQ ^| GT ^| GT_EQ ^| EQ ^| NEQ ^) plus_expr )* ;
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
			// Neptune.g:172:2: ( plus_expr ( ( LT ^| LT_EQ ^| GT ^| GT_EQ ^| EQ ^| NEQ ^) plus_expr )* )
			// Neptune.g:172:4: plus_expr ( ( LT ^| LT_EQ ^| GT ^| GT_EQ ^| EQ ^| NEQ ^) plus_expr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_plus_expr_in_boolean_expr1380);
			plus_expr71=plus_expr();
			state._fsp--;

			adaptor.addChild(root_0, plus_expr71.getTree());

			// Neptune.g:172:14: ( ( LT ^| LT_EQ ^| GT ^| GT_EQ ^| EQ ^| NEQ ^) plus_expr )*
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( (LA12_0==EQ||(LA12_0 >= GT && LA12_0 <= GT_EQ)||(LA12_0 >= LT && LA12_0 <= LT_EQ)||LA12_0==NEQ) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// Neptune.g:172:15: ( LT ^| LT_EQ ^| GT ^| GT_EQ ^| EQ ^| NEQ ^) plus_expr
					{
					// Neptune.g:172:15: ( LT ^| LT_EQ ^| GT ^| GT_EQ ^| EQ ^| NEQ ^)
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
							// Neptune.g:172:16: LT ^
							{
							LT72=(Token)match(input,LT,FOLLOW_LT_in_boolean_expr1384); 
							LT72_tree = (Object)adaptor.create(LT72);
							root_0 = (Object)adaptor.becomeRoot(LT72_tree, root_0);

							}
							break;
						case 2 :
							// Neptune.g:172:22: LT_EQ ^
							{
							LT_EQ73=(Token)match(input,LT_EQ,FOLLOW_LT_EQ_in_boolean_expr1389); 
							LT_EQ73_tree = (Object)adaptor.create(LT_EQ73);
							root_0 = (Object)adaptor.becomeRoot(LT_EQ73_tree, root_0);

							}
							break;
						case 3 :
							// Neptune.g:172:31: GT ^
							{
							GT74=(Token)match(input,GT,FOLLOW_GT_in_boolean_expr1394); 
							GT74_tree = (Object)adaptor.create(GT74);
							root_0 = (Object)adaptor.becomeRoot(GT74_tree, root_0);

							}
							break;
						case 4 :
							// Neptune.g:172:37: GT_EQ ^
							{
							GT_EQ75=(Token)match(input,GT_EQ,FOLLOW_GT_EQ_in_boolean_expr1399); 
							GT_EQ75_tree = (Object)adaptor.create(GT_EQ75);
							root_0 = (Object)adaptor.becomeRoot(GT_EQ75_tree, root_0);

							}
							break;
						case 5 :
							// Neptune.g:172:46: EQ ^
							{
							EQ76=(Token)match(input,EQ,FOLLOW_EQ_in_boolean_expr1404); 
							EQ76_tree = (Object)adaptor.create(EQ76);
							root_0 = (Object)adaptor.becomeRoot(EQ76_tree, root_0);

							}
							break;
						case 6 :
							// Neptune.g:172:52: NEQ ^
							{
							NEQ77=(Token)match(input,NEQ,FOLLOW_NEQ_in_boolean_expr1409); 
							NEQ77_tree = (Object)adaptor.create(NEQ77);
							root_0 = (Object)adaptor.becomeRoot(NEQ77_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_plus_expr_in_boolean_expr1413);
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
	// Neptune.g:175:1: plus_expr : multi_expr ( ( PLUS ^| MINUS ^) multi_expr )* ;
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
			// Neptune.g:176:2: ( multi_expr ( ( PLUS ^| MINUS ^) multi_expr )* )
			// Neptune.g:176:4: multi_expr ( ( PLUS ^| MINUS ^) multi_expr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_multi_expr_in_plus_expr1426);
			multi_expr79=multi_expr();
			state._fsp--;

			adaptor.addChild(root_0, multi_expr79.getTree());

			// Neptune.g:176:15: ( ( PLUS ^| MINUS ^) multi_expr )*
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( (LA14_0==MINUS||LA14_0==PLUS) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// Neptune.g:176:16: ( PLUS ^| MINUS ^) multi_expr
					{
					// Neptune.g:176:16: ( PLUS ^| MINUS ^)
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
							// Neptune.g:176:17: PLUS ^
							{
							PLUS80=(Token)match(input,PLUS,FOLLOW_PLUS_in_plus_expr1430); 
							PLUS80_tree = (Object)adaptor.create(PLUS80);
							root_0 = (Object)adaptor.becomeRoot(PLUS80_tree, root_0);

							}
							break;
						case 2 :
							// Neptune.g:176:25: MINUS ^
							{
							MINUS81=(Token)match(input,MINUS,FOLLOW_MINUS_in_plus_expr1435); 
							MINUS81_tree = (Object)adaptor.create(MINUS81);
							root_0 = (Object)adaptor.becomeRoot(MINUS81_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_multi_expr_in_plus_expr1439);
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
	// Neptune.g:179:1: multi_expr : operand ( ( TIMES ^| DIVIDE ^) operand )* ;
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
			// Neptune.g:180:2: ( operand ( ( TIMES ^| DIVIDE ^) operand )* )
			// Neptune.g:180:4: operand ( ( TIMES ^| DIVIDE ^) operand )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_operand_in_multi_expr1452);
			operand83=operand();
			state._fsp--;

			adaptor.addChild(root_0, operand83.getTree());

			// Neptune.g:180:12: ( ( TIMES ^| DIVIDE ^) operand )*
			loop16:
			while (true) {
				int alt16=2;
				int LA16_0 = input.LA(1);
				if ( (LA16_0==DIVIDE||LA16_0==TIMES) ) {
					alt16=1;
				}

				switch (alt16) {
				case 1 :
					// Neptune.g:180:13: ( TIMES ^| DIVIDE ^) operand
					{
					// Neptune.g:180:13: ( TIMES ^| DIVIDE ^)
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
							// Neptune.g:180:14: TIMES ^
							{
							TIMES84=(Token)match(input,TIMES,FOLLOW_TIMES_in_multi_expr1456); 
							TIMES84_tree = (Object)adaptor.create(TIMES84);
							root_0 = (Object)adaptor.becomeRoot(TIMES84_tree, root_0);

							}
							break;
						case 2 :
							// Neptune.g:180:23: DIVIDE ^
							{
							DIVIDE85=(Token)match(input,DIVIDE,FOLLOW_DIVIDE_in_multi_expr1461); 
							DIVIDE85_tree = (Object)adaptor.create(DIVIDE85);
							root_0 = (Object)adaptor.becomeRoot(DIVIDE85_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_operand_in_multi_expr1465);
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
	// Neptune.g:183:1: operand : ( IDENTIFIER | NUMBER | LPAREN ! assignment_expr RPAREN !| LCURLY expression ( COMMA expression )* RCURLY -> ^( ARRAY_SET ( expression )+ ) | print_statement | read_statement | ( TRUE | FALSE ) | CHAR_LITERAL | STRING_LITERAL );
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
		Token CHAR_LITERAL100=null;
		Token STRING_LITERAL101=null;
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
		Object CHAR_LITERAL100_tree=null;
		Object STRING_LITERAL101_tree=null;
		RewriteRuleTokenStream stream_LCURLY=new RewriteRuleTokenStream(adaptor,"token LCURLY");
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_RCURLY=new RewriteRuleTokenStream(adaptor,"token RCURLY");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try {
			// Neptune.g:184:5: ( IDENTIFIER | NUMBER | LPAREN ! assignment_expr RPAREN !| LCURLY expression ( COMMA expression )* RCURLY -> ^( ARRAY_SET ( expression )+ ) | print_statement | read_statement | ( TRUE | FALSE ) | CHAR_LITERAL | STRING_LITERAL )
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
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 18, 0, input);
				throw nvae;
			}
			switch (alt18) {
				case 1 :
					// Neptune.g:184:9: IDENTIFIER
					{
					root_0 = (Object)adaptor.nil();


					IDENTIFIER87=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_operand1483); 
					IDENTIFIER87_tree = (Object)adaptor.create(IDENTIFIER87);
					adaptor.addChild(root_0, IDENTIFIER87_tree);

					}
					break;
				case 2 :
					// Neptune.g:185:9: NUMBER
					{
					root_0 = (Object)adaptor.nil();


					NUMBER88=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_operand1493); 
					NUMBER88_tree = (Object)adaptor.create(NUMBER88);
					adaptor.addChild(root_0, NUMBER88_tree);

					}
					break;
				case 3 :
					// Neptune.g:186:9: LPAREN ! assignment_expr RPAREN !
					{
					root_0 = (Object)adaptor.nil();


					LPAREN89=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_operand1503); 
					pushFollow(FOLLOW_assignment_expr_in_operand1506);
					assignment_expr90=assignment_expr();
					state._fsp--;

					adaptor.addChild(root_0, assignment_expr90.getTree());

					RPAREN91=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_operand1508); 
					}
					break;
				case 4 :
					// Neptune.g:187:4: LCURLY expression ( COMMA expression )* RCURLY
					{
					LCURLY92=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_operand1514);  
					stream_LCURLY.add(LCURLY92);

					pushFollow(FOLLOW_expression_in_operand1516);
					expression93=expression();
					state._fsp--;

					stream_expression.add(expression93.getTree());
					// Neptune.g:187:22: ( COMMA expression )*
					loop17:
					while (true) {
						int alt17=2;
						int LA17_0 = input.LA(1);
						if ( (LA17_0==COMMA) ) {
							alt17=1;
						}

						switch (alt17) {
						case 1 :
							// Neptune.g:187:23: COMMA expression
							{
							COMMA94=(Token)match(input,COMMA,FOLLOW_COMMA_in_operand1519);  
							stream_COMMA.add(COMMA94);

							pushFollow(FOLLOW_expression_in_operand1521);
							expression95=expression();
							state._fsp--;

							stream_expression.add(expression95.getTree());
							}
							break;

						default :
							break loop17;
						}
					}

					RCURLY96=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_operand1525);  
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
					// 188:3: -> ^( ARRAY_SET ( expression )+ )
					{
						// Neptune.g:188:6: ^( ARRAY_SET ( expression )+ )
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
					// Neptune.g:189:4: print_statement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_print_statement_in_operand1541);
					print_statement97=print_statement();
					state._fsp--;

					adaptor.addChild(root_0, print_statement97.getTree());

					}
					break;
				case 6 :
					// Neptune.g:190:4: read_statement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_read_statement_in_operand1546);
					read_statement98=read_statement();
					state._fsp--;

					adaptor.addChild(root_0, read_statement98.getTree());

					}
					break;
				case 7 :
					// Neptune.g:191:4: ( TRUE | FALSE )
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
					// Neptune.g:192:4: CHAR_LITERAL
					{
					root_0 = (Object)adaptor.nil();


					CHAR_LITERAL100=(Token)match(input,CHAR_LITERAL,FOLLOW_CHAR_LITERAL_in_operand1562); 
					CHAR_LITERAL100_tree = (Object)adaptor.create(CHAR_LITERAL100);
					adaptor.addChild(root_0, CHAR_LITERAL100_tree);

					}
					break;
				case 9 :
					// Neptune.g:193:4: STRING_LITERAL
					{
					root_0 = (Object)adaptor.nil();


					STRING_LITERAL101=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_operand1567); 
					STRING_LITERAL101_tree = (Object)adaptor.create(STRING_LITERAL101);
					adaptor.addChild(root_0, STRING_LITERAL101_tree);

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
	// Neptune.g:196:1: type : ( INTEGER ( array_def )? | CHAR ( array_def )? | BOOLEAN ( array_def )? );
	public final NeptuneParser.type_return type() throws RecognitionException {
		NeptuneParser.type_return retval = new NeptuneParser.type_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token INTEGER102=null;
		Token CHAR104=null;
		Token BOOLEAN106=null;
		ParserRuleReturnScope array_def103 =null;
		ParserRuleReturnScope array_def105 =null;
		ParserRuleReturnScope array_def107 =null;

		Object INTEGER102_tree=null;
		Object CHAR104_tree=null;
		Object BOOLEAN106_tree=null;

		try {
			// Neptune.g:197:2: ( INTEGER ( array_def )? | CHAR ( array_def )? | BOOLEAN ( array_def )? )
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
					// Neptune.g:197:4: INTEGER ( array_def )?
					{
					root_0 = (Object)adaptor.nil();


					INTEGER102=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_type1581); 
					INTEGER102_tree = (Object)adaptor.create(INTEGER102);
					adaptor.addChild(root_0, INTEGER102_tree);

					// Neptune.g:197:12: ( array_def )?
					int alt19=2;
					int LA19_0 = input.LA(1);
					if ( (LA19_0==LBRACKET) ) {
						alt19=1;
					}
					switch (alt19) {
						case 1 :
							// Neptune.g:197:12: array_def
							{
							pushFollow(FOLLOW_array_def_in_type1583);
							array_def103=array_def();
							state._fsp--;

							adaptor.addChild(root_0, array_def103.getTree());

							}
							break;

					}

					}
					break;
				case 2 :
					// Neptune.g:198:4: CHAR ( array_def )?
					{
					root_0 = (Object)adaptor.nil();


					CHAR104=(Token)match(input,CHAR,FOLLOW_CHAR_in_type1589); 
					CHAR104_tree = (Object)adaptor.create(CHAR104);
					adaptor.addChild(root_0, CHAR104_tree);

					// Neptune.g:198:9: ( array_def )?
					int alt20=2;
					int LA20_0 = input.LA(1);
					if ( (LA20_0==LBRACKET) ) {
						alt20=1;
					}
					switch (alt20) {
						case 1 :
							// Neptune.g:198:9: array_def
							{
							pushFollow(FOLLOW_array_def_in_type1591);
							array_def105=array_def();
							state._fsp--;

							adaptor.addChild(root_0, array_def105.getTree());

							}
							break;

					}

					}
					break;
				case 3 :
					// Neptune.g:199:4: BOOLEAN ( array_def )?
					{
					root_0 = (Object)adaptor.nil();


					BOOLEAN106=(Token)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_type1597); 
					BOOLEAN106_tree = (Object)adaptor.create(BOOLEAN106);
					adaptor.addChild(root_0, BOOLEAN106_tree);

					// Neptune.g:199:12: ( array_def )?
					int alt21=2;
					int LA21_0 = input.LA(1);
					if ( (LA21_0==LBRACKET) ) {
						alt21=1;
					}
					switch (alt21) {
						case 1 :
							// Neptune.g:199:12: array_def
							{
							pushFollow(FOLLOW_array_def_in_type1599);
							array_def107=array_def();
							state._fsp--;

							adaptor.addChild(root_0, array_def107.getTree());

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
	// Neptune.g:202:1: array_def : LBRACKET ( NUMBER )? RBRACKET ;
	public final NeptuneParser.array_def_return array_def() throws RecognitionException {
		NeptuneParser.array_def_return retval = new NeptuneParser.array_def_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token LBRACKET108=null;
		Token NUMBER109=null;
		Token RBRACKET110=null;

		Object LBRACKET108_tree=null;
		Object NUMBER109_tree=null;
		Object RBRACKET110_tree=null;

		try {
			// Neptune.g:203:2: ( LBRACKET ( NUMBER )? RBRACKET )
			// Neptune.g:203:5: LBRACKET ( NUMBER )? RBRACKET
			{
			root_0 = (Object)adaptor.nil();


			LBRACKET108=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_array_def1613); 
			LBRACKET108_tree = (Object)adaptor.create(LBRACKET108);
			adaptor.addChild(root_0, LBRACKET108_tree);

			// Neptune.g:203:14: ( NUMBER )?
			int alt23=2;
			int LA23_0 = input.LA(1);
			if ( (LA23_0==NUMBER) ) {
				alt23=1;
			}
			switch (alt23) {
				case 1 :
					// Neptune.g:203:14: NUMBER
					{
					NUMBER109=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_array_def1615); 
					NUMBER109_tree = (Object)adaptor.create(NUMBER109);
					adaptor.addChild(root_0, NUMBER109_tree);

					}
					break;

			}

			RBRACKET110=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_array_def1618); 
			RBRACKET110_tree = (Object)adaptor.create(RBRACKET110);
			adaptor.addChild(root_0, RBRACKET110_tree);

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



	public static final BitSet FOLLOW_lines_in_program1009 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_program1011 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_line_in_lines1046 = new BitSet(new long[]{0x01244284AC6011C2L});
	public static final BitSet FOLLOW_expression_in_line1059 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_line1061 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declaration_in_line1067 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_line1069 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_logic_statement_in_line1075 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_while_statement_in_logic_statement1087 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_foreach_statement_in_logic_statement1092 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_if_statement_in_logic_statement1097 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHILE_in_while_statement1109 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_LPAREN_in_while_statement1112 = new BitSet(new long[]{0x0024428484200100L});
	public static final BitSet FOLLOW_expression_in_while_statement1115 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_while_statement1117 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_LCURLY_in_while_statement1120 = new BitSet(new long[]{0x01244284AC6011C0L});
	public static final BitSet FOLLOW_lines_in_while_statement1123 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_RCURLY_in_while_statement1125 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FOREACH_in_foreach_statement1138 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_LPAREN_in_foreach_statement1141 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_foreach_statement1144 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_IN_in_foreach_statement1146 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_foreach_statement1149 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_foreach_statement1151 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_LCURLY_in_foreach_statement1154 = new BitSet(new long[]{0x01244284AC6011C0L});
	public static final BitSet FOLLOW_lines_in_foreach_statement1157 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_RCURLY_in_foreach_statement1159 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_if_statement1172 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_LPAREN_in_if_statement1175 = new BitSet(new long[]{0x0024428484200100L});
	public static final BitSet FOLLOW_expression_in_if_statement1178 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_if_statement1180 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_LCURLY_in_if_statement1183 = new BitSet(new long[]{0x01244284AC6011C0L});
	public static final BitSet FOLLOW_lines_in_if_statement1186 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_RCURLY_in_if_statement1188 = new BitSet(new long[]{0x00000000000C0002L});
	public static final BitSet FOLLOW_ELSIF_in_if_statement1194 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_LPAREN_in_if_statement1196 = new BitSet(new long[]{0x0024428484200100L});
	public static final BitSet FOLLOW_expression_in_if_statement1199 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_if_statement1201 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_LCURLY_in_if_statement1204 = new BitSet(new long[]{0x01244284AC6011C0L});
	public static final BitSet FOLLOW_lines_in_if_statement1207 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_RCURLY_in_if_statement1209 = new BitSet(new long[]{0x00000000000C0002L});
	public static final BitSet FOLLOW_ELSE_in_if_statement1217 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_LCURLY_in_if_statement1219 = new BitSet(new long[]{0x01244284AC6011C0L});
	public static final BitSet FOLLOW_lines_in_if_statement1222 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_RCURLY_in_if_statement1224 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRINT_in_print_statement1239 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_LPAREN_in_print_statement1242 = new BitSet(new long[]{0x0024428484200100L});
	public static final BitSet FOLLOW_expression_in_print_statement1245 = new BitSet(new long[]{0x0001000000000400L});
	public static final BitSet FOLLOW_COMMA_in_print_statement1248 = new BitSet(new long[]{0x0024428484200100L});
	public static final BitSet FOLLOW_expression_in_print_statement1250 = new BitSet(new long[]{0x0001000000000400L});
	public static final BitSet FOLLOW_RPAREN_in_print_statement1254 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_READ_in_read_statement1267 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_LPAREN_in_read_statement1270 = new BitSet(new long[]{0x0024428484200100L});
	public static final BitSet FOLLOW_expression_in_read_statement1273 = new BitSet(new long[]{0x0001000000000400L});
	public static final BitSet FOLLOW_COMMA_in_read_statement1276 = new BitSet(new long[]{0x0024428484200100L});
	public static final BitSet FOLLOW_expression_in_read_statement1278 = new BitSet(new long[]{0x0001000000000400L});
	public static final BitSet FOLLOW_RPAREN_in_read_statement1282 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_declaration1295 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_declaration1297 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_BECOMES_in_declaration1300 = new BitSet(new long[]{0x0024428484200100L});
	public static final BitSet FOLLOW_expression_in_declaration1302 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CONST_in_declaration1328 = new BitSet(new long[]{0x00000000200000C0L});
	public static final BitSet FOLLOW_type_in_declaration1331 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_declaration1333 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_BECOMES_in_declaration1335 = new BitSet(new long[]{0x0024428484200100L});
	public static final BitSet FOLLOW_expression_in_declaration1337 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignment_expr_in_expression1349 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_boolean_expr_in_assignment_expr1360 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_BECOMES_in_assignment_expr1363 = new BitSet(new long[]{0x0024428484200100L});
	public static final BitSet FOLLOW_assignment_expr_in_assignment_expr1366 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_plus_expr_in_boolean_expr1380 = new BitSet(new long[]{0x0000005803100002L});
	public static final BitSet FOLLOW_LT_in_boolean_expr1384 = new BitSet(new long[]{0x0024428484200100L});
	public static final BitSet FOLLOW_LT_EQ_in_boolean_expr1389 = new BitSet(new long[]{0x0024428484200100L});
	public static final BitSet FOLLOW_GT_in_boolean_expr1394 = new BitSet(new long[]{0x0024428484200100L});
	public static final BitSet FOLLOW_GT_EQ_in_boolean_expr1399 = new BitSet(new long[]{0x0024428484200100L});
	public static final BitSet FOLLOW_EQ_in_boolean_expr1404 = new BitSet(new long[]{0x0024428484200100L});
	public static final BitSet FOLLOW_NEQ_in_boolean_expr1409 = new BitSet(new long[]{0x0024428484200100L});
	public static final BitSet FOLLOW_plus_expr_in_boolean_expr1413 = new BitSet(new long[]{0x0000005803100002L});
	public static final BitSet FOLLOW_multi_expr_in_plus_expr1426 = new BitSet(new long[]{0x0000012000000002L});
	public static final BitSet FOLLOW_PLUS_in_plus_expr1430 = new BitSet(new long[]{0x0024428484200100L});
	public static final BitSet FOLLOW_MINUS_in_plus_expr1435 = new BitSet(new long[]{0x0024428484200100L});
	public static final BitSet FOLLOW_multi_expr_in_plus_expr1439 = new BitSet(new long[]{0x0000012000000002L});
	public static final BitSet FOLLOW_operand_in_multi_expr1452 = new BitSet(new long[]{0x0010000000004002L});
	public static final BitSet FOLLOW_TIMES_in_multi_expr1456 = new BitSet(new long[]{0x0024428484200100L});
	public static final BitSet FOLLOW_DIVIDE_in_multi_expr1461 = new BitSet(new long[]{0x0024428484200100L});
	public static final BitSet FOLLOW_operand_in_multi_expr1465 = new BitSet(new long[]{0x0010000000004002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_operand1483 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMBER_in_operand1493 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_operand1503 = new BitSet(new long[]{0x0024428484200100L});
	public static final BitSet FOLLOW_assignment_expr_in_operand1506 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_operand1508 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LCURLY_in_operand1514 = new BitSet(new long[]{0x0024428484200100L});
	public static final BitSet FOLLOW_expression_in_operand1516 = new BitSet(new long[]{0x0000200000000400L});
	public static final BitSet FOLLOW_COMMA_in_operand1519 = new BitSet(new long[]{0x0024428484200100L});
	public static final BitSet FOLLOW_expression_in_operand1521 = new BitSet(new long[]{0x0000200000000400L});
	public static final BitSet FOLLOW_RCURLY_in_operand1525 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_print_statement_in_operand1541 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_read_statement_in_operand1546 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_operand1551 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_LITERAL_in_operand1562 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_operand1567 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTEGER_in_type1581 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_array_def_in_type1583 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_in_type1589 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_array_def_in_type1591 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOLEAN_in_type1597 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_array_def_in_type1599 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACKET_in_array_def1613 = new BitSet(new long[]{0x0000108000000000L});
	public static final BitSet FOLLOW_NUMBER_in_array_def1615 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_RBRACKET_in_array_def1618 = new BitSet(new long[]{0x0000000000000002L});
}

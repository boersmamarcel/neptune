// $ANTLR 3.5.2 antlr/NeptuneChecker.g 2014-07-03 15:55:52

	package neptune;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class NeptuneChecker extends TreeParser {
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
	public TreeParser[] getDelegates() {
		return new TreeParser[] {};
	}

	// delegators


	public NeptuneChecker(TreeNodeStream input) {
		this(input, new RecognizerSharedState());
	}
	public NeptuneChecker(TreeNodeStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return NeptuneChecker.tokenNames; }
	@Override public String getGrammarFileName() { return "antlr/NeptuneChecker.g"; }


		protected SymbolTable symtab = new SymbolTable();
		public void declare(String s, Type type) throws NeptuneException {
				try {
					symtab.enter(s, new IdEntry(0, type));
				} catch (SymbolTableException e) {
					throw new NeptuneException(e.getMessage());
				}
		}

		public boolean isDeclared(String s){ return (symtab.retrieve(s) != null);}
		
		public void checkBinaryOperator(Type e1, Type e2) throws NeptuneException {
			if(e1.isArray) {
				throw new NeptuneException("left hand side of operator cannot be array");
			}
			
			if(e2.isArray) {
				throw new NeptuneException("right hand side of operator cannot be array");
			}
			
			if(e1.type == Type.primitive.BOOLEAN || e1.type == Type.primitive.VOID) {
				throw new NeptuneException("invalid operand type for left hand side");
			}
			
			if(e2.type == Type.primitive.BOOLEAN || e2.type == Type.primitive.VOID) {
				throw new NeptuneException("invalid operand type for right hand side");
			}
		}




	// $ANTLR start "program"
	// antlr/NeptuneChecker.g:51:1: program : ^( PROGRAM lines ) ;
	public final void program() throws RecognitionException {
		try {
			// antlr/NeptuneChecker.g:52:2: ( ^( PROGRAM lines ) )
			// antlr/NeptuneChecker.g:52:4: ^( PROGRAM lines )
			{
			match(input,PROGRAM,FOLLOW_PROGRAM_in_program47); 
			symtab.openScope();
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_lines_in_program51);
			lines();
			state._fsp--;

			match(input, Token.UP, null); 

			symtab.closeScope();
			}

		}

			catch(RecognitionException e){
				throw e;
			}

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "program"



	// $ANTLR start "lines"
	// antlr/NeptuneChecker.g:55:1: lines returns [ Type type = new Type(Type.primitive.VOID) ] : (t= line )+ ;
	public final Type lines() throws RecognitionException {
		Type type =  new Type(Type.primitive.VOID);


		Type t =null;

		try {
			// antlr/NeptuneChecker.g:56:2: ( (t= line )+ )
			// antlr/NeptuneChecker.g:56:4: (t= line )+
			{
			// antlr/NeptuneChecker.g:56:5: (t= line )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==AND||(LA1_0 >= ARRAY_SET && LA1_0 <= BLOCK)||LA1_0==CHAR_LITERAL||LA1_0==CONST||LA1_0==DIVIDE||(LA1_0 >= EQ && LA1_0 <= GT_EQ)||LA1_0==IF||(LA1_0 >= LT && LA1_0 <= PRINT)||LA1_0==READ||(LA1_0 >= SIZEOF && LA1_0 <= STRING_LITERAL)||(LA1_0 >= TIMES && LA1_0 <= UNARY_PLUS)||(LA1_0 >= VAR && LA1_0 <= WHILE)) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// antlr/NeptuneChecker.g:56:5: t= line
					{
					pushFollow(FOLLOW_line_in_lines70);
					t=line();
					state._fsp--;

					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			type=t;
			}

		}

			catch(RecognitionException e){
				throw e;
			}

		finally {
			// do for sure before leaving
		}
		return type;
	}
	// $ANTLR end "lines"



	// $ANTLR start "line"
	// antlr/NeptuneChecker.g:59:1: line returns [Type type = new Type(Type.primitive.VOID) ] : (t= expression | declaration | logic_statement );
	public final Type line() throws RecognitionException {
		Type type =  new Type(Type.primitive.VOID);


		Type t =null;

		try {
			// antlr/NeptuneChecker.g:60:2: (t= expression | declaration | logic_statement )
			int alt2=3;
			switch ( input.LA(1) ) {
			case FUNCTION:
				{
				int LA2_1 = input.LA(2);
				if ( (LA2_1==DOWN) ) {
					int LA2_5 = input.LA(3);
					if ( (LA2_5==IDENTIFIER) ) {
						alt2=1;
					}
					else if ( ((LA2_5 >= BOOLEAN && LA2_5 <= CHAR)||LA2_5==INTEGER) ) {
						alt2=2;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 2, 5, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 2, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case AND:
			case ARRAY_SET:
			case ARRAY_VAR:
			case ATOMIC_VAR:
			case BECOMES:
			case BLOCK:
			case CHAR_LITERAL:
			case DIVIDE:
			case EQ:
			case FALSE:
			case GT:
			case GT_EQ:
			case LT:
			case LT_EQ:
			case MINUS:
			case MOD:
			case NEGATE:
			case NEQ:
			case NUMBER:
			case OR:
			case PLUS:
			case PRINT:
			case READ:
			case SIZEOF:
			case STRING_LITERAL:
			case TIMES:
			case TRUE:
			case UNARY_MINUS:
			case UNARY_PLUS:
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
					// antlr/NeptuneChecker.g:60:4: t= expression
					{
					pushFollow(FOLLOW_expression_in_line90);
					t=expression();
					state._fsp--;

					type=t;
					}
					break;
				case 2 :
					// antlr/NeptuneChecker.g:61:4: declaration
					{
					pushFollow(FOLLOW_declaration_in_line97);
					declaration();
					state._fsp--;

					type = new Type(Type.primitive.VOID);
					}
					break;
				case 3 :
					// antlr/NeptuneChecker.g:62:4: logic_statement
					{
					pushFollow(FOLLOW_logic_statement_in_line104);
					logic_statement();
					state._fsp--;

					type = new Type(Type.primitive.VOID);
					}
					break;

			}
		}

			catch(RecognitionException e){
				throw e;
			}

		finally {
			// do for sure before leaving
		}
		return type;
	}
	// $ANTLR end "line"



	// $ANTLR start "codeblock"
	// antlr/NeptuneChecker.g:65:1: codeblock returns [Type type = new Type(Type.primitive.VOID) ] : ^( BLOCK lines ) ;
	public final Type codeblock() throws RecognitionException {
		Type type =  new Type(Type.primitive.VOID);


		try {
			// antlr/NeptuneChecker.g:66:2: ( ^( BLOCK lines ) )
			// antlr/NeptuneChecker.g:66:4: ^( BLOCK lines )
			{
			match(input,BLOCK,FOLLOW_BLOCK_in_codeblock122); 
			symtab.openScope();
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_lines_in_codeblock126);
			lines();
			state._fsp--;

			symtab.closeScope();
			match(input, Token.UP, null); 

			}

		}

			catch(RecognitionException e){
				throw e;
			}

		finally {
			// do for sure before leaving
		}
		return type;
	}
	// $ANTLR end "codeblock"



	// $ANTLR start "logic_statement"
	// antlr/NeptuneChecker.g:69:1: logic_statement : ( while_statement | foreach_statement | if_statement );
	public final void logic_statement() throws RecognitionException {
		try {
			// antlr/NeptuneChecker.g:70:2: ( while_statement | foreach_statement | if_statement )
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
					// antlr/NeptuneChecker.g:70:4: while_statement
					{
					pushFollow(FOLLOW_while_statement_in_logic_statement140);
					while_statement();
					state._fsp--;

					}
					break;
				case 2 :
					// antlr/NeptuneChecker.g:71:4: foreach_statement
					{
					pushFollow(FOLLOW_foreach_statement_in_logic_statement145);
					foreach_statement();
					state._fsp--;

					}
					break;
				case 3 :
					// antlr/NeptuneChecker.g:72:4: if_statement
					{
					pushFollow(FOLLOW_if_statement_in_logic_statement150);
					if_statement();
					state._fsp--;

					}
					break;

			}
		}

			catch(RecognitionException e){
				throw e;
			}

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "logic_statement"



	// $ANTLR start "while_statement"
	// antlr/NeptuneChecker.g:75:1: while_statement : ^( WHILE expression lines ) ;
	public final void while_statement() throws RecognitionException {
		try {
			// antlr/NeptuneChecker.g:76:2: ( ^( WHILE expression lines ) )
			// antlr/NeptuneChecker.g:76:4: ^( WHILE expression lines )
			{
			match(input,WHILE,FOLLOW_WHILE_in_while_statement162); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expression_in_while_statement164);
			expression();
			state._fsp--;

			symtab.openScope();
			pushFollow(FOLLOW_lines_in_while_statement168);
			lines();
			state._fsp--;

			symtab.closeScope();
			match(input, Token.UP, null); 

			}

		}

			catch(RecognitionException e){
				throw e;
			}

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "while_statement"



	// $ANTLR start "foreach_statement"
	// antlr/NeptuneChecker.g:79:1: foreach_statement : ^( FOREACH x= IDENTIFIER y= IDENTIFIER lines ) ;
	public final void foreach_statement() throws RecognitionException {
		CommonTree x=null;
		CommonTree y=null;

		try {
			// antlr/NeptuneChecker.g:80:2: ( ^( FOREACH x= IDENTIFIER y= IDENTIFIER lines ) )
			// antlr/NeptuneChecker.g:80:4: ^( FOREACH x= IDENTIFIER y= IDENTIFIER lines )
			{
			match(input,FOREACH,FOLLOW_FOREACH_in_foreach_statement183); 
			match(input, Token.DOWN, null); 
			x=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_foreach_statement187); 
			symtab.openScope();
			y=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_foreach_statement193); 
			 
					if(!isDeclared((y!=null?y.getText():null))){
						throw new NeptuneException(y,"is not declared");
					}
					if(!symtab.retrieve((y!=null?y.getText():null)).getType().isArray){
						throw new NeptuneException(y,"is not an array");
					}
					declare((x!=null?x.getText():null), new Type(symtab.retrieve((y!=null?y.getText():null)).getType().type));
					
			pushFollow(FOLLOW_lines_in_foreach_statement197);
			lines();
			state._fsp--;

			symtab.closeScope();
			match(input, Token.UP, null); 

			}

		}

			catch(RecognitionException e){
				throw e;
			}

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "foreach_statement"



	// $ANTLR start "if_statement"
	// antlr/NeptuneChecker.g:91:1: if_statement : ^( IF expression lines ( ELSIF expression lines )* ( ELSE lines )? ) ;
	public final void if_statement() throws RecognitionException {
		try {
			// antlr/NeptuneChecker.g:92:2: ( ^( IF expression lines ( ELSIF expression lines )* ( ELSE lines )? ) )
			// antlr/NeptuneChecker.g:92:4: ^( IF expression lines ( ELSIF expression lines )* ( ELSE lines )? )
			{
			match(input,IF,FOLLOW_IF_in_if_statement213); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expression_in_if_statement215);
			expression();
			state._fsp--;

			symtab.openScope();
			pushFollow(FOLLOW_lines_in_if_statement219);
			lines();
			state._fsp--;

			symtab.closeScope();
			// antlr/NeptuneChecker.g:93:3: ( ELSIF expression lines )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==ELSIF) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// antlr/NeptuneChecker.g:93:4: ELSIF expression lines
					{
					match(input,ELSIF,FOLLOW_ELSIF_in_if_statement226); 
					pushFollow(FOLLOW_expression_in_if_statement228);
					expression();
					state._fsp--;

					symtab.openScope();
					pushFollow(FOLLOW_lines_in_if_statement232);
					lines();
					state._fsp--;

					symtab.closeScope();
					}
					break;

				default :
					break loop4;
				}
			}

			// antlr/NeptuneChecker.g:94:3: ( ELSE lines )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==ELSE) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// antlr/NeptuneChecker.g:94:4: ELSE lines
					{
					match(input,ELSE,FOLLOW_ELSE_in_if_statement242); 
					symtab.openScope();
					pushFollow(FOLLOW_lines_in_if_statement246);
					lines();
					state._fsp--;

					symtab.closeScope();
					}
					break;

			}

			match(input, Token.UP, null); 

			}

		}

			catch(RecognitionException e){
				throw e;
			}

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "if_statement"



	// $ANTLR start "print_statement"
	// antlr/NeptuneChecker.g:97:1: print_statement returns [Type type = new Type(Type.primitive.VOID) ] : ^( PRINT t= expression ( COMMA expression )* ) ;
	public final Type print_statement() throws RecognitionException {
		Type type =  new Type(Type.primitive.VOID);


		Type t =null;

		boolean one=true;
		try {
			// antlr/NeptuneChecker.g:99:2: ( ^( PRINT t= expression ( COMMA expression )* ) )
			// antlr/NeptuneChecker.g:99:4: ^( PRINT t= expression ( COMMA expression )* )
			{
			match(input,PRINT,FOLLOW_PRINT_in_print_statement272); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expression_in_print_statement276);
			t=expression();
			state._fsp--;

			// antlr/NeptuneChecker.g:99:25: ( COMMA expression )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==COMMA) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// antlr/NeptuneChecker.g:99:26: COMMA expression
					{
					match(input,COMMA,FOLLOW_COMMA_in_print_statement279); 
					pushFollow(FOLLOW_expression_in_print_statement281);
					expression();
					state._fsp--;

					one=false;
					}
					break;

				default :
					break loop6;
				}
			}

			match(input, Token.UP, null); 


					if(one){
						type=t; 
					}else{
						type = new Type(Type.primitive.VOID);
					}
				
			}

		}

			catch(RecognitionException e){
				throw e;
			}

		finally {
			// do for sure before leaving
		}
		return type;
	}
	// $ANTLR end "print_statement"



	// $ANTLR start "read_statement"
	// antlr/NeptuneChecker.g:108:1: read_statement returns [Type type = new Type(Type.primitive.VOID) ] : ^( READ (t= IDENTIFIER ) ( COMMA t1= IDENTIFIER )* ) ;
	public final Type read_statement() throws RecognitionException {
		Type type =  new Type(Type.primitive.VOID);


		CommonTree t=null;
		CommonTree t1=null;

		boolean one=true;
		try {
			// antlr/NeptuneChecker.g:110:2: ( ^( READ (t= IDENTIFIER ) ( COMMA t1= IDENTIFIER )* ) )
			// antlr/NeptuneChecker.g:110:4: ^( READ (t= IDENTIFIER ) ( COMMA t1= IDENTIFIER )* )
			{
			match(input,READ,FOLLOW_READ_in_read_statement308); 
			match(input, Token.DOWN, null); 
			// antlr/NeptuneChecker.g:110:11: (t= IDENTIFIER )
			// antlr/NeptuneChecker.g:110:12: t= IDENTIFIER
			{
			t=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_read_statement313); 

					if(symtab.retrieve((t!=null?t.getText():null)).getType().type == Type.primitive.BOOLEAN) {
						throw new NeptuneException(t,"cannot read into boolean variable");
					}
					
					if(symtab.retrieve((t!=null?t.getText():null)).getType().isConstant) {
						throw new NeptuneException(t,"cannot read into constant variable");
					}
				
			}

			// antlr/NeptuneChecker.g:118:5: ( COMMA t1= IDENTIFIER )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==COMMA) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// antlr/NeptuneChecker.g:118:6: COMMA t1= IDENTIFIER
					{
					match(input,COMMA,FOLLOW_COMMA_in_read_statement319); 
					t1=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_read_statement323); 

							if(symtab.retrieve((t1!=null?t1.getText():null)).getType().type == Type.primitive.BOOLEAN) {
								throw new NeptuneException(t1,"cannot read into boolean variable");
							}
							
							if(symtab.retrieve((t1!=null?t1.getText():null)).getType().isConstant) {
								throw new NeptuneException(t1,"cannot read into constant variable");
							}
							one=false;
						
					}
					break;

				default :
					break loop7;
				}
			}

			match(input, Token.UP, null); 


					if(one){
						type=symtab.retrieve((t!=null?t.getText():null)).getType(); 
					}else{
						type = new Type(Type.primitive.VOID);
					}
			}

		}

			catch(RecognitionException e){
				throw e;
			}

		finally {
			// do for sure before leaving
		}
		return type;
	}
	// $ANTLR end "read_statement"



	// $ANTLR start "declaration"
	// antlr/NeptuneChecker.g:135:1: declaration : ( ^( VAR t= type x= IDENTIFIER ( BECOMES ex= expression )? ) | ^( CONST t= type x= IDENTIFIER BECOMES ex= expression ) | ^( FUNCTION t= type x= IDENTIFIER (argt= type args= IDENTIFIER )+ ( line )* return_type= return_statement ) );
	public final void declaration() throws RecognitionException {
		CommonTree x=null;
		CommonTree args=null;
		Type t =null;
		Type ex =null;
		Type argt =null;
		Type return_type =null;

		try {
			// antlr/NeptuneChecker.g:136:2: ( ^( VAR t= type x= IDENTIFIER ( BECOMES ex= expression )? ) | ^( CONST t= type x= IDENTIFIER BECOMES ex= expression ) | ^( FUNCTION t= type x= IDENTIFIER (argt= type args= IDENTIFIER )+ ( line )* return_type= return_statement ) )
			int alt11=3;
			switch ( input.LA(1) ) {
			case VAR:
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
					// antlr/NeptuneChecker.g:136:4: ^( VAR t= type x= IDENTIFIER ( BECOMES ex= expression )? )
					{
					match(input,VAR,FOLLOW_VAR_in_declaration342); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_type_in_declaration346);
					t=type();
					state._fsp--;

					x=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_declaration350); 
					// antlr/NeptuneChecker.g:136:30: ( BECOMES ex= expression )?
					int alt8=2;
					int LA8_0 = input.LA(1);
					if ( (LA8_0==BECOMES) ) {
						alt8=1;
					}
					switch (alt8) {
						case 1 :
							// antlr/NeptuneChecker.g:136:31: BECOMES ex= expression
							{
							match(input,BECOMES,FOLLOW_BECOMES_in_declaration353); 
							pushFollow(FOLLOW_expression_in_declaration357);
							ex=expression();
							state._fsp--;


									if(ex.isArray != t.isArray || ex.elemCount != t.elemCount) {
										throw new NeptuneException(x,"invalid declaration assignment (non-array or count mismatch)");
									}
								
							}
							break;

					}

					match(input, Token.UP, null); 


								declare((x!=null?x.getText():null), t);
							
					}
					break;
				case 2 :
					// antlr/NeptuneChecker.g:143:4: ^( CONST t= type x= IDENTIFIER BECOMES ex= expression )
					{
					match(input,CONST,FOLLOW_CONST_in_declaration370); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_type_in_declaration374);
					t=type();
					state._fsp--;

					x=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_declaration378); 
					match(input,BECOMES,FOLLOW_BECOMES_in_declaration380); 
					pushFollow(FOLLOW_expression_in_declaration384);
					ex=expression();
					state._fsp--;

					match(input, Token.UP, null); 


							//const cannot change in the future
							t.isConstant = true;
							declare((x!=null?x.getText():null), t);
							
							if(ex.isArray != t.isArray || ex.elemCount != t.elemCount) {
								throw new NeptuneException(x,"invalid declaration assignment (non-array or count mismatch)");
							}
						
					}
					break;
				case 3 :
					// antlr/NeptuneChecker.g:152:4: ^( FUNCTION t= type x= IDENTIFIER (argt= type args= IDENTIFIER )+ ( line )* return_type= return_statement )
					{
					match(input,FUNCTION,FOLLOW_FUNCTION_in_declaration393); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_type_in_declaration397);
					t=type();
					state._fsp--;

					x=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_declaration401); 

							symtab.openScope();
							declare((x!=null?x.getText():null), t);
						
					// antlr/NeptuneChecker.g:157:2: (argt= type args= IDENTIFIER )+
					int cnt9=0;
					loop9:
					while (true) {
						int alt9=2;
						int LA9_0 = input.LA(1);
						if ( ((LA9_0 >= BOOLEAN && LA9_0 <= CHAR)||LA9_0==INTEGER) ) {
							alt9=1;
						}

						switch (alt9) {
						case 1 :
							// antlr/NeptuneChecker.g:157:3: argt= type args= IDENTIFIER
							{
							pushFollow(FOLLOW_type_in_declaration412);
							argt=type();
							state._fsp--;

							args=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_declaration416); 
							 declare((args!=null?args.getText():null), argt); 
							}
							break;

						default :
							if ( cnt9 >= 1 ) break loop9;
							EarlyExitException eee = new EarlyExitException(9, input);
							throw eee;
						}
						cnt9++;
					}

					// antlr/NeptuneChecker.g:157:62: ( line )*
					loop10:
					while (true) {
						int alt10=2;
						int LA10_0 = input.LA(1);
						if ( (LA10_0==AND||(LA10_0 >= ARRAY_SET && LA10_0 <= BLOCK)||LA10_0==CHAR_LITERAL||LA10_0==CONST||LA10_0==DIVIDE||(LA10_0 >= EQ && LA10_0 <= GT_EQ)||LA10_0==IF||(LA10_0 >= LT && LA10_0 <= PRINT)||LA10_0==READ||(LA10_0 >= SIZEOF && LA10_0 <= STRING_LITERAL)||(LA10_0 >= TIMES && LA10_0 <= UNARY_PLUS)||(LA10_0 >= VAR && LA10_0 <= WHILE)) ) {
							alt10=1;
						}

						switch (alt10) {
						case 1 :
							// antlr/NeptuneChecker.g:157:62: line
							{
							pushFollow(FOLLOW_line_in_declaration422);
							line();
							state._fsp--;

							}
							break;

						default :
							break loop10;
						}
					}

					pushFollow(FOLLOW_return_statement_in_declaration427);
					return_type=return_statement();
					state._fsp--;

					match(input, Token.UP, null); 


							if(t.type != return_type.type){
								throw new NeptuneException("invalid return type");
							}

							symtab.closeScope();
					}
					break;

			}
		}

			catch(RecognitionException e){
				throw e;
			}

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "declaration"



	// $ANTLR start "return_statement"
	// antlr/NeptuneChecker.g:166:1: return_statement returns [Type type = null] : ^( RETURN t= expression ) ;
	public final Type return_statement() throws RecognitionException {
		Type type =  null;


		Type t =null;

		try {
			// antlr/NeptuneChecker.g:167:2: ( ^( RETURN t= expression ) )
			// antlr/NeptuneChecker.g:167:4: ^( RETURN t= expression )
			{
			match(input,RETURN,FOLLOW_RETURN_in_return_statement447); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expression_in_return_statement451);
			t=expression();
			state._fsp--;

			type = t;
			match(input, Token.UP, null); 

			}

		}

			catch(RecognitionException e){
				throw e;
			}

		finally {
			// do for sure before leaving
		}
		return type;
	}
	// $ANTLR end "return_statement"



	// $ANTLR start "expression"
	// antlr/NeptuneChecker.g:170:1: expression returns [Type type = new Type(Type.primitive.VOID) ] : t= assignment_expr ;
	public final Type expression() throws RecognitionException {
		Type type =  new Type(Type.primitive.VOID);


		Type t =null;

		try {
			// antlr/NeptuneChecker.g:171:2: (t= assignment_expr )
			// antlr/NeptuneChecker.g:171:4: t= assignment_expr
			{
			pushFollow(FOLLOW_assignment_expr_in_expression470);
			t=assignment_expr();
			state._fsp--;

			type = t;
			}

		}

			catch(RecognitionException e){
				throw e;
			}

		finally {
			// do for sure before leaving
		}
		return type;
	}
	// $ANTLR end "expression"



	// $ANTLR start "assignment_expr"
	// antlr/NeptuneChecker.g:174:1: assignment_expr returns [Type type = new Type(Type.primitive.VOID) ] : (t= and_or_expr | ^( BECOMES x= variable_use expression ) );
	public final Type assignment_expr() throws RecognitionException {
		Type type =  new Type(Type.primitive.VOID);


		Type t =null;
		Variable x =null;

		try {
			// antlr/NeptuneChecker.g:175:2: (t= and_or_expr | ^( BECOMES x= variable_use expression ) )
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==AND||(LA12_0 >= ARRAY_SET && LA12_0 <= ATOMIC_VAR)||LA12_0==BLOCK||LA12_0==CHAR_LITERAL||LA12_0==DIVIDE||(LA12_0 >= EQ && LA12_0 <= FALSE)||(LA12_0 >= FUNCTION && LA12_0 <= GT_EQ)||(LA12_0 >= LT && LA12_0 <= PRINT)||LA12_0==READ||(LA12_0 >= SIZEOF && LA12_0 <= STRING_LITERAL)||(LA12_0 >= TIMES && LA12_0 <= UNARY_PLUS)) ) {
				alt12=1;
			}
			else if ( (LA12_0==BECOMES) ) {
				alt12=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}

			switch (alt12) {
				case 1 :
					// antlr/NeptuneChecker.g:175:4: t= and_or_expr
					{
					pushFollow(FOLLOW_and_or_expr_in_assignment_expr489);
					t=and_or_expr();
					state._fsp--;

					type=t;
					}
					break;
				case 2 :
					// antlr/NeptuneChecker.g:176:4: ^( BECOMES x= variable_use expression )
					{
					match(input,BECOMES,FOLLOW_BECOMES_in_assignment_expr497); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_variable_use_in_assignment_expr501);
					x=variable_use();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_assignment_expr503);
					expression();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;

			}
		}

			catch(RecognitionException e){
				throw e;
			}

		finally {
			// do for sure before leaving
		}
		return type;
	}
	// $ANTLR end "assignment_expr"



	// $ANTLR start "and_or_expr"
	// antlr/NeptuneChecker.g:179:1: and_or_expr returns [Type type = new Type(Type.primitive.VOID) ] : (t= boolean_expr | ^( AND e1= expression e2= expression ) | ^( OR e1= expression e2= expression ) );
	public final Type and_or_expr() throws RecognitionException {
		Type type =  new Type(Type.primitive.VOID);


		Type t =null;
		Type e1 =null;
		Type e2 =null;

		try {
			// antlr/NeptuneChecker.g:180:2: (t= boolean_expr | ^( AND e1= expression e2= expression ) | ^( OR e1= expression e2= expression ) )
			int alt13=3;
			switch ( input.LA(1) ) {
			case ARRAY_SET:
			case ARRAY_VAR:
			case ATOMIC_VAR:
			case BLOCK:
			case CHAR_LITERAL:
			case DIVIDE:
			case EQ:
			case FALSE:
			case FUNCTION:
			case GT:
			case GT_EQ:
			case LT:
			case LT_EQ:
			case MINUS:
			case MOD:
			case NEGATE:
			case NEQ:
			case NUMBER:
			case PLUS:
			case PRINT:
			case READ:
			case SIZEOF:
			case STRING_LITERAL:
			case TIMES:
			case TRUE:
			case UNARY_MINUS:
			case UNARY_PLUS:
				{
				alt13=1;
				}
				break;
			case AND:
				{
				alt13=2;
				}
				break;
			case OR:
				{
				alt13=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}
			switch (alt13) {
				case 1 :
					// antlr/NeptuneChecker.g:180:4: t= boolean_expr
					{
					pushFollow(FOLLOW_boolean_expr_in_and_or_expr523);
					t=boolean_expr();
					state._fsp--;

					type = t;
					}
					break;
				case 2 :
					// antlr/NeptuneChecker.g:181:4: ^( AND e1= expression e2= expression )
					{
					match(input,AND,FOLLOW_AND_in_and_or_expr537); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_and_or_expr541);
					e1=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_and_or_expr545);
					e2=expression();
					state._fsp--;

					match(input, Token.UP, null); 


							type = new Type(Type.primitive.BOOLEAN);
							if(e1.isArray || e1.type != Type.primitive.BOOLEAN) {
								throw new NeptuneException("invalid left operand type for function &&");
							}
							if(e2.isArray || e2.type != Type.primitive.BOOLEAN) {
								throw new NeptuneException("invalid right operand type for function &&");
							}
						
					}
					break;
				case 3 :
					// antlr/NeptuneChecker.g:190:4: ^( OR e1= expression e2= expression )
					{
					match(input,OR,FOLLOW_OR_in_and_or_expr556); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_and_or_expr560);
					e1=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_and_or_expr564);
					e2=expression();
					state._fsp--;

					match(input, Token.UP, null); 


							type = new Type(Type.primitive.BOOLEAN);
							if(e1.isArray || e1.type != Type.primitive.BOOLEAN) {
								throw new NeptuneException("invalid left operand type for function ||");
							}
							if(e2.isArray || e2.type != Type.primitive.BOOLEAN) {
								throw new NeptuneException("invalid right operand type for function ||");
							}
						
					}
					break;

			}
		}

			catch(RecognitionException e){
				throw e;
			}

		finally {
			// do for sure before leaving
		}
		return type;
	}
	// $ANTLR end "and_or_expr"



	// $ANTLR start "boolean_expr"
	// antlr/NeptuneChecker.g:201:1: boolean_expr returns [Type type = new Type(Type.primitive.VOID) ] : (t= plus_expr | ^( LT e1= expression e2= expression ) | ^( LT_EQ e1= expression e2= expression ) | ^( GT e1= expression e2= expression ) | ^( GT_EQ e1= expression e2= expression ) | ^( EQ expression expression ) | ^( NEQ expression expression ) );
	public final Type boolean_expr() throws RecognitionException {
		Type type =  new Type(Type.primitive.VOID);


		Type t =null;
		Type e1 =null;
		Type e2 =null;

		try {
			// antlr/NeptuneChecker.g:202:2: (t= plus_expr | ^( LT e1= expression e2= expression ) | ^( LT_EQ e1= expression e2= expression ) | ^( GT e1= expression e2= expression ) | ^( GT_EQ e1= expression e2= expression ) | ^( EQ expression expression ) | ^( NEQ expression expression ) )
			int alt14=7;
			switch ( input.LA(1) ) {
			case ARRAY_SET:
			case ARRAY_VAR:
			case ATOMIC_VAR:
			case BLOCK:
			case CHAR_LITERAL:
			case DIVIDE:
			case FALSE:
			case FUNCTION:
			case MINUS:
			case MOD:
			case NEGATE:
			case NUMBER:
			case PLUS:
			case PRINT:
			case READ:
			case SIZEOF:
			case STRING_LITERAL:
			case TIMES:
			case TRUE:
			case UNARY_MINUS:
			case UNARY_PLUS:
				{
				alt14=1;
				}
				break;
			case LT:
				{
				alt14=2;
				}
				break;
			case LT_EQ:
				{
				alt14=3;
				}
				break;
			case GT:
				{
				alt14=4;
				}
				break;
			case GT_EQ:
				{
				alt14=5;
				}
				break;
			case EQ:
				{
				alt14=6;
				}
				break;
			case NEQ:
				{
				alt14=7;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				throw nvae;
			}
			switch (alt14) {
				case 1 :
					// antlr/NeptuneChecker.g:202:4: t= plus_expr
					{
					pushFollow(FOLLOW_plus_expr_in_boolean_expr586);
					t=plus_expr();
					state._fsp--;

					type = t;
					}
					break;
				case 2 :
					// antlr/NeptuneChecker.g:203:4: ^( LT e1= expression e2= expression )
					{
					match(input,LT,FOLLOW_LT_in_boolean_expr602); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_boolean_expr606);
					e1=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_boolean_expr610);
					e2=expression();
					state._fsp--;

					match(input, Token.UP, null); 


							checkBinaryOperator(e1, e2);
							type = new Type(Type.primitive.BOOLEAN);
						
					}
					break;
				case 3 :
					// antlr/NeptuneChecker.g:207:4: ^( LT_EQ e1= expression e2= expression )
					{
					match(input,LT_EQ,FOLLOW_LT_EQ_in_boolean_expr623); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_boolean_expr627);
					e1=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_boolean_expr631);
					e2=expression();
					state._fsp--;

					match(input, Token.UP, null); 


							checkBinaryOperator(e1, e2);
							type = new Type(Type.primitive.BOOLEAN);
						
					}
					break;
				case 4 :
					// antlr/NeptuneChecker.g:211:4: ^( GT e1= expression e2= expression )
					{
					match(input,GT,FOLLOW_GT_in_boolean_expr642); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_boolean_expr646);
					e1=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_boolean_expr650);
					e2=expression();
					state._fsp--;

					match(input, Token.UP, null); 


							checkBinaryOperator(e1, e2);
							type = new Type(Type.primitive.BOOLEAN);
						
					}
					break;
				case 5 :
					// antlr/NeptuneChecker.g:215:4: ^( GT_EQ e1= expression e2= expression )
					{
					match(input,GT_EQ,FOLLOW_GT_EQ_in_boolean_expr662); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_boolean_expr666);
					e1=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_boolean_expr670);
					e2=expression();
					state._fsp--;

					match(input, Token.UP, null); 


							checkBinaryOperator(e1, e2);
							type = new Type(Type.primitive.BOOLEAN);
						
					}
					break;
				case 6 :
					// antlr/NeptuneChecker.g:219:4: ^( EQ expression expression )
					{
					match(input,EQ,FOLLOW_EQ_in_boolean_expr681); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_boolean_expr683);
					expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_boolean_expr685);
					expression();
					state._fsp--;

					match(input, Token.UP, null); 

					type = new Type(Type.primitive.BOOLEAN);
					}
					break;
				case 7 :
					// antlr/NeptuneChecker.g:220:4: ^( NEQ expression expression )
					{
					match(input,NEQ,FOLLOW_NEQ_in_boolean_expr697); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_boolean_expr699);
					expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_boolean_expr701);
					expression();
					state._fsp--;

					match(input, Token.UP, null); 

					type = new Type(Type.primitive.BOOLEAN);
					}
					break;

			}
		}

			catch(RecognitionException e){
				throw e;
			}

		finally {
			// do for sure before leaving
		}
		return type;
	}
	// $ANTLR end "boolean_expr"



	// $ANTLR start "plus_expr"
	// antlr/NeptuneChecker.g:223:1: plus_expr returns [Type type = new Type(Type.primitive.VOID) ] : (t= multi_expr | ^( PLUS e1= expression e2= expression ) | ^( MINUS e1= expression e2= expression ) );
	public final Type plus_expr() throws RecognitionException {
		Type type =  new Type(Type.primitive.VOID);


		Type t =null;
		Type e1 =null;
		Type e2 =null;

		try {
			// antlr/NeptuneChecker.g:224:2: (t= multi_expr | ^( PLUS e1= expression e2= expression ) | ^( MINUS e1= expression e2= expression ) )
			int alt15=3;
			switch ( input.LA(1) ) {
			case ARRAY_SET:
			case ARRAY_VAR:
			case ATOMIC_VAR:
			case BLOCK:
			case CHAR_LITERAL:
			case DIVIDE:
			case FALSE:
			case FUNCTION:
			case MOD:
			case NEGATE:
			case NUMBER:
			case PRINT:
			case READ:
			case SIZEOF:
			case STRING_LITERAL:
			case TIMES:
			case TRUE:
			case UNARY_MINUS:
			case UNARY_PLUS:
				{
				alt15=1;
				}
				break;
			case PLUS:
				{
				alt15=2;
				}
				break;
			case MINUS:
				{
				alt15=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				throw nvae;
			}
			switch (alt15) {
				case 1 :
					// antlr/NeptuneChecker.g:224:4: t= multi_expr
					{
					pushFollow(FOLLOW_multi_expr_in_plus_expr724);
					t=multi_expr();
					state._fsp--;

					type=t;
					}
					break;
				case 2 :
					// antlr/NeptuneChecker.g:225:4: ^( PLUS e1= expression e2= expression )
					{
					match(input,PLUS,FOLLOW_PLUS_in_plus_expr738); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_plus_expr742);
					e1=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_plus_expr746);
					e2=expression();
					state._fsp--;

					match(input, Token.UP, null); 


							checkBinaryOperator(e1, e2);
							type = new Type(Type.primitive.INTEGER);
						
					}
					break;
				case 3 :
					// antlr/NeptuneChecker.g:229:4: ^( MINUS e1= expression e2= expression )
					{
					match(input,MINUS,FOLLOW_MINUS_in_plus_expr756); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_plus_expr760);
					e1=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_plus_expr764);
					e2=expression();
					state._fsp--;

					match(input, Token.UP, null); 


							checkBinaryOperator(e1, e2);
							type = new Type(Type.primitive.INTEGER);
						
					}
					break;

			}
		}

			catch(RecognitionException e){
				throw e;
			}

		finally {
			// do for sure before leaving
		}
		return type;
	}
	// $ANTLR end "plus_expr"



	// $ANTLR start "multi_expr"
	// antlr/NeptuneChecker.g:235:1: multi_expr returns [Type type = new Type(Type.primitive.VOID) ] : (t= unary_expr | ^( TIMES e1= expression e2= expression ) | ^( DIVIDE e1= expression e2= expression ) | ^( MOD e1= expression e2= expression ) );
	public final Type multi_expr() throws RecognitionException {
		Type type =  new Type(Type.primitive.VOID);


		Type t =null;
		Type e1 =null;
		Type e2 =null;

		try {
			// antlr/NeptuneChecker.g:236:2: (t= unary_expr | ^( TIMES e1= expression e2= expression ) | ^( DIVIDE e1= expression e2= expression ) | ^( MOD e1= expression e2= expression ) )
			int alt16=4;
			switch ( input.LA(1) ) {
			case ARRAY_SET:
			case ARRAY_VAR:
			case ATOMIC_VAR:
			case BLOCK:
			case CHAR_LITERAL:
			case FALSE:
			case FUNCTION:
			case NEGATE:
			case NUMBER:
			case PRINT:
			case READ:
			case SIZEOF:
			case STRING_LITERAL:
			case TRUE:
			case UNARY_MINUS:
			case UNARY_PLUS:
				{
				alt16=1;
				}
				break;
			case TIMES:
				{
				alt16=2;
				}
				break;
			case DIVIDE:
				{
				alt16=3;
				}
				break;
			case MOD:
				{
				alt16=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				throw nvae;
			}
			switch (alt16) {
				case 1 :
					// antlr/NeptuneChecker.g:236:4: t= unary_expr
					{
					pushFollow(FOLLOW_unary_expr_in_multi_expr785);
					t=unary_expr();
					state._fsp--;

					type=t;
					}
					break;
				case 2 :
					// antlr/NeptuneChecker.g:237:4: ^( TIMES e1= expression e2= expression )
					{
					match(input,TIMES,FOLLOW_TIMES_in_multi_expr798); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_multi_expr802);
					e1=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_multi_expr806);
					e2=expression();
					state._fsp--;

					match(input, Token.UP, null); 


							checkBinaryOperator(e1, e2);
							type = new Type(Type.primitive.INTEGER);
					}
					break;
				case 3 :
					// antlr/NeptuneChecker.g:240:4: ^( DIVIDE e1= expression e2= expression )
					{
					match(input,DIVIDE,FOLLOW_DIVIDE_in_multi_expr815); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_multi_expr819);
					e1=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_multi_expr823);
					e2=expression();
					state._fsp--;

					match(input, Token.UP, null); 


							type = new Type(Type.primitive.INTEGER);
							checkBinaryOperator(e1, e2);
						
					}
					break;
				case 4 :
					// antlr/NeptuneChecker.g:244:4: ^( MOD e1= expression e2= expression )
					{
					match(input,MOD,FOLLOW_MOD_in_multi_expr832); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_multi_expr836);
					e1=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_multi_expr840);
					e2=expression();
					state._fsp--;

					match(input, Token.UP, null); 


							checkBinaryOperator(e1, e2);
							type = new Type(Type.primitive.INTEGER);
						
					}
					break;

			}
		}

			catch(RecognitionException e){
				throw e;
			}

		finally {
			// do for sure before leaving
		}
		return type;
	}
	// $ANTLR end "multi_expr"



	// $ANTLR start "unary_expr"
	// antlr/NeptuneChecker.g:250:1: unary_expr returns [Type type = new Type(Type.primitive.VOID) ] : (t= operand | ^( UNARY_MINUS o= expression ) | ^( UNARY_PLUS o= expression ) | ^( NEGATE o= expression ) );
	public final Type unary_expr() throws RecognitionException {
		Type type =  new Type(Type.primitive.VOID);


		Type t =null;
		Type o =null;

		try {
			// antlr/NeptuneChecker.g:251:2: (t= operand | ^( UNARY_MINUS o= expression ) | ^( UNARY_PLUS o= expression ) | ^( NEGATE o= expression ) )
			int alt17=4;
			switch ( input.LA(1) ) {
			case ARRAY_SET:
			case ARRAY_VAR:
			case ATOMIC_VAR:
			case BLOCK:
			case CHAR_LITERAL:
			case FALSE:
			case FUNCTION:
			case NUMBER:
			case PRINT:
			case READ:
			case SIZEOF:
			case STRING_LITERAL:
			case TRUE:
				{
				alt17=1;
				}
				break;
			case UNARY_MINUS:
				{
				alt17=2;
				}
				break;
			case UNARY_PLUS:
				{
				alt17=3;
				}
				break;
			case NEGATE:
				{
				alt17=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 17, 0, input);
				throw nvae;
			}
			switch (alt17) {
				case 1 :
					// antlr/NeptuneChecker.g:251:4: t= operand
					{
					pushFollow(FOLLOW_operand_in_unary_expr862);
					t=operand();
					state._fsp--;

					type = t;
					}
					break;
				case 2 :
					// antlr/NeptuneChecker.g:252:4: ^( UNARY_MINUS o= expression )
					{
					match(input,UNARY_MINUS,FOLLOW_UNARY_MINUS_in_unary_expr877); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_unary_expr881);
					o=expression();
					state._fsp--;

					match(input, Token.UP, null); 


							if(o.type != Type.primitive.INTEGER || o.isArray) {
								throw new NeptuneException("invalid operand for unary -");
							}

							type = o;
						
					}
					break;
				case 3 :
					// antlr/NeptuneChecker.g:259:4: ^( UNARY_PLUS o= expression )
					{
					match(input,UNARY_PLUS,FOLLOW_UNARY_PLUS_in_unary_expr890); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_unary_expr894);
					o=expression();
					state._fsp--;

					match(input, Token.UP, null); 


							if(o.type != Type.primitive.INTEGER || o.isArray) {
								throw new NeptuneException("invalid operand for unary +");
							}

							type = o;
						
					}
					break;
				case 4 :
					// antlr/NeptuneChecker.g:266:4: ^( NEGATE o= expression )
					{
					match(input,NEGATE,FOLLOW_NEGATE_in_unary_expr903); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_unary_expr907);
					o=expression();
					state._fsp--;

					match(input, Token.UP, null); 


							if(o.type != Type.primitive.BOOLEAN || o.isArray) {
								throw new NeptuneException("invalid operand for unary !");
							}

							type = o;
						
					}
					break;

			}
		}

			catch(RecognitionException e){
				throw e;
			}

		finally {
			// do for sure before leaving
		}
		return type;
	}
	// $ANTLR end "unary_expr"



	// $ANTLR start "operand"
	// antlr/NeptuneChecker.g:275:1: operand returns [Type type=new Type(Type.primitive.VOID) ] : ( ^( FUNCTION IDENTIFIER ^( ARRAY_SET ( expression )+ ) ) |v= variable_expression | NUMBER | ^( ARRAY_SET (t= expression )+ ) | TRUE | FALSE | CHAR_LITERAL |str= STRING_LITERAL |t= codeblock |t= print_statement |t= read_statement | ^( SIZEOF id= IDENTIFIER ) );
	public final Type operand() throws RecognitionException {
		Type type = new Type(Type.primitive.VOID);


		CommonTree str=null;
		CommonTree id=null;
		Variable v =null;
		Type t =null;

		try {
			// antlr/NeptuneChecker.g:276:2: ( ^( FUNCTION IDENTIFIER ^( ARRAY_SET ( expression )+ ) ) |v= variable_expression | NUMBER | ^( ARRAY_SET (t= expression )+ ) | TRUE | FALSE | CHAR_LITERAL |str= STRING_LITERAL |t= codeblock |t= print_statement |t= read_statement | ^( SIZEOF id= IDENTIFIER ) )
			int alt20=12;
			switch ( input.LA(1) ) {
			case FUNCTION:
				{
				alt20=1;
				}
				break;
			case ARRAY_VAR:
			case ATOMIC_VAR:
				{
				alt20=2;
				}
				break;
			case NUMBER:
				{
				alt20=3;
				}
				break;
			case ARRAY_SET:
				{
				alt20=4;
				}
				break;
			case TRUE:
				{
				alt20=5;
				}
				break;
			case FALSE:
				{
				alt20=6;
				}
				break;
			case CHAR_LITERAL:
				{
				alt20=7;
				}
				break;
			case STRING_LITERAL:
				{
				alt20=8;
				}
				break;
			case BLOCK:
				{
				alt20=9;
				}
				break;
			case PRINT:
				{
				alt20=10;
				}
				break;
			case READ:
				{
				alt20=11;
				}
				break;
			case SIZEOF:
				{
				alt20=12;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 20, 0, input);
				throw nvae;
			}
			switch (alt20) {
				case 1 :
					// antlr/NeptuneChecker.g:276:4: ^( FUNCTION IDENTIFIER ^( ARRAY_SET ( expression )+ ) )
					{
					match(input,FUNCTION,FOLLOW_FUNCTION_in_operand926); 
					match(input, Token.DOWN, null); 
					match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_operand928); 
					match(input,ARRAY_SET,FOLLOW_ARRAY_SET_in_operand931); 
					match(input, Token.DOWN, null); 
					// antlr/NeptuneChecker.g:276:38: ( expression )+
					int cnt18=0;
					loop18:
					while (true) {
						int alt18=2;
						int LA18_0 = input.LA(1);
						if ( (LA18_0==AND||(LA18_0 >= ARRAY_SET && LA18_0 <= BLOCK)||LA18_0==CHAR_LITERAL||LA18_0==DIVIDE||(LA18_0 >= EQ && LA18_0 <= FALSE)||(LA18_0 >= FUNCTION && LA18_0 <= GT_EQ)||(LA18_0 >= LT && LA18_0 <= PRINT)||LA18_0==READ||(LA18_0 >= SIZEOF && LA18_0 <= STRING_LITERAL)||(LA18_0 >= TIMES && LA18_0 <= UNARY_PLUS)) ) {
							alt18=1;
						}

						switch (alt18) {
						case 1 :
							// antlr/NeptuneChecker.g:276:38: expression
							{
							pushFollow(FOLLOW_expression_in_operand933);
							expression();
							state._fsp--;

							}
							break;

						default :
							if ( cnt18 >= 1 ) break loop18;
							EarlyExitException eee = new EarlyExitException(18, input);
							throw eee;
						}
						cnt18++;
					}

					match(input, Token.UP, null); 

					match(input, Token.UP, null); 

					}
					break;
				case 2 :
					// antlr/NeptuneChecker.g:277:4: v= variable_expression
					{
					pushFollow(FOLLOW_variable_expression_in_operand943);
					v=variable_expression();
					state._fsp--;

					type = v.type;
					}
					break;
				case 3 :
					// antlr/NeptuneChecker.g:278:4: NUMBER
					{
					match(input,NUMBER,FOLLOW_NUMBER_in_operand952); 
					type = new Type(Type.primitive.INTEGER);
					}
					break;
				case 4 :
					// antlr/NeptuneChecker.g:279:4: ^( ARRAY_SET (t= expression )+ )
					{
					int numElements = 0; 
					match(input,ARRAY_SET,FOLLOW_ARRAY_SET_in_operand968); 
					match(input, Token.DOWN, null); 
					// antlr/NeptuneChecker.g:279:40: (t= expression )+
					int cnt19=0;
					loop19:
					while (true) {
						int alt19=2;
						int LA19_0 = input.LA(1);
						if ( (LA19_0==AND||(LA19_0 >= ARRAY_SET && LA19_0 <= BLOCK)||LA19_0==CHAR_LITERAL||LA19_0==DIVIDE||(LA19_0 >= EQ && LA19_0 <= FALSE)||(LA19_0 >= FUNCTION && LA19_0 <= GT_EQ)||(LA19_0 >= LT && LA19_0 <= PRINT)||LA19_0==READ||(LA19_0 >= SIZEOF && LA19_0 <= STRING_LITERAL)||(LA19_0 >= TIMES && LA19_0 <= UNARY_PLUS)) ) {
							alt19=1;
						}

						switch (alt19) {
						case 1 :
							// antlr/NeptuneChecker.g:279:41: t= expression
							{
							pushFollow(FOLLOW_expression_in_operand973);
							t=expression();
							state._fsp--;

							type = t; numElements++; 
							}
							break;

						default :
							if ( cnt19 >= 1 ) break loop19;
							EarlyExitException eee = new EarlyExitException(19, input);
							throw eee;
						}
						cnt19++;
					}

					match(input, Token.UP, null); 

					 type.elemCount = numElements; type.isArray = true; 
					}
					break;
				case 5 :
					// antlr/NeptuneChecker.g:280:4: TRUE
					{
					match(input,TRUE,FOLLOW_TRUE_in_operand984); 
					type = new Type(Type.primitive.BOOLEAN);
					}
					break;
				case 6 :
					// antlr/NeptuneChecker.g:281:4: FALSE
					{
					match(input,FALSE,FOLLOW_FALSE_in_operand998); 
					type = new Type(Type.primitive.BOOLEAN);
					}
					break;
				case 7 :
					// antlr/NeptuneChecker.g:282:4: CHAR_LITERAL
					{
					match(input,CHAR_LITERAL,FOLLOW_CHAR_LITERAL_in_operand1011); 
					type = new Type(Type.primitive.CHAR);
					}
					break;
				case 8 :
					// antlr/NeptuneChecker.g:283:4: str= STRING_LITERAL
					{
					str=(CommonTree)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_operand1025); 

							type = new Type(Type.primitive.CHAR, 0);
							type.isArray = true;
							type.elemCount = (str!=null?str.getText():null).length()-2;
						
					}
					break;
				case 9 :
					// antlr/NeptuneChecker.g:288:4: t= codeblock
					{
					pushFollow(FOLLOW_codeblock_in_operand1036);
					t=codeblock();
					state._fsp--;

					type = t;
					}
					break;
				case 10 :
					// antlr/NeptuneChecker.g:289:4: t= print_statement
					{
					pushFollow(FOLLOW_print_statement_in_operand1055);
					t=print_statement();
					state._fsp--;

					type = t;
					}
					break;
				case 11 :
					// antlr/NeptuneChecker.g:290:4: t= read_statement
					{
					pushFollow(FOLLOW_read_statement_in_operand1067);
					t=read_statement();
					state._fsp--;

					type = t;
					}
					break;
				case 12 :
					// antlr/NeptuneChecker.g:291:4: ^( SIZEOF id= IDENTIFIER )
					{
					match(input,SIZEOF,FOLLOW_SIZEOF_in_operand1078); 
					match(input, Token.DOWN, null); 
					id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_operand1082); 
					match(input, Token.UP, null); 


							type = new Type(Type.primitive.INTEGER);
							IdEntry entry = symtab.retrieve((id!=null?id.getText():null));
							if(!entry.getType().isArray) {
								throw new NeptuneException(id,"not an array, invalid use of sizeof function");
							}
						
					}
					break;

			}
		}

			catch(RecognitionException e){
				throw e;
			}

		finally {
			// do for sure before leaving
		}
		return type;
	}
	// $ANTLR end "operand"



	// $ANTLR start "variable_expression"
	// antlr/NeptuneChecker.g:300:1: variable_expression returns [Variable result = new Variable() ] : ( ^( ATOMIC_VAR x= IDENTIFIER ) | ^( ARRAY_VAR x= IDENTIFIER ex= expression ) );
	public final Variable variable_expression() throws RecognitionException {
		Variable result =  new Variable();


		CommonTree x=null;
		Type ex =null;

		try {
			// antlr/NeptuneChecker.g:301:2: ( ^( ATOMIC_VAR x= IDENTIFIER ) | ^( ARRAY_VAR x= IDENTIFIER ex= expression ) )
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0==ATOMIC_VAR) ) {
				alt21=1;
			}
			else if ( (LA21_0==ARRAY_VAR) ) {
				alt21=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 21, 0, input);
				throw nvae;
			}

			switch (alt21) {
				case 1 :
					// antlr/NeptuneChecker.g:301:4: ^( ATOMIC_VAR x= IDENTIFIER )
					{
					match(input,ATOMIC_VAR,FOLLOW_ATOMIC_VAR_in_variable_expression1102); 
					match(input, Token.DOWN, null); 
					x=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_variable_expression1106); 
					match(input, Token.UP, null); 


							if(!isDeclared((x!=null?x.getText():null))){
								throw new NeptuneException(x,"is not declared");
							}
							result.type = symtab.retrieve((x!=null?x.getText():null)).getType();
						
					}
					break;
				case 2 :
					// antlr/NeptuneChecker.g:307:4: ^( ARRAY_VAR x= IDENTIFIER ex= expression )
					{
					match(input,ARRAY_VAR,FOLLOW_ARRAY_VAR_in_variable_expression1117); 
					match(input, Token.DOWN, null); 
					x=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_variable_expression1121); 
					pushFollow(FOLLOW_expression_in_variable_expression1125);
					ex=expression();
					state._fsp--;

					match(input, Token.UP, null); 


							if(!isDeclared((x!=null?x.getText():null))){
								throw new NeptuneException(x,"is not declared");
							}
							
							result.type = symtab.retrieve((x!=null?x.getText():null)).getType();
							
							if(!result.type.isArray) {
								throw new NeptuneException(x,"is not an array");
							}
							
							if(ex.isArray) {
								throw new NeptuneException(x,"cannot have array as index into array");
							}
							
							if(ex.type != Type.primitive.INTEGER) {
								throw new NeptuneException(x,"index into array must be integer");
							}
							
							Type newType = new Type(result.type.type);
							result.type = newType;
							result.isIndexIntoArray = true;
						
					}
					break;

			}
		}

			catch(RecognitionException e){
				throw e;
			}

		finally {
			// do for sure before leaving
		}
		return result;
	}
	// $ANTLR end "variable_expression"



	// $ANTLR start "variable_use"
	// antlr/NeptuneChecker.g:332:1: variable_use returns [Variable result = new Variable() ] : ( ^( ATOMIC_VAR x= IDENTIFIER ) | ^( ARRAY_VAR x= IDENTIFIER ex= expression ) );
	public final Variable variable_use() throws RecognitionException {
		Variable result =  new Variable();


		CommonTree x=null;
		Type ex =null;

		try {
			// antlr/NeptuneChecker.g:333:2: ( ^( ATOMIC_VAR x= IDENTIFIER ) | ^( ARRAY_VAR x= IDENTIFIER ex= expression ) )
			int alt22=2;
			int LA22_0 = input.LA(1);
			if ( (LA22_0==ATOMIC_VAR) ) {
				alt22=1;
			}
			else if ( (LA22_0==ARRAY_VAR) ) {
				alt22=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 22, 0, input);
				throw nvae;
			}

			switch (alt22) {
				case 1 :
					// antlr/NeptuneChecker.g:333:4: ^( ATOMIC_VAR x= IDENTIFIER )
					{
					match(input,ATOMIC_VAR,FOLLOW_ATOMIC_VAR_in_variable_use1145); 
					match(input, Token.DOWN, null); 
					x=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_variable_use1149); 
					match(input, Token.UP, null); 


							if(!isDeclared((x!=null?x.getText():null))){
								throw new NeptuneException(x,"is not declared");
							}
							result.type = symtab.retrieve((x!=null?x.getText():null)).getType();
						
					}
					break;
				case 2 :
					// antlr/NeptuneChecker.g:339:4: ^( ARRAY_VAR x= IDENTIFIER ex= expression )
					{
					match(input,ARRAY_VAR,FOLLOW_ARRAY_VAR_in_variable_use1160); 
					match(input, Token.DOWN, null); 
					x=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_variable_use1164); 
					pushFollow(FOLLOW_expression_in_variable_use1168);
					ex=expression();
					state._fsp--;

					match(input, Token.UP, null); 


							if(!isDeclared((x!=null?x.getText():null))){
								throw new NeptuneException(x,"is not declared");
							}
							result.type = symtab.retrieve((x!=null?x.getText():null)).getType();
							
							if(!result.type.isArray) {
								throw new NeptuneException(x,"is not an array");
							}
							
							if(ex.isArray) {
								throw new NeptuneException(x,"cannot have array as index into array");
							}
							
							if(ex.type != Type.primitive.INTEGER) {
								throw new NeptuneException(x,"index into array must be integer");
							}
							
							Type newType = new Type(result.type.type);
							result.type = newType;
							result.isIndexIntoArray = true;
						
					}
					break;

			}
		}

			catch(RecognitionException e){
				throw e;
			}

		finally {
			// do for sure before leaving
		}
		return result;
	}
	// $ANTLR end "variable_use"



	// $ANTLR start "type"
	// antlr/NeptuneChecker.g:363:1: type returns [Type type = new Type(Type.primitive.VOID) ] : ( INTEGER (count= array_def )? | CHAR (count= array_def )? | BOOLEAN (count= array_def )? );
	public final Type type() throws RecognitionException {
		Type type =  new Type(Type.primitive.VOID);


		int count =0;

		try {
			// antlr/NeptuneChecker.g:364:2: ( INTEGER (count= array_def )? | CHAR (count= array_def )? | BOOLEAN (count= array_def )? )
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
					// antlr/NeptuneChecker.g:364:4: INTEGER (count= array_def )?
					{
					match(input,INTEGER,FOLLOW_INTEGER_in_type1186); 
					// antlr/NeptuneChecker.g:364:17: (count= array_def )?
					int alt23=2;
					int LA23_0 = input.LA(1);
					if ( (LA23_0==ARRAY_DEF) ) {
						alt23=1;
					}
					switch (alt23) {
						case 1 :
							// antlr/NeptuneChecker.g:364:17: count= array_def
							{
							pushFollow(FOLLOW_array_def_in_type1190);
							count=array_def();
							state._fsp--;

							}
							break;

					}


							if(count > 0){
								type = new Type(Type.primitive.INTEGER, count);
							}else{
								type = new Type(Type.primitive.INTEGER);
							}
					}
					break;
				case 2 :
					// antlr/NeptuneChecker.g:370:4: CHAR (count= array_def )?
					{
					match(input,CHAR,FOLLOW_CHAR_in_type1198); 
					// antlr/NeptuneChecker.g:370:14: (count= array_def )?
					int alt24=2;
					int LA24_0 = input.LA(1);
					if ( (LA24_0==ARRAY_DEF) ) {
						alt24=1;
					}
					switch (alt24) {
						case 1 :
							// antlr/NeptuneChecker.g:370:14: count= array_def
							{
							pushFollow(FOLLOW_array_def_in_type1202);
							count=array_def();
							state._fsp--;

							}
							break;

					}


							if(count > 0){
								type = new Type(Type.primitive.CHAR, count);
							}else{
								type = new Type(Type.primitive.CHAR);
							}
					}
					break;
				case 3 :
					// antlr/NeptuneChecker.g:376:4: BOOLEAN (count= array_def )?
					{
					match(input,BOOLEAN,FOLLOW_BOOLEAN_in_type1210); 
					// antlr/NeptuneChecker.g:376:17: (count= array_def )?
					int alt25=2;
					int LA25_0 = input.LA(1);
					if ( (LA25_0==ARRAY_DEF) ) {
						alt25=1;
					}
					switch (alt25) {
						case 1 :
							// antlr/NeptuneChecker.g:376:17: count= array_def
							{
							pushFollow(FOLLOW_array_def_in_type1214);
							count=array_def();
							state._fsp--;

							}
							break;

					}


							if(count > 0){
								type = new Type(Type.primitive.BOOLEAN, count);
							}else{
								type = new Type(Type.primitive.BOOLEAN);
							}
					}
					break;

			}
		}

			catch(RecognitionException e){
				throw e;
			}

		finally {
			// do for sure before leaving
		}
		return type;
	}
	// $ANTLR end "type"



	// $ANTLR start "array_def"
	// antlr/NeptuneChecker.g:384:1: array_def returns [int count = 0] : ^( ARRAY_DEF x= NUMBER ) ;
	public final int array_def() throws RecognitionException {
		int count =  0;


		CommonTree x=null;

		try {
			// antlr/NeptuneChecker.g:385:2: ( ^( ARRAY_DEF x= NUMBER ) )
			// antlr/NeptuneChecker.g:385:4: ^( ARRAY_DEF x= NUMBER )
			{
			match(input,ARRAY_DEF,FOLLOW_ARRAY_DEF_in_array_def1233); 
			match(input, Token.DOWN, null); 
			x=(CommonTree)match(input,NUMBER,FOLLOW_NUMBER_in_array_def1237); 
			match(input, Token.UP, null); 

			 count = Integer.parseInt((x!=null?x.getText():null)); 
			}

		}

			catch(RecognitionException e){
				throw e;
			}

		finally {
			// do for sure before leaving
		}
		return count;
	}
	// $ANTLR end "array_def"

	// Delegated rules



	public static final BitSet FOLLOW_PROGRAM_in_program47 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_lines_in_program51 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_line_in_lines70 = new BitSet(new long[]{0xEC43FF017E0A27D2L,0x000000000000000DL});
	public static final BitSet FOLLOW_expression_in_line90 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declaration_in_line97 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_logic_statement_in_line104 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BLOCK_in_codeblock122 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_lines_in_codeblock126 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_while_statement_in_logic_statement140 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_foreach_statement_in_logic_statement145 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_if_statement_in_logic_statement150 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHILE_in_while_statement162 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_while_statement164 = new BitSet(new long[]{0xEC43FF017E0A27D0L,0x000000000000000DL});
	public static final BitSet FOLLOW_lines_in_while_statement168 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FOREACH_in_foreach_statement183 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_foreach_statement187 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_foreach_statement193 = new BitSet(new long[]{0xEC43FF017E0A27D0L,0x000000000000000DL});
	public static final BitSet FOLLOW_lines_in_foreach_statement197 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_IF_in_if_statement213 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_if_statement215 = new BitSet(new long[]{0xEC43FF017E0A27D0L,0x000000000000000DL});
	public static final BitSet FOLLOW_lines_in_if_statement219 = new BitSet(new long[]{0x0000000001800008L});
	public static final BitSet FOLLOW_ELSIF_in_if_statement226 = new BitSet(new long[]{0xEC43FF00760827D0L,0x0000000000000001L});
	public static final BitSet FOLLOW_expression_in_if_statement228 = new BitSet(new long[]{0xEC43FF017E0A27D0L,0x000000000000000DL});
	public static final BitSet FOLLOW_lines_in_if_statement232 = new BitSet(new long[]{0x0000000001800008L});
	public static final BitSet FOLLOW_ELSE_in_if_statement242 = new BitSet(new long[]{0xEC43FF017E0A27D0L,0x000000000000000DL});
	public static final BitSet FOLLOW_lines_in_if_statement246 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PRINT_in_print_statement272 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_print_statement276 = new BitSet(new long[]{0x0000000000008008L});
	public static final BitSet FOLLOW_COMMA_in_print_statement279 = new BitSet(new long[]{0xEC43FF00760827D0L,0x0000000000000001L});
	public static final BitSet FOLLOW_expression_in_print_statement281 = new BitSet(new long[]{0x0000000000008008L});
	public static final BitSet FOLLOW_READ_in_read_statement308 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_read_statement313 = new BitSet(new long[]{0x0000000000008008L});
	public static final BitSet FOLLOW_COMMA_in_read_statement319 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_read_statement323 = new BitSet(new long[]{0x0000000000008008L});
	public static final BitSet FOLLOW_VAR_in_declaration342 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_type_in_declaration346 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_declaration350 = new BitSet(new long[]{0x0000000000000208L});
	public static final BitSet FOLLOW_BECOMES_in_declaration353 = new BitSet(new long[]{0xEC43FF00760827D0L,0x0000000000000001L});
	public static final BitSet FOLLOW_expression_in_declaration357 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_CONST_in_declaration370 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_type_in_declaration374 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_declaration378 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_BECOMES_in_declaration380 = new BitSet(new long[]{0xEC43FF00760827D0L,0x0000000000000001L});
	public static final BitSet FOLLOW_expression_in_declaration384 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNCTION_in_declaration393 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_type_in_declaration397 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_declaration401 = new BitSet(new long[]{0x0000000400001800L});
	public static final BitSet FOLLOW_type_in_declaration412 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_declaration416 = new BitSet(new long[]{0xECC3FF057E0A3FD0L,0x000000000000000DL});
	public static final BitSet FOLLOW_line_in_declaration422 = new BitSet(new long[]{0xECC3FF017E0A27D0L,0x000000000000000DL});
	public static final BitSet FOLLOW_return_statement_in_declaration427 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_RETURN_in_return_statement447 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_return_statement451 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_assignment_expr_in_expression470 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_and_or_expr_in_assignment_expr489 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BECOMES_in_assignment_expr497 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_variable_use_in_assignment_expr501 = new BitSet(new long[]{0xEC43FF00760827D0L,0x0000000000000001L});
	public static final BitSet FOLLOW_expression_in_assignment_expr503 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_boolean_expr_in_and_or_expr523 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AND_in_and_or_expr537 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_and_or_expr541 = new BitSet(new long[]{0xEC43FF00760827D0L,0x0000000000000001L});
	public static final BitSet FOLLOW_expression_in_and_or_expr545 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_OR_in_and_or_expr556 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_and_or_expr560 = new BitSet(new long[]{0xEC43FF00760827D0L,0x0000000000000001L});
	public static final BitSet FOLLOW_expression_in_and_or_expr564 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_plus_expr_in_boolean_expr586 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LT_in_boolean_expr602 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_boolean_expr606 = new BitSet(new long[]{0xEC43FF00760827D0L,0x0000000000000001L});
	public static final BitSet FOLLOW_expression_in_boolean_expr610 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LT_EQ_in_boolean_expr623 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_boolean_expr627 = new BitSet(new long[]{0xEC43FF00760827D0L,0x0000000000000001L});
	public static final BitSet FOLLOW_expression_in_boolean_expr631 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_GT_in_boolean_expr642 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_boolean_expr646 = new BitSet(new long[]{0xEC43FF00760827D0L,0x0000000000000001L});
	public static final BitSet FOLLOW_expression_in_boolean_expr650 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_GT_EQ_in_boolean_expr662 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_boolean_expr666 = new BitSet(new long[]{0xEC43FF00760827D0L,0x0000000000000001L});
	public static final BitSet FOLLOW_expression_in_boolean_expr670 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_EQ_in_boolean_expr681 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_boolean_expr683 = new BitSet(new long[]{0xEC43FF00760827D0L,0x0000000000000001L});
	public static final BitSet FOLLOW_expression_in_boolean_expr685 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NEQ_in_boolean_expr697 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_boolean_expr699 = new BitSet(new long[]{0xEC43FF00760827D0L,0x0000000000000001L});
	public static final BitSet FOLLOW_expression_in_boolean_expr701 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_multi_expr_in_plus_expr724 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PLUS_in_plus_expr738 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_plus_expr742 = new BitSet(new long[]{0xEC43FF00760827D0L,0x0000000000000001L});
	public static final BitSet FOLLOW_expression_in_plus_expr746 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MINUS_in_plus_expr756 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_plus_expr760 = new BitSet(new long[]{0xEC43FF00760827D0L,0x0000000000000001L});
	public static final BitSet FOLLOW_expression_in_plus_expr764 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_unary_expr_in_multi_expr785 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIMES_in_multi_expr798 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_multi_expr802 = new BitSet(new long[]{0xEC43FF00760827D0L,0x0000000000000001L});
	public static final BitSet FOLLOW_expression_in_multi_expr806 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DIVIDE_in_multi_expr815 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_multi_expr819 = new BitSet(new long[]{0xEC43FF00760827D0L,0x0000000000000001L});
	public static final BitSet FOLLOW_expression_in_multi_expr823 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MOD_in_multi_expr832 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_multi_expr836 = new BitSet(new long[]{0xEC43FF00760827D0L,0x0000000000000001L});
	public static final BitSet FOLLOW_expression_in_multi_expr840 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_operand_in_unary_expr862 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_UNARY_MINUS_in_unary_expr877 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_unary_expr881 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_UNARY_PLUS_in_unary_expr890 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_unary_expr894 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NEGATE_in_unary_expr903 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_unary_expr907 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNCTION_in_operand926 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_operand928 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_ARRAY_SET_in_operand931 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_operand933 = new BitSet(new long[]{0xEC43FF00760827D8L,0x0000000000000001L});
	public static final BitSet FOLLOW_variable_expression_in_operand943 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMBER_in_operand952 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ARRAY_SET_in_operand968 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_operand973 = new BitSet(new long[]{0xEC43FF00760827D8L,0x0000000000000001L});
	public static final BitSet FOLLOW_TRUE_in_operand984 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FALSE_in_operand998 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_LITERAL_in_operand1011 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_operand1025 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_codeblock_in_operand1036 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_print_statement_in_operand1055 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_read_statement_in_operand1067 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SIZEOF_in_operand1078 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_operand1082 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ATOMIC_VAR_in_variable_expression1102 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_variable_expression1106 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ARRAY_VAR_in_variable_expression1117 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_variable_expression1121 = new BitSet(new long[]{0xEC43FF00760827D0L,0x0000000000000001L});
	public static final BitSet FOLLOW_expression_in_variable_expression1125 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ATOMIC_VAR_in_variable_use1145 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_variable_use1149 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ARRAY_VAR_in_variable_use1160 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_variable_use1164 = new BitSet(new long[]{0xEC43FF00760827D0L,0x0000000000000001L});
	public static final BitSet FOLLOW_expression_in_variable_use1168 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_INTEGER_in_type1186 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_array_def_in_type1190 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_in_type1198 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_array_def_in_type1202 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOLEAN_in_type1210 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_array_def_in_type1214 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ARRAY_DEF_in_array_def1233 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_NUMBER_in_array_def1237 = new BitSet(new long[]{0x0000000000000008L});
}

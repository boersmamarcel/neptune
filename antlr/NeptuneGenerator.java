// $ANTLR 3.5.2 antlr/NeptuneGenerator.g 2014-06-29 16:05:41

	package neptune;
	
	import neptune.assembly.*;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class NeptuneGenerator extends TreeParser {
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
	public TreeParser[] getDelegates() {
		return new TreeParser[] {};
	}

	// delegators


	public NeptuneGenerator(TreeNodeStream input) {
		this(input, new RecognizerSharedState());
	}
	public NeptuneGenerator(TreeNodeStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return NeptuneGenerator.tokenNames; }
	@Override public String getGrammarFileName() { return "antlr/NeptuneGenerator.g"; }


		protected SymbolTable symtab = new SymbolTable();
		public void declare(String s, Type type) throws NeptuneException {
				try {
					symtab.enter(s, new IdEntry(0, type));
				} catch (SymbolTableException e) {
					throw new NeptuneException(e.getMessage());
				}
		}

		protected Program program = new Program();
		
		protected void addTextualInstruction(String code, boolean produces, boolean uses) {
			program.add(new Instruction(code, produces, uses));
		}
		
		protected void addInstruction(Instruction instruction) {
			program.add(instruction);
		}
		
		protected int labelCounter = 0;




	// $ANTLR start "program"
	// antlr/NeptuneGenerator.g:45:1: program : ^( PROGRAM lines ) ;
	public final void program() throws RecognitionException {
		try {
			// antlr/NeptuneGenerator.g:46:2: ( ^( PROGRAM lines ) )
			// antlr/NeptuneGenerator.g:46:4: ^( PROGRAM lines )
			{
			match(input,PROGRAM,FOLLOW_PROGRAM_in_program47); 
			symtab.openScope();
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_lines_in_program51);
			lines();
			state._fsp--;

			match(input, Token.UP, null); 

			symtab.closeScope(); program.assemble(symtab.getLargestSize()); 
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
	// antlr/NeptuneGenerator.g:49:1: lines returns [ Type type = null] : (t= line )+ ;
	public final Type lines() throws RecognitionException {
		Type type =  null;


		Type t =null;

		try {
			// antlr/NeptuneGenerator.g:50:2: ( (t= line )+ )
			// antlr/NeptuneGenerator.g:50:4: (t= line )+
			{
			// antlr/NeptuneGenerator.g:50:5: (t= line )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==AND||(LA1_0 >= ARRAY_SET && LA1_0 <= BLOCK)||LA1_0==CHAR_LITERAL||LA1_0==CONST||LA1_0==DIVIDE||(LA1_0 >= EQ && LA1_0 <= FOREACH)||(LA1_0 >= GT && LA1_0 <= IF)||(LA1_0 >= LT && LA1_0 <= PRINT)||LA1_0==READ||LA1_0==STRING_LITERAL||(LA1_0 >= TIMES && LA1_0 <= TRUE)||(LA1_0 >= VAR && LA1_0 <= WHILE)) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// antlr/NeptuneGenerator.g:50:5: t= line
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
	// antlr/NeptuneGenerator.g:53:1: line returns [Type type = null] : (t= expression | declaration | logic_statement );
	public final Type line() throws RecognitionException {
		Type type =  null;


		Type t =null;

		try {
			// antlr/NeptuneGenerator.g:54:2: (t= expression | declaration | logic_statement )
			int alt2=3;
			switch ( input.LA(1) ) {
			case AND:
			case ARRAY_SET:
			case BECOMES:
			case BLOCK:
			case CHAR_LITERAL:
			case DIVIDE:
			case EQ:
			case FALSE:
			case GT:
			case GT_EQ:
			case IDENTIFIER:
			case LT:
			case LT_EQ:
			case MINUS:
			case NEQ:
			case NUMBER:
			case OR:
			case PLUS:
			case PRINT:
			case READ:
			case STRING_LITERAL:
			case TIMES:
			case TRUE:
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
					// antlr/NeptuneGenerator.g:54:4: t= expression
					{
					pushFollow(FOLLOW_expression_in_line90);
					t=expression();
					state._fsp--;

					type=t;
					}
					break;
				case 2 :
					// antlr/NeptuneGenerator.g:55:4: declaration
					{
					pushFollow(FOLLOW_declaration_in_line97);
					declaration();
					state._fsp--;

					type = new Type(Type.primitive.VOID);
					}
					break;
				case 3 :
					// antlr/NeptuneGenerator.g:56:4: logic_statement
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
	// antlr/NeptuneGenerator.g:59:1: codeblock returns [Type type = null] : ^( BLOCK lines ) ;
	public final Type codeblock() throws RecognitionException {
		Type type =  null;


		try {
			// antlr/NeptuneGenerator.g:60:2: ( ^( BLOCK lines ) )
			// antlr/NeptuneGenerator.g:60:4: ^( BLOCK lines )
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
	// antlr/NeptuneGenerator.g:63:1: logic_statement : ( while_statement | foreach_statement | if_statement );
	public final void logic_statement() throws RecognitionException {
		try {
			// antlr/NeptuneGenerator.g:64:2: ( while_statement | foreach_statement | if_statement )
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
					// antlr/NeptuneGenerator.g:64:4: while_statement
					{
					pushFollow(FOLLOW_while_statement_in_logic_statement140);
					while_statement();
					state._fsp--;

					}
					break;
				case 2 :
					// antlr/NeptuneGenerator.g:65:4: foreach_statement
					{
					pushFollow(FOLLOW_foreach_statement_in_logic_statement145);
					foreach_statement();
					state._fsp--;

					}
					break;
				case 3 :
					// antlr/NeptuneGenerator.g:66:4: if_statement
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
	// antlr/NeptuneGenerator.g:69:1: while_statement : ^( WHILE expression lines ) ;
	public final void while_statement() throws RecognitionException {
		 int beginLabel = labelCounter; labelCounter++; int endLabel = labelCounter; labelCounter++; 
		try {
			// antlr/NeptuneGenerator.g:71:2: ( ^( WHILE expression lines ) )
			// antlr/NeptuneGenerator.g:71:4: ^( WHILE expression lines )
			{
			match(input,WHILE,FOLLOW_WHILE_in_while_statement168); 

						addInstruction(Instruction.LABEL(beginLabel));
					
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expression_in_while_statement172);
			expression();
			state._fsp--;


						addInstruction(Instruction.JUMPIF(0, endLabel)); 
						symtab.openScope();
					
			pushFollow(FOLLOW_lines_in_while_statement176);
			lines();
			state._fsp--;


						symtab.closeScope();
						addInstruction(Instruction.JUMP(beginLabel));
						addInstruction(Instruction.LABEL(endLabel));
					
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
	// antlr/NeptuneGenerator.g:84:1: foreach_statement : ^( FOREACH x= IDENTIFIER y= IDENTIFIER lines ) ;
	public final void foreach_statement() throws RecognitionException {
		CommonTree x=null;
		CommonTree y=null;

		try {
			// antlr/NeptuneGenerator.g:85:2: ( ^( FOREACH x= IDENTIFIER y= IDENTIFIER lines ) )
			// antlr/NeptuneGenerator.g:85:4: ^( FOREACH x= IDENTIFIER y= IDENTIFIER lines )
			{
			match(input,FOREACH,FOLLOW_FOREACH_in_foreach_statement193); 
			match(input, Token.DOWN, null); 
			x=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_foreach_statement197); 
			symtab.openScope();
			y=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_foreach_statement203); 
			 declare((x!=null?x.getText():null), new Type(symtab.retrieve((y!=null?y.getText():null)).getType().type)); 
			pushFollow(FOLLOW_lines_in_foreach_statement207);
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
	// antlr/NeptuneGenerator.g:88:1: if_statement : ^( IF expression lines ( ELSIF expression lines )* ( ELSE lines )? ) ;
	public final void if_statement() throws RecognitionException {
		 int endLabel = labelCounter; labelCounter++; int nextLabel = labelCounter; labelCounter++; boolean containsElse = false; 
		try {
			// antlr/NeptuneGenerator.g:90:2: ( ^( IF expression lines ( ELSIF expression lines )* ( ELSE lines )? ) )
			// antlr/NeptuneGenerator.g:90:4: ^( IF expression lines ( ELSIF expression lines )* ( ELSE lines )? )
			{
			match(input,IF,FOLLOW_IF_in_if_statement229); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expression_in_if_statement231);
			expression();
			state._fsp--;


					addInstruction(Instruction.JUMPIF(0, nextLabel));
					symtab.openScope();
				
			pushFollow(FOLLOW_lines_in_if_statement235);
			lines();
			state._fsp--;


					addInstruction(Instruction.JUMP(endLabel));
					symtab.closeScope();
				
			// antlr/NeptuneGenerator.g:97:3: ( ELSIF expression lines )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==ELSIF) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// antlr/NeptuneGenerator.g:97:4: ELSIF expression lines
					{
					match(input,ELSIF,FOLLOW_ELSIF_in_if_statement242); 

								addInstruction(Instruction.LABEL(nextLabel));
								nextLabel = labelCounter;
								labelCounter++;
							
					pushFollow(FOLLOW_expression_in_if_statement246);
					expression();
					state._fsp--;


								addInstruction(Instruction.JUMPIF(0, nextLabel));
								symtab.openScope();
							
					pushFollow(FOLLOW_lines_in_if_statement250);
					lines();
					state._fsp--;


								addInstruction(Instruction.JUMP(endLabel));
								symtab.closeScope();
							
					}
					break;

				default :
					break loop4;
				}
			}

			// antlr/NeptuneGenerator.g:108:3: ( ELSE lines )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==ELSE) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// antlr/NeptuneGenerator.g:108:4: ELSE lines
					{
					match(input,ELSE,FOLLOW_ELSE_in_if_statement260); 

								containsElse = true;
								addInstruction(Instruction.LABEL(nextLabel));
								symtab.openScope();
					pushFollow(FOLLOW_lines_in_if_statement264);
					lines();
					state._fsp--;

					symtab.closeScope();
							
					}
					break;

			}

			match(input, Token.UP, null); 


						if(!containsElse) {
							addInstruction(Instruction.LABEL(nextLabel));
						}
						addInstruction(Instruction.LABEL(endLabel));
					
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
	// antlr/NeptuneGenerator.g:120:1: print_statement returns [Type type = null] : ^( PRINT t= expression ( COMMA expression )* ) ;
	public final Type print_statement() throws RecognitionException {
		Type type =  null;


		Type t =null;

		boolean one=true;
		try {
			// antlr/NeptuneGenerator.g:122:2: ( ^( PRINT t= expression ( COMMA expression )* ) )
			// antlr/NeptuneGenerator.g:122:4: ^( PRINT t= expression ( COMMA expression )* )
			{
			match(input,PRINT,FOLLOW_PRINT_in_print_statement293); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expression_in_print_statement297);
			t=expression();
			state._fsp--;


					addInstruction(Instruction.PRINT(t));
				
			// antlr/NeptuneGenerator.g:124:4: ( COMMA expression )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==COMMA) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// antlr/NeptuneGenerator.g:124:5: COMMA expression
					{
					match(input,COMMA,FOLLOW_COMMA_in_print_statement302); 
					pushFollow(FOLLOW_expression_in_print_statement304);
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
	// antlr/NeptuneGenerator.g:132:1: read_statement returns [Type type = null] : ^( READ (t= IDENTIFIER ) ( COMMA IDENTIFIER )* ) ;
	public final Type read_statement() throws RecognitionException {
		Type type =  null;


		CommonTree t=null;

		boolean one=true;
		try {
			// antlr/NeptuneGenerator.g:134:2: ( ^( READ (t= IDENTIFIER ) ( COMMA IDENTIFIER )* ) )
			// antlr/NeptuneGenerator.g:134:4: ^( READ (t= IDENTIFIER ) ( COMMA IDENTIFIER )* )
			{
			match(input,READ,FOLLOW_READ_in_read_statement331); 
			match(input, Token.DOWN, null); 
			// antlr/NeptuneGenerator.g:134:11: (t= IDENTIFIER )
			// antlr/NeptuneGenerator.g:134:12: t= IDENTIFIER
			{
			t=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_read_statement336); 
			}

			// antlr/NeptuneGenerator.g:134:26: ( COMMA IDENTIFIER )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==COMMA) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// antlr/NeptuneGenerator.g:134:27: COMMA IDENTIFIER
					{
					match(input,COMMA,FOLLOW_COMMA_in_read_statement340); 
					match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_read_statement342); 
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
	// antlr/NeptuneGenerator.g:142:1: declaration : ( ^( VAR t= type x= IDENTIFIER ( BECOMES expression )? ) | ^( CONST t= type x= IDENTIFIER BECOMES expression ) );
	public final void declaration() throws RecognitionException {
		CommonTree x=null;
		Type t =null;

		try {
			// antlr/NeptuneGenerator.g:143:2: ( ^( VAR t= type x= IDENTIFIER ( BECOMES expression )? ) | ^( CONST t= type x= IDENTIFIER BECOMES expression ) )
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==VAR) ) {
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
					// antlr/NeptuneGenerator.g:143:4: ^( VAR t= type x= IDENTIFIER ( BECOMES expression )? )
					{
					match(input,VAR,FOLLOW_VAR_in_declaration360); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_type_in_declaration364);
					t=type();
					state._fsp--;

					x=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_declaration368); 
					 declare((x!=null?x.getText():null), t); 
					// antlr/NeptuneGenerator.g:143:55: ( BECOMES expression )?
					int alt8=2;
					int LA8_0 = input.LA(1);
					if ( (LA8_0==BECOMES) ) {
						alt8=1;
					}
					switch (alt8) {
						case 1 :
							// antlr/NeptuneGenerator.g:143:56: BECOMES expression
							{
							match(input,BECOMES,FOLLOW_BECOMES_in_declaration373); 
							pushFollow(FOLLOW_expression_in_declaration375);
							expression();
							state._fsp--;


									IdEntry var = symtab.retrieve((x!=null?x.getText():null));
									
									if(var.getType().isArray) {
										for(int i = var.getType().elemCount-1; i >=0; i--) {
											addInstruction(Instruction.STORE(var.getAddress() + i, var.getType()));
										}
									}else{
										addInstruction(Instruction.STORE(var.getAddress(), var.getType()));
									}
								
							}
							break;

					}

					match(input, Token.UP, null); 

					}
					break;
				case 2 :
					// antlr/NeptuneGenerator.g:154:4: ^( CONST t= type x= IDENTIFIER BECOMES expression )
					{
					match(input,CONST,FOLLOW_CONST_in_declaration387); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_type_in_declaration391);
					t=type();
					state._fsp--;

					x=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_declaration395); 
					match(input,BECOMES,FOLLOW_BECOMES_in_declaration397); 
					pushFollow(FOLLOW_expression_in_declaration399);
					expression();
					state._fsp--;

					match(input, Token.UP, null); 


							//const cannot change in the future
								declare((x!=null?x.getText():null), t);
							
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



	// $ANTLR start "expression"
	// antlr/NeptuneGenerator.g:160:1: expression returns [Type type = null] : t= assignment_expr ;
	public final Type expression() throws RecognitionException {
		Type type =  null;


		Type t =null;

		try {
			// antlr/NeptuneGenerator.g:161:2: (t= assignment_expr )
			// antlr/NeptuneGenerator.g:161:4: t= assignment_expr
			{
			pushFollow(FOLLOW_assignment_expr_in_expression419);
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
	// antlr/NeptuneGenerator.g:164:1: assignment_expr returns [Type type = null] : (t= and_or_expr | ^( BECOMES x= IDENTIFIER ( ^( ARRAY_DEF n= NUMBER ) )? expression ) );
	public final Type assignment_expr() throws RecognitionException {
		Type type =  null;


		CommonTree x=null;
		CommonTree n=null;
		Type t =null;

		try {
			// antlr/NeptuneGenerator.g:165:2: (t= and_or_expr | ^( BECOMES x= IDENTIFIER ( ^( ARRAY_DEF n= NUMBER ) )? expression ) )
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==AND||LA11_0==ARRAY_SET||LA11_0==BLOCK||LA11_0==CHAR_LITERAL||LA11_0==DIVIDE||(LA11_0 >= EQ && LA11_0 <= FALSE)||(LA11_0 >= GT && LA11_0 <= IDENTIFIER)||(LA11_0 >= LT && LA11_0 <= PRINT)||LA11_0==READ||LA11_0==STRING_LITERAL||(LA11_0 >= TIMES && LA11_0 <= TRUE)) ) {
				alt11=1;
			}
			else if ( (LA11_0==BECOMES) ) {
				alt11=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}

			switch (alt11) {
				case 1 :
					// antlr/NeptuneGenerator.g:165:4: t= and_or_expr
					{
					pushFollow(FOLLOW_and_or_expr_in_assignment_expr438);
					t=and_or_expr();
					state._fsp--;

					type=t;
					}
					break;
				case 2 :
					// antlr/NeptuneGenerator.g:166:4: ^( BECOMES x= IDENTIFIER ( ^( ARRAY_DEF n= NUMBER ) )? expression )
					{
					 int index = -1; 
					match(input,BECOMES,FOLLOW_BECOMES_in_assignment_expr447); 
					match(input, Token.DOWN, null); 
					x=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_assignment_expr451); 
					// antlr/NeptuneGenerator.g:166:46: ( ^( ARRAY_DEF n= NUMBER ) )?
					int alt10=2;
					int LA10_0 = input.LA(1);
					if ( (LA10_0==ARRAY_DEF) ) {
						alt10=1;
					}
					switch (alt10) {
						case 1 :
							// antlr/NeptuneGenerator.g:166:47: ^( ARRAY_DEF n= NUMBER )
							{
							match(input,ARRAY_DEF,FOLLOW_ARRAY_DEF_in_assignment_expr455); 
							match(input, Token.DOWN, null); 
							n=(CommonTree)match(input,NUMBER,FOLLOW_NUMBER_in_assignment_expr459); 
							 index = Integer.parseInt((n!=null?n.getText():null)); 
							match(input, Token.UP, null); 

							}
							break;

					}

					pushFollow(FOLLOW_expression_in_assignment_expr466);
					expression();
					state._fsp--;

					match(input, Token.UP, null); 


							IdEntry var = symtab.retrieve((x!=null?x.getText():null));
							
							if(var.getType().isArray && index == -1) {
								for(int i = var.getType().elemCount-1; i >=0; i--) {
									addInstruction(Instruction.STORE(var.getAddress() + i, var.getType()));
								}
							}else{
								if(index == -1) {
									index = 0;
								}
								
								addInstruction(Instruction.STORE(var.getAddress() + index, var.getType()));
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
	// $ANTLR end "assignment_expr"



	// $ANTLR start "and_or_expr"
	// antlr/NeptuneGenerator.g:183:1: and_or_expr returns [Type type = null] : (t= boolean_expr | ^( AND expression expression ) | ^( OR expression expression ) );
	public final Type and_or_expr() throws RecognitionException {
		Type type =  null;


		Type t =null;

		try {
			// antlr/NeptuneGenerator.g:184:2: (t= boolean_expr | ^( AND expression expression ) | ^( OR expression expression ) )
			int alt12=3;
			switch ( input.LA(1) ) {
			case ARRAY_SET:
			case BLOCK:
			case CHAR_LITERAL:
			case DIVIDE:
			case EQ:
			case FALSE:
			case GT:
			case GT_EQ:
			case IDENTIFIER:
			case LT:
			case LT_EQ:
			case MINUS:
			case NEQ:
			case NUMBER:
			case PLUS:
			case PRINT:
			case READ:
			case STRING_LITERAL:
			case TIMES:
			case TRUE:
				{
				alt12=1;
				}
				break;
			case AND:
				{
				alt12=2;
				}
				break;
			case OR:
				{
				alt12=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}
			switch (alt12) {
				case 1 :
					// antlr/NeptuneGenerator.g:184:4: t= boolean_expr
					{
					pushFollow(FOLLOW_boolean_expr_in_and_or_expr486);
					t=boolean_expr();
					state._fsp--;

					type = t;
					}
					break;
				case 2 :
					// antlr/NeptuneGenerator.g:185:4: ^( AND expression expression )
					{
					match(input,AND,FOLLOW_AND_in_and_or_expr500); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_and_or_expr502);
					expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_and_or_expr504);
					expression();
					state._fsp--;

					match(input, Token.UP, null); 


							type = new Type(Type.primitive.BOOLEAN);
							addInstruction(Instruction.BINARY("and"));
						
					}
					break;
				case 3 :
					// antlr/NeptuneGenerator.g:189:4: ^( OR expression expression )
					{
					match(input,OR,FOLLOW_OR_in_and_or_expr517); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_and_or_expr519);
					expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_and_or_expr521);
					expression();
					state._fsp--;

					match(input, Token.UP, null); 


							type = new Type(Type.primitive.BOOLEAN);
							addInstruction(Instruction.BINARY("or"));
						
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
	// antlr/NeptuneGenerator.g:195:1: boolean_expr returns [Type type = null] : (t= plus_expr | ^( LT expression expression ) | ^( LT_EQ expression expression ) | ^( GT expression expression ) | ^( GT_EQ expression expression ) | ^( EQ expression expression ) | ^( NEQ expression expression ) );
	public final Type boolean_expr() throws RecognitionException {
		Type type =  null;


		Type t =null;

		try {
			// antlr/NeptuneGenerator.g:196:2: (t= plus_expr | ^( LT expression expression ) | ^( LT_EQ expression expression ) | ^( GT expression expression ) | ^( GT_EQ expression expression ) | ^( EQ expression expression ) | ^( NEQ expression expression ) )
			int alt13=7;
			switch ( input.LA(1) ) {
			case ARRAY_SET:
			case BLOCK:
			case CHAR_LITERAL:
			case DIVIDE:
			case FALSE:
			case IDENTIFIER:
			case MINUS:
			case NUMBER:
			case PLUS:
			case PRINT:
			case READ:
			case STRING_LITERAL:
			case TIMES:
			case TRUE:
				{
				alt13=1;
				}
				break;
			case LT:
				{
				alt13=2;
				}
				break;
			case LT_EQ:
				{
				alt13=3;
				}
				break;
			case GT:
				{
				alt13=4;
				}
				break;
			case GT_EQ:
				{
				alt13=5;
				}
				break;
			case EQ:
				{
				alt13=6;
				}
				break;
			case NEQ:
				{
				alt13=7;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}
			switch (alt13) {
				case 1 :
					// antlr/NeptuneGenerator.g:196:4: t= plus_expr
					{
					pushFollow(FOLLOW_plus_expr_in_boolean_expr543);
					t=plus_expr();
					state._fsp--;

					type = t;
					}
					break;
				case 2 :
					// antlr/NeptuneGenerator.g:197:4: ^( LT expression expression )
					{
					match(input,LT,FOLLOW_LT_in_boolean_expr559); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_boolean_expr561);
					expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_boolean_expr563);
					expression();
					state._fsp--;

					match(input, Token.UP, null); 


							type = new Type(Type.primitive.BOOLEAN);
							addInstruction(Instruction.BINARY("lt"));
						
					}
					break;
				case 3 :
					// antlr/NeptuneGenerator.g:201:4: ^( LT_EQ expression expression )
					{
					match(input,LT_EQ,FOLLOW_LT_EQ_in_boolean_expr576); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_boolean_expr578);
					expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_boolean_expr580);
					expression();
					state._fsp--;

					match(input, Token.UP, null); 


							type = new Type(Type.primitive.BOOLEAN);
							addInstruction(Instruction.BINARY("le"));
						
					}
					break;
				case 4 :
					// antlr/NeptuneGenerator.g:205:4: ^( GT expression expression )
					{
					match(input,GT,FOLLOW_GT_in_boolean_expr591); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_boolean_expr593);
					expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_boolean_expr595);
					expression();
					state._fsp--;

					match(input, Token.UP, null); 


							type = new Type(Type.primitive.BOOLEAN);
							addInstruction(Instruction.BINARY("gt"));
						
					}
					break;
				case 5 :
					// antlr/NeptuneGenerator.g:209:4: ^( GT_EQ expression expression )
					{
					match(input,GT_EQ,FOLLOW_GT_EQ_in_boolean_expr607); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_boolean_expr609);
					expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_boolean_expr611);
					expression();
					state._fsp--;

					match(input, Token.UP, null); 


							type = new Type(Type.primitive.BOOLEAN);
							addInstruction(Instruction.BINARY("ge"));
						
					}
					break;
				case 6 :
					// antlr/NeptuneGenerator.g:213:4: ^( EQ expression expression )
					{
					match(input,EQ,FOLLOW_EQ_in_boolean_expr622); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_boolean_expr624);
					expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_boolean_expr626);
					expression();
					state._fsp--;

					match(input, Token.UP, null); 


							type = new Type(Type.primitive.BOOLEAN);
							addInstruction(Instruction.BINARY("eq"));
						
					}
					break;
				case 7 :
					// antlr/NeptuneGenerator.g:217:4: ^( NEQ expression expression )
					{
					match(input,NEQ,FOLLOW_NEQ_in_boolean_expr638); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_boolean_expr640);
					expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_boolean_expr642);
					expression();
					state._fsp--;

					match(input, Token.UP, null); 


							type = new Type(Type.primitive.BOOLEAN);
							addInstruction(Instruction.BINARY("neq"));
						
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
	// antlr/NeptuneGenerator.g:223:1: plus_expr returns [Type type = null] : (t= multi_expr | ^( PLUS expression expression ) | ^( MINUS expression expression ) );
	public final Type plus_expr() throws RecognitionException {
		Type type =  null;


		Type t =null;

		try {
			// antlr/NeptuneGenerator.g:224:2: (t= multi_expr | ^( PLUS expression expression ) | ^( MINUS expression expression ) )
			int alt14=3;
			switch ( input.LA(1) ) {
			case ARRAY_SET:
			case BLOCK:
			case CHAR_LITERAL:
			case DIVIDE:
			case FALSE:
			case IDENTIFIER:
			case NUMBER:
			case PRINT:
			case READ:
			case STRING_LITERAL:
			case TIMES:
			case TRUE:
				{
				alt14=1;
				}
				break;
			case PLUS:
				{
				alt14=2;
				}
				break;
			case MINUS:
				{
				alt14=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				throw nvae;
			}
			switch (alt14) {
				case 1 :
					// antlr/NeptuneGenerator.g:224:4: t= multi_expr
					{
					pushFollow(FOLLOW_multi_expr_in_plus_expr665);
					t=multi_expr();
					state._fsp--;

					type=t;
					}
					break;
				case 2 :
					// antlr/NeptuneGenerator.g:225:4: ^( PLUS expression expression )
					{
					match(input,PLUS,FOLLOW_PLUS_in_plus_expr679); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_plus_expr681);
					expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_plus_expr683);
					expression();
					state._fsp--;

					match(input, Token.UP, null); 


							type = new Type(Type.primitive.INTEGER);
							addInstruction(Instruction.ADD());
						
					}
					break;
				case 3 :
					// antlr/NeptuneGenerator.g:229:4: ^( MINUS expression expression )
					{
					match(input,MINUS,FOLLOW_MINUS_in_plus_expr693); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_plus_expr695);
					expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_plus_expr697);
					expression();
					state._fsp--;

					match(input, Token.UP, null); 


							type = new Type(Type.primitive.INTEGER);
							addInstruction(Instruction.SUB());
						
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
	// antlr/NeptuneGenerator.g:235:1: multi_expr returns [Type type = null] : (t= operand | ^( TIMES expression expression ) | ^( DIVIDE expression expression ) );
	public final Type multi_expr() throws RecognitionException {
		Type type =  null;


		Type t =null;

		try {
			// antlr/NeptuneGenerator.g:236:2: (t= operand | ^( TIMES expression expression ) | ^( DIVIDE expression expression ) )
			int alt15=3;
			switch ( input.LA(1) ) {
			case ARRAY_SET:
			case BLOCK:
			case CHAR_LITERAL:
			case FALSE:
			case IDENTIFIER:
			case NUMBER:
			case PRINT:
			case READ:
			case STRING_LITERAL:
			case TRUE:
				{
				alt15=1;
				}
				break;
			case TIMES:
				{
				alt15=2;
				}
				break;
			case DIVIDE:
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
					// antlr/NeptuneGenerator.g:236:4: t= operand
					{
					pushFollow(FOLLOW_operand_in_multi_expr718);
					t=operand();
					state._fsp--;

					type=t;
					}
					break;
				case 2 :
					// antlr/NeptuneGenerator.g:237:4: ^( TIMES expression expression )
					{
					match(input,TIMES,FOLLOW_TIMES_in_multi_expr732); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_multi_expr734);
					expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_multi_expr736);
					expression();
					state._fsp--;

					match(input, Token.UP, null); 


							type = new Type(Type.primitive.INTEGER);
							addInstruction(Instruction.MULT());
						
					}
					break;
				case 3 :
					// antlr/NeptuneGenerator.g:241:4: ^( DIVIDE expression expression )
					{
					match(input,DIVIDE,FOLLOW_DIVIDE_in_multi_expr745); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_multi_expr747);
					expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_multi_expr749);
					expression();
					state._fsp--;

					match(input, Token.UP, null); 


							type = new Type(Type.primitive.INTEGER);
							addInstruction(Instruction.DIV());
						
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



	// $ANTLR start "operand"
	// antlr/NeptuneGenerator.g:247:1: operand returns [Type type=null] : (x= IDENTIFIER ( ^( ARRAY_DEF n= NUMBER ) )? |n= NUMBER | ^( ARRAY_SET (t= expression )+ ) | TRUE | FALSE |c= CHAR_LITERAL |s= STRING_LITERAL |t= codeblock |t= print_statement |t= read_statement );
	public final Type operand() throws RecognitionException {
		Type type = null;


		CommonTree x=null;
		CommonTree n=null;
		CommonTree c=null;
		CommonTree s=null;
		Type t =null;

		try {
			// antlr/NeptuneGenerator.g:248:2: (x= IDENTIFIER ( ^( ARRAY_DEF n= NUMBER ) )? |n= NUMBER | ^( ARRAY_SET (t= expression )+ ) | TRUE | FALSE |c= CHAR_LITERAL |s= STRING_LITERAL |t= codeblock |t= print_statement |t= read_statement )
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
			case ARRAY_SET:
				{
				alt18=3;
				}
				break;
			case TRUE:
				{
				alt18=4;
				}
				break;
			case FALSE:
				{
				alt18=5;
				}
				break;
			case CHAR_LITERAL:
				{
				alt18=6;
				}
				break;
			case STRING_LITERAL:
				{
				alt18=7;
				}
				break;
			case BLOCK:
				{
				alt18=8;
				}
				break;
			case PRINT:
				{
				alt18=9;
				}
				break;
			case READ:
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
					// antlr/NeptuneGenerator.g:248:4: x= IDENTIFIER ( ^( ARRAY_DEF n= NUMBER ) )?
					{
					 int index = 0; 
					x=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_operand771); 
					// antlr/NeptuneGenerator.g:248:36: ( ^( ARRAY_DEF n= NUMBER ) )?
					int alt16=2;
					int LA16_0 = input.LA(1);
					if ( (LA16_0==ARRAY_DEF) ) {
						alt16=1;
					}
					switch (alt16) {
						case 1 :
							// antlr/NeptuneGenerator.g:248:37: ^( ARRAY_DEF n= NUMBER )
							{
							match(input,ARRAY_DEF,FOLLOW_ARRAY_DEF_in_operand775); 
							match(input, Token.DOWN, null); 
							n=(CommonTree)match(input,NUMBER,FOLLOW_NUMBER_in_operand779); 
							 index = Integer.parseInt((n!=null?n.getText():null)); 
							match(input, Token.UP, null); 

							}
							break;

					}


							IdEntry var = symtab.retrieve((x!=null?x.getText():null));
							type = var.getType();
							addInstruction(Instruction.LOAD(var.getAddress() + index, var.getType()));
						
					}
					break;
				case 2 :
					// antlr/NeptuneGenerator.g:253:4: n= NUMBER
					{
					n=(CommonTree)match(input,NUMBER,FOLLOW_NUMBER_in_operand793); 

							type = new Type(Type.primitive.INTEGER);
							addInstruction(Instruction.LOADL(Integer.parseInt((n!=null?n.getText():null))));
						
					}
					break;
				case 3 :
					// antlr/NeptuneGenerator.g:257:4: ^( ARRAY_SET (t= expression )+ )
					{
					match(input,ARRAY_SET,FOLLOW_ARRAY_SET_in_operand807); 
					match(input, Token.DOWN, null); 
					// antlr/NeptuneGenerator.g:257:16: (t= expression )+
					int cnt17=0;
					loop17:
					while (true) {
						int alt17=2;
						int LA17_0 = input.LA(1);
						if ( (LA17_0==AND||(LA17_0 >= ARRAY_SET && LA17_0 <= BLOCK)||LA17_0==CHAR_LITERAL||LA17_0==DIVIDE||(LA17_0 >= EQ && LA17_0 <= FALSE)||(LA17_0 >= GT && LA17_0 <= IDENTIFIER)||(LA17_0 >= LT && LA17_0 <= PRINT)||LA17_0==READ||LA17_0==STRING_LITERAL||(LA17_0 >= TIMES && LA17_0 <= TRUE)) ) {
							alt17=1;
						}

						switch (alt17) {
						case 1 :
							// antlr/NeptuneGenerator.g:257:17: t= expression
							{
							pushFollow(FOLLOW_expression_in_operand812);
							t=expression();
							state._fsp--;

							type = t;
							}
							break;

						default :
							if ( cnt17 >= 1 ) break loop17;
							EarlyExitException eee = new EarlyExitException(17, input);
							throw eee;
						}
						cnt17++;
					}

					match(input, Token.UP, null); 

					}
					break;
				case 4 :
					// antlr/NeptuneGenerator.g:258:4: TRUE
					{
					match(input,TRUE,FOLLOW_TRUE_in_operand822); 

							type = new Type(Type.primitive.BOOLEAN);
							addInstruction(Instruction.LOADL(1));
						
					}
					break;
				case 5 :
					// antlr/NeptuneGenerator.g:262:4: FALSE
					{
					match(input,FALSE,FOLLOW_FALSE_in_operand836); 

							type = new Type(Type.primitive.BOOLEAN);
							addInstruction(Instruction.LOADL(0));
						
					}
					break;
				case 6 :
					// antlr/NeptuneGenerator.g:266:4: c= CHAR_LITERAL
					{
					c=(CommonTree)match(input,CHAR_LITERAL,FOLLOW_CHAR_LITERAL_in_operand851); 

							type = new Type(Type.primitive.CHAR);
							addInstruction(Instruction.LOADL((int)(c!=null?c.getText():null).charAt(1)));
						
					}
					break;
				case 7 :
					// antlr/NeptuneGenerator.g:270:4: s= STRING_LITERAL
					{
					s=(CommonTree)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_operand865); 

							type = new Type(Type.primitive.CHAR, 0);
							String ts = (s!=null?s.getText():null);
							ts = ts.substring(1, ts.length()-1);
							for(int i = 0; i < ts.length(); i++) {
								addInstruction(Instruction.LOADL((int)ts.charAt(i)));
							}
						
					}
					break;
				case 8 :
					// antlr/NeptuneGenerator.g:278:4: t= codeblock
					{
					pushFollow(FOLLOW_codeblock_in_operand877);
					t=codeblock();
					state._fsp--;

					type = t;
					}
					break;
				case 9 :
					// antlr/NeptuneGenerator.g:279:4: t= print_statement
					{
					pushFollow(FOLLOW_print_statement_in_operand896);
					t=print_statement();
					state._fsp--;

					type = t;
					}
					break;
				case 10 :
					// antlr/NeptuneGenerator.g:280:4: t= read_statement
					{
					pushFollow(FOLLOW_read_statement_in_operand908);
					t=read_statement();
					state._fsp--;

					type = t;
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



	// $ANTLR start "type"
	// antlr/NeptuneGenerator.g:283:1: type returns [Type type = null] : ( INTEGER (count= array_def )? | CHAR (count= array_def )? | BOOLEAN (count= array_def )? );
	public final Type type() throws RecognitionException {
		Type type =  null;


		int count =0;

		try {
			// antlr/NeptuneGenerator.g:284:2: ( INTEGER (count= array_def )? | CHAR (count= array_def )? | BOOLEAN (count= array_def )? )
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
					// antlr/NeptuneGenerator.g:284:4: INTEGER (count= array_def )?
					{
					match(input,INTEGER,FOLLOW_INTEGER_in_type928); 
					// antlr/NeptuneGenerator.g:284:17: (count= array_def )?
					int alt19=2;
					int LA19_0 = input.LA(1);
					if ( (LA19_0==ARRAY_DEF) ) {
						alt19=1;
					}
					switch (alt19) {
						case 1 :
							// antlr/NeptuneGenerator.g:284:17: count= array_def
							{
							pushFollow(FOLLOW_array_def_in_type932);
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
					// antlr/NeptuneGenerator.g:290:4: CHAR (count= array_def )?
					{
					match(input,CHAR,FOLLOW_CHAR_in_type940); 
					// antlr/NeptuneGenerator.g:290:14: (count= array_def )?
					int alt20=2;
					int LA20_0 = input.LA(1);
					if ( (LA20_0==ARRAY_DEF) ) {
						alt20=1;
					}
					switch (alt20) {
						case 1 :
							// antlr/NeptuneGenerator.g:290:14: count= array_def
							{
							pushFollow(FOLLOW_array_def_in_type944);
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
					// antlr/NeptuneGenerator.g:296:4: BOOLEAN (count= array_def )?
					{
					match(input,BOOLEAN,FOLLOW_BOOLEAN_in_type952); 
					// antlr/NeptuneGenerator.g:296:17: (count= array_def )?
					int alt21=2;
					int LA21_0 = input.LA(1);
					if ( (LA21_0==ARRAY_DEF) ) {
						alt21=1;
					}
					switch (alt21) {
						case 1 :
							// antlr/NeptuneGenerator.g:296:17: count= array_def
							{
							pushFollow(FOLLOW_array_def_in_type956);
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
	// antlr/NeptuneGenerator.g:304:1: array_def returns [int count = 0] : ^( ARRAY_DEF x= NUMBER ) ;
	public final int array_def() throws RecognitionException {
		int count =  0;


		CommonTree x=null;

		try {
			// antlr/NeptuneGenerator.g:305:2: ( ^( ARRAY_DEF x= NUMBER ) )
			// antlr/NeptuneGenerator.g:305:4: ^( ARRAY_DEF x= NUMBER )
			{
			match(input,ARRAY_DEF,FOLLOW_ARRAY_DEF_in_array_def975); 
			match(input, Token.DOWN, null); 
			x=(CommonTree)match(input,NUMBER,FOLLOW_NUMBER_in_array_def979); 
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
	public static final BitSet FOLLOW_line_in_lines70 = new BitSet(new long[]{0x1B443FC07B8289D2L});
	public static final BitSet FOLLOW_expression_in_line90 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declaration_in_line97 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_logic_statement_in_line104 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BLOCK_in_codeblock122 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_lines_in_codeblock126 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_while_statement_in_logic_statement140 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_foreach_statement_in_logic_statement145 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_if_statement_in_logic_statement150 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHILE_in_while_statement168 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_while_statement172 = new BitSet(new long[]{0x1B443FC07B8289D0L});
	public static final BitSet FOLLOW_lines_in_while_statement176 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FOREACH_in_foreach_statement193 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_foreach_statement197 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_foreach_statement203 = new BitSet(new long[]{0x1B443FC07B8289D0L});
	public static final BitSet FOLLOW_lines_in_foreach_statement207 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_IF_in_if_statement229 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_if_statement231 = new BitSet(new long[]{0x1B443FC07B8289D0L});
	public static final BitSet FOLLOW_lines_in_if_statement235 = new BitSet(new long[]{0x0000000000600008L});
	public static final BitSet FOLLOW_ELSIF_in_if_statement242 = new BitSet(new long[]{0x03443FC0398209D0L});
	public static final BitSet FOLLOW_expression_in_if_statement246 = new BitSet(new long[]{0x1B443FC07B8289D0L});
	public static final BitSet FOLLOW_lines_in_if_statement250 = new BitSet(new long[]{0x0000000000600008L});
	public static final BitSet FOLLOW_ELSE_in_if_statement260 = new BitSet(new long[]{0x1B443FC07B8289D0L});
	public static final BitSet FOLLOW_lines_in_if_statement264 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PRINT_in_print_statement293 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_print_statement297 = new BitSet(new long[]{0x0000000000002008L});
	public static final BitSet FOLLOW_COMMA_in_print_statement302 = new BitSet(new long[]{0x03443FC0398209D0L});
	public static final BitSet FOLLOW_expression_in_print_statement304 = new BitSet(new long[]{0x0000000000002008L});
	public static final BitSet FOLLOW_READ_in_read_statement331 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_read_statement336 = new BitSet(new long[]{0x0000000000002008L});
	public static final BitSet FOLLOW_COMMA_in_read_statement340 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_read_statement342 = new BitSet(new long[]{0x0000000000002008L});
	public static final BitSet FOLLOW_VAR_in_declaration360 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_type_in_declaration364 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_declaration368 = new BitSet(new long[]{0x0000000000000088L});
	public static final BitSet FOLLOW_BECOMES_in_declaration373 = new BitSet(new long[]{0x03443FC0398209D0L});
	public static final BitSet FOLLOW_expression_in_declaration375 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_CONST_in_declaration387 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_type_in_declaration391 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_declaration395 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_BECOMES_in_declaration397 = new BitSet(new long[]{0x03443FC0398209D0L});
	public static final BitSet FOLLOW_expression_in_declaration399 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_assignment_expr_in_expression419 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_and_or_expr_in_assignment_expr438 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BECOMES_in_assignment_expr447 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_assignment_expr451 = new BitSet(new long[]{0x03443FC0398209F0L});
	public static final BitSet FOLLOW_ARRAY_DEF_in_assignment_expr455 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_NUMBER_in_assignment_expr459 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_expression_in_assignment_expr466 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_boolean_expr_in_and_or_expr486 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AND_in_and_or_expr500 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_and_or_expr502 = new BitSet(new long[]{0x03443FC0398209D0L});
	public static final BitSet FOLLOW_expression_in_and_or_expr504 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_OR_in_and_or_expr517 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_and_or_expr519 = new BitSet(new long[]{0x03443FC0398209D0L});
	public static final BitSet FOLLOW_expression_in_and_or_expr521 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_plus_expr_in_boolean_expr543 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LT_in_boolean_expr559 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_boolean_expr561 = new BitSet(new long[]{0x03443FC0398209D0L});
	public static final BitSet FOLLOW_expression_in_boolean_expr563 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LT_EQ_in_boolean_expr576 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_boolean_expr578 = new BitSet(new long[]{0x03443FC0398209D0L});
	public static final BitSet FOLLOW_expression_in_boolean_expr580 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_GT_in_boolean_expr591 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_boolean_expr593 = new BitSet(new long[]{0x03443FC0398209D0L});
	public static final BitSet FOLLOW_expression_in_boolean_expr595 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_GT_EQ_in_boolean_expr607 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_boolean_expr609 = new BitSet(new long[]{0x03443FC0398209D0L});
	public static final BitSet FOLLOW_expression_in_boolean_expr611 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_EQ_in_boolean_expr622 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_boolean_expr624 = new BitSet(new long[]{0x03443FC0398209D0L});
	public static final BitSet FOLLOW_expression_in_boolean_expr626 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NEQ_in_boolean_expr638 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_boolean_expr640 = new BitSet(new long[]{0x03443FC0398209D0L});
	public static final BitSet FOLLOW_expression_in_boolean_expr642 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_multi_expr_in_plus_expr665 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PLUS_in_plus_expr679 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_plus_expr681 = new BitSet(new long[]{0x03443FC0398209D0L});
	public static final BitSet FOLLOW_expression_in_plus_expr683 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MINUS_in_plus_expr693 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_plus_expr695 = new BitSet(new long[]{0x03443FC0398209D0L});
	public static final BitSet FOLLOW_expression_in_plus_expr697 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_operand_in_multi_expr718 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIMES_in_multi_expr732 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_multi_expr734 = new BitSet(new long[]{0x03443FC0398209D0L});
	public static final BitSet FOLLOW_expression_in_multi_expr736 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DIVIDE_in_multi_expr745 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_multi_expr747 = new BitSet(new long[]{0x03443FC0398209D0L});
	public static final BitSet FOLLOW_expression_in_multi_expr749 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_IDENTIFIER_in_operand771 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_ARRAY_DEF_in_operand775 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_NUMBER_in_operand779 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NUMBER_in_operand793 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ARRAY_SET_in_operand807 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_operand812 = new BitSet(new long[]{0x03443FC0398209D8L});
	public static final BitSet FOLLOW_TRUE_in_operand822 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FALSE_in_operand836 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_LITERAL_in_operand851 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_operand865 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_codeblock_in_operand877 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_print_statement_in_operand896 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_read_statement_in_operand908 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTEGER_in_type928 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_array_def_in_type932 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_in_type940 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_array_def_in_type944 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOLEAN_in_type952 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_array_def_in_type956 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ARRAY_DEF_in_array_def975 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_NUMBER_in_array_def979 = new BitSet(new long[]{0x0000000000000008L});
}

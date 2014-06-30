// $ANTLR 3.5.2 antlr/NeptuneGenerator.g 2014-06-30 22:27:02

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
				if ( (LA1_0==AND||(LA1_0 >= ARRAY_SET && LA1_0 <= BLOCK)||LA1_0==CHAR_LITERAL||LA1_0==CONST||LA1_0==DIVIDE||(LA1_0 >= EQ && LA1_0 <= FOREACH)||(LA1_0 >= GT && LA1_0 <= IF)||(LA1_0 >= LT && LA1_0 <= PRINT)||LA1_0==READ||LA1_0==STRING_LITERAL||(LA1_0 >= TIMES && LA1_0 <= UNARY_PLUS)||(LA1_0 >= VAR && LA1_0 <= WHILE)) ) {
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
			case MOD:
			case NEGATE:
			case NEQ:
			case NUMBER:
			case OR:
			case PLUS:
			case PRINT:
			case READ:
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

		int count = 0; int lastlabel = 0;
		try {
			// antlr/NeptuneGenerator.g:86:2: ( ^( FOREACH x= IDENTIFIER y= IDENTIFIER lines ) )
			// antlr/NeptuneGenerator.g:86:4: ^( FOREACH x= IDENTIFIER y= IDENTIFIER lines )
			{
			match(input,FOREACH,FOLLOW_FOREACH_in_foreach_statement199); 
			match(input, Token.DOWN, null); 
			x=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_foreach_statement203); 
			symtab.openScope();
			y=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_foreach_statement209); 

					Type temp_type = symtab.retrieve((y!=null?y.getText():null)).getType();
					count = temp_type.elemCount; 
					declare((x!=null?x.getText():null), new Type(symtab.retrieve((y!=null?y.getText():null)).getType().type));

					declare("", new Type(Type.primitive.INTEGER)); //loop counter

					addInstruction(Instruction.LOADL(0));
					addInstruction(Instruction.STORE(symtab.retrieve("").getAddress(), new Type(Type.primitive.INTEGER)));

					addInstruction(Instruction.LABEL(labelCounter));
					lastlabel = labelCounter;
					labelCounter++;

					addTextualInstruction("LOADA " + symtab.retrieve((y!=null?y.getText():null)).getAddress() + "[SB]", true, false);
					addInstruction(Instruction.LOAD(symtab.retrieve("").getAddress(), new Type(Type.primitive.INTEGER)));
					addInstruction(Instruction.ADD());
					addTextualInstruction("LOADI(1)",true, true);
					addInstruction(Instruction.STORE(symtab.retrieve((x!=null?x.getText():null)).getAddress(), temp_type));
				
			pushFollow(FOLLOW_lines_in_foreach_statement217);
			lines();
			state._fsp--;


					addInstruction(Instruction.LOAD(symtab.retrieve("").getAddress(), new Type(Type.primitive.INTEGER)));
					addInstruction(Instruction.BINARY("succ"));
					addInstruction(Instruction.STORE(symtab.retrieve("").getAddress(), new Type(Type.primitive.INTEGER)));
					addInstruction(Instruction.LOAD(symtab.retrieve("").getAddress(), new Type(Type.primitive.INTEGER)));
					addInstruction(Instruction.JUMPIF(count, labelCounter));
					addInstruction(Instruction.JUMP(lastlabel));
					addInstruction(Instruction.LABEL(labelCounter));
					labelCounter++;
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
	// antlr/NeptuneGenerator.g:120:1: if_statement : ^( IF expression lines ( ELSIF expression lines )* ( ELSE lines )? ) ;
	public final void if_statement() throws RecognitionException {
		 int endLabel = labelCounter; labelCounter++; int nextLabel = labelCounter; labelCounter++; boolean containsElse = false; 
		try {
			// antlr/NeptuneGenerator.g:122:2: ( ^( IF expression lines ( ELSIF expression lines )* ( ELSE lines )? ) )
			// antlr/NeptuneGenerator.g:122:4: ^( IF expression lines ( ELSIF expression lines )* ( ELSE lines )? )
			{
			match(input,IF,FOLLOW_IF_in_if_statement241); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expression_in_if_statement243);
			expression();
			state._fsp--;


					addInstruction(Instruction.JUMPIF(0, nextLabel));
					symtab.openScope();
				
			pushFollow(FOLLOW_lines_in_if_statement247);
			lines();
			state._fsp--;


					addInstruction(Instruction.JUMP(endLabel));
					symtab.closeScope();
				
			// antlr/NeptuneGenerator.g:129:3: ( ELSIF expression lines )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==ELSIF) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// antlr/NeptuneGenerator.g:129:4: ELSIF expression lines
					{
					match(input,ELSIF,FOLLOW_ELSIF_in_if_statement254); 

								addInstruction(Instruction.LABEL(nextLabel));
								nextLabel = labelCounter;
								labelCounter++;
							
					pushFollow(FOLLOW_expression_in_if_statement258);
					expression();
					state._fsp--;


								addInstruction(Instruction.JUMPIF(0, nextLabel));
								symtab.openScope();
							
					pushFollow(FOLLOW_lines_in_if_statement262);
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

			// antlr/NeptuneGenerator.g:140:3: ( ELSE lines )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==ELSE) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// antlr/NeptuneGenerator.g:140:4: ELSE lines
					{
					match(input,ELSE,FOLLOW_ELSE_in_if_statement272); 

								containsElse = true;
								addInstruction(Instruction.LABEL(nextLabel));
								symtab.openScope();
					pushFollow(FOLLOW_lines_in_if_statement276);
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
	// antlr/NeptuneGenerator.g:152:1: print_statement returns [Type type = null] : ^( PRINT t= expression ( COMMA t2= expression )* ) ;
	public final Type print_statement() throws RecognitionException {
		Type type =  null;


		Type t =null;
		Type t2 =null;

		boolean one=true;
		try {
			// antlr/NeptuneGenerator.g:154:2: ( ^( PRINT t= expression ( COMMA t2= expression )* ) )
			// antlr/NeptuneGenerator.g:154:4: ^( PRINT t= expression ( COMMA t2= expression )* )
			{
			match(input,PRINT,FOLLOW_PRINT_in_print_statement305); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expression_in_print_statement309);
			t=expression();
			state._fsp--;


				
					program.markInstructionStart();

					if(t.isArray) {
						for(int i = 0; i < t.elemCount; i++) {
							addInstruction(Instruction.PRINT(t));
						}
					}else{
						addInstruction(Instruction.PRINT(t));
					}
				
			// antlr/NeptuneGenerator.g:165:4: ( COMMA t2= expression )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==COMMA) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// antlr/NeptuneGenerator.g:165:5: COMMA t2= expression
					{
					match(input,COMMA,FOLLOW_COMMA_in_print_statement314); 
					pushFollow(FOLLOW_expression_in_print_statement318);
					t2=expression();
					state._fsp--;



							one=false;
							if(t2.isArray) {
								for(int i = 0; i < t2.elemCount; i++) {
									addInstruction(Instruction.PRINT(t2));
								}
							}else{
								addInstruction(Instruction.PRINT(t2));
							}
						
					}
					break;

				default :
					break loop6;
				}
			}

			match(input, Token.UP, null); 


					if(one){
						type=t; 
						ArrayList<Instruction> tmp = program.popLastInstructions();

						if(t.isArray) {
							addTextualInstruction("LOAD(" + t.elemCount + ") -" + t.elemCount + "[ST]", true, false);
						}else{
							addTextualInstruction("LOAD(1) -1[ST]", true, false);	
						}
						program.addMultiple(tmp);

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
	// antlr/NeptuneGenerator.g:192:1: read_statement returns [Type type = null] : ^( READ (t= IDENTIFIER ) ( COMMA t2= IDENTIFIER )* ) ;
	public final Type read_statement() throws RecognitionException {
		Type type =  null;


		CommonTree t=null;
		CommonTree t2=null;

		boolean one=true;
		try {
			// antlr/NeptuneGenerator.g:194:2: ( ^( READ (t= IDENTIFIER ) ( COMMA t2= IDENTIFIER )* ) )
			// antlr/NeptuneGenerator.g:194:4: ^( READ (t= IDENTIFIER ) ( COMMA t2= IDENTIFIER )* )
			{
			match(input,READ,FOLLOW_READ_in_read_statement345); 
			match(input, Token.DOWN, null); 
			// antlr/NeptuneGenerator.g:194:11: (t= IDENTIFIER )
			// antlr/NeptuneGenerator.g:194:12: t= IDENTIFIER
			{
			t=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_read_statement350); 

						IdEntry entry= symtab.retrieve((t!=null?t.getText():null));
						addTextualInstruction("LOADA " + entry.getAddress() + "[SB]", true, false);
						addInstruction(Instruction.READ(entry.getType()));

					
			}

			// antlr/NeptuneGenerator.g:199:6: ( COMMA t2= IDENTIFIER )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==COMMA) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// antlr/NeptuneGenerator.g:199:7: COMMA t2= IDENTIFIER
					{
					match(input,COMMA,FOLLOW_COMMA_in_read_statement356); 
					t2=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_read_statement360); 

								one=false;
								IdEntry entry= symtab.retrieve((t2!=null?t2.getText():null));
								addTextualInstruction("LOADA " + entry.getAddress() + "[SB]", true, false);
								addInstruction(Instruction.READ(entry.getType()));
							
					}
					break;

				default :
					break loop7;
				}
			}

			match(input, Token.UP, null); 


					if(one){
						IdEntry entry= symtab.retrieve((t!=null?t.getText():null));
						addInstruction(Instruction.LOAD(entry.getAddress(), entry.getType()));
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
	// antlr/NeptuneGenerator.g:215:1: declaration : ( ^( VAR t= type x= IDENTIFIER ( BECOMES expression )? ) | ^( CONST t= type x= IDENTIFIER BECOMES expression ) );
	public final void declaration() throws RecognitionException {
		CommonTree x=null;
		Type t =null;

		try {
			// antlr/NeptuneGenerator.g:216:2: ( ^( VAR t= type x= IDENTIFIER ( BECOMES expression )? ) | ^( CONST t= type x= IDENTIFIER BECOMES expression ) )
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
					// antlr/NeptuneGenerator.g:216:4: ^( VAR t= type x= IDENTIFIER ( BECOMES expression )? )
					{
					match(input,VAR,FOLLOW_VAR_in_declaration378); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_type_in_declaration382);
					t=type();
					state._fsp--;

					x=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_declaration386); 
					 declare((x!=null?x.getText():null), t); 
					// antlr/NeptuneGenerator.g:216:55: ( BECOMES expression )?
					int alt8=2;
					int LA8_0 = input.LA(1);
					if ( (LA8_0==BECOMES) ) {
						alt8=1;
					}
					switch (alt8) {
						case 1 :
							// antlr/NeptuneGenerator.g:216:56: BECOMES expression
							{
							match(input,BECOMES,FOLLOW_BECOMES_in_declaration391); 
							pushFollow(FOLLOW_expression_in_declaration393);
							expression();
							state._fsp--;


									IdEntry var = symtab.retrieve((x!=null?x.getText():null));
									
									if(var.getType().isArray) {
										for(int i = 0; i < var.getType().elemCount; i++) {
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
					// antlr/NeptuneGenerator.g:227:4: ^( CONST t= type x= IDENTIFIER BECOMES expression )
					{
					match(input,CONST,FOLLOW_CONST_in_declaration405); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_type_in_declaration409);
					t=type();
					state._fsp--;

					x=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_declaration413); 
					match(input,BECOMES,FOLLOW_BECOMES_in_declaration415); 
					pushFollow(FOLLOW_expression_in_declaration417);
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
	// antlr/NeptuneGenerator.g:233:1: expression returns [Type type = null] : t= assignment_expr ;
	public final Type expression() throws RecognitionException {
		Type type =  null;


		Type t =null;

		try {
			// antlr/NeptuneGenerator.g:234:2: (t= assignment_expr )
			// antlr/NeptuneGenerator.g:234:4: t= assignment_expr
			{
			pushFollow(FOLLOW_assignment_expr_in_expression437);
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
	// antlr/NeptuneGenerator.g:237:1: assignment_expr returns [Type type = null] : (t= and_or_expr | ^( BECOMES x= IDENTIFIER ( ^( ARRAY_DEF n= NUMBER ) )? expression ) );
	public final Type assignment_expr() throws RecognitionException {
		Type type =  null;


		CommonTree x=null;
		CommonTree n=null;
		Type t =null;

		try {
			// antlr/NeptuneGenerator.g:238:2: (t= and_or_expr | ^( BECOMES x= IDENTIFIER ( ^( ARRAY_DEF n= NUMBER ) )? expression ) )
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==AND||LA11_0==ARRAY_SET||LA11_0==BLOCK||LA11_0==CHAR_LITERAL||LA11_0==DIVIDE||(LA11_0 >= EQ && LA11_0 <= FALSE)||(LA11_0 >= GT && LA11_0 <= IDENTIFIER)||(LA11_0 >= LT && LA11_0 <= PRINT)||LA11_0==READ||LA11_0==STRING_LITERAL||(LA11_0 >= TIMES && LA11_0 <= UNARY_PLUS)) ) {
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
					// antlr/NeptuneGenerator.g:238:4: t= and_or_expr
					{
					pushFollow(FOLLOW_and_or_expr_in_assignment_expr456);
					t=and_or_expr();
					state._fsp--;

					type=t;
					}
					break;
				case 2 :
					// antlr/NeptuneGenerator.g:239:4: ^( BECOMES x= IDENTIFIER ( ^( ARRAY_DEF n= NUMBER ) )? expression )
					{
					 int index = -1; 
					match(input,BECOMES,FOLLOW_BECOMES_in_assignment_expr466); 
					match(input, Token.DOWN, null); 
					x=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_assignment_expr470); 
					// antlr/NeptuneGenerator.g:239:47: ( ^( ARRAY_DEF n= NUMBER ) )?
					int alt10=2;
					int LA10_0 = input.LA(1);
					if ( (LA10_0==ARRAY_DEF) ) {
						alt10=1;
					}
					switch (alt10) {
						case 1 :
							// antlr/NeptuneGenerator.g:239:48: ^( ARRAY_DEF n= NUMBER )
							{
							match(input,ARRAY_DEF,FOLLOW_ARRAY_DEF_in_assignment_expr474); 
							match(input, Token.DOWN, null); 
							n=(CommonTree)match(input,NUMBER,FOLLOW_NUMBER_in_assignment_expr478); 
							 index = Integer.parseInt((n!=null?n.getText():null)); 
							match(input, Token.UP, null); 

							}
							break;

					}

					pushFollow(FOLLOW_expression_in_assignment_expr485);
					expression();
					state._fsp--;

					match(input, Token.UP, null); 


							IdEntry var = symtab.retrieve((x!=null?x.getText():null));
							
							if(var.getType().isArray && index == -1) {
								for(int i = 0; i < var.getType().elemCount; i++) {
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
	// antlr/NeptuneGenerator.g:256:1: and_or_expr returns [Type type = null] : (t= boolean_expr | ^( AND expression expression ) | ^( OR expression expression ) );
	public final Type and_or_expr() throws RecognitionException {
		Type type =  null;


		Type t =null;

		try {
			// antlr/NeptuneGenerator.g:257:2: (t= boolean_expr | ^( AND expression expression ) | ^( OR expression expression ) )
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
			case MOD:
			case NEGATE:
			case NEQ:
			case NUMBER:
			case PLUS:
			case PRINT:
			case READ:
			case STRING_LITERAL:
			case TIMES:
			case TRUE:
			case UNARY_MINUS:
			case UNARY_PLUS:
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
					// antlr/NeptuneGenerator.g:257:4: t= boolean_expr
					{
					pushFollow(FOLLOW_boolean_expr_in_and_or_expr505);
					t=boolean_expr();
					state._fsp--;

					type = t;
					}
					break;
				case 2 :
					// antlr/NeptuneGenerator.g:258:4: ^( AND expression expression )
					{
					match(input,AND,FOLLOW_AND_in_and_or_expr519); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_and_or_expr521);
					expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_and_or_expr523);
					expression();
					state._fsp--;

					match(input, Token.UP, null); 


							type = new Type(Type.primitive.BOOLEAN);
							addInstruction(Instruction.BINARY("and"));
						
					}
					break;
				case 3 :
					// antlr/NeptuneGenerator.g:262:4: ^( OR expression expression )
					{
					match(input,OR,FOLLOW_OR_in_and_or_expr536); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_and_or_expr538);
					expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_and_or_expr540);
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
	// antlr/NeptuneGenerator.g:268:1: boolean_expr returns [Type type = null] : (t= plus_expr | ^( LT expression expression ) | ^( LT_EQ expression expression ) | ^( GT expression expression ) | ^( GT_EQ expression expression ) | ^( EQ expression expression ) | ^( NEQ expression expression ) );
	public final Type boolean_expr() throws RecognitionException {
		Type type =  null;


		Type t =null;

		try {
			// antlr/NeptuneGenerator.g:269:2: (t= plus_expr | ^( LT expression expression ) | ^( LT_EQ expression expression ) | ^( GT expression expression ) | ^( GT_EQ expression expression ) | ^( EQ expression expression ) | ^( NEQ expression expression ) )
			int alt13=7;
			switch ( input.LA(1) ) {
			case ARRAY_SET:
			case BLOCK:
			case CHAR_LITERAL:
			case DIVIDE:
			case FALSE:
			case IDENTIFIER:
			case MINUS:
			case MOD:
			case NEGATE:
			case NUMBER:
			case PLUS:
			case PRINT:
			case READ:
			case STRING_LITERAL:
			case TIMES:
			case TRUE:
			case UNARY_MINUS:
			case UNARY_PLUS:
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
					// antlr/NeptuneGenerator.g:269:4: t= plus_expr
					{
					pushFollow(FOLLOW_plus_expr_in_boolean_expr562);
					t=plus_expr();
					state._fsp--;

					type = t;
					}
					break;
				case 2 :
					// antlr/NeptuneGenerator.g:270:4: ^( LT expression expression )
					{
					match(input,LT,FOLLOW_LT_in_boolean_expr578); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_boolean_expr580);
					expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_boolean_expr582);
					expression();
					state._fsp--;

					match(input, Token.UP, null); 


							type = new Type(Type.primitive.BOOLEAN);
							addInstruction(Instruction.BINARY("lt"));
						
					}
					break;
				case 3 :
					// antlr/NeptuneGenerator.g:274:4: ^( LT_EQ expression expression )
					{
					match(input,LT_EQ,FOLLOW_LT_EQ_in_boolean_expr595); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_boolean_expr597);
					expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_boolean_expr599);
					expression();
					state._fsp--;

					match(input, Token.UP, null); 


							type = new Type(Type.primitive.BOOLEAN);
							addInstruction(Instruction.BINARY("le"));
						
					}
					break;
				case 4 :
					// antlr/NeptuneGenerator.g:278:4: ^( GT expression expression )
					{
					match(input,GT,FOLLOW_GT_in_boolean_expr610); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_boolean_expr612);
					expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_boolean_expr614);
					expression();
					state._fsp--;

					match(input, Token.UP, null); 


							type = new Type(Type.primitive.BOOLEAN);
							addInstruction(Instruction.BINARY("gt"));
						
					}
					break;
				case 5 :
					// antlr/NeptuneGenerator.g:282:4: ^( GT_EQ expression expression )
					{
					match(input,GT_EQ,FOLLOW_GT_EQ_in_boolean_expr626); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_boolean_expr628);
					expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_boolean_expr630);
					expression();
					state._fsp--;

					match(input, Token.UP, null); 


							type = new Type(Type.primitive.BOOLEAN);
							addInstruction(Instruction.BINARY("ge"));
						
					}
					break;
				case 6 :
					// antlr/NeptuneGenerator.g:286:4: ^( EQ expression expression )
					{
					match(input,EQ,FOLLOW_EQ_in_boolean_expr641); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_boolean_expr643);
					expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_boolean_expr645);
					expression();
					state._fsp--;

					match(input, Token.UP, null); 


							type = new Type(Type.primitive.BOOLEAN);
							addInstruction(Instruction.LOADL(1));
							addInstruction(Instruction.BINARY("eq"));
						
					}
					break;
				case 7 :
					// antlr/NeptuneGenerator.g:291:4: ^( NEQ expression expression )
					{
					match(input,NEQ,FOLLOW_NEQ_in_boolean_expr657); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_boolean_expr659);
					expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_boolean_expr661);
					expression();
					state._fsp--;

					match(input, Token.UP, null); 


							type = new Type(Type.primitive.BOOLEAN);
							addInstruction(Instruction.LOADL(1));
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
	// antlr/NeptuneGenerator.g:298:1: plus_expr returns [Type type = null] : (t= multi_expr | ^( PLUS expression expression ) | ^( MINUS expression expression ) );
	public final Type plus_expr() throws RecognitionException {
		Type type =  null;


		Type t =null;

		try {
			// antlr/NeptuneGenerator.g:299:2: (t= multi_expr | ^( PLUS expression expression ) | ^( MINUS expression expression ) )
			int alt14=3;
			switch ( input.LA(1) ) {
			case ARRAY_SET:
			case BLOCK:
			case CHAR_LITERAL:
			case DIVIDE:
			case FALSE:
			case IDENTIFIER:
			case MOD:
			case NEGATE:
			case NUMBER:
			case PRINT:
			case READ:
			case STRING_LITERAL:
			case TIMES:
			case TRUE:
			case UNARY_MINUS:
			case UNARY_PLUS:
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
					// antlr/NeptuneGenerator.g:299:4: t= multi_expr
					{
					pushFollow(FOLLOW_multi_expr_in_plus_expr684);
					t=multi_expr();
					state._fsp--;

					type=t;
					}
					break;
				case 2 :
					// antlr/NeptuneGenerator.g:300:4: ^( PLUS expression expression )
					{
					match(input,PLUS,FOLLOW_PLUS_in_plus_expr698); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_plus_expr700);
					expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_plus_expr702);
					expression();
					state._fsp--;

					match(input, Token.UP, null); 


							type = new Type(Type.primitive.INTEGER);
							addInstruction(Instruction.ADD());
						
					}
					break;
				case 3 :
					// antlr/NeptuneGenerator.g:304:4: ^( MINUS expression expression )
					{
					match(input,MINUS,FOLLOW_MINUS_in_plus_expr712); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_plus_expr714);
					expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_plus_expr716);
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
	// antlr/NeptuneGenerator.g:310:1: multi_expr returns [Type type = null] : (t= unary_expr | ^( TIMES expression expression ) | ^( DIVIDE expression expression ) | ^( MOD expression expression ) );
	public final Type multi_expr() throws RecognitionException {
		Type type =  null;


		Type t =null;

		try {
			// antlr/NeptuneGenerator.g:311:2: (t= unary_expr | ^( TIMES expression expression ) | ^( DIVIDE expression expression ) | ^( MOD expression expression ) )
			int alt15=4;
			switch ( input.LA(1) ) {
			case ARRAY_SET:
			case BLOCK:
			case CHAR_LITERAL:
			case FALSE:
			case IDENTIFIER:
			case NEGATE:
			case NUMBER:
			case PRINT:
			case READ:
			case STRING_LITERAL:
			case TRUE:
			case UNARY_MINUS:
			case UNARY_PLUS:
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
			case MOD:
				{
				alt15=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				throw nvae;
			}
			switch (alt15) {
				case 1 :
					// antlr/NeptuneGenerator.g:311:4: t= unary_expr
					{
					pushFollow(FOLLOW_unary_expr_in_multi_expr737);
					t=unary_expr();
					state._fsp--;

					type=t;
					}
					break;
				case 2 :
					// antlr/NeptuneGenerator.g:312:4: ^( TIMES expression expression )
					{
					match(input,TIMES,FOLLOW_TIMES_in_multi_expr750); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_multi_expr752);
					expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_multi_expr754);
					expression();
					state._fsp--;

					match(input, Token.UP, null); 


							type = new Type(Type.primitive.INTEGER);
							addInstruction(Instruction.MULT());
						
					}
					break;
				case 3 :
					// antlr/NeptuneGenerator.g:316:4: ^( DIVIDE expression expression )
					{
					match(input,DIVIDE,FOLLOW_DIVIDE_in_multi_expr763); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_multi_expr765);
					expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_multi_expr767);
					expression();
					state._fsp--;

					match(input, Token.UP, null); 


							type = new Type(Type.primitive.INTEGER);
							addInstruction(Instruction.DIV());
						
					}
					break;
				case 4 :
					// antlr/NeptuneGenerator.g:320:4: ^( MOD expression expression )
					{
					match(input,MOD,FOLLOW_MOD_in_multi_expr776); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_multi_expr778);
					expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_multi_expr780);
					expression();
					state._fsp--;

					match(input, Token.UP, null); 


							type = new Type(Type.primitive.INTEGER);
							addInstruction(Instruction.BINARY("mod"));
						
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
	// antlr/NeptuneGenerator.g:326:1: unary_expr returns [Type type = new Type(Type.primitive.VOID) ] : (t= operand | ^( UNARY_MINUS o= expression ) | ^( UNARY_PLUS o= expression ) | ^( NEGATE o= expression ) );
	public final Type unary_expr() throws RecognitionException {
		Type type =  new Type(Type.primitive.VOID);


		Type t =null;
		Type o =null;

		try {
			// antlr/NeptuneGenerator.g:327:2: (t= operand | ^( UNARY_MINUS o= expression ) | ^( UNARY_PLUS o= expression ) | ^( NEGATE o= expression ) )
			int alt16=4;
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
				alt16=1;
				}
				break;
			case UNARY_MINUS:
				{
				alt16=2;
				}
				break;
			case UNARY_PLUS:
				{
				alt16=3;
				}
				break;
			case NEGATE:
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
					// antlr/NeptuneGenerator.g:327:4: t= operand
					{
					pushFollow(FOLLOW_operand_in_unary_expr802);
					t=operand();
					state._fsp--;

					type = t;
					}
					break;
				case 2 :
					// antlr/NeptuneGenerator.g:328:4: ^( UNARY_MINUS o= expression )
					{
					match(input,UNARY_MINUS,FOLLOW_UNARY_MINUS_in_unary_expr817); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_unary_expr821);
					o=expression();
					state._fsp--;

					match(input, Token.UP, null); 


							type = o;
							addInstruction(Instruction.BINARY("neg"));
						
					}
					break;
				case 3 :
					// antlr/NeptuneGenerator.g:332:4: ^( UNARY_PLUS o= expression )
					{
					match(input,UNARY_PLUS,FOLLOW_UNARY_PLUS_in_unary_expr830); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_unary_expr834);
					o=expression();
					state._fsp--;

					match(input, Token.UP, null); 


							type = o;
						
					}
					break;
				case 4 :
					// antlr/NeptuneGenerator.g:335:4: ^( NEGATE o= expression )
					{
					match(input,NEGATE,FOLLOW_NEGATE_in_unary_expr843); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_unary_expr847);
					o=expression();
					state._fsp--;

					match(input, Token.UP, null); 


							type = o;
							addInstruction(Instruction.BINARY("not"));
						
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
	// antlr/NeptuneGenerator.g:341:1: operand returns [Type type=null] : (x= IDENTIFIER ( ^( ARRAY_DEF n= NUMBER ) )? |n= NUMBER | ^( ARRAY_SET (t= expression )+ ) | TRUE | FALSE |c= CHAR_LITERAL |s= STRING_LITERAL |t= codeblock |t= print_statement |t= read_statement );
	public final Type operand() throws RecognitionException {
		Type type = null;


		CommonTree x=null;
		CommonTree n=null;
		CommonTree c=null;
		CommonTree s=null;
		Type t =null;

		try {
			// antlr/NeptuneGenerator.g:342:2: (x= IDENTIFIER ( ^( ARRAY_DEF n= NUMBER ) )? |n= NUMBER | ^( ARRAY_SET (t= expression )+ ) | TRUE | FALSE |c= CHAR_LITERAL |s= STRING_LITERAL |t= codeblock |t= print_statement |t= read_statement )
			int alt19=10;
			switch ( input.LA(1) ) {
			case IDENTIFIER:
				{
				alt19=1;
				}
				break;
			case NUMBER:
				{
				alt19=2;
				}
				break;
			case ARRAY_SET:
				{
				alt19=3;
				}
				break;
			case TRUE:
				{
				alt19=4;
				}
				break;
			case FALSE:
				{
				alt19=5;
				}
				break;
			case CHAR_LITERAL:
				{
				alt19=6;
				}
				break;
			case STRING_LITERAL:
				{
				alt19=7;
				}
				break;
			case BLOCK:
				{
				alt19=8;
				}
				break;
			case PRINT:
				{
				alt19=9;
				}
				break;
			case READ:
				{
				alt19=10;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 19, 0, input);
				throw nvae;
			}
			switch (alt19) {
				case 1 :
					// antlr/NeptuneGenerator.g:342:4: x= IDENTIFIER ( ^( ARRAY_DEF n= NUMBER ) )?
					{
					 int index = -1; 
					x=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_operand869); 
					// antlr/NeptuneGenerator.g:342:37: ( ^( ARRAY_DEF n= NUMBER ) )?
					int alt17=2;
					int LA17_0 = input.LA(1);
					if ( (LA17_0==ARRAY_DEF) ) {
						alt17=1;
					}
					switch (alt17) {
						case 1 :
							// antlr/NeptuneGenerator.g:342:38: ^( ARRAY_DEF n= NUMBER )
							{
							match(input,ARRAY_DEF,FOLLOW_ARRAY_DEF_in_operand873); 
							match(input, Token.DOWN, null); 
							n=(CommonTree)match(input,NUMBER,FOLLOW_NUMBER_in_operand877); 
							 index = Integer.parseInt((n!=null?n.getText():null)); 
							match(input, Token.UP, null); 

							}
							break;

					}


							IdEntry var = symtab.retrieve((x!=null?x.getText():null));
							type = new Type(var.getType().type);
							type.isArray = var.getType().isArray;
							type.elemCount = var.getType().elemCount;
							
							if(index > -1) {
								type.isArray = false;
							}
							
							if(index == -1) {
								index = 0;
							}
							
							if(type.isArray) {
								for(int i = type.elemCount - 1; i >= 0; i--) {
									addInstruction(Instruction.LOAD(var.getAddress() + i, type));
								}
							}else{
								addInstruction(Instruction.LOAD(var.getAddress() + index, var.getType()));
							}
						
					}
					break;
				case 2 :
					// antlr/NeptuneGenerator.g:364:4: n= NUMBER
					{
					n=(CommonTree)match(input,NUMBER,FOLLOW_NUMBER_in_operand891); 

							type = new Type(Type.primitive.INTEGER);
							addInstruction(Instruction.LOADL(Integer.parseInt((n!=null?n.getText():null))));
						
					}
					break;
				case 3 :
					// antlr/NeptuneGenerator.g:368:4: ^( ARRAY_SET (t= expression )+ )
					{
					ArrayList<ArrayList<Instruction>> tmp_instructions = new ArrayList<ArrayList<Instruction>>(); int index = 0;
					match(input,ARRAY_SET,FOLLOW_ARRAY_SET_in_operand907); 
					match(input, Token.DOWN, null); 
					// antlr/NeptuneGenerator.g:368:127: (t= expression )+
					int cnt18=0;
					loop18:
					while (true) {
						int alt18=2;
						int LA18_0 = input.LA(1);
						if ( (LA18_0==AND||(LA18_0 >= ARRAY_SET && LA18_0 <= BLOCK)||LA18_0==CHAR_LITERAL||LA18_0==DIVIDE||(LA18_0 >= EQ && LA18_0 <= FALSE)||(LA18_0 >= GT && LA18_0 <= IDENTIFIER)||(LA18_0 >= LT && LA18_0 <= PRINT)||LA18_0==READ||LA18_0==STRING_LITERAL||(LA18_0 >= TIMES && LA18_0 <= UNARY_PLUS)) ) {
							alt18=1;
						}

						switch (alt18) {
						case 1 :
							// antlr/NeptuneGenerator.g:368:128: t= expression
							{
							program.markInstructionStart(); index++;
							pushFollow(FOLLOW_expression_in_operand913);
							t=expression();
							state._fsp--;


									type = t;
									tmp_instructions.add(program.popLastInstructions());
								
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

					 
							for(int i = tmp_instructions.size() - 1; i >= 0; i--){
								program.addMultiple(tmp_instructions.get(i));
							}
							t.isArray = true;
							t.elemCount = index;
						
					}
					break;
				case 4 :
					// antlr/NeptuneGenerator.g:378:4: TRUE
					{
					match(input,TRUE,FOLLOW_TRUE_in_operand926); 

							type = new Type(Type.primitive.BOOLEAN);
							addInstruction(Instruction.LOADL(1));
						
					}
					break;
				case 5 :
					// antlr/NeptuneGenerator.g:382:4: FALSE
					{
					match(input,FALSE,FOLLOW_FALSE_in_operand940); 

							type = new Type(Type.primitive.BOOLEAN);
							addInstruction(Instruction.LOADL(0));
						
					}
					break;
				case 6 :
					// antlr/NeptuneGenerator.g:386:4: c= CHAR_LITERAL
					{
					c=(CommonTree)match(input,CHAR_LITERAL,FOLLOW_CHAR_LITERAL_in_operand955); 

							type = new Type(Type.primitive.CHAR);
							addInstruction(Instruction.LOADL((int)(c!=null?c.getText():null).charAt(1)));
						
					}
					break;
				case 7 :
					// antlr/NeptuneGenerator.g:390:4: s= STRING_LITERAL
					{
					s=(CommonTree)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_operand969); 

							type = new Type(Type.primitive.CHAR, 0);
							String ts = (s!=null?s.getText():null);
							ts = ts.substring(1, ts.length()-1);
							for(int i = ts.length() - 1; i >= 0; i--) {
								addInstruction(Instruction.LOADL((int)ts.charAt(i)));
							}
							type.elemCount = ts.length();
							type.isArray = true;
						
					}
					break;
				case 8 :
					// antlr/NeptuneGenerator.g:400:4: t= codeblock
					{
					pushFollow(FOLLOW_codeblock_in_operand981);
					t=codeblock();
					state._fsp--;

					type = t;
					}
					break;
				case 9 :
					// antlr/NeptuneGenerator.g:401:4: t= print_statement
					{
					pushFollow(FOLLOW_print_statement_in_operand1000);
					t=print_statement();
					state._fsp--;

					type = t;
					}
					break;
				case 10 :
					// antlr/NeptuneGenerator.g:402:4: t= read_statement
					{
					pushFollow(FOLLOW_read_statement_in_operand1012);
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
	// antlr/NeptuneGenerator.g:405:1: type returns [Type type = null] : ( INTEGER (count= array_def )? | CHAR (count= array_def )? | BOOLEAN (count= array_def )? );
	public final Type type() throws RecognitionException {
		Type type =  null;


		int count =0;

		try {
			// antlr/NeptuneGenerator.g:406:2: ( INTEGER (count= array_def )? | CHAR (count= array_def )? | BOOLEAN (count= array_def )? )
			int alt23=3;
			switch ( input.LA(1) ) {
			case INTEGER:
				{
				alt23=1;
				}
				break;
			case CHAR:
				{
				alt23=2;
				}
				break;
			case BOOLEAN:
				{
				alt23=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 23, 0, input);
				throw nvae;
			}
			switch (alt23) {
				case 1 :
					// antlr/NeptuneGenerator.g:406:4: INTEGER (count= array_def )?
					{
					match(input,INTEGER,FOLLOW_INTEGER_in_type1032); 
					// antlr/NeptuneGenerator.g:406:17: (count= array_def )?
					int alt20=2;
					int LA20_0 = input.LA(1);
					if ( (LA20_0==ARRAY_DEF) ) {
						alt20=1;
					}
					switch (alt20) {
						case 1 :
							// antlr/NeptuneGenerator.g:406:17: count= array_def
							{
							pushFollow(FOLLOW_array_def_in_type1036);
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
					// antlr/NeptuneGenerator.g:412:4: CHAR (count= array_def )?
					{
					match(input,CHAR,FOLLOW_CHAR_in_type1044); 
					// antlr/NeptuneGenerator.g:412:14: (count= array_def )?
					int alt21=2;
					int LA21_0 = input.LA(1);
					if ( (LA21_0==ARRAY_DEF) ) {
						alt21=1;
					}
					switch (alt21) {
						case 1 :
							// antlr/NeptuneGenerator.g:412:14: count= array_def
							{
							pushFollow(FOLLOW_array_def_in_type1048);
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
					// antlr/NeptuneGenerator.g:418:4: BOOLEAN (count= array_def )?
					{
					match(input,BOOLEAN,FOLLOW_BOOLEAN_in_type1056); 
					// antlr/NeptuneGenerator.g:418:17: (count= array_def )?
					int alt22=2;
					int LA22_0 = input.LA(1);
					if ( (LA22_0==ARRAY_DEF) ) {
						alt22=1;
					}
					switch (alt22) {
						case 1 :
							// antlr/NeptuneGenerator.g:418:17: count= array_def
							{
							pushFollow(FOLLOW_array_def_in_type1060);
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
	// antlr/NeptuneGenerator.g:426:1: array_def returns [int count = 0] : ^( ARRAY_DEF x= NUMBER ) ;
	public final int array_def() throws RecognitionException {
		int count =  0;


		CommonTree x=null;

		try {
			// antlr/NeptuneGenerator.g:427:2: ( ^( ARRAY_DEF x= NUMBER ) )
			// antlr/NeptuneGenerator.g:427:4: ^( ARRAY_DEF x= NUMBER )
			{
			match(input,ARRAY_DEF,FOLLOW_ARRAY_DEF_in_array_def1079); 
			match(input, Token.DOWN, null); 
			x=(CommonTree)match(input,NUMBER,FOLLOW_NUMBER_in_array_def1083); 
			 count = Integer.parseInt((x!=null?x.getText():null)); 
			match(input, Token.UP, null); 

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
	public static final BitSet FOLLOW_line_in_lines70 = new BitSet(new long[]{0xBD10FFC07B8289D2L,0x0000000000000001L});
	public static final BitSet FOLLOW_expression_in_line90 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declaration_in_line97 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_logic_statement_in_line104 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BLOCK_in_codeblock122 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_lines_in_codeblock126 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_while_statement_in_logic_statement140 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_foreach_statement_in_logic_statement145 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_if_statement_in_logic_statement150 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHILE_in_while_statement168 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_while_statement172 = new BitSet(new long[]{0xBD10FFC07B8289D0L,0x0000000000000001L});
	public static final BitSet FOLLOW_lines_in_while_statement176 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FOREACH_in_foreach_statement199 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_foreach_statement203 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_foreach_statement209 = new BitSet(new long[]{0xBD10FFC07B8289D0L,0x0000000000000001L});
	public static final BitSet FOLLOW_lines_in_foreach_statement217 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_IF_in_if_statement241 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_if_statement243 = new BitSet(new long[]{0xBD10FFC07B8289D0L,0x0000000000000001L});
	public static final BitSet FOLLOW_lines_in_if_statement247 = new BitSet(new long[]{0x0000000000600008L});
	public static final BitSet FOLLOW_ELSIF_in_if_statement254 = new BitSet(new long[]{0x3D10FFC0398209D0L});
	public static final BitSet FOLLOW_expression_in_if_statement258 = new BitSet(new long[]{0xBD10FFC07B8289D0L,0x0000000000000001L});
	public static final BitSet FOLLOW_lines_in_if_statement262 = new BitSet(new long[]{0x0000000000600008L});
	public static final BitSet FOLLOW_ELSE_in_if_statement272 = new BitSet(new long[]{0xBD10FFC07B8289D0L,0x0000000000000001L});
	public static final BitSet FOLLOW_lines_in_if_statement276 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PRINT_in_print_statement305 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_print_statement309 = new BitSet(new long[]{0x0000000000002008L});
	public static final BitSet FOLLOW_COMMA_in_print_statement314 = new BitSet(new long[]{0x3D10FFC0398209D0L});
	public static final BitSet FOLLOW_expression_in_print_statement318 = new BitSet(new long[]{0x0000000000002008L});
	public static final BitSet FOLLOW_READ_in_read_statement345 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_read_statement350 = new BitSet(new long[]{0x0000000000002008L});
	public static final BitSet FOLLOW_COMMA_in_read_statement356 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_read_statement360 = new BitSet(new long[]{0x0000000000002008L});
	public static final BitSet FOLLOW_VAR_in_declaration378 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_type_in_declaration382 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_declaration386 = new BitSet(new long[]{0x0000000000000088L});
	public static final BitSet FOLLOW_BECOMES_in_declaration391 = new BitSet(new long[]{0x3D10FFC0398209D0L});
	public static final BitSet FOLLOW_expression_in_declaration393 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_CONST_in_declaration405 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_type_in_declaration409 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_declaration413 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_BECOMES_in_declaration415 = new BitSet(new long[]{0x3D10FFC0398209D0L});
	public static final BitSet FOLLOW_expression_in_declaration417 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_assignment_expr_in_expression437 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_and_or_expr_in_assignment_expr456 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BECOMES_in_assignment_expr466 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_assignment_expr470 = new BitSet(new long[]{0x3D10FFC0398209F0L});
	public static final BitSet FOLLOW_ARRAY_DEF_in_assignment_expr474 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_NUMBER_in_assignment_expr478 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_expression_in_assignment_expr485 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_boolean_expr_in_and_or_expr505 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AND_in_and_or_expr519 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_and_or_expr521 = new BitSet(new long[]{0x3D10FFC0398209D0L});
	public static final BitSet FOLLOW_expression_in_and_or_expr523 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_OR_in_and_or_expr536 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_and_or_expr538 = new BitSet(new long[]{0x3D10FFC0398209D0L});
	public static final BitSet FOLLOW_expression_in_and_or_expr540 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_plus_expr_in_boolean_expr562 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LT_in_boolean_expr578 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_boolean_expr580 = new BitSet(new long[]{0x3D10FFC0398209D0L});
	public static final BitSet FOLLOW_expression_in_boolean_expr582 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LT_EQ_in_boolean_expr595 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_boolean_expr597 = new BitSet(new long[]{0x3D10FFC0398209D0L});
	public static final BitSet FOLLOW_expression_in_boolean_expr599 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_GT_in_boolean_expr610 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_boolean_expr612 = new BitSet(new long[]{0x3D10FFC0398209D0L});
	public static final BitSet FOLLOW_expression_in_boolean_expr614 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_GT_EQ_in_boolean_expr626 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_boolean_expr628 = new BitSet(new long[]{0x3D10FFC0398209D0L});
	public static final BitSet FOLLOW_expression_in_boolean_expr630 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_EQ_in_boolean_expr641 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_boolean_expr643 = new BitSet(new long[]{0x3D10FFC0398209D0L});
	public static final BitSet FOLLOW_expression_in_boolean_expr645 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NEQ_in_boolean_expr657 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_boolean_expr659 = new BitSet(new long[]{0x3D10FFC0398209D0L});
	public static final BitSet FOLLOW_expression_in_boolean_expr661 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_multi_expr_in_plus_expr684 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PLUS_in_plus_expr698 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_plus_expr700 = new BitSet(new long[]{0x3D10FFC0398209D0L});
	public static final BitSet FOLLOW_expression_in_plus_expr702 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MINUS_in_plus_expr712 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_plus_expr714 = new BitSet(new long[]{0x3D10FFC0398209D0L});
	public static final BitSet FOLLOW_expression_in_plus_expr716 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_unary_expr_in_multi_expr737 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIMES_in_multi_expr750 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_multi_expr752 = new BitSet(new long[]{0x3D10FFC0398209D0L});
	public static final BitSet FOLLOW_expression_in_multi_expr754 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DIVIDE_in_multi_expr763 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_multi_expr765 = new BitSet(new long[]{0x3D10FFC0398209D0L});
	public static final BitSet FOLLOW_expression_in_multi_expr767 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MOD_in_multi_expr776 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_multi_expr778 = new BitSet(new long[]{0x3D10FFC0398209D0L});
	public static final BitSet FOLLOW_expression_in_multi_expr780 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_operand_in_unary_expr802 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_UNARY_MINUS_in_unary_expr817 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_unary_expr821 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_UNARY_PLUS_in_unary_expr830 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_unary_expr834 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NEGATE_in_unary_expr843 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_unary_expr847 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_IDENTIFIER_in_operand869 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_ARRAY_DEF_in_operand873 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_NUMBER_in_operand877 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NUMBER_in_operand891 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ARRAY_SET_in_operand907 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_operand913 = new BitSet(new long[]{0x3D10FFC0398209D8L});
	public static final BitSet FOLLOW_TRUE_in_operand926 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FALSE_in_operand940 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_LITERAL_in_operand955 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_operand969 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_codeblock_in_operand981 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_print_statement_in_operand1000 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_read_statement_in_operand1012 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTEGER_in_type1032 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_array_def_in_type1036 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_in_type1044 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_array_def_in_type1048 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOLEAN_in_type1056 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_array_def_in_type1060 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ARRAY_DEF_in_array_def1079 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_NUMBER_in_array_def1083 = new BitSet(new long[]{0x0000000000000008L});
}

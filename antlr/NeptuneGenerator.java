// $ANTLR 3.5.2 antlr/NeptuneGenerator.g 2014-07-01 13:38:19

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
		"RPAREN", "SEMICOLON", "SIZEOF", "STRING_LITERAL", "THEN", "TIMES", "TRUE", 
		"UNARY_MINUS", "UNARY_PLUS", "UPPER", "VAR", "WHILE", "WS"
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
	public static final int SIZEOF=56;
	public static final int STRING_LITERAL=57;
	public static final int THEN=58;
	public static final int TIMES=59;
	public static final int TRUE=60;
	public static final int UNARY_MINUS=61;
	public static final int UNARY_PLUS=62;
	public static final int UPPER=63;
	public static final int VAR=64;
	public static final int WHILE=65;
	public static final int WS=66;

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
		
		protected int newUniqueLabel() {
			return labelCounter++;
		}




	// $ANTLR start "program"
	// antlr/NeptuneGenerator.g:49:1: program : ^( PROGRAM lines ) ;
	public final void program() throws RecognitionException {
		try {
			// antlr/NeptuneGenerator.g:50:2: ( ^( PROGRAM lines ) )
			// antlr/NeptuneGenerator.g:50:4: ^( PROGRAM lines )
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
	// antlr/NeptuneGenerator.g:53:1: lines returns [ Type type = new Type(Type.primitive.VOID)] : (t= line )+ ;
	public final Type lines() throws RecognitionException {
		Type type =  new Type(Type.primitive.VOID);


		Type t =null;

		try {
			// antlr/NeptuneGenerator.g:54:2: ( (t= line )+ )
			// antlr/NeptuneGenerator.g:54:4: (t= line )+
			{
			// antlr/NeptuneGenerator.g:54:5: (t= line )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==AND||(LA1_0 >= ARRAY_SET && LA1_0 <= BLOCK)||LA1_0==CHAR_LITERAL||LA1_0==CONST||LA1_0==DIVIDE||(LA1_0 >= EQ && LA1_0 <= IF)||(LA1_0 >= LT && LA1_0 <= PRINT)||LA1_0==READ||(LA1_0 >= SIZEOF && LA1_0 <= STRING_LITERAL)||(LA1_0 >= TIMES && LA1_0 <= UNARY_PLUS)||(LA1_0 >= VAR && LA1_0 <= WHILE)) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// antlr/NeptuneGenerator.g:54:5: t= line
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
	// antlr/NeptuneGenerator.g:57:1: line returns [Type type = new Type(Type.primitive.VOID)] : (t= expression | declaration | logic_statement );
	public final Type line() throws RecognitionException {
		Type type =  new Type(Type.primitive.VOID);


		Type t =null;

		try {
			// antlr/NeptuneGenerator.g:58:2: (t= expression | declaration | logic_statement )
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
			case FUNCTION:
				{
				int LA2_2 = input.LA(2);
				if ( (LA2_2==DOWN) ) {
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
							new NoViableAltException("", 2, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

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
					// antlr/NeptuneGenerator.g:58:4: t= expression
					{
					pushFollow(FOLLOW_expression_in_line90);
					t=expression();
					state._fsp--;

					type=t;
					}
					break;
				case 2 :
					// antlr/NeptuneGenerator.g:59:4: declaration
					{
					pushFollow(FOLLOW_declaration_in_line97);
					declaration();
					state._fsp--;

					type = new Type(Type.primitive.VOID);
					}
					break;
				case 3 :
					// antlr/NeptuneGenerator.g:60:4: logic_statement
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
	// antlr/NeptuneGenerator.g:63:1: codeblock returns [Type type = null] : ^( BLOCK lines ) ;
	public final Type codeblock() throws RecognitionException {
		Type type =  null;


		try {
			// antlr/NeptuneGenerator.g:64:2: ( ^( BLOCK lines ) )
			// antlr/NeptuneGenerator.g:64:4: ^( BLOCK lines )
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
	// antlr/NeptuneGenerator.g:67:1: logic_statement : ( while_statement | foreach_statement | if_statement );
	public final void logic_statement() throws RecognitionException {
		try {
			// antlr/NeptuneGenerator.g:68:2: ( while_statement | foreach_statement | if_statement )
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
					// antlr/NeptuneGenerator.g:68:4: while_statement
					{
					pushFollow(FOLLOW_while_statement_in_logic_statement140);
					while_statement();
					state._fsp--;

					}
					break;
				case 2 :
					// antlr/NeptuneGenerator.g:69:4: foreach_statement
					{
					pushFollow(FOLLOW_foreach_statement_in_logic_statement145);
					foreach_statement();
					state._fsp--;

					}
					break;
				case 3 :
					// antlr/NeptuneGenerator.g:70:4: if_statement
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
	// antlr/NeptuneGenerator.g:73:1: while_statement : ^( WHILE expression lines ) ;
	public final void while_statement() throws RecognitionException {
		 int beginLabel = newUniqueLabel(); int endLabel = newUniqueLabel(); 
		try {
			// antlr/NeptuneGenerator.g:75:2: ( ^( WHILE expression lines ) )
			// antlr/NeptuneGenerator.g:75:4: ^( WHILE expression lines )
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
	// antlr/NeptuneGenerator.g:88:1: foreach_statement : ^( FOREACH x= IDENTIFIER y= IDENTIFIER lines ) ;
	public final void foreach_statement() throws RecognitionException {
		CommonTree x=null;
		CommonTree y=null;

		int count = 0; int lastlabel = 0;
		try {
			// antlr/NeptuneGenerator.g:90:2: ( ^( FOREACH x= IDENTIFIER y= IDENTIFIER lines ) )
			// antlr/NeptuneGenerator.g:90:4: ^( FOREACH x= IDENTIFIER y= IDENTIFIER lines )
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

					lastlabel = newUniqueLabel();
					addInstruction(Instruction.LABEL(lastlabel));

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
					int endLabel = newUniqueLabel();
					addInstruction(Instruction.JUMPIF(count, endLabel));
					addInstruction(Instruction.JUMP(lastlabel));
					addInstruction(Instruction.LABEL(endLabel));
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
	// antlr/NeptuneGenerator.g:123:1: if_statement : ^( IF expression lines ( ELSIF expression lines )* ( ELSE lines )? ) ;
	public final void if_statement() throws RecognitionException {
		 int endLabel = newUniqueLabel(); int nextLabel = newUniqueLabel(); boolean containsElse = false; 
		try {
			// antlr/NeptuneGenerator.g:125:2: ( ^( IF expression lines ( ELSIF expression lines )* ( ELSE lines )? ) )
			// antlr/NeptuneGenerator.g:125:4: ^( IF expression lines ( ELSIF expression lines )* ( ELSE lines )? )
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
				
			// antlr/NeptuneGenerator.g:132:3: ( ELSIF expression lines )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==ELSIF) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// antlr/NeptuneGenerator.g:132:4: ELSIF expression lines
					{
					match(input,ELSIF,FOLLOW_ELSIF_in_if_statement254); 

								addInstruction(Instruction.LABEL(nextLabel));
								nextLabel = newUniqueLabel();
							
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

			// antlr/NeptuneGenerator.g:142:3: ( ELSE lines )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==ELSE) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// antlr/NeptuneGenerator.g:142:4: ELSE lines
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
	// antlr/NeptuneGenerator.g:154:1: print_statement returns [Type type = new Type(Type.primitive.VOID)] : ^( PRINT t= expression ( COMMA t2= expression )* ) ;
	public final Type print_statement() throws RecognitionException {
		Type type =  new Type(Type.primitive.VOID);


		Type t =null;
		Type t2 =null;

		boolean one=true;
		try {
			// antlr/NeptuneGenerator.g:156:2: ( ^( PRINT t= expression ( COMMA t2= expression )* ) )
			// antlr/NeptuneGenerator.g:156:4: ^( PRINT t= expression ( COMMA t2= expression )* )
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
				
			// antlr/NeptuneGenerator.g:167:4: ( COMMA t2= expression )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==COMMA) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// antlr/NeptuneGenerator.g:167:5: COMMA t2= expression
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
	// antlr/NeptuneGenerator.g:194:1: read_statement returns [Type type = new Type(Type.primitive.VOID)] : ^( READ (t= IDENTIFIER ) ( COMMA t2= IDENTIFIER )* ) ;
	public final Type read_statement() throws RecognitionException {
		Type type =  new Type(Type.primitive.VOID);


		CommonTree t=null;
		CommonTree t2=null;

		boolean one=true;
		try {
			// antlr/NeptuneGenerator.g:196:2: ( ^( READ (t= IDENTIFIER ) ( COMMA t2= IDENTIFIER )* ) )
			// antlr/NeptuneGenerator.g:196:4: ^( READ (t= IDENTIFIER ) ( COMMA t2= IDENTIFIER )* )
			{
			match(input,READ,FOLLOW_READ_in_read_statement345); 
			match(input, Token.DOWN, null); 
			// antlr/NeptuneGenerator.g:196:11: (t= IDENTIFIER )
			// antlr/NeptuneGenerator.g:196:12: t= IDENTIFIER
			{
			t=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_read_statement350); 

						IdEntry entry= symtab.retrieve((t!=null?t.getText():null));
						addTextualInstruction("LOADA " + entry.getAddress() + "[SB]", true, false);
						addInstruction(Instruction.READ(entry.getType()));

					
			}

			// antlr/NeptuneGenerator.g:201:6: ( COMMA t2= IDENTIFIER )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==COMMA) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// antlr/NeptuneGenerator.g:201:7: COMMA t2= IDENTIFIER
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
	// antlr/NeptuneGenerator.g:217:1: declaration : ( ^( VAR t= type x= IDENTIFIER ( BECOMES expression )? ) | ^( CONST t= type x= IDENTIFIER BECOMES expression ) | ^( FUNCTION t= type x= IDENTIFIER (argt= type args= IDENTIFIER )+ ( line )* return_type= return_statement ) );
	public final void declaration() throws RecognitionException {
		CommonTree x=null;
		CommonTree args=null;
		Type t =null;
		Type argt =null;
		Type return_type =null;

		try {
			// antlr/NeptuneGenerator.g:218:2: ( ^( VAR t= type x= IDENTIFIER ( BECOMES expression )? ) | ^( CONST t= type x= IDENTIFIER BECOMES expression ) | ^( FUNCTION t= type x= IDENTIFIER (argt= type args= IDENTIFIER )+ ( line )* return_type= return_statement ) )
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
					// antlr/NeptuneGenerator.g:218:4: ^( VAR t= type x= IDENTIFIER ( BECOMES expression )? )
					{
					match(input,VAR,FOLLOW_VAR_in_declaration378); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_type_in_declaration382);
					t=type();
					state._fsp--;

					x=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_declaration386); 
					 declare((x!=null?x.getText():null), t); 
					// antlr/NeptuneGenerator.g:218:55: ( BECOMES expression )?
					int alt8=2;
					int LA8_0 = input.LA(1);
					if ( (LA8_0==BECOMES) ) {
						alt8=1;
					}
					switch (alt8) {
						case 1 :
							// antlr/NeptuneGenerator.g:218:56: BECOMES expression
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
					// antlr/NeptuneGenerator.g:229:4: ^( CONST t= type x= IDENTIFIER BECOMES expression )
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
				case 3 :
					// antlr/NeptuneGenerator.g:233:4: ^( FUNCTION t= type x= IDENTIFIER (argt= type args= IDENTIFIER )+ ( line )* return_type= return_statement )
					{
					match(input,FUNCTION,FOLLOW_FUNCTION_in_declaration426); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_type_in_declaration433);
					t=type();
					state._fsp--;

					x=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_declaration437); 

							int argcount=1; 
							String expression_label = (x!=null?x.getText():null) +"0";
							String jump_over_label = (x!=null?x.getText():null) +"1";
							// jump over the function code
							addInstruction(Instruction.JUMP(jump_over_label));
							//add the expression label for function calls
							//TODO: STORE FUNCTION ADDRESS IN FUNCTION TABLE
							addInstruction(Instruction.LABEL(expression_label));
							
					// antlr/NeptuneGenerator.g:245:3: (argt= type args= IDENTIFIER )+
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
							// antlr/NeptuneGenerator.g:246:3: argt= type args= IDENTIFIER
							{
							pushFollow(FOLLOW_type_in_declaration452);
							argt=type();
							state._fsp--;

							args=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_declaration456); 

										//arguments are on top of the stack
										symtab.openScope(); 
										declare((args!=null?args.getText():null), argt);

										//store the argument value on top of the stack into the local variables
										//TODO: wrong order
										addTextualInstruction("LOAD(1) -"+argcount+"[LB]", true, false);
										IdEntry arg = symtab.retrieve((args!=null?args.getText():null));
										addInstruction(Instruction.STORE(arg.getAddress(), arg.getType())); 

										argcount++;
									
							}
							break;

						default :
							if ( cnt9 >= 1 ) break loop9;
							EarlyExitException eee = new EarlyExitException(9, input);
							throw eee;
						}
						cnt9++;
					}

					// antlr/NeptuneGenerator.g:260:6: ( line )*
					loop10:
					while (true) {
						int alt10=2;
						int LA10_0 = input.LA(1);
						if ( (LA10_0==AND||(LA10_0 >= ARRAY_SET && LA10_0 <= BLOCK)||LA10_0==CHAR_LITERAL||LA10_0==CONST||LA10_0==DIVIDE||(LA10_0 >= EQ && LA10_0 <= IF)||(LA10_0 >= LT && LA10_0 <= PRINT)||LA10_0==READ||(LA10_0 >= SIZEOF && LA10_0 <= STRING_LITERAL)||(LA10_0 >= TIMES && LA10_0 <= UNARY_PLUS)||(LA10_0 >= VAR && LA10_0 <= WHILE)) ) {
							alt10=1;
						}

						switch (alt10) {
						case 1 :
							// antlr/NeptuneGenerator.g:260:6: line
							{
							pushFollow(FOLLOW_line_in_declaration468);
							line();
							state._fsp--;

							}
							break;

						default :
							break loop10;
						}
					}

					pushFollow(FOLLOW_return_statement_in_declaration473);
					return_type=return_statement();
					state._fsp--;

					match(input, Token.UP, null); 


							symtab.closeScope();
							addInstruction(Instruction.RETURN(t,argcount));
							addInstruction(Instruction.LABEL(jump_over_label));

						
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
	// antlr/NeptuneGenerator.g:269:1: return_statement returns [Type type = new Type(Type.primitive.VOID)] : ^( RETURN t= expression ) ;
	public final Type return_statement() throws RecognitionException {
		Type type =  new Type(Type.primitive.VOID);


		Type t =null;

		try {
			// antlr/NeptuneGenerator.g:270:2: ( ^( RETURN t= expression ) )
			// antlr/NeptuneGenerator.g:270:4: ^( RETURN t= expression )
			{
			match(input,RETURN,FOLLOW_RETURN_in_return_statement494); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expression_in_return_statement498);
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
	// antlr/NeptuneGenerator.g:273:1: expression returns [Type type = new Type(Type.primitive.VOID)] : t= assignment_expr ;
	public final Type expression() throws RecognitionException {
		Type type =  new Type(Type.primitive.VOID);


		Type t =null;

		try {
			// antlr/NeptuneGenerator.g:274:2: (t= assignment_expr )
			// antlr/NeptuneGenerator.g:274:4: t= assignment_expr
			{
			pushFollow(FOLLOW_assignment_expr_in_expression517);
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
	// antlr/NeptuneGenerator.g:277:1: assignment_expr returns [Type type = new Type(Type.primitive.VOID)] : (t= and_or_expr | ^( BECOMES x= IDENTIFIER ( ^( ARRAY_DEF n= NUMBER ) )? expression ) );
	public final Type assignment_expr() throws RecognitionException {
		Type type =  new Type(Type.primitive.VOID);


		CommonTree x=null;
		CommonTree n=null;
		Type t =null;

		try {
			// antlr/NeptuneGenerator.g:278:2: (t= and_or_expr | ^( BECOMES x= IDENTIFIER ( ^( ARRAY_DEF n= NUMBER ) )? expression ) )
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==AND||LA13_0==ARRAY_SET||LA13_0==BLOCK||LA13_0==CHAR_LITERAL||LA13_0==DIVIDE||(LA13_0 >= EQ && LA13_0 <= FALSE)||(LA13_0 >= FUNCTION && LA13_0 <= IDENTIFIER)||(LA13_0 >= LT && LA13_0 <= PRINT)||LA13_0==READ||(LA13_0 >= SIZEOF && LA13_0 <= STRING_LITERAL)||(LA13_0 >= TIMES && LA13_0 <= UNARY_PLUS)) ) {
				alt13=1;
			}
			else if ( (LA13_0==BECOMES) ) {
				alt13=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}

			switch (alt13) {
				case 1 :
					// antlr/NeptuneGenerator.g:278:4: t= and_or_expr
					{
					pushFollow(FOLLOW_and_or_expr_in_assignment_expr536);
					t=and_or_expr();
					state._fsp--;

					type=t;
					}
					break;
				case 2 :
					// antlr/NeptuneGenerator.g:279:4: ^( BECOMES x= IDENTIFIER ( ^( ARRAY_DEF n= NUMBER ) )? expression )
					{
					 int index = -1; 
					match(input,BECOMES,FOLLOW_BECOMES_in_assignment_expr546); 
					match(input, Token.DOWN, null); 
					x=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_assignment_expr550); 
					// antlr/NeptuneGenerator.g:279:47: ( ^( ARRAY_DEF n= NUMBER ) )?
					int alt12=2;
					int LA12_0 = input.LA(1);
					if ( (LA12_0==ARRAY_DEF) ) {
						alt12=1;
					}
					switch (alt12) {
						case 1 :
							// antlr/NeptuneGenerator.g:279:48: ^( ARRAY_DEF n= NUMBER )
							{
							match(input,ARRAY_DEF,FOLLOW_ARRAY_DEF_in_assignment_expr554); 
							match(input, Token.DOWN, null); 
							n=(CommonTree)match(input,NUMBER,FOLLOW_NUMBER_in_assignment_expr558); 
							 index = Integer.parseInt((n!=null?n.getText():null)); 
							match(input, Token.UP, null); 

							}
							break;

					}

					pushFollow(FOLLOW_expression_in_assignment_expr565);
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
	// antlr/NeptuneGenerator.g:296:1: and_or_expr returns [Type type = new Type(Type.primitive.VOID)] : (t= boolean_expr | ^( AND expression expression ) | ^( OR expression expression ) );
	public final Type and_or_expr() throws RecognitionException {
		Type type =  new Type(Type.primitive.VOID);


		Type t =null;

		try {
			// antlr/NeptuneGenerator.g:297:2: (t= boolean_expr | ^( AND expression expression ) | ^( OR expression expression ) )
			int alt14=3;
			switch ( input.LA(1) ) {
			case ARRAY_SET:
			case BLOCK:
			case CHAR_LITERAL:
			case DIVIDE:
			case EQ:
			case FALSE:
			case FUNCTION:
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
			case AND:
				{
				alt14=2;
				}
				break;
			case OR:
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
					// antlr/NeptuneGenerator.g:297:4: t= boolean_expr
					{
					pushFollow(FOLLOW_boolean_expr_in_and_or_expr585);
					t=boolean_expr();
					state._fsp--;

					type = t;
					}
					break;
				case 2 :
					// antlr/NeptuneGenerator.g:298:4: ^( AND expression expression )
					{
					match(input,AND,FOLLOW_AND_in_and_or_expr599); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_and_or_expr601);
					expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_and_or_expr603);
					expression();
					state._fsp--;

					match(input, Token.UP, null); 


							type = new Type(Type.primitive.BOOLEAN);
							addInstruction(Instruction.BINARY("and"));
						
					}
					break;
				case 3 :
					// antlr/NeptuneGenerator.g:302:4: ^( OR expression expression )
					{
					match(input,OR,FOLLOW_OR_in_and_or_expr616); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_and_or_expr618);
					expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_and_or_expr620);
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
	// antlr/NeptuneGenerator.g:308:1: boolean_expr returns [Type type = new Type(Type.primitive.VOID)] : (t= plus_expr | ^( LT expression expression ) | ^( LT_EQ expression expression ) | ^( GT expression expression ) | ^( GT_EQ expression expression ) | ^( EQ expression expression ) | ^( NEQ expression expression ) );
	public final Type boolean_expr() throws RecognitionException {
		Type type =  new Type(Type.primitive.VOID);


		Type t =null;

		try {
			// antlr/NeptuneGenerator.g:309:2: (t= plus_expr | ^( LT expression expression ) | ^( LT_EQ expression expression ) | ^( GT expression expression ) | ^( GT_EQ expression expression ) | ^( EQ expression expression ) | ^( NEQ expression expression ) )
			int alt15=7;
			switch ( input.LA(1) ) {
			case ARRAY_SET:
			case BLOCK:
			case CHAR_LITERAL:
			case DIVIDE:
			case FALSE:
			case FUNCTION:
			case IDENTIFIER:
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
				alt15=1;
				}
				break;
			case LT:
				{
				alt15=2;
				}
				break;
			case LT_EQ:
				{
				alt15=3;
				}
				break;
			case GT:
				{
				alt15=4;
				}
				break;
			case GT_EQ:
				{
				alt15=5;
				}
				break;
			case EQ:
				{
				alt15=6;
				}
				break;
			case NEQ:
				{
				alt15=7;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				throw nvae;
			}
			switch (alt15) {
				case 1 :
					// antlr/NeptuneGenerator.g:309:4: t= plus_expr
					{
					pushFollow(FOLLOW_plus_expr_in_boolean_expr642);
					t=plus_expr();
					state._fsp--;

					type = t;
					}
					break;
				case 2 :
					// antlr/NeptuneGenerator.g:310:4: ^( LT expression expression )
					{
					match(input,LT,FOLLOW_LT_in_boolean_expr658); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_boolean_expr660);
					expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_boolean_expr662);
					expression();
					state._fsp--;

					match(input, Token.UP, null); 


							type = new Type(Type.primitive.BOOLEAN);
							addInstruction(Instruction.BINARY("lt"));
						
					}
					break;
				case 3 :
					// antlr/NeptuneGenerator.g:314:4: ^( LT_EQ expression expression )
					{
					match(input,LT_EQ,FOLLOW_LT_EQ_in_boolean_expr675); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_boolean_expr677);
					expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_boolean_expr679);
					expression();
					state._fsp--;

					match(input, Token.UP, null); 


							type = new Type(Type.primitive.BOOLEAN);
							addInstruction(Instruction.BINARY("le"));
						
					}
					break;
				case 4 :
					// antlr/NeptuneGenerator.g:318:4: ^( GT expression expression )
					{
					match(input,GT,FOLLOW_GT_in_boolean_expr690); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_boolean_expr692);
					expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_boolean_expr694);
					expression();
					state._fsp--;

					match(input, Token.UP, null); 


							type = new Type(Type.primitive.BOOLEAN);
							addInstruction(Instruction.BINARY("gt"));
						
					}
					break;
				case 5 :
					// antlr/NeptuneGenerator.g:322:4: ^( GT_EQ expression expression )
					{
					match(input,GT_EQ,FOLLOW_GT_EQ_in_boolean_expr706); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_boolean_expr708);
					expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_boolean_expr710);
					expression();
					state._fsp--;

					match(input, Token.UP, null); 


							type = new Type(Type.primitive.BOOLEAN);
							addInstruction(Instruction.BINARY("ge"));
						
					}
					break;
				case 6 :
					// antlr/NeptuneGenerator.g:326:4: ^( EQ expression expression )
					{
					match(input,EQ,FOLLOW_EQ_in_boolean_expr721); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_boolean_expr723);
					expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_boolean_expr725);
					expression();
					state._fsp--;

					match(input, Token.UP, null); 


							type = new Type(Type.primitive.BOOLEAN);
							addInstruction(Instruction.LOADL(1));
							addInstruction(Instruction.BINARY("eq"));
						
					}
					break;
				case 7 :
					// antlr/NeptuneGenerator.g:331:4: ^( NEQ expression expression )
					{
					match(input,NEQ,FOLLOW_NEQ_in_boolean_expr737); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_boolean_expr739);
					expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_boolean_expr741);
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
	// antlr/NeptuneGenerator.g:338:1: plus_expr returns [Type type = new Type(Type.primitive.VOID)] : (t= multi_expr | ^( PLUS expression expression ) | ^( MINUS expression expression ) );
	public final Type plus_expr() throws RecognitionException {
		Type type =  new Type(Type.primitive.VOID);


		Type t =null;

		try {
			// antlr/NeptuneGenerator.g:339:2: (t= multi_expr | ^( PLUS expression expression ) | ^( MINUS expression expression ) )
			int alt16=3;
			switch ( input.LA(1) ) {
			case ARRAY_SET:
			case BLOCK:
			case CHAR_LITERAL:
			case DIVIDE:
			case FALSE:
			case FUNCTION:
			case IDENTIFIER:
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
				alt16=1;
				}
				break;
			case PLUS:
				{
				alt16=2;
				}
				break;
			case MINUS:
				{
				alt16=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				throw nvae;
			}
			switch (alt16) {
				case 1 :
					// antlr/NeptuneGenerator.g:339:4: t= multi_expr
					{
					pushFollow(FOLLOW_multi_expr_in_plus_expr764);
					t=multi_expr();
					state._fsp--;

					type=t;
					}
					break;
				case 2 :
					// antlr/NeptuneGenerator.g:340:4: ^( PLUS expression expression )
					{
					match(input,PLUS,FOLLOW_PLUS_in_plus_expr778); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_plus_expr780);
					expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_plus_expr782);
					expression();
					state._fsp--;

					match(input, Token.UP, null); 


							type = new Type(Type.primitive.INTEGER);
							addInstruction(Instruction.ADD());
						
					}
					break;
				case 3 :
					// antlr/NeptuneGenerator.g:344:4: ^( MINUS expression expression )
					{
					match(input,MINUS,FOLLOW_MINUS_in_plus_expr792); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_plus_expr794);
					expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_plus_expr796);
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
	// antlr/NeptuneGenerator.g:351:1: multi_expr returns [Type type = null] : (t= unary_expr | ^( TIMES expression expression ) | ^( DIVIDE expression expression ) | ^( MOD expression expression ) );
	public final Type multi_expr() throws RecognitionException {
		Type type =  null;


		Type t =null;

		try {
			// antlr/NeptuneGenerator.g:352:2: (t= unary_expr | ^( TIMES expression expression ) | ^( DIVIDE expression expression ) | ^( MOD expression expression ) )
			int alt17=4;
			switch ( input.LA(1) ) {
			case ARRAY_SET:
			case BLOCK:
			case CHAR_LITERAL:
			case FALSE:
			case FUNCTION:
			case IDENTIFIER:
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
				alt17=1;
				}
				break;
			case TIMES:
				{
				alt17=2;
				}
				break;
			case DIVIDE:
				{
				alt17=3;
				}
				break;
			case MOD:
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
					// antlr/NeptuneGenerator.g:352:4: t= unary_expr
					{
					pushFollow(FOLLOW_unary_expr_in_multi_expr818);
					t=unary_expr();
					state._fsp--;

					type=t;
					}
					break;
				case 2 :
					// antlr/NeptuneGenerator.g:353:4: ^( TIMES expression expression )
					{
					match(input,TIMES,FOLLOW_TIMES_in_multi_expr831); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_multi_expr833);
					expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_multi_expr835);
					expression();
					state._fsp--;

					match(input, Token.UP, null); 


							type = new Type(Type.primitive.INTEGER);
							addInstruction(Instruction.MULT());
						
					}
					break;
				case 3 :
					// antlr/NeptuneGenerator.g:357:4: ^( DIVIDE expression expression )
					{
					match(input,DIVIDE,FOLLOW_DIVIDE_in_multi_expr844); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_multi_expr846);
					expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_multi_expr848);
					expression();
					state._fsp--;

					match(input, Token.UP, null); 


							type = new Type(Type.primitive.INTEGER);
							addInstruction(Instruction.DIV());
						
					}
					break;
				case 4 :
					// antlr/NeptuneGenerator.g:361:4: ^( MOD expression expression )
					{
					match(input,MOD,FOLLOW_MOD_in_multi_expr857); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_multi_expr859);
					expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_multi_expr861);
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
	// antlr/NeptuneGenerator.g:367:1: unary_expr returns [Type type = new Type(Type.primitive.VOID) ] : (t= operand | ^( UNARY_MINUS o= expression ) | ^( UNARY_PLUS o= expression ) | ^( NEGATE o= expression ) );
	public final Type unary_expr() throws RecognitionException {
		Type type =  new Type(Type.primitive.VOID);


		Type t =null;
		Type o =null;

		try {
			// antlr/NeptuneGenerator.g:368:2: (t= operand | ^( UNARY_MINUS o= expression ) | ^( UNARY_PLUS o= expression ) | ^( NEGATE o= expression ) )
			int alt18=4;
			switch ( input.LA(1) ) {
			case ARRAY_SET:
			case BLOCK:
			case CHAR_LITERAL:
			case FALSE:
			case FUNCTION:
			case IDENTIFIER:
			case NUMBER:
			case PRINT:
			case READ:
			case SIZEOF:
			case STRING_LITERAL:
			case TRUE:
				{
				alt18=1;
				}
				break;
			case UNARY_MINUS:
				{
				alt18=2;
				}
				break;
			case UNARY_PLUS:
				{
				alt18=3;
				}
				break;
			case NEGATE:
				{
				alt18=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 18, 0, input);
				throw nvae;
			}
			switch (alt18) {
				case 1 :
					// antlr/NeptuneGenerator.g:368:4: t= operand
					{
					pushFollow(FOLLOW_operand_in_unary_expr883);
					t=operand();
					state._fsp--;

					type = t;
					}
					break;
				case 2 :
					// antlr/NeptuneGenerator.g:369:4: ^( UNARY_MINUS o= expression )
					{
					match(input,UNARY_MINUS,FOLLOW_UNARY_MINUS_in_unary_expr898); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_unary_expr902);
					o=expression();
					state._fsp--;

					match(input, Token.UP, null); 


							type = o;
							addInstruction(Instruction.BINARY("neg"));
						
					}
					break;
				case 3 :
					// antlr/NeptuneGenerator.g:373:4: ^( UNARY_PLUS o= expression )
					{
					match(input,UNARY_PLUS,FOLLOW_UNARY_PLUS_in_unary_expr911); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_unary_expr915);
					o=expression();
					state._fsp--;

					match(input, Token.UP, null); 


							type = o;
						
					}
					break;
				case 4 :
					// antlr/NeptuneGenerator.g:376:4: ^( NEGATE o= expression )
					{
					match(input,NEGATE,FOLLOW_NEGATE_in_unary_expr924); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_unary_expr928);
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
	// antlr/NeptuneGenerator.g:382:1: operand returns [Type type=new Type(Type.primitive.VOID)] : (t= print_statement |t= read_statement | ^( FUNCTION x= IDENTIFIER ^( ARRAY_SET ( expression )+ ) ) |x= IDENTIFIER ( ^( ARRAY_DEF n= NUMBER ) )? |n= NUMBER | ^( ARRAY_SET (t= expression )+ ) | TRUE | FALSE |c= CHAR_LITERAL |s= STRING_LITERAL |t= codeblock | ^( SIZEOF id= IDENTIFIER ) );
	public final Type operand() throws RecognitionException {
		Type type = new Type(Type.primitive.VOID);


		CommonTree x=null;
		CommonTree n=null;
		CommonTree c=null;
		CommonTree s=null;
		CommonTree id=null;
		Type t =null;

		try {
			// antlr/NeptuneGenerator.g:383:2: (t= print_statement |t= read_statement | ^( FUNCTION x= IDENTIFIER ^( ARRAY_SET ( expression )+ ) ) |x= IDENTIFIER ( ^( ARRAY_DEF n= NUMBER ) )? |n= NUMBER | ^( ARRAY_SET (t= expression )+ ) | TRUE | FALSE |c= CHAR_LITERAL |s= STRING_LITERAL |t= codeblock | ^( SIZEOF id= IDENTIFIER ) )
			int alt22=12;
			switch ( input.LA(1) ) {
			case PRINT:
				{
				alt22=1;
				}
				break;
			case READ:
				{
				alt22=2;
				}
				break;
			case FUNCTION:
				{
				alt22=3;
				}
				break;
			case IDENTIFIER:
				{
				alt22=4;
				}
				break;
			case NUMBER:
				{
				alt22=5;
				}
				break;
			case ARRAY_SET:
				{
				alt22=6;
				}
				break;
			case TRUE:
				{
				alt22=7;
				}
				break;
			case FALSE:
				{
				alt22=8;
				}
				break;
			case CHAR_LITERAL:
				{
				alt22=9;
				}
				break;
			case STRING_LITERAL:
				{
				alt22=10;
				}
				break;
			case BLOCK:
				{
				alt22=11;
				}
				break;
			case SIZEOF:
				{
				alt22=12;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 22, 0, input);
				throw nvae;
			}
			switch (alt22) {
				case 1 :
					// antlr/NeptuneGenerator.g:383:4: t= print_statement
					{
					pushFollow(FOLLOW_print_statement_in_operand948);
					t=print_statement();
					state._fsp--;

					type = t;
					}
					break;
				case 2 :
					// antlr/NeptuneGenerator.g:384:4: t= read_statement
					{
					pushFollow(FOLLOW_read_statement_in_operand960);
					t=read_statement();
					state._fsp--;

					type = t;
					}
					break;
				case 3 :
					// antlr/NeptuneGenerator.g:385:4: ^( FUNCTION x= IDENTIFIER ^( ARRAY_SET ( expression )+ ) )
					{
					match(input,FUNCTION,FOLLOW_FUNCTION_in_operand971); 
					match(input, Token.DOWN, null); 
					x=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_operand975); 
					match(input,ARRAY_SET,FOLLOW_ARRAY_SET_in_operand978); 
					match(input, Token.DOWN, null); 
					// antlr/NeptuneGenerator.g:385:40: ( expression )+
					int cnt19=0;
					loop19:
					while (true) {
						int alt19=2;
						int LA19_0 = input.LA(1);
						if ( (LA19_0==AND||(LA19_0 >= ARRAY_SET && LA19_0 <= BLOCK)||LA19_0==CHAR_LITERAL||LA19_0==DIVIDE||(LA19_0 >= EQ && LA19_0 <= FALSE)||(LA19_0 >= FUNCTION && LA19_0 <= IDENTIFIER)||(LA19_0 >= LT && LA19_0 <= PRINT)||LA19_0==READ||(LA19_0 >= SIZEOF && LA19_0 <= STRING_LITERAL)||(LA19_0 >= TIMES && LA19_0 <= UNARY_PLUS)) ) {
							alt19=1;
						}

						switch (alt19) {
						case 1 :
							// antlr/NeptuneGenerator.g:385:40: expression
							{
							pushFollow(FOLLOW_expression_in_operand980);
							expression();
							state._fsp--;

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


							addTextualInstruction("CALL(LB) "+(x!=null?x.getText():null)+"0[CB]", true, false);
							
					match(input, Token.UP, null); 

					}
					break;
				case 4 :
					// antlr/NeptuneGenerator.g:388:4: x= IDENTIFIER ( ^( ARRAY_DEF n= NUMBER ) )?
					{
					 int index = -1; 
					x=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_operand994); 
					// antlr/NeptuneGenerator.g:388:37: ( ^( ARRAY_DEF n= NUMBER ) )?
					int alt20=2;
					int LA20_0 = input.LA(1);
					if ( (LA20_0==ARRAY_DEF) ) {
						alt20=1;
					}
					switch (alt20) {
						case 1 :
							// antlr/NeptuneGenerator.g:388:38: ^( ARRAY_DEF n= NUMBER )
							{
							match(input,ARRAY_DEF,FOLLOW_ARRAY_DEF_in_operand998); 
							match(input, Token.DOWN, null); 
							n=(CommonTree)match(input,NUMBER,FOLLOW_NUMBER_in_operand1002); 
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
				case 5 :
					// antlr/NeptuneGenerator.g:410:4: n= NUMBER
					{
					n=(CommonTree)match(input,NUMBER,FOLLOW_NUMBER_in_operand1016); 

							type = new Type(Type.primitive.INTEGER);
							addInstruction(Instruction.LOADL(Integer.parseInt((n!=null?n.getText():null))));
						
					}
					break;
				case 6 :
					// antlr/NeptuneGenerator.g:414:4: ^( ARRAY_SET (t= expression )+ )
					{
					ArrayList<ArrayList<Instruction>> tmp_instructions = new ArrayList<ArrayList<Instruction>>(); int index = 0;
					match(input,ARRAY_SET,FOLLOW_ARRAY_SET_in_operand1032); 
					match(input, Token.DOWN, null); 
					// antlr/NeptuneGenerator.g:414:127: (t= expression )+
					int cnt21=0;
					loop21:
					while (true) {
						int alt21=2;
						int LA21_0 = input.LA(1);
						if ( (LA21_0==AND||(LA21_0 >= ARRAY_SET && LA21_0 <= BLOCK)||LA21_0==CHAR_LITERAL||LA21_0==DIVIDE||(LA21_0 >= EQ && LA21_0 <= FALSE)||(LA21_0 >= FUNCTION && LA21_0 <= IDENTIFIER)||(LA21_0 >= LT && LA21_0 <= PRINT)||LA21_0==READ||(LA21_0 >= SIZEOF && LA21_0 <= STRING_LITERAL)||(LA21_0 >= TIMES && LA21_0 <= UNARY_PLUS)) ) {
							alt21=1;
						}

						switch (alt21) {
						case 1 :
							// antlr/NeptuneGenerator.g:414:128: t= expression
							{
							program.markInstructionStart(); index++;
							pushFollow(FOLLOW_expression_in_operand1038);
							t=expression();
							state._fsp--;


									type = t;
									tmp_instructions.add(program.popLastInstructions());
								
							}
							break;

						default :
							if ( cnt21 >= 1 ) break loop21;
							EarlyExitException eee = new EarlyExitException(21, input);
							throw eee;
						}
						cnt21++;
					}

					match(input, Token.UP, null); 

					 
							for(int i = tmp_instructions.size() - 1; i >= 0; i--){
								program.addMultiple(tmp_instructions.get(i));
							}
							t.isArray = true;
							t.elemCount = index;
						
					}
					break;
				case 7 :
					// antlr/NeptuneGenerator.g:424:4: TRUE
					{
					match(input,TRUE,FOLLOW_TRUE_in_operand1051); 

							type = new Type(Type.primitive.BOOLEAN);
							addInstruction(Instruction.LOADL(1));
						
					}
					break;
				case 8 :
					// antlr/NeptuneGenerator.g:428:4: FALSE
					{
					match(input,FALSE,FOLLOW_FALSE_in_operand1065); 

							type = new Type(Type.primitive.BOOLEAN);
							addInstruction(Instruction.LOADL(0));
						
					}
					break;
				case 9 :
					// antlr/NeptuneGenerator.g:432:4: c= CHAR_LITERAL
					{
					c=(CommonTree)match(input,CHAR_LITERAL,FOLLOW_CHAR_LITERAL_in_operand1080); 

							type = new Type(Type.primitive.CHAR);
							addInstruction(Instruction.LOADL((int)(c!=null?c.getText():null).charAt(1)));
						
					}
					break;
				case 10 :
					// antlr/NeptuneGenerator.g:436:4: s= STRING_LITERAL
					{
					s=(CommonTree)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_operand1094); 

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
				case 11 :
					// antlr/NeptuneGenerator.g:446:4: t= codeblock
					{
					pushFollow(FOLLOW_codeblock_in_operand1106);
					t=codeblock();
					state._fsp--;

					type = t;
					}
					break;
				case 12 :
					// antlr/NeptuneGenerator.g:448:4: ^( SIZEOF id= IDENTIFIER )
					{
					match(input,SIZEOF,FOLLOW_SIZEOF_in_operand1125); 
					match(input, Token.DOWN, null); 
					id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_operand1129); 
					match(input, Token.UP, null); 


							type = new Type(Type.primitive.INTEGER);
							IdEntry entry = symtab.retrieve((id!=null?id.getText():null));
							if(!entry.getType().isArray) {
								throw new NeptuneException(id,"not an array, invalid use of sizeof function");
							}
							
							addInstruction(Instruction.LOADL(entry.getType().elemCount));
						
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
	// antlr/NeptuneGenerator.g:459:1: type returns [Type type = new Type(Type.primitive.VOID)] : ( INTEGER (count= array_def )? | CHAR (count= array_def )? | BOOLEAN (count= array_def )? );
	public final Type type() throws RecognitionException {
		Type type =  new Type(Type.primitive.VOID);


		int count =0;

		try {
			// antlr/NeptuneGenerator.g:460:2: ( INTEGER (count= array_def )? | CHAR (count= array_def )? | BOOLEAN (count= array_def )? )
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
					// antlr/NeptuneGenerator.g:460:4: INTEGER (count= array_def )?
					{
					match(input,INTEGER,FOLLOW_INTEGER_in_type1147); 
					// antlr/NeptuneGenerator.g:460:17: (count= array_def )?
					int alt23=2;
					int LA23_0 = input.LA(1);
					if ( (LA23_0==ARRAY_DEF) ) {
						alt23=1;
					}
					switch (alt23) {
						case 1 :
							// antlr/NeptuneGenerator.g:460:17: count= array_def
							{
							pushFollow(FOLLOW_array_def_in_type1151);
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
					// antlr/NeptuneGenerator.g:466:4: CHAR (count= array_def )?
					{
					match(input,CHAR,FOLLOW_CHAR_in_type1159); 
					// antlr/NeptuneGenerator.g:466:14: (count= array_def )?
					int alt24=2;
					int LA24_0 = input.LA(1);
					if ( (LA24_0==ARRAY_DEF) ) {
						alt24=1;
					}
					switch (alt24) {
						case 1 :
							// antlr/NeptuneGenerator.g:466:14: count= array_def
							{
							pushFollow(FOLLOW_array_def_in_type1163);
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
					// antlr/NeptuneGenerator.g:472:4: BOOLEAN (count= array_def )?
					{
					match(input,BOOLEAN,FOLLOW_BOOLEAN_in_type1171); 
					// antlr/NeptuneGenerator.g:472:17: (count= array_def )?
					int alt25=2;
					int LA25_0 = input.LA(1);
					if ( (LA25_0==ARRAY_DEF) ) {
						alt25=1;
					}
					switch (alt25) {
						case 1 :
							// antlr/NeptuneGenerator.g:472:17: count= array_def
							{
							pushFollow(FOLLOW_array_def_in_type1175);
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
	// antlr/NeptuneGenerator.g:480:1: array_def returns [int count = 0] : ^( ARRAY_DEF x= NUMBER ) ;
	public final int array_def() throws RecognitionException {
		int count =  0;


		CommonTree x=null;

		try {
			// antlr/NeptuneGenerator.g:481:2: ( ^( ARRAY_DEF x= NUMBER ) )
			// antlr/NeptuneGenerator.g:481:4: ^( ARRAY_DEF x= NUMBER )
			{
			match(input,ARRAY_DEF,FOLLOW_ARRAY_DEF_in_array_def1194); 
			match(input, Token.DOWN, null); 
			x=(CommonTree)match(input,NUMBER,FOLLOW_NUMBER_in_array_def1198); 
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
	public static final BitSet FOLLOW_line_in_lines70 = new BitSet(new long[]{0x7B10FFC07F8289D2L,0x0000000000000003L});
	public static final BitSet FOLLOW_expression_in_line90 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declaration_in_line97 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_logic_statement_in_line104 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BLOCK_in_codeblock122 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_lines_in_codeblock126 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_while_statement_in_logic_statement140 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_foreach_statement_in_logic_statement145 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_if_statement_in_logic_statement150 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHILE_in_while_statement168 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_while_statement172 = new BitSet(new long[]{0x7B10FFC07F8289D0L,0x0000000000000003L});
	public static final BitSet FOLLOW_lines_in_while_statement176 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FOREACH_in_foreach_statement199 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_foreach_statement203 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_foreach_statement209 = new BitSet(new long[]{0x7B10FFC07F8289D0L,0x0000000000000003L});
	public static final BitSet FOLLOW_lines_in_foreach_statement217 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_IF_in_if_statement241 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_if_statement243 = new BitSet(new long[]{0x7B10FFC07F8289D0L,0x0000000000000003L});
	public static final BitSet FOLLOW_lines_in_if_statement247 = new BitSet(new long[]{0x0000000000600008L});
	public static final BitSet FOLLOW_ELSIF_in_if_statement254 = new BitSet(new long[]{0x7B10FFC03D8209D0L});
	public static final BitSet FOLLOW_expression_in_if_statement258 = new BitSet(new long[]{0x7B10FFC07F8289D0L,0x0000000000000003L});
	public static final BitSet FOLLOW_lines_in_if_statement262 = new BitSet(new long[]{0x0000000000600008L});
	public static final BitSet FOLLOW_ELSE_in_if_statement272 = new BitSet(new long[]{0x7B10FFC07F8289D0L,0x0000000000000003L});
	public static final BitSet FOLLOW_lines_in_if_statement276 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PRINT_in_print_statement305 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_print_statement309 = new BitSet(new long[]{0x0000000000002008L});
	public static final BitSet FOLLOW_COMMA_in_print_statement314 = new BitSet(new long[]{0x7B10FFC03D8209D0L});
	public static final BitSet FOLLOW_expression_in_print_statement318 = new BitSet(new long[]{0x0000000000002008L});
	public static final BitSet FOLLOW_READ_in_read_statement345 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_read_statement350 = new BitSet(new long[]{0x0000000000002008L});
	public static final BitSet FOLLOW_COMMA_in_read_statement356 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_read_statement360 = new BitSet(new long[]{0x0000000000002008L});
	public static final BitSet FOLLOW_VAR_in_declaration378 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_type_in_declaration382 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_declaration386 = new BitSet(new long[]{0x0000000000000088L});
	public static final BitSet FOLLOW_BECOMES_in_declaration391 = new BitSet(new long[]{0x7B10FFC03D8209D0L});
	public static final BitSet FOLLOW_expression_in_declaration393 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_CONST_in_declaration405 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_type_in_declaration409 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_declaration413 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_BECOMES_in_declaration415 = new BitSet(new long[]{0x7B10FFC03D8209D0L});
	public static final BitSet FOLLOW_expression_in_declaration417 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNCTION_in_declaration426 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_type_in_declaration433 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_declaration437 = new BitSet(new long[]{0x0000000100000600L});
	public static final BitSet FOLLOW_type_in_declaration452 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_declaration456 = new BitSet(new long[]{0x7B30FFC17F828FD0L,0x0000000000000003L});
	public static final BitSet FOLLOW_line_in_declaration468 = new BitSet(new long[]{0x7B30FFC07F8289D0L,0x0000000000000003L});
	public static final BitSet FOLLOW_return_statement_in_declaration473 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_RETURN_in_return_statement494 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_return_statement498 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_assignment_expr_in_expression517 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_and_or_expr_in_assignment_expr536 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BECOMES_in_assignment_expr546 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_assignment_expr550 = new BitSet(new long[]{0x7B10FFC03D8209F0L});
	public static final BitSet FOLLOW_ARRAY_DEF_in_assignment_expr554 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_NUMBER_in_assignment_expr558 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_expression_in_assignment_expr565 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_boolean_expr_in_and_or_expr585 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AND_in_and_or_expr599 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_and_or_expr601 = new BitSet(new long[]{0x7B10FFC03D8209D0L});
	public static final BitSet FOLLOW_expression_in_and_or_expr603 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_OR_in_and_or_expr616 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_and_or_expr618 = new BitSet(new long[]{0x7B10FFC03D8209D0L});
	public static final BitSet FOLLOW_expression_in_and_or_expr620 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_plus_expr_in_boolean_expr642 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LT_in_boolean_expr658 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_boolean_expr660 = new BitSet(new long[]{0x7B10FFC03D8209D0L});
	public static final BitSet FOLLOW_expression_in_boolean_expr662 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LT_EQ_in_boolean_expr675 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_boolean_expr677 = new BitSet(new long[]{0x7B10FFC03D8209D0L});
	public static final BitSet FOLLOW_expression_in_boolean_expr679 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_GT_in_boolean_expr690 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_boolean_expr692 = new BitSet(new long[]{0x7B10FFC03D8209D0L});
	public static final BitSet FOLLOW_expression_in_boolean_expr694 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_GT_EQ_in_boolean_expr706 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_boolean_expr708 = new BitSet(new long[]{0x7B10FFC03D8209D0L});
	public static final BitSet FOLLOW_expression_in_boolean_expr710 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_EQ_in_boolean_expr721 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_boolean_expr723 = new BitSet(new long[]{0x7B10FFC03D8209D0L});
	public static final BitSet FOLLOW_expression_in_boolean_expr725 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NEQ_in_boolean_expr737 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_boolean_expr739 = new BitSet(new long[]{0x7B10FFC03D8209D0L});
	public static final BitSet FOLLOW_expression_in_boolean_expr741 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_multi_expr_in_plus_expr764 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PLUS_in_plus_expr778 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_plus_expr780 = new BitSet(new long[]{0x7B10FFC03D8209D0L});
	public static final BitSet FOLLOW_expression_in_plus_expr782 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MINUS_in_plus_expr792 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_plus_expr794 = new BitSet(new long[]{0x7B10FFC03D8209D0L});
	public static final BitSet FOLLOW_expression_in_plus_expr796 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_unary_expr_in_multi_expr818 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIMES_in_multi_expr831 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_multi_expr833 = new BitSet(new long[]{0x7B10FFC03D8209D0L});
	public static final BitSet FOLLOW_expression_in_multi_expr835 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DIVIDE_in_multi_expr844 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_multi_expr846 = new BitSet(new long[]{0x7B10FFC03D8209D0L});
	public static final BitSet FOLLOW_expression_in_multi_expr848 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MOD_in_multi_expr857 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_multi_expr859 = new BitSet(new long[]{0x7B10FFC03D8209D0L});
	public static final BitSet FOLLOW_expression_in_multi_expr861 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_operand_in_unary_expr883 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_UNARY_MINUS_in_unary_expr898 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_unary_expr902 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_UNARY_PLUS_in_unary_expr911 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_unary_expr915 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NEGATE_in_unary_expr924 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_unary_expr928 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_print_statement_in_operand948 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_read_statement_in_operand960 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FUNCTION_in_operand971 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_operand975 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_ARRAY_SET_in_operand978 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_operand980 = new BitSet(new long[]{0x7B10FFC03D8209D8L});
	public static final BitSet FOLLOW_IDENTIFIER_in_operand994 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_ARRAY_DEF_in_operand998 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_NUMBER_in_operand1002 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NUMBER_in_operand1016 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ARRAY_SET_in_operand1032 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_operand1038 = new BitSet(new long[]{0x7B10FFC03D8209D8L});
	public static final BitSet FOLLOW_TRUE_in_operand1051 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FALSE_in_operand1065 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_LITERAL_in_operand1080 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_operand1094 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_codeblock_in_operand1106 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SIZEOF_in_operand1125 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_operand1129 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_INTEGER_in_type1147 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_array_def_in_type1151 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_in_type1159 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_array_def_in_type1163 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOLEAN_in_type1171 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_array_def_in_type1175 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ARRAY_DEF_in_array_def1194 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_NUMBER_in_array_def1198 = new BitSet(new long[]{0x0000000000000008L});
}

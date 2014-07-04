tree grammar NeptuneChecker;

options{
	tokenVocab=Neptune;
	ASTLabelType=CommonTree;
}

@header{
	package neptune;
	
	import neptune.node.*;
	import neptune.assembly.Program;
}

@rulecatch{
	catch(RecognitionException e){
		throw e;
	}
}

program
	: ^(PROGRAM n=lines)				{ ProgramNode node = new ProgramNode(n); node.validate(new Program()); }
	;

lines returns [ List<Node> nodes = new ArrayList<Node>() ]
	: (n=line { nodes.add(n); })+
	;

line returns [ Node node ]
	: n=expression												{ node = new BasicNode("expression", n); }
	| n=declaration												{ node = new BasicNode("declaration", n);  }
	| n=logic_statement											{ node = new BasicNode("logic", n); }
	;

codeblock returns [ Node node ]
	: ^(BLOCK n=lines)											{ node = new CodeblockNode(n); }
	;

logic_statement returns [ Node node ]
	: ^(WHILE ex=expression l=lines)							{ node = new WhileNode(ex, l); }
	| ^(FOREACH x=IDENTIFIER y=IDENTIFIER l=lines)				{ node = new ForeachNode($x.text, $y.text, l); }
// If statement
	| { List<Node> ifBlocks = new ArrayList<Node>(); Node elseNode = null; }
	  ^(IF ex=expression l=lines					{ ifBlocks.add(new IfBlockNode(ex, l)); }
		(
			ELSIF ex=expression l=lines				{ ifBlocks.add(new IfBlockNode(ex, l)); }
		)+
		(
			ELSE l=lines							{ elseNode = new ElseNode(l); }
		)?
	  )															{ node = new IfNode(ifBlocks, elseNode); }
	;

print_statement returns [ Node node ]
	: { List<Node> expressions = new ArrayList<Node>(); }
		^(PRINT
			 n1=expression { expressions.add(n1); }
			(n2=expression { expressions.add(n2); })*
		)														{ node = new PrintNode(expressions); }
	;

read_statement
	: ^(READ t=IDENTIFIER (t1=IDENTIFIER)*)
	;

declaration returns [ Node node ]
	: ^(VAR t=type id=IDENTIFIER (BECOMES ex=expression)?)		{ node = new VarDeclarationNode($id.text, t, ex); }
	| ^(CONST t=type id=IDENTIFIER BECOMES ex=expression) 		{ node = new ConstDeclarationNode($id.text, t, ex); }
	| ^(FUNCTION t=type func=IDENTIFIER (t=type id=IDENTIFIER)+ l=lines return_statement) { node = new BasicNode("function " + $func.text); }
	;

return_statement returns [ Node node ]
	:	^(RETURN ex=expression)									{ node = new BasicNode("return", ex); }
;

expression returns [ Node node = new BasicNode("expression"); ]
	: n=assignment_expr											{ node = n; }
	;

assignment_expr returns [ Node node = new BasicNode("assignment"); ]
	: n=and_or_expr												{ node = n; }
	| ^(BECOMES x=variable_use expression)
	;
 
and_or_expr returns [ Node node = new BasicNode("and_or"); ]
	: n=boolean_expr											{ node = n; }
	| ^(AND e1=expression e2=expression)
	| ^(OR e1=expression e2=expression)
	;

boolean_expr returns [ Node node = new BasicNode("boolean"); ]
	: n=plus_expr												{ node = n; }
	| ^(LT e1=expression e2=expression)
	| ^(LT_EQ e1=expression e2=expression)
	| ^(GT e1=expression e2=expression)
	| ^(GT_EQ e1=expression e2=expression)
	| ^(EQ expression expression)
	| ^(NEQ expression expression)
	;

plus_expr returns [ Node node = new BasicNode("plus"); ]
	: n=multi_expr												{ node = n; }
	| ^(PLUS e1=expression e2=expression)
	| ^(MINUS e1=expression e2=expression)
	;

multi_expr returns [ Node node = new BasicNode("multi"); ]
	: n=unary_expr												{ node = n; }
	| ^(TIMES e1=expression e2=expression)
	| ^(DIVIDE e1=expression e2=expression)
	| ^(MOD e1=expression e2=expression)
	;
	
unary_expr returns [ Node node = new BasicNode("unary"); ]
	: n=operand													{ node = n; }
	| ^(UNARY_MINUS o=expression)
	| ^(UNARY_PLUS o=expression)
	| ^(NEGATE o=expression)
	;

operand returns [ Node node = new BasicNode("operand"); ]
	: ^(FUNCTION IDENTIFIER ^(ARRAY_SET expression+))
	| v=variable_expression										{ node = v; }
	| NUMBER
	| ^(ARRAY_SET (expression)+)
	| TRUE
	| FALSE
	| CHAR_LITERAL
	| str=STRING_LITERAL
	| codeblock
	| n=print_statement											{ node = n; }
	| read_statement
	| ^(SIZEOF id=IDENTIFIER)
	;
	
variable_expression returns [ Node node ]
	:	^(ATOMIC_VAR id=IDENTIFIER)								{ node = new VarNode($id.text); }
	|	^(ARRAY_VAR id=IDENTIFIER ex=expression)				{ node = new VarIndexedNode($id.text, ex); }
	;
	
variable_use returns [ Node node ]
	:	^(ATOMIC_VAR x=IDENTIFIER)								{ node = new VarNode($id.text); }
	|	^(ARRAY_VAR x=IDENTIFIER ex=expression)					{ node = new VarIndexedNode($id.text, ex); }
	;

type returns [ Node node ]
	: INTEGER count=array_def?		{ node = new TypeNode(Node.type.INTEGER, count); }
	| CHAR count=array_def?			{ node = new TypeNode(Node.type.CHAR, count); }
	| BOOLEAN count=array_def?		{ node = new TypeNode(Node.type.BOOL, count); }
	;

array_def returns [int count = 0]
	: ^(ARRAY_DEF x=NUMBER) { count = Integer.parseInt($x.text); }
	;
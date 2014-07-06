tree grammar NeptuneTree;

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

@members {
	public ProgramNode rootNode;
}

program
	: ^(PROGRAM n=lines)										{ rootNode = new ProgramNode(n); }
	;

lines returns [ List<Node> nodes = new ArrayList<Node>() ]
	: (n=line { nodes.add(n); })+
	;

line returns [ Node node ]
	: n=expression												{ node = new BasicNode("expression", n); }
	| n=declaration												{ node = new BasicNode("declaration", n);  }
	| n=logic_statement											{ node = new BasicNode("logic", n); }
	| n=return_statement										{ node = new BasicNode("return", n); }
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
		)*
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

read_statement returns [ Node node ]
	: { List<Node> expressions = new ArrayList<Node>(); }
		^(READ
			 n1=variable_expression { expressions.add(n1); }
			(n2=variable_expression { expressions.add(n2); })*
		)														{ node = new ReadNode(expressions); }
	;

declaration returns [ Node node ]
	: ^(VAR t=type id=IDENTIFIER (BECOMES ex=expression)?)		{ node = new VarDeclarationNode($id.text, t, ex); }
	| ^(CONST t=type id=IDENTIFIER BECOMES ex=expression) 		{ node = new ConstDeclarationNode($id.text, t, ex); }
	| { List<Node> args = new ArrayList<Node>(); }
	  ^(FUNCTION
		t1=type
		func=IDENTIFIER
		(
			t=type id=IDENTIFIER			{ args.add(new VarDeclarationNode($id.text, t, null)); }
		)*
		l=lines
	) 															{ node = new FunctionDeclarationNode($func.text, t1, args, l); }
	;

return_statement returns [ Node node ]
	:	^(RETURN ex=expression)									{ node = new ReturnNode(ex); }
	;

expression returns [ Node node ]
	: n=operand													{ node = n; }
	| ^(BECOMES x=variable_use e1=expression)					{ node = new BinaryAnyOperatorNode(Operator.BECOMES, x, e1); }
	| ^(AND e1=expression e2=expression)						{ node = new BinaryPrimitiveOperatorNode(Operator.AND, e1, e2); }
	| ^(OR e1=expression e2=expression)							{ node = new BinaryPrimitiveOperatorNode(Operator.OR, e1, e2); }
	| ^(LT e1=expression e2=expression)							{ node = new BinaryPrimitiveOperatorNode(Operator.LESS, e1, e2); }
	| ^(LT_EQ e1=expression e2=expression)						{ node = new BinaryPrimitiveOperatorNode(Operator.LESS_EQUAL, e1, e2); }
	| ^(GT e1=expression e2=expression)							{ node = new BinaryPrimitiveOperatorNode(Operator.GREATER, e1, e2); }
	| ^(GT_EQ e1=expression e2=expression)						{ node = new BinaryPrimitiveOperatorNode(Operator.GREATER_EQUAL, e1, e2); }
	| ^(EQ e1=expression e2=expression)							{ node = new BinaryAnyOperatorNode(Operator.EQUAL, e1, e2); }
	| ^(NEQ e1=expression e2=expression)						{ node = new BinaryAnyOperatorNode(Operator.NOT_EQUAL, e1, e2); }
	| ^(PLUS e1=expression e2=expression)						{ node = new BinaryPrimitiveOperatorNode(Operator.PLUS, e1, e2); }
	| ^(MINUS e1=expression e2=expression)						{ node = new BinaryPrimitiveOperatorNode(Operator.MINUS, e1, e2); }
	| ^(TIMES e1=expression e2=expression)						{ node = new BinaryPrimitiveOperatorNode(Operator.TIMES, e1, e2); }
	| ^(DIVIDE e1=expression e2=expression)						{ node = new BinaryPrimitiveOperatorNode(Operator.DIVIDE, e1, e2); }
	| ^(MOD e1=expression e2=expression)						{ node = new BinaryPrimitiveOperatorNode(Operator.MOD, e1, e2); }
	| ^(UNARY_MINUS e1=expression)								{ node = new UnaryPrimitiveOperatorNode(Operator.UNARY_MINUS, e1); }
	| ^(UNARY_PLUS e1=expression)								{ node = new UnaryPrimitiveOperatorNode(Operator.UNARY_PLUS, e1); }
	| ^(NEGATE e1=expression)									{ node = new UnaryPrimitiveOperatorNode(Operator.UNARY_NEGATE, e1); }
	;

operand returns [ Node node ]
	: ^(FUNCTION id=IDENTIFIER n=array_set)						{ node = new FunctionCallNode($id.text, n); } // fix
	| v=variable_expression										{ node = v; }
	| l=NUMBER													{ node = new LiteralNode($l.text, Node.type.INTEGER); }
	| n=array_set												{ node = n; }
	| l=TRUE													{ node = new LiteralNode($l.text, Node.type.BOOL); }
	| l=FALSE													{ node = new LiteralNode($l.text, Node.type.BOOL); }
	| l=CHAR_LITERAL											{ node = new LiteralNode($l.text, Node.type.CHAR); }
	| l=STRING_LITERAL											{ node = new LiteralNode($l.text, Node.type.CHAR); }
	| n=codeblock												{ node = n; }
	| n=print_statement											{ node = n; }
	| n=read_statement											{ node = n; }
	| ^(SIZEOF id=IDENTIFIER)									{ node = new SizeOfNode($id.text); }
	;
	
array_set returns [ Node node ]
	: { List<Node> elements = new ArrayList<Node>(); }
	  ^(ARRAY_SET
		(
			ex=expression					{ elements.add(ex); }
		)*
	  )															{ node = new ArraySetNode(elements); }
	;
	
variable_expression returns [ Node node ]
	:	^(ATOMIC_VAR id=IDENTIFIER)								{ node = new VarNode($id.text); }
	|	^(ARRAY_VAR id=IDENTIFIER ex=expression)				{ node = new VarIndexedNode($id.text, ex); }
	;
	
variable_use returns [ Node node ]
	:	^(ATOMIC_VAR id=IDENTIFIER)								{ node = new VarNode($id.text); }
	|	^(ARRAY_VAR id=IDENTIFIER ex=expression)				{ node = new VarIndexedNode($id.text, ex); }
	;

type returns [ Node node ]
	: INTEGER count=array_def?		{ node = new TypeNode(Node.type.INTEGER, count); }
	| CHAR count=array_def?			{ node = new TypeNode(Node.type.CHAR, count); }
	| BOOLEAN count=array_def?		{ node = new TypeNode(Node.type.BOOL, count); }
	;

array_def returns [int count = 0]
	: ^(ARRAY_DEF x=NUMBER) { count = Integer.parseInt($x.text); }
	;
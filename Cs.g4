grammar Cs;

//tokens {CLASS}

cls_def
    : ACCESS_MODIFIER CLASS clsName OPB_FIG (cls_field | cls_method | cls_def | enum_specifier)* CLB_FIG
    ;

clsName: IDENTIFIER;


cls_field
    : (ACCESS_MODIFIER? OTHER_MODIFIER*) type_specifier IDENTIFIER (ASSIGN initializer)? SEMICOLON //TODO... unneeded!
    ;

cls_method
    : (ACCESS_MODIFIER? OTHER_MODIFIER*) type_specifier IDENTIFIER argument_expression_list OPB_FIG (statement)* CLB_FIG SEMICOLON //TODO
    ;

//TODO: think
function_definition
//scope Symbols; // put parameters and locals into same scope for now
//@init {
//  $Symbols::types = new HashSet();
//}
	:	declaration_specifiers? direct_declarator
		(	declaration+ compound_statement	// K&R style
		|	compound_statement				// ANSI style
		)
	;

declaration_specifiers
	:   ( (ACCESS_MODIFIER | OTHER_MODIFIER)
            | type_specifier
            | TYPE_QUALIFIER
        )+
	;

assignment_operator: ASSIGN_AND_MODIFY_OPERATOR | ASSIGN;

declaration
	: declaration_specifiers init_declarator_list? SEMICOLON
	;

init_declarator_list
	: init_declarator (COMMA init_declarator)*
	;

init_declarator
	: direct_declarator (assignment_operator initializer)?
	;

direct_declarator
	: (IDENTIFIER | OPB_RND direct_declarator CLB_RND) declarator_suffix*
	;

declarator_suffix
	:   OPB_SQ constant_expression CLB_SQ
    |   OPB_SQ CLB_SQ
    |   OPB_RND parameter_type_list CLB_RND
    |   OPB_RND identifier_list CLB_RND
    |   OPB_RND CLB_RND
	;

type_specifier
	: (PRIMITIVE_TYPE_MODIFIER | PRIMITIVE_TYPE)
	| enum_specifier
	| type_id
	;

type_id
    :   IDENTIFIER
    ;

specifier_qualifier_list
	: ( TYPE_QUALIFIER | type_specifier )+
	;

enum_specifier
//options {k=3;}
	: ENUM OPB_FIG enumerator_list CLB_FIG
	| ENUM IDENTIFIER OPB_FIG enumerator_list CLB_FIG
	| ENUM IDENTIFIER
	;

enumerator_list
	: enumerator (COMMA enumerator)*
	;

enumerator
	: IDENTIFIER (ASSIGN constant_expression)?
	;


parameter_type_list
	: parameter_list (COMMA ETC)?
	;

parameter_list
	: parameter_declaration (COMMA parameter_declaration)*
	;

parameter_declaration
	: declaration_specifiers (direct_abstract_declarator)*
	;

identifier_list
	: IDENTIFIER (COMMA IDENTIFIER)*
	;

type_name
	: specifier_qualifier_list direct_abstract_declarator?
	;

direct_abstract_declarator
	:	( OPB_RND direct_abstract_declarator CLB_RND | abstract_declarator_suffix ) abstract_declarator_suffix*
	;

abstract_declarator_suffix
	:	OPB_SQ CLB_SQ
	|	OPB_SQ constant_expression CLB_SQ
	|	OPB_RND CLB_RND
	|	OPB_RND parameter_type_list CLB_RND
	;
	
initializer
	: assignment_expression
	| OPB_FIG initializer_list COMMA? CLB_FIG
	;

initializer_list
	: initializer (COMMA initializer)*
	;

// E x p r e s s i o n s

argument_expression_list
	:   assignment_expression (COMMA assignment_expression)*
	;

additive_expression
	: (multiplicative_expression) (PLUS multiplicative_expression | MINUS multiplicative_expression)*
	;

multiplicative_expression
	: (cast_expression) (MUL cast_expression | DIV cast_expression | '%' cast_expression)*
	;

cast_expression
	: OPB_RND type_name CLB_RND cast_expression
	| unary_expression
	;

unary_expression
	: postfix_expression
	| INCREMENT unary_expression
	| DECREMENT unary_expression
	| UNARY_OPERATOR cast_expression
	;

postfix_expression
	:   primary_expression
        (   OPB_SQ expression CLB_SQ
        |   OPB_RND CLB_RND 
        |   OPB_RND argument_expression_list CLB_RND 
        |   DOT IDENTIFIER
        |   (INCREMENT | DECREMENT)
        )*
	;


primary_expression
	: IDENTIFIER
	| constant
	| OPB_RND expression CLB_RND
	;

constant
    :   HEX_LITERAL
    |   OCTAL_LITERAL
    |   DECIMAL_LITERAL
    |	CHARACTER_LITERAL
    |	STRING_LITERAL
    |   FLOATING_POINT_LITERAL
    ;

/////

expression
	: assignment_expression (COMMA assignment_expression)*
	;

constant_expression
	: conditional_expression
	;

assignment_expression
	: lvalue assignment_operator assignment_expression
	| conditional_expression
	;
	
lvalue
	:	unary_expression
	;

conditional_expression
	: logical_or_expression (QUESTION expression DOUBLE_DOT conditional_expression)?
	;

logical_or_expression
	: logical_and_expression (OR logical_and_expression)*
	;

logical_and_expression
	: inclusive_or_expression (AND inclusive_or_expression)*
	;

inclusive_or_expression
	: exclusive_or_expression (BIT_OR exclusive_or_expression)*
	;

exclusive_or_expression
	: and_expression (BIT_XOR and_expression)*
	;

and_expression
	: equality_expression (BIT_AND equality_expression)*
	;
equality_expression
	: relational_expression (EQUALITY_OPERATOR relational_expression)*
	;

relational_expression
	: shift_expression (COMPARSION_OPERATOR shift_expression)*
	;

shift_expression
	: additive_expression (SHIFT_OPERATOR additive_expression)*
	;

// S t a t e m e n t s

statement
	: labeled_statement
	| compound_statement
	| expression_statement
	| selection_statement
	| iteration_statement
	| jump_statement
	;

labeled_statement
	: IDENTIFIER DOUBLE_DOT statement
	| CASE constant_expression DOUBLE_DOT statement
	| DEFAULT DOUBLE_DOT statement
	;

//TODO: think
compound_statement
//scope Symbols; // blocks have a scope of symbols
//@init {
//  $Symbols::types = new HashSet();
//}
	: OPB_FIG declaration* statement_list? CLB_FIG
	;

statement_list
	: statement+
	;

expression_statement
	: SEMICOLON
	| expression SEMICOLON
	;

selection_statement
	: IF OPB_RND expression CLB_RND statement (options {k=1; backtrack=false;}:ELSE statement)?
	| SWITCH OPB_RND expression CLB_RND statement
	;

iteration_statement
	: WHILE OPB_RND expression CLB_RND statement
	| DO statement WHILE OPB_RND expression CLB_RND SEMICOLON
	| FOR OPB_RND expression_statement expression_statement expression? CLB_RND statement
	;

jump_statement
	: CONTINUE SEMICOLON
	| BREAK SEMICOLON
	| RETURN SEMICOLON
	| RETURN expression SEMICOLON
	;

IDENTIFIER
	:	LETTER (LETTER|'0'..'9')*
	;
	
fragment
LETTER
	:	'$'
	|	'A'..'Z'
	|	'a'..'z'
	|	'_'
	;

CHARACTER_LITERAL
    :   '\'' ( EscapeSequence | ~('\''|'\\') ) '\''
    ;

STRING_LITERAL
    :  '"' ( EscapeSequence | ~('\\'|'"') )* '"'
    ;

HEX_LITERAL : '0' ('x'|'X') HexDigit+ IntegerTypeSuffix? ;

DECIMAL_LITERAL : ('0' | '1'..'9' '0'..'9'*) IntegerTypeSuffix? ;

OCTAL_LITERAL : '0' ('0'..'7')+ IntegerTypeSuffix? ;

fragment
HexDigit : ('0'..'9'|'a'..'f'|'A'..'F') ;

fragment
IntegerTypeSuffix
	:	('u'|'U')? ('l'|'L')
	|	('u'|'U')  ('l'|'L')?
	;

FLOATING_POINT_LITERAL
    :   ('0'..'9')+ DOT ('0'..'9')* Exponent? FloatTypeSuffix?
    |   DOT ('0'..'9')+ Exponent? FloatTypeSuffix?
    |   ('0'..'9')+ Exponent FloatTypeSuffix?
    |   ('0'..'9')+ Exponent? FloatTypeSuffix
	;

fragment
Exponent : ('e'|'E') (PLUS|MINUS)? ('0'..'9')+ ;

fragment
FloatTypeSuffix : ('f'|'F'|'d'|'D') ;

fragment
EscapeSequence
    :   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
    |   OctalEscape
    ;

fragment
OctalEscape
    :   '\\' ('0'..'3') ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7')
    ;

fragment
UnicodeEscape
    :   '\\' 'u' HexDigit HexDigit HexDigit HexDigit
    ;

WS  :  (' '|'\r'|'\t'|'\u000C'|'\n') -> skip
    ;

//COMMENT
//    :   ('/*' ( options {greedy=false;} : . )* '*/' ) -> skip
//    ;

LINE_COMMENT
    : ('//' ~('\n'|'\r')* '\r'? '\n') -> skip
    ;

// ignore #line info for now
LINE_COMMAND 
    : ('#' ~('\n'|'\r')* '\r'? '\n') -> skip
    ;

CLASS : 'class';
ENUM : 'enum';
CASE : 'case';
DEFAULT: 'default';
IF: 'if';
ELSE: 'else';
SWITCH: 'switch';
FOR: 'for';
WHILE: 'while';
DO: 'do';
CONTINUE: 'continue';
BREAK: 'break';
RETURN: 'return';

PRIMITIVE_TYPE	: ('void' | 'char' | 'short' | 'int' | 'long' | 'float' | 'double');

PRIMITIVE_TYPE_MODIFIER	: ('unsigned' | 'signed');
    
TYPE_QUALIFIER
	: 'const'
	| 'volatile'
	;

ACCESS_MODIFIER : 'private' | 'protected' | 'public' | 'internal';

OTHER_MODIFIER : ('static'|'const'|'abstract');

ASSIGN: '=';

ASSIGN_AND_MODIFY_OPERATOR
	: '*='
	| '/='
	| '%='
	| '+='
	| '-='
	| '<<='
	| '>>='
	| '&='
	| '^='
	| '|='
	;

UNARY_OPERATOR
	: '&'
	| MUL
	| PLUS
	| MINUS
	| '~'
	| '!'
	;

EQUALITY_OPERATOR: ('=='|'!=');

COMPARSION_OPERATOR: ('<'|'>'|'<='|'>=');

SHIFT_OPERATOR: ('<<'|'>>');

INCREMENT: '++';
DECREMENT: '--';

OPB_FIG: '{';
CLB_FIG: '}';
OPB_RND: '(';
CLB_RND: ')';
OPB_SQ: '[';
CLB_SQ: ']';
SEMICOLON: ';';
DOUBLE_DOT: ':';
COMMA: ',';
DOT: '.';
ETC: '...';
PLUS: '+';
MINUS: '-';
MUL: '*';
DIV: '/';
BIT_AND: '&';
BIT_OR: '|';
BIT_XOR: '^';
AND: '&&';
OR: '||';
QUESTION: '?';
PERCENT: '%';
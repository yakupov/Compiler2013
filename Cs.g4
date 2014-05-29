grammar Cs;

cls_def
    : ACCESS_MODIFIER? OTHER_MODIFIER* CLASS IDENTIFIER OPB_FIG (cls_method | cls_def | enum_specifier | declaration)* CLB_FIG
    ;

cls_method
    : declaration_specifier IDENTIFIER declarator_suffix compound_statement
    ;

assignment_operator: ASSIGN_AND_MODIFY_OPERATOR | ASSIGN;

declaration
	: declaration_specifier init_declarator_list SEMICOLON
	;

declaration_specifier
	: (ACCESS_MODIFIER | OTHER_MODIFIER)* type_specifier arr_suffix*
	;

init_declarator_list
	: init_declarator (COMMA init_declarator)*
	;

init_declarator
	: IDENTIFIER? (assignment_operator assignment_expression)?
	;

arr_suffix
        : OPB_SQ COMMA* CLB_SQ
        ;

arr_arg_suffix
        : OPB_SQ argument_expression_list* CLB_SQ
        ;

arg_suffix
        : OPB_RND argument_expression_list* CLB_RND
        ;

declarator_suffix
	: OPB_RND parameter_type_list CLB_RND
        | OPB_RND CLB_RND
	;

type_specifier
	: PRIMITIVE_TYPE_MODIFIER? PRIMITIVE_TYPE
	| enum_specifier
	| IDENTIFIER
	;

enum_specifier
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
	: declaration_specifier IDENTIFIER
	;

identifier_list
	: IDENTIFIER (COMMA IDENTIFIER)*
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
	: OPB_RND IDENTIFIER CLB_RND cast_expression
	| unary_expression
	;

unary_expression
	: constructor_call 
        | postfix_expression
	| INCREMENT unary_expression
	| DECREMENT unary_expression
	| UNARY_OPERATOR cast_expression
	;

constructor_call : NEW type_specifier (arr_arg_suffix* | arg_suffix*);

postfix_expression
	:   primary_expression
        (   OPB_SQ expression CLB_SQ
        |   OPB_RND CLB_RND 
        |   OPB_RND argument_expression_list CLB_RND 
        |   DOT postfix_expression
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
	: compound_statement
	| expression_statement
	| selection_statement
	| iteration_statement
	| jump_statement
	;

//code block
compound_statement
	: OPB_FIG (declaration | statement)* CLB_FIG
	;

expression_statement
	: SEMICOLON
	| expression SEMICOLON
	;

selection_statement
	: IF OPB_RND expression CLB_RND statement (ELSE statement)?
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


NEW : 'new';
CLASS : 'class';
ENUM : 'enum';
CASE : 'case';
DEFAULT: 'default';
IF: 'if';
ELSE: 'else';
FOR: 'for';
WHILE: 'while';
DO: 'do';
CONTINUE: 'continue';
BREAK: 'break';
RETURN: 'return';

PRIMITIVE_TYPE	: 'void' | 'char' | 'short' | 'int' | 'long' | 'float' | 'double';

PRIMITIVE_TYPE_MODIFIER	: 'unsigned' | 'signed';
    
ACCESS_MODIFIER : 'private' | 'protected' | 'public' | 'internal';

OTHER_MODIFIER : 'static' | 'const' | 'abstract';

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

COMMENT
    :   ('/*' (.)*? '*/' ) -> skip
    ;

LINE_COMMENT
    : ('//' ~('\n'|'\r')* '\r'? '\n') -> skip
    ;

// ignore #line info for now
LINE_COMMAND 
    : ('#' ~('\n'|'\r')* '\r'? '\n') -> skip
    ;

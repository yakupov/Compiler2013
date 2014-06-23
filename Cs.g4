grammar Cs;

cls_def
    : ACCESS_MODIFIER? OTHER_MODIFIER* CLASS IDENTIFIER OPB_FIG (cls_method | cls_def | enum_specifier | declaration)* CLB_FIG
    ;

cls_method
    : declaration_specifier IDENTIFIER declarator_suffix compound_statement
    ;

assignment_operator: assign_and_modify_operator | ASSIGN;

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
	: IDENTIFIER (assignment_operator assignment_expression)?
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
	: IDENTIFIER (ASSIGN conditional_expression)?
	;


parameter_type_list
	: parameter_list (COMMA ETC)?
	;

parameter_list
	: parameter_declaration (COMMA parameter_declaration)*
	;

parameter_declaration
	: declaration_specifier init_declarator
	;

identifier_list
	: IDENTIFIER (COMMA IDENTIFIER)*
	;

// E x p r e s s i o n s

argument_expression_list
	:   assignment_expression (COMMA assignment_expression)*
	;

additive_expression
	: (multiplicative_expression) (PLUS additive_expression | MINUS additive_expression)?
	;

multiplicative_expression
	: (unary_expression) (MUL unary_expression | DIV unary_expression | REM unary_expression)?
	;

unary_expression
	: constructor_call 
        | postfix_expression
	| unary_operator unary_expression
	;

constructor_call : NEW type_specifier (arr_arg_suffix* | arg_suffix*);

postfix_expression
	:   primary_expression 
            ((INCREMENT | DECREMENT)? | //primary expression must be int
            (OPB_RND argument_expression_list? CLB_RND )? //primary expression must be method
            (DOT postfix_expression)?)//primary expression must be class, or method call non-void
	;


primary_expression
	: IDENTIFIER arr_arg_suffix*
	| constant
	| OPB_RND assignment_expression CLB_RND
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
assignment_expression
	: unary_expression assignment_operator assignment_expression
	| conditional_expression
	;

conditional_expression
	: logical_or_expression (QUESTION assignment_expression DOUBLE_DOT conditional_expression)?
	;

logical_or_expression
	: logical_and_expression (OR logical_or_expression)?
	;

logical_and_expression
	: inclusive_or_expression (AND logical_and_expression)?
	;

inclusive_or_expression
	: exclusive_or_expression (BIT_OR inclusive_or_expression)?
	;

exclusive_or_expression
	: and_expression (BIT_XOR exclusive_or_expression)?
	;

and_expression
	: equality_expression (BIT_AND and_expression)?
	;
equality_expression
	: relational_expression (equality_operator equality_expression)?
	;

relational_expression
	: shift_expression (comparsion_operator relational_expression)?
	;

shift_expression
	: additive_expression (shift_operator shift_expression)?
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
	| assignment_expression SEMICOLON
	;

selection_statement
	: IF OPB_RND assignment_expression CLB_RND statement (ELSE statement)?
	;

iteration_statement
	: WHILE OPB_RND assignment_expression CLB_RND statement
	| DO statement WHILE OPB_RND assignment_expression CLB_RND SEMICOLON
	| FOR OPB_RND expression_statement expression_statement assignment_expression? CLB_RND statement
	;

jump_statement
	: CONTINUE SEMICOLON
	| BREAK SEMICOLON
	| RETURN SEMICOLON
	| RETURN assignment_expression SEMICOLON
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

PRIMITIVE_TYPE	: 'void' | 'char' | 'short' | 'int' | 'long' | 'float' | 'double' | 'boolean';

PRIMITIVE_TYPE_MODIFIER	: 'unsigned' | 'signed';
    
ACCESS_MODIFIER : 'private' | 'protected' | 'public' | 'internal';

OTHER_MODIFIER : 'static' | 'const' | 'abstract';

ASSIGN: '=';

assign_and_modify_operator: MUL_ASS | DIV_ASS | REM_ASS | ADD_ASS | SUB_ASS |
                            LSHIFT_ASS | RSHIFT_ASS | XOR_ASS | OR_ASS;
MUL_ASS: '*=';
DIV_ASS: '/=';
REM_ASS: '%=';
ADD_ASS: '+=';
SUB_ASS: '-=';
LSHIFT_ASS: '<<=';
RSHIFT_ASS: '>>=';
AND_ASS: '&=';
XOR_ASS: '^=';
OR_ASS: '|=';

unary_operator
	: INCREMENT
	| DECREMENT
	| PLUS
	| MINUS
	| NOT
	;

equality_operator: (EQ|NEQ);
EQ: '==';
NEQ: '!=';

comparsion_operator: (GT|LT|GE|LE);
GT: '>';
LT: '<';
GE: '>=';
LE: '<=';

shift_operator: (LSHIFT|RSHIFT);
LSHIFT: '<<';
RSHIFT: '>>';

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
REM: '%';
NOT: '!';

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

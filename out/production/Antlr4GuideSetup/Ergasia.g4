grammar Ergasia;

program : body END  subprograms;

body : declarations statements;

declarations : declarations type vars | declarations COMMON cblock_list | declarations DATA vals | /* epsilon */ ;

type : INTEGER | REAL| COMPLEX | LOGICAL | CHARACTER | STRING;

vars : vars COMMA undef_variable | undef_variable;

undef_variable : listspec ID LPAREN dims RPAREN | listspec ID;

listspec : LIST | /* e */;

dims : dims COMMA dim | dim;

dim : ICONST | ID;

cblock_list : cblock_list cblock | cblock;

cblock : DIVOP ID DIVOP id_list;

id_list : id_list COMMA ID | ID;

vals : vals COMMA ID value_list| ID value_list;

value_list : DIVOP values DIVOP;

values : values COMMA value | value;

value : repeat sign constant | ADDOP constant | constant;

repeat : ICONST MULOP | MULOP;

sign : ADDOP | /* e */;

constant : simple_constant | complex_constant ;

simple_constant : ICONST | RCONST | LCONST | CCONST | SCONST;

complex_constant : LPAREN RCONST COLON sign RCONST RPAREN;

statements : statements labeled_statement| labeled_statement;

labeled_statement : label statement| statement;

label : ICONST;

statement : simple_statement| compound_statement;

simple_statement : assignment
| goto_statement
| if_statement
| subroutine_call
| io_statement
| CONTINUE
| RETURN
| STOP;

assignment : variable ASSIGN expression;

variable : ID LPAREN expressions RPAREN
| LISTFUNC LPAREN expression RPAREN
| ID;

expressions : expressions COMMA expression | expression;


expression : expression OROP expression
| expression ANDOP expression
| expression RELOP expression
| <assoc=right> expression POWEROP expression
| expression op=(MULOP|DIVOP) expression
| expression op=ADDOP expression
/*| expression ADDOP expression
| expression MULOP expression
| expression DIVOP expression
| expression POWEROP expression */
| NOTOP expression
| ADDOP expression
| variable
| simple_constant
| LENGTH LPAREN expression RPAREN
| NEW LPAREN expression RPAREN
| LPAREN expression RPAREN
| LPAREN expression COLON expression RPAREN
| listexpression;



listexpression : LBRACK expressions RBRACK
| LBRACK RBRACK;

goto_statement : GOTO label
| GOTO ID COMMA LPAREN labels RPAREN;

labels : labels COMMA label
| label ;

if_statement : IF LPAREN expression RPAREN label COMMA label COMMA label
| IF LPAREN expression RPAREN simple_statement;

subroutine_call : CALL variable;

io_statement : READ read_list
| WRITE write_list;

read_list : read_list COMMA read_item
| read_item;

read_item : variable
| LPAREN read_list COMMA ID ASSIGN iter_space RPAREN;

iter_space : expression COMMA expression step;

step : COMMA expression
|/* e */;

write_list : write_list COMMA write_item| write_item;

write_item : expression| LPAREN write_list COMMA ID ASSIGN iter_space RPAREN;

compound_statement : branch_statement| loop_statement;

branch_statement : IF LPAREN expression RPAREN THEN body tail;

tail : ELSE body ENDIF | ENDIF;

loop_statement : DO ID ASSIGN iter_space body ENDDO;

subprograms : subprograms subprogram | /* e */;

subprogram : header body END;

header : type listspec FUNCTION ID LPAREN formal_parameters RPAREN | SUBROUTINE ID LPAREN formal_parameters RPAREN | SUBROUTINE ID;

formal_parameters : type vars COMMA formal_parameters | type vars;


/* Lexical */

DOT: '.';

/* lexeis-kleidia */
FUNCTION :'FUNCTION'|'function';
SUBROUTINE :'SUBROUTINE'|'subroutine';
END:'END'|'end';
COMMON :'COMMON'|'common';
INTEGER:'INTEGER'|'integer';
REAL:'REAL'|'real';
COMPLEX:'COMPLEX'|'complex';
LOGICAL:'LOGICAL'|'logical';
CHARACTER:'CHARACTER'|'character';
STRING:'STRING'|'string';
LIST:'LIST'|'list';
DATA:'DATA'|'data';
CONTINUE:'CONTINUE'|'continue';
GOTO:'GOTO'|'goto';
CALL:'CALL'|'call';
READ:'READ'|'read';
WRITE:'WRITE'|'write';
LENGTH:'LENGTH'|'length';
NEW:'NEW'|'new';
IF:'IF'|'if';
THEN:'THEN'|'then';
ELSE:'ELSE'|'else';
ENDIF:'ENDIF'|'endif';
DO:'DO'|'do';
ENDDO:'ENDDO'|'enddo';
STOP:'STOP'|'stop';
RETURN:'RETURN'|'return';

ID :([a-zA-Z][a-zA-Z'"'0-9]*)|([a-zA-Z]'_'[a-zA-Z'"'0-9]*'_')|([a-zA-Z][a-zA-Z'"'0-9]*'_'[a-zA-Z'"'0-9]*'_')|([a-zA-Z]'_'[a-zA-Z'"'0-9]*'_'[a-zA-Z'"'0-9]*'_');

/*ICONST3: ([1-9]+[0-9]*(([0X]?[1-9]+[0-9]*[0A_0C_0D_0E_0F][1-9]+[0-9]*)|([B_b][1]+[0-1]*)|)?)|[0]; */



//ICONST: ([0-9]+|((([0][X_x]AADM0)|[0])[A_C_D_E_F][0-9]*[A_C_D_E_F]*[0-9]*)|([0][o][1-7]+[0-9]*)|([0][B_b][1]+[0-1]*)|[0]*);
//ICONST: ([0-9]*|((([0][X_x]AADM0)|[0])[A_C_D_E_F][0-9]*[A_C_D_E_F]*[0-9]*)|([0][o][1-7]+[0-9]*)|([0][B_b][1]+[0-1]*)|[0]*);

//ICONST :
//[0]
//|[1-9]+[0-9]*
//|[0][Xx][1-9]+[0-9]*
//|[0][Xx]HEXCHARS+[1-9]+[0-9]*
//|[0][Xx][1-9]+[0-9]*HEXCHARS+[0-9]+
//|[0][Oo][1-7]+[0-7]*
//|[0][Bb][1]+[0-1]*;

/*
RCONST:
([0-9]*DOT[0-9]+
|[0-9]+DOT?[0-9]*)
[Ee]?ADDOP?[0-9]+
|[0][XxOoBb]{1}

;
*/

/*
RCONST:(
    ([0-9]*DOT[0-9]*)|
    ([0-9]*DOT?[0-9]+[e_E]ADDOP?[0-9]+)|
    ([0][X_x_A][0-9]+)|
    ([0][X_x_A_O][X_x_A]*[0-9]*DOT[0-9]*)|
    ([0][B_b][0-1]*DOT[0-1]*))|
    ([0-9]+DOT?[e]ADDOP?[0-9]+)
    ;

*/

fragment HEXCHARS:[A-F]|[a-f];
fragment HEXNUMBERS :NUM*HEXCHARS*NUM*HEXCHARS*;
fragment ESCAPE_CHARS : '\\'('n'|'f'|'t'|'r'|'b'|'b'|'v');

fragment BINARYNUMBERS :
(
    '0'('B'|'b')
    [1]+[0-1]*
);
fragment OCTABNUMBERS : // base 8
(
    '0'('O'|'o')
    [1-7]+[0-7]*
);

fragment BINARY_WHOLE : ('OB'|'Ob') [1]+[0-1]*;
fragment NUM:[0-9];
fragment EXPONENT : ('e'|'E') ADDOP? NUM+;



ICONST :
(
    ('0')
    |
    ([1-9]+[0-9]*)
    |
    (   ('0'('X'|'x'))
        HEXNUMBERS
    )
    |
        BINARYNUMBERS
    |
       OCTABNUMBERS
);

RCONST://('0X'(HEX_NUMBERS))|
(
    (
        (NUM* DOT NUM+)
        |
        (NUM+ DOT? NUM*)
    )
    (EXPONENT?)
)
|
(
    (
        ('0'('X'|'x'|'O'|'o'))
        HEXNUMBERS
        DOT
        HEXNUMBERS
    )
    |
    (
        ('0B'|'0b')
        [0-1]*
        DOT
        [0-1]*
    )

)
//'0'[X]{1}[HEX_NUMBERS*][DOT][HEX_NUMBERS*]

;
fragment A:'A'|'a';
fragment B:'B'|'b';
fragment C:'C'|'c';
fragment D:'D'|'d';
fragment E:'E'|'e';
fragment F:'F'|'f';
fragment X:'X'|'x';


CCONST:AUTAKI([ -~]|ESCAPE_CHARS)AUTAKI; /* EDO ISOS YPARXEI THEMA */
//SCONST:DOUBLE_AUTAKI[ -~_'\\']* DOUBLE_AUTAKI; /* EDO ISOS YPARXEI THEMA */

SCONST :(DOUBLE_AUTAKI[ -~]*DOUBLE_AUTAKI);

//SCONST : ;
//SCONST : ('"' ( [\u0020-\u007E] | [\u0020] | SKP )*'"')+;

//SCONST : '"' ([\u0020] | [\u0021] | [\u0023-\u007e] | ('\\' 'n') | ('\\' 'f') | ('\\' 't') | ('\\' 'r') | ('\\' 'b') | ('\\' 'v') | '\\')* '"' ;








AUTAKI:'\'';
DOUBLE_AUTAKI:'"';
LCONST : (DOT'TRUE'DOT)|(DOT'FALSE'DOT)|(DOT'true'DOT)|(DOT'false'DOT);


/* Telestes */
OROP:DOT'OR'DOT|DOT'or'DOT;
ANDOP:DOT'AND'DOT|DOT'and'DOT;
NOTOP:DOT'not'DOT|DOT'not'DOT;
RELOP:
DOT'GT'DOT|DOT'GE'DOT|DOT'LT'DOT|DOT'LE'DOT|DOT'EQ'DOT|DOT'NE'DOT|
DOT'gt'DOT|DOT'ge'DOT|DOT'lt'DOT|DOT'le'DOT|DOT'eq'DOT|DOT'ne'DOT;


ADDOP:'+'|'-';
MULOP:'*';
DIVOP:'/';
POWEROP:'**';

/* Alles lektikes monades */
LISTFUNC : [C](([A][D]*)|[D]+)[R];

LPAREN:'(';
RPAREN:')';
COMMA:',';
ASSIGN:'=';
COLON:':';
LBRACK:'[';
RBRACK:']';

AADM0 : [1-9]+[0-9]*; /* Arithmos Alla Den Xekina Me 0 */



LINE_COMMENT: '$' ~[\r\n]* -> skip;
WS : [ \t\r\n]+ -> skip ;


/*
EOL : ('\r'|'\n')+
    ;
ErrChar
  : .
  ;
*/
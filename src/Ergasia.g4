grammar Ergasia;
prog : body END subprograms ;

body : declarations statements;

declarations : declarations type vars
               | declarations COMMON cblock_list
               | declarations DATA vals
               | ;

type : INTEGER | REAL | COMPLEX | LOGICAL | CHARACTER | STRING;

vars : vars COMMA undef_variable | undef_variable;
undef_variable : listspec ID LPAREN dims RPAREN
                 | listspec ID;

listspec : LIST | ;
dims : dims COMMA dim| di;

dim : ICONST | ID;

stat:   expr NEWLINE
    |   ID '=' expr NEWLINE
    |   NEWLINE;
expr:   expr('*'|'/') expr
    |   expr('+'|'-') expr
    |   INT
    |   ID
    |   '(' expr ')';

ID :[a-zA-Z]+;
INT : [0-9]+ ;
NEWLINE:'\r'? '\n';
WS : [ \t\n]+ -> skip;
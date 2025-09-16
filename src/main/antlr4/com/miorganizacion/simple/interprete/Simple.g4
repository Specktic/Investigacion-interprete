grammar Simple;

program: PROGRAM ID BRACKET_OPEN
	sentence*
	BRACKET_CLOSE;
	
sentence: var_decl | var_assign | println;

var_decl: VAR ID;
var_assign: ID ASSIGN NUMBER SEMICOLON;
println: PRITNLN NUMBER SEMICOLON;

PROGRAM: 'program';
VAR: 'var';
PRINTLN: 'println';

PLUS: '+';
MINUS: '-';
MULT: '*';
DIV: '/';

AND: '&&';
OR: '||';
NOT: '!';

GT: '>';
LT: '<';
GEQ: '>=';
LEQ: '<=';
EQ: '==';
NEQ: '!=';

ASSIGN: '=';

BRACKET_OPEN: '{';
BRACKET_CLOSE: '}';

PAR_OPEN: '(';
PAR_CLOSE: ')';

SEMICOLON: ';';

ID: [a-za-Z_][a-za-Z0-9_]*;

NUMBER: [0-9]+;

WS
:
	[ \t\r\n]+ -> skip
;

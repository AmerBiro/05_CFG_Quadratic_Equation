grammar simpleCalc;

start   : e=expr EOF;

// Rules
expr : 
       input=NUMBER                           # INPUT
     | e1=expr 'x^2' op2=('+'|'-') e2=expr 'x' op3=('+'|'-') e3=expr # AndenGradsLigning
     ;


// RegEx
NUMBER              : [0-9]+ ('.' [0-9]+)?;

// WHITESPACES
WHITESPACES         : [ \t\n]+ -> skip;
COMMENT             : ('//'(~[\n])*) -> skip;
MULTILINECOMMENTS   :  ('/*'(('*'~[/]|~[*])*)'*/') -> skip;


// PARENTHESESR      : ')';
// PARENTHESESL      : '(';
// POWER             : '^';
// SQR               : 'sqrt'PARENTHESESL;
// MULTI_DEVI        : (MULTIPLICATION | DIVISION);
// MULTIPLICATION    : '*';
// DIVISION          : '/';
// ADD_SUB           : (ADDITION | SUBTRACTION);
// ADDITION          :'+';
// SUBTRACTION       :'-';
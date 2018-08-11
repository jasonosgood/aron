/*
	ARON.g4

	ARON - A Righteous Object Notation
  
	Copyright (c) 2002, 2011, 2018 Jason Aaron Osgood, All rights reserved.

	Appropriate open source license will go here.

	Created: 06/08/2002 Jason Osgood <mrosgood@yahoo.com>
	Updated: 10/01/2011 Jason Osgood <jason@jasonosgood.com> 
	Updated: 07/05/2018 Jason Osgood <jason@jasonosgood.com>

*/

grammar ARON;

root
  :
  '# ARON 0.2'
  ( includes )*
  ( imports )*
  ( child )*
  ( override )*
  EOF
  ;

includes : 'include' Url ;

imports : 'import' combo ;

child
  : label? combo ( LPAREN property* RPAREN )?
  ;

combo : Word ( '.' Word )* ;

label : Word ':' ;

property : combo value ;
  
value
  : scalar
  | child
  | list
  | map
  ;
  
scalar
  : Boolean
  | Integer
  | Float
  | String
  | Timestamp
  | reference
  | 'null'
  ;

// TODO: List of map, list of list
list
  : LBRACK
    ( integerList
    | floatList
    | timestampList
    | booleanList
    | stringList
    | childList
    )?
    RBRACK
  ;

integerList : ( Integer )+ ;
floatList : ( Float )+ ;
timestampList : ( Timestamp )+ ;
booleanList : ( Boolean )+ ;
stringList : ( String )+ ;
childList : ( child )+ ;

map
  : LBRACE pair* RBRACE
  ;
  
pair : key value ;
  
key
  : Word
  | String 
  ;

override : reference method value ;

reference : '@' Word ;

method : '.' Word ;

Boolean
  : 'true'
  | 'false'
  ;

fragment
Exponent 
  : ('e'|'E') ('+'|'-')? ( Digit )+ 
  ;

fragment
Digit 
  : [0-9]
  ;

fragment
Letter
  : [a-zA-Z]
  ;

Integer 
  : ('-')? ( Digit )+ 
  ;
  
Float
  : ('-')? ( Digit )+ '.' ( Digit )* Exponent?
  | '.' ( Digit )+ Exponent?
  | ( Digit )+ Exponent
  ;

String
  : '"' (~["\\\r\n] | Escape)* '"'
  ;

fragment
Escape
  : '\\' [btnr"\\]
  ;

// ISO 8601 - Complete timestamp yyyy-MM-ddThh:mm:ss+hh:mm
Timestamp 
  : Digit Digit Digit Digit '-' Digit Digit '-' Digit Digit 
    ( 
	    'T'
	    Digit Digit ':' Digit Digit 
	    (
		    ':' Digit Digit
		    ( '+' Digit Digit ':' Digit Digit )? // optional timezone
	    )?
    )?
  ;

Url : ( '.' | '/' ) ( '/' ( Letter | Digit | '.' )* )* ;

Word
  : Letter ( Letter | Digit )*
  ;

LineComment
//  : '#' .*? '\n' ->  channel(HIDDEN)
  : '#' ~('\n'|'\r')* ->  channel(HIDDEN)
  ;

BlockComment
  : '/*' .*? '*/' ->  channel(HIDDEN)
  ;

// ARON treats comma as whitespace
Whitespace 
  : [ ,\t\r\n]+ -> skip
  ;

LPAREN : '(' ;
RPAREN : ')' ;
LBRACE : '{' ;
RBRACE : '}' ;
LBRACK : '[' ;
RBRACK : ']' ;
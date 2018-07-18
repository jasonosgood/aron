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

options 
{
  language  = Java;
}

root
  :
  '# ARON 0.1'
  ( includes )*
  ( imports )*
  ( kid )*
  ( override )*
  EOF
  ;

imports
  : 'import' klass
  ;

// "//root/imports/klass"
klass
  : Identifier ( '.' Identifier )*
  ;

  
includes
  : 'include' url
  ;

// "root/includes/url"
url
  : Url
  ;
  
kid
  : ( Label )? Identifier ( LPAREN ( property )* RPAREN )?
  ;

property
  : Identifier value
  ;
  
value
  : scalar
  | kid
  | list
  | map
  ;
  
scalar
  : Boolean
  | Integer
  | Float
  | String
  | Timestamp
  | Reference
  | 'null'
  ;

// TODO: List of map, list of list
list
  : emptyList
  | LBRACK
    ( integerList 
    | floatList
    | timestampList
    | booleanList
    | stringList
    | childList
    )?
    RBRACK
  ;
  
emptyList
  : LBRACK RBRACK
  ;

integerList : ( Integer )+ ;
floatList : ( Float )+ ;
timestampList : ( Timestamp )+ ;
booleanList : ( Boolean )+ ;
stringList : ( String )+ ;
childList : ( kid )+ ;
  
map
  : LBRACE ( pair )* RBRACE
  ;
  
pair
  : key value
  ;
  
key
  : Identifier 
  | String 
  ;

override
  : path method value
  ;

path
  : ( Reference )+
  ;

method
  : ( '.' Identifier )+
  ;

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

fragment Letter : [a-zA-Z] ;

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

Identifier 
  : Letter ( Letter | Digit | '_' )*
  ;

Label 
  : Letter ( Letter | Digit )* ':'
  ;
  
Reference
  : '@' Letter ( Letter | Digit )*
  ;

Url
  : '/' ( Letter | Digit | '/' | '.' )*
  ;
  
//LineComment
//  : '#' .*? '\n' ->  channel(HIDDEN)
////  : '#' ~('\n'|'\r')* ->  channel(HIDDEN)
//  ;

BlockComment
  : '/*' .*? '*/' ->  channel(HIDDEN)
  ;

// ARON treats comma as whitespace
Whitespace 
  : [ ,\t\r\n]+ -> skip
  ;

LPAREN:             '(' ;
RPAREN:             ')' ;
LBRACE:             '{' ;
RBRACE:             '}' ;
LBRACK:             '[' ;
RBRACK:             ']' ;
//SEMI:               ';' ;
//COMMA:              ',' ;
//DOT:                '.' ;
//PREAMBLE: '# ARON 0.1\n' ;
//IMPORT:   'import' ;
//INCLUDE:  'include' ;
//NULL:     'null' ;
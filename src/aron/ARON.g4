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

document :
  include*
  importDecl*
  map*
  override*
  EOF
  ;

include : 'include' Url ;

importDecl : 'import' className ;

override : reference key value ;

alias : '@' Word ;

className : Word ( '.' Word )* ;

map : alias? className? '{' pair* '}' ;

// TODO: list of list
list
  : alias? className?
	'['
		( ( Boolean ','? )+
		| ( Integer ','? )+
		| ( Float ','? )+
		| ( String ','? )+
		| ( Timestamp ','? )+
		| ( map ','? )+
		)?
	']'
  ;

pair
  : key ':'? value ','?
//  | key { this.notifyErrorListeners( "key " + $key.text + " is missing a value", $start  ); }
  | key { this.notifyErrorListeners( $start, "key " + $key.text + " is missing a value", null ); }
  ;

value
  : map
  | scalar
  | list
  ;

scalar
  : Boolean
  | Integer
  | Float
  | String
  | Timestamp
  | reference
  | enumName
  | 'null'
  ;

key
  : Word
  | String
  ;

enumName : Word ;

reference : '#' Word ;

Boolean : 'true' | 'false' ;

fragment
Exponent
  : ('e'|'E') ('+'|'-')? Digit+
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
  : '-'? Digit+
  ;

Float
  : '-'? Digit+ '.' Digit* Exponent?
  | '.' Digit+ Exponent?
  | Digit+ Exponent
  ;

String
  : '"' (~["\\\r\n] | Escape)* '"'
  ;

fragment
Escape
  : '\\' [btnr"\\]
  ;

// ISO 8601 - Timestamps, eg yyyy-MM-ddThh:mm:ss+hh:mm
Timestamp
  : Digit Digit Digit Digit '-' Digit Digit '-' Digit Digit
    (
	    'T'
	    Digit Digit ':' Digit Digit
	    (
		    ':' Digit Digit
		    ( '.' Digit Digit Digit )? // optional fractional
		    ( // optional...
		    	( '+' Digit Digit ':' Digit Digit ) // timezone offset
		    	| 'Z' // or UTC
			)?
	    )?
    )?
  ;

Url : ( '.' | '/' ) ( '/' ( Letter | Digit | '.' )* )* ;

Word
  : ( Letter | Digit )+
  ;

LineComment
  : '//' ~('\n'|'\r')* ->  channel(HIDDEN)
  ;

BlockComment
  : '/*' .*? '*/' ->  channel(HIDDEN)
  ;

Whitespace
  : [ \t\r\n]+ -> skip
  ;
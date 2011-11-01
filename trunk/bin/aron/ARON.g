/*
	ARON.g

	ARON - A Righteous Object Notation
  
	Copyright (c) 2002, 2011 Jason Aaron Osgood, All rights reserved.

	Appropriate open source license will go here.

	Created: 06/08/2002 Jason Osgood <mrosgood@yahoo.com>
	Updated: 10/01/2011 Jason Osgood <jason@jasonosgood.com> 

*/

grammar ARON;

options 
{
  language  = Java;
  backtrack = true;
//  memoize   = true;
}

@parser::header 
{ 
package aron;
}

@parser::members
{
}

@lexer::header 
{ 
package aron;
}

root
  : '# ARON 0.1\n' 
  ( imports )*
  ( child )+
  ;

klass
  : Identifier ( '.' Identifier )*
  ;
  
imports
  : 'import' klass 
  ;

child
  : ( Label )? Identifier ( '(' ( property )* ')' )?
  ;

property
  : Identifier 
  	( value
    | child
    | list
    | assoc
    )
  ;
  
value
  : Bool
  | Integer
  | Float
  | String
  | Timestamp
  | Reference
  ;

// TODO: List of assoc, list of list
list
  : '['
    ( integerList 
    | floatList
    | timestampList
    | booleanList
    | childList
    )?
    ']'
  ;

stringList : ( String )+ ;
integerList : ( Integer )+ ;
floatList : ( Float )+ ;
timestampList : ( Timestamp )+ ;
booleanList : ( Bool )+ ;
childList : ( child )+ ;
  
assoc
  : '{' ( property )* '}'
  ;

Bool
  : 'true'
  | 'false'
  ;

fragment
Exponent 
  : ('e'|'E') ('+'|'-')? ( Digit )+ 
  ;

fragment
Digit 
  : '0'..'9' 
  ;

Integer 
  : ( Digit )+ 
  ;
  
Float
  : ( Digit )+ '.' ( Digit )* Exponent?
  | '.' ( Digit )+ Exponent?
  | ( Digit )+ Exponent
  ;
  
String 
  : '\"' ( options {greedy=false;} : . )* '\"'
  ;

// ISO 8601 - Complete timestamp yyyy-MM-ddThh:mm:ss+hh:mm
Timestamp 
  : Digit Digit Digit Digit '-' Digit Digit '-' Digit Digit 
    'T'
    Digit Digit ':' Digit Digit ':' Digit Digit
    ( '+' Digit Digit ':' Digit Digit )? // optional timezone
  ;

Identifier 
  : ('a'..'z'|'A'..'Z') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
  ;

Label 
  : ('a'..'z'|'A'..'Z') ('a'..'z'|'A'..'Z'|'0'..'9')* ':'
  ;
  
Reference
  : '@' ('a'..'z'|'A'..'Z') ('a'..'z'|'A'..'Z'|'0'..'9')*
  ;

Comment
  : '//' ~('\n'|'\r')* '\r'? '\n' { $channel=HIDDEN; }
  | '/*' ( options {greedy=false;} : . )* '*/' { $channel=HIDDEN; }
  ;

// Aron treats comma as whitespace
Whitespace 
  : ( '\t' | ' ' | '\r' | '\n' | ',' )+ { $channel = HIDDEN; }
  ;


// done
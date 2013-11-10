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
  ( includes )*
  ( imports )*
  ( child )*
  ( override )*
  ;

imports
  : 'import' klass 
  ;

// "root/imports/klass"
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

override
  : path method value
  ;

path
  : ( Reference )+
  ;

method
  : ( '.' Identifier )+
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
  : ('-')? ( Digit )+ 
  ;
  
Float
  : ('-')? ( Digit )+ '.' ( Digit )* Exponent?
  | '.' ( Digit )+ Exponent?
  | ( Digit )+ Exponent
  ;
  
String
@init { final StringBuilder buf = new StringBuilder(); }
  :
  '"'
  (
    Escape[buf]
    | i = ~( '\\' | '"' )  { buf.appendCodePoint(i); }
  )*
  '"'
  { setText(buf.toString()); }
  ;

fragment Escape[StringBuilder buf] 
  :
  '\\'
  ( 
    't' { buf.append('\t'); }
    | 'n' { buf.append('\n'); }
    | 'r' { buf.append('\r'); }
    | '"' { buf.append('\"'); }
    | '\\' { buf.append('\\'); }
  )
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
  : ('a'..'z'|'A'..'Z') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
  ;

Label 
  : ('a'..'z'|'A'..'Z') ('a'..'z'|'A'..'Z'|'0'..'9')* ':'
  ;
  
Reference
  : '@' ('a'..'z'|'A'..'Z') ('a'..'z'|'A'..'Z'|'0'..'9')*
  ;

Url
  : ( 'a'..'z' | 'A'..'Z' | '0'..'9' | '/' | '.' )*
  ;
  
Comment
  : '#' ~('\n'|'\r')* '\r'? '\n' { $channel=HIDDEN; }
  | '/*' ( options {greedy=false;} : . )* '*/' { $channel=HIDDEN; }
  ;

// Aron treats comma as whitespace
Whitespace 
  : ( '\t' | ' ' | '\r' | '\n' | ',' )+ { $channel = HIDDEN; }
  ;

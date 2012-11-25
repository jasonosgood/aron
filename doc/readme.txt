ARON - A Righteous Object Notation

Suitable for persisting arbitrary Java object graphs. Or any other "grove" data structure (tree decorated with key/value pairs).
 
More concise, complete, expressive than JSON, XML, YAML, etc.  

Uses ANTLR v3.4. Grammar is LL(*). Use ANTLR3IDE Eclipse plugin.

Derived from VRML-95. With most of the interesting bits removed.

AUTHOR

Jason Osgood
jason@jasonosgood.com
zappini@gmail.com

UPDATE

10/24/2012 - Polished demo.
10/24/2012 - Fixed bugs with negative numbers, using simple class names.
10/24/2012 - Added Enum support.
10/23/2012 - ARONWriter generates import declarations
10/23/2012 - First cut of ARONWriter

TODO

Add support for Reference values.
Support inline fully declared classes (e.g. package.name.ClassName).
Maybe have an include mechanism.
Unit tests.

add scalar type for URL, URL, fragments
cycle detection / avoidance
cache duplicate vanilla objects and fields (if serialization performance ever matters)
ARONReader exceptions report offending line number and character offset
upgrade to ANTLR 4.x, rewriting grammar

handle creating, expanding arrays

HOW TO BUILD

ARON is currently built using Eclipse and Edgar Espina's ANTR IDE. With the ANTLR 
project nature is enabled, the lexer and parser are automatically generated when
the ARON.g grammar is changed.

Note that you MUST have ANTLR IDE's "generated debug code" enabled. ARON uses the ANTLR
debugger hooks to generate a DOM-like parse tree. This won't be necessary when ARON
moves to ANTLR 4.x. 

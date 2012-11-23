ARON - A Righteous Object Notation

Suitable for persisting arbitrary Java object graphs. Or any other "grove" data structure (tree decorated with key/value pairs).
 
More concise, complete, expressive than JSON, XML, YAML, etc.  

Uses ANTLR v3.4. Grammar is LL(*). Use ANTLR3IDE Eclipse plugin.

Derived from VRML-95. With most of the interesting bits removed.

UPDATE

10/23/2012 - ARONWriter generates import declarations
10/23/2012 - First cust of ARONWriter

TODO

Add support for Reference values.
Support inline fully declared classes (e.g. package.name.ClassName).
Maybe have an include mechanism.
Unit tests.

add scalar type for URL, URL, fragments
cycle detection / avoidance
cache duplicate vanilla objects and fields (if serialization performance ever matters)
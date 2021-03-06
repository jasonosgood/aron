ARON - A Righteous Object Notation

Suitable for persisting arbitrary Java object graphs. Or any other "grove" data structure (tree decorated with key/value pairs).
 
More concise, complete, expressive than JSON, XML, YAML, etc.  

Uses ANTLR v4.7. Grammar is LL(*).

Derived from VRML-95. With most of the interesting bits removed.

AUTHOR

Jason Osgood
jason@jasonosgood.com
zappini@gmail.com

UPDATE
2018/08/10 Updated grammar to ANTLR 4.7
11/21/2013 - Actually coded support for all scalar lists
11/10/2013 - Override values can now be class instances, enums
11/10/2013 - Added include and override features
06/20/2012 - More forgiving datetime parsing
06/19/2012 - Escape characters within string literals, eg \n \r \t \\ \"
10/24/2012 - Polished demo.
10/24/2012 - Fixed bugs with negative numbers, using simple class names.
10/24/2012 - Added Enum support.
10/23/2012 - ARONWriter generates import declarations
10/23/2012 - First cut of ARONWriter

TODO

Add support for Reference values.
Support inline fully declared classes (e.g. package.name.ClassName).
improve include mechanism to accept URLs for http:, file:
Unit tests.
omit import statements for enums when serializing to ARON
override page expression language for null, array element, map element 

add scalar type for URL, URL, fragments
cycle detection / avoidance
cache duplicate vanilla objects and fields (if serialization performance ever matters)
ARONReader exceptions report offending line number and character offset

HOW TO BUILD


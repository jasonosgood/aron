# A Righteous Object Notation

Human readable syntax for serialized object graphs. Superset of JSON.

Ideal for configuration files. Useful for data exchange.

Curly brackets `{}` enclose pairs of keys and values representing
objects and maps. Square brackets `[]` enclose items
representing lists.

Supported scalar data types are string, integer, float, boolean, enums,
and UTC dates.

## Improvements over JSON
 - Type aware
 - Object references
 - Inclusion
 - Overrides
 - UTC dates
 - Enums
 - Optional commas, colons
 - Optional quotes for keys
 - Comments

## Type aware

By default, `ARONReader` instantiates `LinkedHashMap` for maps
and `ArrayList` for lists.

```
// Creates a map
{ apple "fuji" }
```

Or specify the class.

```
// Import class to use, just like Java
import Fruit

// Creates a Fruit object
Fruit { apple "fuji" }
```

ARON's type inference often allows you to omit the class. The two following
examples are equivalent.

```
import Basket
import Fruit

Basket
{
    // Explicit class name
    fig Fruit { apple "fuji" }
}
```

```
import Basket

Basket
{
    // Or allow ARON to infer class name
    fig { apple "fuji" }
}
```

ARON will use the default classes (for maps and lists) if inference fails.

## Object references

Reuse objects using aliases and references. Add an alias
to an object (map and list) to be referenced elsewhere.

```
import Basket
import Fruit

// Alias called 'example'
@example Fruit { apple "fuji" }

Basket
{
    // Reference 'example'
    fig #example
}
```


## Reflection

Detail heuristics for reflection.

## Comparison

List some other notations here.

## TODO
 - support Java's @notnull annotation
 - support list of lists, map of maps
 - import, include, overrides rules: verify one per line, on own line
 - listener for errors, warnings, infos
 - URIs
 - intrinsic string templates, eg <<Hello, #name>>
 - environment variables
 - class definitions
 - ARON to Java code generator
 - build script
 - publish
 - usage instructions
 - support field reflection
 - support scalar arrays (?)
 - verify autoboxing works
 - resolve references at end (order independent)
 - root level lists, scalars (just like JSON)

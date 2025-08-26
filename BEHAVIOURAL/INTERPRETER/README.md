# Interpreter Pattern

## What is it?
A behavioral design pattern that defines a grammatical representation for a language and provides an interpreter to deal with this grammar.

## Definition
The Interpreter pattern provides a way to evaluate language grammar or expressions. It involves implementing an expression interface that tells how to interpret a particular context.

## Example in this project
**Mathematical Expression Interpreter** - Interprets simple mathematical expressions like addition and subtraction.

### How it works:
1. **Expression** (interface) - Defines interpret() method
2. **NumberExpression** - Interprets numeric values
3. **AdditionExpression** - Interprets addition operations
4. **SubtractionExpression** - Interprets subtraction operations

The interpreter builds an abstract syntax tree (AST) and evaluates expressions by traversing this tree.

## When to use this pattern:
- When you need to interpret a simple language
- When you have a grammar that can be represented as a syntax tree
- When you want to add new operations to expressions
- When the grammar is relatively simple
- When performance is not a critical concern

## Real-world scenarios:
- SQL query interpreters
- Regular expression engines
- Mathematical expression parsers
- Configuration file parsers
- Domain-specific languages (DSLs)

## Benefits:
- **Extensibility**: Easy to add new expressions and operations
- **Maintainability**: Grammar rules are clearly separated
- **Reusability**: Expression classes can be reused
- **Simplicity**: Clear structure for language interpretation

## Limitations:
- **Complexity**: Can become complex for large grammars
- **Performance**: May not be efficient for complex expressions
- **Debugging**: Can be difficult to debug complex interpreters

## How to run:
```bash
cd BEHAVIOURAL/INTERPRETER
javac *.java
java Main
```

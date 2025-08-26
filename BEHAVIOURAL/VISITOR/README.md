# Visitor Pattern

## What is it?
A behavioral design pattern that allows you to define new operations on objects without changing their classes.

## Definition
The Visitor pattern lets you separate algorithms from the objects on which they operate. It allows you to add new operations to existing object structures without modifying those structures.

## Example in this project
**Shopping Cart System** - Different operations (price calculation with discounts) can be applied to different item types without modifying the item classes.

### How it works:
1. **ItemElement** (interface) - Defines accept() method for visitors
2. **Book** - Concrete element representing a book item
3. **Electronics** - Concrete element representing an electronics item
4. **ShoppingCartVisitor** (interface) - Defines visit methods for each element type
5. **ShoppingCartImplementation** - Concrete visitor implementing price calculations

The visitor can perform different operations on different item types without changing the item classes themselves.

## When to use this pattern:
- When you have a stable object structure but frequently changing operations
- When you want to separate algorithms from the objects they operate on
- When you want to add new operations without changing existing classes
- When you have many unrelated operations on the same object structure
- When you want to avoid polluting element classes with operation-specific code

## Real-world scenarios:
- Compiler operations on AST nodes
- Document processing systems
- E-commerce pricing calculations
- Report generation systems
- Code analysis tools

## Benefits:
- **Open/Closed Principle**: Easy to add new operations without changing existing classes
- **Single Responsibility**: Each visitor class has one responsibility
- **Separation of Concerns**: Operations are separated from object structure
- **Extensibility**: Easy to add new operations

## Drawbacks:
- **Complexity**: Can be complex to understand and implement
- **Tight Coupling**: Visitors need to know about all element types
- **Breaking Encapsulation**: May require exposing internal state of elements
- **Performance**: Can impact performance due to double dispatch

## Double Dispatch:
The Visitor pattern uses double dispatch - the method called depends on both the visitor type and the element type. This allows for different behavior based on the combination of visitor and element.

## How to run:
```bash
cd BEHAVIOURAL/VISITOR
javac *.java
java Main
```

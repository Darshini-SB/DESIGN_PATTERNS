# Iterator Pattern

## What is it?
A behavioral design pattern that provides a way to access the elements of a collection object in sequential manner without exposing its underlying representation.

## Definition
The Iterator pattern provides a way to traverse through a collection of objects without exposing the underlying implementation details. It encapsulates the iteration logic and provides a uniform interface for accessing elements.

## Example in this project
**Book Collection Iterator** - Iterates through a collection of books without exposing the internal array structure.

### How it works:
1. **Iterator** (interface) - Defines hasNext() and next() methods
2. **BookCollectionInterface** - Defines createIterator() method
3. **BookCollection** - Concrete collection that implements the interface
4. **BookIterator** - Concrete iterator that traverses the collection

The client code can iterate through books without knowing how they're stored internally (array, list, etc.).

## When to use this pattern:
- When you want to access a collection's contents without exposing its internal structure
- When you want to support multiple traversal methods for a collection
- When you want to provide a uniform interface for traversing different collection types
- When you want to simplify the collection interface

## Real-world scenarios:
- Iterating through database results
- File system traversal
- Menu navigation systems
- Social media feeds
- E-commerce product listings

## Benefits:
- **Encapsulation**: Collection implementation details are hidden
- **Uniform Interface**: Same interface for different collection types
- **Multiple Iterators**: Can have multiple iterators for the same collection
- **Separation of Concerns**: Iteration logic is separated from collection logic

## Common Iterator Types:
- **Forward Iterator**: Traverses from beginning to end
- **Backward Iterator**: Traverses from end to beginning
- **Bidirectional Iterator**: Can traverse in both directions
- **Random Access Iterator**: Can jump to any position

## How to run:
```bash
cd BEHAVIOURAL/ITERATOR
javac *.java
java Main
```

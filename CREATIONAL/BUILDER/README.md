# Builder Pattern

## What is it?
A creational design pattern that lets you construct complex objects step by step, allowing you to produce different types and representations of an object using the same construction code.

## Definition
The Builder pattern separates the construction of a complex object from its representation, allowing the same construction process to create different representations.

## Example in this project
**Car Builder** - Constructs a car object step by step with different configurations (engine, wheels, color, etc.).

### How it works:
1. **Car** - The complex object being built
2. **CarBuilder** - Abstract builder interface
3. **Concrete Builder** - Implements the building steps
4. **Director** - Orchestrates the building process

The builder allows creating cars with different configurations using the same building process.

## When to use this pattern:
- When you need to create complex objects with many optional parameters
- When you want to create different representations of the same object
- When you want to ensure that objects are always in a valid state
- When you want to provide a fluent interface for object creation
- When you want to separate object construction from its representation

## Real-world scenarios:
- Configuration object creation
- Database query builders
- HTML/XML document builders
- Game character creation
- Report generation systems

## Benefits:
- **Step-by-step Construction**: Complex objects can be built step by step
- **Fluent Interface**: Provides a readable and intuitive API
- **Immutability**: Can create immutable objects
- **Validation**: Can validate object state during construction
- **Flexibility**: Same builder can create different representations

## Drawbacks:
- **Complexity**: Can be complex to implement
- **Object Proliferation**: May create many builder classes
- **Overhead**: May add unnecessary complexity for simple objects

## Builder vs Constructor:
- **Constructor**: Limited parameters, less readable
- **Builder**: Many parameters, fluent interface, validation

## Common Builder Features:
- **Method Chaining**: Return `this` for fluent interface
- **Validation**: Check parameters during building
- **Default Values**: Provide sensible defaults
- **Immutability**: Create immutable final objects

## How to run:
```bash
cd CREATIONAL/BUILDER
javac *.java
java Main
```

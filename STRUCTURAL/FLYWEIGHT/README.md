# Flyweight Pattern

## What is it?
A structural design pattern that lets you fit more objects into the available amount of RAM by sharing common parts of state between multiple objects instead of keeping all of the data in each object.

## Definition
The Flyweight pattern reduces the cost of creating and manipulating a large number of similar objects by sharing common parts of state between multiple objects instead of keeping all of the data in each object.

## Example in this project
**Text Character System** - Shares common character objects instead of creating new ones for each character, reducing memory usage.

### How it works:
1. **TextCharacter** (interface) - Defines the flyweight interface
2. **ConcreteCharacter** - Concrete flyweight with intrinsic state
3. **CharacterFactory** - Factory that creates and caches flyweights
4. **Client** - Uses flyweights through the factory

The factory ensures that each unique character is created only once and reused.

## When to use this pattern:
- When you need to create a large number of similar objects
- When you want to reduce memory usage
- When you have objects with shared state
- When you want to improve performance
- When you have limited memory resources

## Real-world scenarios:
- Text editors and word processors
- Game development (tiles, sprites)
- GUI frameworks
- Database connection pooling
- Caching systems

## Benefits:
- **Memory Efficiency**: Reduces memory usage by sharing objects
- **Performance**: Improves performance by reducing object creation
- **Scalability**: Can handle large numbers of objects efficiently
- **Reusability**: Objects can be reused across the application

## Drawbacks:
- **Complexity**: Can add complexity to the codebase
- **Thread Safety**: Requires careful implementation for multi-threading
- **Debugging**: Can be difficult to debug shared state

## Flyweight vs Singleton:
- **Flyweight**: Multiple instances with shared state
- **Singleton**: Single instance for the entire application

## Key Concepts:
- **Intrinsic State**: Shared state that doesn't change
- **Extrinsic State**: State that varies and is passed to methods
- **Flyweight Factory**: Manages creation and caching of flyweights

## Memory Optimization:
- **Object Pooling**: Reuses objects instead of creating new ones
- **State Sharing**: Shares common state between objects
- **Lazy Loading**: Creates objects only when needed

## How to run:
```bash
cd STRUCTURAL/FLYWEIGHT
javac *.java
java Main
```

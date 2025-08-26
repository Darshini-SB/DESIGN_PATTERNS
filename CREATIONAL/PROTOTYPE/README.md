# Prototype Pattern

## What is it?
A creational design pattern that lets you copy existing objects without making your code dependent on their classes.

## Definition
The Prototype pattern creates new objects by cloning an existing object, known as the prototype, instead of creating new instances from scratch.

## Example in this project
**Document Cloning System** - Creates new documents by cloning existing ones instead of creating them from scratch.

### How it works:
1. **Prototype** (interface) - Defines the clone method
2. **Document** - Concrete prototype that can be cloned
3. **clone()** - Method that creates a copy of the object

Instead of creating new objects with `new`, the prototype creates copies of existing objects.

## When to use this pattern:
- When you want to avoid building a class hierarchy of factories
- When you want to avoid the cost of creating objects from scratch
- When you want to create objects that are similar to existing ones
- When you want to hide the complexity of object creation
- When you want to reduce the number of classes

## Real-world scenarios:
- Object cloning in games
- Template-based document creation
- Configuration object copying
- Database record duplication
- GUI component cloning

## Benefits:
- **Performance**: Avoids expensive object creation
- **Flexibility**: Can create objects at runtime
- **Reduced Subclassing**: No need for factory hierarchies
- **Dynamic Object Creation**: Objects can be created based on prototypes

## Drawbacks:
- **Complexity**: Can be complex to implement deep cloning
- **Memory Usage**: May use more memory with many prototypes
- **Cloning Logic**: Need to handle complex object relationships

## Shallow vs Deep Cloning:
- **Shallow Clone**: Copies object references
- **Deep Clone**: Copies all nested objects

## Implementation Considerations:
- **Cloneable Interface**: Java's built-in cloning mechanism
- **Copy Constructor**: Alternative to cloning
- **Serialization**: Deep cloning using serialization
- **Manual Copying**: Explicit copying of all fields

## How to run:
```bash
cd CREATIONAL/PROTOTYPE
javac *.java
java Main
```

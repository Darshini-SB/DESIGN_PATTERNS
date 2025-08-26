# Memento Pattern

## What is it?
A behavioral design pattern that allows you to save and restore the previous state of an object without revealing the details of its implementation.

## Definition
The Memento pattern provides the ability to restore an object to its previous state (undo via rollback). It captures and externalizes an object's internal state so that the object can be restored to this state later.

## Example in this project
**Text Editor with Undo** - Saves and restores the state of text content, allowing undo operations.

### How it works:
1. **Memento** - Stores the state of the originator
2. **TextEditor** (Originator) - Creates and uses mementos to save/restore state
3. **History** (Caretaker) - Manages the collection of mementos

The text editor can save its current state and restore to any previous state without exposing its internal structure.

## When to use this pattern:
- When you want to save and restore an object's state
- When you want to implement undo/redo functionality
- When you want to avoid exposing object's internal state
- When you want to provide checkpoints in an application
- When you want to implement transaction rollback

## Real-world scenarios:
- Text editors with undo/redo
- Game save/load systems
- Database transaction rollback
- Configuration management
- Version control systems

## Benefits:
- **Encapsulation**: Object's internal state is protected
- **Undo/Redo**: Easy to implement undo functionality
- **State Management**: Clean way to manage object states
- **Separation of Concerns**: State management is separated from business logic

## Components:
- **Originator**: Creates mementos and restores from them
- **Memento**: Stores the state
- **Caretaker**: Manages the collection of mementos

## Considerations:
- **Memory Usage**: Can consume significant memory with many states
- **Performance**: Creating mementos can be expensive for large objects
- **State Size**: Large states can impact performance

## How to run:
```bash
cd BEHAVIOURAL/MEMENTO
javac *.java
java Main
```

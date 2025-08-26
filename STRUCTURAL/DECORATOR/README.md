# Decorator Pattern

## What is it?
A structural design pattern that lets you attach new behaviors to objects by placing these objects inside special wrapper objects that contain the behaviors.

## Definition
The Decorator pattern allows behavior to be added to individual objects dynamically without affecting the behavior of other objects of the same class. It provides a flexible alternative to subclassing for extending functionality.

## Example in this project
**Text Styling System** - Adds text formatting (bold, italic, underline) to plain text dynamically.

### How it works:
1. **Text** (interface) - Component interface
2. **PlainText** - Concrete component
3. **TextDecor** (abstract class) - Base decorator class
4. **BoldText/ItalicText/Underline** - Concrete decorators

Decorators wrap the original text object and add formatting without changing the original class.

## When to use this pattern:
- When you want to add or remove responsibilities from objects dynamically
- When you want to avoid subclassing for extending functionality
- When you want to combine multiple behaviors flexibly
- When you want to add functionality to objects without affecting other objects
- When you want to provide an alternative to subclassing

## Real-world scenarios:
- GUI component styling
- Stream processing (Java I/O)
- Middleware in web applications
- Text formatting systems
- Coffee shop ordering systems

## Benefits:
- **Flexibility**: Can add/remove behaviors dynamically
- **Single Responsibility**: Each decorator has one responsibility
- **Open/Closed Principle**: Open for extension, closed for modification
- **Composition over Inheritance**: Uses composition instead of inheritance

## Drawbacks:
- **Complexity**: Can lead to many small classes
- **Debugging**: Can be difficult to debug with many decorators
- **Performance**: May add overhead with many decorators

## Decorator vs Inheritance:
- **Inheritance**: Static, compile-time behavior
- **Decorator**: Dynamic, runtime behavior

## Key Concepts:
- **Component**: Interface for objects that can have responsibilities added
- **Concrete Component**: Basic implementation
- **Decorator**: Abstract class that maintains a reference to a component
- **Concrete Decorator**: Adds responsibilities to the component

## Common Decorator Chain:
```java
Text text = new PlainText("Hello");
text = new BoldText(text);
text = new ItalicText(text);
text = new Underline(text);
```

## How to run:
```bash
cd STRUCTURAL/DECORATOR
javac *.java
java Main
```

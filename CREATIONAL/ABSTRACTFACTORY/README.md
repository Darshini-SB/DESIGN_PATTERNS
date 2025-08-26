# Abstract Factory Pattern

## What is it?
A creational design pattern that provides an interface for creating families of related objects without specifying their concrete classes.

## Definition
The Abstract Factory pattern provides an interface for creating families of related or dependent objects without specifying their concrete classes. It ensures that the created objects are compatible with each other.

## Example in this project
**GUI Component Factory** - Creates families of UI components (buttons, checkboxes) for different operating systems (Windows, Mac).

### How it works:
1. **GUIFactory** (interface) - Defines methods to create UI components
2. **Button/Checkbox** (interfaces) - Define component interfaces
3. **WindowsFactory** - Creates Windows-style components
4. **MacFactory** - Creates Mac-style components
5. **WindowsButton/MacButton** - Platform-specific implementations

Each factory creates a complete family of related components that work together.

## When to use this pattern:
- When you need to create families of related objects
- When you want to ensure that created objects are compatible
- When you want to hide the complexity of object creation
- When you want to support multiple product families
- When you want to enforce consistency among products

## Real-world scenarios:
- Cross-platform UI frameworks
- Database abstraction layers
- Theme systems in applications
- Plugin architectures
- Configuration systems

## Benefits:
- **Product Consistency**: Ensures products from the same family work together
- **Loose Coupling**: Client code doesn't depend on concrete classes
- **Extensibility**: Easy to add new product families
- **Encapsulation**: Hides creation complexity

## Drawbacks:
- **Complexity**: Can be complex to implement
- **Object Proliferation**: May create many classes
- **Rigidity**: Adding new product types requires changing the interface

## Abstract Factory vs Factory Method:
- **Factory Method**: Creates one type of object
- **Abstract Factory**: Creates families of related objects

## How to run:
```bash
cd CREATIONAL/ABSTRACTFACTORY
javac *.java
java Main
```

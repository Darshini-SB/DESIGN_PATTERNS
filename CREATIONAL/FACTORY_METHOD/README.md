# Factory Method Pattern

## What is it?
A creational design pattern that provides an interface for creating objects but lets subclasses decide which class to instantiate.

## Definition
The Factory Method pattern defines an interface for creating an object, but lets subclasses decide which class to instantiate. It defers instantiation to subclasses.

## Example in this project
**Document Creation System** - Different document types (PDF, Word) are created by their respective factories.

### How it works:
1. **Document** (interface) - Defines the product interface
2. **DocumentFactory** (interface) - Defines the factory interface
3. **PdfFactory** - Creates PDF documents
4. **WordFactory** - Creates Word documents
5. **PdfDoc/WordDoc** - Concrete document implementations

Each factory is responsible for creating its own type of document, allowing for easy extension.

## When to use this pattern:
- When you don't know the exact types of objects your code will work with
- When you want to provide users of your library with a way to extend its internal components
- When you want to reuse existing objects instead of rebuilding them each time
- When you want to save system resources by reusing existing objects instead of creating new ones

## Real-world scenarios:
- Document creation systems
- UI component creation
- Database connection factories
- Logger creation systems
- Payment gateway factories

## Benefits:
- **Loose Coupling**: Client code doesn't need to know concrete classes
- **Extensibility**: Easy to add new product types
- **Single Responsibility**: Each factory has one responsibility
- **Open/Closed Principle**: Open for extension, closed for modification

## Drawbacks:
- **Complexity**: Can lead to many factory classes
- **Inheritance**: Uses inheritance which can be limiting
- **Object Proliferation**: May create many small classes

## Factory Method vs Simple Factory:
- **Simple Factory**: One factory class creates all products
- **Factory Method**: Each product has its own factory class

## How to run:
```bash
cd CREATIONAL/FACTORY_METHOD
javac *.java
java Main
```

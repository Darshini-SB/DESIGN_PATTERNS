# Singleton Pattern

## What is it?
A creational design pattern that ensures a class has only one instance and provides a global point of access to that instance.

## Definition
The Singleton pattern restricts the instantiation of a class to a single instance and provides a global point of access to that instance throughout the application.

## Example in this project
**Database Connection Manager** - Ensures only one database connection instance exists throughout the application.

### How it works:
1. **Singleton** - Class with private constructor and static instance
2. **getInstance()** - Static method that returns the single instance
3. **Private Constructor** - Prevents external instantiation
4. **Static Instance** - Holds the single instance

The singleton ensures that no matter how many times you call `getInstance()`, you always get the same object.

## When to use this pattern:
- When you need exactly one instance of a class
- When you want to control access to a shared resource
- When you want to ensure global state management
- When you need lazy initialization of an expensive object
- When you want to coordinate actions across the system

## Real-world scenarios:
- Database connection managers
- Configuration managers
- Logger instances
- Cache managers
- Thread pools

## Benefits:
- **Single Instance**: Guarantees only one instance exists
- **Global Access**: Provides global point of access
- **Lazy Initialization**: Instance created only when first needed
- **Thread Safety**: Can be made thread-safe
- **Resource Management**: Efficient resource usage

## Drawbacks:
- **Global State**: Can lead to global state issues
- **Testing Difficulty**: Hard to test due to global state
- **Thread Safety**: Requires careful implementation for multi-threading
- **Tight Coupling**: Can create tight coupling in the system

## Implementation Considerations:
- **Thread Safety**: Use synchronized or double-checked locking
- **Lazy vs Eager**: Choose between lazy and eager initialization
- **Serialization**: Handle serialization if needed
- **Reflection**: Protect against reflection attacks

## How to run:
```bash
cd CREATIONAL/SINGLETON
javac *.java
java Main
```

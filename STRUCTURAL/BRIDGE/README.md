# Bridge Pattern

## What is it?
A structural design pattern that lets you split a large class or a set of closely related classes into abstraction and implementation, which can be developed independently.

## Definition
The Bridge pattern separates an abstraction from its implementation so that both can vary independently. It uses composition instead of inheritance to bridge the abstraction and implementation.

## Example in this project
**Device Control System** - Separates device abstraction (TV, Radio) from remote control implementation (Basic, Advanced).

### How it works:
1. **Device** (interface) - Defines device operations
2. **RemoteControl** (abstract class) - Defines remote control abstraction
3. **TV/Radio** - Concrete device implementations
4. **BasicRemote/AdvancedRemote** - Concrete remote control implementations

The bridge allows any remote control to work with any device, and both can be extended independently.

## When to use this pattern:
- When you want to avoid a permanent binding between an abstraction and its implementation
- When both the abstraction and implementation should be extensible by subclassing
- When changes in the implementation should not affect client code
- When you want to hide implementation details from clients
- When you have a proliferation of classes due to inheritance

## Real-world scenarios:
- Cross-platform UI frameworks
- Database driver implementations
- Plugin architectures
- Device driver systems
- API abstraction layers

## Benefits:
- **Decoupling**: Abstraction and implementation are decoupled
- **Extensibility**: Both can be extended independently
- **Single Responsibility**: Each class has one responsibility
- **Open/Closed Principle**: Open for extension, closed for modification

## Drawbacks:
- **Complexity**: Can increase complexity for simple scenarios
- **Indirection**: Adds an extra layer of indirection
- **Performance**: May add slight overhead

## Bridge vs Adapter:
- **Bridge**: Designed upfront to separate abstraction from implementation
- **Adapter**: Retrofit existing incompatible interfaces

## Key Concepts:
- **Abstraction**: High-level interface that clients use
- **Implementation**: Low-level interface that provides the actual functionality
- **Bridge**: Composition that connects abstraction to implementation

## How to run:
```bash
cd STRUCTURAL/BRIDGE
javac *.java
java Main
```

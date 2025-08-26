# Facade Pattern

## What is it?
A structural design pattern that provides a simplified interface to a complex subsystem of classes, making it easier to use.

## Definition
The Facade pattern provides a unified interface to a set of interfaces in a subsystem. It defines a higher-level interface that makes the subsystem easier to use.

## Example in this project
**Home Theatre System** - Simplifies the complex operations of multiple devices (DVD player, projector, sound system) into a single, easy-to-use interface.

### How it works:
1. **HomeTheatre** - Facade class that simplifies the subsystem
2. **DvdPlayer** - Complex subsystem component
3. **Projector** - Complex subsystem component
4. **SoundSystem** - Complex subsystem component
5. **Client** - Uses the simple facade interface

The facade hides the complexity of coordinating multiple devices behind a simple interface.

## When to use this pattern:
- When you want to provide a simple interface to a complex subsystem
- When you want to decouple a subsystem from its clients
- When you want to layer your subsystems
- When you want to reduce dependencies between clients and subsystem classes
- When you want to provide a unified interface to multiple interfaces

## Real-world scenarios:
- Home automation systems
- API wrappers
- Database access layers
- Compiler front-ends
- Web service clients

## Benefits:
- **Simplification**: Hides complexity behind a simple interface
- **Decoupling**: Reduces dependencies between clients and subsystems
- **Easier Maintenance**: Changes to subsystem don't affect clients
- **Better Organization**: Provides a clear entry point to the subsystem

## Drawbacks:
- **God Object**: Facade can become a god object if too large
- **Tight Coupling**: Facade can become tightly coupled to subsystem
- **Limited Flexibility**: May not expose all subsystem functionality

## Facade vs Adapter:
- **Facade**: Simplifies a complex subsystem
- **Adapter**: Makes incompatible interfaces compatible

## Key Concepts:
- **Facade**: Simplified interface to the subsystem
- **Subsystem Classes**: Complex classes that the facade simplifies
- **Client**: Code that uses the facade

## Common Facade Operations:
- **Initialization**: Setting up the subsystem
- **Coordination**: Orchestrating multiple subsystem components
- **Cleanup**: Properly shutting down the subsystem

## How to run:
```bash
cd STRUCTURAL/FACADE
javac *.java
java Main
```

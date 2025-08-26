# Adapter Pattern

## What is it?
A structural design pattern that allows objects with incompatible interfaces to collaborate by wrapping an existing class with a new interface.

## Definition
The Adapter pattern converts the interface of a class into another interface that clients expect. It lets classes work together that couldn't otherwise because of incompatible interfaces.

## Example in this project
**Payment System Adapter** - Adapts a third-party payment system (DollarPayment) to work with your existing payment interface.

### How it works:
1. **Payment** (interface) - Target interface that clients expect
2. **DollarPayment** - Adaptee class with incompatible interface
3. **PaymentAdapter** - Adapter that makes DollarPayment compatible
4. **Client** - Uses the Payment interface

The adapter translates calls from the Payment interface to the DollarPayment interface.

## When to use this pattern:
- When you want to use an existing class but its interface doesn't match your code
- When you want to create a reusable class that cooperates with classes that don't have compatible interfaces
- When you need to work with multiple existing subclasses but it's impractical to adapt their interface by subclassing every one
- When you want to integrate third-party libraries

## Real-world scenarios:
- Legacy system integration
- Third-party API integration
- Database adapter implementations
- Payment gateway integrations
- File format converters

## Benefits:
- **Compatibility**: Makes incompatible interfaces work together
- **Reusability**: Can reuse existing classes
- **Flexibility**: Can adapt multiple classes to the same interface
- **Single Responsibility**: Adapter has one job - making interfaces compatible

## Drawbacks:
- **Complexity**: Can add complexity to the codebase
- **Performance**: May add slight overhead
- **Object Proliferation**: Can lead to many adapter classes

## Adapter vs Facade:
- **Adapter**: Makes one interface compatible with another
- **Facade**: Provides a simplified interface to a complex subsystem

## Types of Adapters:
- **Class Adapter**: Uses inheritance
- **Object Adapter**: Uses composition (more flexible)

## How to run:
```bash
cd STRUCTURAL/ADAPTER
javac *.java
java Main
```

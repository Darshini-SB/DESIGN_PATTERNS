# Observer Pattern

## What is it?
A behavioral design pattern that defines a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.

## Definition
The Observer pattern establishes a one-to-many relationship between objects. When the subject (observable) changes its state, it automatically notifies all its observers (dependents) about the change.

## Example in this project
**Stock Price Notification System** - Investors are notified when stock prices change.

### How it works:
1. **Subject** (interface) - Defines methods to manage observers
2. **Observer** (interface) - Defines update method for observers
3. **Stock** - Concrete subject that notifies observers of price changes
4. **Investor** - Concrete observer that receives price updates

When the stock price changes, all registered investors are automatically notified.

## When to use this pattern:
- When you want to notify multiple objects about state changes
- When you want to maintain consistency between related objects
- When you want to implement event handling systems
- When you have a one-to-many relationship between objects
- When you want to decouple the subject from its observers

## Real-world scenarios:
- Stock market price updates
- Social media notifications
- Model-View-Controller (MVC) architecture
- Event-driven programming
- Publish-subscribe systems

## Benefits:
- **Loose Coupling**: Subject and observers are loosely coupled
- **Extensibility**: Easy to add new observers
- **Automatic Updates**: Observers are automatically notified
- **Reusability**: Observer classes can be reused

## Drawbacks:
- **Memory Leaks**: Observers must be properly removed to avoid memory leaks
- **Unexpected Updates**: Observers may receive unexpected updates
- **Performance**: Can impact performance with many observers

## How to run:
```bash
cd BEHAVIOURAL/OBSERVER
javac *.java
java Main
```

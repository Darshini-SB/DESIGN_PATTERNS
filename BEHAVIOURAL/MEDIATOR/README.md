# Mediator Pattern

## What is it?
A behavioral design pattern that centralizes complex communications and control logic between objects, making the system easier to understand and maintain.

## Definition
The Mediator pattern defines an object that encapsulates how a set of objects interact. It promotes loose coupling by keeping objects from referring to each other explicitly and allows their interaction to vary independently.

## Example in this project
**Chat System** - A mediator handles message distribution between different users in a chat room.

### How it works:
1. **ChatMediator** (interface) - Defines communication methods
2. **ChatMediatorImpl** - Concrete mediator that manages user interactions
3. **User** (interface) - Defines user behavior
4. **ChatUser** - Concrete user that sends and receives messages

Instead of users communicating directly with each other, they communicate through the mediator, which handles message distribution.

## When to use this pattern:
- When communication between objects becomes complex
- When you want to reduce coupling between objects
- When you want to centralize control logic
- When you have many objects that need to communicate with each other
- When you want to make the system easier to understand and maintain

## Real-world scenarios:
- Chat applications
- Air traffic control systems
- GUI frameworks
- Event handling systems
- Workflow management systems

## Benefits:
- **Loose Coupling**: Objects don't need to know about each other
- **Centralized Control**: All communication logic is in one place
- **Easier Maintenance**: Changes to communication logic only affect the mediator
- **Simplified Object Design**: Objects focus on their own behavior

## Drawbacks:
- **Single Point of Failure**: If mediator fails, entire system fails
- **Complexity**: Mediator can become complex with many objects
- **Performance**: May add overhead for simple communications

## How to run:
```bash
cd BEHAVIOURAL/MEDIATOR
javac *.java
java Main
```

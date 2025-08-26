# Command Pattern

## What is it?
A behavioral design pattern that encapsulates a request as an object, allowing you to parameterize clients with different requests, queue operations, and support undo operations.

## Definition
The Command pattern turns a request into a stand-alone object containing all information about the request. This transformation lets you parameterize methods with different requests, delay or queue a request's execution, and support undoable operations.

## Example in this project
**Remote Control System** - Commands for turning lights on/off are encapsulated as objects that can be executed and undone.

### How it works:
1. **Command** (interface) - Defines execute() and undo() methods
2. **LightOn** - Concrete command to turn light on
3. **LightOff** - Concrete command to turn light off
4. **Light** - Receiver that performs the actual action
5. **RemoteControl** - Invoker that triggers commands

The remote control doesn't know how to turn lights on/off directly. Instead, it uses command objects that encapsulate the request.

## When to use this pattern:
- When you want to parameterize objects with operations
- When you want to queue operations
- When you want to support undo/redo functionality
- When you want to decouple the invoker from the receiver
- When you want to support logging of operations

## Real-world scenarios:
- Remote controls for home automation
- Undo/redo functionality in text editors
- Macro recording in applications
- Menu systems in GUI applications
- Transaction processing systems

## Benefits:
- **Decoupling**: Invoker doesn't need to know how commands are executed
- **Extensibility**: Easy to add new commands without changing existing code
- **Undo/Redo**: Natural support for undo operations
- **Queuing**: Commands can be queued and executed later
- **Logging**: Easy to log all operations

## How to run:
```bash
cd BEHAVIOURAL/COMMAND
javac *.java
java Main
```

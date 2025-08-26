# Chain of Responsibility Pattern

## What is it?
A behavioral design pattern that passes requests along a chain of handlers. Each handler either processes the request or passes it to the next handler in the chain.

## Definition
The Chain of Responsibility pattern creates a chain of receiver objects for a request. Each receiver contains a reference to the next receiver in the chain. When a request is made, it's passed along the chain until one of the handlers processes it.

## Example in this project
**Logging System** - Different log levels (INFO, DEBUG, ERROR) are handled by different loggers in a chain.

### How it works:
1. **Logger** (abstract class) - Defines the chain structure
2. **Debug Logger** - Handles DEBUG level messages
3. **Info Logger** - Handles INFO level messages  
4. **Error Logger** - Handles ERROR level messages

Each logger checks if it can handle the message level. If not, it passes the request to the next logger in the chain.

## When to use this pattern:
- When you want to process requests in a specific order
- When you want to avoid coupling the sender to specific receivers
- When you want to dynamically change the chain of handlers
- When you have multiple objects that can handle a request

## Real-world scenarios:
- Logging systems with different levels
- Exception handling in frameworks
- Middleware in web applications
- Customer support ticket routing
- Authentication and authorization chains

## Benefits:
- **Loose Coupling**: Sender doesn't need to know which handler will process the request
- **Flexibility**: Easy to add or remove handlers from the chain
- **Single Responsibility**: Each handler has one specific responsibility
- **Open/Closed Principle**: Easy to extend without modifying existing code

## How to run:
```bash
cd BEHAVIOURAL/CHAIN_OF_RESPONSIBILITY
javac *.java
java Main
```

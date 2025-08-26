# State Pattern

## What is it?
A behavioral design pattern that allows an object to alter its behavior when its internal state changes, making it appear as if the object changed its class.

## Definition
The State pattern allows an object to change its behavior when its internal state changes. The object will appear to change its class, but in reality, it's using composition to delegate behavior to different state objects.

## Example in this project
**Traffic Light System** - Traffic light changes behavior based on its current state (Red, Yellow, Green).

### How it works:
1. **TrafficLightState** (interface) - Defines state behavior
2. **RedLight** - Concrete state for red light behavior
3. **YellowLight** - Concrete state for yellow light behavior
4. **GreenLight** - Concrete state for green light behavior
5. **TrafficLight** - Context that changes states

The traffic light changes its behavior based on its current state without using conditional statements.

## When to use this pattern:
- When an object's behavior depends on its state
- When you have many conditional statements based on object state
- When you want to avoid large conditional statements
- When you want to make state transitions explicit
- When you want to encapsulate state-specific behavior

## Real-world scenarios:
- Traffic light systems
- Game character states
- Order processing systems
- Vending machines
- Document workflow systems

## Benefits:
- **Eliminates Conditionals**: No need for large if-else statements
- **Encapsulation**: State-specific behavior is encapsulated
- **Extensibility**: Easy to add new states
- **Maintainability**: Each state is in its own class
- **Single Responsibility**: Each state class has one responsibility

## Drawbacks:
- **Complexity**: Can be overkill for simple state machines
- **Object Proliferation**: Can lead to many state classes
- **State Transitions**: Need to manage state transitions carefully

## State Machine Concepts:
- **States**: Different conditions the object can be in
- **Transitions**: How the object moves between states
- **Events**: Triggers that cause state transitions
- **Actions**: Behavior associated with each state

## How to run:
```bash
cd BEHAVIOURAL/STATE
javac *.java
java Main
```

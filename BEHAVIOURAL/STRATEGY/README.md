# Strategy Pattern

## What is it?
A behavioral design pattern that defines a family of algorithms, encapsulates each one, and makes them interchangeable at runtime.

## Definition
The Strategy pattern defines a family of algorithms, encapsulates each algorithm, and makes them interchangeable. The strategy lets the algorithm vary independently from clients that use it.

## Example in this project
**Payment System** - Different payment strategies (Credit Card, PayPal, Google Pay) can be swapped at runtime.

### How it works:
1. **PaymentStrategy** (interface) - Defines the algorithm interface
2. **CreditCardPayment** - Concrete strategy for credit card payments
3. **PayPalPayment** - Concrete strategy for PayPal payments
4. **GooglePayPayment** - Concrete strategy for Google Pay payments
5. **PaymentContext** - Uses the strategy to execute payments

The payment context can switch between different payment methods without changing its code.

## When to use this pattern:
- When you have a family of similar algorithms
- When you want to avoid multiple conditional statements
- When you want to make algorithms interchangeable
- When you want to isolate algorithm implementation from client code
- When you want to support multiple ways of doing the same thing

## Real-world scenarios:
- Payment processing systems
- Sorting algorithms
- Compression algorithms
- Navigation strategies
- Discount calculation methods

## Benefits:
- **Eliminates Conditionals**: No need for if-else statements
- **Extensibility**: Easy to add new strategies
- **Runtime Flexibility**: Can change strategies at runtime
- **Single Responsibility**: Each strategy has one responsibility
- **Testability**: Easy to test individual strategies

## Drawbacks:
- **Object Proliferation**: Can lead to many strategy classes
- **Complexity**: May be overkill for simple algorithms
- **Client Awareness**: Client must know about different strategies

## How to run:
```bash
cd BEHAVIOURAL/STRATEGY
javac *.java
java Main
```

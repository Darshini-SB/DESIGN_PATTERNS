# Template Method Pattern

## What is it?
A behavioral design pattern that defines the skeleton of an algorithm in a base class, letting subclasses override specific steps without changing the algorithm's structure.

## Definition
The Template Method pattern defines the structure of an algorithm in a method, deferring some steps to subclasses. It lets subclasses redefine certain steps of an algorithm without changing the algorithm's structure.

## Example in this project
**Beverage Preparation** - Template for making beverages (boil water, brew, pour, add condiments) with specific implementations for coffee and tea.

### How it works:
1. **BeverageTemplate** (abstract class) - Defines the algorithm structure
2. **Coffee** - Concrete class implementing coffee-specific steps
3. **BlackCoffee** - Concrete class implementing black coffee steps
4. **Tea** - Concrete class implementing tea-specific steps

The template method ensures all beverages follow the same preparation steps while allowing customization of specific steps.

## When to use this pattern:
- When you have an algorithm with steps that can vary
- When you want to avoid code duplication
- When you want to control the algorithm's structure
- When you have common behavior among subclasses
- When you want to enforce a common algorithm structure

## Real-world scenarios:
- Build processes in software development
- Document generation workflows
- Data processing pipelines
- Game initialization sequences
- Database connection procedures

## Benefits:
- **Code Reuse**: Common algorithm structure is reused
- **Consistency**: Ensures consistent algorithm execution
- **Flexibility**: Subclasses can customize specific steps
- **Maintainability**: Changes to algorithm structure affect all subclasses
- **Control**: Base class controls the algorithm flow

## Drawbacks:
- **Inheritance**: Uses inheritance which can be limiting
- **Rigidity**: Algorithm structure is fixed
- **Complexity**: Can be complex with many hook methods

## Template Method Components:
- **Template Method**: The main algorithm method
- **Concrete Methods**: Methods that are common to all subclasses
- **Abstract Methods**: Methods that must be implemented by subclasses
- **Hook Methods**: Optional methods that subclasses can override

## How to run:
```bash
cd BEHAVIOURAL/TEMPLATEMETHOD
javac *.java
java Main
```

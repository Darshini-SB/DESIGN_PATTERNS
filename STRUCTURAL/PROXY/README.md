# Proxy Pattern

## What is it?
A structural design pattern that provides a substitute or placeholder for another object to control access to it.

## Definition
The Proxy pattern provides a surrogate or placeholder for another object to control access to it. It acts as a wrapper around the real object and can add functionality before or after the real object's methods are called.

## Example in this project
**Image Loading System** - Uses a proxy to control when expensive image loading operations occur, implementing lazy loading.

### How it works:
1. **Image** (interface) - Defines the common interface
2. **RealImage** - The real object that does the actual work
3. **ProxyImage** - Proxy that controls access to RealImage
4. **Client** - Uses the proxy as if it were the real object

The proxy delays the creation of the real image until it's actually needed.

## When to use this pattern:
- When you want to control access to an object
- When you want to add a layer of security
- When you want to implement lazy loading
- When you want to add logging or caching
- When you want to provide a local representative for a remote object

## Real-world scenarios:
- Virtual proxies for large objects
- Protection proxies for access control
- Remote proxies for network objects
- Caching proxies for expensive operations
- Logging proxies for debugging

## Benefits:
- **Lazy Loading**: Objects are created only when needed
- **Access Control**: Can control who accesses the real object
- **Caching**: Can cache results of expensive operations
- **Security**: Can add security checks before access
- **Performance**: Can improve performance through caching

## Drawbacks:
- **Complexity**: Can add complexity to the codebase
- **Performance**: May add overhead for simple operations
- **Debugging**: Can make debugging more difficult

## Types of Proxies:
- **Virtual Proxy**: Controls access to expensive resources
- **Protection Proxy**: Controls access to sensitive objects
- **Remote Proxy**: Represents objects in different address spaces
- **Caching Proxy**: Caches results of expensive operations

## Proxy vs Decorator:
- **Proxy**: Controls access to the real object
- **Decorator**: Adds behavior to the object

## Key Concepts:
- **Subject**: Interface that both proxy and real object implement
- **Real Subject**: The actual object that the proxy represents
- **Proxy**: Object that controls access to the real subject

## Common Proxy Operations:
- **Lazy Initialization**: Creating objects only when needed
- **Access Control**: Checking permissions before access
- **Caching**: Storing results for reuse
- **Logging**: Recording method calls

## How to run:
```bash
cd STRUCTURAL/PROXY
javac *.java
java Main
```

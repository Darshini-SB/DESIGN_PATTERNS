# Composite Pattern

## What is it?
A structural design pattern that lets you compose objects into tree structures and then work with these structures as if they were individual objects.

## Definition
The Composite pattern composes objects into tree structures to represent part-whole hierarchies. It allows clients to treat individual objects and compositions of objects uniformly.

## Example in this project
**File System Hierarchy** - Treats individual files and folders (which can contain files and subfolders) uniformly using the same interface.

### How it works:
1. **FileSystem** (interface) - Defines common interface for all file system items
2. **File** - Leaf class representing individual files with name and size
3. **Folder** - Composite class that can contain other files and folders
4. **Client** - Works with both individual files and folders uniformly

The composite allows treating a folder (which contains multiple items) the same way as a single file.

## When to use this pattern:
- When you want to represent part-whole hierarchies of objects
- When you want clients to be able to ignore the difference between compositions of objects and individual objects
- When you want to treat a group of objects the same way as a single object
- When you have a tree structure of objects

## Real-world scenarios:
- File system structures (files and folders)
- GUI component hierarchies (windows containing panels containing buttons)
- Organization charts (departments containing employees)
- Menu systems (menus containing submenus and menu items)
- Document structures (documents containing sections containing paragraphs)

## Benefits:
- **Uniformity**: Treats individual and composite objects uniformly
- **Flexibility**: Easy to add new types of components
- **Simplicity**: Client code is simplified
- **Extensibility**: Easy to add new operations

## Drawbacks:
- **Type Safety**: Can lose type safety with generic interfaces
- **Performance**: May impact performance with large trees
- **Complexity**: Can be complex to implement properly

## Composite vs Decorator:
- **Composite**: Groups objects into tree structures
- **Decorator**: Adds responsibilities to individual objects

## Key Components:
- **Component** (FileSystem): Common interface for all file system items
- **Leaf** (File): Individual files that can't contain other items
- **Composite** (Folder): Folders that can contain other files and folders

## Tree Operations:
- **Traversal**: Walking through the file system structure (showDetails method)
- **Search**: Finding specific files or folders
- **Modification**: Adding/removing files and folders (addFile method)

## Example Output:
```
root
  folder1
    file1.txt(100KB)
    file2.txt(200KB)
  folder2
    file3.txt(300KB)
```

## How to run:
```bash
cd STRUCTURAL/COMPOSITE
javac *.java
java Main
```

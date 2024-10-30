# Object Calisthenics :coffee:
Clean object-oriented code exercise

## Overview
Object Calisthenics is a set of 9 rules designed to help developers write cleaner, more maintainable object-oriented code. By following these guidelines, you can improve code readability, ensure better design, and enhance overall code quality.

## The 9 Rules :pushpin:

#### 1. Only One Level of Indentation per Method
Avoid deep nesting by using techniques like early returns and method extraction. This improves readability and maintainability by clarifying the flow of logic.

#### 2. Don't Use the ELSE Keyword
Eliminate the use of `else` statements. Instead, use early returns to handle conditions. This simplifies control flow and focuses on the main action, making the code easier to read.

#### 3. Wrap All Primitives and Strings
Encapsulate primitive types (like `int`, `String`, etc.) in their own classes. This increases type safety, improves clarity, and allows for additional behavior to be associated with these types.

#### 4. First Class Collections
Encapsulate collections (like lists, sets, or maps) within their own classes. This provides a clear interface for managing collections, encapsulates related behaviors, and enhances readability.

#### 5. One Dot per Line
Limit each line of code to one dot (i.e., one method call or property access). This improves readability and debuggability by making each operation explicit.

#### 6. Don't Abbreviate
Avoid abbreviations in variable names, method names, and class names. Clear and descriptive names enhance readability and maintainability.

#### 7. Keep All Entities Small
Ensure classes, methods, and functions are small and focused. Each entity should have a single responsibility, making them easier to understand, test, and maintain.

#### 8. No Classes with More Than Two Instance Variables
Limit classes to a maximum of two instance variables. This reduces complexity and increases clarity regarding class responsibilities.

#### 9. No Getters/Setters/Properties
Avoid using getter and setter methods. Instead, expose behaviors that represent the intent of operations, encouraging encapsulation and better design.

## Purpose
This repository is for practicing these rules through coding exercises to help develop better OOP habits and principles.


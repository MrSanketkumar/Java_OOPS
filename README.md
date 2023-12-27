# Java_OOPS


👉	 **Classes and Objects:**
   
Concept:

Class: 
A class is a blueprint or template for creating objects. It defines the properties (attributes) and behaviors (methods) that objects of the class will have.

Object:
An object is an instance of a class. It is a concrete realization of the class blueprint


✍️  **>>>Practice Set:**

1>>>Create a class Person with attributes name and age. Create an object of this class and print out the person's details.

2>>>Extend the Person class to include a method celebrateBirthday that increments the person's age by 1. Create an object, call the method, and print the updated details.

_______________________________________________________________________________________________*********______________________________________________________________________________________________

👉	 **Encapsulation:**
   
Concept:

Encapsulation is the bundling of data (attributes) and methods (functions) that operate on the data into a single unit known as a class. It restricts direct access to some of an object's components, and it can prevent the accidental modification of data.

Why Encapsulation?

Data Hiding:
Encapsulation allows you to hide the internal implementation details of a class and expose only what is necessary.

Modularity:
It helps in creating modular code by grouping related functionalities together.

✍️  **>>>Practice Set:**

1>>>Modify the Person class from the previous example to encapsulate its attributes (name and age). Provide public methods to access and modify these attributes.

2>>Create a class Book with private attributes title, author, and pages. Encapsulate these attributes and provide methods to get and set their values.

_______________________________________________________________________________________________*********______________________________________________________________________________________________

👉	 **Inheritance:**
   
Concept:

Inheritance is a mechanism that allows a new class (subclass or derived class) to inherit the characteristics and behaviors of an existing class (superclass or base class).
The subclass can reuse the code of the superclass, extending or modifying its behavior.

Why Inheritance?

Code Reusability:
Inheritance promotes code reuse by allowing a new class to use the features of an existing class.

Modularity: 
It helps in creating a modular structure where classes are organized in a hierarchy.


✍️  **>>>Practice Set:**

1>>Create a superclass Animal with attributes name and age. Add a method makeSound to print a generic animal sound.

Create a subclass Dog that extends Animal and add a method bark to print a dog-specific sound.
Create a superclass Shape with attributes color and filled. Add a method getArea (returning 0 for now).

@>>>Create a subclass Circle that extends Shape and has an additional attribute radius. Implement the getArea method for a circle.


_______________________________________________________________________________________________*********______________________________________________________________________________________________


👉	 **Polymorphism:**
   
Concept:

Polymorphism allows objects of different classes to be treated as objects of a common base class.
It enables a single interface to represent different types of objects or a single method to perform different actions based on the object's type.

**
Types of Polymorphism:**

Compile-Time Polymorphism (Method Overloading):
Same method name but different parameters within the same class.

Run-Time Polymorphism (Method Overriding):
Different implementations of the same method in the superclass and its subclasses.


✍️  **>>>Practice Set:**


1>>>Create a superclass Bird with a method makeSound that prints a generic bird sound.

Create two subclasses, Sparrow and Penguin, that override the makeSound method with their specific sounds.
Create a superclass Employee with a method calculateSalary that returns 0 for now.

2>>>Create two subclasses, Manager and Developer, that override the calculateSalary method with their specific salary calculations.

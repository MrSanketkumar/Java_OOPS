// Create an abstract class Animal with an abstract method makeSound.

// Create two concrete subclasses, Dog and Cat, that implement the makeSound method with specific sounds.



abstract class Animal{

    abstract void makeSound();

    
}

class Dog extends Animal{
    void makeSound(){
        System.out.println("Woof! Woof!");
    }
}

class Cat extends Animal{
    void makeSound(){
        System.out.println("Meow!");
    }
}

public class Animals {
    public static void main(String[] args) {
        Cat jack = new Cat();
        jack.makeSound();
        Dog Tom = new Dog();
        Tom.makeSound();
    }

    
}
// CombinedZooProgram.java
import java.util.ArrayList;
import java.util.List;

abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void makeSound();
}

class Mammal extends Animal {
    public Mammal(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Mammal sound");
    }

    public void giveBirth() {
        System.out.println("Giving birth to live young");
    }
}

class Bird extends Animal {
    public Bird(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Bird sound");
    }

    public void fly() {
        System.out.println("Bird is flying");
    }
}

// class Zoo {
//     private List<Animal> animals;

//     public Zoo() {
//         this.animals = new ArrayList<>();
//     }

//     public void addAnimal(Animal animal) {
//         animals.add(animal);
//     }

//     public void makeAllSounds() {
//         System.out.println("Sounds from the Zoo:");
//         for (Animal animal : animals) {
//             animal.makeSound();
//         }
//     }
// }

public class CombinedZooProgram {
    public static void main(String[] args) {
        // Zoo myZoo = new Zoo();

        Mammal lion = new Mammal("Lion");
        Animal sparrow = new Bird("Sparrow");
        lion.makeSound();
        lion.giveBirth();

        // myZoo.addAnimal(lion);
        // myZoo.addAnimal(sparrow);

        // myZoo.makeAllSounds();
    }
}

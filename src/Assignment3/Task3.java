package Assignment3;

//Abstract class Animal
abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    //Abstract method to be implemented by subclasses
    public abstract void makeSound();
}

//Interface Movable
interface Movable {
    void move(); // Abstract method for moving
}

// Dog class that extends Animal and implements Movable
class Dog extends Animal implements Movable {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " says: Woof!");
    }

    @Override
    public void move() {
        System.out.println(getName() + " is running.");
    }
}

// Bird class that extends Animal and implements Movable
class Bird extends Animal implements Movable {
    public Bird(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " says: Chirp!");
    }

    @Override
    public void move() {
        System.out.println(getName() + " is flying.");
    }
}

// Example usage
public class Task3 {
    public static void main(String[] args) {
        Animal dog = new Dog("Scooby");
        Animal bird = new Bird("Tweety");

        //Demonstrating abstract class and method overriding
        dog.makeSound();
        bird.makeSound();

        //Demonstrating interface and polymorphism
        Movable movableDog = (Movable) dog;
        Movable movableBird = (Movable) bird;

        movableDog.move();
        movableBird.move();
    }
}
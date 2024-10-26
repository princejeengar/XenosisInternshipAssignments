package Assignment2;

class Animal {
    String name;
    String sound;

    //Default constructor
    public Animal() {
        this.name = "Unknown";
        this.sound = "Silent";
    }

    //Constructor with one parameter
    public Animal(String name) {
        this.name = name;
        this.sound = "Silent";  // Default sound for unnamed animals
    }

    //Constructor with two parameters
    public Animal(String name, String sound) {
        this.name = name;
        this.sound = sound;
    }

    //Method to display animal information
    public void displayInfo() {
        System.out.println("Animal Name: " + name);
        System.out.println("Sound: " + sound);
    }

    //Overloaded method to display additional custom message
    public void displayInfo(String message) {
        System.out.println(message + " - Animal Name: " + name + ", Sound: " + sound);
    }
}

// Example usage
public class Task3 {
    public static void main(String[] args) {
        //Using the default constructor
        Animal animal1 = new Animal();
        animal1.displayInfo();

        System.out.println();

        //Using the single-parameter constructor
        Animal animal2 = new Animal("Dog");
        animal2.displayInfo();

        System.out.println();

        //Using the two-parameter constructor
        Animal animal3 = new Animal("Cat", "Meow");
        animal3.displayInfo();

        System.out.println();

        //Using the overloaded displayInfo method with a custom message
        animal3.displayInfo("Overloaded Method");
    }
}

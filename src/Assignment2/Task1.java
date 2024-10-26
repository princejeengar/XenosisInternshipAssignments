package Assignment2;

class Person {
    //Attributes
    String name;
    int age;

    //Constructor to Initialize attributes
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //Display person
    public void displayPerson() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Task1 {
    public static void main(String[] args) {
        //Person object to display person
        Person person1 = new Person("Prince", 23);
        person1.displayPerson();
    }
}
package Assignment3;

//Parent class (Base)
class Vehicle {
    //Method to be overridden
    public void start() {
        System.out.println("Vehicle is starting...");
    }
}

//Child class (Derived Car)
class Car extends Vehicle {
    @Override
    public void start() {
        System.out.println("Car is starting...");
    }
}

//Child class (Derived Bike)
class Bike extends Vehicle {
    @Override
    public void start() {
        System.out.println("Bike is starting...");
    }
}

public class Task1 {
    public static void main(String[] args) {
        //here overridding polymorphism
        Vehicle myCar = new Car();
        Vehicle myBike = new Bike();

        myCar.start();
        myBike.start();
    }
}
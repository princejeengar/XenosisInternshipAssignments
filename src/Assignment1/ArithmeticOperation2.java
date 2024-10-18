//Approach2

package Assignment1;

import java.util.Scanner;

public class ArithmeticOperation2{
    // Method for Arithmetic Operations
    static void Add(double a, double b) {
        System.out.println("Addition: " + (a + b));
    }

    static void Subtract(double a, double b) {
        System.out.println("Subtraction: " + (a - b));
    }

    static void Multiplication(double a, double b) {
        System.out.println("Multiplication: " + (a * b));
    }

    static void Division(double a, double b) {
        if (b != 0) {
            System.out.println("Division: " + (a / b));
        } else {
            System.out.println("Division by zero is not allowed.");
        }
    }

    public static void main(String[] args) {
        // Creating Scanner object
        Scanner scanner = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter the first number: ");
        double number1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double number2 = scanner.nextDouble();

        // Perform Arithmetic Operations
        Add(number1, number2);
        Subtract(number1, number2);
        Multiplication(number1, number2);
        Division(number1, number2);

        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}

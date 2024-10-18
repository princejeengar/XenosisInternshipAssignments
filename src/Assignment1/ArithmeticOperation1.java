//Approach1

package Assignment1;

import java.util.Scanner;

public class ArithmeticOperation1 {

    public static void main(String[] args) {
        // Creating Scanner object
        Scanner scanner = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter the first number: ");
        double number1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double number2 = scanner.nextDouble();

        //Arithmetic operations
        double Addition = number1 + number2;
        double Subtraction = number1 - number2;
        double Multiplication = number1 * number2;
        //avoid division by zero error
        double Division = 0;
        if (number2 != 0) {
            Division = number1 / number2;
        } else {
            System.out.println("Division by zero is not allowed.");
        }

        //Output
        System.out.println("Addition: " + Addition);
        System.out.println("Subtraction: " + Subtraction);
        System.out.println("Multiplicatrion: " + Multiplication);
        if(number2!=0){
            System.out.println("Division: " + Division);
        }
        // Close the scanner
        scanner.close();
    }
}
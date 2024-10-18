package Assignment1;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        //Creating Scanner object
        Scanner scanner = new Scanner(System.in);

        //Taking two numbers as input
        System.out.print("Enter the first number: ");
        double number1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double number2 = scanner.nextDouble();

        //Taking airthmetic operator
        System.out.println("Choose an operation: +, -, *, /");
        char operator = scanner.next().charAt(0);

        double result;

        // Switch-case for airthmetic operations
        switch (operator) {
            case '+':
                result = number1 + number2;
                System.out.println("Result: " + result);
                break;

            case '-':
                result = number1 - number2;
                System.out.println("Result: " + result);
                break;

            case '*':
                result = number1 * number2;
                System.out.println("Result: " + result);
                break;

            case '/':
                if (number2 != 0) {
                    result = number1 / number2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Division by zero is not allowed.");
                }
                break;

            default:
                System.out.println("Invalid operator. Please choose +, -, *, or /.");
                break;
        }

        //Closing Scanner for resources leak
        scanner.close();
    }
}

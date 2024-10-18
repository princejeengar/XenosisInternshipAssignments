package Assignment1;

import java.util.Scanner;

public class CheckNumber {
    public static void main(String[] args) {
        //Creating Scanner object
        Scanner scanner = new Scanner(System.in);

        //Taking input from user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        //Checking number is even or odd
        if (number % 2 == 0) {
            System.out.println("The number " + number + " is Even.");
        } else {
            System.out.println("The number " + number + " is Odd.");
        }
    }
}

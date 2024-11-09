package Assignment4;

class InvalidInputException extends Exception {
    public InvalidInputException(String message) {
        super(message);
    }
}

public class Task3 {
    public static int divide(int a, int b) throws ArithmeticException {
        return a / b;
    }

    public static void checkString(String str) throws NullPointerException {
        if (str == null) {
            throw new NullPointerException("String is null.");
        }
        System.out.println("String length: " + str.length());
    }

    public static void checkNumber(int number) throws InvalidInputException {
        if (number < 0) {
            throw new InvalidInputException("Number must be non-negative.");
        }
        System.out.println("Valid number: " + number);
    }

    public static void main(String[] args) {
        try {
            // Handling ArithmeticException
            System.out.println("Division result: " + divide(10, 0));
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero.");
        }

        try {
            // Handling NullPointerException
            checkString(null);
        } catch (NullPointerException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            // Handling custom InvalidInputException
            checkNumber(-5);
        } catch (InvalidInputException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

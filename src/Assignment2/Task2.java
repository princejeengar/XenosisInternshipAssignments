package Assignment2;

class BankAccount {
    double balance;

    //Constructor to Initialize balance
    public BankAccount(double initialBalance) {
        if (initialBalance >= 0) {
            balance = initialBalance;
        } else {
            System.out.println("Initial balance can't be negative.");
            balance = 0;
        }
    }

    //Method to Deposit
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    //Method to Withdraw
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdraw: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    //Method to Display Balance
    public void displayBalance() {
        System.out.println("Account Balance: " + balance);
    }
}

public class Task2 {
    public static void main(String[] args) {
        //Initialize with 100 Balance
        BankAccount account = new BankAccount(100);
        account.displayBalance();
        account.deposit(90);
        account.displayBalance();
        account.withdraw(40);
        account.displayBalance();
    }
}

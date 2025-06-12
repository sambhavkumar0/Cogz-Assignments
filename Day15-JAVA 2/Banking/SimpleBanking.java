package Banking;

import java.util.Scanner;

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

public class SimpleBanking {
    private double balance;

    public SimpleBanking(double balance) {
        this.balance = balance;
    }

    // Withdraw method that throws custom exception
    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient balance. Available: ₹" + balance);
        } else {
            balance -= amount;
            System.out.println("Withdrawal of " + amount + " successful.");
            System.out.println("Remaining balance: ₹" + balance);
        }
    }

    public static void main(String[] args) {
        SimpleBanking account = new SimpleBanking(5000); // Initial balance ₹5000
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter amount to withdraw: ");
        double amount = scanner.nextDouble();

        try {
            account.withdraw(amount);
        } catch (InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Thanks ");
        }

        scanner.close();
    }
}

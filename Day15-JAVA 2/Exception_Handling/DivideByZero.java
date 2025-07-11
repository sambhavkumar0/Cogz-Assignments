package Exception_Handling;

import java.util.Scanner;

public class DivideByZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter numerator: ");
        int num = scanner.nextInt();

        System.out.print("Enter denominator: ");
        int denom = scanner.nextInt();

        try {
            int result = num / denom;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }

        scanner.close();
    }
}

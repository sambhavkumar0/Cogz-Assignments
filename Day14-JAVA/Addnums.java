import java.util.Scanner;

public class Addnums {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("Sum of " + a + " and " + b + " is: " + addNumbers(a, b));
    }

    public static int addNumbers(int a, int b) {
        return a + b;
    }

}
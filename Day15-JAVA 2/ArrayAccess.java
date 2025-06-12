import java.util.Scanner;

public class ArrayAccess {
    public static void main(String[] args) {

        int[] numbers = { 10, 20, 30, 40, 50 };

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the index to access (0 to " + (numbers.length - 1) + "): ");
        int index = scanner.nextInt();

        try {
            int element = numbers[index];
            System.out.println("Element at index " + index + ": " + element);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid index! Please enter an index between 0 and " + (numbers.length - 1));
        }

        scanner.close();
    }
}

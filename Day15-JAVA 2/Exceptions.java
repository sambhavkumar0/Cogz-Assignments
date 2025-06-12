public class Exceptions {
    public static void main(String[] args) {
        try {
            System.out.println("Inside try block");

            // This line throws an exception
            int result = 10 / 0;

            System.out.println("This line won't be executed");
        } catch (ArithmeticException e) {
            System.out.println("Inside catch block: " + e.getMessage());
        } finally {
            System.out.println("Always executed");
        }

        System.out.println("Program continue");
    }
}

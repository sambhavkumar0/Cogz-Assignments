class Calculator {

    // Method to add two integers
    int add(int a, int b) {
        return a + b;
    }

    // Method to add two doubles
    double add(double a, double b) {
        return a + b;
    }

    // Method to add three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // Test all overloads
        int sum1 = calc.add(10, 20); // int + int
        double sum2 = calc.add(5.5, 4.5); // double + double
        int sum3 = calc.add(1, 2, 3); // int + int + int

        // Display results
        System.out.println("Sum of 10 and 20 (int): " + sum1);
        System.out.println("Sum of 5.5 and 4.5 (double): " + sum2);
        System.out.println("Sum of 1, 2 and 3 (int): " + sum3);
    }
}

@FunctionalInterface
interface Calculator {
    int operate(int a, int b);
}

public class LambdaCalculator {
    static void calculateAndPrint(int a, int b, Calculator op) {
        System.out.println("Result: " + op.operate(a, b));
    }

    public static void main(String[] args) {
        Calculator add = (a, b) -> a + b;
        Calculator subtract = (a, b) -> a - b;
        Calculator multiply = (a, b) -> a * b;
        Calculator divide = (a, b) -> b != 0 ? a / b : 0;

        calculateAndPrint(10, 5, add);
        calculateAndPrint(10, 5, subtract);
        calculateAndPrint(10, 5, multiply);
        calculateAndPrint(10, 5, divide);
    }
}

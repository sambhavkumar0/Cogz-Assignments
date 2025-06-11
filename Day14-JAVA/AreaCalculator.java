public class AreaCalculator {

    // Method to calculate area of a circle
    public double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    // Method to calculate area of a rectangle
    public double calculateArea(double length, double width) {
        return length * width;
    }

    public static void main(String[] args) {
        AreaCalculator calc = new AreaCalculator();

        // Area of a circle with radius 5
        double circleArea = calc.calculateArea(5.0);

        // Area of a rectangle with length 4 and width 6
        double rectangleArea = calc.calculateArea(4.0, 6.0);

        System.out.println("Area of Circle: " + circleArea);
        System.out.println("Area of Rectangle: " + rectangleArea);
    }
}

import java.util.Scanner;

class Employee {
    String name;
    double salary;
    int age;
    String designation;

    // Constructor
    public Employee(String name, double salary, int age, String designation) {
        this.name = name;
        this.salary = salary;
        this.age = age;
        this.designation = designation;
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("\nEmployee Details:");
        System.out.println("Name        : " + name);
        System.out.println("Age         : " + age);
        System.out.println("Salary      : Rs" + salary);
        System.out.println("Designation : " + designation);
    }
}

public class Details {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input employee details
        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();

        System.out.print("Enter salary: ");
        double salary = scanner.nextDouble();

        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter designation: ");
        String designation = scanner.nextLine();

        // Create Employee object
        Employee emp = new Employee(name, salary, age, designation);

        // Display details
        emp.displayDetails();

        scanner.close();
    }
}

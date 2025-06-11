// Base class
class Person {
    String name;
    int age;

    // Constructor for Person
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display Person details
    void displayPersonInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Derived class
class Employee extends Person {
    double salary;

    // Constructor for Employee
    Employee(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    // Method to display Employee details
    void displayEmployeeInfo() {
        displayPersonInfo();
        System.out.println("Salary: ₹" + salary);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Create an Employee object
        Employee emp = new Employee("Sambhav", 25, 75000);

        // Display all inherited and own values
        emp.displayEmployeeInfo();
    }
}
// Abstract Class
abstract class Employee {
    String name;
    int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    abstract double calculateSalary();

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}

// Full-Time Employee
class FullTimeEmployee extends Employee {
    double monthlySalary;

    FullTimeEmployee(String name, int id, double monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }

    double calculateSalary() {
        return monthlySalary;
    }
}

// Part-Time Employee
class PartTimeEmployee extends Employee {
    int hoursWorked;
    double hourlyRate;

    PartTimeEmployee(String name, int id, int hoursWorked, double hourlyRate) {
        super(name, id);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    double calculateSalary() {
        return hoursWorked * hourlyRate;
    }
}

// Demo
public class EmployeeTest {
    public static void main(String[] args) {
        Employee e1 = new FullTimeEmployee("Alice", 101, 50000);
        Employee e2 = new PartTimeEmployee("Bob", 102, 60, 200);

        e1.displayDetails();
        System.out.println("Salary: ₹" + e1.calculateSalary());

        System.out.println();

        e2.displayDetails();
        System.out.println("Salary: ₹" + e2.calculateSalary());
    }
}

// Superclass
class Employee {
    String name;

    public Employee(String name) {
        this.name = name;
    }

    // Method to calculate salary (to be overridden)
    public double calculateSalary() {
        return 0;
    }
}

// Subclass 1
class Manager extends Employee {
    double bonus;

    public Manager(String name, double bonus) {
        super(name);
        this.bonus = bonus;
    }

    // Override the calculateSalary method for a manager
    @Override
    public double calculateSalary() {
        // Manager salary calculation (base salary + bonus)
        return 50000 + bonus;
    }
}

// Subclass 2
class Developer extends Employee {
    double hourlyRate;
    int hoursWorked;

    public Developer(String name, double hourlyRate, int hoursWorked) {
        super(name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    // Override the calculateSalary method for a developer
    @Override
    public double calculateSalary() {
        // Developer salary calculation (hourly rate * hours worked)
        return hourlyRate * hoursWorked;
    }
}

public class SuperClass {
    public static void main(String[] args) {
        // Creating objects of the subclasses
        Manager manager = new Manager("John Manager", 10000);
        Developer developer = new Developer("Alice Developer", 30, 160);

        // Calculating and printing salaries
        System.out.println("Manager Salary: $" + manager.calculateSalary());
        System.out.println("Developer Salary: $" + developer.calculateSalary());
    }
}

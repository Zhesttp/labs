public class Employee {
    private static int numberOfEmployees = 0;
    private String fullName;
    private double salary;

    public Employee(String fullName, double salary) {
        this.fullName = fullName;
        this.salary = salary;
        numberOfEmployees++;
    }

    public String getFullName() {
        return fullName;
    }

    public double getSalary() {
        return salary;
    }

    public static int getNumberOfEmployees() {
        return numberOfEmployees;
    }
}


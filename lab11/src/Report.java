import java.text.DecimalFormat;

public class Report {
    public static void generateReport(Employee[] employees) {
        System.out.println("Salary report for " + Employee.getNumberOfEmployees() + " employees:");
        System.out.println("---------------------------------------------------");
        System.out.println("Full Name             | Salary");
        System.out.println("---------------------------------------------------");
        DecimalFormat df = new DecimalFormat("#,###.00");
        for (Employee employee : employees) {
            String fullName = employee.getFullName();
            String salary = df.format(employee.getSalary());
            System.out.format("%1$-15s | %2$15s\n", fullName, salary);
        }
    }
}

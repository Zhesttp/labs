import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class FullReport {
    private static final String REPORT_BUNDLE_NAME = "ReportBundle";
    private static final ResourceBundle REPORT_BUNDLE = ResourceBundle.getBundle(REPORT_BUNDLE_NAME);
    private static final NumberFormat CURRENCY_FORMAT = NumberFormat.getCurrencyInstance(Locale.getDefault());

    public static void generateReport(Employee[] employees) {
        String reportTitle = REPORT_BUNDLE.getString("reportTitle");
        String employeeCountLabel = REPORT_BUNDLE.getString("employeeCountLabel");
        String fullNameLabel = REPORT_BUNDLE.getString("fullNameLabel");
        String salaryLabel = REPORT_BUNDLE.getString("salaryLabel");

        System.out.println(reportTitle);
        System.out.println("---------------------------------------------------");
        System.out.format("%1$s %2$d\n", employeeCountLabel, Employee.getNumberOfEmployees());
        System.out.println("---------------------------------------------------");
        System.out.format("%1$-15s | %2$s\n", fullNameLabel, salaryLabel);
        System.out.println("---------------------------------------------------");

        DecimalFormat df = new DecimalFormat("#,###.00");
        for (Employee employee : employees) {
            String fullName = employee.getFullName();
            String salary = CURRENCY_FORMAT.format(employee.getSalary());
            System.out.format("%1$-15s | %2$15s\n", fullName, salary);
        }
    }
}

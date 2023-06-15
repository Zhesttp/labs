import java.util.Locale;
public class Main {
    public static void main(String[] args) {
        Locale russianLocale = new Locale("ru");
        Topics.printTopics(russianLocale);

        Locale englishLocale = new Locale("en");
        Topics.printTopics(englishLocale);


        Employee[] employees = {
                new Employee("John Doe", 3500.0),
                new Employee("Jane Smith", 4200.0),
                new Employee("Mark Johnson", 2800.0),
                new Employee("Mary Wilson", 5000.0),
                new Employee("David Lee", 3900.0)
        };

      //  Report.generateReport(employees);
        FullReport.generateReport(employees);

        System.out.println();

        FullReport.generateReport(employees);



    }
}
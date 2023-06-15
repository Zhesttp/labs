package task4.domain;

public class HourlyWorker extends Worker {

    private double hourlyCoef;

    public void setHourlyCoef(double coef) {

        this.hourlyCoef = coef;
    }

    public double getHourlyCoef() {

        return hourlyCoef;
    }

    public HourlyWorker(int id, String name, double coef) {

        setId(id);
        setName(name);
        setHourlyCoef(coef);
    }

    public double getSalary() {

        double sal = 20.8 * 8 * hourlyCoef;

        return sal;
    }
}

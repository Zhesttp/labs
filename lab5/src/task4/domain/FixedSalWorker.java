package task4.domain;

public class FixedSalWorker extends Worker {

    private double salary;

    public FixedSalWorker(int id, String name, double sal) {

        setId(id);
        setName(name);
        setSalary(sal);
    }

    public void setSalary(double sal) {

        salary = sal;
    }

    public double getSalary() {

        return salary;
    }
}
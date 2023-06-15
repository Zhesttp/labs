package task4.domain;

public abstract class Worker implements Comparable<Worker> {

    private int id;
    public int getId() {
        return id;
    }
    protected void setId(int id) {
        this.id = id;
    }

    private String name;
    public void setName(String newName) {
        name = newName;
    }
    public String getName() {
        return name;
    }

    public abstract double getSalary();

    public int compareTo(Worker worker) {

        if (worker.getSalary() == this.getSalary()) {
            return this.getName().compareTo(worker.getName());
        }
        else return (int)(worker.getSalary() - this.getSalary());
    }

}

package practise;

public class WorkerI implements Worker {

    private int BaseSalary;
    private int Salary;
    private String Name;

    public WorkerI(int baseSalary, int salary, String name) {
        BaseSalary = baseSalary;
        Salary = salary;
        Name = name;
    }

    @Override
    public final int getSalary() {
        return BaseSalary;
    }
}

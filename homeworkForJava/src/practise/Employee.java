package practise;

public abstract class Employee {

    private int BaseSalary;
    private int Salary;
    private String Name;

    public Employee(int baseSalary, int salary, String name) {
        BaseSalary = baseSalary;
        Salary = salary;
        Name = name;
    }

    public int getBaseSalary() {
        return BaseSalary;
    }

    public void setBaseSalary(int baseSalary) {
        BaseSalary = baseSalary;
    }

    public abstract int getSalary();

    public void setSalary(int salary) {
        Salary = salary;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }



}

public class Manager extends Employee {
    private int subemploye;

    public Manager(String name, int age, char gender, int daySalary, int subemploye) {
        super(name, age, gender, daySalary);
        this.subemploye = subemploye;
    }

    public int getSubemploye() {
        return subemploye;
    }

    public void setSubemploye(int subemploye) {
        this.subemploye = subemploye;
    }

    @Override
    public int getSalary(MonthUtils.Month[] monthArray) {
        int Salary = super.getSalary(monthArray) + ((subemploye *  super.getSalary(monthArray)) / 100);
        return Salary;
    }
}

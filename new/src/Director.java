public final class Director extends Employee {
    protected int NumberOfSubordinates;
    public static final int COF = 100 * 9;

    Director(String name, int age, char gender, int salary, int NumberOfSubordinates){
        super(name, age, gender, salary);
        this.NumberOfSubordinates = NumberOfSubordinates;
    }

    @Override
    public int getSalary() {
        if (NumberOfSubordinates > 0) {
            salary = BaseSalary + (NumberOfSubordinates / COF);
            return salary;
        }
        return salary;
    }
}

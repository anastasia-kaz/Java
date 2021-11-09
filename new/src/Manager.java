public final class  Manager extends Employee {
     protected int NumberOfSubordinates;
     public static final int COF = 100 * 3;
    Manager(String name, int age, char gender, int salary, int NumberOfSubordinates){
        super(name, age, gender, salary);
        this.NumberOfSubordinates = NumberOfSubordinates;
    }

    public int getNumberOfSubordinates() {
        return NumberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        NumberOfSubordinates = numberOfSubordinates;
    }

    public int getSalary() {

        if (NumberOfSubordinates > 0) {
            salary = BaseSalary * (NumberOfSubordinates /COF);
            return salary;
        }
        return salary;
    }

}

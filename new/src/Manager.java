public class Manager extends Employee {
     protected int NumberOfSubordinates;
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
            salary = BaseSalary * (NumberOfSubordinates / 100 * 3);
            return salary;
        }
        return salary;
    }

}

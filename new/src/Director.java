public class Director extends Manager {

    Director(String name, int age, char gender, int salary, int NumberOfSubordinates) {
        super(name, age, gender, salary, NumberOfSubordinates);
    }

    @Override
    public int getSalary() {
        if (NumberOfSubordinates > 0) {
            salary = BaseSalary + (NumberOfSubordinates / 100 * 9);
            return salary;
        }
        return salary;
    }
}

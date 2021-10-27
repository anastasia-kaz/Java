public class Main {
    public static void main(String[] args) {
        Employee em1 = new Employee("anna", 20, 'f', 100);
        System.out.println(em1.getSalary(MonthUtils.MONTHS));

        Manager m1 = new Manager("anastasia", 20, 'g', 100, 20);
        System.out.println(m1.getSalary(MonthUtils.MONTHS));
    }
}

public class Employee {
    String name;
    int age;
    char gender;
    int salary;

    Employee(String name, int age, char gender, int salary){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
    }

    public  void   isSameName(Employee employee){
        if (name.equals(employee.name)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    };

}

public class Worker extends Employee {



    Worker(String name, int age, char gender, int BaseSalary) {
        super(name, age, gender, BaseSalary);
    }

    public int getSalary() {
        return BaseSalary;
    }

    public String getName(){
        return name;
    }


}


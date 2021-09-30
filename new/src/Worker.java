public class Worker {
    Person person;
    Worker(String name, int age, char gender){
        person = new Person(name, age, gender);
        this.salary = salary;
    };

    int salary;
    boolean isAdult(){
        if (person.age >= 18){
            return true;
        } else {
            return false;
        }
    }

    double getTax() {
        return salary * 0.1;
    }

    void printWorker(){
        System.out.println("name: " + person.name + ", gender: " + person.gender + ", age: " + person.age + ", salary: " + salary);

    }
}

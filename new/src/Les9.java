public class Les9 {

    public static void main(String[] args){

//        Person person1 = new Person("anastasia", 10, 'F' );
//         person1.printPerson();
//        Person person2 = new Person("John", 12, 'M' );
//        person2.printPerson();
//
//
//        System.out.println(person1.getName('F'));
//        System.out.println(person2.getName('M'));
//
//        person1.printPerson();
//        person2.printPerson();


        Employee employee1 = new Employee("anastasia", 10, 'F', 1000);
        Employee employee2 = new Employee("anastasia", 10, 'F', 1000);
        employee1.isSameName(employee2);



    }
}

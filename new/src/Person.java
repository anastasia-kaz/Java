public class Person {

    String name;
    int age;
    char gender;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    Person(String name, int age, char gender){
            this(name);
            this.age = age;
            this.gender = gender;

    }

    public String getName(char gender) {
        if (gender == 'F') {
            name = "Mrs. " + name;
            return name;
        };
        if (gender == 'M') {
            name = "Mr. " + name;
            return name;
        };
        return  name;
    }

    void printPerson(){
        System.out.println("name: " + name + ", gender: " + gender + ", age: " + age);

    }

}

public class Employee {

    private String name;
    private int age;
    private char gender;
    private int daySalary;

    public Employee(String name, int age, char gender, int daySalary) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.daySalary = daySalary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public int getDaySalary() {
        return daySalary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setDaySalary(int daySalary) {
        this.daySalary = daySalary;
    }

    public int getSalary(MonthUtils.Month[] monthArray){
        int Salary = 0;
        for (int i = 0; i < monthArray.length; i++){

           Salary += getDaySalary() * monthArray[i].getWorkDay();
            
        }
        return Salary;
    }

}

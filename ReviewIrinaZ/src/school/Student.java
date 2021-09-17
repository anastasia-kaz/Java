package school;

public class Student {
    public static void main(String[] args){
        String line = "------------------------------------";
        String s = " ";
        String name = "Имя: ";
        String lastname = "Фамилия: ";
        String age = "Возраст:  ";
        String gender = "Пол: ";
        String grade = "Класс: ";
        String l = " лет";
        String kl = " класс";




        String nameStudent1 = "Вова";
        String lastNameStudent1 = "Сидоров";
        int ageStudent1 = 12;
        String genderStudent1 = "М";
        int gradeStudent1 = 6;
        int numKlStud1;

        String nameStudent2 = "Маша";
        String lastNameStudent2 = "Семенова";
        int ageStudent2 = 7;
        String genderStudent2 = "Ж";
        int gradeStudent2 = 1;
        int numKlStud2;

        System.out.println(line);
        System.out.println(name+s+nameStudent1);
        System.out.println(lastname+s+lastNameStudent1);
        System.out.println(age+s+ageStudent1+s+l);
        System.out.println(gender+s+genderStudent1);
        System.out.println(grade+s+gradeStudent1+s+kl);
        System.out.println(line);

        System.out.println(line);
        System.out.println(name+s+nameStudent2);
        System.out.println(lastname+s+lastNameStudent2);
        System.out.println(age+s+ageStudent2+s+l);
        System.out.println(gender+s+genderStudent2);
        System.out.println(grade+s+gradeStudent2+s+kl);
        System.out.println(line);

        for (ageStudent1 = 7, numKlStud1 = 1; ageStudent1 <= 17; ageStudent1++, nameStudent1= nameStudent1+1){

            System.out.println(nameStudent1 + lastNameStudent1 + ageStudent1 + numKlStud1);
        }



    }
}

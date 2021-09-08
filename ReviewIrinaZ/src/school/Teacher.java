package school;

public class Teacher {
    public static void main(String[] args){
        String line = "------------------------------------";
        String s = " ";
        String fioHeader = "ФИО: ";
        String ageHeader = "Возраст:  ";
        String statusHeader = "Статус: ";
        String subjectHeader = "Предмет: ";

        String name1 = "Мария Ивановна";
        String lastname1 = "Петрова";
        int age1 = 35;
        String status1 = "Учитель";
        String subject1 = "Русский язык и литература";

        String name2 = "Иван Петрович";
        String lastname2 = "Иванов";
        int age2 = 50;
        String status2 = "Учитель";
        String subject2 = "Математика";

        /*System.out.println(line);
        System.out.println(s);
        System.out.print(fioHeader);
        System.out.print(s);
        System.out.print(lastname1);
        System.out.print(s);
        System.out.println(name1);*/

        System.out.println(line);
        System.out.println(fioHeader+s+lastname1+s+name1);
        System.out.println(ageHeader+s+age1);
        System.out.println(statusHeader+s+status1);
        System.out.println(subjectHeader+s+subject1);
        System.out.println(line);

        System.out.println(line);
        System.out.println(fioHeader+s+lastname2+s+name2);
        System.out.println(ageHeader+s+age2);
        System.out.println(statusHeader+s+status2);
        System.out.println(subjectHeader+s+subject2);
        System.out.println(line);








        /*System.out.println("Teachers:");
        System.out.println("-------------------------------------");
        System.out.println("ФИО: Петрова Мария Ивановна");
        System.out.println("Возраст: 35 лет");
        System.out.println("Статус: Учитель");
        System.out.println("Предмет: Русский язык и литература");
        System.out.println("-------------------------------------");
        System.out.println();
        System.out.println("-------------------------------------");
        System.out.println("ФИО: Иванов Иван Петрович");
        System.out.println("Возраст: 50 лет");
        System.out.println("Статус: Учитель");
        System.out.println("Предмет: Математика");
        System.out.println("-------------------------------------");
         */



    }
}

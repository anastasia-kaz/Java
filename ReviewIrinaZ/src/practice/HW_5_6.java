package practice;

public class HW_5_6 {
    public static void main(String[] args){
    // ex1	 (2 = 2) И (7 = 7);
    if ((2 == 2) && (7 == 7)) {
        System.out.println("1 done");
    }

    // ex2  Не(15 < 3)
    if (!(15<3)){
        System.out.println("2 done");
    }

    // ex 3 ("Сосна" = "Дуб") ИЛИ ("Вишня" = "Клён");
    if (("сосна" == "дуб") || ("вишня" == "клен")){
        System.out.println("don't work");
    } else {
        System.out.println("3 done");
    }

    // ex 4 Не("Сосна" = "Дуб");
    if (!("сосна" == "дуб")){
        System.out.println("4 done");
    }
    // ex 5 (Не(15 < 3)) И (10 > 20);
    if ( ! ((15 < 3) && (10 > 20))){
        System.out.println("5 done");
    }
    // ex 6 ("Глаза даны, чтобы видеть")
    // И ("Под третьим этажом находится второй этаж")
    if (("Глаза даны, чтобы видеть" == "Глаза даны, чтобы видеть")
       && ("Под третьим этажом находится второй этаж"
       =="Под третьим этажом находится второй этаж")) {
        System.out.println("6 done");
    }

    // ex 7 (6/2 = 3) ИЛИ (7*5 = 20)
    if ((6 / 2==3) || (7 * 5 == 20)) {
        System.out.println("7 done");
    }

    // ex 8 Водительские права можно получить, только когда исполнится 16 лет.
        int age = 15;
        if (age < 16){
            System.out.println("у вас нет возможность получить водительские права до 16 лет");
        } else {
            System.out.println("вы можете получить водительские права");
        }

    // ex 9 Петя не едет в автобусе, но при этом читает книгу или не смотрит в окно
    //    ((!("едет в автобусе") &&("читает книгу")) || (!("смотрит в окно")))

    // ex 10 “Если с другом ты, это хорошо, а когда наоборот - плохо”
    // if ("" && ""){
    //    System.out.println("это хорошо");
    // } else {
    //    System.out.println("плохо");
    // }
    // ex 2.1 Напишите алгоритм проверки числа на четность. Если число четное, удвойте это число.
    //Напишите тест, который валидирует (проверяет правильность работы) ваш код.
    // Выведите результат проверки чисел 2, 5, 14, 67, 0 на печать.
//    int number = 0;
//    if (number % 2 == 0) {
//        number = number * 2;
//        System.out.println(number);
//    }
//
//    int exprxtedResult = 0;
//    int actualResult = number;
//    if (exprxtedResult == actualResult) {
//        System.out.println("pass");
//    } else {
//        System.out.println("fail");
//    }

    // ex 2.2 Напишите алгоритм проверки возраста на соответствие условиям:
    //Голосовать можно с 18 лет
    //Машину можно водить с 16 лет
    // В школу можно идти с 5 лет
    //Напишите тест, который валидирует ваш код.
    //Придумайте тестовые данные. Выведите результат проверки на печать.
    int age1 = 0;
    if (age1 >= 5) {
        System.out.println("можно идти в школу");
        if (age1 >= 16){
            System.out.println("можно водить машину");
            if (age1 >= 18){
                System.out.println("можно голосовать");
            }
        else {
            System.out.println("можно водить машину, но еще нельзя голосовать");
        }
        }
    else {
        System.out.println("можно ходить в школу, но нельзя водить машину и нельзя голосовать");
    }
    }
    System.out.println("еще расти и расти");

//    String exprxtedResult1 =
//    String actualResult1 =
//
//    if (exprxtedResult1 == actualResult1) {
//        System.out.println("pass");
//    } else {
//        System.out.println("fail");
//    }
    // ex 2.3     Напишите алгоритм программы, которая проверяет оценку ученика и выполняет следующие действия:
        //5 - выдать похвальную грамоту и перевести в следующий класс
        //4 - перевести в следующий класс
        //3 - дать задание на лето и перевести в следующий класс
        //2 - вызвать родителей и оставить в текущем классе на второй год
        //Напишите тест, который валидирует ваш код.
        //Выведите результат проверки на печать.
    int score = 2;
    String list = "выдать похвальную грамоту и перевести в следующий класс";
    String next_year = "перевести в следующий класс";
    String dz = "дать задание на лето и перевести в следующий класс";
    String rod = "вызвать родителей и оставить в текущем классе на второй год";

    if (score == 5) {
        System.out.println(list);
    } else if (score == 4) {
        System.out.println(next_year);
    } else if (score == 3) {
        System.out.println(dz);
    } else System.out.println(rod);

        String exprxtedResult2 = "вызвать родителей и оставить в текущем классе на второй год";;
        String actualResult2 = rod;
        if (exprxtedResult2 == actualResult2) {
            System.out.println("pass");
        } else {
            System.out.println("fail");
        }

    // ex 2.4
        int num = 10005;
        String one = "это однозначное число";
        String two = "это двузначное положительное число";
        String three = "это трехзначное положительное число";
        String four = "это четырехзначное положительное число";
        String five = "это пятизначное положительное число";


    if (num >= -9 && num <= 9 ){
        System.out.println("это однозначное число");
    } else if (num >=10 && num <=99){
        System.out.println("это двузначное положительное число");
    } else if (num >= 100 && num <= 999){
        System.out.println("это трехзначное положительное число");
    } else if (num >= 1000 && num <= 9999){
       System.out.println("это четырехзначное положительное число");
    }else if (num >= 10000 && num <= 99999) {
       System.out.println("это пятизначное положительное число");
    }

        String exprxtedResult3 = "это пятизначное положительное число";;
        String actualResult3 = five;
        if (exprxtedResult3 == actualResult3) {
            System.out.println("pass");
        } else {
            System.out.println("fail");
        }




        String line = "_______________________________________________________________________________";
        String task = "Task #";
        String test = "Test for Task #";
        String tab = "\t";
        /*
         * If-else + test
         * Задача №1
         * Напишите алгоритм проверки числа на четность. Если число четное, удвойте это число.
         * Напишите тест, который валидирует (проверяет правильность работы) ваш код.
         * Выведите результат проверки чисел 2, 5, 14, 67, 0 на печать.
         */
        System.out.println(line);
        System.out.println(task + 1);

        int number = 2; //2, 5, 14, 67, 0
        int newNumber;
        String oddOrEven = "";
        String action = "";
        if (number % 2 == 0) {
            newNumber = number * 2;
            oddOrEven = "even";
            action = "multiply by 2";
        } else {
            newNumber = number;
            oddOrEven = "odd";
            action = "no action";
        }

        System.out.println("Initial number is " + number + ", this number is " + oddOrEven
                + ", that's why new number is " + newNumber);
        System.out.print(line);

        /* Test for Task #1 */
        System.out.println();
        System.out.println(test + 1);
        int expectedResult = 0;
        if (number == 2) {
            expectedResult = 4;
        }
        if (number == 5) {
            expectedResult = 5;
        }
        if (number == 14) {
            expectedResult = 28;
        }
        if (number == 67) {
            expectedResult = 67;
        }
        if (number == 0) {
            expectedResult = 0;
        }

        int actualResult = newNumber;
        String testResult = "";
        if (expectedResult == actualResult) {
            testResult = "Pass";
        } else {
            testResult = "Fail";
        }

        System.out.println(line);
        System.out.println("Initial number: " + tab + tab + number);
        System.out.println("Odd or Even: " + tab + tab + tab + oddOrEven);
        System.out.println("Action: " + tab + tab + tab + tab + action);
        System.out.println("New number: " + tab + tab + tab + newNumber);
        System.out.println("Test Result: " + tab + tab + tab + testResult);
        System.out.println(line);


    }
}

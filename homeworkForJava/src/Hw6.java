public class Hw6 {
    public static void main(String[] args){

//        Задача №1
//
//        Дана строка:
//        String s = “Перестановочный алгоритм быстрого действия”;
//        необходимо вывести все буквы “о” из этой строки.
//        Для указанной строки ответ будет “ооооо” (или в столбик)

        String s = "Перестановочный алгоритм быстрого действия";

        for (int i = 0; i < s.length(); i++){
            if ( s.charAt(i) == 'о' ) {
                System.out.print(s.charAt(i));
            }
        }

//        Задача №2
//
//        Дана строка:
//        String s = “Перевыборы выбранного президента”;
//        необходимо подсчитать количество букв “е” в строке.
//        Для указанной строки ответ будет 4.

        String s1 = "Перевыборы выбранного президента";
        int count = 0;
        for (int i = 0; i < s1.length(); i++ ) {
            if(s1.charAt(i) == 'е') {
                count++;
            }
        }
        System.out.println(count);

//        Задача №3
//
//        Дана строка:
//        String s = “Посмотрите как Рите нравится ритм”;
//        необходимо вывести индексы начала всех подстрок - “рит”, независимо от регистра.
//        Для указанной строки ответ будет 6, 15, 29.

        String s2 = "Посмотрите как Рите нравится ритм";
        s2 = s2.toLowerCase();
        String sub = "рит";
        for (int i = 0; i < s2.length() - sub.length(); i++) {
            if (s2.substring(i, i+sub.length()).equals(sub)) {
                System.out.println(i);
            };
        };

        int index = s2.indexOf("рит");
        while (index != -1){
            System.out.println(index);
            index = s2.indexOf("рит", index + 1);
        }

//        Экстра задача
//        Дан массив:
//        String[][] array = {{“Привет”, “всем”, “кто”}, {“изучает”, “язык”, “программирования”}, {“java”}};
//        необходимо подсчитать количество строк в массиве, которые не содержат буквы “е”.
//
        String[][] array = {{"Привет", "всем", "кто"}, {"изучает", "язык", "программирования"}, {"java"}};
        int count3 = 0;
        for (int i = 0; i < array.length; i ++){
            for (int j = 0; j < array[i].length; j++) {
                boolean notex = false;
                for (int k = 0; k < array[i][j].length(); k++) {
                    if (array[i][j].charAt(k) == 'е') {
                        notex = true;
                        break;
                    }
                }
                if (!notex){
                    count3++;
                }
                notex = false;

            }
        }
        System.out.println(count3);


        int count1 = 0;
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                if (!array[i][j].contains("е")){
                    count1 ++;
                }
            }
        }
        System.out.println(count1);


    }
}

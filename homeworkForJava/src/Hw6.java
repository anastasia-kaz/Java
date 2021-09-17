public class Hw6 {
    public static void main(String[] args){

//        Задача №1
//
//        Дана строка:
//        String s = “Перестановочный алгоритм быстрого действия”;
//        необходимо вывести все буквы “о” из этой строки.
//        Для указанной строки ответ будет “ооооо” (или в столбик)

//        String s = "Перестановочный алгоритм быстрого действия";
//
//        for (int i = 0; i < s.length(); i++){
//            if ( s.charAt(i) == 'о' ) {
//                System.out.print(s.charAt(i));
//            }
//        }

//        Задача №2
//
//        Дана строка:
//        String s = “Перевыборы выбранного президента”;
//        необходимо подсчитать количество букв “е” в строке.
//        Для указанной строки ответ будет 4.

//        String s = "Перевыборы выбранного президента";
//        int count = 0;
//        for (int i = 0; i < s.length(); i++ ) {
//            if(s.charAt(i) == 'е') {
//                count++;
//            }
//        }
//        System.out.println(count);

//        Задача №3
//
//        Дана строка:
//        String s = “Посмотрите как Рите нравится ритм”;
//        необходимо вывести индексы начала всех подстрок - “рит”, независимо от регистра.
//        Для указанной строки ответ будет 6, 15, 29.

        String s = "Посмотрите как Рите нравится ритм";
//
        s = s.toLowerCase();
        char arr[] = s.toCharArray();
        String a = "рит";
        char arr1[] = a.toCharArray();
        for (int i = 0; i<arr.length; i++) {
            if (arr[i] == 'р') {
                if (arr[i+1] == 'и') {
                    if (arr[i] + 2 == 'т') {
                        System.out.println(s.indexOf('р'));
                    };
                };
            };
        };



//        System.out.println(s.indexOf("рит"));



//        for (int i = 0; i < s.length(); i++){
//            if (arr[i] == 'р') {
//                if (arr[i+1] == 'и'){
//                    if (arr[i]+2 == 'т') {
//                        System.out.println(s.indexOf(i));
//                    }
//                }
//            }
//        }
        //System.out.println(s.indexOf("рит"));









    }
}

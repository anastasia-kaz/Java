package practise;
import java.util.Arrays;
public class Tasks {
    public static void main(String[] args){

//Задача 1. Создайте цикл for с помощью которого Вы выведете в консоль числа от 15 до 8
//       for (int i=15; i>=8; i--){
//           System.out.println(i);
//       }

//Задача 2. Создайте цикл for с помощью которого Вы выведете в консоль числа от 500 до 550
//        for (int i=500; i<=550; i++){
//            System.out.println(i);
//        }

//Задача 3. Поделите все числа от 0 до 10 на 2 и выведете результат в консоль
//        for (int i=0; i<=10; i++){
//           System.out.println(i / 2.0);
//        }

//Задача 4. Увеличьте все числа от 0 до 10 в 2.5 раза и выведете результат в консоль
//        for (int i=0; i<=10; i++){
//           System.out.println(i * 2.5);
//        }

//Задача 5. При помощи цикла возведите число 11 в 4 степень
//        int j = 11;
//        for (int i=0; i<3; i++){
//             j = j * 11;
//        }
//        System.out.println(j);

//Задача 6. Выведете в консоль 5 раз "Я буду лучшим QA"
//        int i = 0;
//        while (i<5){
//            System.out.println("я буду лучшим QA");
//            i++;
//        }

//Задача 7. Возведите число 15 в 3 степень, все результаты вывести в консоль
//        int i = 0;
//        int j = 15;
//        while (i<2){
//            j = j * 15;
//            System.out.println(j);
//            i++;
//        }

//Задача 8. Еще 5 минуток на поспать.
// Выведет в консоль время с 7:00 до 7:30 и после надпись "я проспал"
//        int a = 0;
//        do{
//            System.out.println("7:" + a + " Еще 5 минуток на поспать");
//            a = a + 5;
//        }while (a<=30);
//        System.out.println("я проспал");

//Задача 9. Вывести в консоль числа от 0 д 10 с использованием цикла do-while
//        int i = 0;
//        do{
//            System.out.println(i);
//            i++;
//        } while (i<=10);

//Задача 10.  Проверить 5 чисел на четность
//        for (int i = 0; i < 10; i++){
//            if (i == 0){
//                System.out.println("является 0");
//            }
//            if (i % 2 == 0) {
//                System.out.println(i + " число четное");
//            } else {
//                System.out.println(i + " число не четное");
//            }
//        }

//Задача 11. Вывести все четные числа в обратном порядке от 20 до 0
//            for (int i = 20; i>0; i--){
//                if (i % 2 == 0){
//                    System.out.println(i);
//                }
//            }

//Задача 12. В классе 32 ученика, каждый третий ученик умеет играть в футбол,
// вывести в консоль количество учеников которые умеют играть в футбол
//            int a = 0;
//            for (int i = 1; i<=32; i++)
//            if (i % 3 == 0){
//                a++;
//            }
//            System.out.println(a);

//Задача 12. Создать массив и заполнить его числами от 0 до 10
//            int[] a = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//            System.out.println(Arrays.toString(a));

//Задача 13. Создать массив и заполнить его четными числами от 0 до 10
//             int [] a = new int[6];
//             for (int i = 0, j = 0 ; i<=10; i++){
//                 if(i % 2 == 0){
//                     a[j] = i;
//                     j++;
//                 }
//             }
//             System.out.println(Arrays.toString(a));

//Задача 14. Вывести в консоль все элементы массива при помощи цикла while
//              int[] a = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//              while (a[]<10){
//                    System.out.println();
//              }

//Задача 15. Найти максимальный элемент в массиве

//            int max = Integer.MIN_VALUE;
//            int[] a = {-35, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//            for(int i = 0; i < a.length; i++){
//                if (max < a[i]) {
//                    max = a[i];
//
//                }
//            }
//            System.out.println(max);

//Задача 16. Вычислить среднее арифметическое число элементов массива
//            int sum = 0;
//            int[] a = {-35, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//            for(int i = 0; i < a.length; i++){
//                sum = sum + a[i];
//            }
//            System.out.println((double)sum/a.length);

//Задача 17. Заполнить массив размером на 20 элементов при помощи цикла
//            int[] a = new int[20];
//            for (int i = 0; i< a.length; i++){
//                a[i] = i+1;
//            }
//            System.out.println(Arrays.toString(a));

//Задача 18. Заполнить строковый массив при помощи цикла, строку и размер можно любые
//            String[] b = new String[20];
//            for (int i = 0; i < b.length; i++){
//                b[i] = "hello";
//            }
//            System.out.println(Arrays.toString(b));

//Задача 19. Необходимо вывести минимальное число массива
//            int[] a = {-35, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//            int min = Integer.MAX_VALUE;
//            for (int i = 0; i <a.length; i++ )
//                if (min>a[i]){
//                    min = a[i];
//                }
//            System.out.println(min);

//Задача 20. Создать двумерный массив и заполнить его
//            int[][] a = {{1, 2, 1, 6, 5}, {5, 8, 9, 75, 45, 12, 36}, {45, 45, 78, 1, 25, 5}};
//            System.out.println(Arrays.deepToString(a));

//Задача 21. Вывести при помощи цикла массив в консоль
//            int[][] a = {{1, 2, 1, 6, 5}, {5, 8, 9, 75, 45, 12, 36}, {45, 45, 78, 1, 25, 5}};
//            for(int i = 0; i < a.length; i++){
//                for(int j = 0; j < a[i].length; j++){
//                    System.out.println(a[i][j]);
//                }
//            }

//Задача 22. Вывести сумму элементов массива
//            int sum = 0;
//            int[][] a = {{1, 2, 1, 6, 5}, {5, 8, 9, 75, 45, 12, 36}, {45, 45, 78, 1, 25, 5}};
//            for(int i = 0; i < a.length; i++){
//                for(int j = 0; j < a[i].length; j++){
//                    sum = sum + a[i][j];
//                }
//            }
//            System.out.println(sum);


//Задача 23. Вывести максимальный элемент массива
//            int max = Integer.MIN_VALUE;
//            int[][] a = {{1, 2, 1, 6, 5}, {5, 8, 9, 75, 45, 12, 36}, {45, 45, 78, 1, 25, 5}};
//            for(int i = 0; i < a.length; i++){
//                for(int j = 0; j < a[i].length; j++){
//                    if (max < a[i][j]) {
//                        max = a[i][j];
//                    }
//                }
//            }
//            System.out.println(max);


//Задача 24. Создать массив из 15 элементов и вывести в консоль с 4 по 9 элемент массива
//            int[] a = new int[15];
//            for (int i = 0; i<a.length; i++){
//                a[i] = i ;
//            }
//            for (int i = 4; i <=9; i++ ){
//                System.out.println(a[i]);
//            }

//Задача 25. Создать двумерный массив и вывести в консоль его размер
//          int aa = 0;
//          int[][] a = {{1, 2, 1, 6, 5}, {5, 8, 9, 75, 45, 12, 36}, {45, 45, 78, 1, 25, 5}};
//          for (int i = 0; i < a.length; i++) {
//              aa = aa + a[i].length;
//          }
//          System.out.println(aa);






    }
}

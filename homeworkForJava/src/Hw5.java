import java.util.Arrays;
public class Hw5 {
    public static void main(String[] args){
        //ex1 Дан массив:
        //int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        //необходимо вывести сумму всех значений массива.
        int[] array1 = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int sum = 0;
        for ( int i = 0; i < array1.length; i++){
            sum=sum+array1[i];
        }
        System.out.println( "Сумма всех значений массива " + sum);

        //ex2 Дан массив:
        //int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        //необходимо вывести максимальное значение массива.
        int max = 0;
        for (int i = 0; i < array1.length; i++){
            if (array1[i]>max){
                max = array1[i];
            }
        }
        System.out.println("Максимальное значение в массиве " + max);

        //ex3 Дан массив:
        //int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        //необходимо вывести минимальное значение массива.
        int min = array1[0];
        for (int i = 0; i < array1.length; i++){
            if (array1[i]<min){
                min = array1[i];
            }
        }
        System.out.println("Минимальное значение в массиве " + min);

        //ex 4 Дан массив:
        //int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        //необходимо вывести среднее арифметическое всех значений массива.
        double avgSum = (double) sum / array1.length;
        System.out.println("Среднее арифметическое всех значений массива " + avgSum);

        //ex 5 Дан массив:
        //int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        //необходимо вывести сумму элементов массива.
        int summ = 0;
        int[][] array2 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        for (int i = 0; i < array2.length; i++) {
           for (int j = 0; j < array2[i].length; j++) {
               summ= summ + array2[i][j];
           }
        }
        System.out.println("Сумма всех элементов массива " + summ);

        //6 Дан массив:
        //int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        //необходимо вывести максимальное значение массива.
        int max2 = array2[0][0];
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                if (max2 < array2[i][j]){
                    max2 = array2[i][j];
                }
            }
        }
        System.out.println("Максимальный элемент в массиве" + max2);

        // 6a Дан массив:
        //int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        //необходимо вывести минимальное значение массива.

        int min2 = array2[0][0];
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                if (min2 > array2[i][j]){
                    min2 = array2[i][j];
                }
            }
        }
        System.out.println("Минимальный элемент в массиве " + min2);

        // ex 7 Дан массив:
        //необходимо вывести количество элементов в массиве.
        //int[][] array2 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        int count = 0;
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                count++;
            }
        }
        System.out.println("Количество элементов в массиве " + count);


    }
}

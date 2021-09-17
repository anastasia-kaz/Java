import java.lang.reflect.Array;
import java.util.Arrays;

public class Les5 {
    public static void main(String[] args){
        //переменные в джаве всегда с маленькой буквы
        //референс типы с большой буквы
        //int a = 10;
        int[] arr = {3, 4, 5, 5};
        //String[] arrs = {"mama", "papa", "docha"};
        //System.out.println(a);
        //arr[1]=10;
        //System.out.println(Arrays.toString(arr));// вывод всего массива
        //длинну массива в джаве изменить нельзя
        System.out.println(arr.length);//длинна массива
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
        arr = null; //любой референс тайп может хранить пустое значение null
        System.out.println(arr);//если переменная null то невозможно вызвать никаких атрибутов будет ошибка
        //по умолчанию при создании референс типов присваеваеся налл
        arr =new int []{3, 4, 5, 5, 5}; // если необходимо пересоздать массив
        System.out.println(Arrays.toString(arr));
        int[] arr1 = new int[100];
        for (int i=0; i<arr1.length;i++){
            arr1[i] = i + 10;
        }
        System.out.println(Arrays.toString(arr1));
        char[] a1 = new char[10];
        System.out.println(Arrays.toString(a1));

        int[][] a = {
                {2, 3, 6},
                {8, 9, 3, 5, 4},
                {4, 5, 6}
        };
        System.out.println(Arrays.deepToString(a));
        System.out.println(a[2][2]);

        for(int i=0; i< a.length; i++){
            for(int j=0; j< a.length; j++){
                //if (i>=1 &&j>=1)
                System.out.print(a[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }

        int[] ar = {10, 9, 6, 8, 12};

        //алгоритм для вычисления максимального числа из массива
        int index = 0;
        int max = ar[0];
        for (int i = 0;i< ar.length; i++) {
            if (max<ar[i]){
                    max=ar[i];
            }
            index = i;

        }
        System.out.println(max);
        System.out.println(index);

        //поиск минимального значения
        int min = ar[0];
        for (int i = 0;i< ar.length; i++) {
            if (min>ar[i]){
                min=ar[i];
            }
        }
        System.out.println(min);

        //вывод вуммы элементов массива
        int sum=0;
        for (int i=0; i<ar.length; i++) {
        sum=sum+ar[i];
        }
        System.out.println(sum);

    }
}

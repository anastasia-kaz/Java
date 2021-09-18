public class Les7 {
    public static int getMax(int[] arr){
        if (arr == null || arr.length == 0){
            return 0;
        }
        int max = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(max < arr[i]){
               max = arr[i];
            }
        }

        return max;
    }

    public static int getMin(int[] arr){
        if (arr == null || arr.length == 0){
            return 0;
        }
        int min = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }

        return min;
    }

    public static int getResult(int a, int b){
        int x = a * b;
        return x;
    }

    public static void main (String[] args){
        int n1 = 2;
        int m1 = 5;

        int n2 = 1;
        int m2 = 3;

        int z1 = getResult(n1, m1);
        int z2 = getResult(n2, m2);

        System.out.println(z1);
        System.out.println(z2);


        //int[] a = {2, 8, 10, 15, 2, 45, 15};
        System.out.println(getMax(new int[] {-2, -8, -10, -15, -2, -45, 0}));
        //всегда записывать полностью!!!
        System.out.println(getMin(new int[] {-2, -8, -10, 15, 2, 45, 15}));



    }
}

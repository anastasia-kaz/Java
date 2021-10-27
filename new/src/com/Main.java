package com;

public class Main {

//    public static int[] between(int a, int b) {
//        int raz = b - a + 1;
//        int[] arr = new int [raz];
//        if (a < b) {
//            for(int i = 0; i < arr.length; i++){
//                arr[i] = a++;
//            }
//            System.out.println(Arrays.toString(arr));
//        }
//        return arr;
//    }

//    public static int cockroachSpeed(double x){
//        int result = (int)(x * 28);
//        return result;
//    }



    public static int TwiceAsOld(int dadYears, int sonYears){
        int raz = dadYears - sonYears;
        raz = raz * 2;
        raz = raz - dadYears;
        if (raz < 0) {
            raz = raz * (-1);
        }
        return raz ;
    }
    public static void main(String[] args) {


    System.out.println(TwiceAsOld(45, 30));

    }
}


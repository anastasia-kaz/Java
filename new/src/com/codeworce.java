package com;

public class codeworce {

//    public static boolean isLove(final int flower1, final int flower2) {
//        if((flower1 % 2 == 0) && (flower2 % 2 == 1)){
//            return true;
//        };
//        if((flower2 % 2 == 0) && (flower1 % 2 == 1)){
//            return true;
//        };
//        return false;
//
//    }
//    public static int findSmallestInt(int[] args) {
//        int min = Integer.MAX_VALUE;
//    for (int i = 0; i < args.length; i++){
//        if (min> args[i]){
//            min = args[i];
//        }
//    }
//    return min;
//    }public static String countingSheep(int num) {
//    //Add your code here
//    return "";
//  }


    public static int strCount(String str, char letter) {
        int count = 0;
       for (int i = 0; i<str.length(); i++){
           if(str.charAt(i) == letter){
               count++;
           }
       }
       return count;
    }

    public static String countingSheep(int num) {
        String result = "";
        for (int i = 1; i<=num; i++ )
            result += i + " sheep...";
        return result;
    }


    public static String numberToString(int num) {
        String a = Integer.toString(num);
        return a;
    }

    public static int[] between(int a, int b) {
        int raz = b - a + 1;
        int[] arr = new int [raz];
        if (a < b) {
            for(int i = 0; i < arr.length; i++){
                arr[i] = a++;
            }
            //System.out.println(Arrays.(arr));
        }
        return arr;
    }

    public static int cockroachSpeed(double x){
        int result = (int)(x * 28);
        return result;
    }
    public static int TwiceAsOld ( int dadYears, int sonYears){
       int raz = dadYears - sonYears;
       raz = raz * 2;
       raz = raz - dadYears;
       if (raz < 0) {
           raz = raz * (-1);
       }
       return raz;
    }

    public static void main (String[]args){
        System.out.println(numberToString(999));
        System.out.println(countingSheep(10));
        System.out.println(strCount("hello world", 'l'));
    }
}
package com.lesson;

public class Les4 {
    public static void main(String[] args){
        // int i = 0;
        for (int i = 0; i < 5; i = i + 1) {
            // i < 5
            System.out.println(i);
            // i = i + 1
        }
        System.out.println("end");

        int i = 0;
        System.out.println(i);
        for (; i < 5; i = i + 1) {
            // i < 5
            System.out.println(i);
            // i = i + 1
        }
        System.out.println("end");
        System.out.println(i);


        int t = 0;
        while (t < 10) {
            System.out.println(t);
            t = t + 1;
        }

        int r = 0;
        while (!(r > 10)){
            System.out.println(r);
            r = r + 1;
        }

        int w = 0;
        do{
            System.out.println(w);
            w = w + 1;
        } while (w < 10);


    }
}

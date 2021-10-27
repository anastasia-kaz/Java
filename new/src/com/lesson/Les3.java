package com.lesson;

public class Les3 {
    public static void main(String[] args){
        //функции пишут с большой буквы
        // с большой буквы вместо цифры образуется объект
        //Integer X = 2;
        // когда с маленькой то это просто объем памяти для значения
        //int x = -2;
        int x = 35;

        // or и and
        // or ||
        // and &&
        // x>10 or x<0
        if (x < 10 && (x < 35 || x == 35)){
            System.out.println("true");
        } else {
            System.out.println("false");
            // при сравнениии int  обычных чисел используется == сравнение
            // при сравнении Integer объектов надо использовать .equals
            // тк сравниваются объекты а не их значения



        }




        System.out.println();


    }



}

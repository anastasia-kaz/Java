package com;

import com.lesson.Les8;

public class testLes8 {
    public static boolean testGetSum(){
        if (Les8.getSum(10, 10) != 20){
            return false;
        }
        if (Les8.getSum(0, 0) != 0){
            return false;
        }
        if (Les8.getSum(-10, 10) != 0){
            return false;
        }
        if (Les8.getSum(-10, -10) != -20){
            return false;
        }
        return true;
    }
    public static void main(String[] args){
        System.out.println(testGetSum());

    }

}

public class HW2 {
    public static void main(String[] args){
        //ex1
        int a = 8;
        int b = 8;
        if (a == b){
            System.out.println("a == b");
        } else if (a < b){
            System.out.println("a < b");
        } else System.out.println("a > b");

        System.out.println("--------------------------------");


        //ex2
        int x = 4;
        int y = 8;
        if ((x + y)%2==0) {
            System.out.println("maybe a and b are even");
        } else System.out.println("some variable is odd");


        System.out.println("--------------------------------");

        //ex3
        int n = 40;
        if(n > 10){
            System.out.println("больше 10");
        };
        if(n < 100) {
            System.out.println("меньше 100");
        };
        if(n / 2 > 20) {
            System.out.println("результат деления на 2 больше 20");
        };
        if(n > 4 && n < 41) {
            System.out.println("значение переменной между 5 и 40 включительно");
        }else System.out.println("значение переменной меньше 5 или больше 40");





    }
}

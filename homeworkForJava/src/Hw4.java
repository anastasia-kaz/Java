public class Hw4 {
    public static void main(String[] args){


        //ex1
        for (int i = 0; i < 16; i++) {
            System.out.print(i);
            System.out.print(" ");
        }
        System.out.println();
        System.out.println("-------------------------");



        //ex2
        for (int i = 5; i < 10000; i = i*i ) {
            System.out.print(i);
            System.out.print(" ");
        }
        System.out.println();
        System.out.println("-------------------------");


        //ex3
        for (int i = 40; ((i > 39 && i < 61) && (i %4 ) == 0) ; i = i + 4)
        {
            System.out.print(i);
            System.out.print(" ");
        }
        System.out.println();
        System.out.println("-------------------------");

        for (int i = 40; i <= 60; i = i + 1)
            if ((i % 4) == 0)
            {
                System.out.print(i);
                System.out.print(" ");
            }
        System.out.println();
        System.out.println("-------------------------");



        for (int a=0; a<6; a++) {
            for (int b = 0; b < 7; b++) {
                System.out.print("1");
            }
            System.out.println("1");
        }
    }
}


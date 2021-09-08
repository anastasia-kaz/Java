package practice;

public class HW_1_2 {
    public static void  main(String[] args){
        byte a = 10;
        byte b = 20;

        short s =100;
        short t =100;

        int i = 1_000_000;

        long phoneNumber = 375447259142L;

        float f = 100.101f;

        double d = 1000.10000001;

        String myNameInSlak = "Казачёнок Анастасия";


        int sum = a + b;

        int product = s + t;

        int quotient = i / 50;

        double reminder = f % 100;


        double sum1 = i + d;
        System.out.println(" ------------------------------------------");
        System.out.println("|    Мое имя в слаке "+myNameInSlak+"   |");
        System.out.println("|    Мой номер телефона "+phoneNumber+"       |" );
        System.out.println(" ------------------------------------------");

        System.out.println("==========================================================");

        System.out.println("   .   . .... .    .    ....");
        System.out.println("   .   . .    .    .    .  .");
        System.out.println("   ..... .... .    .    .  .");
        System.out.println("   .   . .    .    .    .  .");
        System.out.println("   .   . .... .... .... ....");

        int yob = 2001;
        System.out.println("Если человек родился в "+yob+" году, то его возраст "+ (2021-yob)+" лет.");




    }
}

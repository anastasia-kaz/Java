package practice;


public class HW_3_4 {
    public static void main(String[] args){
        String min = "Минимальное значение типа данных ";
        String max = "Максимальное значение типа данных ";
        String line = "-------------------------------------------------------";
        String task = "Task №";
        String result = "Результат: ";

        System.out.println(task+9);
        Short s = Short.MAX_VALUE;
        System.out.println(max + s.getClass().getSimpleName() + " = " + s);
        System.out.println(line);

        System.out.println(task + 10);
        Short ss = Short.MIN_VALUE;
        System.out.println(min + ss.getClass().getSimpleName() + " = " + ss);
        System.out.println(line);

        System.out.println(task + 11);
        Byte b = Byte.MIN_VALUE;
        System.out.println(min + b.getClass().getSimpleName() + " = " + b);
        System.out.println(line);

        System.out.println(task+12);
        b = Byte.MAX_VALUE;
        System.out.println(max + b.getClass().getSimpleName() + " = " + b);
        System.out.println(line);

        System.out.println(task+13);
        int i = 2_147_483_647;
        System.out.println(max + "int = " + i);
        System.out.println(line);

        System.out.println(task+14);
        Integer ii = Integer.MIN_VALUE;
        System.out.println(min + ii.getClass().getSimpleName() + " = " + ii);
        System.out.println(line);

        System.out.println(task+15);
        Integer iI = i;
        System.out.println(max + iI.getClass().getSimpleName() + " = " + iI);
        System.out.println(line);

        System.out.println(task+16);
        i = ii;
        System.out.println(min + ii.getClass().getSimpleName() + " = " + ii);
        System.out.println(line);

        System.out.println(task+17+"a");
        Double d = (double)(10.099 + 20.0999);
        String dd = d.toString();
        Float f2 = Float.valueOf(dd);
        System.out.println(result + f2);
        System.out.println(line);

        System.out.println(task+17+"b");
        Float f = (float)(10.099 + 20.0999);
        System.out.println(result + f);
        System.out.println(line);

        System.out.println(task+18);
        Short ssss = (short) (8000 * 4000);
        System.out.println(result + ssss);
        System.out.println(line);

        System.out.println(task+19);
        Short sss = (short)(800 * d);
        System.out.println(result + sss);
        System.out.println(line);

        System.out.println(task+20);
        long number = 21474836499l;
        System.out.println(result + number);
        System.out.println(line);

        System.out.println(task+21);
        long number1 =-21474836485l;
        System.out.println(result + number1);
        System.out.println(line);

        System.out.println(task+22);
        Double pi = 3.14;
        System.out.println("π = " + pi);
        pi = Math.PI;
        System.out.println("π = " + pi);
        System.out.println(line);

        System.out.println(task+23);
        String alphabet = "абвгдеёжзиклмнопрстуфхцчшщъыьэюя";
        System.out.println("Алфавит: "+ alphabet);
        System.out.println(line);

        System.out.println(task+24);
        Long numbers = 9876543210l;
        System.out.println("Цифры по убыванию: " + numbers);
        System.out.println(line);

        System.out.println(task+25);
        Float e = (float)Math.E;
        System.out.println("Экспонента равна = " + e);
        System.out.println(line);

        System.out.println(task+26);
        char c = 'a';
        System.out.println(c);
        System.out.println(line);

        System.out.println(task+27);
        final char cc = 'а';
        System.out.println(cc);
        System.out.println(line);

        System.out.println(task+28);
        System.out.println("Английская буква: "+(int)c);
        System.out.println("Русская буква: "+(int)cc);
        System.out.println(line);

        System.out.println(task+29);
        System.out.println((char)(c + 25));
        System.out.println(line);

        System.out.println(task+30);
        System.out.println((char)(cc + 31));
        System.out.println(line);



















    }
}

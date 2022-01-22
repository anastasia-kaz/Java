import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HW19 {
    public static void main(String[] args){
        List<String> newList = new ArrayList<>();
        newList.add("White");
        newList.add("Tan");
        newList.add("Yellow");
        newList.add("Orange");
        newList.add("Red");
        newList.add("Pink");
        newList.add("Purple");
        newList.add("Blue");

        System.out.println(newList);

        newList.removeIf(color -> color.contains("l"));
        System.out.println(newList);

        List<Integer> newInt = new ArrayList<>();
        for(int i = 100; i<=1000; i++){
            newInt.add(i);
        }
        System.out.println(newInt);

        newInt.removeIf(integer -> integer%2==0);
        System.out.println(newInt);

    }
}

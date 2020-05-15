package Day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class Lambda_Expressions {
    public static void main(String[] args) {
        Predicate<Integer>  oddNum=x -> x%2 ==1;

        ArrayList<Integer>  list=new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        for (int i = 11; i < 151; i++) {
            list.add(i);
            }

        Predicate<Integer> div15=x -> !(x%5==0&&x%3==0);

        list.removeIf(div15);
        //list.removeIf(div5);
        //list.removeIf(oddNum);
        System.out.println(list);

        System.out.println("=====================================");
        Predicate<String> startsWithM = s -> !s.startsWith("M");

        ArrayList<String>   names=new ArrayList<>();
        names.addAll(Arrays.asList("Murtaza", "Muhammed", "Boris", "Sha", "Bilal"));
        //names.removeIf(startsWithM);
        System.out.println(names.remove("Boris"));
        System.out.println(names);

    }
}

package Day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsMethods {
    public static void main(String[] args) {
        ArrayList<Integer>  list=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8));
        int max= Collections.max(list);
        int min= Collections.min(list);
        System.out.println(max+"\n"+min);
        System.out.println("===========================================");

        ArrayList<Integer>  numbers=new ArrayList<>(Arrays.asList(1,1,2,4,4));

        Integer maxNum=Collections.max(numbers);
        numbers.removeAll(Arrays.asList(numbers));
        System.out.println(numbers);

        int secondMax=Collections.max(numbers);
        System.out.println(secondMax);

        System.out.println("===========================================");
        ArrayList<String>   names=new ArrayList<>(Arrays.asList("Omer", "Omer", "Mary",        "Sha", "Fatih", "Omer"));
        System.out.println(Arrays.asList(names));
        Collections.replaceAll(names,"Omer","Irina");
        System.out.println(Arrays.asList(names));


    }

}

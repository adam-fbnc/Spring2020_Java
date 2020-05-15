package Day31_BulkOperations;

import java.util.ArrayList;
import java.util.Arrays;

public class Bulk_ContainsAll {
    public static void main(String[] args) {
        ArrayList<Integer> list1=new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);

        boolean result= list1.containsAll(Arrays.asList(40,20,10));
        System.out.println(result);

        Integer[] data={10,30,40};
        boolean result3= list1.containsAll(Arrays.asList(data));
        System.out.println(result3);
    }
}

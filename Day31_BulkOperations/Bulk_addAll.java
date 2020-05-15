package Day31_BulkOperations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Bulk_addAll {
    public static void main(String[] args) {
        ArrayList<Integer> list1=new ArrayList<>();
        Integer[] arr1={30,20,40,50,45,35,200};
        list1.addAll(Arrays.asList(arr1));
        Collections.sort(list1);
        System.out.println(list1);
        System.out.println("==========================================");
        String[] names={"Murtaza","Muhtar","Muhesong","Sada","Rustem"};
        System.out.println(Arrays.asList(names));
        ArrayList<String> nameList= new ArrayList<>();
            nameList.addAll(Arrays.asList(names));
            nameList.add("Osman");
        System.out.println(nameList);

        Integer[]  newArr={1,2,3,4,5,6,7,8,9};
        ArrayList<Integer> arr2=new ArrayList<>(Arrays.asList(newArr));

        ArrayList<Integer> list4=new ArrayList<>();
        Integer a=1;
        System.out.println(list4.remove(a));

    }
}

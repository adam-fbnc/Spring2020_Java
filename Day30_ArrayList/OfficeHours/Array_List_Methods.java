package Day30_ArrayList.OfficeHours;

import java.util.ArrayList;

public class Array_List_Methods {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
                            list.add(10);
                            list.add(20);
                            list.add(1,30);
        System.out.println(list);
        System.out.println(list.size());

        byte a=100;
        Byte a2=100;
        int b2=a2; //unboxing
        ArrayList<String> list2= new ArrayList<>();
                        list2.add("A");
                        list2.add("B");
                        list2.add("C");
                        list2.add("D");
                        list2.add("E");
                        list2.add("F");

        System.out.println(list2);
        for (String each: list2) {
            System.out.println(each);
        }

    }
}

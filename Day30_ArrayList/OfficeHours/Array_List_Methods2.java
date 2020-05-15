package Day30_ArrayList.OfficeHours;

import java.util.ArrayList;

public class Array_List_Methods2 {
    public static void main(String[] args) {
        ArrayList<Character> list1=new ArrayList<>();
                            list1.add('A');
                            list1.add('B');
                            list1.add('C');
                            list1.add('D');

        list1.indexOf('C');
        System.out.println(list1);
        System.out.println(list1.size());

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

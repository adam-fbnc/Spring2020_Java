package Day30_ArrayList;

import java.util.ArrayList;

public class ArrayListMethod {
    public static void main(String[] args) {
        ArrayList<Integer> list1= new ArrayList<>();
        list1.add(5);
        list1.add(7);
        list1.add(8);

        list1.add(1,6);//'index'=location, 'element'=what.
        //list1 now 5,6,7,8         INDEX MUST BE VALID
        System.out.println(list1);

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("A");
        list2.add("B");
        list2.add(1, "C");//{A,C,B}
        list2.add(1, "D");//{A,C,B}
    }
}

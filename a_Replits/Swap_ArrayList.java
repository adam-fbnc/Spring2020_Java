package a_Replits;
import java.util.*;
public class Swap_ArrayList {



        public static ArrayList<String> swap(ArrayList<String> list,int pos1,int pos2)
        {
            String a=list.get(pos1);
            String b=list.get(pos2);
            list.remove(pos1);
            list.add(pos1,b);
            list.remove(pos2);
            list.add(pos2,a);
            return list;
        }

        public static void main(String[] args)
        {
            ArrayList<String> list=new ArrayList<>(Arrays.asList("a","c","b","d","e"));
            System.out.println(list);
            System.out.print(swap(list,0,3));
        }//end main

}

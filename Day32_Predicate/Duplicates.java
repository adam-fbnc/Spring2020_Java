package Day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;

public class Duplicates {
    public static void main(String[] args) {
        ArrayList<String>   list= new ArrayList<>();
        list.addAll(Arrays.asList("A","B","C","D"));
        System.out.println(list);

        ArrayList<String>   duplicates=new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {

            int count=0;
            for(String each: list){
                if(each.equals(list.get(i))){
                    count++;
                }
            }
            if(count>1&&!duplicates.contains(list.get(i))){
                duplicates.add(list.get(i));
            }
        }
    }
}

package Day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class PredicatesUnique {
    public static void main(String[] args) {
        Character[] chars={'A','A','B','C','D','D'};
        ArrayList<Character>    charList=new ArrayList<>(Arrays.asList(chars));
        System.out.println(charList);

        ArrayList<Character>    result= new ArrayList<>();
        int count = Collections.frequency(charList,charList.get(0));
        if(count==1){
            result.add(charList.get(0));


        }
    }
}

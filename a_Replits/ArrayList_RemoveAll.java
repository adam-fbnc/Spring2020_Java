package a_Replits;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_RemoveAll {
    public static void removeAll(ArrayList<String> wordList, String targetWord){
        wordList.removeIf(s-> s.equals(targetWord));

/*        for (int i=0; i<wordList.size();i++) {
            if(wordList.equalsIgnoreCase(targetWord)){

            }
        }*/
    }

    public static void main(String[] args) {
        ArrayList<String> wordList;
        wordList = new ArrayList<String>(Arrays.asList("hi","hey","hi","yo"));
//        System.out.println(wordList);
        removeAll(wordList,"hi");
//        System.out.println(wordList);
    }
}

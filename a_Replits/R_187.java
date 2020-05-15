package a_Replits;

import java.util.ArrayList;

public class R_187 {

    public static ArrayList combineAL(ArrayList<String> wordList1, ArrayList<String> wordList2){
        ArrayList<String> words=new ArrayList<>();
        int len1=wordList1.size();
        for(int i=0; i<len1;i++){
            words.add(i, wordList1.get(i));
        }
        for(int i=0; i<wordList2.size();i++){
            words.add(i+len1, wordList2.get(i));
        }
        return words;
    }

    public static void main(String[] args){
        ArrayList<String> wordList1=new ArrayList<>();
        wordList1.add("A");
        wordList1.add("B");
        ArrayList<String> wordList2=new ArrayList<>();
        wordList2.add("C");
        wordList2.add("D");
        combineAL(wordList1,wordList2);
    }
}

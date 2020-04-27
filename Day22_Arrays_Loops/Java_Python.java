package Day22_Arrays_Loops;

import Day21_MultiDimArrays.StringMethods;

public class Java_Python {
    public static void main(String[] args) {
        String sent="I like java and javascript";
        int countJ=0;
        int countP=0;
        String[] words=sent.split(" ");
        for (String each:words) {
            if(each.contains("java")){
                countJ++;
            }
            if(each.contains("python")){
                countP++;
            }

        }
    }
}

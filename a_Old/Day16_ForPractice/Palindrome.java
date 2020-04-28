package a_Old.Day16_ForPractice;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String w1=input.next();
        String rw="";
        int l1=w1.length()-1;
        boolean palindrome;

        for(int i =l1; i>=0; i--){
            rw += w1.charAt(i);
        }
        palindrome = w1.equalsIgnoreCase(rw);

        System.out.println(w1);
        System.out.println(rw);
        System.out.println("Is palindrome? - "+palindrome);
    }

}

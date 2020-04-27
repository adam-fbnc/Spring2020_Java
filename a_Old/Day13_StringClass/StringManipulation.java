package a_Old.Day13_StringClass;
import java.lang.String;


public class StringManipulation {
    public static void main(String[] args) {
        String str = "Cybertek";

        char ch1=str.charAt(5);
        System.out.println(ch1=='A');
        System.out.println((str.length()));

        String s1 = "Cybertek";
        s1= s1.concat(" School");

        System.out.println((s1));

        String s2="Java";
        System.out.println(s2.concat(" is a programming language"));
        System.out.println(s2);

        String r1="Java is fun";
        r1=r1+" and it's easy";
        System.out.println(r1);
    }
}

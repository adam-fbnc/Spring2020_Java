package a_Old.Day13_StringClass;
import java.util.Scanner;
import java.lang.String;

public class StringManipulations_Practice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name: ");
        String fullN = input.nextLine();
        String firstN = fullN.substring(0,fullN.indexOf(" "));
        String lastN = fullN.substring(fullN.indexOf(" ")+1);


        System.out.println("Your first name is "+firstN);
        System.out.println("Your last name is "+lastN);
    }

}

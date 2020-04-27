package a_Old.Day12_JavaRecap;

import java.util.Scanner;

public class Scanner_NextLinePractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Building number:");
        int bNumber = input.nextInt();
        System.out.println("Building number is" + bNumber);

        System.out.println("Street");
        String street = input.nextLine();

        System.out.println("Street2");
        String street2 = input.nextLine();

        System.out.println(street);
        System.out.println(street2);


    }
}

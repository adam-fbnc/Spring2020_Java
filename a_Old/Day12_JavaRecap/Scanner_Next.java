package a_Old.Day12_JavaRecap;

import java.util.Scanner;

public class Scanner_Next {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String fullAddress = "";

        System.out.println("Enter the number of the building:");
        short bNumber = input.nextShort();
        fullAddress += bNumber + " ";

        System.out.println("Enter the street name:");

    }
}

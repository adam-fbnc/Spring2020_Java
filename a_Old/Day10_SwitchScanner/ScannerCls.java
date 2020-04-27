package a_Old.Day10_SwitchScanner;

import java.util.Scanner;

public class ScannerCls {
    public static void main(String[] args) {
        //Scanner variableName = new Scanner(System.in);

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a value: ");
        byte num1 = input.nextByte();
        System.out.println("You have entered: " + num1);


    }

}

package Day35_Static;

import java.util.Scanner;

public class staticPractice {
    static Scanner scan=new Scanner(System.in);//w-t "static" key, doesn't work in psvm below

    public static void main(String[] args) {
//        Scanner scan= new Scanner(System.in);
        System.out.println("Enter num1: ");
            int num1=scan.nextInt();
        System.out.println("Enter num2: ");
            int num2=scan.nextInt();
        System.out.println("The sum is: "+(num1+num2));
    }

    public void method1(){
//        Scanner scan= new Scanner(System.in);
        System.out.println("Enter num1: ");
        int num1=scan.nextInt();
        System.out.println("Enter num2: ");
        int num2=scan.nextInt();
        System.out.println("The product is: "+(num1*num2));
    }


}

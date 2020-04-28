package a_Old.Day18_DoWhile_NestedLoops;

import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=input.nextInt();
        int result=1;
        int counter=1;

        while(counter<=num){
            result*=counter;
            counter++;
        }
        System.out.println(result);
    }


}

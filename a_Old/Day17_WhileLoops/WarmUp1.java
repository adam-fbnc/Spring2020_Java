package a_Old.Day17_WhileLoops;

import java.util.Scanner;

public class WarmUp1 {
    public static void main(String[] args) {


    Scanner input = new Scanner(System.in);
    double num = 0;
    double max=-999999999;
    double min=999999999;

    for(int i=0; i<5; i++){
        System.out.println("Enter the number: ");
        num = input.nextDouble();

        if(num>max){
            max=num;
        }else{
            min=num;
        }

    }
        System.out.println("Max number = "+max);
        System.out.println("Min number = "+min);

    }
}

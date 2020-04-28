package a_Old.Day17_WhileLoops;

//ARITHMETIC OPERATORS TASK

import java.util.Scanner;
public class WarmUp3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean go_on=true;

        while(go_on) {

            System.out.println("Enter first number: ");
            int num1 = input.nextInt();
            System.out.println("Enter second numer: ");
            int num2 = input.nextInt();
            System.out.println("Enter the operator: ");
            String optr =input.next();

            switch (optr) {
                case "+": System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                break;
                case "-": System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                break;
                case "*": System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
                break;
                case "/": System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
                break;
                case "%": System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
                default:
                    System.out.println("Invalid operator entry!");
            }

            System.out.println("Continue with another pair of numbers? ");
            String answer = input.next();
            go_on=!answer.equalsIgnoreCase("no");

        }

    }

}

package a_Old.Day24_Methods;

import java.util.Scanner;

public class Calculation {
    public static void calc(double n1, double n2, char oprtr) {

        String result="";

        switch (oprtr){
            case '+':
                result +=n1+" "+oprtr+" "+n2+" = "+(n1+n2);
                break;
            case '-':
                result +=n1+" "+oprtr+" "+n2+" = "+(n1-n2);
                break;
            case '*':
                result +=n1+" "+oprtr+" "+n2+" = "+(n1*n2);
                break;
            case '/':
                result +=n1+" "+oprtr+" "+n2+" = "+(n1/n2);
                break;
            default:
                result="Invalid entry";

        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        double n1=s.nextDouble();
        System.out.println("Enter number 2: ");
        double n2=s.nextDouble();
        System.out.println("Enter operator: ");
        char oprtr=s.next().charAt(0);

        calc(n1,n2,oprtr);
    }
}

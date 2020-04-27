package Day18_DoWhile_NestedLoops;
import java.util.Scanner;
public class Division {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1=input.nextInt();
        System.out.println("Enter second number: ");
        int num2=input.nextInt();
        int quotient=0;
        int dup1=num1;

        while(num1>=num2){
            quotient++;
            num1-=num2;
        }
        System.out.println(dup1+" / "+num2+" = "+quotient);
    }
}

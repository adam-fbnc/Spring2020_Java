package Day16_ForPractice;
import java.util.Scanner;

public class CalculateSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = input.nextInt();

        for(int i =1; i<num+1; i++){
            System.out.println(i+" ");
        }
    }

}

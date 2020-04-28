package a_Old.Day18_DoWhile_NestedLoops;
import java.util.Scanner;
public class Triangle {
    public static void main(String[] args) {
        // DO NOT CHANGE:
        Scanner input = new Scanner(System.in);
        System.out.println("Enter vehicle's year:");
        int vehicleYear = input.nextInt();
        System.out.println();
        boolean recallYear = true;

        if (recallYear) {
            System.out.println("Your vehicle needs to be recalled!");
        }
        System.out.println("Your vehicle is fine, enjoy!");
    }
}
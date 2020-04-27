package Day22_Arrays_Loops;
import java.util.*;
public class Scanner_Arrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] entries = new String[5];
        System.out.println("Enter 5 values:");

        for (String each: entries) {
            each=input.nextLine();
        }
    }

}

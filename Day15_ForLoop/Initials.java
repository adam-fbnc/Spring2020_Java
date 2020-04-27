package Day15_ForLoop;
import java.util.Scanner;
public class Initials {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String fn=input.next();
        System.out.println("Enter your last name: ");
        String ln=input.next();

        String init =fn.substring(0,1).concat(ln.substring(0,1).toUpperCase());
        System.out.println(init);

        init = "Hello World";
        boolean A = init.trim().isEmpty();
        init.trim();
        int x = init.indexOf(" ");
        System.out.println(x);
        System.out.println("Result: " +A);

        String str1="abc";
        String str2="abc";
        System.out.println(str1==str2);


    }

}

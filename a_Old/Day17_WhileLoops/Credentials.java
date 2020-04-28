package a_Old.Day17_WhileLoops;
//user name cybertek
//password cybertek123
import java.util.Scanner;

public class Credentials {
    public static void main(String[] args) {

        String u_n="";
        String p_w="";
        String message="Please enter your credentials!";
        int counter=1;
        boolean valid=u_n.equalsIgnoreCase("cybertek")&&p_w.equals("cybertek123");

        Scanner input = new Scanner (System.in);

        while(!valid) {

            System.out.println(message);
            System.out.println("Enter user name: ");
            u_n = input.nextLine();
            System.out.println("Enter password: ");
            p_w = input.nextLine();
            message=counter+" attempt(s) failed. " + (3-counter)+" attempt(s) remain. Let's try this one more time...";
            valid=u_n.equalsIgnoreCase("cybertek")&&p_w.equals("cybertek123");

            if(counter==3){
                System.out.println("Your account is locked... Good bye!!");
                break;
            }
            counter++;
        }
        if(valid) {
            System.out.println("Login successful!");
        }
    }
}

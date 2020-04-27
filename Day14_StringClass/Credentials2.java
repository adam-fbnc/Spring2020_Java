package Day14_StringClass;
import java.util.Scanner;
public class Credentials2 {
    public static void main(String[] args) {
        /*
        Valid credentials are :
        username: cybertek
        password: cybertekschool

        if user enter both valid, the user will be logged in
        if p/w valid, u/n invalid => user name is incorrect
        if p/w invalid, u/n valid => password is incorrect
        if user enter both invalid => invalid user name and password
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter user name: ");
        String un = input.next();
        System.out.println("Enter password: ");
        String pw = input.next();
        String result="";

        if(!un.isEmpty() && !pw.isEmpty()){
            if(un.equalsIgnoreCase("cybertek")) {
                if (pw.equals("cybertekschool")) {
                    result = "You are in!";
                } else {
                    result = "Password is invalid";
                }
            }else if(pw.equals("cybertekschool")){
                     result ="User name is invalid";
                }else {
                    result="Both user name and password are invalid";
            }
        }else{
            result = "Please enter credentials!";
        }
        System.out.println(result);
    }
}

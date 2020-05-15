package a_Old.Day20_Arrays2;
import java.util.Scanner;
public class Months {
    public static void main(String[] args) {
        String[] months={"Jan", "Feb", "Mar", "Apr","May","Jun","Jul","Aug", "Sep","Oct", "Nov","Dec"};
        String[] months2=new String[12];
        Scanner input = new Scanner(System.in);
        int num= input.nextInt();
        int counter=0;

        while(num>12||num<1){
            counter++;
            if(counter>2){
                System.out.println("You are locked out!");
                System.exit(0);
            }
            System.out.println("Your entry is invalid");
            System.out.println("Enter valid month number again: ");
            num=input.nextInt();
        }
        System.out.println(months[num-1]);
    }
}

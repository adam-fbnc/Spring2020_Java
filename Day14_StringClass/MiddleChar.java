package Day14_StringClass;
import java.util.Scanner;
public class MiddleChar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the word: ");
        String word = input.next();

        int wl = word.length()-1;               //number of indexes
        int midleft=wl/2;                       //middle from the left
        int ssendindex = midleft + ((wl)%2+1);  //substring ending index
        String result =word.substring(midleft,ssendindex);

        System.out.println(result);
    }
}

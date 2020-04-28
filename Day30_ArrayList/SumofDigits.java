package Day30_ArrayList;
import java.util.Arrays;

public class SumofDigits {
    public static void main(String[] args) {
        String str = "a1b2c3";
        char[] arr=str.toCharArray();
        System.out.println(Arrays.toString(arr));
        int sum=0;

        for(char each: arr){
            if (Character.isDigit(each)){
                sum += Integer.parseInt(each+"");
            }

        }

    }
}

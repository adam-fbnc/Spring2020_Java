package a_Old.Day20_Arrays2;
import java.util.Arrays;
public class ArrayUtilities {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        String r=Arrays.toString(arr);
        System.out.println(r);
        System.out.println(arr);//prints some scrambled characters (hash), not actual numbers.
        String names[]={"Madina", "Fatih", "Osman"};
        System.out.println(Arrays.toString(names));
    }
}

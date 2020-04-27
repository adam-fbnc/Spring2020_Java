package Day22_Arrays_Loops;

import java.util.Arrays;

public class MDarrays {
    public static void main(String[] args) {
        int wk1[]={1,2,3,4,5,6,7};
        int wk2[]={8,9,10,11,12,13,14};
        int wk3[]={15,16,17,18,19,20,21};
        int wk4[]={22,23,24,25,26,27,28};
        int month[][]={wk1,wk2,wk3,wk4};
        System.out.println(Arrays.toString(wk4));
        System.out.println(Arrays.deepToString(month));
        System.out.println(month[2][0]);//System.out.println(Arrays.toString(month[2][0])); is wrong because toString provides a reference to the whole array, whereas here you are trying to specific element.
        System.out.println(month[0][2]);
    }
}

package Day22_Arrays_Loops;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[]Arr={1,2,3,4,5};
        Arrays.sort(Arr);
        System.out.println(Arrays.toString(Arr));
        int len=Arr.length;
        int[] RevArr=new int[len];
        for(int i =0; i<len; i++){
            RevArr[i]=Arr[(len-i-1)];

        }
        System.out.println(Arrays.toString(RevArr));

    }
}

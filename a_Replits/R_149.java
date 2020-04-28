package a_Replits;

import java.util.Arrays;

public class R_149 {
    public static void main(String[] args) {
        int[] arr={2,8,1,0,7,4,5};
        int[] newArr = new int[arr.length+1];
        int n=3;
        for(int i=0; i<arr.length; i++){
            newArr[i]=arr[i];
        }
        newArr[arr.length]=n;
        System.out.print(Arrays.toString(newArr));

    }


}

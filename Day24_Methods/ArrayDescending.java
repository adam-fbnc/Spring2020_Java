package Day24_Methods;

import java.util.Arrays;

public class ArrayDescending {
    public static void main(String[] args) {
        int[] arr1={1,10,9,8,14,15};
        int[] arr2={200,100,150,500,400};
        int[] arr3={1000,800,5000,3000};
        int[] revArr=Desc(arr3);

        System.out.println(Arrays.toString(revArr));

    }

    public static int[] Desc(int[] arr){
        Arrays.sort(arr);
        int j=arr.length;
        int[] revArr=new int[j];
        for (int i = 0; i < j; i++) {
            revArr[i]=arr[j-i-1];
        }
        return revArr;
    }
}

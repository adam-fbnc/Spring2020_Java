package a_Old.Day20_Arrays2;

import java.util.Arrays;

public class ArraySorting {
    public static void main(String[] args) {
        int[] arr1={9,8,7,6,5,4,3,2,1};
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));

        char[] ch={'Z','D','W','Y','A','B','E','D'};
        Arrays.sort(ch);
        System.out.println(Arrays.toString(ch));

        String[] names={"Deniz", "Osman", "Anna", "Rustem", "Ali"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));
    }
}

package Day24_Methods;

import java.util.Arrays;

public class TasksFromYesterday {
    public static void MaxNum(int[] array) {
        Arrays.sort(array);
        System.out.println(array[array.length-1]);
        }

    public static void main(String[] args) {
        int[] arr={10,8,6,4,11,2,1,0,3,5,7,9};
        MaxNum(arr);
        Descending(arr);
    }

    public static void Descending(int[] array) {
        Arrays.sort(array);
        for (int i = array.length; i > 0; i--) {
            System.out.print(array[i-1]+" ");
        }
    }
}

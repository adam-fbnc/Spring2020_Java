package Day21_MultiDimArrays;

import java.sql.SQLOutput;
import java.util.Arrays;

public class DeepToString {
    public static void main(String[] args) {
        int[][] arr2D={{1,2,3},{4,5,6}};
        System.out.println(Arrays.toString(arr2D));
        System.out.println(Arrays.deepToString(arr2D));
    }
}

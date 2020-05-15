package a_Old.Day24_Methods;

import java.util.Arrays;

public class MinMax {
    public static int Max (int[] nums) {
        Arrays.sort(nums);
        int Max=nums[nums.length-1];
        return Max;
    }
    public static int Min (int[] nums) {
        Arrays.sort(nums);
        int Min=nums[0];
        return Min;
    }

    public static void main(String[] args) {
        int[] nums={1,5,7,4,3,11,4,9,10,2,7,4};
        System.out.println(Max(nums));
        System.out.println(Min(nums));
    }
}

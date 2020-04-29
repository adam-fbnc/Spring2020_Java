package a_Replits;

public class R_151 {
    public static void main(String[] args) {
        int[] nums = {2, 5, 5, 6, 3, 6, 9, 34, 3};
        int count;
        int len=nums.length;

        for(int each: nums){
            count=0;
            for(int i =0; i<len; i++){
                if (each==nums[i]){
                    count++;
                }

            }
            if(count==1){
                System.out.println(each);

            }
        }


    }
    }


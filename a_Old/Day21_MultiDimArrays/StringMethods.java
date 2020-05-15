package a_Old.Day21_MultiDimArrays;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String name = "Java";
        char[] chars=name.toCharArray();

        String str="I like Java";
        String[] arr=str.split(" ");
        System.out.println(Arrays.toString(arr));

        String sentence = "Today is great day";
        String revsent="";
        String[] arr1=sentence.split(" ");
        for(int i = arr1.length; i>0; i--){
            revsent+=arr1[i-1];
            revsent+=" ";
        }
        System.out.println(revsent);
        int arr3[]={1,2,3,4};
        int arr4[]=new int[3];
        arr4=arr3;
        System.out.println(Arrays.toString(arr3));


    }
}

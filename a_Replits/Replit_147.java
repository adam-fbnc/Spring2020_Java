package a_Replits;

import java.util.Scanner;

public class Replit_147 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int size = inp.nextInt();

        int[] arr = new int[size];
        for(int i=0 ;i<=size-1;i++)
        {

            arr[i]=inp.nextInt();
        }
        for(int each :arr){
            isPos(each);
        }
    }

    public static void isPos(int num)
    {
        System.out.println((num>0)?"positive":"not positive");

    }
}

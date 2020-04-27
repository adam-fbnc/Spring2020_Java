package Day26_MethodOverloading;

import java.util.Scanner;
class Main {



    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int size = inp.nextInt();
        int[] arr = new int[size];
        for(int i=0 ;i<=size-1;i++)
        {

            arr[i]=inp.nextInt();
        }

        plus_minus(arr);
    }//end main

    public static void plus_minus(int[] arr){
        int n=0;
        int p=0;
        int z=0;
        for(int each: arr){
            if(each>0){
                p++;
            }else if(each<0){
                n++;
            }else if(each==0){
                z++;
            }

        }
        System.out.print("positives:"+p+", negatives:"+n+", zeros:"+z);

    }

}

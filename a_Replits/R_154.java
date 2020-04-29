package a_Replits;

import java.util.Scanner;

public class R_154 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        isPalindrome(num);
    }

    public static void isPalindrome(int num){
        /*
        int numSize=(int) (Math.log10(num)+1);

        int reps=(int)numSize/2;
        System.out.println(numSize);
        System.out.println(reps);
        int rNum, lNum;
        */
        char[] digits=(num+"").toCharArray();
        System.out.println(digits.length/2);
        int len=digits.length;
        int reps=(int)len/2;
        boolean isPalindrome=true;

        for(int i=0; i<=reps; i++){
            if(!(digits[i]==digits[len-1-i])){
                isPalindrome=false;
                break;
            }
        }
        System.out.println(isPalindrome);
    }

}

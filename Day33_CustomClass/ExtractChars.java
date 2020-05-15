package Day33_CustomClass;

import java.util.ArrayList;

public class ExtractChars {
    public static void main(String[] args) {
        String str="ABCD123$#@&456EFG!";
        char[]  arr=str.toCharArray();

        ArrayList<Character>    letters=new ArrayList<>();
        ArrayList<Character>    digits=new ArrayList<>();
        ArrayList<Character>    specialChar=new ArrayList<>();

        for (char each: arr ) {
            if(Character.isLetter(each)){
                letters.add(each);
            }else if(Character.isDigit(each)){
                digits.add(each);
            }else{
                specialChar.add(each);
            }
        }
        System.out.println(letters);
        System.out.println(digits);
        System.out.println(specialChar);

    }
}

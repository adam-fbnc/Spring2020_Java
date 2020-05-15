package Day33_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class ExtractChars2 {
    public static void main(String[] args) {
        String str="ABCD123$#@&456EFG!";
        char[]  arr=str.toCharArray();
        Character[] ch=new Character[arr.length];
        for (int i=0; i<arr.length; i++) {
            ch[i]=arr[i];
        }

        ArrayList<Character>    letters=new ArrayList<>(Arrays.asList(ch));
        ArrayList<Character>    digits=new ArrayList<>(Arrays.asList(ch));
        ArrayList<Character>    specialChar=new ArrayList<>(Arrays.asList(ch));

        letters.removeIf(p-> !Character.isLetter(p));
        digits.removeIf(p-> !Character.isDigit(p));
        specialChar.removeAll(letters);
        specialChar.removeAll(digits);


        System.out.println(letters);
        System.out.println(digits);
        System.out.println(specialChar);

    }
}

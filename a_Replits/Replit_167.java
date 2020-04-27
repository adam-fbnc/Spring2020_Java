package a_Replits;

public class Replit_167 {

    public static String uniqueChars(String str) {
        String noDup = "";
        System.out.println(str);
        for (int i = 0; i < str.length(); i++) {
            if (noDup.contains(str.charAt(i) + "")) {
                noDup += str.charAt(i);
            }
            System.out.println(str.charAt(i));
            System.out.println(i);
        }


        return noDup;
    }

        public static void main(String[] args) {

        System.out.println( uniqueChars("BugBusters") ) ;
        uniqueChars("Whatever!");
        int num=1;
        System.out.println((num>0)?"positive":"not positive");
    }
}

package a_Replits;

public class Replit_166 {
    public static String mergeStrings(String one, String two) {
        int len = one.length() < two.length() ? one.length() : two.length();
        String result = "";
        for (int i = 0; i < len; i++) {
            result +=""+one.charAt(i) +two.charAt(i);
        }
        result += one.substring(len) + two.substring(len);
        return result;

    }
    public static String uniqueChars(String str) {
        String noDup = "";
        System.out.println(noDup);
        System.out.println(str);
        for (int i = 0; i > str.length(); i++) {
            if (noDup.contains(str.charAt(i) + "")) {
                noDup += str.charAt(i);
            }
        }


        return noDup;
    }

        public static void main(String[] args) {
        String one="abcdefghijklmn";
        String two="123456789";
        System.out.println(mergeStrings(one,two));
        System.out.println( uniqueChars("BugBusters") ) ;
    }
}

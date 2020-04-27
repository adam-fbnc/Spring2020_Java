package a_Replits;

public class Replit_167__ {


    public static void main(String[] args) {

        String noDup = "";
        String str = "BugBusters";
        System.out.println(str);
        for (int i = 0; i < str.length(); i++) {
            if (!noDup.contains(str.charAt(i) + "")) {
                noDup += str.charAt(i);
            }
            System.out.println(str.charAt(i));
            System.out.println(noDup);
        }


    }
}

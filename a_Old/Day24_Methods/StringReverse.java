package a_Old.Day24_Methods;

public class StringReverse {
    public static void main(String[] args) {
        String t = Reverse2("Cybertek");
        System.out.println(t);
    }
    public static void Reverse(String str){
        String Reverse= "";

        for (int i=str.length()-1;i>=0; i--){
            Reverse+=str.charAt(i);
        }

    }

    public static String Reverse2(String str) {
        String Reverse= "";

        for (int i=str.length()-1;i>=0; i--){
            Reverse+=str.charAt(i);
        }
        return Reverse;

    }
}

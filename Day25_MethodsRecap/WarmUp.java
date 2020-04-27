package Day25_MethodsRecap;

public class WarmUp {
    public static void main(String[] args) {
        String str="ABAB";
        String result="";

        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            if(!result.contains(""+ch)){
                result+=ch;
            }
        }
        System.out.println(result);
    }
}

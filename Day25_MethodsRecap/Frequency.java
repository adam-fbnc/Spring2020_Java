package Day25_MethodsRecap;

public class Frequency {
    public static void main(String[] args) {
        String str1="AAA";
        String str2="A";

        int count=0;
        while(str1.contains((str2))){
            count++;
            str1=str1.replaceFirst(str2,"");
        }
        System.out.println(count);
        System.out.println(str1);

        String a="AABBBCDEFAA";

    }
}

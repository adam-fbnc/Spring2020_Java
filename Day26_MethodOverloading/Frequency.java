package Day26_MethodOverloading;

public class Frequency {
    public static void main(String[] args) {
        String str="AAAAAACCCCDDDDDDDDDDDDEEEEEEEE";
        char ch='D';
        int count =frequency(str, ch);
        System.out.println(count);
    }


    public static int frequency(String str, char ch){
        char[] arr=str.toCharArray();

        int count=0;
        for (char each : arr) {
            if(each==ch){
                count++;
            }
        }
        return count;
    }
}

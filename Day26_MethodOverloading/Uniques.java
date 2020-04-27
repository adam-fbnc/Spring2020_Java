package Day26_MethodOverloading;

public class Uniques {

    public static int frequency(String str, char ch){
        char[] arr=str.toCharArray();

        int count=0;
        for (char each : arr) {
            if(each==ch){
                count++;
            }
        }
        //System.out.println(count);
        return count;
    }


    public static String uniques(String str){
        String result="";
        int counter=0;
        char[] arr2=str.toCharArray();
        for (char each: arr2) {
            counter=frequency(str,each);
            if (counter==1){
             result+=each;
            }

        }
        return result;
    }

    public static void main(String[] args) {
        String str="AAAAAACCCCDDDDDKDDDJDLL" +
                "DDDEEEEEEEE";
        System.out.println(uniques(str));
    }
}

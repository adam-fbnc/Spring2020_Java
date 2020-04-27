package a_Old.Day05_Unary_ShorthandOperators;

public class PostPre_Practice {
    public static void main(String[] args) {
        int a = 50;
        a = --a + a++ + a-- + a++;
        //    49  49    50    49
        System.out.println(a);
        a = a++;
        int b = a;
        System.out.println(b);
    }
}

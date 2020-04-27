package a_Old.Day05_Unary_ShorthandOperators;

public class IncrDecr {
    public static void main(String[] args) {
        double t1 = 3.5;
        double t2 = t1--;
        System.out.println(t1);
        System.out.println(t2);

        int b = 25;
        System.out.println(b++);
        System.out.println(b--);
        System.out.println(b);
    }
}

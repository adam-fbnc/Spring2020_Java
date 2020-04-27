package a_Old.Day05_Unary_ShorthandOperators;

public class Practice {
    public static void main(String[] args) {
        System.out.println("R" + 0 + 1);
        System.out.println(10.0 / 3);
        int a = 3, b = 2;
        long c = (a + b) * 2 / 3 % 2;
        System.out.println(c);

        String str = "10.5" + 3;
        //int num = (int) str;

        int x = 10;
        int y = x++;

        System.out.println(y++ + " " + x++ + " " + y);


    }
}

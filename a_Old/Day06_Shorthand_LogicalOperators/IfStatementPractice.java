package a_Old.Day06_Shorthand_LogicalOperators;

public class IfStatementPractice {
    public static void main(String[] args) {
        int x = 300;
        int y = 200;

        boolean xGr8r = x > y;
        boolean yGr8r = x < y;
        if (x == y) {
            System.out.println("They are equal!");
        } else {


            if (xGr8r) {
                System.out.println(x + " is greater than " + y);
            } else {
                System.out.println(y + " is greater than " + x);
            }
        }
    }
}

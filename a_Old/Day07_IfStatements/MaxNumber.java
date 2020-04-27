package a_Old.Day07_IfStatements;

public class MaxNumber {
    public static void main(String[] args) {
        double a = 100;
        double b = 200;
        double c = 300;

        boolean aMax = a > b && a > c;
        boolean bMax = b > a && b > c;
        boolean cMax = c > a && c > b;

        if (aMax) {
            System.out.println("Max number is a");
        }

        if (bMax) {
            System.out.println("Max number is b");
        }

        if (cMax) {
            System.out.println("Max number is c");
        }

    }
}

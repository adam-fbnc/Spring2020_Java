package a_Old.Day08_IfStatements;

public class DaysInMonths {
    public static void main(String[] args) {
        byte month = 11;
        boolean d28 = month == 2;
        boolean d30 = month == 4 || month == 6 || month == 9 || month == 11;
        boolean d31 = !(d28 || d30);

        if (d28) {
            System.out.println("This month has 28 days");
        }

        if (d30) {
            System.out.println("This month has 30 days");
        }

        if (d31) {
            System.out.println("This month has 31 days");
        }

    }
}

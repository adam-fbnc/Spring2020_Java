package a_Old.Day05_Unary_ShorthandOperators;

public class LeapYear {
    public static void main(String[] args) {
        short year = 2020;
        boolean leapYear = year % 4 == 0;
        System.out.println(year + " is leap year: " + leapYear);
    }
}

package a_Old.Day05_Unary_ShorthandOperators;

public class Divisibility {
    public static void main(String[] args) {
        int number = 65;
        boolean divBy2 = number % 2 == 0;
        boolean divBy3 = number % 3 == 0;
        boolean divBy5 = number % 5 == 0;

        System.out.println("Number is divisible by 2: " + divBy2 + "\nNumber is divisible by 3: " + divBy3 + "\nNumber is divisible by 5: " + divBy5);
    }

}

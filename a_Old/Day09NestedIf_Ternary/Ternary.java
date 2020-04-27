package a_Old.Day09NestedIf_Ternary;

public class Ternary {
    public static void main(String[] args) {
        int num = 100;
        String result, result2;

        result = (num % 2 == 0) ? "Even" : "Odd";

        System.out.println(result);
        System.out.println("===============================================");

        int num1 = 100;
        int num2 = 200;
        int max = 0;

        result2 = (num1 > num2) ? "Num1" : "Num2";
        System.out.println(result2);


    }
}

package a_Old.Day09NestedIf_Ternary;

public class Ternary_Practice {
    public static void main(String[] args) {
        int num = 100;
        char ch1 = ' ';

        char ch2 = (num > 0) ? '+' : (num < 0) ? '-' : '0';
        System.out.println(ch1);
        System.out.println(ch2);

        byte score = -90;
        String grade = "";
        String grade2 = "";

        if (score > 89 && score < 101) {
            grade = "Excellent";
        } else if (score > 79 && score < 90) {
            grade = "Great";
        } else if (score > 69 && score < 80) {
            grade = "Good";
        } else if (score > 59 && score < 70) {
            grade = "Pass";
        } else if (score < 60) {
            grade = "Fail";
        } else {
            grade = "Invalid";
        }

        grade2 = (score > 89 && score < 101) ? "Excellent"
                : (score > 79 && score < 90) ? "Great"
                : (score > 69 && score < 80) ? "Good"
                : (score > 59 && score < 70) ? "Pass"
                : (score >= 0 && score < 60) ? "Fail"
                : "Invalid";

        System.out.println(grade);
        System.out.println(grade2);
    }


}

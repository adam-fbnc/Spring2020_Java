package a_Old.Day10_SwitchScanner;

public class daysInMonths {
    public static void main(String[] args) {
        int num = 2;

        boolean days28 = num == 2;
        boolean days30 = num == 4 || num == 6 || num == 9 || num == 11;

        String result = "";

        if (num > 0 && num < 13) {
            result = (days28) ? "28 days" : (days30) ? "30 days" : "31 days";
        } else {
            result = "Invalid";
        }

    }
}

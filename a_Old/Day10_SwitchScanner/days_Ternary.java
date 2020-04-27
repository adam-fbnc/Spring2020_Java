package a_Old.Day10_SwitchScanner;

public class days_Ternary {
    public static void main(String[] args) {
        byte day = 4;
        String dayName = " ";

        if (day >= 1 && day <= 7) {
            dayName = (day == 1) ? "Monday" : (day == 2) ? "Tuesday" : (day == 3) ? "Wednesday" : (day == 4) ? "Thursday"
                    : (day == 5) ? "Saturday" : "Sunday";

        } else {
            dayName = "Invalid";
        }
        System.out.println(dayName);
    }
}

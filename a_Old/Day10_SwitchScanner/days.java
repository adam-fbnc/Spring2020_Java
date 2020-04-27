package a_Old.Day10_SwitchScanner;

public class days {
    public static void main(String[] args) {
        byte day = 8;
        String dayName = " ";

        if (day >= 1 && day <= 7) {
            if (day == 1) {
                dayName = "Monday";
            } else if (day == 2) {
                dayName = "Tuesday";
            } else if (day == 3) {
                dayName = "Wednesday";
            } else if (day == 4) {
                dayName = "Thursday";
            } else if (day == 5) {
                dayName = "Friday";
            } else if (day == 6) {
                dayName = "Saturday";
            } else {
                dayName = "Sunday";
            }

        } else {
            dayName = "Invalid";
        }
        System.out.println(dayName);
    }
}

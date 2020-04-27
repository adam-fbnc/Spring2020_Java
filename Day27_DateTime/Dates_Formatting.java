package Day27_DateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Dates_Formatting {
    public static void main(String[] args) {
        LocalDate date1=LocalDate.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        System.out.println(date1.format(dtf));
        int x=7;
        String result = x>1? "Greater":"Less";
        System.out.println(result);

    }
}

package Day27_DateTime;

import java.time.LocalDate;

public class Dates {
    public static void main(String[] args) {
        LocalDate date1=LocalDate.of(2020,10,25);
        System.out.println(date1);

        LocalDate birthDay=LocalDate.of(1990,4,23);
        LocalDate now =LocalDate.now();
        System.out.println("Today is "+now);
        String str=now+"";
        System.out.println(str);
    }
}

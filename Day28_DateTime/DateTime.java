package Day28_DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DateTime {
    public static void main(String[] args) {
        LocalDateTime dt=LocalDateTime.now();
        System.out.println(dt);

        LocalDate date=LocalDate.of(2020,3,20);
        System.out.println(date);

    }

}

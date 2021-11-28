package practice;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class LearnDateTime {
    public void captureDate() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        System.out.println(dtf.format(now));

        Date date = Calendar.getInstance().getTime();
        System.out.println(date);
    }
}

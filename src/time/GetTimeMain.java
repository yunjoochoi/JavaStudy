package time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoField;

public class GetTimeMain {
    public static void main(String[] args) {
        LocalDateTime lt = LocalDateTime.of(2030, 1, 1, 13, 30, 59);
        System.out.println("Year="+lt.get(ChronoField.YEAR));
        System.out.println("MONTH_OF_YEAR="+lt.get(ChronoField.MONTH_OF_YEAR));
        System.out.println("DAY_OF_MONTH="+lt.get(ChronoField.DAY_OF_MONTH));
        System.out.println("HOUR_OF_DAY="+lt.get(ChronoField.HOUR_OF_DAY));
        System.out.println("MINUTE_OF_HOUR="+lt.get(ChronoField.MINUTE_OF_HOUR));
        System.out.println("SECOND_OF_MINUTE="+lt.get(ChronoField.SECOND_OF_MINUTE));

        System.out.println("편의 메소드 제공");
        System.out.println("Year="+lt.getYear());
        System.out.println("MONTH_OF_YEAR="+lt.getMonthValue());
        System.out.println("DAY_OF_MONTH="+lt.getDayOfMonth());
        System.out.println("HOUR_OF_DAY="+lt.getHour());
        System.out.println("MINUTE_OF_HOUR="+lt.getMinute());
        System.out.println("SECOND_OF_MINUTE="+lt.getSecond());

        System.out.println("편의 메소드 X");
        System.out.println("MINUTE_OF_DAY: "+lt.get(ChronoField.MINUTE_OF_DAY));
        System.out.println("SECOND_OF_DAY: "+lt.get(ChronoField.SECOND_OF_DAY));
    }
}

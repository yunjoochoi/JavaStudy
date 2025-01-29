package time.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class TestAdjusters {
    public static void main(String[] args) {
        int year=2024;
        int month=1;
        LocalDate ld=LocalDate.of(year,month,1);
        DayOfWeek firstdayOfWeek = ld.getDayOfWeek();
        System.out.println("firstdayOfWeek = " + firstdayOfWeek);
        DayOfWeek lastdayOfWeek = ld.with(TemporalAdjusters.lastDayOfMonth()).getDayOfWeek();
        System.out.println("lastdayOfWeek = " + lastdayOfWeek);


    }
}

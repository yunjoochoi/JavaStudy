package time;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class ChangeTimeWithMain {
    public static void main(String[] args) {
        LocalDateTime lt= LocalDateTime.of(2018, 1, 1, 13, 30, 59);
        System.out.println("lt = " + lt);

        LocalDateTime changelt1 = lt.with(ChronoField.YEAR, 2020);
        System.out.println("changelt1 = " + changelt1);

        // 편의메소드
        LocalDateTime changelt2= lt.withYear(2028);
        System.out.println("changelt2 = " + changelt2);

        // TemporalAdjuster 사용
        // 다음주 금요일
        LocalDateTime with1 = lt.with(TemporalAdjusters.next(DayOfWeek.FRIDAY));
        System.out.println("lt = " + lt);
        System.out.println("with1 = " + with1);

        // 이번 달의 마지막 일요일
        LocalDateTime with2 = lt.with(TemporalAdjusters.lastInMonth(DayOfWeek.SUNDAY));
        System.out.println("with2 = " + with2);


    }
}

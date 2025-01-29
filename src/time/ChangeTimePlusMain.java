package time;

import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class ChangeTimePlusMain {
    public static void main(String[] args) {
        LocalDateTime lt = LocalDateTime.of(2016, 1, 6, 2, 4, 11);
        System.out.println("lt = " + lt);

        LocalDateTime p1 = lt.plus(10, ChronoUnit.YEARS);
        System.out.println("p1 = " + p1);

        LocalDateTime p2 = lt.plusYears(10);
        System.out.println("p2 = " + p2);

        Period period = Period.ofYears(10);
        LocalDateTime plus = lt.plus(period);
        System.out.println("plus = " + plus);

    }
}

package time.test;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class TestBetween {
    public static void main(String[] args) {
        LocalDate startDate=LocalDate.of(2024,1,1);
        LocalDate endDate=LocalDate.of(2024,11,21);
        Period between = Period.between(startDate, endDate);
        System.out.println("남은기간: " + between.getYears()+"년"+between.getMonths()+"개월"+between.getDays()+"일" );
        long between1 = ChronoUnit.DAYS.between(startDate, endDate);
        System.out.println("DDAY = " + between1);
        
    }
}

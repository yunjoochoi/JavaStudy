package time.test;



import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.time.temporal.WeekFields;

public class TestPlus {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.of(2024, 1, 1 );

        for(int i=0;i<5;i++){

            System.out.println("날짜 "+(i+1)+": "+ld.plus(i * 2, ChronoUnit.WEEKS));
        }

    }

}

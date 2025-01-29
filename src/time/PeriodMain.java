package time;

import java.time.LocalDate;
import java.time.Period;

public class PeriodMain {
    public static void main(String[] args) {
        Period period = Period.ofDays(10);
        System.out.println("period = " + period);

        // 게산
        LocalDate localDate = LocalDate.of(2030, 1, 1);
        System.out.println("localDate = " + localDate);
        LocalDate plus = localDate.plus(period);
        System.out.println("plus = " + plus);

        // 기간 차이
        LocalDate localDate1 = LocalDate.of(2023, 4, 1);
        LocalDate localDate2 = LocalDate.of(2023, 6, 4);
        Period between = Period.between(localDate1, localDate2);
        System.out.println("between = " + between);
        System.out.println("between.getDays() = " + between.getDays()+"    between.getMonths() = " + between.getMonths());



    }
}

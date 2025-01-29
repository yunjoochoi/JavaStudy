package time.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

public class TestCalendarPrinter {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("년도를 입력하세요: ");
        int year=scanner.nextInt();
        scanner.nextLine();

        System.out.print("월을 입력하세요: ");
        int month=scanner.nextInt();
        scanner.nextLine();
        LocalDate firstDayofMonth = LocalDate.of(year, month, 1);
        LocalDate lastDayofMonth = firstDayofMonth.plusMonths(1);
        System.out.println("Su Mo Tu We Th Fr Sa"); //0 1 2 3 4 5 6 7

        int offset=firstDayofMonth.getDayOfWeek().getValue()%7;
        for (int i = 0; i < offset; i++) {
            System.out.print("   ");
        }
        LocalDate startDay=firstDayofMonth;
        while(startDay.isBefore(lastDayofMonth)){
            System.out.printf("%2d ", startDay.getDayOfMonth());
            if(startDay.getDayOfWeek()==DayOfWeek.SATURDAY){
                System.out.println(" ");
            }
            startDay=startDay.plusDays(1);
        }
    }
}

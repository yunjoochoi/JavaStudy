package time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormattingMain2 {
    public static void main(String[] args) {
        // 포매팅: 날짜를 문자로
        LocalDateTime date = LocalDateTime.of(2024, 12, 23,13,30,59);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String format=date.format(formatter);
        System.out.println("format = " + format);
        System.out.println(date);

        // 파싱: 문자를 날짜로
        String dateString="2022-12-22 13:30:59";
        LocalDateTime ldt=LocalDateTime.parse(dateString,formatter);
        System.out.println("ldt = " + ldt);


    }
}

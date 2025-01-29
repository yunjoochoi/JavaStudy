package time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormattingMain1    {
    public static void main(String[] args) {
        // 포매팅: 날짜를 문자로
        LocalDate date = LocalDate.of(2024, 12, 23);
        System.out.println("date="+date);

        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");
        String stringDate = date.format(formatter);
        System.out.println("stringDate = " + stringDate);

        // 파싱: 문자를 날짜로
        String input="2030년 01월 01일";
        LocalDate parsedDate=LocalDate.parse(input,formatter);
        System.out.println("parsedDate = " + parsedDate);



    }
}

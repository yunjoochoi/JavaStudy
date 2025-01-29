package time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeMain {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("now = " + now);
        LocalDateTime ofDt=LocalDateTime.of(2016,8,16,8,10,1);
        System.out.println("지정날짜 ofDt = " + ofDt);

        // 날짜와 시간 분리
        LocalDate localDate = ofDt.toLocalDate();
        System.out.println("localDate = " + localDate);
        LocalTime localTime = ofDt.toLocalTime();
        System.out.println("localTime = " + localTime);

        // 날짜와 시간 합체
        LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);
        System.out.println("localDateTime = " + localDateTime);

        //계산 불변임
        LocalDateTime localDateTime1 = ofDt.plusDays(700);
        System.out.println("localDateTime1 = " + localDateTime1);
        LocalDateTime localDateTime2 = ofDt.plusYears(2);
        System.out.println("localDateTime2 = " + localDateTime2);

        // 비교
        System.out.println(now.isBefore(ofDt)); // false
        System.out.println(now.isAfter(ofDt)); // true
        System.out.println(now.isEqual(ofDt)); // false (시간적으로 같으면 시차상관없이 true반환) equals는 타입, 내부구성요소 숫자가 같으면 true


    }
}

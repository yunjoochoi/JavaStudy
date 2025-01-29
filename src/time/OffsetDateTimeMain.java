package time;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public class OffsetDateTimeMain {
    public static void main(String[] args) {
        OffsetDateTime now = OffsetDateTime.now();
        System.out.println("now = " + now);

        LocalDateTime ldt=LocalDateTime.of(2030,1,1,1,3,4);
        System.out.println("ldt = " + ldt);
        OffsetDateTime offsetDateTime = OffsetDateTime.of(ldt, ZoneOffset.of("+01:00")); //1시간 시간차

    }
}

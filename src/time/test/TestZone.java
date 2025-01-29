package time.test;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TestZone {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.of(2024, 1, 1, 9, 0, 0);
        ZonedDateTime seoul = ZonedDateTime.of(localDateTime, ZoneId.of("Asia/Seoul"));
        System.out.println("seoul = " + seoul);

        ZonedDateTime europe = seoul.withZoneSameInstant(ZoneId.of("Europe/London"));
        System.out.println("europe = " + europe);

        ZonedDateTime newy = seoul.withZoneSameInstant(ZoneId.of("America/New_York"));
        System.out.println("newy = " + newy);
    }
}

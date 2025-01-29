package time;

import java.time.Instant;
import java.time.ZonedDateTime;

public class InstantMain {
    public static void main(String[] args) {
        // 생성
        Instant now = Instant.now();// 유티씨 기준이므로 지금시간보다 9시간뺀 시간
        System.out.println("now = " + now);

        ZonedDateTime zdt = ZonedDateTime.now();
        Instant from = Instant.from(zdt);
        System.out.println("from = " + from);

        Instant epochStart= Instant.ofEpochSecond(0);
        System.out.println("epochStart = " + epochStart);

        // 계산
        Instant later = epochStart.plusSeconds(1000);
        System.out.println("later = " + later);

        // 조회
        long epochSecond = later.getEpochSecond();
        System.out.println("epochSecond = " + epochSecond);


    }
}

package time;

import java.time.Duration;
import java.time.LocalTime;

public class DurationMain {
    public static void main(String[] args) {
        Duration duration = Duration.ofMinutes(30);
        System.out.println("duration = " + duration);

        LocalTime localTime = LocalTime.of(1, 0);
        System.out.println("localTime = " + localTime);

        LocalTime plus = localTime.plus(duration);
        System.out.println("plus = " + plus);

        LocalTime startTime = LocalTime.of(9, 0);
        LocalTime endTime = LocalTime.of(10, 3);
        Duration between = Duration.between(startTime, endTime);
        System.out.println("between = " + between);
        System.out.println("between = " + between.getSeconds());
        System.out.println("between Hours= " + between.toHours()+"분: "+ between.toMillisPart()); // 시간계산 후 남은 분만 계산해줌

    }
}

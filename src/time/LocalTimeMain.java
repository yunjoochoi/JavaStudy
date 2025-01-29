package time;

import java.time.LocalTime;

public class LocalTimeMain {
    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        System.out.println("now = " + now);
        LocalTime ofTime = LocalTime.of(9, 10, 11);
        System.out.println("ofTime = " + ofTime);
        
        // 계산은 불변
        LocalTime plusSeconds = ofTime.plusSeconds(30);
        System.out.println("plusSeconds = " + plusSeconds);
    }
}

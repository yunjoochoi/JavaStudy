package time;

import java.time.ZoneId;

public class ZoneIdMani {
    public static void main(String[] args) {
        for (String a : ZoneId.getAvailableZoneIds()) {
            ZoneId zoneId = ZoneId.of(a);
            System.out.println(zoneId+" | "+zoneId.getRules());
        }

        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println("zoneId = " + zoneId);


        ZoneId zoneId1 = ZoneId.of("Asia/Seoul");
        System.out.println("zoneId1 = " + zoneId1);
    }
}

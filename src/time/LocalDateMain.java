package time;

import java.time.LocalDate;

public class LocalDateMain {
    public static void main(String[] args) {
        LocalDate now=LocalDate.now();
        System.out.println("오늘 날짜:"+now);

        LocalDate ofTime=LocalDate.of(2023,12,4);
        System.out.println("지정 날짜: "+ofTime);

        // 계산(불변)
        ofTime.plusDays(10);
        System.out.println("지정 날짜: "+ofTime); // 안바뀜
        ofTime=ofTime.plusDays(10);
        System.out.println("지정 날짜: "+ofTime);

    }
}

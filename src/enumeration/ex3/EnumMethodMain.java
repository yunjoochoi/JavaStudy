package enumeration.ex3;

import java.util.Arrays;

public class EnumMethodMain {
    public static void main(String[] args) {
        // 모든 Enum 반환
        Grade[] values=Grade.values();
        System.out.println("values: "+ Arrays.toString(values));
        for (Grade value : values) {
            System.out.println("name: "+value.name()+", ordinal: "+value.ordinal());

        }
        // ordinal은 가급적 사용하지 말자- 상수 위치 변경시 버그생김

        // String->Enum 변환
        String input="GOLD";
        Grade grade=Grade.valueOf(input);
        System.out.println("gold="+grade); //열거형은 투스트링 오버라이딩 되어있ㅇㅁ
    }

}

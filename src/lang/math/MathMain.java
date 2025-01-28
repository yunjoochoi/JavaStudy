package lang.math;

public class MathMain {
    public static void main(String[] args) {
        System.out.println(Math.max(10,20));

        System.out.println(Math.abs(-1000));
        System.out.println(Math.min(10,20));
        //반올림
        System.out.println(Math.ceil(2.1)); //올림
        System.out.println(Math.floor(2.1)); //내림
        System.out.println(Math.round(2.5)); //반올림

        //기타 유용 메서드
        System.out.println(Math.sqrt(4));
        System.out.println(Math.random()); //0~1
    }
}

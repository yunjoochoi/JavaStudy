package lang.system;

import java.util.Arrays;
import java.util.Map;

public class SystemMain {
    public static void main(String[] args) {
        // 현재 시간(밀리초)를 가져온다.
        long currentTimeMillis=System.currentTimeMillis();
        System.out.println("currentTimeMillis = " + currentTimeMillis);

// 현재 시간(나노초)를 가져온다.
        long currentTimeNano = System.nanoTime();
        System.out.println("currentTimeNano = " + currentTimeNano);

    // 환경 변수를 읽는다.
        System.out.println(System.getenv());
    // 시스템 속성을 읽는다.
        System.out.println(System.getProperties());
        System.out.println("Java.version: "+System.getProperty("java.version"));
    // 배열을 고속으로 복사한다.
        char[] newChar=new char[]{'h','e','l','l','o' };
        char[] coppied=new char[5];
        System.arraycopy(newChar,0,coppied,0,newChar.length);

    // 배열 출력
        System.out.println(coppied); //hello
        System.out.println(Arrays.toString(coppied)); //[h, e, l, l, o]
    //프로그램 종료
        System.exit(0);
    }
}

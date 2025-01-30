package nested.anonymous.ex0;

import java.util.Random;

public class Ex1Main {
    public static void helloDice(){
        System.out.println("프로그램 시작");
        // start
        int nextInt = new Random().nextInt(6)+1;
        System.out.println("주사위 = " + nextInt);
        // end
        System.out.println("프로그램 종료");
    }

    public static void helloSum(){
        System.out.println("프로그램 시작");
        // start
        for (int i = 0; i < 3; i++) {
            System.out.println("i = " + i);
        }
        // end
        System.out.println("프로그램 종료");
    }

    public static void main(String[] args) {
        helloDice();
        helloSum();
    }
}

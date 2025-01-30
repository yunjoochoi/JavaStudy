package nested.anonymous.ex0;

import java.util.Random;

public class Ex1MainRef {
    public static void hello(Process process){
        System.out.println("프로그램 시작");
        process.doit();
        System.out.println("프로그램 종료");
    }
    static class Dice implements Process{
        public void doit(){
            for (int i = 0; i < 3; i++) {
                System.out.println("i = " + i);
            }
        }
    }
    static class Sum implements Process {
        public void doit() {
            // start
            int nextInt = new Random().nextInt(6) + 1;
            System.out.println("주사위 = " + nextInt);
            // end

        }
    }
    public static void main(String[] args) {

        Dice dice = new Dice();
        Sum sum = new Sum();
        hello(dice);
        hello(sum);
    }
}

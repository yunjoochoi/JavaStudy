package nested.anonymous.ex0;

import java.util.Random;

public class Ex1MainRef2 {
    public static void hello(Process process){
        System.out.println("프로그램 시작");
        process.doit();
        System.out.println("프로그램 종료");
    }

    public static void main(String[] args) {
        hello(new Process() {
            @Override
            public void doit() {
                // start
                int nextInt = new Random().nextInt(6) + 1;
                System.out.println("주사위 = " + nextInt);
                // end

            }
        });
        hello(new Process() {
            @Override
            public void doit(){
                for (int i = 0; i < 3; i++) {
                    System.out.println("i = " + i);
                }
            }

        });
    }
}

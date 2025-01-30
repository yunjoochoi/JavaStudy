package nested.local;

import java.lang.reflect.Field;

public class LocalOuterV3 {
    private int outInstanceVar=3;

    public Printer process(final int param){
        // 사실상 지역변수는 파이널 - 값이 바뀌면 안됨(지역클래스의 캡쳐기능때문)
        final int localVar=1; //지역변수는 스택 프레임이 종료되는 순간 함께 제거된다

        class LocalPrinter implements Printer{
            int value=0; // 참고로 지역변수앞에는 접근제어자 사용 분가능(멤버변수에만 가능)

            @Override
            public void print(){
                System.out.println("value="+value);
                // 인스턴스는 지역변수보다 더 오래 살아 남는다
                System.out.println("localVar="+localVar);
                System.out.println("param="+param);
                System.out.println("outInstanceVar="+outInstanceVar);
            }
        }

        LocalPrinter printer = new LocalPrinter();
        return printer;
    }

    public static void main(String[] args) {
        LocalOuterV3 localOuterV1 = new LocalOuterV3();
        Printer printer= localOuterV1.process(2);
        // process의 스택 프렌임이 사라진 이후에 실행
        printer.print();

        // 추가
        System.out.println("필드 확인");
        Field[] fields = printer.getClass().getDeclaredFields();
        for (Field field : fields) {
            System.out.println("field = " + field);
        }
    }
}

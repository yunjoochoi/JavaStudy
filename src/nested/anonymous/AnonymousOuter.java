package nested.anonymous;

public class AnonymousOuter {
    private int outInstanceVar=3;
    public void process(int param){
        int localVar=1;
        // 클래스 생성과 선언을 하나로 합칠수있다
        Printer printer=new Printer() {
            int value=0; // 참고로 지역변수앞에는 접근제어자 사용 분가능(멤버변수에만 가능)

            @Override
            public void print() {
                System.out.println("value="+value);
                System.out.println("localVar="+localVar);
                System.out.println("param="+param);
                System.out.println("outInstanceVar="+outInstanceVar);
            }
        };
        printer.print();
        System.out.println("printer.getClass() = " + printer.getClass());
    }

    public static void main(String[] args) {
        AnonymousOuter localOuterV1 = new AnonymousOuter();
        localOuterV1.process(2);
    }
}

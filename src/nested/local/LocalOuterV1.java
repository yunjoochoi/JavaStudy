package nested.local;

public class LocalOuterV1 {
    private int outInstanceVar=3;

    public void process(int param){
        int localVar=1;

        class localPrinter{
            int value=0; // 참고로 지역변수앞에는 접근제어자 사용 분가능(멤버변수에만 가능)

            public void printData(){
                System.out.println("value="+value);
                System.out.println("localVar="+localVar);
                System.out.println("param="+param);
                System.out.println("outInstanceVar="+outInstanceVar);
            }
        }

        localPrinter localPrinter = new localPrinter();
        localPrinter.printData();
    }

    public static void main(String[] args) {
        LocalOuterV1 localOuterV1 = new LocalOuterV1();
        localOuterV1.process(2);
    }
}

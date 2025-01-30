package exception.basic.unchecked;

/**
 * UnChecked 예외는
 * 예외를 잡거나, 던지지 않아도 된다.
 * 예외를 잡지 않으면 자동으로 밖으로 던진다.
 */
public class UncheckedCatchMain {
    public static void main(String[] args) {
        Service service=new Service();
        service.callCatch();
        // service.callThrow();
        System.out.println("정상종료");
    }
}

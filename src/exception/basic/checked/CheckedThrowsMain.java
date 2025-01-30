package exception.basic.checked;

//체크 예외는 잡아서 직접 처리하거나 또는 밖으로 던지거나 둘중 하나를 개발자가 직접 명시적으로 처리해야한다.
public class CheckedThrowsMain {
    public static void main(String[] args) throws Exception { // 대신부모타입도가능
        Service service = new Service();
        service.callThrow();
        System.out.println("정상 종료");
    }
}

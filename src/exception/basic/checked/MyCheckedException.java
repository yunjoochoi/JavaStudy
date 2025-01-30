package exception.basic.checked;

// Exception을 상속받은 예외는 체크예외가 된다.
// 예외클래스를 만들려면 예외를 상속받으면된다.
public class MyCheckedException extends Exception{
    public MyCheckedException(String message) {
        super(message);
    }
}

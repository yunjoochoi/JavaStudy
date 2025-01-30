package exception.basic.unchecked;

// RuntimeException 상속박은 예외객체는 모두 언체크예외가 된다
public class MyUncheckedException extends RuntimeException{
    public MyUncheckedException(String message) {
        super(message);
    }
}

package exception.basic.unchecked;

public class Client {
    public void call(){
        throw new MyUncheckedException("ex"); // throws안써도 알아서 던짐 에러처리 없으면 - 언체크드에러특
    }
}

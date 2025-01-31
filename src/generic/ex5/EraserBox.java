package generic.ex5;

public class EraserBox<T> {
    public boolean instanceCheck(Object param){
        // 컴파일 오류
        // return param instanceof T;
        return false;
    }

    public void create(){
        // 컴파일 오류
//        new T();

    }
}

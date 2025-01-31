package generic.ex5;

public class Box <T>{
    private T value;
    public void set(T t){
        value=t;
    }

    public T get(){
        return value;
    }
}

package lang.wrapper;

public class MyIntegerMain1 {
    public static void main(String[] args) {
        MyInteger integer = new MyInteger(10);
        int i1=integer.compareTo(5);
        int i2=integer.compareTo(10);
        int i3=integer.compareTo(15);
        System.out.println("i1="+i1);
        System.out.println("i1="+i2);
        System.out.println("i1="+i3);
    }
}

package lang.wrapper;

public class MyIntegerNullMain1 {
    public static void main(String[] args) {
        MyInteger[] intArr={new MyInteger(-1),new MyInteger(3),new MyInteger(0),new MyInteger(1),new MyInteger(2)};
        System.out.println(findValue(intArr,-1).getValue()); //nullPointerException 발생가능
    }
    private static MyInteger findValue(MyInteger[] arr,int value){
        for (MyInteger i : arr) {
            if(i.getValue()==value){
                return i;
            }
        }
        return null;
    }
}

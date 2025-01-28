package lang.immutable.change;

public class ImmutableMain {
    public static void main(String[] args) {
        ImmutableObj obj1=new ImmutableObj(10);
        ImmutableObj obj2=obj1.add(20);

        // 기존과 새로운 값 둘다 알 수 있다
        System.out.println("o1="+obj1.getValue());
        System.out.println("o2="+obj2.getValue());
    }
}

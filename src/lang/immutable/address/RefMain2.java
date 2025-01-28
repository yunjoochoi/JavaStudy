package lang.immutable.address;

public class RefMain2 {
    public static void main(String[] args) {
        ImmutableAddress address=new ImmutableAddress("서울");
        ImmutableAddress b=address; //참조값 대입을 막을 수 있는 방법은 업다.
        System.out.println(address);
        System.out.println(b);

        // b.setValue("부산");
        b=new ImmutableAddress("부산");//값 못바꾸니, 새로 생성해서 담아야 겠네?
        System.out.println(address);
        System.out.println(b);
    }
}

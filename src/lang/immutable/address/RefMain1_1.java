package lang.immutable.address;

public class RefMain1_1 {
    public static void main(String[] args) {
        Address address=new Address("서울");
        Address b=address;
        System.out.println(address);
        System.out.println(b);

        b.setValue("부산");
        System.out.println(address);
        System.out.println(b);
    }
}

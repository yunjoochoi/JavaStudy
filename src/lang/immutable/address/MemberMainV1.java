package lang.immutable.address;

public class MemberMainV1 {
    public static void main(String[] args) {
        Address address = new Address("서울");
        MemberV1 mem1 = new MemberV1("mem1", address);
        MemberV1 mem2= new MemberV1("mem2", address);

        System.out.println("mem1: "+mem1);
        System.out.println("mem2: "+mem2);

        System.out.println("2의 주소 변경");
        mem2.getAddress().setValue("부산");
        System.out.println("mem1: "+mem1);
        System.out.println("mem2: "+mem2);

    }
}

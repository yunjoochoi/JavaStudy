package lang.immutable.address;

public class MemberMainV2 {
    public static void main(String[] args) {
        ImmutableAddress address = new ImmutableAddress("서울");
        MemberV2 mem1 = new MemberV2("mem1", address);
        MemberV2 mem2= new MemberV2("mem2", address);

        System.out.println("mem1: "+mem1);
        System.out.println("mem2: "+mem2);

        System.out.println("2의 주소 변경");
        mem2.setAddress(new ImmutableAddress("부산"));
        System.out.println("mem1: "+mem1);
        System.out.println("mem2: "+mem2);

    }
}

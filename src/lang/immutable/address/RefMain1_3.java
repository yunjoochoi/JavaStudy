package lang.immutable.address;

public class RefMain1_3 {
    public static void main(String[] args) {
        Address a=new Address("서울");
        Address b=a;
        System.out.println(a);
        System.out.println(b);

        change(b,"부산");
        System.out.println(a);
        System.out.println(b);
    }
    private static void change(Address address,String changeAddress){
        System.out.println("주소값변경");
        address.setValue(changeAddress);
    }
}

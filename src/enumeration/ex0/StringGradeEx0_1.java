package enumeration.ex0;

public class StringGradeEx0_1 {
    public static void main(String[] args) {
        int price=10000;


        DiscountService discount=new DiscountService();

        // 존재하지 않는 등급
        int vip =discount.discount("VIP",price);
        System.out.println("vip = " + vip);
        // 오타
        int diamondd =discount.discount("DIAMONDD",price);
        System.out.println("diamondd = " + diamondd);


        int basic = discount.discount("BASIC", price);
        System.out.println("basic = " + basic);
        int gold = discount.discount("GOLD", price);
        System.out.println("gold = " + gold);
        int diamond = discount.discount("DIAMOND", price);
        System.out.println("diamond = " + diamond);
    }
}

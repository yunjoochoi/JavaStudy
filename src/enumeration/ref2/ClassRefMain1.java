package enumeration.ref2;


public class ClassRefMain1 {
    public static void main(String[] args) {
        int price=10000;
        DiscountService discountService=new DiscountService();
        int gold = discountService.discount(Grade.GOLD, price);
        int basicdiscount = discountService.discount(Grade.BASIC, price);
        int diamond = discountService.discount(Grade.DIAMOND, price);


        System.out.println("basicdiscount = " + basicdiscount);
        System.out.println("gold = " + gold);
        System.out.println("diamond = " + diamond);
    }
}

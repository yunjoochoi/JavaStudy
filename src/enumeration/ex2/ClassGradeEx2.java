package enumeration.ex2;

public class ClassGradeEx2 {
    public static void main(String[] args) {
        int price=10000;
        DiscountService discountService=new DiscountService();
        int gold = discountService.discount(ClassGrade.GOLD, price);
        System.out.println("gold = " + gold);
        int basicdiscount = discountService.discount(ClassGrade.BASIC, price);
        System.out.println("basicdiscount = " + basicdiscount);
        int diamond = discountService.discount(ClassGrade.DIAMOND, price);
        System.out.println("diamond = " + diamond);
    }
}

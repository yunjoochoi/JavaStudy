package enumeration.ref1;

import enumeration.ex2.ClassGrade;
import enumeration.ex2.DiscountService;

public class ClassRefMain1 {
    public static void main(String[] args) {
        int price=10000;
        enumeration.ex2.DiscountService discountService=new DiscountService();
        int gold = discountService.discount(enumeration.ex2.ClassGrade.GOLD, price);
        System.out.println("gold = " + gold);
        int basicdiscount = discountService.discount(enumeration.ex2.ClassGrade.BASIC, price);
        System.out.println("basicdiscount = " + basicdiscount);
        int diamond = discountService.discount(ClassGrade.DIAMOND, price);
        System.out.println("diamond = " + diamond);
    }
}

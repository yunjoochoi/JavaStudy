package enumeration.ex3;

// 스태틱임포트하면 코드가 더 간결해짐 - 어차피 상수니까
import static enumeration.ex3.Grade.*;

public class ClassGradeEx3_1 {
    public static void main(String[] args) {
        int price=10000;
        DiscountService discountService=new DiscountService();
        int gold = discountService.discount(GOLD, price);
        System.out.println("gold = " + gold);
        int basicdiscount = discountService.discount(BASIC, price);
        System.out.println("basicdiscount = " + basicdiscount);
        int diamond = discountService.discount(DIAMOND, price);
        System.out.println("diamond = " + diamond);
    }
}

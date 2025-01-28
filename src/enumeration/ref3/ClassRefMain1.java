package enumeration.ref3;


public class ClassRefMain1 {
    public static void main(String[] args) {
        int price=10000;

        // 인라인 배리어블로 코드 축약
        System.out.println("basic = " + Grade.BASIC.discount(price));
        System.out.println("gold = " + Grade.GOLD.discount(price));
        System.out.println("diamond = " + Grade.DIAMOND.discount(price));

        // 중복 더 줄이기
        print(Grade.BASIC,price);
        print(Grade.GOLD,price);
        print(Grade.DIAMOND,price);
    }
    private static void print(Grade grade,int price){
        System.out.println(grade.name() +" = "+grade.discount(price));
    }
}

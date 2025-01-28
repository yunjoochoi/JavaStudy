package enumeration.ref3;

public enum Grade {
    BASIC(10), GOLD(20), DIAMOND(30), VIP(40);

    private final int discountRate;

    Grade(int discountRate) { //private 생략된거
        this.discountRate = discountRate;
    }
    public int discount(int price){
        return price*discountRate/100;
    }

    public int getDiscountRate() {
        return discountRate;
    }
}

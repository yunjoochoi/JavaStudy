package enumeration.ref2;

public enum Grade {
    BASIC(10), GOLD(20), DIAMOND(30);

    private final int discountRate;

    Grade(int discountRate) { //private 생략된거
        this.discountRate = discountRate;
    }

    public int getDiscountRate() {
        return discountRate;
    }
}

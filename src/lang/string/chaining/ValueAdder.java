package lang.string.chaining;

public class ValueAdder {
    private int value;

    public ValueAdder add(int addVal){
        value+=addVal;
        return this;
    }

    public int getValue() {
        return value;
    }
}

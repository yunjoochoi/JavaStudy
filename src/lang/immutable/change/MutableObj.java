package lang.immutable.change;

public class MutableObj {
    private int value;
    public void add(int addValue){
        value+=addValue;
    }
    @Override
    public String toString() {
        return "MutableObj{" +
                "value=" + value +
                '}';
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public MutableObj(int value) {
        this.value = value;
    }
}

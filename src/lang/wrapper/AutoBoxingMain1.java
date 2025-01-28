package lang.wrapper;

public class AutoBoxingMain1 {
    public static void main(String[] args) {
        int value=7;
        Integer boxedValue=Integer.valueOf(value);
        System.out.println("boxedValue = " + boxedValue);
        int unboxedValue=boxedValue.intValue();

        System.out.println("unboxedValue = " + unboxedValue);
    }
}

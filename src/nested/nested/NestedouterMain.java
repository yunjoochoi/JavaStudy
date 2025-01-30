package nested.nested;

public class NestedouterMain {
    public static void main(String[] args) {
        NestedOuter outer=new NestedOuter();
        NestedOuter.nested nested = new NestedOuter.nested();

        nested.print();
        System.out.println("nestedClass = "+nested.getClass());
        // nestedClass = class nested.nested.NestedOuter$nested
    }
}

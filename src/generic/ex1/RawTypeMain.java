package generic.ex1;

public class RawTypeMain {
    public static void main(String[] args) {
        GenericBox genericBox = new GenericBox(); // 옛날코드와의 호환을 위해 지원하긴 하는데 안쓰는게 좋으
        // 오브젝트로 만듬
        //GenericBox<Object> integerBox = new GenericBox<>(); // 권장
        genericBox.set(10);
        Integer integer=(Integer) genericBox.get();
        System.out.println("integer = " + integer);
    }
}

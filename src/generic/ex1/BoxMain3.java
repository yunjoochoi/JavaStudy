package generic.ex1;

public class BoxMain3 {
    public static void main(String[] args) {
        GenericBox<Integer> integerBox = new GenericBox<Integer>();
        integerBox.set(10);
        // integerBox.set("hrll"); 당연히 오류
        Integer integer= integerBox.get();
        System.out.println("integer = " + integer);
        
        GenericBox<String> stringBox=new GenericBox<String>();
        stringBox.set("hello");
        String str= stringBox.get();
        System.out.println("str = " + str);

        // 원하는 모든 타입 사용 가능
        GenericBox<Double> doubleBox = new GenericBox<Double>();
        doubleBox.set(10.3);
        Double doubleValue=doubleBox.get();
        System.out.println("doubleValue = " + doubleValue);

        // 타입 추론: 생성자에 생략 (두번 쓰기 귀찮으니까)
        GenericBox<Integer> integerBox2 = new GenericBox<>();

    }
}

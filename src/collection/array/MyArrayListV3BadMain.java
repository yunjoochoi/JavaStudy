package collection.array;

public class MyArrayListV3BadMain {
    public static void main(String[] args) {
        MyArrayListV3 numberList = new MyArrayListV3();
        numberList.add(1);
        numberList.add(2);
        numberList.add("str");
        System.out.println(numberList);

        Integer num1 =(Integer) numberList.get(0);
        Integer num2 =(Integer) numberList.get(1);

        // ClassCastException 발생, 문자를 Integer로 캐스팅
        // Integer num3 =(Integer) numberList.get(2);



    }
}

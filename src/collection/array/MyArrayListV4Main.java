package collection.array;

/*
* 타입 안전성 + 코드 재사용 = 제네릭
* */
public class MyArrayListV4Main {
    public static void main(String[] args) {
        MyArrayListV4<String> stirngList = new MyArrayListV4<String>();
        stirngList.add("a");
        stirngList.add("b");
        stirngList.add("c");
        String string = stirngList.get(0);
        System.out.println("string = " + string);

        MyArrayListV4<Integer> integerList = new MyArrayListV4<Integer>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        Integer integer = integerList.get(0);
        System.out.println("integer = " + integer);


    }
}

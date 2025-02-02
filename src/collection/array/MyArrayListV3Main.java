package collection.array;

/*
* Arrays.copyOf(기존배열, 새로운길이) : 새로운 길이로 배열을 생성하고, 기존 배열의 값을 새로운 배 열에 복사한다.
* */
public class MyArrayListV3Main {
    public static void main(String[] args) {
        MyArrayListV3 list = new MyArrayListV3();

        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println( list);

        System.out.println("add Last");
        list.add(3,"addLast");
        System.out.println(list);

        System.out.println("add First");
        list.add(0,"addFirst");
        System.out.println(list);

        Object removed1 = list.remove(4);
        System.out.println("removed1 = " + removed1);
        System.out.println(list);

        Object removed2 = list.remove(0);
        System.out.println("removed2 = " + removed2);
        System.out.println(list);


    }
}

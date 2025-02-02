package collection.list;

public class MyListPerformanceTest {
    public static void main(String[] args) {
        int size=50_000;
        System.out.println("==ArrayList 추가==");
        addFirst(new ArrayList<>(),size);
        addMid(new ArrayList<>(),size); // 데이터 밀기 O(n)
        ArrayList<Integer> arrayList = new ArrayList<>(); // 조회용으로 사용
        addLast(arrayList,size); // 찾는데 O(1), 데이터 밀기 O(1)

        System.out.println("==LinkedList 추가==");
        addFirst(new MyLinkedList<>(),size);
        addMid(new MyLinkedList<>(),size); // 데이터 찾기 O(n)
        MyLinkedList<Integer> integerMyLinkedList = new MyLinkedList<>(); // 조회용으로 사용
        addLast(integerMyLinkedList,size); // 데이터 찾기 O(n), 데이터 밀기 O(1)

        int loop = 10000;
        System.out.println("==MyArrayList 조회==");
        getIndex(arrayList, loop, 0); getIndex(arrayList, loop, size / 2); getIndex(arrayList, loop, size - 1);
        System.out.println("==MyLinkedList 조회==");
        getIndex(integerMyLinkedList, loop, 0); getIndex(integerMyLinkedList, loop, size / 2); getIndex(integerMyLinkedList, loop, size - 1);

        System.out.println("==MyArrayList 검색==");
        search(arrayList, loop, 0); search(arrayList, loop, size / 2); search(arrayList, loop, size - 1);
        System.out.println("==MyLinkedList 검색==");
        search(integerMyLinkedList, loop, 0); search(integerMyLinkedList, loop, size / 2); search(integerMyLinkedList, loop, size - 1);

    }
    private static void addFirst(MyList<Integer> list,int size){
        long startTime=System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(0,i);
        }
        long endTime=System.currentTimeMillis();
        System.out.println("앞에 추가- 크기: "+size+", 계산시간: "+(endTime-startTime)+"ms");
    }
    private static void addMid(MyList<Integer> list,int size){
        long startTime=System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(i/2,i);
        }
        long endTime=System.currentTimeMillis();
        System.out.println("중간 위치에 추가- 크기: "+size+", 계산시간: "+(endTime-startTime)+"ms");
    }
    private static void addLast(MyList<Integer> list,int size){
        long startTime=System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(i);
        }
        long endTime=System.currentTimeMillis();
        System.out.println("마지막에 추가- 크기: "+size+", 계산시간: "+(endTime-startTime)+"ms");
    }
    private static void getIndex(MyList<Integer> list,int loop,int index){
        long startTime=System.currentTimeMillis();
        for (int i = 0; i < loop; i++) {
            list.get(index);
        }
        long endTime=System.currentTimeMillis();
        System.out.println("index: " + index + ", 반복: " + loop + ", 계산 시간: " + (endTime - startTime) + "ms");
    }
    private static void search(MyList<Integer> list,int loop,int findValue){
        long startTime=System.currentTimeMillis();
        for (int i = 0; i < loop; i++) {
            list.indexOf(findValue);
        }
        long endTime=System.currentTimeMillis();
        System.out.println("findValue: " + findValue + ", 반복: " + loop + ", 계 산 시간: " + (endTime - startTime) + "ms");
    }
}

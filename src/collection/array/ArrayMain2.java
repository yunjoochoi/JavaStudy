package collection.array;

import java.util.Arrays;

// 배열에서 자료를 찾을 때 인덱스(index)를 사용하면 매우 빠르게 자료를 찾을 수 있다
public class ArrayMain2 {
    public static void main(String[] args) {
        int[] arr=new int[5];
        System.out.println("==index 입력: O(1)==");
        arr[0]=1;
        arr[1]=2;
        System.out.println(Arrays.toString(arr));
        // 배열의 첫번째 위치에 추가
        System.out.println("배열의 첫번째 위치에 3 추가 O(n)");
        addFirst(arr,3);
        System.out.println(Arrays.toString(arr));

        // 배열의 인덱스 위치에 추가
        System.out.println("배열의 index(2) 위치에 4 추가 O(n)");
        addAtIndex(arr, 2, 4);
        System.out.println(Arrays.toString(arr));

        // 배열 마지막 위치에 추가
        System.out.println("배열의 마지막 위치에 5 추가 O(1)");
        addLast(arr, 5);
        System.out.println(Arrays.toString(arr));
    }
    private static void addFirst(int[] arr, int newValue){
        for (int i = arr.length-1; i >0 ; i--) {
            arr[i]=arr[i-1];
        }
        arr[0]=newValue;
    }
    private static void addAtIndex(int[] arr,int index,int newValue){
        for (int i = arr.length-1; i >index ; i--) {
            arr[i]=arr[i-1];
        }
        arr[index]=newValue;
    }
    private static void addLast(int[] arr,int newValue){
        arr[arr.length-1]=newValue;
    }
}

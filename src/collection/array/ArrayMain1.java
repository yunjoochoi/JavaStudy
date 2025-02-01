package collection.array;

import java.util.Arrays;

// 배열에서 자료를 찾을 때 인덱스(index)를 사용하면 매우 빠르게 자료를 찾을 수 있다
public class ArrayMain1 {
    public static void main(String[] args) {
        int[] arr=new int[5];
        System.out.println("==index 입력: O(1)==");
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
        System.out.println(Arrays.toString(arr));

        System.out.println("==index 변경: O(1)==");
        arr[2]=10;
        System.out.println(Arrays.toString(arr));

        System.out.println("==index 조회: O(1)==");
        System.out.println("arr[2] = " + arr[2]);


        System.out.println("==배열 검색: O(n)==");
        System.out.println( Arrays.toString(arr));
        int value=10;
        for (int i = 0; i < arr.length; i++) {
            if(value==arr[i]){
                System.out.println("찾음");
                break;
            }
            
        }

    }
}

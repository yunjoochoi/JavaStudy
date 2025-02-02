package collection.set;

import java.util.Arrays;

/*
* 데이터의 값을 인덱스 번호로 사용하는 아이디어로 O(n)의 검색 연산을 O(1)의 검색 연산으로 바꿀 수 있다
* */
public class HashStart2 {
    public static void main(String[] args) {
        Integer[] inputArray = new Integer[10];
        inputArray[1]=1;
        inputArray[2]=2;
        inputArray[5]=5;
        inputArray[8]=8;

        System.out.println("inputArray = " + Arrays.toString(inputArray));

        int searchValue=8;
        boolean result=(inputArray[searchValue]==searchValue); //배열에서 인덱스로 조회하는 것은 O(1)로 매우 빠르다
        System.out.println("result = " + result);
    }
}


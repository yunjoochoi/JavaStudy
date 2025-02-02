package collection.set;

import java.util.Arrays;

/*
* 메모리 낭비
* */
public class HashStart3 {
    public static void main(String[] args) {
        Integer[] inputArray = new Integer[100];
        inputArray[1]=1;
        inputArray[2]=2;
        inputArray[5]=5;
        inputArray[8]=8;
        inputArray[14]=14;
        inputArray[99]=99;
        System.out.println("inputArray = " + Arrays.toString(inputArray));

        int searchValue=99;
        boolean result=(inputArray[searchValue]==searchValue); //배열에서 인덱스로 조회하는 것은 O(1)로 매우 빠르다
        System.out.println("result = " + result);
    }
}


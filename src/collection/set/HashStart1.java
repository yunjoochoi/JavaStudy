package collection.set;

import java.util.Arrays;

/*
* 해시(hash) 알고리즘을 사용하면 데이터를 찾는 검색 성능을 평균 O(1)로 비약적으로 끌어올릴 수 있다
* */
public class HashStart1 {
    public static void main(String[] args) {
        Integer[] inputArray = new Integer[4];
        inputArray[0]=1;
        inputArray[1]=2;
        inputArray[2]=5;
        inputArray[3]=8;

        System.out.println("inputArray = " + Arrays.toString(inputArray));

        // 성능은 O(n)으로 느리다
        int searchValue=8;
        for (int inputValue : inputArray) {
            if(inputValue == searchValue){
                System.out.println(inputValue);
            }
        }

    }
}


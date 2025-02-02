package collection.set;

import java.util.Arrays;
import java.util.LinkedList;

/*
* 해시 인덱스를 사용하는 방식은 최악의 경우 O(n)의 성능을 보인다.
* 하지만 확률적으로 보면 어느 정도 넓게 퍼지기 때문에 평균으로 보면 대부분 O(1)의 성능을 제공
 */
public class HashStart5 {

    static final int CAPASITY=10;

    public static void main(String[] args) {
        LinkedList<Integer>[] buckets=new LinkedList[CAPASITY];
        for (int i = 0; i < CAPASITY; i++) {
            buckets[i]=new LinkedList<>();
        }
        add(buckets,1);
        add(buckets,2);
        add(buckets,5);
        add(buckets,8);
        add(buckets,14);
        add(buckets,99);
        add(buckets,9);
        System.out.println("buckets="+Arrays.toString(buckets));

        int searchValue=9;
        boolean contains=contains(buckets,searchValue);
        System.out.println("buckets.contains(" + searchValue + ") = " + contains);

    }
    private static void add(LinkedList<Integer>[] buckets,int value){
        int hashIndex=hashIndex(value);
        LinkedList<Integer> bucket=buckets[hashIndex];
        if(!bucket.contains(value)){ // O(n)
            bucket.add(value);
        }
    }
    private static boolean contains(LinkedList<Integer>[] buckets,int searchValue){
        int hashValue=hashIndex(searchValue);
        LinkedList<Integer> bucket=buckets[hashValue]; // O(1)
        return bucket.contains(searchValue); // O(n)
    }
    static int hashIndex(int value){
        return value%CAPASITY;
    }
}


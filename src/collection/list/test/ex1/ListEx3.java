package collection.list.test.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class ListEx3 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<Integer>();
        System.out.println("n개의 정수를 입력하세요 (종료 0)");
        Scanner scanner = new Scanner(System.in);
        int total=0;
        while(true){
            int nextInt = scanner.nextInt();
            if(nextInt==0){
                break;
            }
            list.add(nextInt);
            total+=nextInt;
        }
        System.out.println("입력한 정수의 합계: "+total);
        System.out.println("입력한 정수의 평균:"+(double)total/list.size());
    }

}

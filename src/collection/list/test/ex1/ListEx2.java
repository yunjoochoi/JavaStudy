package collection.list.test.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class ListEx2 {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("n개의 정수를 입력하세요 (종료 0)");
        while(true){
            int n=scanner.nextInt();
            if(n==0) break;
            integers.add(n);
            scanner.nextLine();
        }

        System.out.println("출력");
        for (int i = 0; i < integers.size(); i++) {
            if(i<integers.size()-1){
                System.out.printf("%d, ", integers.get(i));
            }
            else{
                System.out.println(integers.get(i));
            }
        }
    }
}

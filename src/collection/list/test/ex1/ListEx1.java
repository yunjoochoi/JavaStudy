package collection.list.test.ex1;

import java.util.ArrayList;

public class ListEx1 {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<Integer>();
        integers.add(90);
        integers.add(80);
        integers.add(70);
        integers.add(60);
        integers.add(50);

        int total=0;
        for (int i = 0; i < integers.size(); i++) {
            total+=integers.get(i);
        }
        System.out.println("total = " + total);
        double average=(double) total/integers.size();
        System.out.println("average = " + average);
    }
}

package lang.math;

import java.util.Random;

public class RandomMain {
    public static void main(String[] args) {
        //Random random = new Random();
        Random random = new Random(100); //시드 설정
        int randomInt=random.nextInt();
        System.out.println("randomInt = " + randomInt);

        double nextDouble = random.nextDouble();
        System.out.println("nextDouble = " + nextDouble);

        boolean nextBoolean = random.nextBoolean();
        System.out.println("nextBoolean = " + nextBoolean);

        //0~9
        int w=random.nextInt(10);
        System.out.println("randomInt = " + w);

        //1~10
        int i = random.nextInt(10) + 1;
        System.out.println("i = " + i);
    }
        
        

}

package lang.math.test;

import java.util.Random;

public class LottoGenerator {
    private final Random random=new Random();
    private int[] lottoNumbers;
    private int count;

    public int[] generate(){
        lottoNumbers=new int[6];
        count=0;
        while(count<6){
            int number=random.nextInt(45)+1; //1~45삿이 랜덤 숫자
            if(isUnique(number)){
                lottoNumbers[count]=number;
                count++;
            }
        }
        return lottoNumbers;
    }

    // 이미 생성된 번호와 중복되는지 검사
    private boolean isUnique(int num){
        for(int i=0;i<count;i++){
            if(num==lottoNumbers[i])
                return false;
        }
        return true;
    }
}

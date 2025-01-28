package lang.math.test;

import java.util.Arrays;

public class LottoGeneratorMain {
    public static void main(String[] args) {
        LottoGenerator lottoGenerator=new LottoGenerator();
        int[] lotto=lottoGenerator.generate();
        System.out.println(Arrays.toString(lotto));

    }
}

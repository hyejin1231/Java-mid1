package lang.math.test;

import java.util.Arrays;

public class LottoGeneratorMain {
    public static void main(String[] args) {
        LottoGenerator2 generator = new LottoGenerator2();
        int[] lottoNumbers = generator.generate();

        System.out.println("로또 번호 : " + Arrays.toString(lottoNumbers));
    }
}

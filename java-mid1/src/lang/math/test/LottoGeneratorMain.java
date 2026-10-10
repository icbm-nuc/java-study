package lang.math.test;

import java.util.Random;

public class LottoGeneratorMain {

    static void main(String[] args) {

        LottoGenerator generator = new LottoGenerator();
        int[] lottoNumbers = generator.generate();

        System.out.println("로또 번호: ");
        for (int lottoNumber : lottoNumbers) {
            System.out.print(lottoNumber + " ");
        }
    }
}

package lang.math.test;

import java.util.Arrays;
import java.util.Random;

public class LottoGenerator
{
	public static void main(String[] args)
	{
		Random random = new Random();
		int[] lotto = new int[6];
		
		int i = 0;
		while (i < lotto.length)
		{
			int randomNum = random.nextInt(45) + 1;
			if (Arrays.stream(lotto).noneMatch(value -> value == randomNum))
			{
				lotto[i] = randomNum;
				i++;
			}
		}
		
		System.out.println("로또 번호 : " + Arrays.toString(lotto));
	}
}

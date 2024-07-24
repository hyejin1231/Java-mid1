package time.test;

import java.time.LocalDate;

/**
 * 문제와 풀이 1
 */
public class TestLoopPlus
{
	public static void main(String[] args)
	{
		LocalDate localDate = LocalDate.of(2024, 1, 1);

		for (int i = 0; i < 5; i++)
		{
			LocalDate plusWeeks = localDate.plusWeeks(2 * i);
			System.out.println("날짜 " + i + ": " + plusWeeks);
		}
	}
}

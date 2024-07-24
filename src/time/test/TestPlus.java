package time.test;

import java.time.LocalDateTime;

/**
 * 문제와 풀이 1
 */
public class TestPlus
{
	public static void main(String[] args)
	{
		LocalDateTime dateTime = LocalDateTime.of(2024, 1, 1, 0, 0);
		System.out.println("기준 시각: " + dateTime);

		LocalDateTime plusDateTime = dateTime.plusYears(1).plusMonths(2).plusDays(3).plusHours(4);
		System.out.println("1년 2개월 3일 4시간 후의 시각 : " + plusDateTime);
	}
}

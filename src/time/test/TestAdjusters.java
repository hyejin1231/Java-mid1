package time.test;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

/**
 * 문제와 풀이 1
 */
public class TestAdjusters
{
	public static void main(String[] args)
	{
		int year = 2024;
		int month = 1;

		LocalDateTime dt = LocalDateTime.of(year, month, 1, 0, 0, 0);
		DayOfWeek dayOfWeek = dt.with(TemporalAdjusters.firstDayOfMonth()).getDayOfWeek();
		System.out.println("firstDayOfWeek = " + dayOfWeek);

		DayOfWeek lastDayOfWeek = dt.with(TemporalAdjusters.lastDayOfMonth()).getDayOfWeek();
		System.out.println("lastDayOfWeek = " + lastDayOfWeek);
	}
}

package time;

import java.time.temporal.ChronoField;

/**
 * 6. 날짜와 시간
 * - 날짜와 시간의 핵심 인터페이스
 */
public class ChronoFieldMain
{
	public static void main(String[] args)
	{
		ChronoField[] values = ChronoField.values();
		for (ChronoField value : values)
		{
			System.out.println("value = " + value + ", range = " + value.range());
		}

		System.out.println();
		System.out.println("ChronoField.MONTH_OF_YEAR.range() = " + ChronoField.MONTH_OF_YEAR.range());
		System.out.println("ChronoField.DAY_OF_MONTH.range() = " + ChronoField.DAY_OF_MONTH.range());
	}
}

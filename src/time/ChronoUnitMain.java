package time;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

/**
 * 6. 날짜와 시간
 * - 날짜와 시간의 핵심 인터페이스
 */
public class ChronoUnitMain
{
	public static void main(String[] args)
	{
		ChronoUnit[] values = ChronoUnit.values();
		for (ChronoUnit value : values)
		{
			System.out.println("value = " + value);
		}

		System.out.println("ChronoUnit.HOURS = " + ChronoUnit.HOURS);
		System.out.println("ChronoUnit.HOURS.getDuration().getSeconds() = " + ChronoUnit.HOURS.getDuration().getSeconds());
		System.out.println("ChronoUnit.DAYS = " + ChronoUnit.DAYS); // 하루는 86400초
		System.out.println("ChronoUnit.DAYS.getDuration().getSeconds() = " + ChronoUnit.DAYS.getDuration().getSeconds());

		// 차이 구하기
		LocalTime lt1 = LocalTime.of(1, 10, 0);
		LocalTime lt2 = LocalTime.of(1, 20, 0);

		long between = ChronoUnit.SECONDS.between(lt1, lt2);
		System.out.println("between = " + between);

		long betweenMinutes = ChronoUnit.MINUTES.between(lt1, lt2);
		System.out.println("betweenMinutes = " + betweenMinutes);

	}
}

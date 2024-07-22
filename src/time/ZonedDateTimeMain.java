package time;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * 6. 날짜와 시간
 * - ZonedDateTime
 */
public class ZonedDateTimeMain
{
	public static void main(String[] args)
	{
		ZonedDateTime nowZdt = ZonedDateTime.now(); // systemDefaultZoneId 사용
		System.out.println("nowZdt = " + nowZdt);

		LocalDateTime ldt = LocalDateTime.of(2030, 1, 1, 13, 30, 50);
		ZonedDateTime zdt1 = ZonedDateTime.of(ldt, ZoneId.of("Asia/Seoul"));
		System.out.println("zdt1 = " + zdt1);

		ZonedDateTime zdt2 = ZonedDateTime.of(2030, 1, 1, 13, 30, 50, 0, ZoneId.of("Asia/Seoul"));
		System.out.println("zdt2 = " + zdt2);

		// 타임존 변경
		ZonedDateTime utcZdt = zdt2.withZoneSameInstant(ZoneId.of("UTC"));
		System.out.println("utcZdt = " + utcZdt);
	}
}

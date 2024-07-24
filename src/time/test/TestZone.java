package time.test;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * 문제와 풀이 1
 */
public class TestZone
{
	public static void main(String[] args)
	{
		LocalDateTime seoul = LocalDateTime.of(2024, 1, 1, 9, 0, 0);
		ZonedDateTime seouleZonedDateTime = ZonedDateTime.of(seoul, ZoneId.of("Asia/Seoul"));
		System.out.println("서울의 회의 시간 : " + seouleZonedDateTime);

		ZonedDateTime londonZonedDateTime = seouleZonedDateTime.withZoneSameInstant(ZoneId.of("Europe/London"));
		System.out.println("런던의 회의 시간 : " + londonZonedDateTime);

		ZonedDateTime newYorkZonedDateTime = seouleZonedDateTime.withZoneSameInstant(ZoneId.of("America/New_York"));
		System.out.println("뉴욕의 회의 시간 : " + newYorkZonedDateTime);
	}
}

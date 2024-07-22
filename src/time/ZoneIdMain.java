package time;

import java.time.ZoneId;

/**
 * 6. 날짜와 시간
 * - 타임존 ZonedDateTime
 */
public class ZoneIdMain
{
	public static void main(String[] args)
	{
		for (String availableZoneId : ZoneId.getAvailableZoneIds())
		{
			System.out.println("availableZoneId = " + availableZoneId);
			ZoneId zoneId = ZoneId.of(availableZoneId);
			System.out.println(zoneId + " | " + zoneId.getRules());
		}

		ZoneId zoneId = ZoneId.systemDefault(); // 운영체제 기본 zoneId
		System.out.println("zoneId.systemDefault() = " + zoneId);

		ZoneId seoulZoneID = ZoneId.of("Asia/Seoul");
		System.out.println("seoulZoneID = " + seoulZoneID);
	}
}

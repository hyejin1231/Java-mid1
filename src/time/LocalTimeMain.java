package time;

import java.time.LocalTime;

/**
 * 6. 날짜와 시간
 * - LocalDateTime
 */
public class LocalTimeMain
{
	public static void main(String[] args)
	{
		LocalTime nowTime = LocalTime.now();
		LocalTime ofTime = LocalTime.of(11, 11, 30);

		System.out.println("nowTime = " + nowTime); // 현재 시간
		System.out.println("ofTime = " + ofTime); // 지정 시간

		// 계산 (불변)
		LocalTime ofTimePlus = ofTime.plusHours(5); // 지정 시간 + 5시간
		System.out.println("ofTimePlus = " + ofTimePlus);
	}
}

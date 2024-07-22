package time;

import java.time.LocalDate;

/**
 * 6. 날짜와 시간
 * - LocalDateTime
 */
public class LocalDateMain
{
	public static void main(String[] args)
	{
		LocalDate nowDate = LocalDate.now();
		LocalDate ofDate = LocalDate.of(1998, 12, 31);

		System.out.println("nowDate = " + nowDate); // 오늘 날짜
		System.out.println("ofDate = " + ofDate); // 지정 날짜

		// 계산 (불변)
		LocalDate plusDays = ofDate.plusDays(10);
		System.out.println("plusDays = " + plusDays); // 지정 날짜 + 10일
	}
}

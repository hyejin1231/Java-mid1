package time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * 6. 날짜와 시간
 * - LocalDateTime
 */
public class LocalDateTimeMain
{
	public static void main(String[] args)
	{
		LocalDateTime nowDt = LocalDateTime.now();
		LocalDateTime ofDt = LocalDateTime.of(1998, 12, 31, 17, 45, 1);

		System.out.println("nowDt = " + nowDt);
		System.out.println("ofDt = " + ofDt);


		// 날짜와 시간 분리
		LocalDate localDate = ofDt.toLocalDate();
		LocalTime localTime = ofDt.toLocalTime();
		System.out.println("localDate = " + localDate);
		System.out.println("localTime = " + localTime);

		// 날짜와 시간을 합체
		LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);
		System.out.println("localDateTime = " + localDateTime);

		// 계산 (불변)
		LocalDateTime ofDtPlus = ofDt.plusDays(1000);
		System.out.println("ofDtPlus = " + ofDtPlus); // 지정 날짜 시간 + 1000일
		LocalDateTime ofDtPlusYear = ofDt.plusYears(27);
		System.out.println("ofDtPlusYear = " + ofDtPlusYear); // 지정 날짜 시간 + 27년

		// 비교
		System.out.println("현재 날짜 시간이 지정 날짜시간보다 이전인가? " + nowDt.isBefore(ofDt)); // false
		System.out.println("현재 날짜 시간이 지정 날짜 시간보다 이후인가? " + nowDt.isAfter(ofDt)); // true
		System.out.println("현재 날짜시간과 지정 날짜 시간이 같은가 ? " + nowDt.isEqual(ofDt)); // false
	}
}

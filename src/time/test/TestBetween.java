package time.test;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

/**
 * 문제와 풀이 1
 */
public class TestBetween
{
	public static void main(String[] args)
	{
		LocalDate startDate = LocalDate.of(2024, 1, 1);
		LocalDate endDate = LocalDate.of(2024, 11, 21);

		System.out.println("시작 날짜 : " + startDate);
		System.out.println("목표 날짜 : " + endDate);

		Period between = Period.between(startDate, endDate);
		System.out.println("남은 기간 : " + between.getYears() +"년 " + between.getMonths() + "개월 " + between.getDays() +"일");
		System.out.println("디데이 : " + ChronoUnit.DAYS.between(startDate, endDate) + "일 남음");

	}
}

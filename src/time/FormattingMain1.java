package time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * 날짜와 시간 문자열 파싱과 포맷팅
 */
public class FormattingMain1
{
	public static void main(String[] args)
	{
		// 포맷팅 : 날짜 -> 문자
		LocalDate date = LocalDate.of(2024, 12, 31);
		System.out.println("date = " + date);

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");
		String formattedDate = date.format(formatter);
		System.out.println("formattedDate = " + formattedDate);

		// 파싱 : 문자 -> 날짜
		String input = "2030년 01월 01일";
		LocalDate parsedDate = LocalDate.parse(input, formatter);
		System.out.println("parsedDate = " + parsedDate);
	}
}

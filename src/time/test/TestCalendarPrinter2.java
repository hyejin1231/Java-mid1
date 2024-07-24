package time.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class TestCalendarPrinter2
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("년도를 입력하세요 : ");
		int year = scanner.nextInt();

		System.out.print("월을 입력하세요 : ");
		int month = scanner.nextInt();

		LocalDate firstDate = LocalDate.of(year, month, 1);
		LocalDate nextMonthDate = firstDate.plusMonths(1);

		System.out.println("Su Mo Tu We Th Fr Sa");

		int offSetDays = firstDate.getDayOfWeek().getValue() % 7;
		for (int i = 0; i < offSetDays; i++)
		{
			System.out.print("   ");
		}

		LocalDate iterator = firstDate;
		while (iterator.isBefore(nextMonthDate))
		{
			System.out.printf("%2d ", iterator.getDayOfMonth());

			if (iterator.getDayOfWeek() == DayOfWeek.SATURDAY)
			{
				System.out.println();
			}

			iterator = iterator.plusDays(1);
		}

	}
}

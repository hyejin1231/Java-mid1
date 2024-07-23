package time;

import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

/**
 * 6. 날짜와 시간 조회하고 조작하기 1
 */
public class ChangeTimePlusMain {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.of(2018, 1, 1, 13, 30, 59);
        System.out.println("dt = " + dt);

        LocalDateTime plus1 = dt.plus(10, ChronoUnit.YEARS);
        System.out.println("plus1 = " + plus1);

        LocalDateTime plus2 = dt.plusYears(10);
        System.out.println("plus2 = " + plus2);

        Period period = Period.ofYears(10);
        LocalDateTime plus3 = dt.plus(period);
        System.out.println("plus3 = " + plus3);
    }
}

package lang.immutable.test;

/**
 * 불변객체 - 문제 풀이
 */
public class ImmutableMyDateMain {
    public static void main(String[] args) {
        ImmutableMyDate date1 = new ImmutableMyDate(2024, 1, 1);
        ImmutableMyDate date2 = date1;
        System.out.println("date1 = " + date1);
        System.out.println("date2 = " + date2);

        System.out.println("2025 -> date1");
        date1 = date1.withYear(2025); // 반환값 안받으면 변경 안됨 !!
        System.out.println("date1 = " + date1);
        System.out.println("date2 = " + date2);
    }
}

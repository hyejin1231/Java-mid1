package enumeration.ref3;

/**
 * 열거형 Enum
 * - 열거형 리팩토링 3
 */
public class EnumRefMain3_4
{
    public static void main(String[] args) {
        int price = 10000;

        for (Grade grade : Grade.values()) {
            printDiscount(grade, price);
        }
    }

    private static void printDiscount(Grade grade, int price) {
        System.out.println(grade.name() + " 등급의 할인 금액 : " + grade.discount(price));
    }
}
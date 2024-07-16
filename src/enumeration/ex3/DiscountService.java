package enumeration.ex3;


/**
 * 열거형 Enum
 * - 열거형 Enum Type
 */
public class DiscountService
{
    public int discount(Grade grade, int price) {
        int discountPercent = 0;

        if (grade == Grade.BASIC) { // 참조값 비교 사용
            discountPercent = 10;
        } else if (grade == Grade.GOLD) {
            discountPercent = 20;
        } else if (grade == Grade.DIAMOND) {
            discountPercent = 30;
        } else {
            System.out.println("할인 X");
        }

        return price * discountPercent / 100;
    }
}

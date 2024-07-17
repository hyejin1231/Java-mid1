package enumeration.ref2;

/**
 * 열거형 Enum
 * - 열거형 리팩토링 2
 */
public class DiscountService
{
    public int discount(Grade grade, int price) {
        return price * grade.getDiscountPercent() / 100;
    }
}

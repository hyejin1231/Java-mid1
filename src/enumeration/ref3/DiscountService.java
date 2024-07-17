package enumeration.ref3;

/**
 * 열거형 Enum
 * - 열거형 리팩토링 3
 */
public class DiscountService
{
    public int discount(Grade grade, int price) {
        return grade.discount(price);
    }
}

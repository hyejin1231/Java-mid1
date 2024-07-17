package enumeration.ref1;

/**
 * 열거형 Enum
 * - 열거형 리팩토링 1
 */
public class DiscountService {
    public int discount(ClassGrade grade, int price) {
        return price * grade.getDiscountPercent() / 100;
    }
}

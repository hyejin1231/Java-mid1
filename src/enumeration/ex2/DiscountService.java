package enumeration.ex2;

/**
 * 열거형 Enum
 * - 문쟈열과 타입 안정성 1
 */
public class DiscountService {
    public int discount(ClassGrade grade, int price) {
        int discountPercent = 0;

        if (grade == ClassGrade.BASIC) { // 참조값 비교 사용
            discountPercent = 10;
        } else if (grade == ClassGrade.GOLD) {
            discountPercent = 20;
        } else if (grade == ClassGrade.DIAMOND) {
            discountPercent = 30;
        } else {
            System.out.println("할인 X");
        }

        return price * discountPercent / 100;
    }
}

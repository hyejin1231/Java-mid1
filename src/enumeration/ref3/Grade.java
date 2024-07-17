package enumeration.ref3;

/**
 * 열거형 Enum
 * - 열거형 리팩토링 3
 */
public enum Grade {
    BASIC(10), GOLD(20), DIAMOND(30);

    private final int discountPercent;

    Grade(int discountPercent) {
        this.discountPercent = discountPercent;
    }

    public int getDiscountPercent() {
        return discountPercent;
    }

    // 추가 : 할인율을 스스로 계산
    public int discount(int price) {
        return price * discountPercent / 100;
    }
}

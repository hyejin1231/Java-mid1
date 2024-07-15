package enumeration.ex1;

/**
 * 열거형 Enum
 * - 문쟈열과 타입 안정성 2
 */
public class StringGradeEx1_2 {
    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();

        // 존재하지 않는 등급을 입력한다면..?
        int vip = discountService.discount("VIP", price);
        // 오타 발생 확률 높음
        System.out.println("VIP 등급의 할인 금액 :  " + vip);

        // 오타 -> 문자기 때문에 오타가 발생할 수도 있다.
        int diamondd = discountService.discount("DIAMONDD", price);
        System.out.println("DIAMONDD 등급의 할인 금액 : " + diamondd);

        int gold = discountService.discount("gold", price);
        System.out.println("gold 등급의 할인 금액 : " + gold);
    }
}

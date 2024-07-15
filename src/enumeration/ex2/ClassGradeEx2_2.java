package enumeration.ex2;

/**
 * 열거형 Enum
 * 타입 안전 열거형 패턴
 */
public class ClassGradeEx2_2 {
    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();
//        int result = discountService.discount(new ClassGrade(), price); // private 생성자로 막으면 생성 못함

//        System.out.println("result = " + result); // -> 할인 X
    }
}

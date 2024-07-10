package lang.wrapper;

/**
 * 래퍼 클래스 - 오토 박싱
 */
public class AutoBoxingMain2 {
    public static void main(String[] args) {
        // Primitive -> Wrapper
        int value = 7;
        Integer boxedValue = value; // 오토 박싱 (자바에서 기본 제공해줌)

        // Wrapper -> Primitive
        int unboxedValue = boxedValue; // 오토 언박싱

        System.out.println("boxedValue = " + boxedValue);
        System.out.println("unboxedValue = " + unboxedValue);
    }
}

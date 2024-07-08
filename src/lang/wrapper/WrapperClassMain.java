package lang.wrapper;

/**
 * 5. 래퍼 클래스
 */
public class WrapperClassMain {
    public static void main(String[] args) {
        Integer newInteger = new Integer(10); // 미래에 삭제 예정, 대신에 valueOf() 를 사용한다.
        Integer integerObject = Integer.valueOf(10); // -128 ~ 127 자주 사용하는 숫자 값 재사용, 불변 (기존 보다 성능이 더 효율적)

        Long longObj = Long.valueOf(100);
        Double doubleObj = Double.valueOf(10.5);

        System.out.println("newInteger = " + newInteger);
        System.out.println("integerObject = " + integerObject);

        System.out.println("longObj = " + longObj);
        System.out.println("doubleObj = " + doubleObj);

        System.out.println("내부 값 읽기");
        int intValue = integerObject.intValue(); // 래퍼클래스에서 기본형으로 꺼낼 수도 있다.
        System.out.println("intValue = " + intValue);

        System.out.println("비교");
        System.out.println("== : " + (newInteger == integerObject)); // false
        System.out.println("equals : " + (newInteger.equals(integerObject))); // true

        // 자바가 미리 만들어뒀기 때문에 i1과 i2는 비교하면 같다.
        Integer i1 = Integer.valueOf(20);
        Integer i2 = Integer.valueOf(20);
        System.out.println("== : " + (i1 == i2)); // true

    }
}

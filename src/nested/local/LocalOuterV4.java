package nested.local;

import java.lang.reflect.Field;

/**
 * 지역 클래스 - 지역 변수 캡쳐 3
 */
public class LocalOuterV4
{
    private int outInstance = 3;

    public Printer process(final int paramVar) {
        final int localVar = 1; // 지역 변수는 스택 영역이 종료되는 순간 함께 제거된다.

        // 지역 클래스
        class LocalPrinter implements Printer{ // 지역 클래스도 인터페이스도 구현할 수 있다.
            int value = 0;

            @Override
            public void print() {
                System.out.println("value = " + value);
                // 인스턴스는 지역 변수보다 더 오래 살아 남는다.
                System.out.println("localVar = " + localVar); // 지역변수 접근 가능
                System.out.println("paraVar = " + paramVar); // 매개변수도 접근 가능
                System.out.println("outInstance = " + outInstance); // 바깥 클래스의 변수에도 접근 가능

            }
        }

        // 만약 localVar의 값을 변경한다면 ?
        return new LocalPrinter();
    }

    public static void main(String[] args) {
        LocalOuterV4 localOuterV1 = new LocalOuterV4();
        Printer printer = localOuterV1.process(2);
        printer.print();

        // 추가
        System.out.println("필드 확인");
        Field[] fields = printer.getClass().getDeclaredFields();
        for (Field field : fields)
        {
            System.out.println("field = " + field); // 캡쳐한 값들이 필드로 들어있는걸 확인할 수 있다.
        }
    }
}

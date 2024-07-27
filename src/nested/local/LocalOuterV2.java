package nested.local;

/**
 * 지역 클래스
 */
public class LocalOuterV2 {
    private int outInstance = 3;

    public void process(int paramVar) {
        int localVar = 1;

        // 지역 클래스
        class LocalPrinter implements Printer{ // 지역 클래스도 인터페이스도 구현할 수 있다.
            int value = 0;

            @Override
            public void print() {
                System.out.println("value = " + value);
                System.out.println("localVar = " + localVar); // 지역변수 접근 가능
                System.out.println("paraVar = " + paramVar); // 매개변수도 접근 가능
                System.out.println("outInstance = " + outInstance); // 바깥 클래스의 변수에도 접근 가능

            }
        }

        LocalPrinter localPrinter = new LocalPrinter();
        localPrinter.print();
    }

    public static void main(String[] args) {
        LocalOuterV2 localOuterV1 = new LocalOuterV2();
        localOuterV1.process(2);
    }
}

package nested.local;

/**
 * 지역 클래스
 */
public class LocalOuterV1 {
    private int outInstance = 3;

    public void process(int paramVar) {
        int localVar = 1;

        // 지역 클래스
        class LocalPrinter {
            int value = 0;

            public void printData() {
                System.out.println("value = " + value);
                System.out.println("localVar = " + localVar); // 지역변수 접근 가능
                System.out.println("paraVar = " + paramVar); // 매개변수도 접근 가능
                System.out.println("outInstance = " + outInstance); // 바깥 클래스의 변수에도 접근 가능
            }
        }

        LocalPrinter localPrinter = new LocalPrinter();
        localPrinter.printData();
    }

    public static void main(String[] args) {
        LocalOuterV1 localOuterV1 = new LocalOuterV1();
        localOuterV1.process(2);
    }
}

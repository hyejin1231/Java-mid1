package lang.string.chaining;

/**
 * 3. String
 * - 메서드 체인닝
 */
public class MethodChainingMain3 {
    public static void main(String[] args) {
        ValueAdder adder = new ValueAdder();
        int result = adder.add(1).add(2).add(3).getValue();

        System.out.println("result = " + result);

    }
}

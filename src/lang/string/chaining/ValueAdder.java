package lang.string.chaining;

/**
 * 3. String
 * - Method 체이닝
 */
public class ValueAdder {
    private int value;

    public ValueAdder add(int addValue) {
        value += addValue;
        return this;
    }

    public int getValue() {
        return value;
    }
}

package lang.immutable.change;

/**
 * 불변 객체 - 값 변경
 */
public class ImmutableObj {
    private final int value;

    public ImmutableObj(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public ImmutableObj add(int addValue) {
        int result = value + addValue;
        return new ImmutableObj(result); // 자기 자신이 아닌 새로운 객체를 생성해서 반환함
    }
}

package lang.immutable.change;

/**
 * 불변 객체 - 값 변경
 */
public class ImmutableMain {
    public static void main(String[] args) {
        ImmutableObj obj1 = new ImmutableObj(10);
        ImmutableObj obj2 = obj1.add(20);

        System.out.println("obj1.getValue() = " + obj1.getValue());
        System.out.println("obj2.getValue() = " + obj2.getValue());
    }
}

package lang.string.immutable;

/**
 * 3. String 클래스
 * - 불변 객체
 */
public class StringImmutable1 {
    public static void main(String[] args) {
        String str = "hello";
        str.concat(" java");
        System.out.println("str = " + str);
    }
}

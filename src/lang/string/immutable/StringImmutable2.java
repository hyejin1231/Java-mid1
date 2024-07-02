package lang.string.immutable;

/**
 * 3. String 클래스
 * - 불변 객체
 */
public class StringImmutable2 {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = str1.concat(" java");
        System.out.println("str = " + str1); // hello
        System.out.println("str2 = " + str2); // hello java
    }
}

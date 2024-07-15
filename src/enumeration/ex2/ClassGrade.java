package enumeration.ex2;

/**
 * 열거형 Enum
 * 타입 안전 열거형 패턴
 */
public class ClassGrade {
    public static final ClassGrade BASIC = new ClassGrade();
    public static final ClassGrade GOLD = new ClassGrade();
    public static final ClassGrade DIAMOND = new ClassGrade();

    // private 생성자를 추가해서 외부에서 생성 못하게 막기
    private ClassGrade() {
    }
}

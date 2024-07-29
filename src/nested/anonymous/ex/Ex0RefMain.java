package nested.anonymous.ex;

/**
 * 익명 클래스 활용 1
 * : 변하는 부분과 변하지 않는 부분을 분리하라 !!
 */
public class Ex0RefMain {
    public static void hello(String str) {
        System.out.println("프로그램 시작");
        // 변하는 부분 시작
        System.out.println("Hello " +str);
        // 변하는 부분 종료
        System.out.println("프로그램 종료");
    }

    public static void main(String[] args) {
        hello("Java");
        hello("Spring");
    }
}

package nested.anonymous.ex;

import java.util.Random;

/**
 * 익명 클래스 활용 - 2
 */
public class Ex1RefMainV4 {

    public static void hello(Process process) {
        System.out.println("프로그램 시작");

        // 코드 조각 시작
        process.run();
        // 코드 조각 종료

        System.out.println("프로그램 종료");
    }


    public static void main(String[] args) {
        // 람다 -> 메서드를 인자로 직접 전달함
        hello(() -> {
            int randomValue = new Random().nextInt(6) + 1;
            System.out.println("주사위 = " + randomValue);
        });
        hello(() -> {
            for (int i = 0; i < 3; i++) {
                System.out.println("i = " + i);
            }
        });
    }
}

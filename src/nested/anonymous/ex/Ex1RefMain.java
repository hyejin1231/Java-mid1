package nested.anonymous.ex;

import java.util.Random;

public class Ex1RefMain {
    public static void hello(Ex1 ex1) {
        System.out.println("프로그램 시작");

        // 코드 조각 시작
        ex1.logic();
        // 코드 조각 종료

        System.out.println("프로그램 종료");
    }

    public static void main(String[] args) {
        hello(new Ex1() {
            @Override
            public void logic() {
                int randomValue = new Random().nextInt(6) + 1;
                System.out.println("주사위 = " + randomValue);
            }
        });

        hello(new Ex1() {
            @Override
            public void logic() {
                for (int i = 0; i < 3; i++) {
                    System.out.println("i = " + i);
                }
            }
        });
    }
}

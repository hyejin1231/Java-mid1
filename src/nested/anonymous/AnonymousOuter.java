package nested.anonymous;

import nested.local.Printer;

/**
 * 지역 클래스
 */
public class AnonymousOuter
{
    private int outInstance = 3;

    public void process(int paramVar) {
        int localVar = 1;

        Printer printer = new Printer() // 인터페이스의 구현체를 이름 없이 바로 생성
        {
            int value = 0;

            @Override
            public void print()
            {
                System.out.println("value = " + value);
                System.out.println("localVar = " + localVar); // 지역변수 접근 가능
                System.out.println("paraVar = " + paramVar); // 매개변수도 접근 가능
                System.out.println("outInstance = " + outInstance); // 바깥 클래스의 변수에도 접근 가능

            }
        };

        printer.print();
        System.out.println("printer.getClass() = " + printer.getClass());

    }

    public static void main(String[] args) {
        AnonymousOuter main = new AnonymousOuter();
        main.process(2);
    }
}

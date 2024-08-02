package exception.ex2;


import java.util.Scanner;

/**
 * 예외 처리 도입 1 - 시작
 */
public class MainV2
{
    public static void main(String[] args) throws NetworkClientExceptionV2
    {
        NetworkServiceV2_1 networkService = new NetworkServiceV2_1();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("전송할 문자 : ");
            String input = scanner.nextLine();

            if (input.equals("exit")) {
                break;
            }

            networkService.sendMessage(input); // 체크 예외 :  예외를 잡거나 던져야 한다.
            System.out.println();
        }
        System.out.println("프로그램을 정상 종료합니다.");
    }
}

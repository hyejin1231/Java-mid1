package exception.basic.checked;

/**
 * 자바 예외 처리 3 - 체크 예외
 */
public class CheckedThrowMain {
    public static void main(String[] args) throws MyCheckedException {
        Service service = new Service();
        service.catchThrow();
        System.out.println("정상 종료");
    }
}

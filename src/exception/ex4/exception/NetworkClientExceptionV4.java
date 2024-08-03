package exception.ex4.exception;

/**
 * 실무 예외 처리 방안 2 - 구현
 */
public class NetworkClientExceptionV4 extends RuntimeException {
    public NetworkClientExceptionV4(String message) {
        super(message);
    }
}

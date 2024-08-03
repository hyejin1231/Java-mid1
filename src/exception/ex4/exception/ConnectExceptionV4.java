package exception.ex4.exception;


/**
 * 실무 예외 처리 방안 2 - 구현
 */
public class ConnectExceptionV4 extends NetworkClientExceptionV4 {
    private final String address;

    public ConnectExceptionV4(String address, String message) {
        super(message);
        this.address = address;
    }

    public String getAddress() {
        return address;
    }
}

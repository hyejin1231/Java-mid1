package exception.ex3.exception;

/**
 * 연결 실패할 때 예외
 */
public class ConnectExceptionV3 extends NetworkClientException3 {
    private final String address;

    public ConnectExceptionV3(String address, String message) {
        super(message);
        this.address = address;
    }

    public String getAddress() {
        return address;
    }
}

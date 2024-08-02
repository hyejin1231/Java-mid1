package exception.ex2;

/**
 * 예외 처리 도입 2 - 예외 복구
 */
public class NetworkServiceV2_2
{
    public void sendMessage(String data) throws NetworkClientExceptionV2
    {
        String address = "http://example.com";
        NetworkClientV2 client = new NetworkClientV2(address);

        client.initError(data); // 추가

        try {
            client.connect();
        } catch (NetworkClientExceptionV2 exceptionV2) {
            System.out.println("[오류] 코드 : " + exceptionV2.getErrorCode() + ", 메시지 : " + exceptionV2.getMessage());
            return;
        }
        try {
            client.send(data);
        } catch (NetworkClientExceptionV2 exceptionV2) {
            System.out.println("[오류] 코드 : " + exceptionV2.getErrorCode() + ", 메시지 : " + exceptionV2.getMessage());
            return;
        }
        client.disconnect();
    }
}

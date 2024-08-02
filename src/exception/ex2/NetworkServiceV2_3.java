package exception.ex2;

/**
 * 예외 처리 도입 3 - 정상, 예외 흐름 분리
 */
public class NetworkServiceV2_3
{
    public void sendMessage(String data) throws NetworkClientExceptionV2
    {
        String address = "http://example.com";
        NetworkClientV2 client = new NetworkClientV2(address);

        client.initError(data); // 추가

        try {
            // 정상 흐름
            client.connect();
            client.send(data);
            client.disconnect();
        } catch (NetworkClientExceptionV2 exceptionV2) {
            // 예외 흐름
            System.out.println("[오류] 코드 : " + exceptionV2.getErrorCode() + ", 메시지 : " + exceptionV2.getMessage());
        }

    }
}

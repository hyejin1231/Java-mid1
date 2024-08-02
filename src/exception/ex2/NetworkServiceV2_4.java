package exception.ex2;

/**
 * 예외 처리 도입 4 - 리소스 반환 문제
 */
public class NetworkServiceV2_4
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
        } catch (NetworkClientExceptionV2 exceptionV2) {
            // 예외 흐름 -> 근데 이건 다른 예외가 발생하면 잡을 수 없다,,
            System.out.println("[오류] 코드 : " + exceptionV2.getErrorCode() + ", 메시지 : " + exceptionV2.getMessage());
        }

        client.disconnect();
    }
}

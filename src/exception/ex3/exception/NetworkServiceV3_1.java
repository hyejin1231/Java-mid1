package exception.ex3.exception;


/**
 * 예외 계층 1 - 시작
 */
public class NetworkServiceV3_1
{
    public void sendMessage(String data)
    {
        String address = "http://example.com";
        NetworkClientV3 client = new NetworkClientV3(address);

        client.initError(data); // 추가

        try {
            // 정상 흐름
            client.connect();
            client.send(data);
        } catch (SendExceptionV3 e) {
            System.out.println("[전송 오류] 주소 : " + e.getSendData() + ", 메시지 : " + e.getMessage() );
        } catch (ConnectExceptionV3 e) {
            System.out.println("[연결 오류] 주소 : " + e.getAddress() + ", 메시지 : " + e.getMessage());
        } finally {
            client.disconnect();
        }

    }
}

package exception.ex4;

/**
 * try-with-resource
 */
public class NetworkServiceV5
{
    public void sendMessage(String data)
    {
        String address = "http://example.com";


        try (NetworkClientV5 client = new NetworkClientV5(address)) {
            // 정상 흐름
            client.initError(data); // 추가
            client.connect();
            client.send(data);
        } catch (Exception e) {
            System.out.println("[예외 확인] : " + e.getMessage());
            throw e;
        }

    }
}

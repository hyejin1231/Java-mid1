package exception.ex0;

/**
 * 예외 처리가 필요한 이유 - 1
 */
public class NetworkServiceV0 {
    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV0 client = new NetworkClientV0(address);

        client.connect();
        client.send(data);
        client.disconnect();
    }
}

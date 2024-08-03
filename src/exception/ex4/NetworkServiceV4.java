package exception.ex4;

/**
 * 실무 예외 처리 방안 2 - 구현
 */
public class NetworkServiceV4
{
    public void sendMessage(String data)
    {
        String address = "http://example.com";
        NetworkClientV4 client = new NetworkClientV4(address);

        client.initError(data); // 추가

        try {
            // 정상 흐름
            client.connect();
            client.send(data);
        }finally {
            client.disconnect();
        }

    }
}

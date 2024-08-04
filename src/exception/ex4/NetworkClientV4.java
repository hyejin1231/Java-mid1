package exception.ex4;


import exception.ex4.exception.ConnectExceptionV4;
import exception.ex4.exception.SendExceptionV4;

/**
 * 실무 예외 처리 방안 2 - 구현
 */
public class NetworkClientV4
{
    private final String address;
    public boolean connectError; // 연결 실패
    public boolean sendError; // 전송 실패

    public NetworkClientV4(String address) {
        this.address = address;
    }

    public void connect()
    {
        if (connectError) {
            throw new ConnectExceptionV4(address, address + "서버 연결 실패");
        }

        // 연결 성공
        System.out.println(address + " 서버 연결 성공");
    }

    public void send(String data)
    {
        if (sendError) {
            throw new SendExceptionV4(address, address + " 서버에 데이터 전송 싶패 : " + data);
        }
        // 전송 성공
        System.out.println(address + " 서버에 데이터 전송 : " + data);
    }

    public void disconnect() {
        System.out.println(address + " 서버 연결 해제");
    }

    public void initError(String data) {
        if (data.contains("error1")) {
            connectError = true;
        }
        if (data.contains("error2")) {
            sendError = true;
        }
    }
}
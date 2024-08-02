package exception.basic.checked;

/**
 * 자바 예외 처리 3 - 체크 예외
 */
public class Client {
    public void call() throws MyCheckedException {
        // 문제 상황
        throw new MyCheckedException("ex");
    }
}

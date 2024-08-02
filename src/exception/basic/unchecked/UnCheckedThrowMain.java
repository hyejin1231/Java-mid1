package exception.basic.unchecked;

/**
 * 자바 예외 처리 - 4. 언체크 예외
 */
public class UnCheckedThrowMain
{
	public static void main(String[] args)
	{
		Service service = new Service();
		service.callThrow();
		System.out.println("정상 종료");
	}
}

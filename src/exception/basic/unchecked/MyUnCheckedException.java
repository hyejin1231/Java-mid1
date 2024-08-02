package exception.basic.unchecked;

/**
 * 자바 예외 처리 - 4. 언체크 예외
 */
public class MyUnCheckedException extends RuntimeException
{
	public MyUnCheckedException(String message)
	{
		super(message);
	}
}

package exception.ex2;

/**
 * 예외 처리 도입 1 - 시작
 */
public class NetworkClientExceptionV2 extends Exception
{
	private String errorCode;

	public NetworkClientExceptionV2(String errorCode, String message)
	{
		super(message);
		this.errorCode = errorCode;
	}

	public String getErrorCode()
	{
		return errorCode;
	}
}

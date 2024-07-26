package nested.nested.ex1;

public class NetworkMessage
{
	// Network 객체 안에서만 사용
	private String content;

	public NetworkMessage(String content)
	{
		this.content = content;
	}

	public void print()
	{
		System.out.println(content);
	}
}

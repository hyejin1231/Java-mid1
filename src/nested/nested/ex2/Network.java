package nested.nested.ex2;

/**
 * 정적 중첩 클래스 활용
 */
public class Network
{
	public void sendMessage(String text)
	{
		NetworkMessage networkMessage = new NetworkMessage(text);
		networkMessage.print();
	}

	private static class NetworkMessage // 외부에서 클래스 접근 못하게 막아버림
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
}

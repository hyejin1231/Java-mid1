package nested.answer;

/**
 * 문제와 풀이 1
 * - 지역 클래스
 */
public class OuterClass3
{
	public void myMethod()
	{
		class LocalClass
		{
			public void hello()
			{
				System.out.println("LocalClass.hello");
			}
		}
		LocalClass localClass = new LocalClass();
		localClass.hello();
	}
}

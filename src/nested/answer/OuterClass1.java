package nested.answer;

/**
 * 문제와 풀이 1
 * - 정적 중첩 클래스
 */
public class OuterClass1
{
	static class NestedClass {
		public void hello()
		{
			System.out.println("NestedClass.hello");
		}
	}
}

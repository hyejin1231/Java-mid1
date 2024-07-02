package lang.string.equals;

/**
 * 3. String 클래스
 * - 비교
 */
public class StringEqualsMain2
{
	public static void main(String[] args)
	{
		String str1 = new String("hello");
		String str2 = new String("hello");
		System.out.println("메서드 호출 비교 1 : " + isSame(str1, str2));
		
		String str3 = "hello";
		String str4 = "hello";
		System.out.println("메서드 호출 비교 2 : " + isSame(str3, str4));
	}
	
	private static boolean isSame(String x, String y)
	{
//		return x == y;
		// 리터럴 문자열이 들어올지 객체 생성 문자열이 들어올지 파악할 수 없기 때문에 == 동일성 비교가 아닌 equals 동등성 비교를 하는 것이 좋다.
		return x.equals(y);
	}
}

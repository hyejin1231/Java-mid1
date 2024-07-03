package lang.string.method;

/**
 * 3. String 클래스
 * - 주요 메서드 2
 */
public class StringChangeMain2
{
	public static void main(String[] args)
	{
		String strWithSpace = "          Java Programming";
		
		System.out.println("소문자로 변환 : " + strWithSpace.toLowerCase()); //           java programming
		System.out.println("대문자로 변환 : " + strWithSpace.toUpperCase()); //           JAVA PROGRAMMING
		
		System.out.println("공백 제거(trim) : '" + strWithSpace.trim() + "'"); // 'Java Programming'
		System.out.println("공백 제거(strip) : '" + strWithSpace.strip() + "'");  // 'Java Programming'
		System.out.println("앞 공백 제거(strip) : '" + strWithSpace.stripLeading() + "'");  // 'Java Programming'
		System.out.println("뒤 공백 제거(strip) : '" + strWithSpace.stripTrailing() + "'");  // 'Java Programming'
	}
}

package lang.string.method;

/**
 * 3. String 클래스
 * - 주요 메서드 2
 */
public class StringUtilsMain1
{
	public static void main(String[] args)
	{
		int num = 100;
		boolean bool = true;
		Object object = new Object();
		String str = "Hello, Java!";
		
		// valueOf()
		String numString = String.valueOf(num);
		System.out.println("numString = " + numString);
		
		String boolString = String.valueOf(bool);
		System.out.println("boolString = " + boolString);
		
		String objString = String.valueOf(object);
		System.out.println("objString = " + objString);
		
		// 문자 + x -> 문자
		String numString2 = "" + num ;
		System.out.println("numString2 = " + numString2);
		
		// toCharArray 메서드
		char[] strCharArray = str.toCharArray();
		System.out.println(strCharArray);
	}
}

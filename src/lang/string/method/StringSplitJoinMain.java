package lang.string.method;

import java.util.Arrays;

/**
 * 3. String 클래스
 *  - 주요 메서드 2
 */
public class StringSplitJoinMain
{
	public static void main(String[] args)
	{
		String str = "Apple,Banana,Orange";
		
		// split()
		String[] split = str.split(",");
		Arrays.stream(split).forEach(System.out::println);
		
		// join()
		String join1 = String.join(",", "A", "B", "C");
		
		System.out.println("join1 = " + join1);
		String joinStr = "";
		for (String s : split)
		{
			joinStr += s + "-";
		}
		System.out.println("joinStr = " + joinStr);
		
		// 문자열 배열 연결
		String join = String.join(",", split);
		System.out.println("join = " + join);
		
	}
}

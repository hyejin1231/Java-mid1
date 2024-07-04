package lang.string.test;

import java.util.Arrays;

public class TestString10
{
	public static void main(String[] args)
	{
		String fruits = "apple,banana,mango";
		String[] split = fruits.split(",");
		Arrays.stream(split).forEach(System.out::println);
		
		String joinedString = String.join("->", split);
		System.out.println("joinedString = " + joinedString);
	}
}

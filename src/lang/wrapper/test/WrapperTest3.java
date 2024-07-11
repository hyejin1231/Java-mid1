package lang.wrapper.test;

// 박싱, 언박싱
public class WrapperTest3
{
	public static void main(String[] args)
	{
		String str = "100";

		// String -> Integer
		Integer integer1 = Integer.valueOf(str);

		// Integer -> int
		int integer2 = integer1.intValue();

		// int -> Integer
		Integer integer3 = Integer.valueOf(integer2);
		
		System.out.println("integer1 = " + integer1);
		System.out.println("integer2 = " + integer2);
		System.out.println("integer3 = " + integer3);
	}
}

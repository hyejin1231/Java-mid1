package lang.wrapper.test;

// 오토박싱, 오토언박싱
public class WrapperTest4
{
	public static void main(String[] args)
	{
		String str = "100";
		Integer integer1 = Integer.valueOf(str);

		// 오토 박싱
		Integer integer2 = integer1;

		// 오토 언박싱
		int integer3 = integer2;
		
		System.out.println("integer1 = " + integer1);
		System.out.println("integer2 = " + integer2);
		System.out.println("integer3 = " + integer3);
	}
}

package lang.immutable.address;

/**
 * 2. 불변객체
 * 2-1. 기본형과 참조형의 공유
 */
public class PrimitiveMain
{
	public static void main(String[] args)
	{
		// 기본형은 절대로 같은 값을 공유하지 않는다.
		int a = 10;
		int b = a;
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		System.out.println("20 -> b");
		
		b = 20;
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
}

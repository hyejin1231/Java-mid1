package lang.immutable.address;

/**
 * 2. 불변객체
 * 2-1. 기본형과 참조형의 공유
 */
public class RefMain_1
{
	public static void main(String[] args)
	{
		// 참조형 변수는 하나의 인스턴스를 공유할 수 있다.
		Address a = new Address("서울");
		Address b = a;
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		System.out.println("부산 -> b");
		
		b.setValue("부산");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
	}
}

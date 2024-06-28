package lang.immutable.address;

/**
 * 2. 불변객체
 * 2-1. 기본형과 참조형의 공유
 */
public class RefMain2
{
	public static void main(String[] args)
	{
		ImmutableAddress a = new ImmutableAddress("서울");
		ImmutableAddress b = a; // 참조값 대입을 막을 수 있는 방법은 없다.
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		System.out.println("부산 -> b");
		
//		b.setValue("부산"); // b 의 값을 부산으로 변경하려고 하면 set메서드가 없으므로 컴파일 오류 발생
		b = new ImmutableAddress("부산");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
	}
}

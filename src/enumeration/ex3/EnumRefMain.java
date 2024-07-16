package enumeration.ex3;

/**
 * 열거형 Enum
 * - 열거형 Enum Type
 */
public class EnumRefMain
{
	public static void main(String[] args)
	{
		System.out.println("class BASIC : " + Grade.BASIC.getClass());
		System.out.println("class GOLD : " + Grade.GOLD.getClass());
		System.out.println("class DIAMOND : " + Grade.DIAMOND.getClass());
		
		System.out.println("ref BASIC = " + refValue(Grade.BASIC));
		System.out.println("ref GOLD = " + refValue(Grade.GOLD));
		System.out.println("ref DIAMOND = " + refValue(Grade.DIAMOND));
	}
	
	private static String refValue(Object grade)
	{
		// 참조값 확인하기 위한 메서드
		return Integer.toHexString(System.identityHashCode(grade));
	}
}

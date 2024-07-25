package nested.nested;

/**
 * 정적 중첩 클래스
 */
public class NestedOuterMain
{
	public static void main(String[] args)
	{
		NestedOuter outer = new NestedOuter();
		NestedOuter.Nested nested = new NestedOuter.Nested();
		nested.print();

		System.out.println("nested.getClass() = " + nested.getClass());
	}
}

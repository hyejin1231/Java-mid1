package lang.string.builder;

/**
 * 4. StringBuilder
 * - 가변 String
 */
public class StringBuilderMain1_1
{
	public static void main(String[] args)
	{
		StringBuilder sb = new StringBuilder();
		sb.append("A");
		sb.append("B");
		sb.append("C");
		sb.append("D");
		
		System.out.println("sb = " + sb);
		
		sb.insert(1, "Java");
		System.out.println("sb = " + sb);
		
		sb.delete(1, 5);
		System.out.println("sb = " + sb);
		
		sb.reverse();
		System.out.println("sb = " + sb);
		
		// StringBuilder -> String
		String string = sb.toString();
		System.out.println("string = " + string); // 가변 -> 불변
	}
}

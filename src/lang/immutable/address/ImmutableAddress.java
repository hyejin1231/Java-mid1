package lang.immutable.address;

public class ImmutableAddress
{
	private final String value; // 내부 값이 변경되면 안되기 때문에 final로 선언한다.
	
	// 이 클래스는 생성자를 통해서만 값을 설정할 수 있고, 이후에는 값을 변경하는 것이 불가능하다.
	public ImmutableAddress(String value)
	{
		this.value = value;
	}
	
	public String getValue()
	{
		return value;
	}
	
	@Override
	public String toString()
	{
		return "ImmutableAddress{" +
				"value='" + value + '\'' +
				'}';
	}
}

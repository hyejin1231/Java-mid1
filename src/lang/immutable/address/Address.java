package lang.immutable.address;

/**
 * 2. 불변객체
 * 2-1. 기본형과 참조형의 공유
 */
public class Address
{
	private String value;
	
	public Address(String value)
	{
		this.value = value;
	}
	
	public String getValue()
	{
		return value;
	}
	
	public void setValue(String value)
	{
		this.value = value;
	}
	
	@Override
	public String toString()
	{
		return "Address{" +
				"value='" + value + '\'' +
				'}';
	}
}

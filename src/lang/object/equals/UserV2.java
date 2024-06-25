package lang.object.equals;

import java.util.Objects;

public class UserV2
{
	private String id;
	
	public UserV2(String id)
	{
		this.id = id;
	}
	
	/* 최소한 구현의 equals
	@Override
	public boolean equals(Object obj)
	{
		// Object의 equals()는 매개변수 타입으로 Object를 받기 때문에 객체의 특정 값을 사용하려면 다운 캐스팅을 해야 한다.
		UserV2 user = (UserV2) obj;
		
		return this.id.equals(user.id);
	}
	 */
	
	// 정확히 구현한 equals
	@Override
	public boolean equals(Object o)
	{
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		UserV2 userV2 = (UserV2) o;
		return Objects.equals(id, userV2.id);
	}
	
}

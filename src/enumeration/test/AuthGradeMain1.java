package enumeration.test;

public class AuthGradeMain1
{
	public static void main(String[] args)
	{
		AuthGrade[] authGrades = AuthGrade.values();
		
		for (AuthGrade authGrade : authGrades)
		{
			printGrade(authGrade);
		}
	}
	
	private static void printGrade(AuthGrade authGrade)
	{
		System.out.println("garde="+authGrade.name() +", level=" + authGrade.getLevel() +", 설명 =" + authGrade.getDescription());
	}
}

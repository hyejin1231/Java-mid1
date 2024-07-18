package enumeration.test;

import java.util.Scanner;

public class AuthGradeMain2
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("당신의 등급을 입력하세요 [GUEST, LOGIN, ADMIN] : ");
		String input = scanner.next();
		
		AuthGrade authGrade = AuthGrade.valueOf(input);
		System.out.println("당신의 등급은 " + authGrade.getDescription() + "회원 입니다.");
		
		System.out.println("==메뉴 목록==");
		System.out.println("-메인 화면");
		if (authGrade == AuthGrade.LOGIN) {
			System.out.println("이메일 관리 화면");
		}
		else if (authGrade == AuthGrade.ADMIN) {
			System.out.println("이메일 관리 화면");
			System.out.println("관리자 화면");
		}
	}
}

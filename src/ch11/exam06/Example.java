package ch11.exam06;

import java.util.regex.Pattern;

//정규 표현식과 Pattern 클래스
public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//전화번호 체크
		String regExp = "010-\\d{3,4}-\\d{4}";
		String data = "010-2355-1234"; //검증하고 싶은 데이터
		boolean result = Pattern.matches(regExp, data);
		if(result ==  true) {
			System.out.println("유효한 데이터");
		}else {
			System.out.println("잘못된 데이터");
		}
		
		String regExp2 = ".*(?=^.{8,15}$)(?=.*\\d)(?=.*[a-zA-Z])(?=.*[!@#$%^&+=]).*"; 
		String password = "a#123456789";
		boolean result2 = Pattern.matches(regExp2, password);
		System.out.println(result2);

	}

}

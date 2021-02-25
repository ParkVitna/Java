package ch11.exam05;

import java.util.StringTokenizer;

public class String02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ssn = "123456-1234567"; //7번째 성별 값을 알고 싶다
		
		//어떤 위치에 문자 1개를 얻기
		char sex = ssn.charAt(7);
		if(sex == '1' || sex == '3') {
			System.out.println("남자");
		}else {
			System.out.println("여자");
		}
		
		//문자열 잘라내기
		//방법1
		String first = ssn.substring(0, 6);
		String second = ssn.substring(7);
		System.out.println(first);
		System.out.println(second);
		
		//방법2
		String[] parts = ssn.split("-"); //구분자로 구분되어 있는 토큰들을 배열에 담아서 리턴
		System.out.println(parts[0]);
		System.out.println(parts[1]);
		
		//포함여부
		//방법1
		String content = "이것은 자바 책입니다.";
		boolean result = content.contains("자바"); //true
		System.out.println(result);
		
		//방법2
		int index = content.indexOf("자바"); //리턴값 정수, 이 문자열이 시작하는 인덱스를 리턴. 해당 문자열이 없으면 -1 리턴
		if(index != -1) {
			System.out.println("자바 관련 책이군요.");
		}else {
			System.out.println("자바 관련 책이 아니군요.");
		}
		
		//방법3(문자열 분리하기)
		StringTokenizer st = new StringTokenizer(ssn, "-"); //문자열을 구분해서 특정 ~~
		while(st.hasMoreTokens()) {
			String token = st.nextToken(); //더 이상 가져올게 없으면 st.hasMoreTokens()가 false가 되어서 while문 빠져나옴
		}
		/* while문 없이 하는 방법
		first = st.nextToken();
		second = st.nextToken();
		String third = st.nextToken(); //더 가져올 것이 없으면 에러남
		*/
		
		
		
		
		//문자열의 길이
		int length = content.length();
		System.out.println(length);
		
		//대치하기
		//영어로 바꾸고 싶다
		//문자열은 불변, 한번 생성되면 바꿀 수 없음
		String modifiedContent = content.replace("자바", "Java"); //원래 문자열 content가 바뀌는 것은 아님.
		System.out.println(modifiedContent);
		
		

	}

}

package ch11.exam05;

import java.util.Arrays;

//String 클래스
public class String01 {

	public static void main(String[] args) { //throws Exception 하면 밑에 try-catch 없애고, JVM한테 예외처리 떠넘김
		// TODO Auto-generated method stub
		byte[] arr1 = {65, 66, 67}; //byte배열을 문자열로 만들고 싶음
		String str1 = new String(arr1);
		System.out.println(str1); //ABC -> 65 66 67의 의미
		
		String str2 = "ABC";
		byte[] arr2 = str2.getBytes();
		System.out.println(Arrays.toString(arr2)); //클래스Arrays.메소드toString -> 배열에 있는 항목을 읽어서 하나의 문자열로 
		
		try {
			String str3 = "가나다";
			//문제셋을 어떤 걸 사용했느냐에 따라서 배열의 길이가 달라짐
			byte[] arr31 = str3.getBytes("EUC_KR"); //문자셋을 줌, 한글 한글자를 2바이트로 표현 -> 영어와 한글만 지원
			byte[] arr32 = str3.getBytes("UTF-8"); //한글 한글자를 3바이트로 표현 -> 전세계언어를 지원. 전세계문자기본어쩌구
			System.out.println(Arrays.toString(arr31));
			System.out.println(Arrays.toString(arr32));
			
			String str4 = new String(arr31, "EUC-KR"); //복원할 때도 똑같은 문자셋 줘야함
			String str5 = new String(arr32, "UTF-8");
			System.out.println(str4);
			System.out.println(str5);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		

	}

}

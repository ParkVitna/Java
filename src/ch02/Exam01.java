package ch02;

public class Exam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//정수 타입의 변수 선언과 값 저장 -> 대부분 int 사용
		byte var1 = 100; //-128~127
		short var2 = 10000;
		int var3 = 2000000000;
		long var4 = 20000000000L;
		
		//문자 타입의 변수 선언과 값 저장
		char var9 = 65;
		char var10 = 'A'; //대부분 이렇게 주지 숫자로 주지 않음
		char var11 = '한'; //작은 따옴표 안에는 문자 하나만
		System.out.println("var9: " + var9);
		System.out.println("var10: " + var10); //var9와 결과값 같음
		System.out.println("var11: " + var11);



		//실수 타입의 변수 선언과 값 저장 -> 대부분 double 사용
		float var5 = 0.123456789123456789f;
		double var6 = 0.123456789123456789;
		System.out.println("var5: " + var5);
		System.out.println("var6: " + var6);
		
		//논리 타입의 변수 선언과 값 저장
		boolean var7 = true;
		boolean var8 = false;
		
	
	}

}

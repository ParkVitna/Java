package ch02;

public class Exam02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//자동 타입 변환
		byte var1 = 10;
		int var2 = var1; //1byte가 4byte로 들어가는 것
		System.out.println("var2: " + var2);
		
		//강제 타입 변환 -> 원래 값이 보존되는 범위에서 해야 의미가 있는 것
		int var3 = 1000;
		byte var4 = (byte)var3; //4byte가 1byte로 들어가는 것 
								//(byte)단위로 쪼개겠다 4등분에서 마지막 값만
		System.out.println("var4: " + var4);
		
		//-----------------------------------------
		
		//자동 타입 변환 -> 정수는 실수보다 항상 적은 범위
		long var5 = 10;
		float var6 = var5;
		
		//강제 타입 변환 -> 실수는 정수보다 항상 큰 범위
		float var7 = 10.5f;
		long var8 = (long)var7; //소수이하 자리를 버린다는 것
		
		//-----------------------------------------
		
		//실수를 정수로 변환
		double var9 = 3.14;
		int var10 = (int)var9;

	}

}

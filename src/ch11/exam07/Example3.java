package ch11.exam07;

public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Integer var1 = new Integer(500);
		Integer var2 = new Integer(500);
		//번지비교 => false
		//값만 비교 => true
		*/
		
		/*
		//자동박싱도 각각 박싱 된다. 위에와 결과 같음
		Integer var1 = 500;
		Integer var2 = 500;
		//번지비교 => false
		//값만 비교 => true
		*/
		
		//-128 ~127까지는 객체를 공유
		Integer var1 = 10;
		Integer var2 = 10;
		
		System.out.println(var1 == var2); //번지비교 => true 객체를 공유해서 결과가 달라질 수 있다. (값의 법위에 따라서 다른 값)
		System.out.println(var1.equals(var2)); //값만 비교 => true 그래서 이걸 쓰는게 좋다.

	}

}

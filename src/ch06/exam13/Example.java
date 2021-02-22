package ch06.exam13;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		int result1 = Singleton.method1();
		String result2 = Singleton.mathod2();
		int[] result3 = Singleton.method3();
		*/
		
		//생성자를 이용해서 객체 얻기
		//Singleton result1 = new Singleton(); (X) private 때문에 안됨
		
		//Factory Method 이용해서 객체 얻기
		Singleton result2 = Singleton.getInstance();
		Singleton result3 = Singleton.getInstance();
		if(result2 ==  result3) {
			System.out.println("같은 객체를 참조"); // => 결과
		}else {
			//메소드에서
			//Singleton s = new Singleton();
			//return s;
			System.out.println("다른 객체를 참조"); // => 메소드 안에서 호출될 때마다 객체 생성
		}
		
	}
	
}

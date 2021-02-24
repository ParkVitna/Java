package ch09.exam03;

public class A {
	public void method(int x) {
		int y = 2;
		
		//x = 10;
		//y = 20;
		
		class B{
			public void method() {
				int result = x + y;
				//매개변수 (=>x) 와 로컬변수 (=>y)
				//final의 특성을 가지므로 바꿀 수 없음
			}
		}
		
	}

}

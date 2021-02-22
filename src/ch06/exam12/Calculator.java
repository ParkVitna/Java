package ch06.exam12;

public class Calculator {
	//Field
	static double pi = 3.14159; //공통된 값을 갖고 있는 필드 => 정적필드
	int memory;
	

	//Constructor
	
	//Method
	static void plus(int x, int y) { //객체가 없어도 쓸 수 있음
		int result = x + y;
		System.out.println(result);
	}
	
	/*
	void plus2(int x, int y) { //객체가 있어야 쓸 수 있음
		memory = x + y;
		System.out.println(memory);
	}
	*/
}

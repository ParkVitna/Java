package ch06.exam12;

public class Calculator {
	//Field
	static double pi = 3.14159; //����� ���� ���� �ִ� �ʵ� => �����ʵ�
	int memory;
	

	//Constructor
	
	//Method
	static void plus(int x, int y) { //��ü�� ��� �� �� ����
		int result = x + y;
		System.out.println(result);
	}
	
	/*
	void plus2(int x, int y) { //��ü�� �־�� �� �� ����
		memory = x + y;
		System.out.println(memory);
	}
	*/
}

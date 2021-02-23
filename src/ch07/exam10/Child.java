package ch07.exam10;

public class Child extends Parent{
	//Field
	public int field2;
	
	//Constructor
	
	//Method
	@Override //재정의
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("Child: method2() 호출");
	}
	
	public void method3() {
		System.out.println("Child: method3() 호출");
	}

}

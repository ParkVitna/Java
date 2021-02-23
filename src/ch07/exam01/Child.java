package ch07.exam01;

public class Child extends Parent{
	//Field
	public int field2;
	
	//Constructor
	public Child() { //자식클래스가 실행되는지 확인
		//super(); 부모객체를 먼저 생성하고 자식객체 생성함.
		//super()는 생략되어 있지만 컴파일러가 기본적으로 넣어줌
		System.out.println("Child 객체 생성");
	}
	
	//Method
	public void method2() {
		System.out.println("method1() 실행");
	}

}

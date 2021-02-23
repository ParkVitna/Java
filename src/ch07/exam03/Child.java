package ch07.exam03;

public class Child extends Parent{
	//Field
	public int field2;
	
	//Constructor
	public Child(String firstName) { //자식클래스가 실행되는지 확인
		super("김", firstName); //부모 클래스에 기본 생성자가 없고 매개 변수가 있는 생성자만 있다면
		//super(매개값);을 명시적으로 호출해야 한다 => 자식 생성자 첫줄에 써야함
		System.out.println("Child 객체 생성");
	}
	
	//Method
	public void method2() {
		System.out.println("method1() 실행");
	}
	
	@Override //어노테이션
	public void sound() {
		System.out.println("싫어요~~~~~");
	}

}

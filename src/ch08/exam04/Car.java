package ch08.exam04;

public class Car {
	//인터페이스 타입 필트 선언과 초기 구현 객체 대입
	//Field
	public Tire t1; // class 클래스명 implemnets Tire {} 로 된 클래스들은 다 올 수 있음
	public Tire t2;
	public Tire t3;
	public Tire t4;
	
	//Constructor
	//public Tire t1 = new Tire(); 위에 필드에서 주는 것과 같음
	
	//인터페이스에서 설명된 roll() 메소드 호출
	//Method
	public void run() {
		t1.roll();
		t2.roll();
		t3.roll();
		t4.roll();
	}

}

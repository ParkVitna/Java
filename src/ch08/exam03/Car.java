package ch08.exam03;

public class Car implements Shipable, Flyable{
	//재정의할 메소드 총 5개

	@Override
	public void takeOff() {
		// TODO Auto-generated method stub
		System.out.println("이륙 합니다.");
		
	}

	@Override
	public void land() {
		// TODO Auto-generated method stub
		System.out.println("착륙 합니다.");
		
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("비행 합니다.");
		
	}

	@Override
	public void sailing() {
		// TODO Auto-generated method stub
		System.out.println("항해 합니다.");
		
	}

	@Override
	public void anchor() {
		// TODO Auto-generated method stub
		System.out.println("정박 합니다.");
		
	}

}

package ch07.exam08;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();
		car.run();
		
		//타입변환
		car.t1 = new TireChild1();
		car.t2 = new TireChild2();
		car.run(); //자식쪽의 재정의된 roll이 실행
	}

}

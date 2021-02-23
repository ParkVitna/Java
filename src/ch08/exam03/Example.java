package ch08.exam03;

public class Example {
	
	public static void use1(Shipable shipable) {
		shipable.sailing();
		shipable.anchor();
	}
	
	public static void use2(Flyable flyable) {
		flyable.takeOff();
		flyable.land();
		flyable.fly();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new Car(); //myCar를 두 인터페이스에서 사용하게 하려면 -> Car 클래스
		use1(myCar);
		use2(myCar);

	}

}

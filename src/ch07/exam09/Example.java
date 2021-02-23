package ch07.exam09;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Driver driver = new Driver();
		driver.drive(new Vehicle()); //Vehicle의 자식객체도 다 올 수 있다.
		driver.drive(new Bus()); //자동타입변환
		driver.drive(new Taxi());

	}

}

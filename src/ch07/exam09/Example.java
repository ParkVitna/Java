package ch07.exam09;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Driver driver = new Driver();
		driver.drive(new Vehicle()); //Vehicle�� �ڽİ�ü�� �� �� �� �ִ�.
		driver.drive(new Bus()); //�ڵ�Ÿ�Ժ�ȯ
		driver.drive(new Taxi());

	}

}

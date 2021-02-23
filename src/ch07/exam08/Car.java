package ch07.exam08;

public class Car {
	//Field
	public Tire t1; //= new Tire(); 생성자에서 주는 것과 똑같음
	public Tire t2;
	public Tire t3;
	public Tire t4;
	
	//Constructor
	public Car() {
		t1 = new Tire();
		t2 = new Tire();
		t3 = new Tire();
		t4 = new Tire();
	}
	
	//Method
	public void run() {
		t1.roll();
		t2.roll();
		t3.roll();
		t4.roll();
	}

}

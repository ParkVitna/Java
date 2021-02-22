package ch06.exam16.pack1;

public class Car {
	//Field
	public String model; //default->public
	//변경해줘야 다른 패키지에서 사용할 수 있음
	
	//Constructor
	public Car(){
		
	}
	
	//Method
	//default->public
	//변경해줘야 다른 패키지에서 사용할 수 있음
	public void run() {
		System.out.println("달립니다.");
	}

}

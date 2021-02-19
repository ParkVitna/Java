package ch06.exam04;

public class Korean {
	//Field
	String nation = "한국";
	String name;
	String ssn;
	
	//Constructor
	Korean(String name, String ssn){ //매개변수가 있으면 외부에서 변수를 받아야함
		this.name = name;
		this.ssn = ssn;
		
	}
}

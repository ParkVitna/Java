package ch06.exam06;

public class Korean {
	//Field
	String nation = "한국";
	String name;
	String ssn;
	int age;
	
	//Constructor Overloading
	Korean(){
		this("아무개", "000000-00000", 1);
		/*
		this.name = "아무개";
		this.ssn = "000000-00000";
		this.age = 1;
		*/
	}
	
	Korean(String name){
		this(name, "000000-00000", 1);
	}
	
	Korean(String name, String ssn){ //매개변수가 있으면 외부에서 변수를 받아야함
		this(name, ssn, 1);
		
	}
	
	Korean(String name, String ssn, int age){
		this.name = name;
		this.ssn = ssn;
		this.age = age;
	}
	
	
}

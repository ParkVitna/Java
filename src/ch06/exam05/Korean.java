package ch06.exam05;

public class Korean {
	//Field
	String nation = "한국";
	String name;
	String ssn;
	int age;
	
	//Constructor Overloading
	Korean(){
		System.out.println("Korean()실행");
	}
	
	Korean(String name){
		System.out.println("Korean(String name)실행");
		this.name = name;
	}
	
	Korean(String name, String ssn){ //매개변수가 있으면 외부에서 변수를 받아야함
		System.out.println("Korean(Stirng name, String ssn)실행");
		this.name = name;
		this.ssn = ssn;
		
	}
	
	Korean(String name, String ssn, int age){
		this.name = name;
		this.ssn = ssn;
		this.age = age;
	}
	
	
}

package ch06.exam05;

public class Korean {
	//Field
	String nation = "�ѱ�";
	String name;
	String ssn;
	int age;
	
	//Constructor Overloading
	Korean(){
		System.out.println("Korean()����");
	}
	
	Korean(String name){
		System.out.println("Korean(String name)����");
		this.name = name;
	}
	
	Korean(String name, String ssn){ //�Ű������� ������ �ܺο��� ������ �޾ƾ���
		System.out.println("Korean(Stirng name, String ssn)����");
		this.name = name;
		this.ssn = ssn;
		
	}
	
	Korean(String name, String ssn, int age){
		this.name = name;
		this.ssn = ssn;
		this.age = age;
	}
	
	
}

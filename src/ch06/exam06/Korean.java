package ch06.exam06;

public class Korean {
	//Field
	String nation = "�ѱ�";
	String name;
	String ssn;
	int age;
	
	//Constructor Overloading
	Korean(){
		this("�ƹ���", "000000-00000", 1);
		/*
		this.name = "�ƹ���";
		this.ssn = "000000-00000";
		this.age = 1;
		*/
	}
	
	Korean(String name){
		this(name, "000000-00000", 1);
	}
	
	Korean(String name, String ssn){ //�Ű������� ������ �ܺο��� ������ �޾ƾ���
		this(name, ssn, 1);
		
	}
	
	Korean(String name, String ssn, int age){
		this.name = name;
		this.ssn = ssn;
		this.age = age;
	}
	
	
}

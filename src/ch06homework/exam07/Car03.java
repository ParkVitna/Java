package ch06homework.exam07;

public class Car03 {
	//�ʵ�
	String company = "�����ڵ���";
	String model;
	String color;
	int maxSpeed;
	
	//������
	Car03(){
		
	}
	
	Car03(String model){
		this(model, "����", 250);
		
	}
	
	Car03(String model, String color){
		this(model, color, 250);
	}
	
	Car03(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}

}

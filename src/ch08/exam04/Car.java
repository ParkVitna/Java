package ch08.exam04;

public class Car {
	//�������̽� Ÿ�� ��Ʈ ����� �ʱ� ���� ��ü ����
	//Field
	public Tire t1; // class Ŭ������ implemnets Tire {} �� �� Ŭ�������� �� �� �� ����
	public Tire t2;
	public Tire t3;
	public Tire t4;
	
	//Constructor
	//public Tire t1 = new Tire(); ���� �ʵ忡�� �ִ� �Ͱ� ����
	
	//�������̽����� ����� roll() �޼ҵ� ȣ��
	//Method
	public void run() {
		t1.roll();
		t2.roll();
		t3.roll();
		t4.roll();
	}

}

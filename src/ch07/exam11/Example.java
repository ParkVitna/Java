package ch07.exam11;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Animal animal = new Animal(); //�߻�Ŭ������ ��ü ������ �� ����.
		
		//�θ� = �ڽİ�ü ���� ����
		Animal animal1 = new Dog();
		Animal animal2 = new Cat();
		
		animal1.eat();
		animal1.sleep();
		animal1.sound(); //�۸�
		
		animal2.eat();
		animal2.sleep();
		animal2.sound(); //�߿�

	}

}

package ch08.exam01;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoteControl rc = new Audio();
		//RemoteControl �������̽� ���� rc�� ������ Television�� ����Ϸ��� �Ѵ�.
		
		//�������̽��� ���ؼ� ��ü�� ȣ�� -> Audio�� ���� �ִ� �޼ҵ��� �����
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(5);

	}

}

package ch08.exam01;

public class Audio implements RemoteControl {
	//RemoteControl�� ���� �޼ҵ带 ��� ������ ���־�� ��
	@Override //������̼��� ���ָ� �����Ϸ��� RemoteControl�� �ִ� �޼ҵ带 ����� �������ߴ��� üũ����
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("Audio�� �մϴ�.");
		
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("Audio�� ���ϴ�.");
		
	}

	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub
		System.out.println("Audio�� ������ " + volume + "�� �����մϴ�.");
		
	}
	//RemoteCon

}

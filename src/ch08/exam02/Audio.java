package ch08.exam02;

public class Audio implements RemoteControl {
	//Field
	private int volume;
	
	//Constructor
	
	//Method
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
		if(volume<RemoteControl.MIN_VOULUME) {
			this.volume = RemoteControl.MIN_VOULUME; //�������̽��� ���ǵ� ������� ���� �� ����
		}
		
		if(volume>RemoteControl.MAX_VOULUME) {
			this.volume = RemoteControl.MAX_VOULUME; //�������̽��� ���ǵ� ������� Ŭ �� ����
		}
		System.out.println("Audio�� ������ " + this.volume + "�� �����մϴ�.");
		
	}
	//RemoteCon

}

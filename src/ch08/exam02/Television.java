package ch08.exam02;

public class Television implements RemoteControl{
	private int volume;
	
	public void turnOn() {
		System.out.println("TV�� �մϴ�.");
	}
	
	public void turnOff() {
		System.out.println("TV�� ���ϴ�.");
	}
	
	public void setVolume(int volume) {
		if(volume<RemoteControl.MIN_VOULUME) {
			this.volume = RemoteControl.MIN_VOULUME; //�������̽��� ���ǵ� ������� ���� �� ����
		}
		
		if(volume>RemoteControl.MAX_VOULUME) {
			this.volume = RemoteControl.MAX_VOULUME; //�������̽��� ���ǵ� ������� Ŭ �� ����
		}
		System.out.println("TV ������ " + this.volume + "�� �����մϴ�.");
	}
}

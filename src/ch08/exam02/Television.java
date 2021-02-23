package ch08.exam02;

public class Television implements RemoteControl{
	private int volume;
	
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}
	
	public void setVolume(int volume) {
		if(volume<RemoteControl.MIN_VOULUME) {
			this.volume = RemoteControl.MIN_VOULUME; //인터페이스에 정의된 상수보다 작을 수 없음
		}
		
		if(volume>RemoteControl.MAX_VOULUME) {
			this.volume = RemoteControl.MAX_VOULUME; //인터페이스에 정의된 상수보다 클 수 없음
		}
		System.out.println("TV 볼륨을 " + this.volume + "로 조정합니다.");
	}
}

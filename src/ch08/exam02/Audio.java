package ch08.exam02;

public class Audio implements RemoteControl {
	//Field
	private int volume;
	
	//Constructor
	
	//Method
	//RemoteControl에 쓰인 메소드를 모두 재정의 해주어야 함
	@Override //어노테이션을 해주면 컴파일러가 RemoteControl에 있는 메소드를 제대로 재정의했는지 체크해줌
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("Audio를 켭니다.");
		
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("Audio를 끕니다.");
		
	}

	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub
		if(volume<RemoteControl.MIN_VOULUME) {
			this.volume = RemoteControl.MIN_VOULUME; //인터페이스에 정의된 상수보다 작을 수 없음
		}
		
		if(volume>RemoteControl.MAX_VOULUME) {
			this.volume = RemoteControl.MAX_VOULUME; //인터페이스에 정의된 상수보다 클 수 없음
		}
		System.out.println("Audio의 볼륨을 " + this.volume + "로 조절합니다.");
		
	}
	//RemoteCon

}

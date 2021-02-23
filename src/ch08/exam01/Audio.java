package ch08.exam01;

public class Audio implements RemoteControl {
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
		System.out.println("Audio의 볼륨을 " + volume + "로 조절합니다.");
		
	}
	//RemoteCon

}

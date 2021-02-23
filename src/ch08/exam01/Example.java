package ch08.exam01;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoteControl rc = new Audio();
		//RemoteControl 인터페이스 변수 rc를 가지고 Television을 사용하려고 한다.
		
		//인터페이스를 통해서 객체를 호출 -> Audio가 갖고 있는 메소도가 실행됨
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(5);

	}

}

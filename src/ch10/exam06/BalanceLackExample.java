package ch10.exam06;
//사용자 정의 예외 클래스
public class BalanceLackExample extends Exception { //일반예외 상속
	public BalanceLackExample() {} //기본 생성자
	public BalanceLackExample(String message) { //외부에서 예외 메세지를 받아서 (예외 객체 생성자)
		super(message); //부모의 생성자 호출
	}

}

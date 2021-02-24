package ch10.exam06;
//사용자 정의 예외 클래스
public class BalanceLackExample extends Exception {
	public BalanceLackExample() {}
	public BalanceLackExample(String message) {
		super(message);
	}

}

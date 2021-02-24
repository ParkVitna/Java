package ch10.exam06;

public class Account {
	public void deposit(String account, int money) throws NoAccountException {
		if(account == null) {
			//예외 발생 코드 -> 뭐 때문에 예외가 발생했다 알려줌 (예외처리를 사용하는 곳에서 하게 하기 위해) -> 예외처리를 다양하게 하기 위해서
			throw new NoAccountException("입금 계좌가 없습니다."); //NoAccountException(String message)를 가지고 만듬
		}
		
		System.out.println("입금 성공");
	}
	
	public void withdraw(String account, int money) throws NoAccountException, BalanceLackExample {
		int balance = 10000;
		//계좌 없다 (예외1), 계좌 잔액보다 많은 금액 뺄 수 없다 (예외2, 잔고부족)
		if(account == null) {
			//예외 발생 코드
			throw new NoAccountException("출금 계좌가 없습니다.");
		}else if(money > balance) {
			throw new BalanceLackExample("잔고가 부족합니다."); //BalanceLackException 잘못침ㅠㅠ
		}else {
			System.out.println("출금 성공");
		}
	}

}

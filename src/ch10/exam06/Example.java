package ch10.exam06;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account = new Account();
		
		try {
			String ano = null;
			account.deposit(ano, 1000); //컴파일로는 알아채지 못한다 -> 실행예외 (try 없으면)
		} catch(NoAccountException e) {
			System.out.println(e.getMessage()); //예외처리표시는 NoAccountException이 알아서 하게 한것
		}
		
		String ano = "111-222-333";
		try {
			account.withdraw(ano, 1000); //일반예외 이기 때문에 오류 (try catch 없으면)
			account.withdraw(ano, 1000000); //-> BalaceLackExample 발생
		} catch (NoAccountException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());//=>입금계좌가없습니다.
		} catch (BalanceLackExample e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage()); //=>잔고가부족합니다.
		} 
		

	}

}

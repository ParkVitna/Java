package ch06homework.Exercise;

public class AccountExample {
	

	public static void main(String[] args) {
		//19번 확인문제
		Account account = new Account();
		
		account.setBalance(10000);
		System.out.println("현재 잔고: " + account.getBalance());
		
		account.setBalance(-100);
		System.out.println("현재 잔고: " + account.getBalance());
		
		account.setBalance(2000000);
		System.out.println("현재 잔고: " + account.getBalance());
		
		account.setBalance(300000);
		System.out.println("현재 잔고: " + account.getBalance());
		
	}
}

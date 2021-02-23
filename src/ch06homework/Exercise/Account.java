package ch06homework.Exercise;

public class Account {
	//19번 확인문제
	
	//Field
	static final int MIN_BALANCE = 0;
	static final int MAX_BALANCE = 1000000;
	private int balance;
	
	//Constructor
	
	//Method
	
	public int getBalance() {
		return this.balance;
	}
	
	public void setBalance(int balance) {
		if(balance >= MIN_BALANCE && balance <= MAX_BALANCE) {
			this.balance = balance;
		}
	}
	
	
	
	

}

package ch06homework.Exercise;

import java.util.Scanner;

public class BankApplication {
	private static Bank[] accountArray = new Bank[100];
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		
		while(run) {
			System.out.println("-----------------------------------------------");
			System.out.println("1.계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료");
			System.out.println("-----------------------------------------------");
			System.out.print("선택> ");
			
			int selectNo = scanner.nextInt();
			
			if (selectNo == 1) {
				createAccount();
			} else if (selectNo == 2) {
				accountList();
			} else if (selectNo == 3) {
				deposit();
			} else if (selectNo == 4) {
				withdraw();
			} else if (selectNo == 5) {
				run = false;
			}
		} System.out.println("프로그램 종료");
	}
		
		private static void createAccount() {
			
			System.out.println("------------------------------------------");
	        System.out.println("계좌생성");
	        System.out.println("------------------------------------------");
	        
	        System.out.print("계좌번호 : ");
	        String ano = scanner.next();
	        
	        System.out.print("계좌주 : ");
	        String owner = scanner.next();
	        
	        System.out.print("초기입금금액 : ");
	        int balance = scanner.nextInt();
	        
	        Bank bank = new Bank(ano, owner, balance);
	        
	        for(int i=0; i<accountArray.length; i++) {
	        	if(accountArray[i] == null) {
	        		accountArray[i] = bank;
	        		System.out.println("계좌가 생성되었습니다.");
	        		break;
	        	}
	        }
		}
		

		private static void accountList() {
			System.out.println("------------------------------------------");
	        System.out.println("계좌목록");
	        System.out.println("------------------------------------------");
	        
	        for (int i = 0; i < accountArray.length; i++) {
	            if(accountArray[i] == null)break;
	            
	            System.out.println(accountArray[i].getAno() +"  "+ accountArray[i].getOwner() +"  "+ accountArray[i].getBalance());
	        }
		
		}
		
		private static void deposit() {
			System.out.println("------------------------------------------");
	        System.out.println("예금");
	        System.out.println("------------------------------------------");
	        
	        System.out.print("계좌번호 : ");
	        String ano = scanner.next();
	        
	        System.out.print("예금액 : ");
	        int balance = scanner.nextInt();
	        
	        Bank bank = findAccount(ano);
	        
	        bank.setBalace(balance + bank.getBalance());
	        System.out.println("예금이 성공됬습니다!");

		}
		
		private static void withdraw() {
			 System.out.println("------------------------------------------");
		     System.out.println("출금");
		     System.out.println("------------------------------------------");
		        
		     System.out.print("계좌번호 : ");
		     String ano = scanner.next();
		        
		     System.out.print("출금액 : ");
		     int balance = scanner.nextInt();
		     
		     Bank bank = findAccount(ano);

		     bank.setBalace(bank.getBalance() - balance);
		     System.out.println("출금이 성공됬습니다!");
	
		}
		
		private static Bank findAccount(String ano) {
			Bank bank = null;
	        
	        for (int i = 0; i < accountArray.length; i++) {
	            if(accountArray[i].getAno().equals(ano)){
	                bank = accountArray[i];
	                break;
	            }
	        }
	        return bank;




		}

}

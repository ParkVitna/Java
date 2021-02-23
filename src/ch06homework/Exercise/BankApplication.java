package ch06homework.Exercise;

import java.util.Scanner;

public class BankApplication {
	private static Bank[] accountArray = new Bank[100];
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		
		while(run) {
			System.out.println("-----------------------------------------------");
			System.out.println("1.���»��� | 2. ���¸�� | 3. ���� | 4. ��� | 5. ����");
			System.out.println("-----------------------------------------------");
			System.out.print("����> ");
			
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
		} System.out.println("���α׷� ����");
	}
		
		private static void createAccount() {
			
			System.out.println("------------------------------------------");
	        System.out.println("���»���");
	        System.out.println("------------------------------------------");
	        
	        System.out.print("���¹�ȣ : ");
	        String ano = scanner.next();
	        
	        System.out.print("������ : ");
	        String owner = scanner.next();
	        
	        System.out.print("�ʱ��Աݱݾ� : ");
	        int balance = scanner.nextInt();
	        
	        Bank bank = new Bank(ano, owner, balance);
	        
	        for(int i=0; i<accountArray.length; i++) {
	        	if(accountArray[i] == null) {
	        		accountArray[i] = bank;
	        		System.out.println("���°� �����Ǿ����ϴ�.");
	        		break;
	        	}
	        }
		}
		

		private static void accountList() {
			System.out.println("------------------------------------------");
	        System.out.println("���¸��");
	        System.out.println("------------------------------------------");
	        
	        for (int i = 0; i < accountArray.length; i++) {
	            if(accountArray[i] == null)break;
	            
	            System.out.println(accountArray[i].getAno() +"  "+ accountArray[i].getOwner() +"  "+ accountArray[i].getBalance());
	        }
		
		}
		
		private static void deposit() {
			System.out.println("------------------------------------------");
	        System.out.println("����");
	        System.out.println("------------------------------------------");
	        
	        System.out.print("���¹�ȣ : ");
	        String ano = scanner.next();
	        
	        System.out.print("���ݾ� : ");
	        int balance = scanner.nextInt();
	        
	        Bank bank = findAccount(ano);
	        
	        bank.setBalace(balance + bank.getBalance());
	        System.out.println("������ ��������ϴ�!");

		}
		
		private static void withdraw() {
			 System.out.println("------------------------------------------");
		     System.out.println("���");
		     System.out.println("------------------------------------------");
		        
		     System.out.print("���¹�ȣ : ");
		     String ano = scanner.next();
		        
		     System.out.print("��ݾ� : ");
		     int balance = scanner.nextInt();
		     
		     Bank bank = findAccount(ano);

		     bank.setBalace(bank.getBalance() - balance);
		     System.out.println("����� ��������ϴ�!");
	
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

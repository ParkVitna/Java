package ch04homework;

import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) {
		boolean run = true;
		
		int balance = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("-----------------------------");
			System.out.println("1.���� | 2.��� | 3.�ܰ� | 4.����");
			System.out.println("-----------------------------");
			System.out.print("����> ");
			
			int num = Integer.parseInt(scanner.nextLine());
			int cash = 0;
			
			switch(num) {
			case 1:
				System.out.print("���ݾ�> ");
				cash = Integer.parseInt(scanner.nextLine());
				balance += cash;
				break;
			
			case 2:
				System.out.print("��ݾ�> ");
				cash = Integer.parseInt(scanner.nextLine());
				balance -= cash;
				break;
				
			case 3:
				System.out.println("�ܰ�> " + balance);
				break;
				
			default:
				run = false;
			}
		
			System.out.println("���α׷� ����");
		}

	}

}

package ch04;

import java.util.Scanner; //Ctrl+Shift+O

public class Exam16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Ű����� �Է��� ������ �ޱ� ���� Scanner ����
		Scanner scanner = new Scanner(System.in);

		while(true) {
			System.out.print("����1: ");
			//int num1 = Integer.parseInt(scanner.nextLine());
			double num1 = Double.parseDouble(scanner.nextLine());
			
			System.out.print("����2: ");
			//int num2 = Integer.parseInt(scanner.nextLine());
			double num2 = Double.parseDouble(scanner.nextLine());
			
			//int result = num1 + num2;
			double result = num1 + num2;
			System.out.println("���: " + result);
			System.out.println();
			
		}

	}

}
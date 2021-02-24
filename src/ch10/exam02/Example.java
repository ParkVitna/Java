package ch10.exam02;

import java.util.Scanner;
//예외 처리 코드
public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			try {
				int value = Integer.parseInt(scanner.nextLine());
				System.out.println("value : " + value);
				
			} catch(NumberFormatException e) {
				System.out.println("숫자만 가능합니다.");
				System.out.println("프로그램을 종료합니다.");
				return; //메소드 실행 종료
			} finally {
				System.out.println("다시 입력하세요.");
			}
		}
		

	}

}

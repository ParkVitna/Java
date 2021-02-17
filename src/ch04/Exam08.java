package ch04;

public class Exam08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int i; //int타입의 변수 i 선언
		
		for(i=1; i<=100; i++) {
			sum += i; //sum = sum + i; sum = i값의 누적
		}
		System.out.println("1~" + i + ": " + sum); // 1부터 100까지의 합
	}

}

package ch04;

public class Exam07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		
		for(int i=1; i<=100; i++) {
			sum += i; //sum = sum + i; sum = i값의 누적
		}
		System.out.println(sum); // 1부터 100까지의 합
	}

}

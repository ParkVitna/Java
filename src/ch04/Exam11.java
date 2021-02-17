package ch04;

public class Exam11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean stop = false;
		int count = 0;
		
		//-----------------------------------
		do {
			System.out.println("Hello");
			count++;
			if(count > 10) {
				stop = true;
			}
		} while(!stop);
		System.out.println(); //개행
		
		//------------------------------------
		count = 0; //같은 이름으로 변두 중복 선언 불가
		do {
			System.out.println("Hello");
			count++;
		} while(count <= 10);
	}

}

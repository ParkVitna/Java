package ch05;

import java.util.Arrays;

public class Exam04 {

	//main 메소드
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scores1 = {90, 85, 95};
		int[] scores2 = {90, 85, 95};
		int[] scores3 = scores1; //scores1의 번지가 scores3에 복사
								//따라서 같은 객체 가리킴
		
		System.out.println(scores1 == scores2); //false
		System.out.println(scores1 == scores3);
		
	}

}

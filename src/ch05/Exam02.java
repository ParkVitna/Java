package ch05;

import java.util.Arrays;

public class Exam02 {

	//main 메소드
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//변수를 선언하면서 값 목록을 제공할 경우
		int[] scores1 = {95, 85, 95};
		
		System.out.println(scores1[0]);
		System.out.println(scores1[1]);
		System.out.println(scores1[2]);
		
		//변수를 선언한 후 값 목록을 제공할 경우
		int[] scores2 = null;
		//scores2 = {90, 85, 95}; 에러남 -> 배열의 문법
		//변수를 선언할 때 값의 목록을 나중에 제공할 수 없음??
		scores2 = new int[] {10, 20, 30};
		//컴파일러를 위한 문법
		
		//메소드 호출 - 메소드를 실행하겠다.
		//add(10); //10 call by value
		add(scores2); // call by reference
		//add({100, 200, 300}); 에러남 -> 위의 배열의 문법
		//변수를 이미 선언해 놓고(밑에) 나중에 대입
		add(new int[] {100, 200, 300});

	}
	
	//메소드 선언 - add메소드 선언
	public static void add(int[] arr) {
		System.out.println("값:" + Arrays.toString(arr));
	}

}

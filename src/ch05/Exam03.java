package ch05;

import java.util.Arrays;

public class Exam03 {

	//main 메소드
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = new int[3];
		//int값이 3개가 들어갈 수 있는 배열을 만든다
		for(int i=0; i<arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		
		double[] arr2 = new double[3];
		for(int i=0; i<arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		
		boolean[] arr3 = new boolean[3];
		for(int i=0; i<arr3.length; i++) {
			System.out.println(arr3[i]);
		}
		
		String[] arr4 = new String[3];
		for(int i=0; i<arr4.length; i++) {
			System.out.println(arr4[i]); //참조타입(String)은 초기값 null
		}
		
	}

}

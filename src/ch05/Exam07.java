package ch05;

import java.util.Arrays;

public class Exam07 {

	//main �޼ҵ�
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scores = {90, 85, 87};
		int sum = 0;
		
		for(int i=0; i<scores.length; i++) {
			sum += scores[i];
		}
		
		double avg = (double)sum / scores.length;
		
		System.out.println("����: " + sum);
		System.out.println("���: " + avg);
		
	}

}

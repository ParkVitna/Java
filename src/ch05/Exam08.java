package ch05;

import java.util.Arrays;

public class Exam08 {

	//main �޼ҵ�
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] scores = {
				{10, 20},
				{15, 25, 35},
				{45, 55, 65, 75}
		};
		
		System.out.println(scores.length); //3
		System.out.println(scores[0].length); //2
		System.out.println(scores[1].length); //3
		System.out.println(scores[2].length); //4
		
		//��� �л��� ������ �ջ� ���ϱ�
		int sum = 0;
		
		for(int i=0; i<scores.length; i++) { //���� ����ŭ �ݺ� => 3
			int[] ban = scores[i];
			for(int j=0; j<ban.length; j++) { //�� ���� �л���(��������)��ŭ �ݺ�
				sum += ban[j];
				//System.out.print(ban[j] +",");
			}
			
		}
		
		//��� ���ϱ�
		double avg = (double)sum / (scores[0].length +
				scores[1].length +
				scores[2].length);
		
		System.out.println("avg: " + avg);
							
	}

}

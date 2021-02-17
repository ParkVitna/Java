package ch05;

import java.util.Arrays;

public class Exam09 {

	//main 메소드
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
		
		//모든 학생들 점수의 합산 구하기
		int sum = 0;
		int count = 0; //총 학생 수 
		
		for(int i=0; i<scores.length; i++) { //반의 수만큼 반복 => 3
			int[] ban = scores[i];
			for(int j=0; j<scores[i].length; j++) { //각 반의 학생수(점수갯수)만큼 반복
				sum += scores[i][j];
				count++;
				//System.out.print(ban[j] +",");
			}
			
		}
		
		//평균 구하기
		double avg1 = (double)sum / (scores[0].length +
									scores[1].length +
									scores[2].length);
		double avg2 = (double)sum / count;
		
		System.out.println("avg: " + avg1);
		System.out.println("avg: " + avg2);
							
	}

}

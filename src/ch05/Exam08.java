package ch05;

import java.util.Arrays;

public class Exam08 {

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
		
		for(int i=0; i<scores.length; i++) { //반의 수만큼 반복 => 3
			int[] ban = scores[i];
			for(int j=0; j<ban.length; j++) { //각 반의 학생수(점수갯수)만큼 반복
				sum += ban[j];
				//System.out.print(ban[j] +",");
			}
			
		}
		
		//평균 구하기
		double avg = (double)sum / (scores[0].length +
				scores[1].length +
				scores[2].length);
		
		System.out.println("avg: " + avg);
							
	}

}

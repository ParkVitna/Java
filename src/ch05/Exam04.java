package ch05;

import java.util.Arrays;

public class Exam04 {

	//main �޼ҵ�
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scores1 = {90, 85, 95};
		int[] scores2 = {90, 85, 95};
		int[] scores3 = scores1; //scores1�� ������ scores3�� ����
								//���� ���� ��ü ����Ŵ
		
		System.out.println(scores1 == scores2); //false
		System.out.println(scores1 == scores3);
		
	}

}

package ch05;

import java.util.Arrays;

public class Exam02 {

	//main �޼ҵ�
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//������ �����ϸ鼭 �� ����� ������ ���
		int[] scores1 = {95, 85, 95};
		
		System.out.println(scores1[0]);
		System.out.println(scores1[1]);
		System.out.println(scores1[2]);
		
		//������ ������ �� �� ����� ������ ���
		int[] scores2 = null;
		//scores2 = {90, 85, 95}; ������ -> �迭�� ����
		//������ ������ �� ���� ����� ���߿� ������ �� ����??
		scores2 = new int[] {10, 20, 30};
		//�����Ϸ��� ���� ����
		
		//�޼ҵ� ȣ�� - �޼ҵ带 �����ϰڴ�.
		//add(10); //10 call by value
		add(scores2); // call by reference
		//add({100, 200, 300}); ������ -> ���� �迭�� ����
		//������ �̹� ������ ����(�ؿ�) ���߿� ����
		add(new int[] {100, 200, 300});

	}
	
	//�޼ҵ� ���� - add�޼ҵ� ����
	public static void add(int[] arr) {
		System.out.println("��:" + Arrays.toString(arr));
	}

}

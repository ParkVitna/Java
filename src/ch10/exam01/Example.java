package ch10.exam01;

import java.io.FileInputStream;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = null;
		//NullPointerException �߻� => ���� ���� (�����Ϸ��� üũ���� ����)
		arr[0] = 10;
		
		//FileNotFoundException �߻� => �Ϲ� ���� (�����Ϸ��� üũ ����)
		//FileInputStream fi = new FileInputStream("C:/Temp/file.txt"); 
		
	}

}
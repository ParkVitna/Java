package ch10.exam05;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

//���� ���ѱ��
public class Example {

	//���⼭ �߸� ����� �Ŵϱ� throws ���� �޾Ƽ� try-catch ����ó�� ������
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			method("C:/file.txt"); 
		} catch (FileNotFoundException e){
			System.out.println("������ �������� ����");
		}
		

	}
	
	//�� �޼ҵ� ���忡�� '���� �߸�����ϰ� �Ǹ� ���� �߻��� �� �־�, �׷��ϱ� �ʰ� �˾Ƽ� ���� ó����'
	public static void method(String filePath) throws FileNotFoundException { 
		FileInputStream fis = new FileInputStream(filePath);
		
	}

}

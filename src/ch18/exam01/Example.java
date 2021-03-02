package ch18.exam01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filePath = "C:/Users/ParkVitNa/git/Java/src/ch18/exam01/data.txt";
		try {
			InputStream is = new FileInputStream(filePath); //������ �κп� ���콺 �÷��� surround try-catch Ŭ��
			//���1
			/*
			  while(true) {
				int data = is.read();
				if(data == -1) { //�����Ͱ� ���ٸ� ��������
					break;
				}
				System.out.println(data);
			}
			*/	
			
			//���2
			int data = -1;
			while((data = is.read()) != -1) { //read() �޼ҵ�� �Է½�Ʈ�����κ��� 1����Ʈ�� �а� 4����Ʈ intŸ������ ���� => ����� (1����Ʈ �о��� ��, int�� 4����Ʈ)
				System.out.print(data);
			}
			
			is.close(); //����� ���� ������ �ݾ������. ���� ������ �ٸ� ���α׷��� ����� ����.
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
		

	}

}

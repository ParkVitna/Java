package ch18.exam11;

import java.io.IOException;
import java.io.InputStream;

//�ܼ�
public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			InputStream is = System.in; //System.in.read(); //in�� �����ϴ� ������ ���� read()���� //���� ��
			while(true) {
				int keyCode = is.read(); //������ 1����Ʈ�� ���� �� �ֱ� ������ �ѱ��� ���� �� ����.
				System.out.println(keyCode);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		

	}

}

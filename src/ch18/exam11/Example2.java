package ch18.exam11;

import java.io.IOException;
import java.io.InputStream;

//�ܼ�->
public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try { //�̰� ��� ��ĳ�� ����ϴ� ��찡 ����
			InputStream is = System.in; //System.in.read(); //in�� �����ϴ� ������ ���� read()���� //���� ��
			byte[] data = new byte[100]; //�ѱ��� �б� ���ؼ� -> ���� ����Ʈ �б� ���ؼ�
			while(true) {
				int readNum = is.read(data);
				String str = new String(data, 0, readNum - 2); //������ Ű�ڵ� 13,10 ���� ���ؼ�
				System.out.println(str);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		

	}

}

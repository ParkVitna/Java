package ch18.exam16;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

//������Ʈ��, InputStreamReader
public class Example {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//���1
		/*
		InputStream is = System.in;
		byte[] data = new byte[100];
		
		int readNum = is.read(data);
		String str = new String(data, 0, readNum -2);
		System.out.println(str);
		
		readNum = is.read(data);
		str = new String(data, 0, readNum -2);
		System.out.println(str);
		*/
		
		//���2 -> ������Ʈ�� �̿�
		InputStream is = System.in; //�ֽ�Ʈ��
		InputStreamReader isr = new InputStreamReader(is); //���ڷ� �ٲ��ִ� ������Ʈ��
		BufferedReader br = new BufferedReader(isr); //������� ������Ʈ��

		String str = br.readLine();
		System.out.println(str);
		
		str = br.readLine();
		System.out.println(str);
	}

}
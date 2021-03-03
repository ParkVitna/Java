package ch18.exam16;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

//outputstreamwriter
public class Example2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		/*
		String filePath = "D:\\Team4Projects\\Java\\src\\ch18\\exam16\\data.txt";
		OutputStream os = new FileOutputStream(filePath);
		
		String data = "������ �������̴پƾƾƾƾƾ�!";
		byte[] bytes = data.getBytes("UTF-8"); //UTF-8 �̿�, �ѱ� �ѱ��ڸ� 3����Ʈ�� ����
		os.write(bytes);
		os.flush();
		
		data = "������ �����ؾ־־־־�!";
		bytes = data.getBytes("UTF-8");
		os.write(bytes);
		os.flush();
		
		os.close();
		*/
		
		String filePath = "D:\\Team4Projects\\Java\\src\\ch18\\exam16\\data.txt";
		OutputStream os = new FileOutputStream(filePath);
		Writer writer = new OutputStreamWriter(os, "UTF-8");
		//Writer writer = new FileWriter(filePath); ���� ������ ��¿ �� ���� OutputStream�� �޾ƾ� �ϴ� ���
		
		String data = "������ �������̴پƾƾƾƾ�!";
		writer.write(data);
		writer.flush();
		
		data = "������ �����ؾ־־־־־־�!";
		writer.write(data);
		writer.flush();
		
		writer.close();

	}

}

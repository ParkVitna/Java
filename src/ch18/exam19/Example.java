package ch18.exam19;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

//������ ���� ��Ʈ��
public class Example {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String filePath = "D:/Team4Projects/Java/src/ch18/exam19/data.txt";
		OutputStream os = new FileOutputStream(filePath);
		
		String data1 = "�ȳ��ϼ���.";
		String data2 = "���� ���Ŀ�.";
		
		/*
		os.write(data1.getBytes());
		os.write("\n".getBytes());
		os.write(data2.getBytes());
		
		os.flush();
		
		os.close();
		*/
		
		PrintStream out = new PrintStream(os);
		//PrintWriter out = new PrintWriter(os); ����� ����.
		out.println(data1); //���ڿ��� ����� (DataInputStream, DataOutputStream�� �ٸ� ��)
		out.println(data2);
		
		out.flush();
		
		out.close();

	}

}

package ch18.exam19;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

//프린터 보조 스트림
public class Example {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String filePath = "D:/Team4Projects/Java/src/ch18/exam19/data.txt";
		OutputStream os = new FileOutputStream(filePath);
		
		String data1 = "안녕하세요.";
		String data2 = "이제 마쳐요.";
		
		/*
		os.write(data1.getBytes());
		os.write("\n".getBytes());
		os.write(data2.getBytes());
		
		os.flush();
		
		os.close();
		*/
		
		PrintStream out = new PrintStream(os);
		//PrintWriter out = new PrintWriter(os); 결과는 같다.
		out.println(data1); //문자열로 저장됨 (DataInputStream, DataOutputStream과 다른 점)
		out.println(data2);
		
		out.flush();
		
		out.close();

	}

}

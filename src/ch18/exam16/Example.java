package ch18.exam16;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

//보조스트림, InputStreamReader
public class Example {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//방법1
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
		
		//방법2 -> 보조스트림 이용
		InputStream is = System.in; //주스트림
		InputStreamReader isr = new InputStreamReader(is); //문자로 바꿔주는 보조스트림
		BufferedReader br = new BufferedReader(isr); //성능향상 보조스트림

		String str = br.readLine();
		System.out.println(str);
		
		str = br.readLine();
		System.out.println(str);
	}

}

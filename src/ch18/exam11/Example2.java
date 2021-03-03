package ch18.exam11;

import java.io.IOException;
import java.io.InputStream;

//콘솔->
public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try { //이거 대신 스캐너 사용하는 경우가 많음
			InputStream is = System.in; //System.in.read(); //in이 참조하는 번지로 가서 read()실행 //같은 것
			byte[] data = new byte[100]; //한글을 읽기 위해서 -> 여러 바이트 읽기 위해서
			while(true) {
				int readNum = is.read(data);
				String str = new String(data, 0, readNum - 2); //엔터의 키코드 13,10 빼기 위해서
				System.out.println(str);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		

	}

}

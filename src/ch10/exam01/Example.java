package ch10.exam01;

import java.io.FileInputStream;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = null;
		//NullPointerException 발생 => 실행 예외 (컴파일러가 체크하지 않음)
		arr[0] = 10; 
		
		//FileNotFoundException 발생 => 일반 예외 (컴파일러가 체크 예외)
		//FileInputStream fi = new FileInputStream("C:/Temp/file.txt"); 
		
	}

}

package ch18.exam15;

import java.io.File;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//File file = new File("C:/Temp/dir1"); //파일인지 폴더인지 구분하고 싶다.
		File file = new File("C:/Temp/data.txt");
		if(file.isDirectory()) { //얘가 폴더(->true)나 파일이냐
			System.out.println("폴더입니다.");
		}else {
			System.out.println("파일입니다.");
		}

		file = new File("C:/Temp/data.txt");
		if(file.isFile()) {
			long size = file.length(); //long으로 리턴
			System.out.println(size + "bytes");
		}
		
	}

}

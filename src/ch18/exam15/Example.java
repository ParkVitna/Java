package ch18.exam15;

import java.io.File;

//File 클래스
public class Example {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File file = new File("C:/Temp/data.txt");
		if(!file.exists()) {
			file.createNewFile(); //내용 없이 파일만 만들어짐
		}
		
		file = new File("C:/Temp/dir1/dir2/dir3");
		if(!file.exists()) {
			//file.mkdir();
			file.mkdirs(); //경로상의 없는 모든 디렉토리 생성
		}
		
		file = new File("C:/Temp/data.txt");
		if(file.exists()) {
			file.delete();
		}
		
		file = new File("C:/Temp/dir1/dir2/dir3"); //'dir3을 삭제해라'는 의미
		if(file.exists()) {
			file.delete();
		}

	}

}

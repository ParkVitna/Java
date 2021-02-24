package ch10.exam05;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

//예외 떠넘기기
public class Example {

	//여기서 잘못 사용한 거니까 throws 예외 받아서 try-catch 예외처리 해주자
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			method("C:/file.txt"); 
		} catch (FileNotFoundException e){
			System.out.println("파일이 존재하지 않음");
		}
		

	}
	
	//이 메소드 입장에서 '나를 잘못사용하게 되면 예외 발생할 수 있어, 그러니까 너가 알아서 예외 처리해'
	public static void method(String filePath) throws FileNotFoundException { 
		FileInputStream fis = new FileInputStream(filePath);
		
	}

}

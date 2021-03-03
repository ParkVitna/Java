package ch18.exam13;

import java.io.Console;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Console console = System.console();
		
		System.out.print("아이디: ");
		String id = console.readLine();
		
		System.out.print("비밀번호: ");
		String password = new String(console.readPassword()); //****
		//char(console.readPassword()-스캐너에서는 사용할 수 없음)->String으로 바꿈
		
		System.out.println(id);
		System.out.println(password);

	}

}

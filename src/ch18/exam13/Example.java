package ch18.exam13;

import java.io.Console;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Console console = System.console();
		
		System.out.print("���̵�: ");
		String id = console.readLine();
		
		System.out.print("��й�ȣ: ");
		String password = new String(console.readPassword()); //****
		//char(console.readPassword()-��ĳ�ʿ����� ����� �� ����)->String���� �ٲ�
		
		System.out.println(id);
		System.out.println(password);

	}

}

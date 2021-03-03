package ch18.exam18;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

public class Example2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String filePath1 = "D:/Team4Projects/Java/src/ch18/exam18/data.db";
		InputStream is = new FileInputStream(filePath1);
		DataInputStream dis = new DataInputStream(is);
		
		//저장된 순서대로 읽어야 함. (int -> double -> boolean -> UTF)
		int var1 = dis.readInt();
		double var2 = dis.readDouble();
		boolean var3 = dis.readBoolean();
		String var4 = dis.readUTF(); //문자열을 복원시켜 주는 것
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		
		dis.close();
	}

}

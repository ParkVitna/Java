package ch18.exam17;
//�����̿�� ���ɺ�
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Example {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String filePath1 = "D:/Team4Projects/Java/src/ch18/exam17/photo.jpg";
		String filePath2 = "D:/Team4Projects/Java/src/ch18/exam17/photo2.jpg";
		String filePath3 = "D:/Team4Projects/Java/src/ch18/exam17/photo3.jpg";
		
		//���۾Ⱦ�
		InputStream is1 = new FileInputStream(filePath1);
		OutputStream os1 = new FileOutputStream(filePath2);
		copy(is1, os1);
		is1.close();
		os1.close();
		
		//���۾� <- ������Ʈ���� �޾Ƽ�
		InputStream is2 = new FileInputStream(filePath1);
		BufferedInputStream bis = new BufferedInputStream(is2);
		//BufferedInputStream bis = new BufferedInputStream(new FileInputStream(filePath1)); -> �̷��� ���� �� �ִ�.
		
		OutputStream os2 = new FileOutputStream(filePath3);
		BufferedOutputStream bos = new BufferedOutputStream(os2);
		//BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(filePath3));
		
		copy(bis, bos);
		bis.close(); //������Ʈ���� close()�Ǹ� ����Ǿ� �ִ� �ֽ�Ʈ���� �ڵ����� close()��.
		bos.close();
		/* ���� ��������
		is2.close();
		os2.close();
		*/
		
		

	}
	
	public static void copy(InputStream is, OutputStream os) throws Exception {
		long start = System.nanoTime();
		int data = -1; //�����ϰ� �����̿�� ���ɺ񱳸� ���� ����Ʈ �迭 �Ⱦ�
		while((data=is.read()) != -1) {
			os.write(data);
		}
		os.flush();
		long end = System.nanoTime();
		System.out.println("���� �ð�: " + (end - start) + "ns");
	}

}

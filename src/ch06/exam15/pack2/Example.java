package ch06.exam15.pack2;
import java.util.Date;

import ch06.exam15.pack1.Board;
import ch06.exam15.pack1.Product;
//import ch06.exam15.pack1.*; //�ش� ��Ű�� �ȿ� �ִ°� �� �� ��

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Board b1 = new Board();
		b1.title = "����1";
		
		Product p1 = new Product();
		
		Date now = new Date();
		
		//��ü �̸����� ǥ�� (���� Board�� import�� �ذ�)
		ch06.exam15.pack3.Board b2 = new ch06.exam15.pack3.Board(); //pack3���� �����ͼ� ���� �ʹٸ�
		
	}

}
